package jnr.a64asm;

// $VF: Compiled from CPU_A64.java
public enum CPU_A64 {
   Aarch64,
   X86_64,
   X86_32,
   Aarch32;

   public static final CPU_A64 A64 = CPU_A64.Aarch64;
   public static final CPU_A64 I386 = CPU_A64.X86_32;
}
