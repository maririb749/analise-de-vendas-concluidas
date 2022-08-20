package entities;

public class Sale {
	private Integer month;
	private Integer year;
	private String saller;
	private Integer items;
	private Double total;

	public Sale(Integer month, Integer year, String saller, Integer items, Double total) {
		this.month = month;
		this.year = year;
		this.saller = saller;
		this.items = items;
		this.total = total;
	}

	public Integer getMonth() {
		return month;
	}

	public void setMonth(Integer month) {
		this.month = month;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getSaller() {
		return saller;
	}

	public void setSaller(String saller) {
		this.saller = saller;
	}

	public Integer getItems() {
		return items;
	}

	public void setItems(Integer items) {
		this.items = items;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double avaragePrice() {
		return total / items;
	}

	@Override
	public String toString() {
		return saller + "- " 
	             + "R$" +  " " 
				+ String.format("%.2f", total); 

	}

}
