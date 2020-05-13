package implement.corejava.advanced;

import java.lang.String;

public class StringCase {
	

	public String appendString(String str, String str2) {
		return str.concat(str2);
	}
	
	public int compareString(String str, String str2) {
		return str.compareTo(str2);
	}
	
	public boolean checkforvalue(String str, String str2) {
		return str.equals(str2);
	}
	
	public boolean checkforreference(String str, String str2) {
		return (str==str2);
	}
	
	/*StringBuffer is synchronized i.e. thread safe. 
	 * It means two threads can't call the methods of StringBuffer simultaneously.	.
	 * StringBuffer is less efficient than StringBuilder.	
	 */
	public StringBuffer appendStringBuffer(String string) {
		StringBuffer sb = new StringBuffer(string);
		return sb.append(string);
	}
	
	/*StringBuilder is non-synchronized i.e. not thread safe. 
	 * It means two threads can call the methods of StringBuilder simultaneously.
	 * StringBuilder is more efficient than StringBuffer.
	 */
	public StringBuilder appendStringBuilder(String string) {
		StringBuilder sb = new StringBuilder(string);
		return sb.append(string);
	}
}
