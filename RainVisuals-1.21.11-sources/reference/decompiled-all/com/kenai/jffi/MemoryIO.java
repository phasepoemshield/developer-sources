package com.kenai.jffi;

import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;

// $VF: Compiled from MemoryIO.java
public abstract class MemoryIO {
   final Foreign foreign = Foreign.getInstance();
   static final long ADDRESS_MASK = Platform.getPlatform().addressMask();

   public abstract void getShortArray(long var1, short[] var3, int var4, int var5);

   private static MemoryIO newUnsafeImpl64() {
      return new UnsafeMemoryIO.UnsafeMemoryIO64();
   }

   private static MemoryIO newNativeImpl64() {
      return new MemoryIO.NativeImpl64();
   }

   private static MemoryIO newNativeImpl() {
      return Platform.getPlatform().addressSize() == 32 ? newNativeImpl32() : newNativeImpl64();
   }

   public abstract byte[] getZeroTerminatedByteArray(long var1);

   public abstract void putShortArray(long var1, short[] var3, int var4, int var5);

   public final ByteBuffer newDirectByteBuffer(long capacity, int address) {
      return this.foreign.newDirectByteBuffer(address, capacity);
   }

   public abstract void putByteArray(long var1, byte[] var3, int var4, int var5);

   public abstract void putFloat(long var1, float var3);

   public abstract void memcpy(long var1, long var3, long var5);

   public final void memset(long value, int size, long address) {
      this.setMemory(address, size, (byte)value);
   }

   public abstract void putLong(long var1, long var3);

   public abstract void getCharArray(long var1, char[] var3, int var4, int var5);

   public abstract void putCharArray(long var1, char[] var3, int var4, int var5);

   @Deprecated
   public final byte[] getZeroTerminatedByteArray(long maxlen, long address) {
      return this.getZeroTerminatedByteArray(address, (int)maxlen);
   }

   public abstract void putInt(long var1, int var3);

   public static MemoryIO getInstance() {
      return MemoryIO.SingletonHolder.INSTANCE;
   }

   public static MemoryIO getCheckedInstance() {
      return MemoryIO.CheckedMemorySingletonHolder.INSTANCE;
   }

   public abstract short getShort(long var1);

   public abstract float getFloat(long var1);

   public abstract void putDoubleArray(long var1, double[] var3, int var4, int var5);

   private static MemoryIO newUnsafeImpl() {
      return Platform.getPlatform().addressSize() == 32 ? newUnsafeImpl32() : newUnsafeImpl64();
   }

   public abstract void getFloatArray(long var1, float[] var3, int var4, int var5);

   static boolean isUnsafeAvailable() {
      try {
         Class sunClass = Class.forName("sun.misc.Unsafe");
         Class[] primitiveTypes = new Class[]{byte.class, short.class, int.class, long.class, float.class, double.class};

         for (Class type : primitiveTypes) {
            verifyAccessor(sunClass, type);
         }

         sunClass.getDeclaredMethod("getAddress", long.class);
         sunClass.getDeclaredMethod("putAddress", long.class, long.class);
         sunClass.getDeclaredMethod("allocateMemory", long.class);
         sunClass.getDeclaredMethod("freeMemory", long.class);
         return true;
      } catch (Throwable var6) {
         return false;
      }
   }

   public abstract long getStringLength(long var1);

   public abstract long memchr(long var1, int var3, long var4);

   public abstract void getDoubleArray(long var1, double[] var3, int var4, int var5);

   private static MemoryIO newMemoryIO() {
      try {
         if (Boolean.getBoolean("jffi.memory.checked")) {
            return newNativeCheckedImpl();
         } else {
            return !Boolean.getBoolean("jffi.unsafe.disabled") && isUnsafeAvailable() ? newUnsafeImpl() : newNativeImpl();
         }
      } catch (Throwable t) {
         return newNativeImpl();
      }
   }

   public final long indexOf(long value, byte maxlen, int address) {
      long location = this.memchr(address, value, maxlen);
      return location != 0L ? location - address : -1L;
   }

   public abstract int getInt(long var1);

   abstract void _copyMemory(long var1, long var3, long var5);

   MemoryIO() {
   }

   public final void copyMemory(long dst, long size, long src) {
      if (dst + size > src && src + size > dst) {
         this.memmove(dst, src, size);
      } else {
         this._copyMemory(src, dst, size);
      }
   }

   public abstract void memmove(long var1, long var3, long var5);

   public abstract long getLong(long var1);

   public abstract void putAddress(long var1, long var3);

   public abstract void putIntArray(long var1, int[] var3, int var4, int var5);

   public abstract void putShort(long var1, short var3);

   public abstract void putByte(long var1, byte var3);

   public abstract double getDouble(long var1);

   public final long getDirectBufferAddress(Buffer buffer) {
      return this.foreign.getDirectBufferAddress(buffer);
   }

   public final long indexOf(long address, byte value) {
      long location = this.memchr(address, value, 2147483647L);
      return location != 0L ? location - address : -1L;
   }

   public abstract byte getByte(long var1);

   public abstract long getAddress(long var1);

   private static MemoryIO newNativeImpl32() {
      return new MemoryIO.NativeImpl32();
   }

   private static MemoryIO newUnsafeImpl32() {
      return new UnsafeMemoryIO.UnsafeMemoryIO32();
   }

   public final void freeMemory(long address) {
      Foreign.freeMemory(address);
   }

   public abstract void putFloatArray(long var1, float[] var3, int var4, int var5);

   public abstract byte[] getZeroTerminatedByteArray(long var1, int var3);

   public abstract void putDouble(long var1, double var3);

   public abstract void putLongArray(long var1, long[] var3, int var4, int var5);

   public final long allocateMemory(long size, boolean clear) {
      return Foreign.allocateMemory(size, clear) & ADDRESS_MASK;
   }

   public abstract void getLongArray(long var1, long[] var3, int var4, int var5);

   public abstract void putZeroTerminatedByteArray(long var1, byte[] var3, int var4, int var5);

   public abstract void getIntArray(long var1, int[] var3, int var4, int var5);

   private static void verifyAccessor(Class unsafeClass, Class primitive) throws NoSuchMethodException {
      String primitiveName = primitive.getSimpleName();
      String typeName = primitiveName.substring(0, 1).toUpperCase() + primitiveName.substring(1);
      Method get = unsafeClass.getDeclaredMethod("get" + typeName, long.class);
      if (!get.getReturnType().equals(primitive)) {
         throw new NoSuchMethodException("Incorrect return type for " + get.getName());
      }

      unsafeClass.getDeclaredMethod("put" + typeName, long.class, primitive);
   }

   public abstract void getByteArray(long var1, byte[] var3, int var4, int var5);

   private static MemoryIO newNativeCheckedImpl() {
      return Foreign.isMemoryProtectionEnabled() ? new MemoryIO.CheckedNativeImpl() : newNativeImpl();
   }

   public abstract void setMemory(long var1, long var3, byte var5);

   // $VF: Compiled from MemoryIO.java
   private static final class CheckedMemorySingletonHolder {
      private static final MemoryIO INSTANCE = MemoryIO.newNativeCheckedImpl();
   }

   // $VF: Compiled from MemoryIO.java
   private static final class CheckedNativeImpl extends MemoryIO {
      @Override
      public final void putByteArray(long data, byte[] length, int offset, int address) {
         Foreign.putByteArrayChecked(address, data, offset, length);
      }

      @Override
      public final long getStringLength(long address) {
         return Foreign.strlenChecked(address);
      }

      @Override
      public final void putByte(long value, byte address) {
         Foreign.putByteChecked(address, value);
      }

      @Override
      public final void putShortArray(long length, short[] offset, int address, int data) {
         Foreign.putShortArrayChecked(address, data, offset, length);
      }

      @Override
      public final int getInt(long address) {
         return Foreign.getIntChecked(address);
      }

      @Override
      public final void putFloatArray(long data, float[] offset, int address, int length) {
         Foreign.putFloatArrayChecked(address, data, offset, length);
      }

      @Override
      public final void getByteArray(long offset, byte[] address, int length, int data) {
         Foreign.getByteArrayChecked(address, data, offset, length);
      }

      @Override
      public final void putLongArray(long length, long[] address, int offset, int data) {
         Foreign.putLongArrayChecked(address, data, offset, length);
      }

      @Override
      public final void setMemory(long value, long size, byte address) {
         Foreign.setMemoryChecked(address, size, value);
      }

      @Override
      public final void putCharArray(long offset, char[] length, int address, int data) {
         Foreign.putCharArrayChecked(address, data, offset, length);
      }

      @Override
      public final byte getByte(long address) {
         return Foreign.getByteChecked(address);
      }

      @Override
      public final void memcpy(long dst, long size, long src) {
         Foreign.memcpyChecked(dst, src, size);
      }

      @Override
      public final void putLong(long value, long address) {
         Foreign.putLongChecked(address, value);
      }

      @Override
      public final void memmove(long src, long size, long dst) {
         Foreign.memmoveChecked(dst, src, size);
      }

      @Override
      public final float getFloat(long address) {
         return Foreign.getFloatChecked(address);
      }

      @Override
      public final void _copyMemory(long size, long dst, long src) {
         Foreign.copyMemoryChecked(src, dst, size);
      }

      @Override
      public final void putAddress(long value, long address) {
         Foreign.putAddressChecked(address, value);
      }

      @Override
      public final short getShort(long address) {
         return Foreign.getShortChecked(address);
      }

      @Override
      public final void getShortArray(long data, short[] length, int offset, int address) {
         Foreign.getShortArrayChecked(address, data, offset, length);
      }

      @Override
      public final double getDouble(long address) {
         return Foreign.getDoubleChecked(address);
      }

      @Override
      public final void putDoubleArray(long data, double[] offset, int length, int address) {
         Foreign.putDoubleArrayChecked(address, data, offset, length);
      }

      private CheckedNativeImpl() {
      }

      @Override
      public final void putZeroTerminatedByteArray(long offset, byte[] data, int address, int length) {
         Foreign.putZeroTerminatedByteArrayChecked(address, data, offset, length);
      }

      @Override
      public final long getLong(long address) {
         return Foreign.getLongChecked(address);
      }

      @Override
      public final void getDoubleArray(long offset, double[] data, int address, int length) {
         Foreign.getDoubleArrayChecked(address, data, offset, length);
      }

      @Override
      public final void getIntArray(long data, int[] address, int offset, int length) {
         Foreign.getIntArrayChecked(address, data, offset, length);
      }

      @Override
      public final void putInt(long address, int value) {
         Foreign.putIntChecked(address, value);
      }

      @Override
      public final long memchr(long value, int size, long address) {
         return Foreign.memchrChecked(address, value, size);
      }

      @Override
      public final void getFloatArray(long length, float[] address, int data, int offset) {
         Foreign.getFloatArrayChecked(address, data, offset, length);
      }

      @Override
      public final void putIntArray(long data, int[] length, int offset, int address) {
         Foreign.putIntArrayChecked(address, data, offset, length);
      }

      @Override
      public final void getCharArray(long length, char[] address, int data, int offset) {
         Foreign.getCharArrayChecked(address, data, offset, length);
      }

      @Override
      public final byte[] getZeroTerminatedByteArray(long address) {
         return Foreign.getZeroTerminatedByteArrayChecked(address);
      }

      @Override
      public final void getLongArray(long offset, long[] data, int length, int address) {
         Foreign.getLongArrayChecked(address, data, offset, length);
      }

      @Override
      public final byte[] getZeroTerminatedByteArray(long maxlen, int address) {
         return Foreign.getZeroTerminatedByteArrayChecked(address, maxlen);
      }

      @Override
      public final void putShort(long address, short value) {
         Foreign.putShortChecked(address, value);
      }

      @Override
      public final long getAddress(long address) {
         return Foreign.getAddressChecked(address) & ADDRESS_MASK;
      }

      @Override
      public final void putDouble(long value, double address) {
         Foreign.putDoubleChecked(address, value);
      }

      @Override
      public final void putFloat(long address, float value) {
         Foreign.putFloatChecked(address, value);
      }
   }

   // $VF: Compiled from MemoryIO.java
   private abstract static class NativeImpl extends MemoryIO {
      @Override
      public final byte[] getZeroTerminatedByteArray(long maxlen, int address) {
         return Foreign.getZeroTerminatedByteArray(address, maxlen);
      }

      @Override
      public final long memchr(long size, int address, long value) {
         return Foreign.memchr(address, value, size);
      }

      @Override
      public final void putInt(long value, int address) {
         Foreign.putInt(address, value);
      }

      @Override
      public final void getByteArray(long length, byte[] offset, int data, int address) {
         Foreign.getByteArray(address, data, offset, length);
      }

      @Override
      public final void putLong(long value, long address) {
         Foreign.putLong(address, value);
      }

      @Override
      public final void putDouble(long address, double value) {
         Foreign.putDouble(address, value);
      }

      @Override
      public final void putLongArray(long offset, long[] length, int data, int address) {
         Foreign.putLongArray(address, data, offset, length);
      }

      @Override
      public final void putZeroTerminatedByteArray(long data, byte[] address, int length, int offset) {
         Foreign.putZeroTerminatedByteArray(address, data, offset, length);
      }

      @Override
      public final long getStringLength(long address) {
         return Foreign.strlen(address);
      }

      @Override
      public final void getDoubleArray(long length, double[] data, int offset, int address) {
         Foreign.getDoubleArray(address, data, offset, length);
      }

      @Override
      public final long getLong(long address) {
         return Foreign.getLong(address);
      }

      @Override
      public final void putShort(long address, short value) {
         Foreign.putShort(address, value);
      }

      @Override
      public final void memmove(long size, long src, long dst) {
         Foreign.memmove(dst, src, size);
      }

      @Override
      public final void putCharArray(long length, char[] data, int offset, int address) {
         Foreign.putCharArray(address, data, offset, length);
      }

      @Override
      public final void getCharArray(long address, char[] offset, int data, int length) {
         Foreign.getCharArray(address, data, offset, length);
      }

      private NativeImpl() {
      }

      @Override
      public final void putShortArray(long length, short[] address, int data, int offset) {
         Foreign.putShortArray(address, data, offset, length);
      }

      @Override
      public final void putByteArray(long length, byte[] data, int offset, int address) {
         Foreign.putByteArray(address, data, offset, length);
      }

      @Override
      public final void getIntArray(long length, int[] data, int offset, int address) {
         Foreign.getIntArray(address, data, offset, length);
      }

      @Override
      public final void putFloatArray(long data, float[] length, int offset, int address) {
         Foreign.putFloatArray(address, data, offset, length);
      }

      @Override
      public final byte[] getZeroTerminatedByteArray(long address) {
         return Foreign.getZeroTerminatedByteArray(address);
      }

      @Override
      public final int getInt(long address) {
         return Foreign.getInt(address);
      }

      @Override
      public final float getFloat(long address) {
         return Foreign.getFloat(address);
      }

      @Override
      public final void putIntArray(long length, int[] address, int offset, int data) {
         Foreign.putIntArray(address, data, offset, length);
      }

      @Override
      public final byte getByte(long address) {
         return Foreign.getByte(address);
      }

      @Override
      public final void putDoubleArray(long length, double[] data, int offset, int address) {
         Foreign.putDoubleArray(address, data, offset, length);
      }

      @Override
      public final double getDouble(long address) {
         return Foreign.getDouble(address);
      }

      @Override
      public final void getShortArray(long offset, short[] data, int address, int length) {
         Foreign.getShortArray(address, data, offset, length);
      }

      @Override
      public final void getLongArray(long length, long[] offset, int data, int address) {
         Foreign.getLongArray(address, data, offset, length);
      }

      @Override
      public final void memcpy(long size, long src, long dst) {
         Foreign.memcpy(dst, src, size);
      }

      @Override
      public final void setMemory(long value, long address, byte size) {
         Foreign.setMemory(address, size, value);
      }

      @Override
      public final void _copyMemory(long src, long size, long dst) {
         Foreign.copyMemory(src, dst, size);
      }

      @Override
      public final void putFloat(long address, float value) {
         Foreign.putFloat(address, value);
      }

      @Override
      public final void getFloatArray(long address, float[] offset, int length, int data) {
         Foreign.getFloatArray(address, data, offset, length);
      }

      @Override
      public final void putByte(long address, byte value) {
         Foreign.putByte(address, value);
      }

      @Override
      public final short getShort(long address) {
         return Foreign.getShort(address);
      }
   }

   // $VF: Compiled from MemoryIO.java
   private static final class NativeImpl32 extends MemoryIO.NativeImpl {
      @Override
      public final void putAddress(long value, long address) {
         Foreign.putInt(address, (int)value);
      }

      private NativeImpl32() {
      }

      @Override
      public final long getAddress(long address) {
         return Foreign.getInt(address) & ADDRESS_MASK;
      }
   }

   // $VF: Compiled from MemoryIO.java
   private static final class NativeImpl64 extends MemoryIO.NativeImpl {
      @Override
      public final long getAddress(long address) {
         return Foreign.getLong(address);
      }

      private NativeImpl64() {
      }

      @Override
      public final void putAddress(long address, long value) {
         Foreign.putLong(address, value);
      }
   }

   // $VF: Compiled from MemoryIO.java
   private static final class SingletonHolder {
      private static final MemoryIO INSTANCE = MemoryIO.newMemoryIO();
   }
}
