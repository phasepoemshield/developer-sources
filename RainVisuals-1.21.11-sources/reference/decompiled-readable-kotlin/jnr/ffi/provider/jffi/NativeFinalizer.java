package jnr.ffi.provider.jffi;

import jnr.ffi.util.ref.FinalizableReferenceQueue;

// $VF: Compiled from NativeFinalizer.java
class NativeFinalizer {
   private final FinalizableReferenceQueue finalizerQueue = new FinalizableReferenceQueue();

   public static NativeFinalizer getInstance() {
      return NativeFinalizer.SingletonHolder.INSTANCE;
   }

   public FinalizableReferenceQueue getFinalizerQueue() {
      return this.finalizerQueue;
   }

   // $VF: Compiled from NativeFinalizer.java
   private static final class SingletonHolder {
      private static final NativeFinalizer INSTANCE = new NativeFinalizer();
   }
}
