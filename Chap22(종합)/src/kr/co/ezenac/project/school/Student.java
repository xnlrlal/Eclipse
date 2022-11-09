package kr.co.ezenac.project.school;

import java.util.ArrayList;

public class Student {

	private String studentName; // 이름
	private int studentId; // 학번
	private Subject majorSubject; // 전공
	private Subject minorSubject; // 비전공
	private ArrayList<Score> scores = new ArrayList<>(); // 성적리스트

	public Student(String studentName, int studentId, Subject majorSubject, Subject minorSubject) {
		// super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = majorSubject;
		this.minorSubject = minorSubject;
	}

	public Subject getMinorSubject() {
		return minorSubject;
	}

	public void setMinorSubject(Subject minorSubject) {
		this.minorSubject = minorSubject;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public ArrayList<Score> getScores() {
		return scores;
	}

	public void addSubjectScore(Score score) {
		scores.add(score);
	}
}
