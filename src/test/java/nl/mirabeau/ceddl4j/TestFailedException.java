/**
 * 
 */
package nl.mirabeau.ceddl4j;

/**
 * 
 *
 */
public class TestFailedException extends RuntimeException {

	private static final long serialVersionUID = -7768667218984368146L;

	/**
	 * 
	 */
	public TestFailedException() {
		super();
	}

	/**
	 * @param arg0
	 */
	public TestFailedException(final String message) {
		super(message);
	}

	/**
	 * @param arg0
	 */
	public TestFailedException(final Throwable throwable) {
		super(throwable);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public TestFailedException(final String message, final Throwable throwable) {
		super(message, throwable);
	}

}
