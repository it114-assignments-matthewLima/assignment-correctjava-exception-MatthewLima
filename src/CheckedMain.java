/**
 * 
 */

/**
 * @author Matt
 *
 */
public class CheckedMain {

	/**
	 * 
	 */
	public CheckedMain() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void method1(Integer _inp) throws CheckedExceptions, CheckedExceptions2, CheckedExceptionsChild {
		switch (_inp) {
		case 1:
			throw new CheckedExceptions("1");
//			break;
		case 2:
			throw new CheckedExceptions2("2");
//			break;
		case 11:
			throw new CheckedExceptionsChild("11");
//			break;
		case 90:
		case 91:
			System.out.println("bla bla");
			break;
		default:
//			throw new FileNotFoundException("default threw checked exception");
			throw new IllegalArgumentException("default threw RuntimeException");	// no need to add to throws of method signature
//			break;
		}
	}
	
	public static void useMethod1(Integer _inp) {
		CheckedMain m = new CheckedMain();
		
		try {
			m.method1(_inp);
		} catch (CheckedExceptionsChild e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void useMethod2(Integer _inp) {
		CheckedMain m = new CheckedMain();
		try {
			m.method1(_inp);
		} catch (CheckedExceptions | CheckedExceptions2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void useMethod3(Integer _inp) throws CheckedExceptionsChild, CheckedExceptions, CheckedExceptions2 {
		CheckedMain m = new CheckedMain();
		m.method1(_inp);
	}

	public static void useMethod4(Integer _inp) {
		CheckedMain m = new CheckedMain();
		try {
			m.method1(_inp);
		} catch (CheckedExceptionsChild  e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions2   e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		// NOTE below line should be above line catch (CheckedExceptions  e) {
//		} catch (CheckedExceptionsChild  e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	}

	public static void useMethod5(Integer _inp) {
		CheckedMain m = new CheckedMain();
		try {
			m.method1(_inp);
		} catch (CheckedExceptionsChild e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CheckedExceptions2 e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void useMethod6(Integer _inp) throws CheckedExceptions {
	CheckedMain m = new CheckedMain();
	try {
		m.method1(_inp);
	} catch (CheckedExceptionsChild e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CheckedExceptions e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (CheckedExceptions2 e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		// NOTE can wrap an Exception ( Throwable) into another Exception via its constructor like below
		CheckedExceptions e1 = new CheckedExceptions("got CheckedExceptions2 " + e.getMessage(), e);
		throw e1;
	}
}

	
//	public static void useMethod7(Integer _inp) {
//		CheckedMain m = new CheckedMain();
//		m.method1(_inp);
//	}
	
}


