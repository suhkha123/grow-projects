package implement.designpatterns.creational;

public class SelectedOnFullTimeF extends CandidateSelectedF{

	private String candidateName;
	private String positionType;
	private double payScale;
	private String mainSkill;
	
	public SelectedOnFullTimeF(String candidateName, String positionType, double payScale, String mainSkill) {
		super();
		this.candidateName = candidateName;
		this.positionType = positionType;
		this.payScale = payScale;
		this.mainSkill = mainSkill;
	}
	
	@Override
	public String getcandidateName() {
		return candidateName;
	}

	@Override
	public String getpositionType() {
		return positionType;
	}
	@Override
	public double getpayScale() {
		return payScale;
	}
	@Override
	public String getmainSkill() {
		return mainSkill;
	}

}
