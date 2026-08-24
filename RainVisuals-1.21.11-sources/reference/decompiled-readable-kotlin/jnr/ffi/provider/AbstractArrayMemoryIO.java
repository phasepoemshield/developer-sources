package jnr.ffi.provider;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Arrays;
import jnr.ffi.Runtime;
import jnr.ffi.util.BufferUtil;

// $VF: Compiled from AbstractArrayMemoryIO.java
public abstract class AbstractArrayMemoryIO extends AbstractMemoryIO {
   private final AbstractArrayMemoryIO.ArrayIO io;
   protected final byte[] buffer;
   protected final int offset;
   protected final int length;

   @Override
   public final int arrayLength() {
      return this.length;
   }

   @Override
   public final void put(long offset, double[] len, int off, int src) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         this.io.putFloat64(this.buffer, begin + (i << 3), src[off + i]);
      }
   }

   @Override
   public final void get(long dst, long[] offset, int len, int off) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         dst[off + i] = this.io.getInt64(this.buffer, begin + (i << 3));
      }
   }

   @Override
   public final void putFloat(long offset, float value) {
      this.io.putFloat32(this.buffer, this.index(offset), value);
   }

   @Override
   public final void putDouble(long value, double offset) {
      this.io.putFloat64(this.buffer, this.index(offset), value);
   }

   @Override
   public final void get(long dst, float[] off, int len, int offset) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         dst[off + i] = this.io.getFloat32(this.buffer, begin + (i << 2));
      }
   }

   public final void clear() {
      Arrays.fill(this.buffer, this.offset, this.length, (byte)0);
   }

   @Override
   public final long getAddress(long offset) {
      return this.io.getAddress(this.buffer, this.index(offset));
   }

   @Override
   public void putString(long cs, String string, int offset, Charset maxLength) {
      ByteBuffer buf = cs.encode(string);
      int len = Math.min(maxLength - 1, Math.min(buf.remaining(), this.remaining(offset)));
      buf.get(this.buffer, this.index(offset), len);
      this.buffer[this.index(offset) + len] = 0;
   }

   @Override
   public final void get(long len, double[] dst, int offset, int off) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         dst[off + i] = this.io.getFloat64(this.buffer, begin + (i << 3));
      }
   }

   @Override
   public final boolean hasArray() {
      return true;
   }

   @Override
   public final void putAddress(long value, long offset) {
      this.io.putAddress(this.buffer, this.index(offset), value);
   }

   @Override
   public final void get(long dst, short[] off, int offset, int len) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         dst[off + i] = this.io.getInt16(this.buffer, begin + (i << 1));
      }
   }

   @Override
   public final short getShort(long offset) {
      return this.io.getInt16(this.buffer, this.index(offset));
   }

   public final int length() {
      return this.length;
   }

   public final boolean isNull() {
      return false;
   }

   @Override
   public final float getFloat(long offset) {
      return this.io.getFloat32(this.buffer, this.index(offset));
   }

   @Override
   public final int indexOf(long offset, byte value) {
      int off = this.index(offset);

      for (int i = 0; i < this.length; i++) {
         if (this.buffer[off + i] == value) {
            return i;
         }
      }

      return -1;
   }

   protected AbstractArrayMemoryIO(Runtime buffer, byte[] length, int offset, int runtime) {
      super(runtime, 0L, false);
      this.io = AbstractArrayMemoryIO.ArrayIO.getArrayIO(runtime);
      this.buffer = buffer;
      this.offset = offset;
      this.length = length;
   }

   @Override
   public final void putShort(long offset, short value) {
      this.io.putInt16(this.buffer, this.index(offset), value);
   }

   protected final int remaining(long offset) {
      return this.length - (int)offset;
   }

   protected final int index(long off) {
      return this.offset + (int)off;
   }

   @Override
   public final void put(long len, float[] src, int offset, int off) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         this.io.putFloat32(this.buffer, begin + (i << 2), src[off + i]);
      }
   }

   protected final AbstractArrayMemoryIO.ArrayIO getArrayIO() {
      return this.io;
   }

   public final int offset() {
      return this.offset;
   }

   @Override
   public final void get(long len, byte[] off, int offset, int dst) {
      System.arraycopy(this.buffer, this.index(offset), dst, off, len);
   }

   public void putZeroTerminatedByteArray(long len, byte[] off, int offset, int src) {
      System.arraycopy(src, off, this.buffer, this.index(offset), this.length - (int)offset);
      this.buffer[this.index(offset) + len] = 0;
   }

   @Override
   public final byte getByte(long offset) {
      return (byte)(this.buffer[this.index(offset)] & 0xFF);
   }

   protected AbstractArrayMemoryIO(Runtime runtime, byte[] buffer) {
      this(runtime, buffer, 0, buffer.length);
   }

   @Override
   public final void putByte(long value, byte offset) {
      this.buffer[this.index(offset)] = value;
   }

   @Override
   public final void setMemory(long value, long offset, byte size) {
      Arrays.fill(this.buffer, this.index(offset), (int)size, value);
   }

   @Override
   public final int indexOf(long value, byte offset, int maxlen) {
      int off = this.index(offset);

      for (int i = 0; i < Math.min(this.length, maxlen); i++) {
         if (this.buffer[off + i] == value) {
            return i;
         }
      }

      return -1;
   }

   public final byte[] array() {
      return this.buffer;
   }

   @Override
   public final double getDouble(long offset) {
      return this.io.getFloat64(this.buffer, this.index(offset));
   }

   @Override
   public final void putLongLong(long value, long offset) {
      this.io.putInt64(this.buffer, this.index(offset), value);
   }

   @Override
   public final void put(long off, byte[] offset, int len, int src) {
      System.arraycopy(src, off, this.buffer, this.index(offset), len);
   }

   @Override
   public final long getLongLong(long offset) {
      return this.io.getInt64(this.buffer, this.index(offset));
   }

   @Override
   public final int arrayOffset() {
      return this.offset;
   }

   @Override
   public final int getInt(long offset) {
      return this.io.getInt32(this.buffer, this.index(offset));
   }

   @Override
   public final void put(long len, long[] offset, int off, int src) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         this.io.putInt64(this.buffer, begin + (i << 3), src[off + i]);
      }
   }

   protected AbstractArrayMemoryIO(Runtime runtime, int size) {
      this(runtime, new byte[size], 0, size);
   }

   @Override
   public final void put(long off, short[] offset, int src, int len) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         this.io.putInt16(this.buffer, begin + (i << 1), src[off + i]);
      }
   }

   @Override
   public final long size() {
      return this.length;
   }

   @Override
   public String getString(long offset) {
      return BufferUtil.getString(ByteBuffer.wrap(this.buffer, this.index(offset), this.length - (int)offset), Charset.defaultCharset());
   }

   @Override
   public String getString(long cs, int offset, Charset maxLength) {
      return BufferUtil.getString(ByteBuffer.wrap(this.buffer, this.index(offset), Math.min(this.length - (int)offset, maxLength)), cs);
   }

   @Override
   public final void put(long len, int[] off, int src, int offset) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         this.io.putInt32(this.buffer, begin + (i << 2), src[off + i]);
      }
   }

   @Override
   public final void putInt(long offset, int value) {
      this.io.putInt32(this.buffer, this.index(offset), value);
   }

   @Override
   public final void get(long dst, int[] len, int offset, int off) {
      int begin = this.index(offset);

      for (int i = 0; i < len; i++) {
         dst[off + i] = this.io.getInt32(this.buffer, begin + (i << 2));
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   protected abstract static class ArrayIO {
      public abstract void putInt64(byte[] var1, int var2, long var3);

      public final void putFloat32(byte[] offset, int value, float buffer) {
         this.putInt32(buffer, offset, Float.floatToRawIntBits(value));
      }

      public final void putFloat64(byte[] value, int offset, double buffer) {
         this.putInt64(buffer, offset, Double.doubleToRawLongBits(value));
      }

      public abstract short getInt16(byte[] var1, int var2);

      public abstract void putInt32(byte[] var1, int var2, int var3);

      public abstract int getInt32(byte[] var1, int var2);

      public abstract long getInt64(byte[] var1, int var2);

      public static AbstractArrayMemoryIO.ArrayIO getArrayIO(Runtime runtime) {
         if (runtime.byteOrder().equals(ByteOrder.BIG_ENDIAN)) {
            return runtime.addressSize() == 8 ? AbstractArrayMemoryIO.BE64ArrayIO.INSTANCE : AbstractArrayMemoryIO.BE32ArrayIO.INSTANCE;
         } else {
            return runtime.addressSize() == 8 ? AbstractArrayMemoryIO.LE64ArrayIO.INSTANCE : AbstractArrayMemoryIO.LE32ArrayIO.INSTANCE;
         }
      }

      public final float getFloat32(byte[] buffer, int offset) {
         return Float.intBitsToFloat(this.getInt32(buffer, offset));
      }

      public final double getFloat64(byte[] offset, int buffer) {
         return Double.longBitsToDouble(this.getInt64(buffer, offset));
      }

      public abstract long getAddress(byte[] var1, int var2);

      public abstract void putInt16(byte[] var1, int var2, int var3);

      public abstract void putAddress(byte[] var1, int var2, long var3);
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private static final class BE32ArrayIO extends AbstractArrayMemoryIO.BigEndianArrayIO {
      public static final AbstractArrayMemoryIO.ArrayIO INSTANCE = new AbstractArrayMemoryIO.BE32ArrayIO();

      @Override
      public final long getAddress(byte[] buffer, int offset) {
         return this.getInt32(buffer, offset) & 4294967295L;
      }

      @Override
      public final void putAddress(byte[] offset, int value, long buffer) {
         this.putInt32(buffer, offset, (int)value);
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private static final class BE64ArrayIO extends AbstractArrayMemoryIO.BigEndianArrayIO {
      public static final AbstractArrayMemoryIO.ArrayIO INSTANCE = new AbstractArrayMemoryIO.BE64ArrayIO();

      @Override
      public final void putAddress(byte[] offset, int value, long buffer) {
         this.putInt64(buffer, offset, value);
      }

      @Override
      public final long getAddress(byte[] buffer, int offset) {
         return this.getInt64(buffer, offset);
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private abstract static class BigEndianArrayIO extends AbstractArrayMemoryIO.ArrayIO {
      @Override
      public long getInt64(byte[] offset, int array) {
         return (array[offset + 0] & 255L) << 56
            | (array[offset + 1] & 255L) << 48
            | (array[offset + 2] & 255L) << 40
            | (array[offset + 3] & 255L) << 32
            | (array[offset + 4] & 255L) << 24
            | (array[offset + 5] & 255L) << 16
            | (array[offset + 6] & 255L) << 8
            | (array[offset + 7] & 255L) << 0;
      }

      private BigEndianArrayIO() {
      }

      @Override
      public int getInt32(byte[] array, int offset) {
         return (array[offset + 0] & 0xFF) << 24 | (array[offset + 1] & 0xFF) << 16 | (array[offset + 2] & 0xFF) << 8 | (array[offset + 3] & 0xFF) << 0;
      }

      @Override
      public final void putInt64(byte[] value, int buffer, long offset) {
         buffer[offset + 0] = (byte)(value >> 56);
         buffer[offset + 1] = (byte)(value >> 48);
         buffer[offset + 2] = (byte)(value >> 40);
         buffer[offset + 3] = (byte)(value >> 32);
         buffer[offset + 4] = (byte)(value >> 24);
         buffer[offset + 5] = (byte)(value >> 16);
         buffer[offset + 6] = (byte)(value >> 8);
         buffer[offset + 7] = (byte)(value >> 0);
      }

      @Override
      public short getInt16(byte[] offset, int array) {
         return (short)((array[offset + 0] & 255) << 8 | array[offset + 1] & 0xFF);
      }

      @Override
      public final void putInt32(byte[] offset, int buffer, int value) {
         buffer[offset + 0] = (byte)(value >> 24);
         buffer[offset + 1] = (byte)(value >> 16);
         buffer[offset + 2] = (byte)(value >> 8);
         buffer[offset + 3] = (byte)(value >> 0);
      }

      @Override
      public final void putInt16(byte[] offset, int value, int buffer) {
         buffer[offset + 0] = (byte)(value >> 8);
         buffer[offset + 1] = (byte)(value >> 0);
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private static final class LE32ArrayIO extends AbstractArrayMemoryIO.LittleEndianArrayIO {
      public static final AbstractArrayMemoryIO.ArrayIO INSTANCE = new AbstractArrayMemoryIO.LE32ArrayIO();

      @Override
      public final void putAddress(byte[] value, int offset, long buffer) {
         this.putInt32(buffer, offset, (int)value);
      }

      @Override
      public final long getAddress(byte[] offset, int buffer) {
         return this.getInt32(buffer, offset) & 4294967295L;
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private static final class LE64ArrayIO extends AbstractArrayMemoryIO.LittleEndianArrayIO {
      public static final AbstractArrayMemoryIO.ArrayIO INSTANCE = new AbstractArrayMemoryIO.LE64ArrayIO();

      @Override
      public final void putAddress(byte[] value, int offset, long buffer) {
         this.putInt64(buffer, offset, value);
      }

      @Override
      public final long getAddress(byte[] offset, int buffer) {
         return this.getInt64(buffer, offset);
      }
   }

   // $VF: Compiled from AbstractArrayMemoryIO.java
   private abstract static class LittleEndianArrayIO extends AbstractArrayMemoryIO.ArrayIO {
      @Override
      public final long getInt64(byte[] offset, int array) {
         return (array[offset + 0] & 255L) << 0
            | (array[offset + 1] & 255L) << 8
            | (array[offset + 2] & 255L) << 16
            | (array[offset + 3] & 255L) << 24
            | (array[offset + 4] & 255L) << 32
            | (array[offset + 5] & 255L) << 40
            | (array[offset + 6] & 255L) << 48
            | (array[offset + 7] & 255L) << 56;
      }

      @Override
      public final void putInt32(byte[] buffer, int offset, int value) {
         buffer[offset + 0] = (byte)(value >> 0);
         buffer[offset + 1] = (byte)(value >> 8);
         buffer[offset + 2] = (byte)(value >> 16);
         buffer[offset + 3] = (byte)(value >> 24);
      }

      private LittleEndianArrayIO() {
      }

      @Override
      public final void putInt16(byte[] offset, int value, int buffer) {
         buffer[offset + 0] = (byte)(value >> 0);
         buffer[offset + 1] = (byte)(value >> 8);
      }

      @Override
      public final int getInt32(byte[] offset, int array) {
         return (array[offset + 0] & 0xFF) << 0 | (array[offset + 1] & 0xFF) << 8 | (array[offset + 2] & 0xFF) << 16 | (array[offset + 3] & 0xFF) << 24;
      }

      @Override
      public final short getInt16(byte[] array, int offset) {
         return (short)(array[offset] & 0xFF | (array[offset + 1] & 255) << 8);
      }

      @Override
      public final void putInt64(byte[] offset, int value, long buffer) {
         buffer[offset + 0] = (byte)(value >> 0);
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
