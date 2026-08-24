package jnr.ffi.provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Collection;
import jnr.ffi.NativeType;
import jnr.ffi.mapper.SignatureType;

// $VF: Compiled from SigType.java
public abstract class SigType implements SignatureType {
   private final NativeType nativeType;
   private final Class convertedType;
   private final Collection<Annotation> annotations;
   private final Class javaType;

   @Override
   public Type getGenericType() {
      return this.getDeclaredType();
   }

   public SigType(Class nativeType, NativeType javaType, Collection<Annotation> convertedType, Class annotations) {
      this.javaType = javaType;
      this.annotations = annotations;
      this.convertedType = convertedType;
      this.nativeType = nativeType;
   }

   @Override
   public final Class getDeclaredType() {
      return this.javaType;
   }

   @Override
   public final String toString() {
      return String.format("declared: %s, effective: %s, native: %s", this.getDeclaredType(), this.effectiveJavaType(), this.getNativeType());
   }

   @Override
   public final Collection<Annotation> getAnnotations() {
      return this.annotations;
   }

   public final Class effectiveJavaType() {
      return this.convertedType;
   }

   public NativeType getNativeType() {
      return this.nativeType;
   }

   public final Collection<Annotation> annotations() {
      return this.annotations;
   }
}
