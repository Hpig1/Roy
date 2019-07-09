package entity;

public class Member {
	private int RoyId;
    private String RoyName;
    private int Money;
    private String Password;
    private String RoyType;
	public int getRoyId() {
		return RoyId;
	}
	public void setRoyId(int royId) {
		RoyId = royId;
	}
	public String getRoyName() {
		return RoyName;
	}
	public void setRoyName(String royName) {
		RoyName = royName;
	}
	public int getMoney() {
		return Money;
	}
	public void setMoney(int money) {
		Money = money;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getRoyType() {
		return RoyType;
	}
	public void setRoyType(String royType) {
		RoyType = royType;
	}
	@Override
	public String toString() {
		return "Member [RoyId=" + RoyId + ", RoyName=" + RoyName + ", Money="
				+ Money + ", Password=" + Password + ", RoyType=" + RoyType
				+ "]";
	}
	
}
