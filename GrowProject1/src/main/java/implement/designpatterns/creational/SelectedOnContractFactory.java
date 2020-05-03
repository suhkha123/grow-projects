package implement.designpatterns.creational;

public class SelectedOnContractFactory implements CandidateAbstractFactory{

	private String candidateName;
	private double payScale;
	private String positionType;
	private String mainSkill;
	
	public SelectedOnContractFactory(String candidateName, double payScale, String positionType, String mainSkill) {
		super();
		this.candidateName = candidateName;
		this.payScale = payScale;
		this.positionType = positionType;
		this.mainSkill = mainSkill;
	}

	public CandidateSelectedF getCandidate() {
		return new SelectedOnContractF(candidateName, positionType, payScale, mainSkill);
	}

}
