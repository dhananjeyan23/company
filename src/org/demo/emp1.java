package org.demo;
import org.emp1.company;

public class emp1 {

	//data initialisation
	String ename1 = "psd";
	String ename7 = "psdjps";
	//create the 1st method empId
	private void empName() {
		System.out.println("employeename : "+ename1);
	}
	private void empName7() {
		System.out.println("employeename : "+ename7);
	}
	//create the main method 
		public static void main(String[] args) {
			//classname objrefname = new classname()
			emp1 ei1 = new emp1();
			ei1.empName();
			ei1.empName7();

}
}