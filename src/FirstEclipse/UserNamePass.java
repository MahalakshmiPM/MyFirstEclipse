/*Write a Java program to create user name and password :
Conditions:
i.	Username & password should be alphanumeric
ii.	They should contain atleast one small, capita, number and symbol
iii.	They should be between 8-33 size only
iv.	Username should be equal to password in reverse order.
Ex: “Shiva8&”  checked with “&8avihS”
*/

package FirstEclipse;
import java.lang.Math;

public class UserNamePass {

	public static void main(String[] args) {
		
		int len = Random(8,33); 		
		int[] intStr =new int[len];
	
		for (int i = 0; i < len; ) {
			intStr[i] = Random(64,91);if(i==len-1) break; i++;
		    intStr[i] = Random(97,123);if(i==len-1) break; i++;
		    intStr[i] = Random(48,58);if(i==len-1) break; i++;
		    intStr[i] = Random(35,39);if(i==len-1) break; i++;
		}
		
		String userName = new String(intStr,0,len);
		System.out.println("User Name : "+userName);		
		
		StringBuilder pass=new StringBuilder();
		for (int i = len-1; i >=0 ; i--) {
			pass.append(userName.charAt(i));
		}
		System.out.println("Password  : "+pass);
}
static int Random(int min,int max) 
{
	double f = Math.random()/Math.nextDown(1.0);
	double x = min*(1.0 - f) + max*f;
	return (int)x;
}	
}
