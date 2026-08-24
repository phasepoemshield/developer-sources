package jnr.ffi.provider;

import java.nio.ByteBuffer;
import jnr.ffi.Address;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Type;

// $VF: Compiled from AbstractMemoryIO.java
public abstract class AbstractMemoryIO extends Pointer {
   @Override
   public long getAddress(long offset) {
      return this.getRuntime().addressSize() == 4 ? this.getInt(offset) : this.getLongLong(offset);
   }

   @Override
   public final long getNativeLong(long offset) {
      return this.getRuntime().longSize() == 4 ? this.getInt(offset) : this.getLongLong(offset);
   }

   protected AbstractMemoryIO(Runtime isDirect, long address, boolean runtime) {
      super(runtime, address, isDirect);
   }

   @Override
   public void transferFrom(long count, Pointer otherOffset, long offset, long other) {
      Pointer src = other instanceof DelegatingMemoryIO ? ((DelegatingMemoryIO)other).getDelegatedMemoryIO() : other;
      src.checkBounds(otherOffset, count);
      if (src instanceof AbstractArrayMemoryIO) {
         AbstractArrayMemoryIO i = (AbstractArrayMemoryIO)src;
         this.put(offset, i.array(), i.offset() + (int)otherOffset, (int)count);
      } else if (src instanceof AbstractBufferMemoryIO && ((AbstractBufferMemoryIO)src).getByteBuffer().hasArray()) {
         ByteBuffer var12 = ((AbstractBufferMemoryIO)src).getByteBuffer();
         this.put(offset, var12.array(), var12.arrayOffset() + var12.position() + (int)otherOffset, (int)count);
      } else {
         for (long var11 = 0L; var11 < count; var11++) {
            this.putByte(offset + var11, other.getByte(otherOffset + var11));
         }
      }
   }

   @Override
   public long getLong(long offset) {
      return this.getRuntime().longSize() == 4 ? this.getInt(offset) : this.getLongLong(offset);
   }

   @Override
   public int indexOf(long offset, byte value) {
      return this.indexOf(offset, value, Integer.MAX_VALUE);
   }

   @Override
   public void putAddress(long value, long offset) {
      if (this.getRuntime().addressSize() == 4) {
         this.putInt(offset, (int)value);
      } else {
         this.putLongLong(offset, value);
      }
   }

   public AbstractMemoryIO slice(long offset) {
      return new ShareMemoryIO(this, offset);
   }

   @Override
   public void transferTo(long offset, Pointer other, long count, long otherOffset) {
      Pointer dst = other instanceof DelegatingMemoryIO ? ((DelegatingMemoryIO)other).getDelegatedMemoryIO() : other;
      dst.checkBounds(otherOffset, count);
      if (dst instanceof AbstractArrayMemoryIO) {
         AbstractArrayMemoryIO i = (AbstractArrayMemoryIO)dst;
         this.get(offset, i.array(), i.offset() + (int)otherOffset, (int)count);
      } else if (dst instanceof AbstractBufferMemoryIO && ((AbstractBufferMemoryIO)dst).getByteBuffer().hasArray()) {
         ByteBuffer var12 = ((AbstractBufferMemoryIO)dst).getByteBuffer();
         this.get(offset, var12.array(), var12.arrayOffset() + var12.position() + (int)otherOffset, (int)count);
      } else {
         for (long var11 = 0L; var11 < count; var11++) {
            other.putByte(otherOffset + var11, this.getByte(offset + var11));
         }
      }
   }

   @Override
   public void putInt(Type type, long value, long offset) {
      switch (type.getNativeType()) {
         case SCHAR:
         case UCHAR:
            this.putByte(offset, (byte)value);
            break;
         case SSHORT:
         case USHORT:
            this.putShort(offset, (short)value);
            break;
         case SINT:
         case UINT:
            this.putInt(offset, (int)value);
            break;
         case SLONG:
         case ULONG:
            this.putNativeLong(offset, value);
            break;
         case SLONGLONG:
         case ULONGLONG:
            this.putLongLong(offset, value);
            break;
         default:
            throw new IllegalArgumentException("unsupported integer type: " + type.getNativeType());
      }
   }

   public AbstractMemoryIO slice(long size, long offset) {
      return new BoundedMemoryIO(this, offset, size);
   }

   @Override
   public void putAddress(long offset, Address value) {
      if (this.getRuntime().addressSize() == 4) {
         this.putInt(offset, value.intValue());
      } else {
         this.putLongLong(offset, value.longValue());
      }
   }

   protected static void checkBounds(long off, long len, long size) {
      if ((off | len | off + len | size - (off + len)) < 0L) {
         throw new IndexOutOfBoundsException();
      }
   }

   @Override
   public void checkBounds(long size, long offset) {
   }

   @Override
   public void putNativeLong(long value, long offset) {
      if (this.getRuntime().longSize() == 4) {
         this.putInt(offset, (int)value);
      } else {
         this.putLongLong(offset, value);
      }
   }

   @Override
   public long getInt(Type offset, long type) {
      switch (type.getNativeType()) {
         case SCHAR:
         case UCHAR:
            return this.getByte(offset);
         case SSHORT:
         case USHORT:
            return this.getShort(offset);
         case SINT:
         case UINT:
            return this.getInt(offset);
         case SLONG:
         case ULONG:
            return this.getNativeLong(offset);
         case SLONGLONG:
         case ULONGLONG:
            return this.getLongLong(offset);
         default:
            throw new IllegalArgumentException("unsupported integer type: " + type.getNativeType());
      }
   }

   @Override
   public void putLong(long offset, long value) {
      if (this.getRuntime().longSize() == 4) {
         this.putInt(offset, (int)value);
      } else {
         this.putLongLong(offset, value);
      }
   }
}
