package com.kenai.jffi;

// $VF: Compiled from Main.java
public class Main {
   public static void main(String[] args) {
      try {
         System.out.printf("jffi jar version=%d.%d.%d\n", Foreign.VERSION_MAJOR, Foreign.VERSION_MINOR, Foreign.VERSION_MICRO);
         Foreign t = Foreign.getInstance();
         System.out.printf("jffi stub version=%d.%d.%d\n", v(t, 16), v(t, 8), v(t, 0));
         System.out.println("memory fault protection enabled=" + Foreign.isMemoryProtectionEnabled());
         System.out.println("stub arch=" + t.getArch());
         System.out.printf("JNI version=%#x\n", t.getJNIVersion());
      } catch (Throwable var2) {
         System.err.println("Error: " + var2);
      }
   }

   private static int v(Foreign foreign, int shift) {
      return foreign.getVersion() >> shift & 0xFF;
   }
}
