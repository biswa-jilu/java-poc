
public class MaxSubArray {

	public static void main(String[] args) {
		
		
		int[] arr = {3, 5, -3, 4, 152, -234};
		
		int currSum = 0; 
		int startIndex = Integer.MIN_VALUE;
		int maxSum =0;
		int endIndex = 0;
		int maxTillNow = 0;
		
		for(int i=0; i< arr.length;i++) {
			currSum = currSum+arr[i];
			if(currSum < maxSum && currSum <= maxTillNow ) {
				currSum = 0;
				maxTillNow = maxSum;
				
			}else {
				startIndex = i;
				maxSum = currSum;
				endIndex = i;
			}
			
		}
		
		int finalAns = maxSum > maxTillNow ? maxSum : maxTillNow;
		
		System.out.println("max sum is :: "+finalAns);
		System.out.println("Stsrt index is "+startIndex);
		System.out.println("endIndex is :: "+endIndex);
	}

}
