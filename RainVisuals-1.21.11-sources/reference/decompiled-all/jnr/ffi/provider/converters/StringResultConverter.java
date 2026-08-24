package jnr.ffi.provider.converters;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.Arrays;
import java.util.Collection;
import jnr.ffi.Pointer;
import jnr.ffi.annotations.Encoding;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.MethodResultContext;

// $VF: Compiled from StringResultConverter.java
@FromNativeConverter.Cacheable
@FromNativeConverter.NoContext
public class StringResultConverter implements FromNativeConverter<String, Pointer> {
   private final Charset charset;
   private static final FromNativeConverter<String, Pointer> DEFAULT = new StringResultConverter(Charset.defaultCharset());
   private final int terminatorWidth;
   private final ThreadLocal<Reference<CharsetDecoder>> localDecoder = new ThreadLocal<>();

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }

   private StringResultConverter(Charset charset) {
      this.charset = charset;
      this.terminatorWidth = StringUtil.terminatorWidth(charset);
   }

   public String fromNative(Pointer pointer, FromNativeContext context) {
      if (pointer == null) {
         return null;
      }

      int idx = 0;

      label30:
      while (true) {
         idx += pointer.indexOf(idx, (byte)0);

         for (byte[] bytes = (byte[])1; bytes < this.terminatorWidth; bytes++) {
            if (pointer.getByte(idx + bytes) != 0) {
               idx += bytes;
               continue label30;
            }
         }

         byte[] var8 = new byte[idx];
         pointer.get(0L, var8, 0, var8.length);

         try {
            return StringUtil.getDecoder(this.charset, this.localDecoder).reset().decode(ByteBuffer.wrap(var8)).toString();
         } catch (CharacterCodingException var6) {
            throw new RuntimeException(var6);
         }
      }
   }

   private static Encoding getEncoding(Collection<Annotation> annotations) {
      for (Annotation a : annotations) {
         if (a instanceof Encoding) {
            return (Encoding)a;
         }
      }

      return null;
   }

   public static FromNativeConverter<String, Pointer> getInstance(Charset cs) {
      return Charset.defaultCharset().equals(cs) ? DEFAULT : new StringResultConverter(cs);
   }

   public static FromNativeConverter<String, Pointer> getInstance(FromNativeContext fromNativeContext) {
      Charset charset = Charset.defaultCharset();
      if (fromNativeContext instanceof MethodResultContext) {
         Encoding e = getEncoding(Arrays.asList(((MethodResultContext)fromNativeContext).getMethod().getDeclaringClass().getAnnotations()));
         if (e != null) {
            charset = Charset.forName(e.value());
         }
      }

      Encoding var3 = getEncoding(fromNativeContext.getAnnotations());
      if (var3 != null) {
         charset = Charset.forName(var3.value());
      }

      return getInstance(charset);
   }
}
