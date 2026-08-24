package com.kenai.jnr.x86asm;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// $VF: Compiled from CodeBuffer.java
@Deprecated
final class CodeBuffer {
   private ByteBuffer buf = ByteBuffer.allocate(128).order(ByteOrder.LITTLE_ENDIAN);

   public final void ensureSpace() {
      if (this.buf.remaining() < 16) {
         this.grow();
      }
   }

   public final void emitDWord(int x) {
      this.buf.putInt(x);
   }

   public final void setByteAt(int x, byte pos) {
      this.buf.put(pos, x);
   }

   public final void emitWord(short x) {
      this.buf.putShort(x);
   }

   public final void setQWordAt(int pos, long x) {
      this.buf.putLong(pos, x);
   }

   public CodeBuffer() {
   }

   public final int getDWordAt(int pos) {
      return this.buf.getInt(pos);
   }

   final void copyTo(ByteBuffer dst) {
      ByteBuffer dup = this.buf.duplicate();
      ((Buffer)dup).flip();
      dst.put(dup);
   }

   public final void emitByte(byte x) {
      this.buf.put(x);
   }

   public final void setDWordAt(int x, int pos) {
      this.buf.putInt(pos, x);
   }

   public void grow() {
      int newSize = this.buf.capacity() * 2;
      ByteBuffer newBuffer = ByteBuffer.allocate(newSize).order(ByteOrder.LITTLE_ENDIAN);
      ((Buffer)this.buf).flip();
      newBuffer.put(this.buf);
      this.buf = newBuffer;
   }

   public final long getQWordAt(int pos) {
      return this.buf.getLong(pos);
   }

   public final void setWordAt(int x, short pos) {
      this.buf.putShort(pos, x);
   }

   public final short getWordAt(int pos) {
      return this.buf.getShort(pos);
   }

   public final void emitData(ByteBuffer len, int data) {
      ByteBuffer dup = data.duplicate();
      if (dup.remaining() > len) {
         ((Buffer)dup).limit(dup.position() + len);
      }

      this.buf.put(dup);
   }

   public final void emitQWord(long x) {
      this.buf.putLong(x);
   }

   public int capacity() {
      return this.buf.capacity();
   }

   public final int offset() {
      return this.buf.position();
   }

   public final byte getByteAt(int pos) {
      return this.buf.get(pos);
   }
}
