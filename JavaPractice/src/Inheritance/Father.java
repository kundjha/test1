package Inheritance;
//Son is extending Grandfather i.e son has all the rights of grandfather
//If there are two same function then first will check in same class and then will check if there is inheritance
public class Father extends Grandfather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f=new Father();
	    //I haven't declated City method but able to use it here ( This is due to inheritance
		f.city();
		f.country();
		System.out.println(f.i);//Example that even variable can be inherited

	}
	public void fatheractivities() {
		
		System.out.println("Father Activities")
	}
	

}
