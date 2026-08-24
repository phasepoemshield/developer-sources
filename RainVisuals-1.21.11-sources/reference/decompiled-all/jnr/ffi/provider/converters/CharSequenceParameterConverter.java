package jnr.ffi.provider.converters;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import java.util.Arrays;
import java.util.Collection;
import jnr.ffi.annotations.Encoding;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.NulTerminate;
import jnr.ffi.mapper.MethodParameterContext;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;

// $VF: Compiled from CharSequenceParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class CharSequenceParameterConverter implements ToNativeConverter<CharSequence, ByteBuffer> {
   private final ThreadLocal<Reference<CharsetEncoder>> localEncoder = new ThreadLocal<>();
   private final Charset charset;
   private static final ToNativeConverter<CharSequence, ByteBuffer> DEFAULT = new CharSequenceParameterConverter(Charset.defaultCharset());

   public static ToNativeConverter<CharSequence, ByteBuffer> getInstance(ToNativeContext toNativeContext) {
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

      return getInstance(charset, toNativeContext);
   }

   private CharSequenceParameterConverter(Charset charset) {
      this.charset = charset;
   }

   @NulTerminate
   @In
   @Override
   public Class<ByteBuffer> nativeType() {
      return ByteBuffer.class;
   }

   private static Charset getEncodingCharset(Collection<Annotation> annotations) {
      for (Annotation a : annotations) {
         if (a instanceof Encoding) {
            return Charset.forName(((Encoding)a).value());
         }
      }

      return null;
   }

   public static ToNativeConverter<CharSequence, ByteBuffer> getInstance(Charset charset, ToNativeContext toNativeContext) {
      return Charset.defaultCharset().equals(charset) ? DEFAULT : new CharSequenceParameterConverter(charset);
   }

   private static ByteBuffer grow(ByteBuffer oldBuffer) {
      ByteBuffer buf = ByteBuffer.wrap(new byte[oldBuffer.capacity() * 2]);
      ((Buffer)oldBuffer).flip();
      buf.put(oldBuffer);
      return buf;
   }

   public ByteBuffer toNative(CharSequence string, ToNativeContext context) {
      if (string == null) {
         return null;
      }

      CharsetEncoder encoder = StringUtil.getEncoder(this.charset, this.localEncoder);
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[(int)(string.length() * encoder.averageBytesPerChar()) + 4]);
      CharBuffer charBuffer = CharBuffer.wrap(string);
      encoder.reset();

      while (charBuffer.hasRemaining()) {
         CoderResult result = encoder.encode(charBuffer, byteBuffer, true);
         if (result.isUnderflow() && (result = encoder.flush(byteBuffer)).isUnderflow()) {
            break;
         }

         if (result.isOverflow()) {
            byteBuffer = grow(byteBuffer);
         } else {
            StringUtil.throwException(result);
         }
      }

      if (byteBuffer.remaining() <= 4) {
         byteBuffer = grow(byteBuffer);
      }

      ((Buffer)byteBuffer).position(byteBuffer.position() + 4);
      ((Buffer)byteBuffer).flip();
      return byteBuffer;
   }
}
