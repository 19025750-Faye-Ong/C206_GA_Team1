import java.sql.Date;
import java.time.LocalDate;

public class Transaction extends Item{
	private String transactionid;
	private Double finalPrice;
	private Date transactionDate;
	
	
	public Transaction(int id,  String name, String description, double minBid, LocalDate auctionStart, LocalDate auctionEnd,
			double bidIncrement, String transactionid, Double finalPrice, Date transactionDate) {
		super(id, name, description, minBid, auctionStart, auctionEnd, bidIncrement);
		this.transactionid = transactionid;
		this.finalPrice = finalPrice;
		this.transactionDate = transactionDate;
	}


	public String getTransactionid() {
		return transactionid;
	}


	public Double getFinalPrice() {
		return finalPrice;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}
		
}	
