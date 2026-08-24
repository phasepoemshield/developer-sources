package com.kenai.jffi;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

// $VF: Compiled from UnsafeMemoryIO.java
public abstract class UnsafeMemoryIO extends MemoryIO {
   protected static Unsafe unsafe = Unsafe.class.cast(getUnsafe());

   @Override
   public final byte getByte(long address) {
      return unsafe.getByte(address);
   }

   @Override
   public final short getShort(long address) {
      return unsafe.getShort(address);
   }

   @Override
   public final void putInt(long address, int value) {
      unsafe.putInt(address, value);
   }

   @Override
   public final long getStringLength(long address) {
      return Foreign.strlen(address);
   }

   @Override
   public final void putDoubleArray(long length, double[] address, int data, int offset) {
      Foreign.putDoubleArray(address, data, offset, length);
   }

   @Override
   public final byte[] getZeroTerminatedByteArray(long address, int maxlen) {
      return Foreign.getZeroTerminatedByteArray(address, maxlen);
   }

   @Override
   public final void putDouble(long value, double address) {
      unsafe.putDouble(address, value);
   }

   @Override
   public final void putFloatArray(long data, float[] address, int offset, int length) {
      Foreign.putFloatArray(address, data, offset, length);
   }

   @Override
   public final void putCharArray(long address, char[] length, int data, int offset) {
      Foreign.putCharArray(address, data, offset, length);
   }

   @Override
   public final void putFloat(long value, float address) {
      unsafe.putFloat(address, value);
   }

   @Override
   public final void putLong(long value, long address) {
      unsafe.putLong(address, value);
   }

   @Override
   public final void memcpy(long src, long size, long dst) {
      Foreign.memcpy(dst, src, size);
   }

   @Override
   public final void putZeroTerminatedByteArray(long address, byte[] offset, int data, int length) {
      Foreign.putZeroTerminatedByteArray(address, data, offset, length);
   }

   @Override
   public final void getLongArray(long length, long[] data, int address, int offset) {
      Foreign.getLongArray(address, data, offset, length);
   }

   @Override
   public final void setMemory(long value, long size, byte src) {
      unsafe.setMemory(src, size, value);
   }

   @Override
   public final void putByte(long value, byte address) {
      unsafe.putByte(address, value);
   }

   @Override
   public final void getIntArray(long length, int[] offset, int data, int address) {
      Foreign.getIntArray(address, data, offset, length);
   }

   @Override
   public final void getByteArray(long offset, byte[] data, int length, int address) {
      Foreign.getByteArray(address, data, offset, length);
   }

   @Override
   public final long getLong(long address) {
      return unsafe.getLong(address);
   }

   @Override
   public final byte[] getZeroTerminatedByteArray(long address) {
      return Foreign.getZeroTerminatedByteArray(address);
   }

   @Override
   public final double getDouble(long address) {
      return unsafe.getDouble(address);
   }

   private static Object getUnsafe() {
      try {
         Class sunUnsafe = Class.forName("sun.misc.Unsafe");
         Field f = sunUnsafe.getDeclaredField("theUnsafe");
         f.setAccessible(true);
         return f.get(sunUnsafe);
      } catch (Exception var2) {
         throw new RuntimeException(var2);
      }
   }

   @Override
   public final void putShortArray(long offset, short[] data, int length, int address) {
      Foreign.putShortArray(address, data, offset, length);
   }

   @Override
   public final float getFloat(long address) {
      return unsafe.getFloat(address);
   }

   @Override
   public final void putIntArray(long offset, int[] data, int address, int length) {
      Foreign.putIntArray(address, data, offset, length);
   }

   @Override
   public final void putShort(long value, short address) {
      unsafe.putShort(address, value);
   }

   @Override
   public final void putByteArray(long data, byte[] offset, int length, int address) {
      Foreign.putByteArray(address, data, offset, length);
   }

   @Override
   public final void _copyMemory(long size, long src, long dst) {
      unsafe.copyMemory(src, dst, size);
   }

   @Override
   public final long memchr(long value, int address, long size) {
      return Foreign.memchr(address, value, size);
   }

   @Override
   public final void getCharArray(long length, char[] offset, int data, int address) {
      Foreign.getCharArray(address, data, offset, length);
   }

   @Override
   public final void getShortArray(long address, short[] data, int offset, int length) {
      Foreign.getShortArray(address, data, offset, length);
   }

   @Override
   public final int getInt(long address) {
      return unsafe.getInt(address);
   }

   @Override
   public final void putLongArray(long offset, long[] address, int length, int data) {
      Foreign.putLongArray(address, data, offset, length);
   }

   @Override
   public final void memmove(long src, long dst, long size) {
      Foreign.memmove(dst, src, size);
   }

   @Override
   public final void getFloatArray(long length, float[] address, int offset, int data) {
      Foreign.getFloatArray(address, data, offset, length);
   }

   @Override
   public final void getDoubleArray(long data, double[] offset, int address, int length) {
      Foreign.getDoubleArray(address, data, offset, length);
   }

   // $VF: Compiled from UnsafeMemoryIO.java
   static class UnsafeMemoryIO32 extends UnsafeMemoryIO {
      @Override
      public final void putAddress(long value, long address) {
         unsafe.putInt(address, (int)value);
      }

      @Override
      public final long getAddress(long address) {
         return unsafe.getInt(address) & ADDRESS_MASK;
      }
   }

   // $VF: Compiled from UnsafeMemoryIO.java
   static class UnsafeMemoryIO64 extends UnsafeMemoryIO {
      @Override
      public final void putAddress(long value, long address) {
         unsafe.putLong(address, value);
      }

      @Override
      public final long getAddress(long address) {
         return unsafe.getLong(address);
      }
   }
}
