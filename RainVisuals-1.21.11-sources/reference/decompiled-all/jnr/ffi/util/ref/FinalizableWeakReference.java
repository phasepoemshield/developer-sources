package jnr.ffi.util.ref;

import java.lang.ref.WeakReference;

// $VF: Compiled from FinalizableWeakReference.java
public abstract class FinalizableWeakReference<T> extends WeakReference<T> implements FinalizableReference {
   protected FinalizableWeakReference(T referent, FinalizableReferenceQueue queue) {
      super(referent, queue.queue);
      queue.cleanUp();
   }
}
