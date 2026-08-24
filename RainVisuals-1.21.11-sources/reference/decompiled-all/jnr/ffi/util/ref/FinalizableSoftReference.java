package jnr.ffi.util.ref;

import java.lang.ref.SoftReference;

// $VF: Compiled from FinalizableSoftReference.java
public abstract class FinalizableSoftReference<T> extends SoftReference<T> implements FinalizableReference {
   protected FinalizableSoftReference(T queue, FinalizableReferenceQueue referent) {
      super(referent, queue.queue);
      queue.cleanUp();
   }
}
