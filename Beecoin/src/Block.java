import java.util.Date;

import lombok.Getter;

@Getter
public class Block {
	private int index;
	private long timestamp;
	private String note;
	private Transaction transactions[];
	private String prev_hash[];
	private String hash;
	private int difficulty;
	private String nounce;

	public static final int BLOCK_SIZE = 70;

	public Block(int index, String prev_hash[], String nounce, int difficulty) {
		this.index = index;
		this.timestamp = new Date().getTime();
		this.prev_hash = prev_hash;
		this.nounce = nounce;
		this.difficulty = difficulty;
		transactions = new Transaction[BLOCK_SIZE];
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setTransactions(Transaction[] transactions) {
		// make a deep copy
		for (int i = 0; i < this.transactions.length; i++) {
			this.transactions[i] = transactions[i];
		}
	}

	public String toString() {
		return ("Block #" + this.index + "\n\tmined at: " + this.timestamp + "\n\tNote: " + this.note
				+ "\n\tTransactions: " + this.transactions + "\n\tHash: {" + this.hash + "}\n");
	}

	private String calcHash() {
		return Encryption.sha256(this.index + this.timestamp + this.note + this.transactions + this.prev_hash);
	}

	public void setHash() {
		hash = calcHash();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String[] getPrev_hash() {
		return prev_hash;
	}

	public void setPrev_hash(String[] prev_hash) {
		this.prev_hash = prev_hash;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public String getNounce() {
		return nounce;
	}

	public void setNounce(String nounce) {
		this.nounce = nounce;
	}

	public String getNote() {
		return note;
	}

	public Transaction[] getTransactions() {
		return transactions;
	}

	public static int getBlockSize() {
		return BLOCK_SIZE;
	}
	
	
}
