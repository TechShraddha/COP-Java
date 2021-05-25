//:Write a program to  merge two arrays into a single array.
public class MargeArray {

	
	public static int[] merge(int[] arr1 ,int[] arr2)
	{
		
		int len1= arr1.length;//array1 length
		int len2=arr2.length;//array2 length
		int[] result=new int[len1+len2];
		
		int i=0;
		int j=0;
		int k=0;
		 while(i<len1 && j<len2) 
		 {
			 if(arr1[i]<arr2[j]) {
			 result[k++] =arr1[i++];
			 
		 }
			 else {
				 result[k++]=arr2[j++];
			 }
		 }
		while (i<len1) {
			result[k++]=arr1[i++];
			
		}
		while (j<len2) {
			result[k++]=arr2[j++];
			
		}
		
		return result;
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {1,2,4,5};
		int[] arr2 = {2,5,8,9,10};
		int[] result = merge(arr1,arr2);
		
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
