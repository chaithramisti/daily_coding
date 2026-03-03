package concepts;

/**
 *  volatile is a field modifier that ensures visibility of variable
 *     update across mutiple thread
 *     Thread safe means the method or instance can be used by multiple threads
 *     at the same time
 *     Without volatile, threads could see a partially constructed
 *     object due to JVM optimizations.here only in the first check of instance == null,
 *     we are checking if the instance is null or not,
 *      if it is null then only we will enter the synchronized block
 *      and create the instance. This way we are ensuring that only
 *      one thread can create the instance and other threads will
 *      wait until the instance is created. Once the instance is created,
 *       all threads will see the updated value of instance variable due
 *       to volatile keyword.
 *     https://www.geeksforgeeks.org/java/volatile-keyword-in-java/
 *
 */
public class ThreadSafeSingleton {
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
        // private constructor to prevent instantiation
    }

    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
