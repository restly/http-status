package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 408 Request Timeout
 *
 * <p>
 * The client did not produce a request within the time that the server
 * was prepared to wait. The client MAY repeat the request without
 * modifications at any later time.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.9">https://tools.ietf.org/html/rfc2616#section-10.4.9</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class RequestTimeoutException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.REQUEST_TIMEOUT;

	public RequestTimeoutException() {
		this(null);
	}

	public RequestTimeoutException(Object data) {
		super(HTTP_STATUS, data);
	}
}