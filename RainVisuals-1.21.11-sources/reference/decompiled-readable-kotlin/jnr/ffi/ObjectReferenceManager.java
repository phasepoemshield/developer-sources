package jnr.ffi;

// $VF: Compiled from ObjectReferenceManager.java
public abstract class ObjectReferenceManager<T> {
   @Deprecated
   public void freeReference(Pointer reference) {
      this.remove(reference);
   }

   public static <T> ObjectReferenceManager<T> newInstance(Runtime runtime) {
      return runtime.newObjectReferenceManager();
   }

   @Deprecated
   public T getObject(Pointer reference) {
      return this.get(reference);
   }

   @Deprecated
   public Pointer newReference(T object) {
      return this.add(object);
   }

   public abstract Pointer add(T var1);

   public abstract T get(Pointer var1);

   public abstract boolean remove(Pointer var1);
}
