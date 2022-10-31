package kr.co.ezenac.map;

public class Member {

	private int memberId; // 회원 아이디
	private String memberName; // 회원 이름

	public Member(int memberId, String memberName) { // 생성자
		// super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemverName() {
		return memberName;
	}

	public void setMemverName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			if(this.memberId == member.memberId) 
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return memberId;
	}
}
