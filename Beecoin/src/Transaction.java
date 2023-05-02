import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Transaction {
	private String senderID;
	private String recepientID;
	private double amount;
	private boolean verified=false;

	public Transaction(String iID, String rID, double amt,boolean verified) {
		this.senderID = iID;
		this.recepientID = rID;
		this.amount = amt;
		this.verified = verified;
	}

	public String getSenderID() {
		return senderID;
	}

	public void setSenderID(String senderID) {
		this.senderID = senderID;
	}

	public String getRecepientID() {
		return recepientID;
	}

	public void setRecepientID(String recepientID) {
		this.recepientID = recepientID;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}
	
	
}
