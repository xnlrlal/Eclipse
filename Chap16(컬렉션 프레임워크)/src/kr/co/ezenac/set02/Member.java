package kr.co.ezenac.set02;

public class Member implements Comparable<Member> {

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

	@Override
	public int compareTo(Member member) {
		return (this.memberId - member.memberId) * (-1); // (+)오름차순, (-1) 곱하면 (-)내림차순 정렬
	}
}
