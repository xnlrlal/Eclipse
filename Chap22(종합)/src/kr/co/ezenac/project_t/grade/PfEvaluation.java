package kr.co.ezenac.project_t.grade;

// - 70점 이상인 경우는 pass, 미만인 경우는 fail입니다.

public class PfEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int score) {
		if (score >= 70) {
			return "P";
		} else {
			return "F";
		}
	}
}
