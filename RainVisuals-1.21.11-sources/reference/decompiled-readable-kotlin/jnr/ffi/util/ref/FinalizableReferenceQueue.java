package jnr.ffi.util.ref;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

// $VF: Compiled from FinalizableReferenceQueue.java
public class FinalizableReferenceQueue {
   private static final String FINALIZER_CLASS_NAME = "jnr.ffi.util.ref.internal.Finalizer";
   private static final Logger logger = Logger.getLogger(FinalizableReferenceQueue.class.getName());
   final boolean threadStarted;
   final ReferenceQueue<Object> queue;
   private static final Method startFinalizer;
   private static final Map<FinalizableReferenceQueue, Boolean> finalizerQueues = Collections.synchronizedMap(new WeakHashMap<>());

   public static void cleanUpAll() {
      try {
         for (Object frq : finalizerQueues.keySet().toArray()) {
            ((FinalizableReferenceQueue)frq).cleanUp();
         }
      } catch (Throwable var4) {
      }
   }

   static Method getStartFinalizer(Class<?> finalizer) {
      try {
         return finalizer.getMethod("startFinalizer", Class.class, Object.class);
      } catch (NoSuchMethodException var2) {
         throw new AssertionError(var2);
      }
   }

   static {
      Class<?> finalizer = loadFinalizer(
         new FinalizableReferenceQueue.SystemLoader(), new FinalizableReferenceQueue.DecoupledLoader(), new FinalizableReferenceQueue.DirectLoader()
      );
      startFinalizer = getStartFinalizer(finalizer);
   }

   void cleanUp() {
      if (!this.threadStarted) {
         this.pollReferenceQueue();
      }
   }

   private void pollReferenceQueue() {
      Reference<?> reference;
      while ((reference = this.queue.poll()) != null) {
         reference.clear();

         try {
            ((FinalizableReference)reference).finalizeReferent();
         } catch (Throwable t) {
            logger.log(Level.SEVERE, "Error cleaning up after reference.", t);
         }
      }
   }

   private static Class<?> loadFinalizer(FinalizableReferenceQueue.FinalizerLoader... loaders) {
      for (FinalizableReferenceQueue.FinalizerLoader loader : loaders) {
         Class<?> finalizer = loader.loadFinalizer();
         if (finalizer != null) {
            return finalizer;
         }
      }

      throw new AssertionError();
   }

   public FinalizableReferenceQueue() {
      boolean threadStarted = false;

      ReferenceQueue queue;
      try {
         queue = (ReferenceQueue)startFinalizer.invoke(null, FinalizableReference.class, this);
         threadStarted = true;
      } catch (IllegalAccessException var4) {
         throw new AssertionError(var4);
      } catch (Throwable var5) {
         logger.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", var5);
         queue = new ReferenceQueue();
      }

      this.queue = queue;
      this.threadStarted = threadStarted;
      finalizerQueues.put(this, Boolean.TRUE);
   }

   // $VF: Compiled from FinalizableReferenceQueue.java
   static class DecoupledLoader implements FinalizableReferenceQueue.FinalizerLoader {
      private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

      @Override
      public Class<?> loadFinalizer() {
         try {
            ClassLoader finalizerLoader = this.newLoader(this.getBaseUrl());
            return finalizerLoader.loadClass("jnr.ffi.util.ref.internal.Finalizer");
         } catch (Exception e) {
            FinalizableReferenceQueue.logger
               .log(
                  Level.WARNING,
                  "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.",
                  e
               );
            return null;
         }
      }

      URLClassLoader newLoader(URL base) {
         return new URLClassLoader(new URL[]{base});
      }

      URL getBaseUrl() throws IOException {
         String finalizerPath = "jnr.ffi.util.ref.internal.Finalizer".replace('.', '/') + ".class";
         URL finalizerUrl = this.getClass().getClassLoader().getResource(finalizerPath);
         if (finalizerUrl == null) {
            throw new FileNotFoundException(finalizerPath);
         }

         String urlString = finalizerUrl.toString();
         if (!urlString.endsWith(finalizerPath)) {
            throw new IOException("Unsupported path style: " + urlString);
         }

         urlString = urlString.substring(0, urlString.length() - finalizerPath.length());
         return new URL(finalizerUrl, urlString);
      }
   }

   // $VF: Compiled from FinalizableReferenceQueue.java
   static class DirectLoader implements FinalizableReferenceQueue.FinalizerLoader {
      @Override
      public Class<?> loadFinalizer() {
         try {
            return Class.forName("jnr.ffi.util.ref.internal.Finalizer");
         } catch (ClassNotFoundException e) {
            throw new AssertionError(e);
         }
      }
   }

   // $VF: Compiled from FinalizableReferenceQueue.java
   interface FinalizerLoader {
      Class<?> loadFinalizer();
   }

   // $VF: Compiled from FinalizableReferenceQueue.java
   static class SystemLoader implements FinalizableReferenceQueue.FinalizerLoader {
      @Override
      public Class<?> loadFinalizer() {
         ClassLoader systemLoader;
         try {
            systemLoader = ClassLoader.getSystemClassLoader();
         } catch (SecurityException e) {
            FinalizableReferenceQueue.logger.info("Not allowed to access system class loader.");
            return null;
         }

         if (systemLoader != null) {
            try {
               return systemLoader.loadClass("jnr.ffi.util.ref.internal.Finalizer");
            } catch (ClassNotFoundException var3) {
               return null;
            }
         } else {
            return null;
         }
      }
   }
}
