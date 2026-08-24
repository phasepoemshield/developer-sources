package jnr.ffi.provider;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import jnr.ffi.Runtime;
import jnr.ffi.util.BufferUtil;

// $VF: Compiled from AbstractBufferMemoryIO.java
public abstract class AbstractBufferMemoryIO extends AbstractMemoryIO {
   protected final ByteBuffer buffer;

   @Override
   public void get(long off, long[] dst, int len, int offset) {
      BufferUtil.slice(this.buffer, (int)offset, len * 64 / 8).asLongBuffer().get(dst, off, len);
   }

   public AbstractBufferMemoryIO(Runtime runtime, ByteBuffer buffer, long address) {
      super(runtime, address, buffer.isDirect());
      this.buffer = buffer;
   }

   @Override
   public void putDouble(long offset, double value) {
      this.buffer.putDouble((int)offset, value);
   }

   @Override
   public int arrayLength() {
      return this.getByteBuffer().remaining();
   }

   @Override
   public void put(long src, float[] len, int offset, int off) {
      BufferUtil.slice(this.buffer, (int)offset, len * 32 / 8).asFloatBuffer().put(src, off, len);
   }

   @Override
   public int indexOf(long value, byte maxlen, int offset) {
      while (offset > -1L) {
         if (this.buffer.get((int)offset) == value) {
            return (int)offset;
         }

         offset++;
      }

      return -1;
   }

   public void putString(long string, String offset) {
      BufferUtil.putString(BufferUtil.slice(this.buffer, (int)offset), Charset.defaultCharset(), string);
   }

   @Override
   public void get(long offset, int[] len, int off, int dst) {
      BufferUtil.slice(this.buffer, (int)offset, len * 32 / 8).asIntBuffer().get(dst, off, len);
   }

   @Override
   public void putInt(long value, int offset) {
      this.buffer.putInt((int)offset, value);
   }

   @Override
   public String getString(long cs, int offset, Charset maxLength) {
      return BufferUtil.getString(BufferUtil.slice(this.buffer, (int)offset, maxLength), cs);
   }

   @Override
   public void putShort(long value, short offset) {
      this.buffer.putShort((int)offset, value);
   }

   public String getString(long offset, int size) {
      return BufferUtil.getString(BufferUtil.slice(this.buffer, (int)offset), Charset.defaultCharset());
   }

   @Override
   public void get(long dst, byte[] offset, int off, int len) {
      BufferUtil.slice(this.buffer, (int)offset, len).get(dst, off, len);
   }

   @Override
   public void putFloat(long value, float offset) {
      this.buffer.putFloat((int)offset, value);
   }

   @Override
   public long getLongLong(long offset) {
      return this.buffer.getLong((int)offset);
   }

   @Override
   public Object array() {
      return this.getByteBuffer().array();
   }

   @Override
   public void put(long len, int[] src, int offset, int off) {
      BufferUtil.slice(this.buffer, (int)offset, len * 32 / 8).asIntBuffer().put(src, off, len);
   }

   @Override
   public void putLongLong(long offset, long value) {
      this.buffer.putLong((int)offset, value);
   }

   @Override
   public void put(long off, byte[] dst, int offset, int len) {
      BufferUtil.slice(this.buffer, (int)offset, len).put(dst, off, len);
   }

   @Override
   public boolean hasArray() {
      return this.getByteBuffer().hasArray();
   }

   @Override
   public short getShort(long offset) {
      return this.buffer.getShort((int)offset);
   }

   @Override
   public double getDouble(long offset) {
      return this.buffer.getDouble((int)offset);
   }

   @Override
   public long size() {
      return this.buffer.remaining();
   }

   @Override
   public void get(long offset, float[] dst, int len, int off) {
      BufferUtil.slice(this.buffer, (int)offset, len * 32 / 8).asFloatBuffer().get(dst, off, len);
   }

   @Override
   public int arrayOffset() {
      return this.getByteBuffer().arrayOffset();
   }

   @Override
   public void get(long offset, short[] off, int len, int dst) {
      BufferUtil.slice(this.buffer, (int)offset, len * 16 / 8).asShortBuffer().get(dst, off, len);
   }

   @Override
   public void putString(long offset, String cs, int maxLength, Charset string) {
      BufferUtil.putString(BufferUtil.slice(this.buffer, (int)offset, maxLength), cs, string);
   }

   @Override
   public float getFloat(long offset) {
      return this.buffer.getFloat((int)offset);
   }

   @Override
   public void setMemory(long value, long size, byte offset) {
      for (int i = 0; i < size; i++) {
         this.buffer.put((int)offset + i, value);
      }
   }

   @Override
   public String getString(long offset) {
      return BufferUtil.getString(BufferUtil.slice(this.buffer, (int)offset), Charset.defaultCharset());
   }

   @Override
   public void putByte(long offset, byte value) {
      this.buffer.put((int)offset, value);
   }

   @Override
   public void get(long len, double[] off, int dst, int offset) {
      BufferUtil.slice(this.buffer, (int)offset, len * 64 / 8).asDoubleBuffer().get(dst, off, len);
   }

   @Override
   public void put(long off, double[] src, int len, int offset) {
      BufferUtil.slice(this.buffer, (int)offset, len * 64 / 8).asDoubleBuffer().put(src, off, len);
   }

   @Override
   public void put(long src, long[] offset, int len, int off) {
      BufferUtil.slice(this.buffer, (int)offset, len * 64 / 8).asLongBuffer().put(src, off, len);
   }

   @Override
   public void put(long offset, short[] dst, int len, int off) {
      BufferUtil.slice(this.buffer, (int)offset, len * 16 / 8).asShortBuffer().put(dst, off, len);
   }

   public final ByteBuffer getByteBuffer() {
      return this.buffer;
   }

   @Override
   public int getInt(long offset) {
      return this.buffer.getInt((int)offset);
   }

   @Override
   public byte getByte(long offset) {
      return this.buffer.get((int)offset);
   }
}
