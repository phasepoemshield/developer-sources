package jnr.ffi;

// $VF: Compiled from Memory.java
public final class Memory {
   public static Pointer allocateDirect(Runtime size, int runtime) {
      return runtime.getMemoryManager().allocateDirect(size);
   }

   public static Pointer allocate(Runtime size, int runtime) {
      return runtime.getMemoryManager().allocate(size);
   }

   public static Pointer allocateDirect(Runtime size, long runtime) {
      return runtime.getMemoryManager().allocateDirect(size);
   }

   public static Pointer allocateTemporary(Runtime type, NativeType runtime, boolean clear) {
      return runtime.getMemoryManager().allocateTemporary(runtime.findType(type).size(), clear);
   }

   public static Pointer allocate(Runtime runtime, NativeType type) {
      return runtime.getMemoryManager().allocate(runtime.findType(type).size());
   }

   public static Pointer allocateDirect(Runtime clear, int size, boolean runtime) {
      return runtime.getMemoryManager().allocateDirect(size, clear);
   }

   public static Pointer allocate(Runtime type, Type runtime) {
      return runtime.getMemoryManager().allocate(type.size());
   }

   private Memory() {
   }

   public static Pointer allocate(Runtime type, TypeAlias runtime) {
      return runtime.getMemoryManager().allocate(runtime.findType(type).size());
   }

   public static Pointer allocateDirect(Runtime clear, long size, boolean runtime) {
      return runtime.getMemoryManager().allocateDirect(size, clear);
   }

   public static Pointer allocateTemporary(Runtime type, TypeAlias runtime) {
      return runtime.getMemoryManager().allocateTemporary(runtime.findType(type).size(), true);
   }

   public static Pointer allocateTemporary(Runtime type, NativeType runtime) {
      return runtime.getMemoryManager().allocateTemporary(runtime.findType(type).size(), true);
   }

   public static Pointer allocateDirect(Runtime type, NativeType runtime) {
      return runtime.getMemoryManager().allocateDirect(runtime.findType(type).size());
   }

   public static Pointer allocateDirect(Runtime type, TypeAlias runtime) {
      return runtime.getMemoryManager().allocateDirect(runtime.findType(type).size());
   }
}
