/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class Init {
    private static volatile boolean loaded = false;
    static final String stubLoaderClassName = Init.class.getPackage().getName() + ".internal.StubLoader";

    private Init() {
    }

    private static UnsatisfiedLinkError newLoadError(Throwable cause) {
        UnsatisfiedLinkError error = new UnsatisfiedLinkError(cause.getLocalizedMessage());
        error.initCause(cause);
        return error;
    }

    /*
     * WARNING - void declaration
     */
    static void load() {
        if (loaded) {
            return;
        }
        ArrayList<ReflectiveOperationException> failureCauses = new ArrayList<ReflectiveOperationException>();
        List<ClassLoader> loaders = Init.getClassLoaders();
        Iterator<ClassLoader> iterator2 = loaders.iterator();
        while (iterator2.hasNext()) {
            ClassLoader cl = iterator2.next();
            try {
                Class<?> c = Class.forName(stubLoaderClassName, true, cl);
                Method throwable = c.getDeclaredMethod("isLoaded", new Class[0]);
                if (loaded |= ((Boolean)Boolean.class.cast(throwable.invoke(c, new Object[0]))).booleanValue()) continue;
                Method getFailureCause = c.getDeclaredMethod("getFailureCause", new Class[0]);
                throw (Throwable)Throwable.class.cast(getFailureCause.invoke(c, new Object[0]));
            }
            catch (IllegalAccessException ex) {
                failureCauses.add(ex);
            }
            catch (InvocationTargetException ex) {
                failureCauses.add(ex);
            }
            catch (ClassNotFoundException ex) {
                failureCauses.add(ex);
            }
            catch (Throwable throwable) {
                void var4_8;
                if (throwable instanceof UnsatisfiedLinkError) {
                    throw (UnsatisfiedLinkError)throwable;
                }
                throw Init.newLoadError((Throwable)var4_8);
            }
        }
        if (!loaded && !failureCauses.isEmpty()) {
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            for (Throwable throwable : failureCauses) {
                throwable.printStackTrace(pw);
            }
            throw new UnsatisfiedLinkError(((StringWriter)((Object)iterator2)).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    private static List<ClassLoader> getClassLoaders() {
        void var0;
        ArrayList<ClassLoader> loaders = new ArrayList<ClassLoader>();
        try {
            loaders.add(ClassLoader.getSystemClassLoader());
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        try {
            loaders.add(Thread.currentThread().getContextClassLoader());
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        loaders.add(Init.class.getClassLoader());
        int nullCount = 0;
        Iterator it = loaders.iterator();
        while (it.hasNext()) {
            if (it.next() != null) continue;
            if (++nullCount <= 1) continue;
            it.remove();
        }
        return Collections.unmodifiableList(var0);
    }
}

