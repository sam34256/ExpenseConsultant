package entities;

import java.util.Calendar;

public class Transaction {

	public static final int INCOME = 1, FEE = 2, ESSENTIALS = 3, TRANSPORT = 4, ENTERTAINMENT = 5, ALCOHOL = 6,
			OTHER = 50;
//	many more to be added	

	private Calendar transDate;
	private Calendar postedDate;
	private String refNumber;
	private String description;
	private double amount;
	private int category;

	public Transaction(Calendar transDate, Calendar postedDate, String refNumber, String description, double amount,
			int category) {
		this.transDate = transDate;
		this.postedDate = postedDate;
		this.refNumber = refNumber;
		this.description = description;
		this.amount = amount;
		this.category = category;
	}

// -------------- static Calendar conversion helpers -----------------------	

	public static Calendar returnCalendarFromOFX(String stringDate) {
//	stringDate in a format: "20230218120000"		
		Calendar date = Calendar.getInstance();
		int year, month, day, hour, minute, second;
		try {
			year = Integer.parseInt(stringDate.substring(0, 4));
			month = (Integer.parseInt(stringDate.substring(4, 6))) - 1;
			day = Integer.parseInt(stringDate.substring(6, 8));
			hour = Integer.parseInt(stringDate.substring(8, 10));
			minute = Integer.parseInt(stringDate.substring(10, 12));
			second = Integer.parseInt(stringDate.substring(12, 14));
		} catch (NumberFormatException ex) {
			year = 1900;
			month = 0;
			day = 1;
			hour = 0;
			minute = 0;
			second = 0;
		}
		date.set(year, month, day, hour, minute, second);
		date.set(Calendar.MILLISECOND, 0);
		return date;
	}

	public static Calendar returnCalendarFromMMslashDD(String stringDate, String year) {
//	stringDate in a format: "05/30", year in a format: "2022"
		stringDate = year + stringDate.substring(0, 2) + stringDate.substring(3, 5) + "000000";
		return returnCalendarFromOFX(stringDate);
	}

	public static String returnOFXFromCalendar(Calendar date) {
		String year, month, day, hour, minute, second;
		year = Integer.toString(date.get(Calendar.YEAR));
		month = Integer.toString(date.get(Calendar.MONTH) + 1);
		day = Integer.toString(date.get(Calendar.DATE));
		hour = Integer.toString(date.get(Calendar.HOUR_OF_DAY));
		minute = Integer.toString(date.get(Calendar.MINUTE));
		second = Integer.toString(date.get(Calendar.SECOND));
		if (month.length() == 1)
			month = "0" + month;
		if (day.length() == 1)
			day = "0" + day;
		if (hour.length() == 1)
			hour = "0" + hour;
		if (minute.length() == 1)
			minute = "0" + minute;
		if (second.length() == 1)
			second = "0" + second;
		return year + month + day + hour + minute + second;
	}

	public static String returnMMslashDDFromCalendar(Calendar date) {
		String month, day;
		month = Integer.toString(date.get(Calendar.MONTH) + 1);
		day = Integer.toString(date.get(Calendar.DATE));
		if (month.length() == 1)
			month = "0" + month;
		if (day.length() == 1)
			day = "0" + day;
		return month + "/" + day;
	}

// --------------- getters and setters ------------------------------------	

	public Calendar getTransDate() {
		return transDate;
	}

	public void setTransDate(Calendar transDate) {
		this.transDate = transDate;
	}

	public Calendar getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Calendar postedDate) {
		this.postedDate = postedDate;
	}

	public String getRefNumber() {
		return refNumber;
	}

	public void setRefNumber(String refNumber) {
		this.refNumber = refNumber;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

// ------------------- compare-by-criteria methods -------------------------
//  ALWAYS just ONE property of the two Transactions is being compared;
//	
//  if NEGATIVE number is returned, the calling Transaction
//	is "LESS THAN" the Transaction in parameters,
//	
//  if 0 is returned, the two Transactions are "EQUAL",
//	
//  if POSITIVE number is returned, the calling Transaction
//	is "GREATER THAN" the Transaction in parameters,

	public int compareTransDates(Transaction transaction) {
		return this.transDate.compareTo(transaction.getTransDate());
	}

	public int comparePostedDates(Transaction transaction) {
		return this.postedDate.compareTo(transaction.getPostedDate());
	}

	public int compareRefNumbers(Transaction transaction) {
		return this.refNumber.compareTo(transaction.getRefNumber());
	}

	public int compareDescriptions(Transaction transaction) {
		return this.description.compareTo(transaction.getDescription());
	}

	public double compareAmounts(Transaction transaction) {
		return this.amount - transaction.getAmount();
	}

	public int compareCategories(Transaction transaction) {
		return this.category - transaction.getCategory();
	}

// ------------------- other methods ---------------------------------------	

	public boolean isBetweenDates(Calendar firstDate, Calendar secondDate) {
		return (!transDate.before(firstDate) && !transDate.after(secondDate));
	}

	@Override
	public String toString() {
		String output = "THIS TRANSACTION:\n------------------------------------\n";
		output += "Transaction Date: " + returnMMslashDDFromCalendar(this.transDate) + "\n";
		output += "Posted Date:      " + returnMMslashDDFromCalendar(this.postedDate) + "\n";
		output += "Reference Number: " + this.refNumber + "\n";
		output += "Description:      " + this.description + "\n";
		output += "Amount:           " + String.format("$ %.2f", amount) + "\n";
		output += "Category:         " + this.category + "\n------------------------------------\n";
		return output;
	}

//	public static void main(String[] args) {
//		System.out.println(returnOFXFromCalendar(returnCalendarFromOFX("20220415201405")));
//		System.out.println("\n\n");
//		Transaction t1 = new Transaction(returnCalendarFromMMslashDD("02/21", "2022"),
//				returnCalendarFromMMslashDD("02/22", "2022"), "S254WD98422000A1", "Cub Foods #1224", 126.74, ESSENTIALS);
//		Transaction t2 = new Transaction(returnCalendarFromMMslashDD("02/21", "2022"),
//				returnCalendarFromMMslashDD("02/21", "2022"), "R254WD98422000A1", "Rainbow Foods", 122, ESSENTIALS);
//		System.out.println(t1);
//		System.out.println(t2 + "\n\n");
//		System.out.println("COMPARISONS:\n------------------");
//		System.out.println("Trans Dates:    " + t1.compareTransDates(t2) + "\n");
//		System.out.println("Posted Dates:   " + t1.comparePostedDates(t2) + "\n");
//		System.out.println("Ref. Numbers:   " + t1.compareRefNumbers(t2) + "\n");
//		System.out.println("Descriptions:   " + t1.compareDescriptions(t2) + "\n");
//		System.out.println("Amounts:        " + t1.compareAmounts(t2) + "\n");
//		System.out.println("Categories:     " + t1.compareCategories(t2) + "\n------------------");
//	}
}
