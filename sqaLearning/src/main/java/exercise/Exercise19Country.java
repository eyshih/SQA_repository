package exercise;

public class Exercise19Country {

	/*
	 * 1) Object class is the superclass of all the classes.
	 * 2) Object class provides an implementation of "equals" methods in such a way
	 * that it compares memory references (same as ==)
	 * 3) String class (which also extends Object) override the equals method
	 * and compares for values of string instead of references.
	 * 4) Any other class that you create and do not provide the impl. of 
	 * equals method. That class will take object class equals impl., which
	 * will compare for memory refer. that is ob1 == ob2 and ob1.equals(ob2) both will
	 * return false.
	 * 5) You override equals and compare the properties and then
	 * ob1.equals(ob2) will return true if properties are same.
	 */
	private String countryCode;
	private String countryName;
	private long populatoin;
	private String currency;
	
	public Exercise19Country(String countryCode, String countryName, long populatoin,
			String currency) {
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.populatoin = populatoin;
		this.currency = currency;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulatoin() {
		return populatoin;
	}

	public void setPopulatoin(long populatoin) {
		this.populatoin = populatoin;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		return result;
	}

	//We have to override equals method here, or else the default 
	//implementation of equals method will compare the memory reference.
	//which will be false for 2 different objects having same values.
	//So, we use generate equals and hashcode feature to override these methods
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exercise19Country other = (Exercise19Country) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		return true;
	}
}
