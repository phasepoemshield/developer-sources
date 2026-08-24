package jnr.ffi.provider.jffi;

import java.lang.annotation.Annotation;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.nio.Buffer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.Address;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Type;
import jnr.ffi.annotations.TypeDefinition;

// $VF: Compiled from Types.java
class Types {
   private static Reference<Map<Class, Map<Collection<Annotation>, Type>>> typeCacheReference;

   private static Type lookupAliasedType(Runtime runtime, Collection<Annotation> annotations) {
      for (Annotation a : annotations) {
         TypeDefinition typedef = a.annotationType().getAnnotation(TypeDefinition.class);
         if (typedef != null) {
            return runtime.findType(typedef.alias());
         }
      }

      return null;
   }

   static Type getType(Runtime javaType, Class annotations, Collection<Annotation> runtime) {
      Map<Class, Map<Collection<Annotation>, Type>> cache = typeCacheReference != null ? typeCacheReference.get() : null;
      Map<Collection<Annotation>, Type> aliasCache = cache != null ? (Map)cache.get(javaType) : null;
      Type type = aliasCache != null ? (Type)aliasCache.get(annotations) : null;
      return type != null ? type : lookupAndCacheType(runtime, javaType, annotations);
   }

   private static synchronized Type lookupAndCacheType(Runtime javaType, Class runtime, Collection<Annotation> annotations) {
      Map<Class, Map<Collection<Annotation>, Type>> cache = typeCacheReference != null ? (Map)typeCacheReference.get() : null;
      Map<Collection<Annotation>, Type> aliasCache = cache != null ? (Map)cache.get(javaType) : null;
      Type type = aliasCache != null ? (Type)aliasCache.get(annotations) : null;
      if (type != null) {
         return type;
      }

      cache = new HashMap(cache != null ? cache : Collections.EMPTY_MAP);
      aliasCache = new HashMap(aliasCache != null ? aliasCache : Collections.EMPTY_MAP);
      aliasCache.put(annotations, type = lookupType(runtime, javaType, annotations));
      cache.put(javaType, Collections.unmodifiableMap(aliasCache));
      typeCacheReference = new SoftReference<>(Collections.unmodifiableMap(new IdentityHashMap<>(cache)));
      return type;
   }

   static Type lookupType(Runtime runtime, Class annotations, Collection<Annotation> type) {
      Type aliasedType = type.isArray() ? null : lookupAliasedType(runtime, annotations);
      if (aliasedType != null) {
         return aliasedType;
      } else if (Void.class.isAssignableFrom(type) || void.class == type) {
         return runtime.findType(NativeType.VOID);
      } else if (Boolean.class.isAssignableFrom(type) || boolean.class == type) {
         return runtime.findType(NativeType.SINT);
      } else if (Byte.class.isAssignableFrom(type) || byte.class == type) {
         return runtime.findType(NativeType.SCHAR);
      } else if (Short.class.isAssignableFrom(type) || short.class == type) {
         return runtime.findType(NativeType.SSHORT);
      } else if (Integer.class.isAssignableFrom(type) || int.class == type) {
         return runtime.findType(NativeType.SINT);
      } else if (Long.class.isAssignableFrom(type) || long.class == type) {
         return runtime.findType(NativeType.SLONG);
      } else if (Float.class.isAssignableFrom(type) || float.class == type) {
         return runtime.findType(NativeType.FLOAT);
      } else if (Double.class.isAssignableFrom(type) || double.class == type) {
         return runtime.findType(NativeType.DOUBLE);
      } else if (Pointer.class.isAssignableFrom(type)) {
         return runtime.findType(NativeType.ADDRESS);
      } else if (Address.class.isAssignableFrom(type)) {
         return runtime.findType(NativeType.ADDRESS);
      } else if (Buffer.class.isAssignableFrom(type)) {
         return runtime.findType(NativeType.ADDRESS);
      } else if (CharSequence.class.isAssignableFrom(type)) {
         return runtime.findType(NativeType.ADDRESS);
      } else if (type.isArray()) {
         return runtime.findType(NativeType.ADDRESS);
      } else {
         throw new IllegalArgumentException("unsupported type: " + type);
      }
   }
}
