package entity;

public class Company {
     private String CompanyName;
     private String CompanyKeeper;
     private String CompanyAddress;
     private String Sales;
     private int MemberNumber;
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyKeeper() {
		return CompanyKeeper;
	}
	public void setCompanyKeeper(String companyKeeper) {
		CompanyKeeper = companyKeeper;
	}
	public String getCompanyAddress() {
		return CompanyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		CompanyAddress = companyAddress;
	}
	public String getSales() {
		return Sales;
	}
	public void setSales(String sales) {
		Sales = sales;
	}
	public int getMemberNumber() {
		return MemberNumber;
	}
	public void setMemberNumber(int memberNumber) {
		MemberNumber = memberNumber;
	}
}
