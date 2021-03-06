package restly.exceptions.clienterror;

import restly.HttpStatus;

/**
 * 409 Conflict
 *
 * <p>
 * The request could not be completed due to a conflict with the current
 * state of the resource. This code is only allowed in situations where
 * it is expected that the user might be able to resolve the conflict
 * and resubmit the request. The response body SHOULD include enough
 * </p>
 * <p>
 * information for the user to recognize the source of the conflict.
 * Ideally, the response entity would include enough information for the
 * user or user agent to fix the problem; however, that might not be
 * possible and is not required.
 * </p>
 * <p>
 * Conflicts are most likely to occur in response to a PUT request. For
 * example, if versioning were being used and the entity being PUT
 * included changes to a resource which conflict with those made by an
 * earlier (third-party) request, the server might use the 409 response
 * to indicate that it can't complete the request. In this case, the
 * response entity would likely contain a list of the differences
 * between the two versions in a format defined by the response
 * Content-Type.
 * </p>
 *
 * @see <a href="https://tools.ietf.org/html/rfc2616#section-10.4.10">https://tools.ietf.org/html/rfc2616#section-10.4.10</a>
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class ConflictException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.CONFLICT;

	public ConflictException() {
		this(null);
	}

	public ConflictException(Object data) {
		super(HTTP_STATUS, data);
	}
}