package restly.exceptions.clienterror;

import restly.*;

/**
 * 410 Gone
 * <p/>
 * <p>
 * The requested resource is no longer available at the server and no
 * forwarding address is known. This condition is expected to be
 * considered permanent. Clients with link editing capabilities SHOULD
 * delete references to the Request-URI after user approval. If the
 * server does not know, or has no facility to determine, whether or not
 * the condition is permanent, the status code 404 (Not Found) SHOULD be
 * used instead. This response is cacheable unless indicated otherwise.
 * </p>
 * <p>
 * The 410 response is primarily intended to assist the task of web
 * maintenance by notifying the recipient that the resource is
 * intentionally unavailable and that the server owners desire that
 * remote links to that resource be removed. Such an event is common for
 * limited-time, promotional services and for resources belonging to
 * individuals no longer working at the server&apos;s site. It is not
 * necessary to mark all permanently unavailable resources as &quot;gone&quot; or
 * to keep the mark for any length of time -- that is left to the
 * discretion of the server owner.
 * </p>
 *
 * @author <a href="http://restly.org/">Erik Beeson</a>
 */
public class GoneException extends HttpClientErrorException {
	public static final HttpStatus HTTP_STATUS = HttpStatus.GONE;

	public GoneException() {
		this(null);
	}

	public GoneException(Object data) {
		super(HTTP_STATUS, data);
	}
}