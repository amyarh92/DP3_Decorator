import java.lang.String; /**
 * Created by coupang on 2015. 9. 30..
 */
public class SteamMilk extends CondimentDecorator {
	Beverage beverage;

	public SteamMilk(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription(){
		return beverage.getDescription() + ", SteamMilk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
