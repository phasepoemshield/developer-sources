package jnr.ffi.util.ref;

import java.lang.ref.PhantomReference;

// $VF: Compiled from FinalizablePhantomReference.java
public abstract class FinalizablePhantomReference<T> extends PhantomReference<T> implements FinalizableReference {
   protected FinalizablePhantomReference(T queue, FinalizableReferenceQueue referent) {
      super(referent, queue.queue);
      queue.cleanUp();
   }
}
