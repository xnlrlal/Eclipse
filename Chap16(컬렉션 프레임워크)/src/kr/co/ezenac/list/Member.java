package kr.co.ezenac.list;

public class Member {

	private int memberId; // 회원 아이디
	private String memverName; // 회원 이름

	public Member(int memberId, String memverName) { // 생성자
		// super();
		this.memberId = memberId;
		this.memverName = memverName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemverName() {
		return memverName;
	}

	public void setMemverName(String memverName) {
		this.memverName = memverName;
	}

	@Override
	public String toString() {

		return memverName + " 회원님의 아이디는 " + memberId + "입니다.";
	}
}
