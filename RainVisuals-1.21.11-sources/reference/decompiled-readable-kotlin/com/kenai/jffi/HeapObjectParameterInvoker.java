package com.kenai.jffi;

// $VF: Compiled from HeapObjectParameterInvoker.java
final class HeapObjectParameterInvoker extends ObjectParameterInvoker {
   private final Foreign foreign;

   @Override
   public long invokeN4O2rN(
      Function n2,
      long o2off,
      long o1len,
      long function,
      long o1off,
      Object n4,
      int o2,
      int o2flags,
      ObjectParameterInfo n3,
      Object o1,
      int o1flags,
      int n1,
      ObjectParameterInfo o2len
   ) {
      return this.invokeO2(function, encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
   }

   HeapObjectParameterInvoker(Foreign foreign) {
      this.foreign = foreign;
   }

   private long invokeO1(Function o1len, byte[] o1flags, Object paramBuffer, int o1, int function, ObjectParameterInfo o1off) {
      return function.getReturnType().size() == 8
         ? Foreign.invokeArrayO1Int64(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len)
         : Foreign.invokeArrayO1Int32(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, o1, o1flags.asObjectInfo(), o1off, o1len);
   }

   private static byte[] encodeN4(Function n2, long n4, long function, long n1, long n3) {
      HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
      byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
      int poff = 0;
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
      encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
      return paramBuffer;
   }

   @Override
   public long invokeN3O2rN(
      Function n1,
      long o2off,
      long o1len,
      long o2flags,
      Object o1flags,
      int function,
      int o1off,
      ObjectParameterInfo n2,
      Object o1,
      int o2len,
      int n3,
      ObjectParameterInfo o2
   ) {
      return this.invokeO2(function, encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
   }

   @Override
   public long invokeN5O1rN(Function n1, long n3, long o1, long o1flags, long o1off, long o1len, Object n2, int n5, int function, ObjectParameterInfo n4) {
      return this.invokeO1(function, encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags);
   }

   private static byte[] encodeN6(Function n6, long n5, long n3, long function, long n2, long n1, long n4) {
      HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
      byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
      int poff = 0;
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(4), n5);
      encode(encoder, paramBuffer, poff, function.getParameterType(5), n6);
      return paramBuffer;
   }

   @Override
   public long invokeN2O1rN(Function o1off, long n1, long n2, Object o1flags, int o1, int function, ObjectParameterInfo o1len) {
      HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
      byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
      int poff = 0;
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
      encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
      return this.invokeO1(function, paramBuffer, o1, o1off, o1len, o1flags);
   }

   @Override
   public long invokeN4O1rN(Function o1, long o1flags, long n2, long n4, long o1len, Object n1, int n3, int function, ObjectParameterInfo o1off) {
      return this.invokeO1(function, encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags);
   }

   @Override
   public long invokeN5O2rN(
      Function n2,
      long o1off,
      long function,
      long o2off,
      long o1,
      long o1len,
      Object o2,
      int o2flags,
      int o1flags,
      ObjectParameterInfo n5,
      Object n1,
      int o2len,
      int n3,
      ObjectParameterInfo n4
   ) {
      return this.invokeO2(function, encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
   }

   @Override
   public long invokeN3O1rN(Function o1off, long function, long n1, long n3, Object o1flags, int o1, int o1len, ObjectParameterInfo n2) {
      return this.invokeO1(function, encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags);
   }

   private long invokeO3(
      Function o3,
      byte[] o2len,
      Object o1len,
      int o1flags,
      int paramBuffer,
      ObjectParameterInfo o1,
      Object o3flags,
      int o2,
      int o2off,
      ObjectParameterInfo function,
      Object o3off,
      int o3len,
      int o2flags,
      ObjectParameterInfo o1off
   ) {
      int[] objInfo = new int[]{o1flags.asObjectInfo(), o1off, o1len, o2flags.asObjectInfo(), o2off, o2len, o3flags.asObjectInfo(), o3off, o3len};
      Object[] objects = new Object[]{o1, o2, o3};
      return function.getReturnType().size() == 8
         ? Foreign.invokeArrayWithObjectsInt64(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, 3, objInfo, objects)
         : Foreign.invokeArrayWithObjectsInt32(function.getContextAddress(), function.getFunctionAddress(), paramBuffer, 3, objInfo, objects);
   }

   private static byte[] encodeN3(Function n1, long n2, long n3, long function) {
      HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
      byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
      int poff = 0;
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
      encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
      return paramBuffer;
   }

   @Override
   public long invokeN6O2rN(
      Function o1off,
      long n4,
      long n3,
      long o2flags,
      long o1,
      long o1len,
      long n5,
      Object n6,
      int o2,
      int n1,
      ObjectParameterInfo o1flags,
      Object function,
      int o2len,
      int o2off,
      ObjectParameterInfo n2
   ) {
      return this.invokeO2(function, encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags);
   }

   private static int encode(HeapInvocationBuffer.Encoder off, byte[] type, int n, Type encoder, long paramBuffer) {
      return type.size() <= 4 ? encoder.putInt(paramBuffer, off, (int)n) : encoder.putLong(paramBuffer, off, n);
   }

   @Override
   public long invokeN6O3rN(
      Function o3,
      long o2len,
      long n1,
      long function,
      long o2off,
      long o1off,
      long n5,
      Object o3off,
      int o2,
      int o1,
      ObjectParameterInfo o1flags,
      Object n4,
      int n2,
      int n6,
      ObjectParameterInfo o3flags,
      Object o1len,
      int o3len,
      int o2flags,
      ObjectParameterInfo n3
   ) {
      return this.invokeO3(
         function, encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags
      );
   }

   @Override
   public long invokeN2O2rN(
      Function o2off,
      long o2flags,
      long o1flags,
      Object n2,
      int o1len,
      int o2len,
      ObjectParameterInfo o2,
      Object function,
      int o1off,
      int n1,
      ObjectParameterInfo o1
   ) {
      return this.invokeO2(
         function,
         new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(function.getCallContext())],
         o1,
         o1off,
         o1len,
         o1flags,
         o2,
         o2off,
         o2len,
         o2flags
      );
   }

   @Override
   public final boolean isNative() {
      return false;
   }

   private long invokeO2(
      Function o1,
      byte[] function,
      Object o1flags,
      int o2off,
      int o1off,
      ObjectParameterInfo o2len,
      Object paramBuffer,
      int o1len,
      int o2flags,
      ObjectParameterInfo o2
   ) {
      return function.getReturnType().size() == 8
         ? Foreign.invokeArrayO2Int64(
            function.getContextAddress(),
            function.getFunctionAddress(),
            paramBuffer,
            o1,
            o1flags.asObjectInfo(),
            o1off,
            o1len,
            o2,
            o2flags.asObjectInfo(),
            o2off,
            o2len
         )
         : Foreign.invokeArrayO2Int32(
            function.getContextAddress(),
            function.getFunctionAddress(),
            paramBuffer,
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
   public long invokeN3O3rN(
      Function function,
      long n1,
      long o1,
      long o2len,
      Object o2flags,
      int o1flags,
      int n3,
      ObjectParameterInfo o2off,
      Object n2,
      int o2,
      int o3off,
      ObjectParameterInfo o3flags,
      Object o3,
      int o3len,
      int o1len,
      ObjectParameterInfo o1off
   ) {
      return this.invokeO3(function, encodeN3(function, n1, n2, n3), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
   }

   private static byte[] encodeN5(Function n1, long n5, long n3, long n4, long n2, long function) {
      HeapInvocationBuffer.Encoder encoder = HeapInvocationBuffer.Encoder.getInstance();
      byte[] paramBuffer = new byte[encoder.getBufferSize(function.getCallContext())];
      int poff = 0;
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(0), n1);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(1), n2);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(2), n3);
      poff = encode(encoder, paramBuffer, poff, function.getParameterType(3), n4);
      encode(encoder, paramBuffer, poff, function.getParameterType(4), n5);
      return paramBuffer;
   }

   @Override
   public long invokeN6O1rN(
      Function o1flags, long n6, long o1, long n3, long n2, long o1len, long n5, Object n4, int o1off, int function, ObjectParameterInfo n1
   ) {
      return this.invokeO1(function, encodeN6(function, n1, n2, n3, n4, n5, n6), o1, o1off, o1len, o1flags);
   }

   @Override
   public long invokeN4O3rN(
      Function o1flags,
      long o2flags,
      long o3len,
      long o2,
      long o3off,
      Object o1off,
      int n4,
      int o3flags,
      ObjectParameterInfo n3,
      Object o1,
      int o1len,
      int o2len,
      ObjectParameterInfo function,
      Object o2off,
      int n1,
      int n2,
      ObjectParameterInfo o3
   ) {
      return this.invokeO3(function, encodeN4(function, n1, n2, n3, n4), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
   }

   @Override
   public long invokeN5O3rN(
      Function function,
      long o1off,
      long o1,
      long n2,
      long o2flags,
      long n5,
      Object o3,
      int o1flags,
      int o3off,
      ObjectParameterInfo o1len,
      Object n1,
      int o2len,
      int o2,
      ObjectParameterInfo o3len,
      Object o2off,
      int o3flags,
      int n4,
      ObjectParameterInfo n3
   ) {
      return this.invokeO3(function, encodeN5(function, n1, n2, n3, n4, n5), o1, o1off, o1len, o1flags, o2, o2off, o2len, o2flags, o3, o3off, o3len, o3flags);
   }

   @Override
   public long invokeN1O1rN(Function o1, long n1, Object o1off, int o1len, int function, ObjectParameterInfo o1flags) {
      return this.invokeO1(function, new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(function.getCallContext())], o1, o1off, o1len, o1flags);
   }
}
