package com.kenai.jffi;

// $VF: Compiled from DirectClosureBuffer.java
final class DirectClosureBuffer implements Closure.Buffer {
   private final long retval;
   private final CallContext callContext;
   private static final MemoryIO IO = MemoryIO.getInstance();
   private final long parameters;
   private static final DirectClosureBuffer.NativeWordIO WordIO = DirectClosureBuffer.NativeWordIO.getInstance();
   private static final long PARAM_SIZE = Platform.getPlatform().addressSize() / 8;

   @Override
   public final void setIntReturn(int value) {
      WordIO.put(this.retval, value);
   }

   @Override
   public final void setFloatReturn(float value) {
      IO.putFloat(this.retval, value);
   }

   @Override
   public final void setDoubleReturn(double value) {
      IO.putDouble(this.retval, value);
   }

   @Override
   public final long getStruct(int index) {
      return IO.getAddress(this.parameters + index * PARAM_SIZE);
   }

   public DirectClosureBuffer(CallContext callContext, long retval, long parameters) {
      this.callContext = callContext;
      this.retval = retval;
      this.parameters = parameters;
   }

   @Override
   public final short getShort(int index) {
      return IO.getShort(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final byte getByte(int index) {
      return IO.getByte(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final float getFloat(int index) {
      return IO.getFloat(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final long getLong(int index) {
      return IO.getLong(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final double getDouble(int index) {
      return IO.getDouble(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final int getInt(int index) {
      return IO.getInt(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public final void setByteReturn(byte value) {
      WordIO.put(this.retval, value);
   }

   @Override
   public final void setLongReturn(long value) {
      IO.putLong(this.retval, value);
   }

   @Override
   public void setStructReturn(byte[] offset, int data) {
      IO.putByteArray(this.retval, data, offset, this.callContext.getReturnType().size());
   }

   @Override
   public final void setShortReturn(short value) {
      WordIO.put(this.retval, value);
   }

   @Override
   public final long getAddress(int index) {
      return IO.getAddress(IO.getAddress(this.parameters + index * PARAM_SIZE));
   }

   @Override
   public void setStructReturn(long value) {
      IO.copyMemory(value, this.retval, this.callContext.getReturnType().size());
   }

   @Override
   public final void setAddressReturn(long address) {
      IO.putAddress(this.retval, address);
   }

   // $VF: Compiled from DirectClosureBuffer.java
   private abstract static class NativeWordIO {
      private NativeWordIO() {
      }

      abstract void put(long var1, int var3);

      abstract int get(long var1);

      public static final DirectClosureBuffer.NativeWordIO getInstance() {
         return Platform.getPlatform().addressSize() == 32 ? DirectClosureBuffer.NativeWordIO32.INSTANCE : DirectClosureBuffer.NativeWordIO64.INSTANCE;
      }
   }

   // $VF: Compiled from DirectClosureBuffer.java
   private static final class NativeWordIO32 extends DirectClosureBuffer.NativeWordIO {
      static final DirectClosureBuffer.NativeWordIO INSTANCE = new DirectClosureBuffer.NativeWordIO32();
      private static final MemoryIO IO = MemoryIO.getInstance();

      @Override
      int get(long address) {
         return IO.getInt(address);
      }

      @Override
      void put(long address, int value) {
         IO.putInt(address, value);
      }
   }

   // $VF: Compiled from DirectClosureBuffer.java
   private static final class NativeWordIO64 extends DirectClosureBuffer.NativeWordIO {
      private static final MemoryIO IO = MemoryIO.getInstance();
      static final DirectClosureBuffer.NativeWordIO INSTANCE = new DirectClosureBuffer.NativeWordIO64();

      @Override
      int get(long address) {
         return (int)IO.getLong(address);
      }

      @Override
      void put(long address, int value) {
         IO.putLong(address, value);
      }
   }
}
