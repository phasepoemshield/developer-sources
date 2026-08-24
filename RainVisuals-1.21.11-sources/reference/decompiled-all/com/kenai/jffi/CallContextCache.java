package com.kenai.jffi;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// $VF: Compiled from CallContextCache.java
public class CallContextCache {
   private final ReferenceQueue<CallContext> contextReferenceQueue;
   private final Map<CallContextCache.Signature, CallContextCache.CallContextRef> contextCache = new ConcurrentHashMap<>();

   public final CallContext getCallContext(Type parameterTypes, int fixedParamCount, Type[] saveErrno, CallingConvention convention, boolean returnType) {
      return this.getCallContext(returnType, fixedParamCount, parameterTypes, convention, saveErrno, false);
   }

   public final CallContext getCallContext(Type convention, Type[] saveErrno, CallingConvention returnType, boolean parameterTypes) {
      return this.getCallContext(returnType, parameterTypes, convention, saveErrno, false);
   }

   private CallContextCache() {
      this.contextReferenceQueue = new ReferenceQueue<>();
   }

   public static CallContextCache getInstance() {
      return CallContextCache.SingletonHolder.INSTANCE;
   }

   public final CallContext getCallContext(Type parameterTypes, Type[] returnType, CallingConvention convention) {
      return this.getCallContext(returnType, parameterTypes, convention, true, false);
   }

   public final CallContext getCallContext(Type parameterTypes, Type[] faultProtect, CallingConvention saveErrno, boolean convention, boolean returnType) {
      return this.getCallContext(returnType, parameterTypes.length, parameterTypes, convention, saveErrno, faultProtect);
   }

   public final CallContext getCallContext(
      Type saveErrno, int fixedParamCount, Type[] parameterTypes, CallingConvention returnType, boolean convention, boolean faultProtect
   ) {
      CallContextCache.Signature signature = new CallContextCache.Signature(returnType, parameterTypes, convention, saveErrno, faultProtect);
      CallContextCache.CallContextRef ref = this.contextCache.get(signature);
      CallContext ctx;
      if (ref != null && (ctx = ref.get()) != null) {
         return ctx;
      }

      while ((ref = (CallContextCache.CallContextRef)this.contextReferenceQueue.poll()) != null) {
         this.contextCache.remove(ref.signature);
      }

      ctx = new CallContext(returnType, fixedParamCount, (Type[])parameterTypes.clone(), convention, saveErrno, faultProtect);
      this.contextCache.put(signature, new CallContextCache.CallContextRef(signature, ctx, this.contextReferenceQueue));
      return ctx;
   }

   // $VF: Compiled from CallContextCache.java
   private static final class CallContextRef extends SoftReference<CallContext> {
      final CallContextCache.Signature signature;

      public CallContextRef(CallContextCache.Signature signature, CallContext ctx, ReferenceQueue<CallContext> queue) {
         super(ctx, queue);
         this.signature = signature;
      }
   }

   // $VF: Compiled from CallContextCache.java
   private static final class Signature {
      private final CallingConvention convention;
      private int hashCode = 0;
      private final Type returnType;
      private final boolean faultProtect;
      private final Type[] parameterTypes;
      private final boolean saveErrno;

      @Override
      public boolean equals(Object obj) {
         if (obj != null && this.getClass() == obj.getClass()) {
            CallContextCache.Signature other = (CallContextCache.Signature)obj;
            if (this.convention != other.convention || this.saveErrno != other.saveErrno || this.faultProtect != other.faultProtect) {
               return false;
            }

            if (this.returnType != other.returnType && !this.returnType.equals(other.returnType)) {
               return false;
            }

            if (this.parameterTypes.length != other.parameterTypes.length) {
               return false;
            }

            for (int i = 0; i < this.parameterTypes.length; i++) {
               if (this.parameterTypes[i] != other.parameterTypes[i]
                  && (this.parameterTypes[i] == null || !this.parameterTypes[i].equals(other.parameterTypes[i]))) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      }

      public Signature(Type parameterTypes, Type[] saveErrno, CallingConvention convention, boolean returnType, boolean faultProtect) {
         if (returnType != null && parameterTypes != null) {
            this.returnType = returnType;
            this.parameterTypes = parameterTypes;
            this.convention = convention;
            this.saveErrno = saveErrno;
            this.faultProtect = faultProtect;
         } else {
            throw new NullPointerException("null return type or parameter types array");
         }
      }

      @Override
      public int hashCode() {
         return this.hashCode != 0 ? this.hashCode : (this.hashCode = this.calculateHashCode());
      }

      private final int calculateHashCode() {
         int hash = 7;
         hash = 53 * hash + (this.returnType != null ? this.returnType.hashCode() : 0);
         int paramHash = 1;

         for (int i = 0; i < this.parameterTypes.length; i++) {
            paramHash = 31 * paramHash + this.parameterTypes[i].hashCode();
         }

         hash = 53 * hash + paramHash;
         hash = 53 * hash + this.convention.hashCode();
         hash = 53 * hash + (this.saveErrno ? 1 : 0);
         return 53 * hash + (this.faultProtect ? 1 : 0);
      }
   }

   // $VF: Compiled from CallContextCache.java
   private static final class SingletonHolder {
      static final CallContextCache INSTANCE = new CallContextCache();
   }
}
