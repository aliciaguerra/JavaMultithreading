public void start()
Starts the thread in a seperate path of execution, then invokes the thread method on this object.

public void run()
If this thread object was instantiated using a separate Runnable target, the run() method is invoked on that Runnable object.

public final void setName(String name)
Changing the name of the thread object. There is also a getName method for retrieving the name.

public final void setPriority(int priority)
Sets the priority of this thread object. The possible values are between 1 and 10.

public final void setDaemon(boolean on)
A parameter of true denotes this thread as a daemon thread.

public final void join(long millisec)
This current thread invokes this method on a second thread, causing the current thread to block until the second thread 
terminates or the specified number of milliseconds passes.

public void interrupt()
Interrupts this thread, causing it to continue execution if it was blocked for any reason.

public final boolean isAlive()
Returns true if the thread is alive, which is any time after the thread has started but before it runs to completion.



