package corejava.advanced.Tests;

import org.testng.annotations.Test;

import implement.corejava.advanced.SeasonTempEnum;

public class EnumTests {
	
	public enum Weekend{Saturday,Sunday}
	
	@Test
	void seasonTest(){
		
		for (SeasonTempEnum season: SeasonTempEnum.values()) {
		System.out.println("Index--Season--Temperature");
		System.out.println(season.ordinal()+"--"+season+"--"+season.getValue()+" Centigrade");

		}
	}
	
	@Test
	void weekendTest(){
		
		for (Weekend day: Weekend.values()) {
		System.out.println("Weekend Starts on "+day.valueOf("Saturday"));
		System.out.println("Weekend ends on "+day.valueOf("Sunday"));
		break;
		}
	}

}
