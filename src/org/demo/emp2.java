package org.demo;

import org.emp2.company;

public class emp2 {
	String ename2="jps";
	String ename5="jpspsd";
	//create the 1st method empName
		private void empName1() {
			System.out.println("employeename : "+ename2);
		}
		private void empName5() {
			System.out.println("employeename : "+ename5);
		}
		public static void main(String[] args) {
			//classname objrefname = new classname()
			emp2 ei1 = new emp2();
			ei1.empName1();
			ei1.empName5();
}
}