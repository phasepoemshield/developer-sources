package jnr.ffi.provider.converters;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.DelegatingMemoryIO;
import jnr.ffi.provider.ParameterFlags;

// $VF: Compiled from StructArrayParameterConverter.java
@ToNativeConverter.Cacheable
@ToNativeConverter.NoContext
public class StructArrayParameterConverter implements ToNativeConverter<Struct[], Pointer> {
   protected final Runtime runtime;
   protected final int parameterFlags;

   private static int align(int offset, int align) {
      return offset + align - 1 & ~(align + -1);
   }

   public static ToNativeConverter<Struct[], Pointer> getInstance(ToNativeContext structClass, Class toNativeContext) {
      int parameterFlags = ParameterFlags.parse(toNativeContext.getAnnotations());
      return !ParameterFlags.isOut(parameterFlags)
         ? new StructArrayParameterConverter(toNativeContext.getRuntime(), parameterFlags)
         : new StructArrayParameterConverter.Out(toNativeContext.getRuntime(), structClass.asSubclass(Struct.class), parameterFlags);
   }

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }

   StructArrayParameterConverter(Runtime runtime, int parameterFlags) {
      this.runtime = runtime;
      this.parameterFlags = parameterFlags;
   }

   public Pointer toNative(Struct[] structs, ToNativeContext context) {
      if (structs == null) {
         return null;
      } else {
         Pointer memory = Struct.getMemory(structs[0], this.parameterFlags);
         if (!(memory instanceof DelegatingMemoryIO)) {
            throw new RuntimeException("Struct array must be backed by contiguous array");
         } else {
            return ((DelegatingMemoryIO)memory).getDelegatedMemoryIO();
         }
      }
   }

   // $VF: Compiled from StructArrayParameterConverter.java
   public static final class Out extends StructArrayParameterConverter implements ToNativeConverter.PostInvocation<Struct[], Pointer> {
      private final Constructor<? extends Struct> constructor;

      public void postInvoke(Struct[] structs, Pointer context, ToNativeContext primitive) {
         if (structs != null && primitive != null) {
            try {
               int ite = 0;

               for (int i = 0; i < structs.length; i++) {
                  structs[i] = this.constructor.newInstance(this.runtime);
                  int structSize = StructArrayParameterConverter.align(Struct.size(structs[i]), Struct.alignment(structs[i]));
                  int var10;
                  structs[i].useMemory(primitive.slice(var10 = StructArrayParameterConverter.align(ite, Struct.alignment(structs[i])), structSize));
                  ite = var10 + structSize;
               }
            } catch (InstantiationException var7) {
               throw new RuntimeException(var7);
            } catch (IllegalAccessException var8) {
               throw new RuntimeException(var8);
            } catch (InvocationTargetException var9) {
               throw new RuntimeException(var9);
            }
         }
      }

      Out(Runtime parameterFlags, Class<? extends Struct> structClass, int runtime) {
         super(runtime, parameterFlags);

         Constructor cons;
         try {
            cons = structClass.getConstructor(Runtime.class);
         } catch (NoSuchMethodException var6) {
            throw new RuntimeException(structClass.getName() + " has no constructor that accepts jnr.ffi.Runtime");
         } catch (Throwable var7) {
            throw new RuntimeException(var7);
         }

         this.constructor = cons;
      }
   }
}
