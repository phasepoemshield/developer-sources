package com.kenai.jffi;

// $VF: Compiled from Function.java
public final class Function {
   private final CallContext callContext;
   final long functionAddress;
   final long contextAddress;

   public final int getRawParameterSize() {
      return this.callContext.getRawParameterSize();
   }

   final long getContextAddress() {
      return this.contextAddress;
   }

   @Deprecated
   public final void dispose() {
   }

   public final Type getParameterType(int index) {
      return this.callContext.getParameterType(index);
   }

   public final long getFunctionAddress() {
      return this.functionAddress;
   }

   public Function(long callContext, CallContext address) {
      this.functionAddress = address;
      this.callContext = callContext;
      this.contextAddress = callContext.getAddress();
   }

   public final Type getReturnType() {
      return this.callContext.getReturnType();
   }

   public Function(long returnType, Type address, Type[] convention, CallingConvention saveErrno, boolean paramTypes) {
      this.functionAddress = address;
      this.callContext = CallContext.getCallContext(returnType, paramTypes, convention, saveErrno);
      this.contextAddress = this.callContext.getAddress();
   }

   public final int getParameterCount() {
      return this.callContext.getParameterCount();
   }

   public Function(long address, Type returnType, Type... paramTypes) {
      this(address, returnType, paramTypes, CallingConvention.DEFAULT, true);
   }

   public Function(long paramTypes, Type convention, int address, Type[] fixedParamCount, CallingConvention saveErrno, boolean returnType) {
      this.functionAddress = address;
      this.callContext = CallContext.getCallContext(returnType, fixedParamCount, paramTypes, convention, saveErrno);
      this.contextAddress = this.callContext.getAddress();
   }

   public final CallContext getCallContext() {
      return this.callContext;
   }

   public Function(long paramTypes, Type returnType, Type[] convention, CallingConvention address) {
      this(address, returnType, paramTypes, convention, true);
   }
}
