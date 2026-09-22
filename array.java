// import java.util.Scanner;

// PRACTICE QUESTIONS OF ARRAYS(CODE WITH HARRY)


// 1.CREATE AN ARRAY OF 5 FLOATS AND CALCULATE THEIR SUM AND AVERAGE

// public class array {
//     public static void main(String[] args) {
//         float[] arr = {1.4f,5.6f,4.6f,3.8f,2.9f};
    
//         float sum = 0;

//         for(int i = 0;i < arr.length;i++){
//             sum += arr[i];
//         }
//         System.out.println(sum);
//         float average = (sum/arr.length);
//         System.out.println(average);
//     }
// }

// -------------------------***************************************-------------------------------

// 2.WRITE A PROGRAM TO FIND OUT WHETHER A GIVEN INTEGER IS PRESENT IN THE ARRAY OR NOT

// public class array {
//     public static void main(String[] args) {
        
//         float[] arr = {1.4f,5.6f,4.6f,3.8f,2.9f};
        
//         float target = 4.6f;

//         boolean found = false;
        
//         for(int i = 0;i < arr.length;i++){
//             if(arr[i] == target){
//                 found = true;
//                 break;
//             }
//         }
//         if(found){
//             System.out.println("Element Found!");
//         } else{
//             System.out.println("Element Not Found!");
//         }
//     }
// }


// -------------------------***************************************-------------------------------

// 3. CREATE A JAVA PROGRAM TO ADD TWO MATRICES OF SIZE [2][3] (2X3)

// public class array{
//     public static void main(String[] args) {
//         int[][] mat1 = {{1,2,3},
//                         {4,5,6}};

//         int[][] mat2 = {{1,2,3},
//                         {4,5,6}};

//         int[][] result = {{0,0,0},
//                           {0,0,0}};

// dono matrix ki size same hai to sirf ek matrix ke loop me iterate krenge to dusra aise hi use kr skte hai

//         for(int i = 0;i < mat1.length;i++){  rows ke liye hai ye loop
//             for(int j = 0;j < mat1[i].length;j++){  columns ke liye hai ye loop
//                 result[i][j] = mat1[i][j] + mat2[i][j];
//             }
//         }

//         for(int i = 0;i < result.length;i++){
//             for(int j = 0;j < result[i].length;j++){
//                 System.out.println(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// -------------------------***************************************-------------------------------

// 4. REVERSE AN ARRAY

// public class array{
//     public static void main(String[] args) {

//         int [] arr = {1,2,3,4,5};

//         int l = arr.length;

//         int n = Math.floorDiv(l, 2);

//         int temp;

//         for(int i = 0;i < n;i++){
//             temp = arr[i]; // **** yahape,arr[i] ko dalna tha isliye vo right me aaya aur temp me dalna tha isliye temp left me aaya
//             arr[i] = arr[l-i-1]; // **** jis koi bhi value ko dalna hai vo right me aayega aur jidhar dalna hai vo left me aayega 
//             arr[l-i-1] = temp;
//         }
//         for(int element:arr){
//             System.out.println(element + "");
//         }
//     }
// }


// -------------------------***************************************-------------------------------

// 5. CHECK WHETHER THE ARRAY IS SORTED OR NOT

// public class array {
//     public static void main(String[] args) {

//         boolean sorted = true;

//         int[] arr = {1, 4, 2, 5, 6};

//         for(int i = 0; i < arr.length - 1; i++) { // arr.length - 1 isliye kiya kyuki i+1 krna hai na to vahape vo agr sirf arr.length hota to vo last element 6 tak jata aur i+1 i.e 6 + uska next element krta but n5 to last element hai to ArrayIndexOutOfBoundsException aata isliye  

//             if(arr[i] > arr[i + 1]) {
//                 sorted = false;
//                 break;
//             }
//         }

//         if(sorted) {
//             System.out.println("Sorted");
//         } else {
//             System.out.println("Not Sorted");
//         }
//     }
// }

public class array{
    public static void main(String[] args) {
        int [] arr = {1,2,3};

        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        
        }
        System.out.println(arr.length);
    }
}