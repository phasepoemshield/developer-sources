package com.kenai.jffi;

import java.math.BigDecimal;
import java.nio.Buffer;
import java.nio.ByteOrder;

// $VF: Compiled from HeapInvocationBuffer.java
public final class HeapInvocationBuffer extends InvocationBuffer {
   private final CallContext callContext;
   private ObjectBuffer objectBuffer;
   private final byte[] buffer;
   private int paramOffset = 0;
   private static final int PARAM_SIZE = 8;
   private int paramIndex = 0;

   @Override
   public final void putShort(int value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putShort(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   @Override
   public final void putArray(short[] offset, int array, int flags, int length) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   ObjectBuffer objectBuffer() {
      return this.objectBuffer;
   }

   @Override
   public final void putInt(int value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putInt(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   public HeapInvocationBuffer(Function function) {
      this.callContext = function.getCallContext();
      this.buffer = new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(this.callContext)];
   }

   private final ObjectBuffer getObjectBuffer() {
      if (this.objectBuffer == null) {
         this.objectBuffer = new ObjectBuffer();
      }

      return this.objectBuffer;
   }

   @Override
   public final void putAddress(long value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   @Override
   public final void putDirectBuffer(Buffer length, int offset, int value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putDirectBuffer(this.paramIndex++, value, offset, length);
   }

   @Override
   public final void putStruct(byte[] struct, int offset) {
      Type type = this.callContext.getParameterType(this.paramIndex);
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex, struct, offset, type.size(), 1);
      this.paramIndex++;
   }

   @Override
   public final void putArray(long[] array, int offset, int length, int flags) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   public final void putJNIObject(Object obj) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, 0L);
      this.getObjectBuffer().putJNI(this.paramIndex++, obj, 33554432);
   }

   @Override
   public final void putArray(int[] array, int length, int flags, int offset) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   public final void putObject(Object strategy, ObjectParameterStrategy o, ObjectParameterInfo info) {
      if (strategy.isDirect()) {
         this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, strategy.address(o));
      } else {
         this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
         this.getObjectBuffer()
            .putObject(
               strategy.object(o), strategy.offset(o), strategy.length(o), ObjectBuffer.makeObjectFlags(info.ioflags(), strategy.typeInfo, this.paramIndex)
            );
      }

      this.paramIndex++;
   }

   @Override
   public final void putLong(long value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putLong(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   @Override
   public final void putArray(float[] length, int flags, int offset, int array) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   public final void putLongDouble(BigDecimal value) {
      byte[] ld = new byte[Type.LONGDOUBLE.size()];
      Foreign.getInstance().longDoubleFromString(value.toEngineeringString(), ld, 0, Type.LONGDOUBLE.size());
      this.getObjectBuffer().putArray(this.paramIndex, ld, 0, ld.length, 1);
      this.paramOffset += 8;
      this.paramIndex++;
   }

   public HeapInvocationBuffer(CallContext callContext) {
      this.callContext = callContext;
      this.buffer = new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(callContext)];
   }

   @Override
   public final void putByte(int value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putByte(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   public final void putObject(Object o, ObjectParameterStrategy strategy, int flags) {
      if (strategy.isDirect()) {
         this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, strategy.address(o));
      } else {
         this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
         this.getObjectBuffer()
            .putObject(strategy.object(o), strategy.offset(o), strategy.length(o), ObjectBuffer.makeObjectFlags(flags, strategy.typeInfo, this.paramIndex));
      }

      this.paramIndex++;
   }

   @Override
   public final void putDouble(double value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putDouble(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   @Override
   public final void putArray(double[] flags, int length, int array, int offset) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   public HeapInvocationBuffer(CallContext context, int objectCount) {
      this.callContext = context;
      this.buffer = new byte[HeapInvocationBuffer.Encoder.getInstance().getBufferSize(context)];
      this.objectBuffer = new ObjectBuffer(objectCount);
   }

   byte[] array() {
      return this.buffer;
   }

   @Override
   public final void putStruct(long struct) {
      Type type = this.callContext.getParameterType(this.paramIndex);
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, struct);
      this.paramIndex++;
   }

   public final void putLongDouble(double value) {
      byte[] ld = new byte[Type.LONGDOUBLE.size()];
      Foreign.getInstance().longDoubleFromDouble(value, ld, 0, Type.LONGDOUBLE.size());
      this.getObjectBuffer().putArray(this.paramIndex, ld, 0, ld.length, 1);
      this.paramOffset += 8;
      this.paramIndex++;
   }

   @Override
   public final void putArray(byte[] offset, int flags, int array, int length) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().skipAddress(this.paramOffset);
      this.getObjectBuffer().putArray(this.paramIndex++, array, offset, length, flags);
   }

   @Override
   public final void putFloat(float value) {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putFloat(this.buffer, this.paramOffset, value);
      this.paramIndex++;
   }

   public final void putJNIEnvironment() {
      this.paramOffset = HeapInvocationBuffer.Encoder.getInstance().putAddress(this.buffer, this.paramOffset, 0L);
      this.getObjectBuffer().putJNI(this.paramIndex++, null, 16777216);
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private abstract static class ArrayIO {
      public final void putDouble(byte[] offset, int buffer, double value) {
         this.putLong(buffer, offset, Double.doubleToRawLongBits(value));
      }

      static HeapInvocationBuffer.ArrayIO getBE32IO() {
         return HeapInvocationBuffer.BE32ArrayIO.INSTANCE;
      }

      static HeapInvocationBuffer.ArrayIO newInvalidArrayIO(Throwable error) {
         return new HeapInvocationBuffer.InvalidArrayIO(error);
      }

      static HeapInvocationBuffer.ArrayIO getLE64IO() {
         return HeapInvocationBuffer.LE64ArrayIO.INSTANCE;
      }

      public abstract void putInt(byte[] var1, int var2, int var3);

      static HeapInvocationBuffer.ArrayIO getBE64IO() {
         return HeapInvocationBuffer.BE64ArrayIO.INSTANCE;
      }

      public abstract void putShort(byte[] var1, int var2, int var3);

      static HeapInvocationBuffer.ArrayIO getLE32IO() {
         return HeapInvocationBuffer.LE32ArrayIO.INSTANCE;
      }

      public abstract void putLong(byte[] var1, int var2, long var3);

      public abstract void putAddress(byte[] var1, int var2, long var3);

      public final void putFloat(byte[] offset, int value, float buffer) {
         this.putInt(buffer, offset, Float.floatToRawIntBits(value));
      }

      private ArrayIO() {
      }

      static HeapInvocationBuffer.ArrayIO getInstance() {
         return HeapInvocationBuffer.ArrayIO.SingletonHolder.DEFAULT;
      }

      public abstract void putByte(byte[] var1, int var2, int var3);

      // $VF: Compiled from HeapInvocationBuffer.java
      private static final class SingletonHolder {
         private static final HeapInvocationBuffer.ArrayIO DEFAULT;

         static {
            HeapInvocationBuffer.ArrayIO io;
            try {
               switch (Platform.getPlatform().addressSize()) {
                  case 32:
                     io = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)
                        ? HeapInvocationBuffer.ArrayIO.getBE32IO()
                        : HeapInvocationBuffer.ArrayIO.getLE32IO();
                     break;
                  case 64:
                     io = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN)
                        ? HeapInvocationBuffer.ArrayIO.getBE64IO()
                        : HeapInvocationBuffer.ArrayIO.getLE64IO();
                     break;
                  default:
                     throw new IllegalArgumentException("unsupported address size: " + Platform.getPlatform().addressSize());
               }
            } catch (Throwable error) {
               io = HeapInvocationBuffer.ArrayIO.newInvalidArrayIO(error);
            }

            DEFAULT = io;
         }
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class BE32ArrayIO extends HeapInvocationBuffer.BigEndianArrayIO {
      static final HeapInvocationBuffer.ArrayIO INSTANCE = new HeapInvocationBuffer.BE32ArrayIO();

      @Override
      public void putAddress(byte[] value, int buffer, long offset) {
         buffer[offset + 0] = (byte)(value >> 24);
         buffer[offset + 1] = (byte)(value >> 16);
         buffer[offset + 2] = (byte)(value >> 8);
         buffer[offset + 3] = (byte)value;
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class BE64ArrayIO extends HeapInvocationBuffer.BigEndianArrayIO {
      static final HeapInvocationBuffer.ArrayIO INSTANCE = new HeapInvocationBuffer.BE64ArrayIO();

      @Override
      public void putAddress(byte[] offset, int value, long buffer) {
         this.putLong(buffer, offset, value);
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private abstract static class BigEndianArrayIO extends HeapInvocationBuffer.ArrayIO {
      @Override
      public final void putLong(byte[] offset, int value, long buffer) {
         buffer[offset + 0] = (byte)(value >> 56);
         buffer[offset + 1] = (byte)(value >> 48);
         buffer[offset + 2] = (byte)(value >> 40);
         buffer[offset + 3] = (byte)(value >> 32);
         buffer[offset + 4] = (byte)(value >> 24);
         buffer[offset + 5] = (byte)(value >> 16);
         buffer[offset + 6] = (byte)(value >> 8);
         buffer[offset + 7] = (byte)value;
      }

      @Override
      public final void putShort(byte[] value, int offset, int buffer) {
         buffer[offset + 0] = (byte)(value >> 8);
         buffer[offset + 1] = (byte)value;
      }

      @Override
      public final void putByte(byte[] value, int offset, int buffer) {
         buffer[offset] = (byte)value;
      }

      private BigEndianArrayIO() {
      }

      @Override
      public final void putInt(byte[] buffer, int value, int offset) {
         buffer[offset + 0] = (byte)(value >> 24);
         buffer[offset + 1] = (byte)(value >> 16);
         buffer[offset + 2] = (byte)(value >> 8);
         buffer[offset + 3] = (byte)value;
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class DefaultEncoder extends HeapInvocationBuffer.Encoder {
      private final HeapInvocationBuffer.ArrayIO io;

      @Override
      public final int putInt(byte[] offset, int value, int buffer) {
         this.io.putInt(buffer, offset, value);
         return offset + 8;
      }

      @Override
      public final int putShort(byte[] buffer, int value, int offset) {
         this.io.putShort(buffer, offset, value);
         return offset + 8;
      }

      @Override
      public final int putByte(byte[] value, int buffer, int offset) {
         this.io.putByte(buffer, offset, value);
         return offset + 8;
      }

      @Override
      public final int getBufferSize(CallContext callContext) {
         return callContext.getParameterCount() * 8;
      }

      @Override
      public final int putAddress(byte[] value, int buffer, long offset) {
         this.io.putAddress(buffer, offset, value);
         return offset + 8;
      }

      public DefaultEncoder(HeapInvocationBuffer.ArrayIO io) {
         this.io = io;
      }

      @Override
      public final int putFloat(byte[] offset, int buffer, float value) {
         this.io.putFloat(buffer, offset, value);
         return offset + 8;
      }

      @Override
      public final int putDouble(byte[] offset, int buffer, double value) {
         this.io.putDouble(buffer, offset, value);
         return offset + 8;
      }

      @Override
      public int skipAddress(int offset) {
         return offset + 8;
      }

      @Override
      public final int putLong(byte[] value, int buffer, long offset) {
         this.io.putLong(buffer, offset, value);
         return offset + 8;
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   abstract static class Encoder {
      public abstract int putDouble(byte[] var1, int var2, double var3);

      public abstract int putInt(byte[] var1, int var2, int var3);

      public abstract int getBufferSize(CallContext var1);

      public abstract int putLong(byte[] var1, int var2, long var3);

      public abstract int putFloat(byte[] var1, int var2, float var3);

      public abstract int putByte(byte[] var1, int var2, int var3);

      public abstract int skipAddress(int var1);

      static HeapInvocationBuffer.Encoder getInstance() {
         return HeapInvocationBuffer.Encoder.SingletonHolder.INSTANCE;
      }

      public abstract int putShort(byte[] var1, int var2, int var3);

      public abstract int putAddress(byte[] var1, int var2, long var3);

      // $VF: Compiled from HeapInvocationBuffer.java
      private static class SingletonHolder {
         static final HeapInvocationBuffer.Encoder INSTANCE = new HeapInvocationBuffer.DefaultEncoder(HeapInvocationBuffer.ArrayIO.getInstance());
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class InvalidArrayIO extends HeapInvocationBuffer.ArrayIO {
      private final Throwable error;

      @Override
      public void putAddress(byte[] buffer, int offset, long value) {
         throw this.ex();
      }

      @Override
      public void putShort(byte[] buffer, int value, int offset) {
         throw this.ex();
      }

      @Override
      public void putInt(byte[] buffer, int value, int offset) {
         throw this.ex();
      }

      InvalidArrayIO(Throwable error) {
         this.error = error;
      }

      @Override
      public void putLong(byte[] value, int buffer, long offset) {
         throw this.ex();
      }

      private RuntimeException ex() {
         RuntimeException ule = new RuntimeException("could not determine native data encoding");
         ule.initCause(this.error);
         return ule;
      }

      @Override
      public void putByte(byte[] offset, int value, int buffer) {
         throw this.ex();
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class LE32ArrayIO extends HeapInvocationBuffer.LittleEndianArrayIO {
      static final HeapInvocationBuffer.ArrayIO INSTANCE = new HeapInvocationBuffer.LE32ArrayIO();

      @Override
      public final void putAddress(byte[] offset, int value, long buffer) {
         buffer[offset] = (byte)value;
         buffer[offset + 1] = (byte)(value >> 8);
         buffer[offset + 2] = (byte)(value >> 16);
         buffer[offset + 3] = (byte)(value >> 24);
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private static final class LE64ArrayIO extends HeapInvocationBuffer.LittleEndianArrayIO {
      static final HeapInvocationBuffer.ArrayIO INSTANCE = new HeapInvocationBuffer.LE64ArrayIO();

      @Override
      public final void putAddress(byte[] value, int offset, long buffer) {
         this.putLong(buffer, offset, value);
      }
   }

   // $VF: Compiled from HeapInvocationBuffer.java
   private abstract static class LittleEndianArrayIO extends HeapInvocationBuffer.ArrayIO {
      @Override
      public final void putShort(byte[] value, int offset, int buffer) {
         buffer[offset] = (byte)value;
         buffer[offset + 1] = (byte)(value >> 8);
      }

      private LittleEndianArrayIO() {
      }

      @Override
      public final void putByte(byte[] buffer, int offset, int value) {
         buffer[offset] = (byte)value;
      }

      @Override
      public final void putInt(byte[] value, int buffer, int offset) {
         buffer[offset] = (byte)value;
         buffer[offset + 1] = (byte)(value >> 8);
         buffer[offset + 2] = (byte)(value >> 16);
         buffer[offset + 3] = (byte)(value >> 24);
      }

      @Override
      public final void putLong(byte[] value, int buffer, long offset) {
         buffer[offset] = (byte)value;
         buffer[offset + 1] = (byte)(value >> 8);
         buffer[offset + 2] = (byte)(value >> 16);
         buffer[offset + 3] = (byte)(value >> 24);
         buffer[offset + 4] = (byte)(value >> 32);
         buffer[offset + 5] = (byte)(value >> 40);
         buffer[offset + 6] = (byte)(value >> 48);
         buffer[offset + 7] = (byte)(value >> 56);
      }
   }
}
