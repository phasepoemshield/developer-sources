package jnr.ffi.provider;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import jnr.ffi.ObjectReferenceManager;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from DefaultObjectReferenceManager.java
public final class DefaultObjectReferenceManager extends ObjectReferenceManager {
   private final ConcurrentMap<Long, DefaultObjectReferenceManager.ObjectReference> references = new ConcurrentHashMap<>();
   private final Runtime runtime;

   @Override
   public boolean remove(Pointer reference) {
      DefaultObjectReferenceManager.ObjectReference entry = this.references.remove(reference.address());
      return entry != null;
   }

   public DefaultObjectReferenceManager(Runtime runtime) {
      this.runtime = runtime;
   }

   private long id(Object obj) {
      return (-3819410108757049344L | System.identityHashCode(obj) & 4294967295L) & this.runtime.addressMask();
   }

   @Override
   public Pointer add(Object obj) {
      if (obj == null) {
         throw new IllegalArgumentException("reference to null value not allowed");
      }

      long nextId = this.id(obj);

      DefaultObjectReferenceManager.ObjectReference ptr;
      while (this.references.putIfAbsent(nextId, ptr = new DefaultObjectReferenceManager.ObjectReference(this.runtime, nextId, obj)) != null) {
         nextId++;
      }

      return ptr;
   }

   @Override
   public Object get(Pointer reference) {
      DefaultObjectReferenceManager.ObjectReference ptr = this.references.get(reference.address());
      return ptr != null ? ptr.referent : null;
   }

   // $VF: Compiled from DefaultObjectReferenceManager.java
   private static final class ObjectReference extends InAccessibleMemoryIO {
      private final Object referent;

      @Override
      public long size() {
         return 0L;
      }

      public ObjectReference(Runtime referent, long address, Object runtime) {
         super(runtime, address, true);
         this.referent = referent;
      }

      @Override
      public int hashCode() {
         return (int)this.address();
      }

      @Override
      public boolean equals(Object obj) {
         return obj instanceof Pointer && ((Pointer)obj).address() == this.address();
      }
   }
}
