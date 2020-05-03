package implement.designpatterns.creational;

public abstract class CandidateSelectedF {
	
	public abstract String getcandidateName();
	public abstract String getpositionType();
	public abstract double getpayScale();
	public abstract String getmainSkill();
	
	

	@Override
	public String toString() {
		
		return "Candidate Selected - Name: "+getcandidateName()+", Employment Type: "+getpositionType()+
				", Pay rate: "+getpayScale()+", Skill: "+getmainSkill()+".";
		
	}

}
