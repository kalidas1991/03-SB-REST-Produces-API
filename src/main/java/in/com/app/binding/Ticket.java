package in.com.app.binding;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Ticket {

	private Integer ticketId;
	private String from;
	private String to;
	private double price;
	private String journeyDate;
	private Integer trainNumber;

	public Integer getTicketId() {
		return ticketId;
	}

	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getJourneyDate() {
		return journeyDate;
	}

	public void setJourneyDate(String journeyDate) {
		this.journeyDate = journeyDate;
	}

	public Integer getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(Integer trainNumber) {
		this.trainNumber = trainNumber;
	}
}
