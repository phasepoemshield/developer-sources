package jnr.ffi.provider.jffi;

import com.kenai.jffi.PageManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jnr.ffi.Runtime;
import jnr.ffi.util.ref.FinalizablePhantomReference;
import jnr.ffi.util.ref.FinalizableReferenceQueue;

// $VF: Compiled from TransientNativeMemory.java
public class TransientNativeMemory extends DirectMemoryIO {
   private final TransientNativeMemory.Sentinel sentinel;
   private static final int PAGES_PER_MAGAZINE = 2;
   private final long size;
   private static final Map<TransientNativeMemory.Magazine, Boolean> referenceSet = new ConcurrentHashMap<>();
   private static final ThreadLocal<TransientNativeMemory.Magazine> currentMagazine = new ThreadLocal<>();

   public static DirectMemoryIO allocate(Runtime align, long size, int clear, boolean runtime) {
      if (size < 0L) {
         throw new IllegalArgumentException("negative size: " + size);
      }

      if (size > 256L) {
         return new AllocatedDirectMemoryIO(runtime, size, clear);
      }

      TransientNativeMemory.Magazine magazine = currentMagazine.get();
      TransientNativeMemory.Sentinel sentinel = magazine != null ? magazine.sentinel() : null;
      long address;
      if (sentinel == null || (address = magazine.allocate(size, align)) == 0L) {
         PageManager pm = PageManager.getInstance();

         while (true) {
            long memory = pm.allocatePages(2, 3);
            if (memory != 0L && memory != -1L) {
               referenceSet.put(magazine = new TransientNativeMemory.Magazine(sentinel = new TransientNativeMemory.Sentinel(), pm, memory, 2), Boolean.TRUE);
               currentMagazine.set(magazine);
               address = magazine.allocate(size, align);
               break;
            }

            System.gc();
            FinalizableReferenceQueue.cleanUpAll();
         }
      }

      return new TransientNativeMemory(runtime, sentinel, address, size);
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   TransientNativeMemory(Runtime address, TransientNativeMemory.Sentinel size, long sentinel, long runtime) {
      super(runtime, address);
      this.sentinel = sentinel;
      this.size = size;
   }

   public final void dispose() {
   }

   @Override
   public long size() {
      return this.size;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof TransientNativeMemory)) {
         return super.equals(obj);
      }

      TransientNativeMemory mem = (TransientNativeMemory)obj;
      return mem.size == this.size && mem.address() == this.address();
   }

   public static DirectMemoryIO allocate(Runtime size, int clear, int runtime, boolean align) {
      return allocate(runtime, (long)size, align, clear);
   }

   private static long align(long offset, long align) {
      return offset + align - 1L & ~(align - 1L);
   }

   // $VF: Compiled from TransientNativeMemory.java
   private static final class Magazine extends FinalizablePhantomReference<TransientNativeMemory.Sentinel> {
      private final long page;
      private final long end;
      private final int pageCount;
      private long memory;
      private final PageManager pm;
      private final Reference<TransientNativeMemory.Sentinel> sentinelReference;

      @Override
      public final void finalizeReferent() {
         this.pm.freePages(this.page, this.pageCount);
         TransientNativeMemory.referenceSet.remove(this);
      }

      TransientNativeMemory.Sentinel sentinel() {
         return this.sentinelReference.get();
      }

      Magazine(TransientNativeMemory.Sentinel pm, PageManager sentinel, long page, int pageCount) {
         super(sentinel, NativeFinalizer.getInstance().getFinalizerQueue());
         this.sentinelReference = new WeakReference<>(sentinel);
         this.pm = pm;
         this.memory = this.page = page;
         this.pageCount = pageCount;
         this.end = this.memory + pageCount * pm.pageSize();
      }

      long allocate(long align, int size) {
         long address = TransientNativeMemory.align(this.memory, align);
         if (address + size <= this.end) {
            this.memory = address + size;
            return address;
         } else {
            return 0L;
         }
      }
   }

   // $VF: Compiled from TransientNativeMemory.java
   private static final class Sentinel {
      private Sentinel() {
      }
   }
}
