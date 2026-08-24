package jnr.ffi.provider.jffi;

import java.util.Map;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.CachingTypeMapper;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapperAdapter;
import jnr.ffi.mapper.TypeMapper;
import jnr.ffi.provider.NullTypeMapper;

// $VF: Compiled from LibraryLoader.java
public abstract class LibraryLoader {
   static SignatureTypeMapper getSignatureTypeMapper(Map<LibraryOption, ?> libraryOptions) {
      SignatureTypeMapper typeMapper;
      if (libraryOptions.containsKey(LibraryOption.TypeMapper)) {
         Object tm = libraryOptions.get(LibraryOption.TypeMapper);
         if (tm instanceof SignatureTypeMapper) {
            typeMapper = (SignatureTypeMapper)tm;
         } else {
            if (!(tm instanceof TypeMapper)) {
               throw new IllegalArgumentException("TypeMapper option is not a valid TypeMapper instance");
            }

            typeMapper = new SignatureTypeMapperAdapter((TypeMapper)tm);
         }
      } else {
         typeMapper = new NullTypeMapper();
      }

      return typeMapper;
   }

   static CompositeTypeMapper newCompositeTypeMapper(
      Runtime runtime, AsmClassLoader classLoader, SignatureTypeMapper closureTypeMapper, CompositeTypeMapper typeMapper
   ) {
      return new CompositeTypeMapper(
         typeMapper,
         new CachingTypeMapper(new InvokerTypeMapper(new NativeClosureManager(runtime, closureTypeMapper), classLoader, NativeLibraryLoader.ASM_ENABLED)),
         new CachingTypeMapper(new AnnotationTypeMapper())
      );
   }

   abstract <T> T loadLibrary(NativeLibrary var1, Class<T> var2, Map<LibraryOption, ?> var3, boolean var4);

   static CompositeTypeMapper newClosureTypeMapper(AsmClassLoader typeMapper, SignatureTypeMapper classLoader) {
      return new CompositeTypeMapper(
         typeMapper,
         new CachingTypeMapper(new InvokerTypeMapper(null, classLoader, NativeLibraryLoader.ASM_ENABLED)),
         new CachingTypeMapper(new AnnotationTypeMapper())
      );
   }
}
