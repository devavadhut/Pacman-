package practice;

import java.util.Scanner;

class Info{
	int D_id;
	String D_name;
	String D_city;
	
	public void getInfo(int id,String name,String city) {
		D_id=id;
		D_name=name;
		D_city=city;
	}
	
	public void ShowDetails() {
		System.out.println(D_id+"\t");
		System.out.println(D_name);
		System.out.println(D_city);
	}
}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      System.out.println("enter the  id");
      int id=sc.nextInt();
      
      sc.nextLine();
      
      System.out.println("enter the doctor name");
      String name=sc.nextLine();
      
      System.out.println("enter the city");
      String city=sc.nextLine();
      
      Info St=new Info();
      St.getInfo(id,name,city);
      St.ShowDetails();
      
	}

}
