public class Insertion {  
    public static void main(String[] args) {  
        int arr[] = {56,34,12,89,27,19};  
        int n = arr.length; // Define n as the length of the array
         
        System.out.println("unsorted array:");
            for(int i =0;i<n;i++)
                System.out.print(arr[i] + " ");
          
        for (int i = 1; i < n; i++) {  
            int key=arr[i];
            int j=i-1;  
                while (j>=0&& arr[j]>key) {  
                    arr[j + 1] = arr[j];  
                    j=j-1;
                }  
                arr[j+1]=key;
            } 
            System.out.println();
            System.out.println("sorted array:");
            for(int i =0;i<n;i++)
                System.out.print(arr[i] + " ");
        }  
        
       
        }  
      