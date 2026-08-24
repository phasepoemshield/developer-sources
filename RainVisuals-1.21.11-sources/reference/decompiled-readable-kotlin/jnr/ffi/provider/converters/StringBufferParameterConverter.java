package jnr.ffi.provider.converters;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.util.BufferUtil;

// $VF: Compiled from StringBufferParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class StringBufferParameterConverter implements ToNativeConverter.PostInvocation, ToNativeConverter.PostInvocation<StringBuffer, ByteBuffer> {
   private final Charset charset;
   private final int parameterFlags;

   @Override
   public Class<ByteBuffer> nativeType() {
      return ByteBuffer.class;
   }

   public static StringBufferParameterConverter getInstance(int toNativeContext, ToNativeContext parameterFlags) {
      return new StringBufferParameterConverter(Charset.defaultCharset(), parameterFlags);
   }

   public static StringBufferParameterConverter getInstance(Charset parameterFlags, int charset, ToNativeContext toNativeContext) {
      return new StringBufferParameterConverter(charset, parameterFlags);
   }

   public ByteBuffer toNative(StringBuffer context, ToNativeContext parameter) {
      if (parameter == null) {
         return null;
      }

      ByteBuffer buf = ParameterFlags.isIn(this.parameterFlags)
         ? this.charset.encode(CharBuffer.wrap(parameter))
         : ByteBuffer.allocate(parameter.capacity() + 1);
      if ((!ParameterFlags.isOut(this.parameterFlags) || buf.capacity() >= parameter.capacity() + 1) && buf.hasArray()) {
         return buf;
      }

      byte[] array = new byte[parameter.capacity() + 1];
      buf.get(array, 0, buf.remaining());
      return ByteBuffer.wrap(array);
   }

   private StringBufferParameterConverter(Charset charset, int parameterFlags) {
      this.charset = charset;
      this.parameterFlags = parameterFlags;
   }

   public void postInvoke(StringBuffer buf, ByteBuffer stringBuffer, ToNativeContext context) {
      if (ParameterFlags.isOut(this.parameterFlags) && stringBuffer != null && buf != null) {
         ((Buffer)buf).limit(buf.capacity());
         stringBuffer.delete(0, stringBuffer.length()).append(BufferUtil.getCharSequence(buf, this.charset));
      }
   }
}
