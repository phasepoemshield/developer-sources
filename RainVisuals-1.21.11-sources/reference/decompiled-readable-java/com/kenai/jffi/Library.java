/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class Library {
    public static final int LAZY = 1;
    private final String name;
    private final Foreign foreign;
    private final long handle;
    private static final Map<String, WeakReference<Library>> cache = new ConcurrentHashMap<String, WeakReference<Library>>();
    private static final AtomicIntegerFieldUpdater<Library> UPDATER;
    public static final int NOW = 2;
    public static final int LOCAL = 4;
    private static final ThreadLocal<String> lastError;
    private static final Object lock;
    public static final int GLOBAL = 8;
    private volatile int disposed;

    private static long dlopen(Foreign foreign, String name, int flags) {
        try {
            return Foreign.dlopen(name, flags);
        }
        catch (UnsatisfiedLinkError ex) {
            lastError.set(ex.getMessage());
            return 0L;
        }
    }

    public static final Library getDefault() {
        return DefaultLibrary.INSTANCE;
    }

    public static final Library openLibrary(String name, int flags) {
        if (flags == 0) {
            flags = 5;
        }
        Foreign foreign = Foreign.getInstance();
        long address = Library.dlopen(foreign, name, flags);
        return address != 0L ? new Library(foreign, name, address) : null;
    }

    public static final String getLastError() {
        String error = lastError.get();
        return error != null ? error : "unknown";
    }

    /*
     * WARNING - void declaration
     */
    public static final Library getCachedInstance(String name, int flags) {
        void var3_3;
        if (name == null) {
            return Library.getDefault();
        }
        WeakReference<Library> ref = cache.get(name);
        Library lib = ref != null ? (Library)ref.get() : null;
        if (lib != null) {
            return lib;
        }
        lib = Library.openLibrary(name, flags);
        if (lib == null) {
            return null;
        }
        cache.put(name, new WeakReference<Library>(lib));
        return var3_3;
    }

    protected void finalize() throws Throwable {
        try {
            int disposed = UPDATER.getAndSet(this, 1);
            if (disposed == 0) {
                if (this.handle != 0L) {
                    Foreign.dlclose(this.handle);
                }
            }
        }
        finally {
            super.finalize();
        }
    }

    static {
        lock = new Object();
        lastError = new ThreadLocal();
        UPDATER = AtomicIntegerFieldUpdater.newUpdater(Library.class, "disposed");
    }

    private Library(Foreign foreign, String name, long address) {
        this.foreign = foreign;
        this.name = name;
        this.handle = address;
    }

    public final long getSymbolAddress(String name) {
        try {
            return Foreign.dlsym(this.handle, name);
        }
        catch (UnsatisfiedLinkError ex) {
            Library library = this;
            lastError.set(library.foreign.dlerror());
            return 0L;
        }
    }

    private static final class DefaultLibrary {
        private static final Library INSTANCE = Library.openLibrary(null, 9);

        private DefaultLibrary() {
        }
    }
}

