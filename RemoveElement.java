package array;

public class RemoveElement {
  public static void main(String args[]) {
	  int arr[]= {1,2,3,4,5};
	  int delete=3;
	  for(int i=0;i<arr.length;i++) {
		  if(delete==arr[i]) {
			  for(int j=i;j<arr.length-1;j++) {
				  arr[j]=arr[j+1];
				 
			  }
			  break;
		  }
	  }
	 for(int i=0;i<arr.length-1;i++) {
		 System.out.println(arr[i]);
	 }
  }
}
