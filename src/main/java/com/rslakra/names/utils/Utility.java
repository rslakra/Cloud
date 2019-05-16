/**
 * 
 */
package com.rslakra.names.utils;

import java.util.Collection;
import java.util.Map;

/**
 * @author Rohtash Lakra
 *
 */
public final class Utility {

	/**
	 * Returns true if the obeject is null otherwise false.
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isNull(final Object object) {
		return (object == null);
	}

	/**
	 * Returns true if the object is null or empty otherwise false.
	 * 
	 * @param object
	 * @return
	 */
	public static boolean isNullOrEmpty(final Object object) {
		if (isNull(object)) {
			return true;
		} else if (object instanceof String && ((String) object).isEmpty()) {
			return true;
		} else if (object instanceof Collection<?> && ((Collection<?>) object).isEmpty()) {
			return true;
		} else if (object instanceof Object[] && ((Object[]) object).length == 0) {
			return true;
		} else if (object instanceof Map<?, ?> && ((Map<?, ?>) object).isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

//	/**
//	 * 
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		Object object = null;
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = "";
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = "Rohtash";
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = new String[] {};
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = new String[] { "Lakra" };
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = new ArrayList<String>();
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = new HashMap<Object, Object>();
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//		object = new HashSet<Object>();
//		System.out.println(object + ", isNullOrEmpty:" + Utility.isNullOrEmpty(object));
//	}

}
