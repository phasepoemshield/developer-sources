/*
 * Decompiled with CFR 0.152.
 */
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
import jnr.ffi.util.ref.FinalizableReference;

public class FinalizableReferenceQueue {
    private static final String FINALIZER_CLASS_NAME = "jnr.ffi.util.ref.internal.Finalizer";
    private static final Logger logger = Logger.getLogger(FinalizableReferenceQueue.class.getName());
    final boolean threadStarted;
    final ReferenceQueue<Object> queue;
    private static final Method startFinalizer;
    private static final Map<FinalizableReferenceQueue, Boolean> finalizerQueues;

    public static void cleanUpAll() {
        try {
            Object[] objectArray = finalizerQueues.keySet().toArray();
            int n = objectArray.length;
            for (int i = 0; i < n; ++i) {
                Object frq = objectArray[i];
                ((FinalizableReferenceQueue)frq).cleanUp();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    static Method getStartFinalizer(Class<?> finalizer) {
        try {
            Class[] classArray = new Class[2];
            classArray[0] = Class.class;
            classArray[1] = Object.class;
            return finalizer.getMethod("startFinalizer", classArray);
        }
        catch (NoSuchMethodException e) {
            void var1_1;
            throw new AssertionError(var1_1);
        }
    }

    static {
        FinalizerLoader[] finalizerLoaderArray = new FinalizerLoader[3];
        finalizerLoaderArray[0] = new SystemLoader();
        finalizerLoaderArray[1] = new DecoupledLoader();
        finalizerLoaderArray[2] = new DirectLoader();
        Class<?> finalizer = FinalizableReferenceQueue.loadFinalizer(finalizerLoaderArray);
        startFinalizer = FinalizableReferenceQueue.getStartFinalizer(finalizer);
        finalizerQueues = Collections.synchronizedMap(new WeakHashMap());
    }

    void cleanUp() {
        if (!this.threadStarted) {
            this.pollReferenceQueue();
        }
    }

    private void pollReferenceQueue() {
        Reference<Object> reference;
        while ((reference = this.queue.poll()) != null) {
            reference.clear();
            try {
                ((FinalizableReference)((Object)reference)).finalizeReferent();
            }
            catch (Throwable t) {
                logger.log(Level.SEVERE, "Error cleaning up after reference.", t);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private static Class<?> loadFinalizer(FinalizerLoader ... loaders) {
        FinalizerLoader[] finalizerLoaderArray = loaders;
        int n = finalizerLoaderArray.length;
        for (int i = 0; i < n; ++i) {
            void var5_5;
            FinalizerLoader loader = finalizerLoaderArray[i];
            Class<?> finalizer = loader.loadFinalizer();
            if (finalizer == null) continue;
            return var5_5;
        }
        throw new AssertionError();
    }

    /*
     * WARNING - void declaration
     */
    public FinalizableReferenceQueue() {
        ReferenceQueue queue;
        boolean threadStarted = false;
        try {
            Object[] objectArray = new Object[2];
            objectArray[0] = FinalizableReference.class;
            objectArray[1] = this;
            queue = (ReferenceQueue)startFinalizer.invoke(null, objectArray);
            threadStarted = true;
        }
        catch (IllegalAccessException impossible) {
            void t;
            throw new AssertionError(t);
        }
        catch (Throwable t) {
            logger.log(Level.INFO, "Failed to start reference finalizer thread. Reference cleanup will only occur when new references are created.", t);
            queue = new ReferenceQueue();
        }
        this.queue = queue;
        this.threadStarted = threadStarted;
        finalizerQueues.put(this, Boolean.TRUE);
    }

    static interface FinalizerLoader {
        public Class<?> loadFinalizer();
    }

    static class DecoupledLoader
    implements FinalizerLoader {
        private static final String LOADING_ERROR = "Could not load Finalizer in its own class loader.Loading Finalizer in the current class loader instead. As a result, you will not be ableto garbage collect this class loader. To support reclaiming this class loader, eitherresolve the underlying issue, or move Google Collections to your system class path.";

        @Override
        public Class<?> loadFinalizer() {
            try {
                URLClassLoader finalizerLoader = this.newLoader(this.getBaseUrl());
                return finalizerLoader.loadClass(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            }
            catch (Exception e) {
                logger.log(Level.WARNING, LOADING_ERROR, e);
                return null;
            }
        }

        URLClassLoader newLoader(URL base) {
            URL[] uRLArray = new URL[1];
            uRLArray[0] = base;
            return new URLClassLoader(uRLArray);
        }

        /*
         * WARNING - void declaration
         */
        URL getBaseUrl() throws IOException {
            void var3_3;
            void var2_2;
            String finalizerPath = FinalizableReferenceQueue.FINALIZER_CLASS_NAME.replace('.', '/') + ".class";
            URL finalizerUrl = this.getClass().getClassLoader().getResource(finalizerPath);
            if (finalizerUrl == null) {
                throw new FileNotFoundException(finalizerPath);
            }
            String urlString = finalizerUrl.toString();
            if (!urlString.endsWith(finalizerPath)) {
                throw new IOException("Unsupported path style: " + urlString);
            }
            urlString = urlString.substring(0, urlString.length() - finalizerPath.length());
            return new URL((URL)var2_2, (String)var3_3);
        }

        DecoupledLoader() {
        }
    }

    static class DirectLoader
    implements FinalizerLoader {
        @Override
        public Class<?> loadFinalizer() {
            try {
                return Class.forName(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
            }
            catch (ClassNotFoundException e) {
                throw new AssertionError((Object)e);
            }
        }

        DirectLoader() {
        }
    }

    static class SystemLoader
    implements FinalizerLoader {
        @Override
        public Class<?> loadFinalizer() {
            ClassLoader systemLoader;
            try {
                systemLoader = ClassLoader.getSystemClassLoader();
            }
            catch (SecurityException e) {
                logger.info("Not allowed to access system class loader.");
                return null;
            }
            if (systemLoader != null) {
                try {
                    return systemLoader.loadClass(FinalizableReferenceQueue.FINALIZER_CLASS_NAME);
                }
                catch (ClassNotFoundException e) {
                    return null;
                }
            }
            return null;
        }

        SystemLoader() {
        }
    }
}

