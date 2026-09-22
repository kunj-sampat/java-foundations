// public class recursion {

//     static int factorial(int n){
//         if(n == 1){
//             return 1;
//         }else{
//             return n * factorial(n-1);
//         }
//     }
//     public static void main(String[] args) {        
//         int n = 5;
//         System.out.println(factorial(n));
//     }
// }


// public class recursion {

//     static int fibonacci(int n){
//         if(n == 0){
//             return 0;
//         }
//         if(n == 1){
//             return 1;
//         }

//         return fibonacci(n-1) + fibonacci(n-2);
//     }
//     public static void main(String[] args) {
//         System.out.println(fibonacci(5));
//     }
// }


// public class recursion {

//     static int natural(int n){
//         if(n == 0){
//             return 0;
//         }

//         return n += natural(n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(natural(5));
//     }
// }

// public class recursion {

//     static int power(int base,int exponent){
//         return base * power(base) ^ power(exponent);  // INCOMPLETE PROGRAM
//     }
//     public static void main(String[] args) {
//         System.out.println(power(2,5));
//     }
// }

// public class recursion {

//     static void pattern(int n){

//         for(int i = n;i >= 1;i--){
//             for(int j = 1;j <= i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         pattern(5);
//     }
// }

// public class recursion {

//     static int average(int ...arr){

//         int sum = 0;                 // methods me sirf utni hi baar return kr skte hai jitne us methods ke parameter ho
//         for(int a:arr){
//             sum += a;
//         }

//         int avg = sum/arr.length;
//         return avg;
//     }
//     public static void main(String[] args) {
//         System.out.println(average(5,4,3,2,1));
//     }
// }

// public class recursion {

//     static void pattern_recursion(int n){
//         if(n > 0){
            
//             for(int i = n;i >= 1;i--){    // reverse triangle pattern using recursion
//                 System.out.print("*");
//             }

// System.out.println();
// pattern_recursion(n-1);
 
//         }
//     }
//     public static void main(String[] args) {
//         pattern_recursion(5);
//     }
// }

// public class recursion {

//     static void conversion(int c){
//         if(c == 0){
//             System.out.println("0");  // simple celcius to farhanreit conversion using methods
//         }else{
//             double f = ((c * 1.8) + 32);
//             System.out.println(f);
//         }
//     }
//     public static void main(String[] args) {
//         conversion(5);
//     }
// }