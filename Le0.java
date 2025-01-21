/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Le0
{
    String name;
    int age;
    public void setName(String s){
        this.name=s;
    }
    public void setAge(int x){
        this.age=x;
    }
    public  int getAge(){
        return age;
    }
    public  String getName(){
        return name;
    }
	public static void main(String[] args) {
		Le0 a=new Le0();
		a.setName("Himanshu");
		a.setAge(20);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		
	}
}
