/* public class string {
	public static void main(String[] args) 
	{
		String name1=new String();
		System.out.println(name1);
		System.out.println(name1.hashCode());
		System.out.println("hello "+name1);
		System.out.println(name1.concat("reddy"));
//      String name="Navin";


//      yahape kya hota hai na ki name aur uska reference pehle stack me store hoga phir name ki value i.e navin 
//      heap me ek jagah hai string constant pool vaha store hoga aur usko ek reference address diya jayega eg 101
//      aur phir vohi 101,name jo stack me hai usko diya jayega kyuki navin name variable ki value hai isliye
//      badme name ko modify kiya isliye vapis se abhi nayi value i.e navin reddy store hogi heap me alag reference address se eg 105(name jo already tha heap me usme hi modify nhi hoga)
//      badme s1 aur s2 stack me store honge aur pehle s1 ki value Navin heap me nhi hai to vo heap me store hogi aur uska reference address s1 ko diya jayega  
//      badme s2 ki bhi value Navin hi hai to uske liye koi nayi value heap me nhi hogi store,balki s2 ko bhi s1 ka same reference address diya jayega,is tarah se memory bachegi
//      to abhi jo sabse pehla name hai heap me vo jab garbage collection krenge tab vo delete krdiya jayega

		String name="navin";
		name=name+"reddy";
		System.out.println("hello"+name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
	
	}
} */

// **************************************** StringBuffer ****************************************

class string {
	public static void main(String[] args) 
	{
		StringBuffer sb= new StringBuffer("Navin"); 
		// java me string ko change/modify nhi kr skte hai immutable hai string,vo kaam apan StringBuffer se kr skte hai
		// for eg str name = "kunj";	str.concat("sampat"); yeh nhi kr skte hai java me to normal string se but StringBuffer se kr skte hai 

//		System.out.println(sb.length());
//		System.out.println(sb.capacity());
		sb.append("Reddy");
		System.out.println(sb);
		
//		String str=sb.toString();
		
//		sb.deleteCharAt(2);
//		sb.insert(0,"Java");
//		sb.insert(6,"java");
//		sb.setLength(30);

		sb.ensureCapacity(100); 
		// yeh kya krega ki samaj Navin ek box me store hua to ensurecapacity matlab vo box ko aur bhi bada krdega 100 ki capacity ka to jabhi string
		// ko uske methods use krke change krenge to bar bar capacity badhani nahi padegi aisa,by default capacity 16 hoti hai to abhi for eg 
		// jab khali Navin tha tab 16 + Navin = 21 -> yeh capacity thi ensureCapacity vali line ke pehle,uske baad 100 hogyi

		
		System.out.println(sb);
	
	}
}