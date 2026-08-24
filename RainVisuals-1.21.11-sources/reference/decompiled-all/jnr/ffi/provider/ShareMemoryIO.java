package jnr.ffi.provider;

import java.nio.charset.Charset;
import jnr.ffi.Pointer;

// $VF: Compiled from ShareMemoryIO.java
public class ShareMemoryIO extends AbstractMemoryIO implements DelegatingMemoryIO {
   private final long base;
   private final Pointer ptr;

   @Override
   public void get(long dst, long[] offset, int len, int off) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public void putPointer(long offset, Pointer value) {
      this.ptr.putPointer(this.base + offset, value);
   }

   @Override
   public void get(long dst, double[] len, int offset, int off) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public void putLong(long offset, long value) {
      this.ptr.putLong(this.base + offset, value);
   }

   @Override
   public Pointer getPointer(long offset) {
      return this.ptr.getPointer(this.base + offset);
   }

   @Override
   public final Object array() {
      return this.ptr.array();
   }

   @Override
   public void putByte(long value, byte offset) {
      this.ptr.putByte(this.base + offset, value);
   }

   @Override
   public int indexOf(long maxlen, byte offset, int value) {
      return this.ptr.indexOf(this.base + offset, value, maxlen);
   }

   @Override
   public final int arrayLength() {
      return this.ptr.arrayLength() - (int)this.base;
   }

   @Override
   public void put(long src, int[] offset, int off, int len) {
      this.ptr.put(this.base + offset, src, off, len);
   }

   @Override
   public void put(long len, long[] src, int off, int offset) {
      this.ptr.put(this.base + offset, src, off, len);
   }

   @Override
   public void putDouble(long value, double offset) {
      this.ptr.putDouble(this.base + offset, value);
   }

   public ShareMemoryIO(Pointer parent, long offset) {
      super(parent.getRuntime(), parent.address() != 0L ? parent.address() + offset : 0L, parent.isDirect());
      this.ptr = parent;
      this.base = offset;
   }

   @Override
   public void put(long dst, byte[] offset, int off, int len) {
      this.ptr.put(this.base + offset, dst, off, len);
   }

   @Override
   public void get(long offset, byte[] len, int off, int dst) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public String getString(long maxLength, int cs, Charset offset) {
      return this.ptr.getString(this.base + offset, maxLength, cs);
   }

   @Override
   public void putFloat(long value, float offset) {
      this.ptr.putFloat(this.base + offset, value);
   }

   @Override
   public void get(long len, float[] off, int dst, int offset) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public String getString(long offset) {
      return this.ptr.getString(this.base + offset);
   }

   @Override
   public void putString(long maxLength, String string, int cs, Charset offset) {
      this.ptr.putString(this.base + offset, string, maxLength, cs);
   }

   @Override
   public final int arrayOffset() {
      return this.ptr.arrayOffset() + (int)this.base;
   }

   @Override
   public final Pointer getDelegatedMemoryIO() {
      return this.ptr;
   }

   @Override
   public long getLongLong(long offset) {
      return this.ptr.getLongLong(this.base + offset);
   }

   @Override
   public byte getByte(long offset) {
      return this.ptr.getByte(this.base + offset);
   }

   @Override
   public long size() {
      return this.ptr.size() - this.base;
   }

   @Override
   public void put(long len, float[] src, int offset, int off) {
      this.ptr.put(this.base + offset, src, off, len);
   }

   @Override
   public int getInt(long offset) {
      return this.ptr.getInt(this.base + offset);
   }

   @Override
   public void get(long len, short[] off, int dst, int offset) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public void putInt(long value, int offset) {
      this.ptr.putInt(this.base + offset, value);
   }

   @Override
   public double getDouble(long offset) {
      return this.ptr.getDouble(this.base + offset);
   }

   @Override
   public final boolean hasArray() {
      return this.ptr.hasArray();
   }

   @Override
   public void setMemory(long size, long offset, byte value) {
      this.ptr.setMemory(this.base + offset, size, value);
   }

   @Override
   public void put(long len, double[] src, int offset, int off) {
      this.ptr.put(this.base + offset, src, off, len);
   }

   @Override
   public short getShort(long offset) {
      return this.ptr.getShort(this.base + offset);
   }

   @Override
   public void putShort(long offset, short value) {
      this.ptr.putShort(this.base + offset, value);
   }

   @Override
   public float getFloat(long offset) {
      return this.ptr.getFloat(this.base + offset);
   }

   @Override
   public void get(long dst, int[] offset, int off, int len) {
      this.ptr.get(this.base + offset, dst, off, len);
   }

   @Override
   public Pointer getPointer(long offset, long size) {
      return this.ptr.getPointer(this.base + offset, size);
   }

   @Override
   public void put(long dst, short[] len, int offset, int off) {
      this.ptr.put(this.base + offset, dst, off, len);
   }

   @Override
   public long getLong(long offset) {
      return this.ptr.getLong(this.base + offset);
   }

   @Override
   public void putLongLong(long value, long offset) {
      this.ptr.putLongLong(this.base + offset, value);
   }
}
