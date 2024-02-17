
public class Matrix {

	public static void main(String[] args) {
 int i= 1;
 int j =1;
 int k = 1;
 int sum =3 ;
 
 int x,y,z;
 
 for(x=0;x<=i;x++) {
	 for(y=0;y<=j;y++) {
		 for(z=0;z<=k;z++) {
		int add = x+y+k;
			 if(add!=sum)	{ 
			 System.out.println("[" + x + "," + y +"," +z +"]");
		 }
		 }
	 } 
 }
 
	}

}
