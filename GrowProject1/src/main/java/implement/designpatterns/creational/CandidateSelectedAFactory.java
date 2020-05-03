package implement.designpatterns.creational;

public  class CandidateSelectedAFactory {
	
	public static CandidateSelectedF getCandidateSelected(CandidateAbstractFactory candidate) {
		return candidate.getCandidate();
	}

}
