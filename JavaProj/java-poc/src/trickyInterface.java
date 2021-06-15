import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class trickyInterface {
	
	private trickyInterface() {
		
	}
	String name = "biswa";
	
	final List<String> myList = new ArrayList<>();

	public String getName() {
		return name;
	}

	public List getMyList() {
		List<String> unmodifyList = new ArrayList<>();
		for(String sts : myList) {
			unmodifyList.add(sts);
		}
		
		return unmodifyList;
	}


	public static void main(String[] args) {
		trickyInterface t1 = new trickyInterface();
		trickyInterface t2 = new trickyInterface();
		try {
			
			
			t1.getName();
			t1.getMyList().add("biswa");
			
			System.out.println("modifieddddddddddddddddd"+t1.getMyList());
		}
		catch(Exception e ) {
			System.out.println(e);
		}
		
		finally {
			System.out.println(t1.getMyList());
		}
		
		
		
		
	}

}
