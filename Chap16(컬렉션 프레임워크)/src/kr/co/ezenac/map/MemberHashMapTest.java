package kr.co.ezenac.map;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "류성룡");
		Member memberS2 = new Member(2025, "류성룡");
		
		
		memberHashMap.addMember(memberW);
		memberHashMap.addMember(memberL);
		memberHashMap.addMember(memberS);
		memberHashMap.addMember(memberR);
		memberHashMap.addMember(memberS2);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(2025);
		memberHashMap.showAllMember();
	}
}
