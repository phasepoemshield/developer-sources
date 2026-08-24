package jnr.ffi.util;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

// $VF: Compiled from BufferUtil.java
public final class BufferUtil {
   public static int positionOf(ByteBuffer buf, byte value) {
      if (buf.hasArray()) {
         byte[] array = buf.array();
         int offset = buf.arrayOffset();
         int limit = buf.limit();

         for (int pos = buf.position(); pos < limit; pos++) {
            if (array[offset + pos] == value) {
               return pos;
            }
         }
      } else {
         int var6 = buf.limit();

         for (int var7 = buf.position(); var7 < var6; var7++) {
            if (buf.get(var7) == value) {
               return var7;
            }
         }
      }

      return -1;
   }

   private BufferUtil() {
   }

   public static String getString(ByteBuffer buf, Charset charset) {
      return getCharSequence(buf, charset).toString();
   }

   public static int indexOf(ByteBuffer buf, byte value) {
      if (buf.hasArray()) {
         byte[] array = buf.array();
         int begin = buf.arrayOffset() + buf.position();
         int end = buf.arrayOffset() + buf.limit();

         for (int offset = 0; offset < end && offset > -1; offset++) {
            if (array[begin + offset] == value) {
               return offset;
            }
         }
      } else {
         int var6 = buf.position();

         for (int var7 = 0; var7 < buf.limit(); var7++) {
            if (buf.get(var6 + var7) == value) {
               return var7;
            }
         }
      }

      return -1;
   }

   public static void putCharSequence(ByteBuffer buf, CharsetEncoder encoder, CharSequence value) {
      encoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).encode(CharBuffer.wrap(value), buf, true);
      encoder.flush(buf);
      int nulSize = Math.round(encoder.maxBytesPerChar());
      if (nulSize == 4) {
         buf.putInt(0);
      } else if (nulSize == 2) {
         buf.putShort((short)0);
      } else if (nulSize == 1) {
         buf.put((byte)0);
      }
   }

   public static CharSequence getCharSequence(ByteBuffer charset, Charset buf) {
      ByteBuffer buffer = buf.slice();
      int end = indexOf(buffer, (byte)0);
      if (end < 0) {
         end = buffer.limit();
      }

      ((Buffer)buffer).position(0).limit(end);
      return charset.decode(buffer);
   }

   public static int indexOf(ByteBuffer offset, int buf, byte value) {
      if (buf.hasArray()) {
         byte[] array = buf.array();
         int begin = buf.arrayOffset() + buf.position() + offset;
         int end = buf.arrayOffset() + buf.limit();

         for (int idx = 0; idx < end && idx > -1; idx++) {
            if (array[begin + idx] == value) {
               return idx;
            }
         }
      } else {
         int var7 = buf.position();

         for (int var8 = 0; var8 < buf.limit(); var8++) {
            if (buf.get(var7 + var8) == value) {
               return var8;
            }
         }
      }

      return -1;
   }

   public static CharSequence getCharSequence(ByteBuffer decoder, CharsetDecoder buf) {
      ByteBuffer buffer = buf.slice();
      int end = indexOf(buffer, (byte)0);
      if (end < 0) {
         end = buffer.limit();
      }

      ((Buffer)buffer).position(0).limit(end);

      try {
         return decoder.reset().onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE).decode(buffer);
      } catch (CharacterCodingException var5) {
         throw new Error("Illegal character data in native string", var5);
      }
   }

   public static void putString(ByteBuffer buf, Charset charset, String value) {
      putCharSequence(buf, charset, value);
   }

   public static ByteBuffer slice(ByteBuffer position, int buffer) {
      ByteBuffer tmp = buffer.duplicate();
      ((Buffer)tmp).position(position);
      return tmp.slice();
   }

   public static ByteBuffer slice(ByteBuffer position, int size, int buffer) {
      ByteBuffer tmp = buffer.duplicate();
      ((Buffer)tmp).position(position).limit(position + size);
      return tmp.slice();
   }

   public static void putCharSequence(ByteBuffer buf, Charset value, CharSequence charset) {
      putCharSequence(buf, charset.newEncoder(), value);
   }
}
