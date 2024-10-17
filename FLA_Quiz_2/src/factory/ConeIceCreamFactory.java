package factory;

import model.IceCream;
import model.RegularConeIceCream;
import model.SpecialConeIceCream;

public class ConeIceCreamFactory extends IceCreamFactory {

	@Override
	public IceCream createIceCream(String flavour, String type) {
		if (type.equals("regular")) {
			return new RegularConeIceCream(flavour);
		} else {
			return new SpecialConeIceCream(flavour);
		}

	}

}
