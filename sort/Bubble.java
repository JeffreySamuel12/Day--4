public class Bubble {  
    public static void main(String[] args) {  
        int arr[] = {56,34,12,89,27,19};  
        int n = arr.length; // Define n as the length of the array
         
        System.out.println("Array Before Bubble Sort");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
          
        int temp = 0;  
        for (int i = 0; i < n; i++) {  
            for (int j = 1; j < (n - i); j++) {  
                if (arr[j - 1] > arr[j]) {  
                    temp = arr[j - 1];  
                    arr[j - 1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
        
        System.out.println("Array After Bubble Sort");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}
