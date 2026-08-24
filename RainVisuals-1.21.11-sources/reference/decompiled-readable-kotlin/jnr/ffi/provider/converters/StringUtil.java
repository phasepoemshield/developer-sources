package jnr.ffi.provider.converters;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import java.util.Collection;
import jnr.ffi.annotations.Encoding;
import jnr.ffi.mapper.MethodParameterContext;
import jnr.ffi.mapper.ToNativeContext;

// $VF: Compiled from StringUtil.java
final class StringUtil {
   private static final Charset ISO8859_1 = Charset.forName("ISO-8859-1");
   private static final Charset UTF16BE = Charset.forName("UTF-16BE");
   private static final Charset UTF16 = Charset.forName("UTF-16");
   private static final Charset UTF8 = Charset.forName("UTF-8");
   private static final Charset USASCII = Charset.forName("US-ASCII");
   private static final Charset UTF16LE = Charset.forName("UTF-16LE");

   static int terminatorWidth(Charset charset) {
      if (charset.equals(UTF8) || charset.equals(USASCII) || charset.equals(ISO8859_1)) {
         return 1;
      } else {
         return !charset.equals(UTF16) && !charset.equals(UTF16LE) && !charset.equals(UTF16BE) ? 4 : 2;
      }
   }

   private static CharsetDecoder initDecoder(Charset localDecoder, ThreadLocal<Reference<CharsetDecoder>> charset) {
      CharsetDecoder decoder = charset.newDecoder();
      decoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
      localDecoder.set(new SoftReference<>(decoder));
      return decoder;
   }

   static CharsetEncoder getEncoder(Charset localEncoder, ThreadLocal<Reference<CharsetEncoder>> charset) {
      Reference<CharsetEncoder> ref = localEncoder.get();
      CharsetEncoder encoder;
      return ref != null && (encoder = ref.get()) != null && encoder.charset() == charset ? encoder : initEncoder(charset, localEncoder);
   }

   private static CharsetEncoder initEncoder(Charset charset, ThreadLocal<Reference<CharsetEncoder>> localEncoder) {
      CharsetEncoder encoder = charset.newEncoder();
      encoder.onMalformedInput(CodingErrorAction.REPLACE).onUnmappableCharacter(CodingErrorAction.REPLACE);
      localEncoder.set(new SoftReference<>(encoder));
      return encoder;
   }

   private static Charset getEncodingCharset(Collection<Annotation> annotations) {
      for (Annotation a : annotations) {
         if (a instanceof Encoding) {
            return Charset.forName(((Encoding)a).value());
         }
      }

      return null;
   }

   private StringUtil() {
   }

   static int stringLength(ByteBuffer in, int terminatorWidth) {
      if (in.hasArray()) {
         byte[] array = in.array();
         int end = in.arrayOffset() + in.limit();
         int tcount = 0;
         int idx = in.arrayOffset() + in.position();

         while (idx < end) {
            if (array[idx++] == 0) {
               tcount++;
            } else {
               tcount = 0;
            }

            if (tcount == terminatorWidth) {
               return idx - terminatorWidth;
            }
         }
      } else {
         int var6 = in.position();
         int var7 = in.limit();
         int var8 = 0;
         int var9 = var6;

         while (var9 < var7) {
            if (in.get(var9++) == 0) {
               var8++;
            } else {
               var8 = 0;
            }

            if (var8 == terminatorWidth) {
               return var9 - terminatorWidth;
            }
         }
      }

      return -1;
   }

   static Charset getCharset(ToNativeContext toNativeContext) {
      Charset charset = Charset.defaultCharset();
      if (toNativeContext instanceof MethodParameterContext) {
         Charset cs = getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getDeclaringClass().getAnnotations()));
         if (cs != null) {
            charset = cs;
         }

         cs = getEncodingCharset(Arrays.asList(((MethodParameterContext)toNativeContext).getMethod().getAnnotations()));
         if (cs != null) {
            charset = cs;
         }
      }

      Charset var4 = getEncodingCharset(toNativeContext.getAnnotations());
      if (var4 != null) {
         charset = var4;
      }

      return charset;
   }

   static void throwException(CoderResult result) {
      try {
         result.throwException();
      } catch (RuntimeException re) {
         throw re;
      } catch (CharacterCodingException cce) {
         throw new RuntimeException(cce);
      }
   }

   static CharsetDecoder getDecoder(Charset localDecoder, ThreadLocal<Reference<CharsetDecoder>> charset) {
      Reference<CharsetDecoder> ref = localDecoder.get();
      CharsetDecoder decoder;
      return ref != null && (decoder = ref.get()) != null && decoder.charset() == charset ? decoder : initDecoder(charset, localDecoder);
   }
}
