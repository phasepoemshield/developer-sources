package jnr.ffi.provider;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;

// $VF: Compiled from NativeInvocationHandler.java
public class NativeInvocationHandler implements InvocationHandler {
   private volatile Map<Method, Invoker> fastLookupTable;
   private final Map<Method, Invoker> invokerMap;

   public NativeInvocationHandler(Map<Method, Invoker> invokers) {
      this.invokerMap = invokers;
      this.fastLookupTable = Collections.emptyMap();
   }

   private synchronized Invoker lookupAndCacheInvoker(Method method) {
      Invoker invoker;
      if ((invoker = this.fastLookupTable.get(method)) != null) {
         return invoker;
      }

      Map<Method, Invoker> map = new IdentityHashMap<>(this.fastLookupTable);
      map.put(method, invoker = this.invokerMap.get(method));
      if (invoker == null) {
         throw new UnsatisfiedLinkError("no invoker for native method " + method.getName());
      }

      this.fastLookupTable = map;
      return invoker;
   }

   @Override
   public Object invoke(Object self, Method method, Object[] argArray) throws Throwable {
      Invoker invoker = this.fastLookupTable.get(method);
      return invoker != null ? invoker.invoke(self, argArray) : this.lookupAndCacheInvoker(method).invoke(self, argArray);
   }
}
