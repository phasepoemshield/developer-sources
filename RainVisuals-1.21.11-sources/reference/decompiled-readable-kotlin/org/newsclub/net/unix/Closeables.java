package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// $VF: Compiled from Closeables.java
public final class Closeables implements Closeable {
   private List<WeakReference<Closeable>> list;
   private boolean closed = false;

   public synchronized boolean isClosed() {
      return this.closed;
   }

   public synchronized boolean remove(Closeable closeable) {
      if (this.list != null && closeable != null && !this.closed) {
         Iterator<WeakReference<Closeable>> it = this.list.iterator();

         while (it.hasNext()) {
            if (closeable.equals(((WeakReference)it.next()).get())) {
               it.remove();
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public Closeables(Closeable... closeable) {
      this.list = new ArrayList<>();

      for (Closeable cl : closeable) {
         this.list.add(new Closeables.HardReference<>(cl));
      }
   }

   public Closeables() {
   }

   public synchronized boolean add(WeakReference<Closeable> closeable) {
      if (this.closed) {
         return false;
      }

      Closeable cl = closeable.get();
      if (cl == null) {
         return false;
      }

      if (this.list == null) {
         this.list = new ArrayList<>();
      } else {
         for (WeakReference<Closeable> ref : this.list) {
            if (cl.equals(ref.get())) {
               return false;
            }
         }
      }

      this.list.add(closeable);
      return true;
   }

   @Override
   public void close() throws IOException {
      this.close(null);
   }

   public synchronized boolean add(Closeable closeable) {
      return this.add(new Closeables.HardReference<>(closeable));
   }

   public void close(IOException superException) throws IOException {
      IOException exc = superException;
      ArrayList var10;
      synchronized (this) {
         this.closed = true;
         List<WeakReference<Closeable>> l = this.list;
         if (l == null) {
            return;
         }

         var10 = new ArrayList(l);
         this.list = null;
      }

      for (WeakReference<Closeable> ref : var10) {
         Closeable cl = (Closeable)ref.get();
         if (cl != null) {
            try {
               cl.close();
            } catch (IOException var8) {
               if (exc == null) {
                  exc = var8;
               } else {
                  exc.addSuppressed(var8);
               }
            }
         }
      }

      if (exc != null) {
         throw exc;
      }
   }

   // $VF: Compiled from Closeables.java
   private static final class HardReference<V> extends WeakReference<V> {
      private final V strongRef;

      @Override
      public V get() {
         return this.strongRef;
      }

      HardReference(V referent) {
         super(null);
         this.strongRef = referent;
      }
   }
}
