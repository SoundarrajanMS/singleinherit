package org.edu;

public class Arts extends Education {
public void bsc(String fullform) {
	System.out.println("fullform of bsc-"+fullform);}
public void bEd(String fullform) {
	System.out.println("fullform of bEd-"+fullform);

}
public void bA(String fullform) {
	System.out.println("fullform of bA-"+fullform);

}
public void bBA(String fullform) {
	System.out.println("fullform of bBA-"+fullform);

}
@Override
	public void ug(String courseoffered) {
	System.out.println("course offered-"+courseoffered);
	}
	@Override
		public void pg(String courseoffered) {
		System.out.println("course offered-"+courseoffered);
		}
public static void main(String[] args) {
	Arts a = new Arts();
	a.bA("bachalor of arts");
	a.bBA("bachalor of bussiness administration");
	a.bEd("bachalor of education");
	a.bsc("bachalor of science");
	a.ug("under graduate");
	a.pg("post graduate");
	
	
}
}

