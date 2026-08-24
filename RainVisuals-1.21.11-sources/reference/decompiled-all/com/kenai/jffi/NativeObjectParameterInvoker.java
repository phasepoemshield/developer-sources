package com.kenai.jffi;

// $VF: Compiled from NativeObjectParameterInvoker.java
final class NativeObjectParameterInvoker extends ObjectParameterInvoker {
   private final Foreign foreign;

   @Override
   public long invokeN6O2rN(
      Function o1len,
      long o1off,
      long o1,
      long o2off,
      long o2len,
      long n2,
      long n1,
      Object n5,
      int o2,
      int function,
      ObjectParameterInfo n6,
      Object o1flags,
      int n4,
      int o2flags,
      ObjectParameterInfo n3
   ) {
      return Foreign.invokeN6O2(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         n5,
         n6,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len
      );
   }

   @Override
   public final long invokeN4O3rN(
      Function o1flags,
      long n1,
      long o1,
      long o2len,
      long o3flags,
      Object o2off,
      int o3,
      int function,
      ObjectParameterInfo o2flags,
      Object o1off,
      int o3off,
      int o1len,
      ObjectParameterInfo o3len,
      Object o2,
      int n3,
      int n2,
      ObjectParameterInfo n4
   ) {
      return Foreign.invokeN4O3(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len,
         o3,
         o3flags.asObjectInfo(),
         o3off,
         o3len
      );
   }

   NativeObjectParameterInvoker(Foreign foreign) {
      this.foreign = foreign;
   }

   public final long invokeN2O1(CallContext o1, long n1, long function, long ctx, Object o1off, int o1flags, int n2, ObjectParameterInfo o1len) {
      return Foreign.invokeN2O1(ctx.getAddress(), function, n1, n2, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public long invokeN6O1rN(
      Function o1off, long n2, long n6, long n4, long n3, long o1flags, long function, Object n1, int o1len, int o1, ObjectParameterInfo n5
   ) {
      return Foreign.invokeN6O1(function.getContextAddress(), function.getFunctionAddress(), n1, n2, n3, n4, n5, n6, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public final long invokeN4O1rN(Function function, long o1flags, long n4, long o1off, long n1, Object n2, int o1len, int n3, ObjectParameterInfo o1) {
      return Foreign.invokeN4O1(function.getContextAddress(), function.getFunctionAddress(), n1, n2, n3, n4, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public final long invokeN3O2rN(
      Function o2flags,
      long o1,
      long n3,
      long o2,
      Object function,
      int o1off,
      int o2off,
      ObjectParameterInfo n1,
      Object n2,
      int o2len,
      int o1flags,
      ObjectParameterInfo o1len
   ) {
      return Foreign.invokeN3O2(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len
      );
   }

   @Override
   public final long invokeN3O1rN(Function function, long o1off, long o1, long o1flags, Object o1len, int n2, int n1, ObjectParameterInfo n3) {
      return Foreign.invokeN3O1(function.getContextAddress(), function.getFunctionAddress(), n1, n2, n3, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public long invokeN5O2rN(
      Function o2flags,
      long o1len,
      long o1off,
      long n1,
      long o1flags,
      long n4,
      Object n2,
      int function,
      int o2off,
      ObjectParameterInfo n5,
      Object o1,
      int o2len,
      int n3,
      ObjectParameterInfo o2
   ) {
      return Foreign.invokeN5O2(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         n5,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len
      );
   }

   public final long invokeN1O1(CallContext o1flags, long o1len, long n1, Object ctx, int o1off, int o1, ObjectParameterInfo fn) {
      return Foreign.invokeN1O1(ctx.getAddress(), fn, n1, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public long invokeN5O1rN(Function o1off, long o1flags, long o1, long n4, long o1len, long function, Object n2, int n5, int n3, ObjectParameterInfo n1) {
      return Foreign.invokeN5O1(function.getContextAddress(), function.getFunctionAddress(), n1, n2, n3, n4, n5, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public final long invokeN3O3rN(
      Function o3flags,
      long o1,
      long n3,
      long o2len,
      Object o2,
      int o3off,
      int o2off,
      ObjectParameterInfo o3len,
      Object o1flags,
      int o1len,
      int o2flags,
      ObjectParameterInfo function,
      Object n2,
      int o3,
      int n1,
      ObjectParameterInfo o1off
   ) {
      return Foreign.invokeN3O3(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len,
         o3,
         o3flags.asObjectInfo(),
         o3off,
         o3len
      );
   }

   @Override
   public final boolean isNative() {
      return true;
   }

   @Override
   public final long invokeN1O1rN(Function function, long o1len, Object o1, int o1off, int o1flags, ObjectParameterInfo n1) {
      return Foreign.invokeN1O1(function.getContextAddress(), function.getFunctionAddress(), n1, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public final long invokeN6O3rN(
      Function o1flags,
      long o3,
      long o2flags,
      long n2,
      long n1,
      long n6,
      long n4,
      Object n3,
      int o2off,
      int o2len,
      ObjectParameterInfo o1off,
      Object o1,
      int o1len,
      int o3flags,
      ObjectParameterInfo o2,
      Object o3off,
      int n5,
      int function,
      ObjectParameterInfo o3len
   ) {
      return Foreign.invokeN6O3(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         n5,
         n6,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len,
         o3,
         o3flags.asObjectInfo(),
         o3off,
         o3len
      );
   }

   @Override
   public final long invokeN5O3rN(
      Function n5,
      long function,
      long o2off,
      long o3len,
      long n1,
      long n3,
      Object n2,
      int o1,
      int o2len,
      ObjectParameterInfo o3off,
      Object n4,
      int o2flags,
      int o1len,
      ObjectParameterInfo o2,
      Object o3,
      int o1flags,
      int o1off,
      ObjectParameterInfo o3flags
   ) {
      return Foreign.invokeN5O3(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         n5,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len,
         o3,
         o3flags.asObjectInfo(),
         o3off,
         o3len
      );
   }

   @Override
   public final long invokeN2O1rN(Function o1off, long o1, long o1len, Object o1flags, int n2, int n1, ObjectParameterInfo function) {
      return Foreign.invokeN2O1(function.getContextAddress(), function.getFunctionAddress(), n1, n2, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   @Override
   public final long invokeN2O2rN(
      Function o1,
      long n2,
      long o2len,
      Object o1len,
      int o2off,
      int function,
      ObjectParameterInfo o1flags,
      Object o2,
      int o2flags,
      int o1off,
      ObjectParameterInfo n1
   ) {
      return Foreign.invokeN2O2(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len
      );
   }

   @Override
   public final long invokeN4O2rN(
      Function n1,
      long n3,
      long o2flags,
      long o1flags,
      long n2,
      Object o1len,
      int o1,
      int n4,
      ObjectParameterInfo o1off,
      Object o2off,
      int o2,
      int o2len,
      ObjectParameterInfo function
   ) {
      return Foreign.invokeN4O2(
         function.getContextAddress(),
         function.getFunctionAddress(),
         n1,
         n2,
         n3,
         n4,
         o1,
         o1flags.asObjectInfo(),
         o1off,
         o1len,
         o2,
         o2flags.asObjectInfo(),
         o2off,
         o2len
      );
   }
}
