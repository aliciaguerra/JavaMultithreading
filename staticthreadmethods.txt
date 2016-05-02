Invoking one of the static methods performs the operation on the currently running thread.

public static void yield()
Causes the currently running thread to yield to any other threads of the same priority that are waiting
to be scheduled.

public void sleep(long millisec)
Causes the currently running thread to block for at least the specified number of milliseconds.

public static boolean holdsLock(Object x)
Returns true if the current thread holds lock on the given object.

public static Thread currentThread()
Returns a reference to the currently running thread, which is the thread that invokes the method.

public static void dumpStack()
Prints the stack trace for the currently running thread, which is useful for debugging a multithreaded application.
