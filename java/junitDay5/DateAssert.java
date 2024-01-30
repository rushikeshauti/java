package junitDay5;

 class DateAssert {

	int intDay, intMonth, intYear;
	DateAssert(int intDay, int intMonth, int intYear)	
	{  this.intDay = intDay;
	this.intMonth = intMonth;  this.intYear = intYear;
	}
	{
	this.intDay = intDay;
	}
	
	int getDay()
	{
	return this.intDay;
	}

	void setMonth(int intMonth)
	{
	this.intMonth = intMonth;
	}

	int getMonth( )
	{
	return this.intMonth;
	}

	void setYear(int intYear)
	{
	this.intYear=intYear;
	}
	
	int getYear( )
	{
	return this.intYear;
	}
	
	public String toString() //converts date obj to string.
	{
	return "Date is "+intDay+"/"+intMonth+"/"+intYear;
 }
}
