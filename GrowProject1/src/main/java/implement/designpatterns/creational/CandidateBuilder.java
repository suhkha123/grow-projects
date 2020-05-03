package implement.designpatterns.creational;

public class CandidateBuilder {
	
	private String candidateName;
	private int age;
	private double yrsOfExperience;
	private double expectedSalary;
	private String mainSkill;
	private boolean immediateJoiner;
	private boolean readyToRelocate;
	
	public CandidateBuilder setCandidateName(String candidateName) {
		this.candidateName = candidateName;
		return this;
	}
	
	public CandidateBuilder setAge(int age) {
		this.age = age;
		return this;
	}
	
	public CandidateBuilder setYrsOfExperience(double yrsOfExperience) {
		this.yrsOfExperience = yrsOfExperience;
		return this;
	}
	public CandidateBuilder setExpectedSalary(double expectedSalary) {
		this.expectedSalary = expectedSalary;
		return this;
	}
	
	public CandidateBuilder setMainSkill(String mainSkill) {
		this.mainSkill = mainSkill;
		return this;
	}
	
	public CandidateBuilder setImmediateJoiner(boolean immediateJoiner) {
		this.immediateJoiner = immediateJoiner;
		return this;
	}
	
	public CandidateBuilder setReadyToRelocate(boolean readyToRelocate) {
		this.readyToRelocate = readyToRelocate;
		return this;
	}
	
	public CandidateShortlistedB build() {
		return new CandidateShortlistedB(candidateName, age, expectedSalary, expectedSalary, candidateName, immediateJoiner, immediateJoiner);
		
	}

}
