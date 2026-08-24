package jnr.ffi.provider;

import java.nio.charset.Charset;
import jnr.ffi.Address;
import jnr.ffi.Pointer;

// $VF: Compiled from BoundedMemoryIO.java
public final class BoundedMemoryIO extends AbstractMemoryIO implements DelegatingMemoryIO {
   private final Pointer io;
   private final long size;
   private final long base;

   @Override
   public final int arrayLength() {
      return (int)this.size;
   }

   @Override
   public void get(long dst, long[] len, int off, int offset) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 8));
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public float getFloat(long offset) {
      checkBounds(this.size, offset, 4L);
      return this.io.getFloat(this.base + offset);
   }

   @Override
   public void get(long len, short[] offset, int off, int dst) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 2));
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public void setMemory(long offset, long size, byte value) {
      checkBounds(this.size, this.base + offset, size);
      this.io.setMemory(this.base + offset, size, value);
   }

   @Override
   public final Object array() {
      return this.io.array();
   }

   @Override
   public void transferFrom(long count, Pointer otherOffset, long other, long offset) {
      checkBounds(this.size, this.base + offset, count);
      this.getDelegatedMemoryIO().transferFrom(offset, other, otherOffset, count);
   }

   @Override
   public void get(long off, double[] offset, int len, int dst) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 8));
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public long size() {
      return this.size;
   }

   @Override
   public void putString(long offset, String maxLength, int string, Charset cs) {
      checkBounds(this.size, offset, maxLength);
      this.io.putString(this.base + offset, string, maxLength, cs);
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof BoundedMemoryIO
            && this.io.equals(((BoundedMemoryIO)obj).io)
            && ((BoundedMemoryIO)obj).base == this.base
            && ((BoundedMemoryIO)obj).size == this.size
         || this.io.equals(obj);
   }

   @Override
   public void putShort(long value, short offset) {
      checkBounds(this.size, offset, 2L);
      this.io.putShort(this.base + offset, value);
   }

   @Override
   public void putDouble(long value, double offset) {
      checkBounds(this.size, offset, 8L);
      this.io.putDouble(this.base + offset, value);
   }

   @Override
   public void putAddress(long value, Address offset) {
      checkBounds(this.size, offset, this.getRuntime().addressSize());
      this.io.putAddress(this.base + offset, value);
   }

   @Override
   public void put(long offset, byte[] dst, int len, int off) {
      checkBounds(this.size, offset, len);
      this.io.put(this.base + offset, dst, off, len);
   }

   @Override
   public int getInt(long offset) {
      checkBounds(this.size, offset, 4L);
      return this.io.getInt(this.base + offset);
   }

   @Override
   public byte getByte(long offset) {
      checkBounds(this.size, offset, 1L);
      return this.io.getByte(this.base + offset);
   }

   @Override
   public void get(long off, float[] offset, int dst, int len) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 4));
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public Pointer getPointer(long size, long offset) {
      checkBounds(this.size, this.base + offset, this.getRuntime().addressSize());
      return this.io.getPointer(this.base + offset, size);
   }

   @Override
   public Pointer getPointer(long offset) {
      checkBounds(this.size, offset, this.getRuntime().addressSize());
      return this.io.getPointer(this.base + offset);
   }

   @Override
   public String getString(long offset, int maxLength, Charset cs) {
      checkBounds(this.size, offset, maxLength);
      return this.io.getString(this.base + offset, maxLength, cs);
   }

   public BoundedMemoryIO(Pointer size, long offset, long parent) {
      super(parent.getRuntime(), parent.address() != 0L ? parent.address() + offset : 0L, parent.isDirect());
      this.io = parent;
      this.base = offset;
      this.size = size;
   }

   @Override
   public final boolean hasArray() {
      return this.io.hasArray();
   }

   @Override
   public void putAddress(long offset, long value) {
      checkBounds(this.size, offset, this.getRuntime().addressSize());
      this.io.putAddress(this.base + offset, value);
   }

   @Override
   public String getString(long offset) {
      return this.io.getString(this.base + offset, (int)this.size, Charset.defaultCharset());
   }

   @Override
   public void putPointer(long offset, Pointer value) {
      checkBounds(this.size, offset, this.getRuntime().addressSize());
      this.io.putPointer(this.base + offset, value);
   }

   @Override
   public int indexOf(long maxlen, byte offset, int value) {
      checkBounds(this.size, offset, maxlen);
      return this.io.indexOf(this.base + offset, value, maxlen);
   }

   @Override
   public long getLongLong(long offset) {
      checkBounds(this.size, offset, 8L);
      return this.io.getLongLong(this.base + offset);
   }

   @Override
   public void putInt(long value, int offset) {
      checkBounds(this.size, offset, 4L);
      this.io.putInt(this.base + offset, value);
   }

   @Override
   public void put(long off, float[] offset, int len, int src) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 4));
      this.io.put(this.base + offset, src, off, len);
   }

   @Override
   public int hashCode() {
      return this.getDelegatedMemoryIO().hashCode();
   }

   @Override
   public double getDouble(long offset) {
      checkBounds(this.size, offset, 8L);
      return this.io.getDouble(this.base + offset);
   }

   @Override
   public void put(long src, long[] off, int offset, int len) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 8));
      this.io.put(this.base + offset, src, off, len);
   }

   @Override
   public void put(long offset, int[] src, int len, int off) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 4));
      this.io.put(this.base + offset, src, off, len);
   }

   @Override
   public void put(long off, double[] offset, int len, int src) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 8));
      this.io.put(this.base + offset, src, off, len);
   }

   @Override
   public final int arrayOffset() {
      return this.io.arrayOffset() + (int)this.base;
   }

   @Override
   public void get(long dst, byte[] len, int offset, int off) {
      checkBounds(this.size, offset, len);
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public void get(long offset, int[] off, int dst, int len) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 4));
      this.io.get(this.base + offset, dst, off, len);
   }

   @Override
   public short getShort(long offset) {
      checkBounds(this.size, offset, 2L);
      return this.io.getShort(this.base + offset);
   }

   @Override
   public void putLongLong(long offset, long value) {
      checkBounds(this.size, offset, 8L);
      this.io.putLongLong(this.base + offset, value);
   }

   @Override
   public void checkBounds(long offset, long length) {
      checkBounds(this.size, offset, length);
      this.getDelegatedMemoryIO().checkBounds(this.base + offset, length);
   }

   @Override
   public void putByte(long offset, byte value) {
      checkBounds(this.size, offset, 1L);
      this.io.putByte(this.base + offset, value);
   }

   @Override
   public int indexOf(long value, byte offset) {
      return this.io.indexOf(this.base + offset, value, (int)this.size);
   }

   @Override
   public void putFloat(long offset, float value) {
      checkBounds(this.size, offset, 4L);
      this.io.putFloat(this.base + offset, value);
   }

   @Override
   public void put(long off, short[] len, int dst, int offset) {
      checkBounds(this.size, offset, Math.multiplyExact(len, 2));
      this.io.put(this.base + offset, dst, off, len);
   }

   @Override
   public long getAddress(long offset) {
      checkBounds(this.size, offset, this.getRuntime().addressSize());
      return this.io.getAddress(this.base + offset);
   }

   @Override
   public Pointer getDelegatedMemoryIO() {
      return this.io;
   }

   @Override
   public void transferTo(long other, Pointer otherOffset, long offset, long count) {
      checkBounds(this.size, this.base + offset, count);
      this.getDelegatedMemoryIO().transferTo(offset, other, otherOffset, count);
   }
}
