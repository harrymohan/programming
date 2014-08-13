/*
 * Author-: Harmohan Singh
arr1={1,2,3,4,5,6,9}
arr2={5,6,7,8}

arr3={1,2,3,4,5,5,6,6,7,8,9}
*/
public class MergeSortedArrays {

	static void MergeElementInSortedArray(int[] arr1,int[] arr2)
	{
		int len1 = arr1.length-1;
		int len2 = arr2.length-1;
	
		int[] arr3 = new int[arr1.length+arr2.length];
		int len3 = arr3.length-1;
		for(int i= len3;i>=0;i--)
		{
			if(len1 >=0 && len2 >=0)
			{
				if(arr2[len2] > arr1[len1])
				{
					arr3[i] = arr2[len2];
					len2--;
				}
				else
				{
					if(arr2[len2] < arr1[len1])
					{
						arr3[i] = arr1[len1];
						len1--;				
					}
					else
						if(arr1[len1] == arr2[len2]){
							arr3[i]=arr1[len1];
							len1--;
							i--;
							arr3[i]=arr2[len2];
							len2--;
						}
				}
			}
			else{
			if(len1 > len2)
			{
				//copy the rest of the element
				arr3[i] = arr1[len1];
				len1--;
			}
			else
				if(len1 < len2)
				{
				//copy the rest of the element
					arr3[i] = arr2[len2];
					len2--;
				}
				
			}
			
		}
		//display the array
		for(int k=len3;k>=0;k--)
		{
			System.out.println(arr3[k]);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,12};
		int[] arr2 = {5,7,9,11,13};
		 MergeElementInSortedArray(arr1,arr2);
	}

}
