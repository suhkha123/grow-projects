package implement.designpatterns.creational;

public class SelectedFactory {

	public static CandidateSelectedF getCandidate(String candidateName, String positionType, double payScale, String mainSkill) {
		
		if (positionType.equalsIgnoreCase("contract"))
			return new SelectedOnContractF(candidateName, positionType, payScale, mainSkill);
		if (positionType.equalsIgnoreCase("fulltime"))
			return new SelectedOnContractF(candidateName, positionType, payScale, mainSkill);
		return null;
	
	}
}
