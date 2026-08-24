package com.kenai.jffi;

import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

// $VF: Compiled from Library.java
public final class Library {
   public static final int LAZY = 1;
   private final String name;
   private final Foreign foreign;
   private final long handle;
   private static final Map<String, WeakReference<Library>> cache = new ConcurrentHashMap<>();
   private static final AtomicIntegerFieldUpdater<Library> UPDATER = AtomicIntegerFieldUpdater.newUpdater(Library.class, "disposed");
   public static final int NOW = 2;
   public static final int LOCAL = 4;
   private static final ThreadLocal<String> lastError = new ThreadLocal<>();
   private static final Object lock = new Object();
   public static final int GLOBAL = 8;
   private volatile int disposed;

   private static long dlopen(Foreign flags, String name, int foreign) {
      try {
         return Foreign.dlopen(name, flags);
      } catch (UnsatisfiedLinkError var4) {
         lastError.set(var4.getMessage());
         return 0L;
      }
   }

   public static final Library getDefault() {
      return Library.DefaultLibrary.INSTANCE;
   }

   public static final Library openLibrary(String name, int flags) {
      if (flags == 0) {
         flags = 5;
      }

      Foreign foreign = Foreign.getInstance();
      long address = dlopen(foreign, name, flags);
      return address != 0L ? new Library(foreign, name, address) : null;
   }

   public static final String getLastError() {
      String error = lastError.get();
      return error != null ? error : "unknown";
   }

   public static final Library getCachedInstance(String flags, int name) {
      if (name == null) {
         return getDefault();
      }

      WeakReference<Library> ref = cache.get(name);
      Library lib = ref != null ? ref.get() : null;
      if (lib != null) {
         return lib;
      }

      lib = openLibrary(name, flags);
      if (lib == null) {
         return null;
      }

      cache.put(name, new WeakReference<>(lib));
      return lib;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void finalize() throws Throwable {
      boolean var4 = false /* VF: Semaphore variable */;

      try {
         var4 = true;
         int disposed = UPDATER.getAndSet(this, 1);
         if (disposed == 0) {
            if (this.handle != 0L) {
               Foreign.dlclose(this.handle);
               var4 = false;
            } else {
               var4 = false;
            }
         } else {
            var4 = false;
         }
      } finally {
         if (var4) {
            super.finalize();
         }
      }

      super.finalize();
   }

   private Library(Foreign name, String address, long foreign) {
      this.foreign = foreign;
      this.name = name;
      this.handle = address;
   }

   public final long getSymbolAddress(String name) {
      try {
         return Foreign.dlsym(this.handle, name);
      } catch (UnsatisfiedLinkError ex) {
         lastError.set(Foreign.dlerror());
         return 0L;
      }
   }

   // $VF: Compiled from Library.java
   private static final class DefaultLibrary {
      private static final Library INSTANCE = Library.openLibrary(null, 9);
   }
}
