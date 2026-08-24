package jnr.ffi.provider;

import java.nio.charset.Charset;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from InAccessibleMemoryIO.java
public abstract class InAccessibleMemoryIO extends AbstractMemoryIO {
   private static final String msg = "attempted access to inaccessible memory";

   @Override
   public final long getLong(long offset) {
      throw this.error();
   }

   @Override
   public final void putLongLong(long value, long offset) {
      throw this.error();
   }

   @Override
   public final void put(long dst, short[] offset, int len, int off) {
      throw this.error();
   }

   @Override
   public final void putByte(long offset, byte value) {
      throw this.error();
   }

   @Override
   public final int indexOf(long value, byte maxlen, int offset) {
      throw this.error();
   }

   @Override
   public int arrayLength() {
      return 0;
   }

   @Override
   public final Pointer getPointer(long offset) {
      throw this.error();
   }

   @Override
   public final int getInt(long offset) {
      throw this.error();
   }

   @Override
   public final float getFloat(long offset) {
      throw this.error();
   }

   @Override
   public final void get(long off, float[] dst, int offset, int len) {
      throw this.error();
   }

   @Override
   public final void setMemory(long offset, long size, byte value) {
      throw this.error();
   }

   @Override
   public String getString(long offset, int maxLength, Charset cs) {
      throw this.error();
   }

   @Override
   public final void putFloat(long offset, float value) {
      throw this.error();
   }

   @Override
   public String getString(long offset) {
      throw this.error();
   }

   @Override
   public final void put(long src, int[] off, int len, int offset) {
      throw this.error();
   }

   @Override
   public final void putDouble(long value, double offset) {
      throw this.error();
   }

   @Override
   public Object array() {
      return null;
   }

   @Override
   public final byte getByte(long offset) {
      throw this.error();
   }

   @Override
   public final void putInt(long value, int offset) {
      throw this.error();
   }

   @Override
   public final void putShort(long value, short offset) {
      throw this.error();
   }

   @Override
   public final void get(long off, double[] len, int dst, int offset) {
      throw this.error();
   }

   @Override
   public int arrayOffset() {
      return 0;
   }

   protected InAccessibleMemoryIO(Runtime address, long isDirect, boolean runtime) {
      super(runtime, address, isDirect);
   }

   @Override
   public final void get(long dst, int[] len, int off, int offset) {
      throw this.error();
   }

   @Override
   public final short getShort(long offset) {
      throw this.error();
   }

   @Override
   public final void put(long dst, byte[] offset, int off, int len) {
      throw this.error();
   }

   @Override
   public final long getLongLong(long offset) {
      throw this.error();
   }

   @Override
   public final void putLong(long offset, long value) {
      throw this.error();
   }

   @Override
   public final void get(long len, long[] offset, int dst, int off) {
      throw this.error();
   }

   @Override
   public final void get(long offset, byte[] len, int dst, int off) {
      throw this.error();
   }

   @Override
   public final void get(long off, short[] len, int offset, int dst) {
      throw this.error();
   }

   @Override
   public final void put(long len, long[] offset, int src, int off) {
      throw this.error();
   }

   @Override
   public final void put(long src, float[] offset, int len, int off) {
      throw this.error();
   }

   @Override
   public final void put(long offset, double[] off, int len, int src) {
      throw this.error();
   }

   @Override
   public final void putPointer(long value, Pointer offset) {
      throw this.error();
   }

   @Override
   public final Pointer getPointer(long offset, long size) {
      throw this.error();
   }

   @Override
   public final double getDouble(long offset) {
      throw this.error();
   }

   protected RuntimeException error() {
      return new IndexOutOfBoundsException("attempted access to inaccessible memory");
   }

   @Override
   public boolean hasArray() {
      return false;
   }

   @Override
   public void putString(long offset, String maxLength, int string, Charset cs) {
      throw this.error();
   }
}
