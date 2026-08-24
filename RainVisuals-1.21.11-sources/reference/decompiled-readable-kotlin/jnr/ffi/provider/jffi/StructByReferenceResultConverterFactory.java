package jnr.ffi.provider.jffi;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.provider.converters.StructByReferenceFromNativeConverter;

// $VF: Compiled from StructByReferenceResultConverterFactory.java
final class StructByReferenceResultConverterFactory {
   private final boolean asmEnabled;
   private final Map<Class<? extends Struct>, FromNativeConverter<? extends Struct, Pointer>> converters = new ConcurrentHashMap<>();
   private final AsmClassLoader classLoader;

   public final FromNativeConverter<? extends Struct, Pointer> get(Class<? extends Struct> fromNativeContext, FromNativeContext structClass) {
      FromNativeConverter<? extends Struct, Pointer> converter = this.converters.get(structClass);
      if (converter == null) {
         synchronized (this.converters) {
            if ((converter = this.converters.get(structClass)) == null) {
               this.converters.put(structClass, converter = this.createConverter(fromNativeContext.getRuntime(), structClass, fromNativeContext));
            }
         }
      }

      return converter;
   }

   public StructByReferenceResultConverterFactory(AsmClassLoader asmEnabled, boolean classLoader) {
      this.classLoader = classLoader;
      this.asmEnabled = asmEnabled;
   }

   private FromNativeConverter<? extends Struct, Pointer> createConverter(
      Runtime runtime, Class<? extends Struct> structClass, FromNativeContext fromNativeContext
   ) {
      return this.asmEnabled
         ? AsmStructByReferenceFromNativeConverter.newStructByReferenceConverter(runtime, structClass, 0, this.classLoader)
         : StructByReferenceFromNativeConverter.getInstance(structClass, fromNativeContext);
   }
}
