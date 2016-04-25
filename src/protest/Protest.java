package protest;

public class Protest implements ProtestImpl{
	String name ;
	int first_number;
	int second_number;
	
	public Protest(String name,int a,int b){
		this.name=name ;
		this.first_number=a;
		this.second_number=b;
		
	}
	public int sum(){
		return first_number+second_number;
	}
	public void printf(String name){
		System.out.println(name);
	}
}
