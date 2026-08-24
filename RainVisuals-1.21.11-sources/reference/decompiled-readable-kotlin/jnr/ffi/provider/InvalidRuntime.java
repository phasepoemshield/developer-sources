package jnr.ffi.provider;

import java.nio.ByteOrder;
import jnr.ffi.NativeType;
import jnr.ffi.ObjectReferenceManager;
import jnr.ffi.Runtime;
import jnr.ffi.Type;
import jnr.ffi.TypeAlias;

// $VF: Compiled from InvalidRuntime.java
class InvalidRuntime extends Runtime {
   private final String message;
   private final Throwable cause;

   @Override
   public void setLastError(int error) {
      throw this.newLoadError();
   }

   InvalidRuntime(String message, Throwable cause) {
      this.message = message;
      this.cause = cause;
   }

   @Override
   public int getLastError() {
      throw this.newLoadError();
   }

   @Override
   public ByteOrder byteOrder() {
      throw this.newLoadError();
   }

   @Override
   public int addressSize() {
      throw this.newLoadError();
   }

   @Override
   public ClosureManager getClosureManager() {
      throw this.newLoadError();
   }

   @Override
   public int longSize() {
      throw this.newLoadError();
   }

   @Override
   public boolean isCompatible(Runtime other) {
      throw this.newLoadError();
   }

   @Override
   public Type findType(TypeAlias type) {
      throw this.newLoadError();
   }

   @Override
   public Type findType(NativeType type) {
      throw this.newLoadError();
   }

   @Override
   public ObjectReferenceManager newObjectReferenceManager() {
      throw this.newLoadError();
   }

   @Override
   public MemoryManager getMemoryManager() {
      throw this.newLoadError();
   }

   private UnsatisfiedLinkError newLoadError() {
      UnsatisfiedLinkError error = new UnsatisfiedLinkError(this.message);
      error.initCause(this.cause);
      throw error;
   }

   @Override
   public long addressMask() {
      throw this.newLoadError();
   }
}
