
class Mobile {
    static String name;
    String brand;
    int price;

    void show(){
        System.out.println("Name: " + name + " Brand: " + brand + " Price: " + price);
    }
}

public class staticExample {
    public static void main(String[] args) {
        
        Mobile.name = "Smartphone"; // kyuki name ko as a static variable use kiya hai isliye usko class ke name se bhi value assign kr skte hai aur vo sab objects ke liye uski same value hi rhegi

        Mobile mobile1 = new Mobile();
        Mobile mobile2 = new Mobile();

        mobile1.brand = "Vivo";
        mobile1.price = 10000;

        mobile2.brand = "Oppo";
        mobile2.price = 15000;

        mobile1.show();
        mobile2.show();
    }
}

// use case of static
// eg in some students data,college name is same for every student,other informations change,so then we can declare like this 
// static String college_name; and then using the class name -> class_name.college_name = "";
// static variable ko object_name se bhi kr skte bhai assgin but its better to use class_name