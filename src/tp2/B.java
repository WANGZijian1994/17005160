package tp2;
/**
 * 
 * @author wang zijian
 *@return n/2 si 13|n sinon n+2
 */
public class B {
	/**
	 * @param n un nombre entier
	 */
   public static int divise (int n){
    	if ((n%2)==0) return n;
    	else return (n+2);
    }
}
