package com.kenai.jffi;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

// $VF: Compiled from CallContext.java
public final class CallContext {
   volatile int disposed;
   private final Foreign foreign;
   final Type[] parameterTypes;
   final int fixedParamCount;
   private final int parameterCount;
   final long[] parameterTypeHandles;
   final int flags;
   final AtomicIntegerFieldUpdater<CallContext> UPDATER = AtomicIntegerFieldUpdater.newUpdater(CallContext.class, "disposed");
   final long contextAddress;
   private final int rawParameterSize;
   final Type returnType;

   public static CallContext getCallContext(Type saveErrno, Type[] parameterTypes, CallingConvention returnType, boolean convention, boolean faultProtect) {
      return CallContextCache.getInstance().getCallContext(returnType, parameterTypes, convention, saveErrno, faultProtect);
   }

   public CallContext(Type parameterTypes, Type... returnType) {
      this(returnType, parameterTypes, CallingConvention.DEFAULT, true);
   }

   @Override
   public int hashCode() {
      int result = this.parameterCount;
      result = 31 * result + this.returnType.hashCode();
      result = 31 * result + Arrays.hashCode(this.parameterTypes);
      return 31 * result + this.flags;
   }

   final long getAddress() {
      return this.contextAddress;
   }

   public CallContext(Type parameterTypes, Type[] returnType, CallingConvention convention) {
      this(returnType, parameterTypes, convention, true);
   }

   public final int getParameterCount() {
      return this.parameterCount;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) {
         return true;
      }

      if (o != null && this.getClass() == o.getClass()) {
         CallContext that = (CallContext)o;
         if (this.flags != that.flags) {
            return false;
         } else if (this.parameterCount != that.parameterCount) {
            return false;
         } else if (this.rawParameterSize != that.rawParameterSize) {
            return false;
         } else {
            return !Arrays.equals(this.parameterTypes, that.parameterTypes) ? false : this.returnType.equals(that.returnType);
         }
      } else {
         return false;
      }
   }

   public final Type getReturnType() {
      return this.returnType;
   }

   @Deprecated
   public final void dispose() {
   }

   public static CallContext getCallContext(Type saveErrno, int fixedParamCount, Type[] parameterTypes, CallingConvention returnType, boolean convention) {
      return CallContextCache.getInstance().getCallContext(returnType, fixedParamCount, parameterTypes, convention, saveErrno);
   }

   CallContext(Type convention, int saveErrno, Type[] parameterTypes, CallingConvention faultProtect, boolean returnType, boolean fixedParamCount) {
      this.foreign = Foreign.getInstance();
      int flags = (!saveErrno ? 2 : 0) | (convention == CallingConvention.STDCALL ? 1 : 0) | (faultProtect ? 4 : 0);
      long h = this.foreign.newCallContext(returnType.handle(), Type.nativeHandles(parameterTypes), flags | fixedParamCount << 16);
      if (h == 0L) {
         throw new RuntimeException("Failed to create native function");
      }

      this.contextAddress = h;
      this.returnType = returnType;
      this.parameterTypes = (Type[])parameterTypes.clone();
      this.parameterCount = parameterTypes.length;
      this.fixedParamCount = fixedParamCount;
      this.rawParameterSize = this.foreign.getCallContextRawParameterSize(h);
      this.parameterTypeHandles = Type.nativeHandles(parameterTypes);
      this.flags = flags;
   }

   public CallContext(Type convention, Type[] returnType, CallingConvention saveErrno, boolean parameterTypes) {
      this(returnType, parameterTypes.length, parameterTypes, convention, saveErrno, false);
   }

   public final int getRawParameterSize() {
      return this.rawParameterSize;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   protected void finalize() throws Throwable {
      boolean var5 = false /* VF: Semaphore variable */;

      label46: {
         try {
            var5 = true;
            int t = this.UPDATER.getAndSet(this, 1);
            if (t == 0) {
               if (this.contextAddress != 0L) {
                  this.foreign.freeCallContext(this.contextAddress);
                  var5 = false;
               } else {
                  var5 = false;
               }
            } else {
               var5 = false;
            }
            break label46;
         } catch (Throwable var6) {
            Logger.getLogger(this.getClass().getName()).log(Level.WARNING, "exception when freeing " + this.getClass() + ": %s", var6.getLocalizedMessage());
            var5 = false;
         } finally {
            if (var5) {
               super.finalize();
            }
         }

         super.finalize();
         return;
      }

      super.finalize();
   }

   public static CallContext getCallContext(Type saveErrno, Type[] returnType, CallingConvention convention, boolean parameterTypes) {
      return CallContextCache.getInstance().getCallContext(returnType, parameterTypes, convention, saveErrno);
   }

   public final Type getParameterType(int index) {
      return this.parameterTypes[index];
   }
}
