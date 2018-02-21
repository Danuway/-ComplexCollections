import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexCollections {

	public static String[] vehicles = {
			"ambulance", "helicopter", "lifeboat"
	};
	public static String [][] drivers = {
			{"Fred", "Sue", "Peter"},
			{"Sue", "Richard", "Bob", "Fred"},
			{"Pete", "Mary","Bob"}
	};

	/**
	 * Req.d: TODO: Data representation
	 * with complex collections?
	 * @param args
	 */
	public static void main(String[] args) {

		/**
		 * To represent a driver to be selected by
		 * the ability to operate a vehicle:
		 * 1) No need to be sorted
		 * 2) Only key is String		 
		 * 
		 */

		Map<String, Set<String>> personnel = new HashMap();
		for (int i = 0; i < vehicles.length; i++) {
			String key = vehicles[i];
			String [] values = drivers[i];
			Set<String> val = new LinkedHashSet<>();

			for (String driver: values) {
				val.add(driver);
			}
			personnel.put(key, val);
		}
		Set<String> vehiclesTypes = personnel.keySet();

		for (String veh : vehiclesTypes) {
			System.out.println("Skilled Drivers for vehicle " + veh + " are :");
			//Iterator<Set<String>> it = personnel.values().iterator();
			System.out.println(personnel.get(veh));

		}

	}
}
