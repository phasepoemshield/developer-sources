package com.kenai.jffi;

// $VF: Compiled from PageManager.java
public abstract class PageManager {
   private final Foreign foreign = Foreign.getInstance();
   public static final int PROT_EXEC = 4;
   public static final int PROT_WRITE = 2;
   private int pageSize;
   public static final int PROT_READ = 1;

   public final long pageSize() {
      return this.pageSize != 0 ? this.pageSize : this.calculatePageSize();
   }

   public abstract void freePages(long var1, int var3);

   private long calculatePageSize() {
      long pgSize = Foreign.pageSize();
      return pgSize < 2147483647L ? (this.pageSize = (int)pgSize) : pgSize;
   }

   public abstract long allocatePages(int var1, int var2);

   public abstract void protectPages(long var1, int var3, int var4);

   public static PageManager getInstance() {
      return PageManager.SingletonHolder.INSTANCE;
   }

   // $VF: Compiled from PageManager.java
   private static final class SingletonHolder {
      public static final PageManager INSTANCE = Platform.getPlatform().getOS() == Platform.OS.WINDOWS ? new PageManager.Windows() : new PageManager.Unix();
   }

   // $VF: Compiled from PageManager.java
   static final class Unix extends PageManager {
      @Override
      public void protectPages(long address, int protection, int npages) {
         Foreign.mprotect(address, npages * this.pageSize(), protection);
      }

      @Override
      public void freePages(long address, int npages) {
         Foreign.munmap(address, npages * this.pageSize());
      }

      @Override
      public long allocatePages(int npages, int protection) {
         long sz = npages * this.pageSize();
         long memory = Foreign.mmap(0L, sz, protection, 258, -1, 0L);
         return memory != -1L ? memory : 0L;
      }
   }

   // $VF: Compiled from PageManager.java
   static final class Windows extends PageManager {
      @Override
      public void freePages(long address, int pageCount) {
         Foreign.VirtualFree(address, 0, 32768);
      }

      @Override
      public long allocatePages(int pageCount, int protection) {
         return Foreign.VirtualAlloc(0L, (int)this.pageSize() * pageCount, 12288, w32prot(protection));
      }

      private static int w32prot(int p) {
         int w32 = 1;
         if ((p & 3) == 3) {
            w32 = 4;
         } else if ((p & 1) == 1) {
            w32 = 2;
         }

         if ((p & 4) == 4) {
            w32 <<= 4;
         }

         return w32;
      }

      @Override
      public void protectPages(long protection, int pageCount, int address) {
         Foreign.VirtualProtect(address, (int)this.pageSize() * pageCount, w32prot(protection));
      }

      public Windows() {
      }
   }
}
