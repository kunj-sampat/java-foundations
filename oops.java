/*  class Employee {

    int salary;
    String name;

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    void setName(String newName) {
        name = newName;
    }
}

public class oops {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.salary = 50000;
        emp.name = "Kunj";

        System.out.println(emp.getSalary());
        System.out.println(emp.getName());

        emp.setName("Rahul");

        System.out.println(emp.getName());
    }
} */

// ----------------------- ********************************** ----------------------------

/* class cellphone {

    void ringing(){
        System.out.println("Ringing...");
    }

    void vibrating(){
        System.out.println("Vibrating...");
    }
}

public class oops {
    public static void main(String[] args) {
        cellphone cell = new cellphone();

        cell.ringing();
        cell.vibrating();
    }
} */


// ----------------------- ********************************** ----------------------------

/* class square {

    int side;

    int area(){
       return side * side;
    }

    int perimeter(){
        return 4 * side;
    }
}

public class oops {
    public static void main(String[] args) {
        
    square sq = new square();
    sq.side = 10;

    System.out.println(sq.area());
    System.out.println(sq.perimeter());

    }
} */

// ----------------------- ********************************** ----------------------------

/* class access_modifiers {
    private String name;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
}

public class oops {
    public static void main(String[] args) {
        access_modifiers access = new access_modifiers();
        access.setName("Kunj");
        System.out.println(access.getName());
    }
} */

// ----------------------- ********************************** ----------------------------


/* class constructor {

    String name;

    constructor(){
        System.out.println("Constructor is called automatically when the Object is Created");
        name = "Kunj";
    }

    String getName(){
        return name;
    }
}

public class oops {
    public static void main(String[] args) {
        constructor constructor = new constructor();

        System.out.println(constructor.getName());
    }
} */


// ----------------------- ********************************** ----------------------------

// Question : Overload the constructor to change the salary to 10k
/* class Employee {

    int salary;

    // Constructor 1
    Employee(int salary) {
        this.salary = salary;
    }

    // Constructor 2 - overloaded constructor
    Employee() {
        salary = 10000;
    }
}

public class oops {
    public static void main(String[] args) {

        Employee e1 = new Employee(25000);
        Employee e2 = new Employee();

        System.out.println(e1.salary);
        System.out.println(e2.salary);
    }
} */

// ----------------------- ********************************** ----------------------------
// QUESTION : USE GETTER AND SETTER TO INITIALIZE RADIUS & HEIGHT AND CALCULATE VOLUME AND SURFACE AREA OF A CYLINDER

/*  class cylinder {

    int radius;
    int height;

    void setRadius(int radius){
        this.radius = radius;
    }

    void setHeight(int height){
        this.height = height;
    }

    int getRadius(){
        return radius;
    }

    int getHeight(){
        return height;
    }

    double volume(){
        return 3.14 * radius * radius * height;
    }

    double surface_area(){
        return (2 * Math.PI * radius * height) + 2 * 3.14 * radius * radius; // Math.PI == 3.14,vo sirf ek inbuilt function hai bus isliye aise hi use kiya hai usko 
    }
}

public class oops {
    public static void main(String[] args) {

        cylinder cylinder = new cylinder();

        cylinder.setRadius(12);
        cylinder.setHeight(9);

        System.out.println( cylinder.getRadius());
        System.out.println( cylinder.getHeight());
 
        System.out.println(cylinder.volume());
        System.out.println(cylinder.surface_area());
    }
}  */

// ----------------------- ********************************** ----------------------------
// QUESTION : DO THE ABOVE SAME THING BUT USING CONSTRUCTOR 

/* class cylinder1{

    int radius;
    int height;

    cylinder1(int radius,int height){
        this.radius = radius;
        this.height = height;
    }

    int getRadius(){
        return radius;
    }

    int getHeight(){
        return height;
    }

    double volume(){
        return 3.14 * radius * radius * height;
    }

    double surface_area(){
        return (2 * Math.PI * radius * height) + 2 * 3.14 * radius * radius; // Math.PI == 3.14,vo sirf ek inbuilt function hai bus isliye aise hi use kiya hai usko 
    }
}

public class oops {
    public static void main(String[] args) {

        cylinder1 cylinder1 = new cylinder1(10,20);

        System.out.println(cylinder1.getRadius());
        System.out.println(cylinder1.getHeight());
 
        System.out.println(cylinder1.volume());
        System.out.println(cylinder1.surface_area());
    }
} */

// ----------------------- ********************************** ----------------------------
// BASIC INHERITANCE

/* class base {
    String name;

    base() {
        System.out.println("Base Class Constructor");
    }

    base(int id) {
        System.out.println("Base Class Constructor with ID: " + id);
    }

    void setName(String name) {
        this.name = name;
    }

    void getName() {
        System.out.println(name);
    }
}

// jabhi bhi base class ke constructor ko call krenge(object banayenge) tabhi parent class ka bhi constructor uske pehle call hota hi hai aur kyuki 
// vo chij super() se hoti hai to java vahape automatically super()laga deta hai aur kyuki super() ko koi parameters nahi hai to vo parent class ka bhi 
// normal constructor(non-parametarized) constructor hi call krega 
// super() → Parent class ka normal/no-parameter constructor call hota hai.
// super(value) → Parent class ka matching parameterized constructor call hota hai.
// super() ke andar kuch nahi → Base()
// super(101) → Base(int)

class derived extends base {
    int age;

    derived(int age, String name) {
        System.out.println(
            "Derived Parameterized Constructor"
            + " Age: " + age
            + " Name: " + name
        );
    }

    derived() {
        System.out.println("Derived Class Constructor");
    }

    derived(int id) {
        super(id);
    }

    void setAge(int age) {
        this.age = age;
    }

    void getAge() {
        System.out.println(age);
    }
}


public class oops {
    public static void main(String[] args) {

        base b = new base();

        derived d1 = new derived(18, "Kunj");

        derived d2 = new derived();

        derived d3 = new derived(101);

        d1.setName("Kunj");
        d1.getName();

        d1.setAge(18);
        d1.getAge();
    }
} */

// super keyword simple example

/* class Base {
    int x = 10;
}    

class Derived extends Base {
    int x = 20;
    
    void getX(){
        System.out.println(x);
    }

    void getBaseX(){
        System.out.println(super.x);
    }
}

public class oops {
    public static void main(String[] args) {

        Derived derived = new Derived();

        derived.getX();
        derived.getBaseX();
    }
} */

// Array of Objects Example
class Student
{
	int rollno;
	String name;
	int marks;	
}

public class oops {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.rollno=1;
		s1.name="Navin";
		s1.marks=88;
		
		Student s2=new Student();
		s2.rollno=2;
		s2.name="Harsh";
		s2.marks=67;
		
		Student s3=new Student();
		s3.rollno=3;
		s3.name="Kiran";
		s3.marks=97;
		
		System.out.println(s1.name + ":"+ s1.marks);
		
		Student students[]=new Student[3];
		students[0]=s1;
		students[1]=s2;
		students[2]=s3;
		
		for(int i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].marks);
		}
    }
}		
		
