import java.lang.String; /**
 * Created by coupang on 2015. 9. 30..
 */
public abstract class Beverage {
	String description = "no title";

	public String getDescription(){
		return description;
	}

	public abstract double cost();
}
