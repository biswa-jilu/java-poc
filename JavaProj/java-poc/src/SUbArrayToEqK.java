
public class SUbArrayToEqK {

	public static void main(String[] args) {
		
		
		int[] arr = {3, 5, 1, 9, 7, 1, 14, 15};
		
		int startIndex = 0; 
		int currSum = 0; 
		int targetIndex = 0;
		
		int target = 15;
		
		for(int i=0 ; i<arr.length; i++) {
			
			currSum = currSum+ arr[i];
			targetIndex = i; 
			if(currSum == target) {
				currSum = 0; 
				startIndex =i+1; 
				targetIndex = i; 
				System.out.println("one pair is "+startIndex+" and targetIndex"+targetIndex);
			}
			
			else if(currSum > target) {
				
				while(startIndex!=targetIndex) {
					
					if(target == currSum-arr[startIndex]) {
						
						System.out.println("one pair is "+ ++startIndex +" and targetIndex"+targetIndex);
						currSum = 0; 
						startIndex = targetIndex;
						break;
					}
					startIndex++;
				}
			}
			
			
			
			
		}
		
		
		

	}

}
