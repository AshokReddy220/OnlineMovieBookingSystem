import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

public class MySessionListener implements HttpSessionListener {
	private static int sessionCount = 0;

	public void sessionCreated(HttpSessionEvent se) {
		sessionCount++;
		// Write to a log or do some other processing.
		System.out.println("Session has been created");
		System.out.println("Current Session count is" + sessionCount);

	}

	public void sessionDestroyed(HttpSessionEvent se) {
		if (sessionCount > 0)
			sessionCount--;
		// Write to a log or do some other processing.
		System.out.println("Session has been destroyed");
		System.out.println("Current Session count is" + sessionCount);

	}
}
