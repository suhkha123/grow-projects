package implement.designpatterns.creational;

public class SelectedOnFullTimeFactory implements CandidateAbstractFactory{

	private String candidateName;
	private double payScale;
	private String positionType;
	private String mainSkill;
	
	public SelectedOnFullTimeFactory(String candidateName, double payScale, String positionType, String mainSkill) {
		super();
		this.candidateName = candidateName;
		this.payScale = payScale;
		this.positionType = positionType;
		this.mainSkill = mainSkill;
	}

	public CandidateSelectedF getCandidate() {
		return new SelectedOnFullTimeF(candidateName, positionType, payScale, mainSkill);
	}

}
