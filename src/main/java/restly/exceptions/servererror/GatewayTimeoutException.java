package restly.exceptions.servererror;

import restly.HttpStatus;

/**
 * 504 Gateway Timeout
 *
 * <p>
 * The server, while acting as a gateway or proxy, did not receive a
 * timely response from the upstream server specified by the URI (e.g.
 * HTTP, FTP, LDAP) or some other auxiliary server (e.g. DNS) it needed
 * to access in attempting to complete the request.
 * </p>
 * <pre>      Note: Note to implementors: some deployed proxies are known to
 *   return 400 or 500 when DNS lookups time out.
 * </pre>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.5.5">https://tools.ietf.org/html/rfc2616#section-10.5.5</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class GatewayTimeoutException extends HttpServerErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.GATEWAY_TIMEOUT;

	public GatewayTimeoutException() {
		this(null);
	}

	public GatewayTimeoutException(Object data) {
		super(HTTP_STATUS, data);
	}
}