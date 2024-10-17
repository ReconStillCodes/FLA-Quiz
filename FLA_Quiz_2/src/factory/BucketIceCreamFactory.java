package factory;

import model.IceCream;
import model.RegularBucketIceCream;
import model.SpecialBucketIceCream;

public class BucketIceCreamFactory extends IceCreamFactory {

	@Override
	public IceCream createIceCream(String flavour, String type) {
		if (type.equals("Regular")) {
			return new RegularBucketIceCream(flavour);
		} else {
			return new SpecialBucketIceCream(flavour);
		}
	}

}
