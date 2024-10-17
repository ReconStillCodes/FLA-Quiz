package factory;

import model.IceCream;

public abstract class IceCreamFactory {

	public IceCream orderIceCream(String flavour, String type) {
		IceCream ic = createIceCream(flavour, type);
		ic.prepare();
		System.out.println(ic.getName() + " is ready to serve...");
		return ic;
	}

	public abstract IceCream createIceCream(String flavour, String type);

}
