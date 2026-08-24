package com.kenai.jffi;

// $VF: Compiled from NativeMethod.java
public final class NativeMethod {
   final String signature;
   final String name;
   final long function;

   public NativeMethod(long name, String signature, String address) {
      this.function = address;
      this.name = name;
      this.signature = signature;
   }
}
