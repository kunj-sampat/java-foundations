// public class method {

//     static int add(int a,int b){
//       int c = (a+b);
//       return c;
//     }

//     public static void main(String [] args){
  
//         int x = 10;
//         int y = 10;
//         method obj = new method();
//         int z = obj.add(x,y); // only if we dont declare the method static then only we have to call using object,if method is static then we can call it directly as shown below without object
//         int z = add(x,y);
//         System.out.println(z);
//     }
// }

// public class method{

//    static void logic(int a){
//     if(a % 2 == 0){
//         System.out.println("Even Number");
//     }else{
//         System.out.println("Odd Number");
//     }
//    }
  
//    public static void main(String [] args){
//    logic(2);
//    }

// }

// public class method {
 
//  static void logic(String n,int a){
//     if(a < 18){
//         System.out.println("Ticket price is 100/- and Name is : " + n);
//     }else{
//         System.out.println("Ticket price is 200/- and Name is : " + n);
//     }
//  }

//     public static void main(String[] args) {
//         logic("Kunj",18);

//     }
// }


// ************************* METHOD OVERLOADING ******************************************

// public class method {

//     static int add(int a,int b){
//         int sum = (a+b);
//         return sum;
//     }

//     static int add(int a,int b,int c){
//         int sum = (a+b+c);
//         return sum;
//     }
//     public static void main(String[] args) {
//        int a = add(5,10);
//        int b = add(5,10,15);
      
//        System.out.println(a);
//        System.out.println(b);
//     }
// }

// **************************** Variable Arguments (VarArgs) *********************************

// public class method{

//     static int add(int ...arr){  // isme alag-alag parameters ke liye alag-alag methods banane ki jarurat nhi hai,ek array me hi sab arguments store ho jate hai
//         int result = 0;          // ab agar isme aisa krna ho ki compulsory ek argument to deni hi hai to  static int add(int x,int ...arr) aur result += x hojayega kyuki phir x ke liye koi ek argument to pass krna hi padega 
//         for(int a:arr){          // agr int x nhi dala to without any arguments bhi call kr skte hai,kuch output display nhi hoga 
//             result += a;
//         }
//         return result;
//     }
   
//     public static void main(String[] args) {
//         System.out.println(add(1,2,3,4,5));
//     }
// }


