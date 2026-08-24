package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Closure;
import com.kenai.jffi.ClosureMagazine;
import com.kenai.jffi.ClosureManager;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.Delegate;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.ToNativeType;
import jnr.ffi.util.ref.FinalizableWeakReference;

// $VF: Compiled from NativeClosureFactory.java
public final class NativeClosureFactory<T> {
   private final ConcurrentLinkedQueue<NativeClosurePointer> freeQueue;
   private final Runtime runtime;
   private ClosureMagazine currentMagazine;
   private final NativeClosureProxy.Factory closureProxyFactory;
   private final ConcurrentMap<Integer, NativeClosureFactory<T>.ClosureReference> closures = new ConcurrentHashMap<>();
   private final CallContext callContext;

   NativeClosurePointer allocateClosurePointer() {
      NativeClosurePointer closurePointer = this.freeQueue.poll();
      if (closurePointer != null) {
         return closurePointer;
      }

      NativeClosureProxy proxy = this.closureProxyFactory.newClosureProxy();
      Closure.Handle closureHandle = null;
      synchronized (this) {
         do {
            if (this.currentMagazine == null || (closureHandle = this.currentMagazine.allocate(proxy)) == null) {
               this.currentMagazine = ClosureManager.getInstance().newClosureMagazine(this.callContext, this.closureProxyFactory.getInvokeMethod());
            }
         } while (closureHandle == null);
      }

      return new NativeClosurePointer(this.runtime, closureHandle, proxy);
   }

   private void recycle(NativeClosurePointer ptr) {
      this.freeQueue.add(ptr);
   }

   NativeClosureFactory<T>.ClosureReference getClosureReference(Object callable) {
      Integer key = System.identityHashCode(callable);
      NativeClosureFactory<T>.ClosureReference ref = this.closures.get(key);
      if (ref != null) {
         if (ref.getCallable() == callable) {
            return ref;
         }

         synchronized (this.closures) {
            while ((ref = ref.next) != null) {
               if (ref.getCallable() == callable) {
                  return ref;
               }
            }
         }
      }

      return this.newClosureReference(callable, key);
   }

   private void expunge(NativeClosureFactory<T>.ClosureReference ref, Integer key) {
      if (ref.next != null || !this.closures.remove(key, ref)) {
         synchronized (this.closures) {
            NativeClosureFactory<T>.ClosureReference clref = this.closures.get(key);
            NativeClosureFactory<T>.ClosureReference prev = clref;

            while (clref != null) {
               if (clref == ref) {
                  if (prev != clref) {
                     prev.next = clref.next;
                  } else if (clref.next != null) {
                     this.closures.replace(key, clref, clref.next);
                  } else {
                     this.closures.remove(key, clref);
                  }
                  break;
               }

               prev = clref;
               clref = clref.next;
            }
         }
      }
   }

   NativeClosurePointer newClosure(Object key, Integer callable) {
      return this.newClosureReference(callable, key).pointer;
   }

   protected NativeClosureFactory(Runtime runtime, CallContext closureProxyFactory, NativeClosureProxy.Factory callContext) {
      this.freeQueue = new ConcurrentLinkedQueue<>();
      this.runtime = runtime;
      this.closureProxyFactory = closureProxyFactory;
      this.callContext = callContext;
   }

   static <T> NativeClosureFactory newClosureFactory(Runtime runtime, Class<T> classLoader, SignatureTypeMapper closureClass, AsmClassLoader typeMapper) {
      Method callMethod = null;

      for (Method m : closureClass.getMethods()) {
         if (m.isAnnotationPresent(Delegate.class) && Modifier.isPublic(m.getModifiers()) && !Modifier.isStatic(m.getModifiers())) {
            callMethod = m;
            break;
         }
      }

      if (callMethod == null) {
         throw new NoSuchMethodError("no public non-static delegate method defined in " + closureClass.getName());
      }

      Class[] var9 = callMethod.getParameterTypes();
      FromNativeType[] var10 = new FromNativeType[var9.length];

      for (int var11 = 0; var11 < var9.length; var11++) {
         var10[var11] = ClosureUtil.getParameterType(runtime, callMethod, var11, typeMapper);
      }

      ToNativeType var12 = ClosureUtil.getResultType(runtime, callMethod, typeMapper);
      return new NativeClosureFactory(
         runtime,
         InvokerUtil.getCallContext(var12, var10, InvokerUtil.getNativeCallingConvention(callMethod), false),
         NativeClosureProxy.newProxyFactory(runtime, callMethod, var12, var10, classLoader)
      );
   }

   NativeClosureFactory<T>.ClosureReference newClosureReference(Object callable, Integer key) {
      NativeClosurePointer ptr = this.allocateClosurePointer();
      NativeClosureFactory<T>.ClosureReference ref = new NativeClosureFactory.ClosureReference(callable, key, this, ptr);
      ptr.proxy.closureReference = ref;
      if (this.closures.putIfAbsent(key, ref) == null) {
         return ref;
      }

      synchronized (this.closures) {
         do {
            ref.next = this.closures.get(key);
         } while ((ref.next != null || this.closures.putIfAbsent(key, ref) != null) && !this.closures.replace(key, ref.next, ref));

         return ref;
      }
   }

   // $VF: Compiled from NativeClosureFactory.java
   final class ClosureReference extends FinalizableWeakReference<Object> {
      volatile NativeClosureFactory<T>.ClosureReference next;
      private final Integer key;
      private final NativeClosurePointer pointer;
      private final NativeClosureFactory factory;

      private ClosureReference(Object factory, Integer pointer, NativeClosureFactory key, NativeClosurePointer referent) {
         super(referent, NativeFinalizer.getInstance().getFinalizerQueue());
         this.factory = factory;
         this.key = key;
         this.pointer = pointer;
      }

      @Override
      public void finalizeReferent() {
         this.clear();
         this.factory.expunge(this, this.key);
         this.factory.recycle(this.pointer);
      }

      Object getCallable() {
         return this.get();
      }

      Pointer getPointer() {
         return this.pointer;
      }
   }
}
