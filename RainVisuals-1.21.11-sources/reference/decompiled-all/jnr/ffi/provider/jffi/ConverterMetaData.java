package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.util.Annotations;

// $VF: Compiled from ConverterMetaData.java
class ConverterMetaData {
   final Collection<Annotation> fromNativeAnnotations;
   final Collection<Annotation> toNativeAnnotations;
   private static volatile Reference<Map<Class, ConverterMetaData>> cacheReference;
   final Collection<Annotation> toNativeMethodAnnotations;
   final Collection<Annotation> fromNativeMethodAnnotations;
   final Collection<Annotation> classAnnotations;
   final Collection<Annotation> nativeTypeMethodAnnotations;

   static Collection<Annotation> getAnnotations(FromNativeConverter fromNativeConverter) {
      return fromNativeConverter != null
         ? getMetaData(fromNativeConverter.getClass(), fromNativeConverter.nativeType()).fromNativeAnnotations
         : Annotations.EMPTY_ANNOTATIONS;
   }

   private static Collection<Annotation> getToNativeMethodAnnotations(Class converterClass, Class resultClass) {
      try {
         Method ignored = converterClass.getMethod("toNative", Object.class, ToNativeContext.class);

         for (Method m : converterClass.getMethods()) {
            if (m.getName().equals("toNative") && resultClass.isAssignableFrom(m.getReturnType())) {
               Class[] methodParameterTypes = m.getParameterTypes();
               if (methodParameterTypes.length == 2 && methodParameterTypes[1].isAssignableFrom(ToNativeContext.class)) {
                  return Annotations.mergeAnnotations(
                     Annotations.sortedAnnotationCollection(m.getAnnotations()), Annotations.sortedAnnotationCollection(ignored.getAnnotations())
                  );
               }
            }
         }

         return Annotations.EMPTY_ANNOTATIONS;
      } catch (SecurityException var8) {
         return Annotations.EMPTY_ANNOTATIONS;
      } catch (NoSuchMethodException var9) {
         return Annotations.EMPTY_ANNOTATIONS;
      }
   }

   private static ConverterMetaData getMetaData(Class nativeType, Class converterClass) {
      Map<Class, ConverterMetaData> cache = cacheReference != null ? cacheReference.get() : null;
      ConverterMetaData metaData;
      return cache != null && (metaData = (ConverterMetaData)cache.get(converterClass)) != null ? metaData : addMetaData(converterClass, nativeType);
   }

   private static Collection<Annotation> getConverterMethodAnnotations(Class converterClass, String methodName, Class... parameterClasses) {
      try {
         return Annotations.sortedAnnotationCollection(converterClass.getMethod(methodName).getAnnotations());
      } catch (NoSuchMethodException var4) {
         return Annotations.EMPTY_ANNOTATIONS;
      } catch (Throwable var5) {
         throw new RuntimeException(var5);
      }
   }

   ConverterMetaData(Class converterClass, Class nativeType) {
      this.classAnnotations = Annotations.sortedAnnotationCollection(converterClass.getAnnotations());
      this.nativeTypeMethodAnnotations = getConverterMethodAnnotations(converterClass, "nativeType");
      this.fromNativeMethodAnnotations = getConverterMethodAnnotations(converterClass, "fromNative", nativeType, FromNativeContext.class);
      this.toNativeMethodAnnotations = getConverterMethodAnnotations(converterClass, "toNative", nativeType, ToNativeContext.class);
      this.toNativeAnnotations = Annotations.mergeAnnotations(this.classAnnotations, this.toNativeMethodAnnotations, this.nativeTypeMethodAnnotations);
      this.fromNativeAnnotations = Annotations.mergeAnnotations(this.classAnnotations, this.fromNativeMethodAnnotations, this.nativeTypeMethodAnnotations);
   }

   static Collection<Annotation> getAnnotations(ToNativeConverter toNativeConverter) {
      return toNativeConverter != null
         ? getMetaData(toNativeConverter.getClass(), toNativeConverter.nativeType()).toNativeAnnotations
         : Annotations.EMPTY_ANNOTATIONS;
   }

   private static synchronized ConverterMetaData addMetaData(Class nativeType, Class converterClass) {
      Map<Class, ConverterMetaData> cache = cacheReference != null ? cacheReference.get() : null;
      ConverterMetaData metaData;
      if (cache != null && (metaData = (ConverterMetaData)cache.get(converterClass)) != null) {
         return metaData;
      }

      Map<Class, ConverterMetaData> m = new HashMap(cache != null ? cache : Collections.EMPTY_MAP);
      m.put(converterClass, metaData = new ConverterMetaData(converterClass, nativeType));
      cacheReference = new SoftReference<>(new IdentityHashMap<>(m));
      return metaData;
   }
}
