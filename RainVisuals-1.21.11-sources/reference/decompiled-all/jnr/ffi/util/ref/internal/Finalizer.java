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

// $VF: Compiled from Finalizer.java
public class Finalizer implements Runnable {
   private final PhantomReference<Object> frqReference;
   private static final Logger logger = Logger.getLogger(Finalizer.class.getName());
   private final ReferenceQueue<Object> queue = new ReferenceQueue<>();
   private static final Field inheritableThreadLocals;
   private Thread thread;
   private final WeakReference<Class<?>> finalizableReferenceClassReference;
   private static final String FINALIZABLE_REFERENCE = "jnr.ffi.util.ref.FinalizableReference";
   private static final Constructor<Thread> inheritableThreadlocalsConstructor;

   private boolean cleanUp(Reference<?> reference) {
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
            finalizeReferentMethod.invoke(reference);
         } catch (Throwable var4) {
            logger.log(Level.SEVERE, "Error cleaning up after reference.", var4);
         }
      } while ((reference = this.queue.poll()) != null);

      return true;
   }

   @Override
   public void run() {
      while (true) {
         try {
            if (!this.cleanUp(this.queue.remove())) {
               return;
            }
         } catch (InterruptedException var2) {
         }
      }
   }

   static {
      Constructor<Thread> itlc = null;

      try {
         itlc = getInheritableThreadLocalsConstructor();
      } catch (Throwable var4) {
      }

      Field itl = null;
      if (itlc == null) {
         try {
            itl = getInheritableThreadLocalsField();
         } catch (Throwable var3) {
         }
      }

      inheritableThreadLocals = itl;
      inheritableThreadlocalsConstructor = itlc;
      if (itl == null && itlc == null) {
         logger.log(
            Level.INFO,
            "Couldn't access Thread.inheritableThreadLocals or appropriate constructor. Reference finalizer threads will inherit thread local values."
         );
      }
   }

   private Method getFinalizeReferentMethod() {
      Class<?> finalizableReferenceClass = this.finalizableReferenceClassReference.get();
      if (finalizableReferenceClass == null) {
         return null;
      }

      try {
         return finalizableReferenceClass.getMethod("finalizeReferent");
      } catch (NoSuchMethodException var3) {
         throw new AssertionError(var3);
      }
   }

   public void start() {
      if (inheritableThreadlocalsConstructor != null) {
         try {
            this.thread = inheritableThreadlocalsConstructor.newInstance(Thread.currentThread().getThreadGroup(), this, Finalizer.class.getName(), 0, false);
         } catch (Throwable var3) {
            logger.log(Level.INFO, "Failed to disable thread local values inherited by reference finalizer thread.", var3);
         }
      }

      if (this.thread == null) {
         this.thread = new Thread(this, Finalizer.class.getName());
         if (inheritableThreadLocals != null) {
            try {
               inheritableThreadLocals.set(this.thread, null);
            } catch (Throwable var2) {
               logger.log(Level.INFO, "Failed to clear thread local values inherited by reference finalizer thread.", var2);
            }
         }
      }

      this.thread.setDaemon(true);
      this.thread.setPriority(10);
      this.thread.setContextClassLoader(null);
      this.thread.start();
   }

   public static ReferenceQueue<Object> startFinalizer(Class<?> finalizableReferenceClass, Object frq) {
      if (!finalizableReferenceClass.getName().equals("jnr.ffi.util.ref.FinalizableReference")) {
         throw new IllegalArgumentException("Expected jnr.ffi.util.ref.FinalizableReference.");
      }

      Finalizer finalizer = new Finalizer(finalizableReferenceClass, frq);
      finalizer.start();
      return finalizer.queue;
   }

   public static Constructor<Thread> getInheritableThreadLocalsConstructor() {
      try {
         return Thread.class.getConstructor(ThreadGroup.class, Runnable.class, String.class, long.class, boolean.class);
      } catch (Throwable var1) {
         return null;
      }
   }

   public static Field getInheritableThreadLocalsField() {
      try {
         Field inheritableThreadLocals = Thread.class.getDeclaredField("inheritableThreadLocals");
         inheritableThreadLocals.setAccessible(true);
         return inheritableThreadLocals;
      } catch (Throwable var1) {
         return null;
      }
   }

   private Finalizer(Class<?> finalizableReferenceClass, Object frq) {
      this.finalizableReferenceClassReference = new WeakReference<>(finalizableReferenceClass);
      this.frqReference = new PhantomReference<>(frq, this.queue);
   }
}
