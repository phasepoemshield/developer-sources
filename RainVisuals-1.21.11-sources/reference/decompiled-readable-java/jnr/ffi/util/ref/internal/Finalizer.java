/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.util.ref.internal;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Finalizer
implements Runnable {
    private final PhantomReference<Object> frqReference;
    private static final Logger logger = Logger.getLogger(Finalizer.class.getName());
    private final ReferenceQueue<Object> queue = new ReferenceQueue();
    private static final Field inheritableThreadLocals;
    private Thread thread;
    private final WeakReference<Class<?>> finalizableReferenceClassReference;
    private static final String FINALIZABLE_REFERENCE = "jnr.ffi.util.ref.FinalizableReference";
    private static final Constructor<Thread> inheritableThreadlocalsConstructor;

    /*
     * WARNING - void declaration
     */
    private boolean cleanUp(Reference<?> reference) {
        Reference<Object> reference2;
        Method finalizeReferentMethod = this.getFinalizeReferentMethod();
        if (finalizeReferentMethod == null) {
            return false;
        }
        do {
            reference.clear();
            if (reference == this.frqReference) {
                return false;
            }
            try {
                finalizeReferentMethod.invoke(reference, new Object[0]);
            }
            catch (Throwable t) {
                void var3_3;
                logger.log(Level.SEVERE, "Error cleaning up after reference.", (Throwable)var3_3);
            }
        } while ((reference2 = this.queue.poll()) != null);
        return true;
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (this.cleanUp(this.queue.remove())) {
                }
            }
            catch (InterruptedException interruptedException) {
                continue;
            }
            break;
        }
    }

    static {
        Constructor<Thread> itlc = null;
        try {
            itlc = Finalizer.getInheritableThreadLocalsConstructor();
        }
        catch (Throwable itl) {
        }
        Field itl = null;
        if (itlc == null) {
            try {
                itl = Finalizer.getInheritableThreadLocalsField();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        inheritableThreadLocals = itl;
        inheritableThreadlocalsConstructor = itlc;
        if (itl == null && itlc == null) {
            logger.log(Level.INFO, "Couldn't access Thread.inheritableThreadLocals or appropriate constructor. Reference finalizer threads will inherit thread local values.");
        }
    }

    private Method getFinalizeReferentMethod() {
        Class finalizableReferenceClass = (Class)this.finalizableReferenceClassReference.get();
        if (finalizableReferenceClass == null) {
            return null;
        }
        try {
            return finalizableReferenceClass.getMethod("finalizeReferent", new Class[0]);
        }
        catch (NoSuchMethodException e) {
            throw new AssertionError((Object)e);
        }
    }

    /*
     * WARNING - void declaration
     */
    public void start() {
        if (inheritableThreadlocalsConstructor != null) {
            try {
                Object[] objectArray = new Object[5];
                objectArray[0] = Thread.currentThread().getThreadGroup();
                objectArray[1] = this;
                objectArray[2] = Finalizer.class.getName();
                objectArray[3] = 0;
                objectArray[4] = false;
                this.thread = inheritableThreadlocalsConstructor.newInstance(objectArray);
            }
            catch (Throwable t) {
                logger.log(Level.INFO, "Failed to disable thread local values inherited by reference finalizer thread.", t);
            }
        }
        if (this.thread == null) {
            this.thread = new Thread((Runnable)this, Finalizer.class.getName());
            if (inheritableThreadLocals != null) {
                try {
                    inheritableThreadLocals.set(this.thread, null);
                }
                catch (Throwable t) {
                    void var1_2;
                    logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", (Throwable)var1_2);
                }
            }
        }
        this.thread.setDaemon(true);
        this.thread.setPriority(10);
        this.thread.setContextClassLoader(null);
        this.thread.start();
    }

    public static ReferenceQueue<Object> startFinalizer(Class<?> finalizableReferenceClass, Object frq) {
        if (!finalizableReferenceClass.getName().equals(FINALIZABLE_REFERENCE)) {
            throw new IllegalArgumentException("Expected jnr.ffi.util.ref.FinalizableReference.");
        }
        Finalizer finalizer = new Finalizer(finalizableReferenceClass, frq);
        finalizer.start();
        return finalizer.queue;
    }

    public static Constructor<Thread> getInheritableThreadLocalsConstructor() {
        try {
            Class[] classArray = new Class[5];
            classArray[0] = ThreadGroup.class;
            classArray[1] = Runnable.class;
            classArray[2] = String.class;
            classArray[3] = Long.TYPE;
            classArray[4] = Boolean.TYPE;
            return Thread.class.getConstructor(classArray);
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Field getInheritableThreadLocalsField() {
        try {
            void t;
            Field inheritableThreadLocals = Thread.class.getDeclaredField("inheritableThreadLocals");
            inheritableThreadLocals.setAccessible(true);
            return t;
        }
        catch (Throwable t) {
            return null;
        }
    }

    private Finalizer(Class<?> finalizableReferenceClass, Object frq) {
        this.finalizableReferenceClassReference = new WeakReference(finalizableReferenceClass);
        this.frqReference = new PhantomReference<Object>(frq, this.queue);
    }
}

