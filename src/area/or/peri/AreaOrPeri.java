/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.or.peri;
import java.util.Scanner;
public class AreaOrPeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int L=in.nextInt();
        int B=in.nextInt();
        if(L*B > 2*(L+B))
		{
		    System.out.println("Area");
		    System.out.println(L*B);
		}
		else if (L*B < 2*(L+B))
		{
		    System.out.println("Peri");
		    System.out.println(2*(L+B));
		}
		else
		{
		    System.out.println("Eq");
		    System.out.println(2*(L+B));
		}
	}
}

        
    
    

