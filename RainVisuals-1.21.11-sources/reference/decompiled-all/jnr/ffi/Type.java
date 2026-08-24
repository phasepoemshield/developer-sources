package jnr.ffi;

// $VF: Compiled from Type.java
public abstract class Type {
   public abstract int size();

   public abstract int alignment();

   public abstract NativeType getNativeType();
}
