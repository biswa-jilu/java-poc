

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {
		
		int[] arr ={1,0,0,2,6,0,1}; // 00  12
		 int[] anotherArray = new int[arr.length - 1];
		int length = arr.length;	
		int anotherArrayLength = 0; 
		int anotherArrayActualLength  = anotherArray.length-1;
		for(int i =0; i<length-1;i++) {
			
			if(arr[i]==0) {
				anotherArray[anotherArrayLength]=0;
				anotherArrayLength++;	
			}else {
				if(anotherArray[anotherArrayActualLength] != 0) {
					int temp = anotherArray[anotherArrayActualLength] ;
					anotherArray[anotherArrayActualLength]=arr[i];
							anotherArrayActualLength = anotherArrayActualLength-1;
							anotherArray[anotherArrayActualLength] = temp;
				}else {
					anotherArray[anotherArrayActualLength] = arr[i];
					anotherArrayActualLength = anotherArrayActualLength-1;
				}
				
			}
		}
		System.out.println(Arrays.toString(anotherArray));
	}

}
