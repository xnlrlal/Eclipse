package kr.co.ezenac.project.grade;

// - 70점 이상인 경우는 pass, 미만인 경우는 fail입니다.

public class PfEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		String grade;
		if (score >= 70 && score <= 100) {
			grade = "P";
		} else {
			grade = "F";
		}
		return grade;
	}

}
