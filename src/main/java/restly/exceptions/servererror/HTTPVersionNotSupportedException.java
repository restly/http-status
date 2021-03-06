package restly.exceptions.servererror;

import restly.HttpStatus;

/**
 * 505 HTTP Version Not Supported
 *
 * <p>
 *
 * The server does not support, or refuses to support, the HTTP protocol
 * version that was used in the request message. The server is
 * indicating that it is unable or unwilling to complete the request
 * using the same major version as the client, as described in section
 *
 * <a href='http://www.w3.org/Protocols/rfc2616/rfc2616-sec3.html#sec3.1'>3.1</a>
 * , other than with this error message. The response SHOULD
 * contain
 * an entity describing why that version is not supported and what other
 * protocols are supported by that server.
 *
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.5.6">https://tools.ietf.org/html/rfc2616#section-10.5.6</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class HTTPVersionNotSupportedException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.HTTP_VERSION_NOT_SUPPORTED;

	public HTTPVersionNotSupportedException() {
		this(null);
	}

	public HTTPVersionNotSupportedException(Object data) {
		super(HTTP_STATUS, data);
	}
}