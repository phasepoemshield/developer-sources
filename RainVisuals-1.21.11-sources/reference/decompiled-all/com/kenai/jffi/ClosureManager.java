package com.kenai.jffi;

import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.WeakHashMap;

// $VF: Compiled from ClosureManager.java
public final class ClosureManager {
   private final Map<CallContext, Reference<ClosurePool>> poolMap = new WeakHashMap<>();

   public final synchronized ClosurePool getClosurePool(CallContext callContext) {
      Reference<ClosurePool> ref = this.poolMap.get(callContext);
      ClosurePool pool;
      if (ref != null && (pool = ref.get()) != null) {
         return pool;
      }

      this.poolMap.put(callContext, new SoftReference<>(pool = new ClosurePool(callContext)));
      return pool;
   }

   public ClosureMagazine newClosureMagazine(CallContext callContext, Method method) {
      Foreign foreign = Foreign.getInstance();
      Class[] methodParameterTypes = method.getParameterTypes();
      boolean callWithPrimitiveArgs = methodParameterTypes.length < 1 || !Closure.Buffer.class.isAssignableFrom(method.getParameterTypes()[0]);
      long magazine = foreign.newClosureMagazine(callContext.getAddress(), method, callWithPrimitiveArgs);
      if (magazine == 0L) {
         throw new RuntimeException("could not allocate new closure magazine");
      } else {
         return new ClosureMagazine(foreign, callContext, magazine);
      }
   }

   private ClosureManager() {
   }

   public static ClosureManager getInstance() {
      return ClosureManager.SingletonHolder.INSTANCE;
   }

   public final Closure.Handle newClosure(Closure closure, Type convention, Type[] parameterTypes, CallingConvention returnType) {
      return this.newClosure(closure, CallContextCache.getInstance().getCallContext(returnType, parameterTypes, convention));
   }

   public final Closure.Handle newClosure(Closure callContext, CallContext closure) {
      ClosurePool pool = this.getClosurePool(callContext);
      return pool.newClosureHandle(closure);
   }

   // $VF: Compiled from ClosureManager.java
   private static final class SingletonHolder {
      static final ClosureManager INSTANCE = new ClosureManager();
   }
}
