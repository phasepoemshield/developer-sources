package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import jnr.ffi.mapper.AbstractSignatureTypeMapper;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.FromNativeTypes;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import jnr.ffi.mapper.ToNativeTypes;

// $VF: Compiled from AnnotationTypeMapper.java
public class AnnotationTypeMapper extends AbstractSignatureTypeMapper implements SignatureTypeMapper {
   @Override
   public ToNativeType getToNativeType(SignatureType context, ToNativeContext type) {
      Method toNativeMethod = findMethodWithAnnotation(type, ToNativeConverter.ToNative.class);
      if (toNativeMethod == null) {
         return null;
      } else if (!Modifier.isStatic(toNativeMethod.getModifiers())) {
         throw new IllegalArgumentException(toNativeMethod.getDeclaringClass().getName() + "." + toNativeMethod.getName() + " should be declared static");
      } else {
         return ToNativeTypes.create(
            new AnnotationTypeMapper.ReflectionToNativeConverter(toNativeMethod, toNativeMethod.getAnnotation(ToNativeConverter.ToNative.class).nativeType())
         );
      }
   }

   private static Method findMethodWithAnnotation(SignatureType annotationClass, Class<? extends Annotation> type) {
      for (Class klass = type.getDeclaredType(); klass != null && klass != Object.class; klass = klass.getSuperclass()) {
         for (Method m : klass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(annotationClass)) {
               return m;
            }
         }
      }

      return null;
   }

   @Override
   public FromNativeType getFromNativeType(SignatureType type, FromNativeContext context) {
      Method fromNativeMethod = findMethodWithAnnotation(type, FromNativeConverter.FromNative.class);
      if (fromNativeMethod == null) {
         return null;
      } else if (!Modifier.isStatic(fromNativeMethod.getModifiers())) {
         throw new IllegalArgumentException(fromNativeMethod.getDeclaringClass().getName() + "." + fromNativeMethod.getName() + " should be declared static");
      } else {
         return FromNativeTypes.create(
            new AnnotationTypeMapper.ReflectionFromNativeConverter(
               fromNativeMethod, fromNativeMethod.getAnnotation(FromNativeConverter.FromNative.class).nativeType()
            )
         );
      }
   }

   // $VF: Compiled from AnnotationTypeMapper.java
   public abstract class AbstractReflectionConverter {
      protected final Class nativeType;
      protected final Method method;

      public AbstractReflectionConverter(Method method, Class this$0) {
         this.method = method;
         this.nativeType = nativeType;
      }

      public final Class<Object> nativeType() {
         return this.nativeType;
      }

      protected final Object invoke(Object context, Object value) {
         try {
            return this.method.invoke(this.method.getDeclaringClass(), value, context);
         } catch (IllegalAccessException var4) {
            throw new RuntimeException(var4);
         } catch (InvocationTargetException var5) {
            throw new RuntimeException(var5);
         }
      }
   }

   // $VF: Compiled from AnnotationTypeMapper.java
   @FromNativeConverter.Cacheable
   public final class ReflectionFromNativeConverter extends AnnotationTypeMapper.AbstractReflectionConverter implements FromNativeConverter<Object, Object> {
      public ReflectionFromNativeConverter(Method nativeType, Class method) {
         super(method, nativeType);
      }

      @Override
      public Object fromNative(Object context, FromNativeContext nativeValue) {
         return this.invoke(nativeValue, context);
      }
   }

   // $VF: Compiled from AnnotationTypeMapper.java
   @ToNativeConverter.Cacheable
   public final class ReflectionToNativeConverter extends AnnotationTypeMapper.AbstractReflectionConverter implements ToNativeConverter<Object, Object> {
      @Override
      public Object toNative(Object context, ToNativeContext nativeValue) {
         return this.invoke(nativeValue, context);
      }

      public ReflectionToNativeConverter(Method method, Class this$0) {
         super(method, nativeType);
      }
   }
}
