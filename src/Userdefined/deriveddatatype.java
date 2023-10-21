package Userdefined;

public class deriveddatatype {
	
	public static void main(String[] args) {
	student[] user= new student[10];
	for(int i=0;i<10;i++) {
		
		 user[i]=new student();
		 user[i].Rollnumber=100+i;
		 user[i].name="Student"+i;
		 user[i].add="Address"+i;
	}
	for(int i=0;i<10;i++) {
		System.out.println("Address :"+user[i].Rollnumber+" Name :"+ user[i].name+" Address :"+user[i].add);
		
	}
		
	}

}
