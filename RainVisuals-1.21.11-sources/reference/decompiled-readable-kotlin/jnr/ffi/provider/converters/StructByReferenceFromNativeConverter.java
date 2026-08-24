package jnr.ffi.provider.converters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;

// $VF: Compiled from StructByReferenceFromNativeConverter.java
public class StructByReferenceFromNativeConverter implements FromNativeConverter<Struct, Pointer> {
   private final Constructor<? extends Struct> constructor;

   StructByReferenceFromNativeConverter(Constructor<? extends Struct> constructor) {
      this.constructor = constructor;
   }

   public Struct fromNative(Pointer context, FromNativeContext nativeValue) {
      try {
         Struct e = this.constructor.newInstance(context.getRuntime());
         e.useMemory(nativeValue);
         return e;
      } catch (InstantiationException var4) {
         throw new RuntimeException(var4);
      } catch (IllegalAccessException var5) {
         throw new RuntimeException(var5);
      } catch (InvocationTargetException var6) {
         throw new RuntimeException(var6);
      }
   }

   public static FromNativeConverter<Struct, Pointer> getInstance(Class structClass, FromNativeContext toNativeContext) {
      try {
         return new StructByReferenceFromNativeConverter(structClass.getConstructor(Runtime.class));
      } catch (NoSuchMethodException var3) {
         throw new RuntimeException(structClass.getName() + " has no constructor that accepts jnr.ffi.Runtime");
      } catch (Throwable var4) {
         throw new RuntimeException(var4);
      }
   }

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }
}
