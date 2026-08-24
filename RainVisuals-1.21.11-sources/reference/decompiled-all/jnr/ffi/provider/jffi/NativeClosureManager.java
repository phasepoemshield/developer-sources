package jnr.ffi.provider.jffi;

import java.util.IdentityHashMap;
import java.util.Map;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.CachingTypeMapper;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ClosureManager;

// $VF: Compiled from NativeClosureManager.java
final class NativeClosureManager implements ClosureManager {
   private final SignatureTypeMapper typeMapper;
   private volatile Map<Class<?>, NativeClosureFactory> factories = new IdentityHashMap<>();
   private volatile Map<ClassLoader, AsmClassLoader> asmClassLoaders = new IdentityHashMap<>();
   private final Runtime runtime;

   @Override
   public final <T> Pointer getClosurePointer(Class<? extends T> instance, T closureClass) {
      return this.getClosureFactory(closureClass).getClosureReference(instance).getPointer();
   }

   <T> ToNativeConverter<T, Pointer> newClosureSite(Class<T> closureClass) {
      return new NativeClosureManager.ClosureSite<>(this.getClosureFactory(closureClass));
   }

   synchronized <T> NativeClosureFactory<T> initClosureFactory(Class<T> closureClass, AsmClassLoader classLoader) {
      NativeClosureFactory<T> factory = this.factories.get(closureClass);
      if (factory != null) {
         return factory;
      }

      factory = NativeClosureFactory.newClosureFactory(this.runtime, closureClass, this.typeMapper, classLoader);
      Map<Class<?>, NativeClosureFactory> factories = new IdentityHashMap();
      factories.putAll(this.factories);
      factories.put(closureClass, factory);
      this.factories = factories;
      return factory;
   }

   <T> NativeClosureFactory<T> getClosureFactory(Class<T> closureClass) {
      NativeClosureFactory<T> factory = this.factories.get(closureClass);
      if (factory != null) {
         return factory;
      }

      AsmClassLoader asmCl = this.asmClassLoaders.get(closureClass.getClassLoader());
      if (asmCl == null) {
         asmCl = new AsmClassLoader(closureClass.getClassLoader());
         this.asmClassLoaders.put(closureClass.getClassLoader(), asmCl);
      }

      return this.initClosureFactory(closureClass, asmCl);
   }

   @Override
   public <T> T newClosure(Class<? extends T> closureClass, T instance) {
      NativeClosureFactory<T> factory = this.factories.get(closureClass);
      if (factory != null) {
      }

      return null;
   }

   NativeClosureManager(Runtime typeMapper, SignatureTypeMapper runtime) {
      this.runtime = runtime;
      this.typeMapper = new CompositeTypeMapper(typeMapper, new CachingTypeMapper(new ClosureTypeMapper()));
   }

   // $VF: Compiled from NativeClosureManager.java
   @ToNativeConverter.NoContext
   public static final class ClosureSite<T> implements ToNativeConverter<T, Pointer> {
      private final NativeClosureFactory<T> factory;
      private NativeClosureFactory.ClosureReference closureReference = null;

      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }

      public Pointer toNative(T context, ToNativeContext value) {
         if (value == null) {
            return null;
         }

         if (value instanceof ClosureFromNativeConverter.AbstractClosurePointer) {
            return (ClosureFromNativeConverter.AbstractClosurePointer)value;
         }

         NativeClosureFactory.ClosureReference ref = this.closureReference;
         if (ref != null && ref.getCallable() == value) {
            return ref.getPointer();
         }

         ref = this.factory.getClosureReference(value);
         if (this.closureReference == null || this.closureReference.get() == null) {
            this.closureReference = ref;
         }

         return ref.getPointer();
      }

      private ClosureSite(NativeClosureFactory<T> factory) {
         this.factory = factory;
      }
   }
}
