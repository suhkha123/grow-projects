package implement.designpatterns.creational;

public class CandidateShortlistedB {
	
	private String candidateName;
	private int age;
	private double yrsOfExperience;
	private double expectedSalary;
	private String mainSkill;
	private boolean immediateJoiner;
	private boolean readyToRelocate;
	
	public CandidateShortlistedB(String candidateName, int age, double yrsOfExperience, double expectedSalary,
			String mainSkill, boolean immediateJoiner, boolean readyToRelocate) {
		super();
		this.candidateName = candidateName;
		this.age = age;
		this.yrsOfExperience = yrsOfExperience;
		this.expectedSalary = expectedSalary;
		this.mainSkill = mainSkill;
		this.immediateJoiner = immediateJoiner;
		this.readyToRelocate = readyToRelocate;
	}
	
	@Override
	public String toString() {
		
		return "Candidate shortlisted - Name: "+candidateName+", Age: "+age+", Experience(Years): "+yrsOfExperience+
				", Expected Salary: "+expectedSalary+", Skill: "+mainSkill+", Immediate Joiner: "+immediateJoiner+
				", Ready for Relocation: "+readyToRelocate;
		
	}

}
