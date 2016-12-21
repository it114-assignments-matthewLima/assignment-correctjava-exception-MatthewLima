/**
 * 
 */

/**
 * @author Matt
 *
 */

	public class CheckedChild extends CheckedParent {
		@Override
		public void method1(Integer _inp) throws CheckedExceptionsChild {
		}

		// NOTE while overwriting one can not go up the Exception inheritance. Going down and throwing child like above method is OK.
//		@Override
//		public void method2(Integer _inp) throws CheckedExceptions {
//		}

	}



