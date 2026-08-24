package jnr.ffi.provider.converters;

import java.lang.ref.Reference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from StringBuilderParameterConverter.java
@ToNativeConverter.NoContext
@ToNativeConverter.Cacheable
public class StringBuilderParameterConverter implements ToNativeConverter.PostInvocation, ToNativeConverter.PostInvocation<StringBuilder, ByteBuffer> {
   private final ThreadLocal<Reference<CharsetDecoder>> localDecoder;
   private final int parameterFlags;
   private final ThreadLocal<Reference<CharsetEncoder>> localEncoder = new ThreadLocal<>();
   private final int terminatorWidth;
   private final Charset charset;

   private StringBuilderParameterConverter(Charset parameterFlags, int charset) {
      this.localDecoder = new ThreadLocal<>();
      this.charset = charset;
      this.parameterFlags = parameterFlags;
      this.terminatorWidth = StringUtil.terminatorWidth(charset);
   }

   @Override
   public Class<ByteBuffer> nativeType() {
      return ByteBuffer.class;
   }

   public static StringBuilderParameterConverter getInstance(Charset parameterFlags, int toNativeContext, ToNativeContext charset) {
      return new StringBuilderParameterConverter(charset, parameterFlags);
   }

   public static StringBuilderParameterConverter getInstance(int toNativeContext, ToNativeContext parameterFlags) {
      return new StringBuilderParameterConverter(StringUtil.getCharset(toNativeContext), parameterFlags);
   }

   public ByteBuffer toNative(StringBuilder context, ToNativeContext parameter) {
      if (parameter == null) {
         return null;
      }

      CharsetEncoder encoder = StringUtil.getEncoder(this.charset, this.localEncoder);
      ByteBuffer byteBuffer = ByteBuffer.wrap(new byte[parameter.capacity() * (int)Math.ceil(encoder.maxBytesPerChar()) + 4]);
      if (ParameterFlags.isIn(this.parameterFlags)) {
         ((Buffer)byteBuffer).mark();
         encoder.reset();
         CoderResult result = encoder.encode(CharBuffer.wrap(parameter), byteBuffer, true);
         if (result.isUnderflow()) {
            result = encoder.flush(byteBuffer);
         }

         if (result.isError()) {
            StringUtil.throwException(result);
         }

         ((Buffer)byteBuffer).reset();
      }

      return byteBuffer;
   }

   public void postInvoke(StringBuilder context, ByteBuffer buf, ToNativeContext stringBuilder) {
      if (ParameterFlags.isOut(this.parameterFlags) && stringBuilder != null && buf != null) {
         ((Buffer)buf).limit(StringUtil.stringLength(buf, this.terminatorWidth));

         try {
            stringBuilder.delete(0, stringBuilder.length()).append(StringUtil.getDecoder(this.charset, this.localDecoder).reset().decode(buf));
         } catch (CharacterCodingException var5) {
            throw new RuntimeException(var5);
         }
      }
   }
}
