package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.HeapInvocationBuffer;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.ObjectParameterStrategy;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.provider.InvocationSession;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;

// $VF: Compiled from BufferMethodGenerator.java
final class BufferMethodGenerator extends BaseMethodGenerator {
   static final Map<NativeType, BufferMethodGenerator.InvokeOp> invokeOps;
   static final Map<NativeType, BufferMethodGenerator.MarshalOp> marshalOps;

   private static void emitPrimitiveOp(SkinnyMethodAdapter op, ParameterType mv, ToNativeOp parameterType) {
      BufferMethodGenerator.MarshalOp marshalOp = marshalOps.get(parameterType.getNativeType());
      if (marshalOp == null) {
         throw new IllegalArgumentException("unsupported parameter type " + parameterType);
      }

      op.emitPrimitive(mv, marshalOp.primitiveClass, parameterType.getNativeType());
      mv.invokevirtual(HeapInvocationBuffer.class, marshalOp.methodName, void.class, marshalOp.primitiveClass);
   }

   static boolean isSessionRequired(ParameterType[] parameterTypes) {
      for (ParameterType parameterType : parameterTypes) {
         if (isSessionRequired(parameterType)) {
            return true;
         }
      }

      return false;
   }

   static {
      Map<NativeType, BufferMethodGenerator.MarshalOp> mops = new EnumMap<>(NativeType.class);
      Map<NativeType, BufferMethodGenerator.InvokeOp> iops = new EnumMap<>(NativeType.class);
      mops.put(NativeType.SCHAR, new BufferMethodGenerator.MarshalOp("Byte", int.class));
      mops.put(NativeType.UCHAR, new BufferMethodGenerator.MarshalOp("Byte", int.class));
      mops.put(NativeType.SSHORT, new BufferMethodGenerator.MarshalOp("Short", int.class));
      mops.put(NativeType.USHORT, new BufferMethodGenerator.MarshalOp("Short", int.class));
      mops.put(NativeType.SINT, new BufferMethodGenerator.MarshalOp("Int", int.class));
      mops.put(NativeType.UINT, new BufferMethodGenerator.MarshalOp("Int", int.class));
      mops.put(NativeType.SLONGLONG, new BufferMethodGenerator.MarshalOp("Long", long.class));
      mops.put(NativeType.ULONGLONG, new BufferMethodGenerator.MarshalOp("Long", long.class));
      mops.put(NativeType.FLOAT, new BufferMethodGenerator.MarshalOp("Float", float.class));
      mops.put(NativeType.DOUBLE, new BufferMethodGenerator.MarshalOp("Double", double.class));
      mops.put(NativeType.ADDRESS, new BufferMethodGenerator.MarshalOp("Address", long.class));
      if (NumberUtil.sizeof(NativeType.SLONG) == 4) {
         mops.put(NativeType.SLONG, new BufferMethodGenerator.MarshalOp("Int", int.class));
         mops.put(NativeType.ULONG, new BufferMethodGenerator.MarshalOp("Int", int.class));
      } else {
         mops.put(NativeType.SLONG, new BufferMethodGenerator.MarshalOp("Long", long.class));
         mops.put(NativeType.ULONG, new BufferMethodGenerator.MarshalOp("Long", long.class));
      }

      iops.put(NativeType.SCHAR, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.UCHAR, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.SSHORT, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.USHORT, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.SINT, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.UINT, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.VOID, new BufferMethodGenerator.InvokeOp("Int", int.class));
      iops.put(NativeType.SLONGLONG, new BufferMethodGenerator.InvokeOp("Long", long.class));
      iops.put(NativeType.ULONGLONG, new BufferMethodGenerator.InvokeOp("Long", long.class));
      iops.put(NativeType.FLOAT, new BufferMethodGenerator.InvokeOp("Float", float.class));
      iops.put(NativeType.DOUBLE, new BufferMethodGenerator.InvokeOp("Double", double.class));
      iops.put(NativeType.ADDRESS, new BufferMethodGenerator.InvokeOp("Address", long.class));
      if (NumberUtil.sizeof(NativeType.SLONG) == 4) {
         iops.put(NativeType.SLONG, new BufferMethodGenerator.InvokeOp("Int", int.class));
         iops.put(NativeType.ULONG, new BufferMethodGenerator.InvokeOp("Int", int.class));
      } else {
         iops.put(NativeType.SLONG, new BufferMethodGenerator.InvokeOp("Long", long.class));
         iops.put(NativeType.ULONG, new BufferMethodGenerator.InvokeOp("Long", long.class));
      }

      marshalOps = Collections.unmodifiableMap(mops);
      invokeOps = Collections.unmodifiableMap(iops);
   }

   void generateBufferInvocation(
      AsmBuilder mv,
      SkinnyMethodAdapter callContext,
      LocalVariableAllocator builder,
      CallContext resultType,
      ResultType parameterTypes,
      ParameterType[] localVariableAllocator
   ) {
      boolean sessionRequired = isSessionRequired(parameterTypes);
      final LocalVariable session = localVariableAllocator.allocate(InvocationSession.class);
      if (sessionRequired) {
         mv.newobj(CodegenUtils.p(InvocationSession.class));
         mv.dup();
         mv.invokespecial(InvocationSession.class, "<init>", void.class);
         mv.astore(session);
      }

      mv.aload(0);
      mv.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(callContext), CodegenUtils.ci(CallContext.class));
      mv.invokestatic(AsmRuntime.class, "newHeapInvocationBuffer", HeapInvocationBuffer.class, CallContext.class);
      LocalVariable[] parameters = AsmUtil.getParameterVariables(parameterTypes);
      LocalVariable[] converted = new LocalVariable[parameterTypes.length];
      LocalVariable[] strategies = new LocalVariable[parameterTypes.length];

      for (int iop = 0; iop < parameterTypes.length; iop++) {
         mv.dup();
         if (isSessionRequired(parameterTypes[iop])) {
            mv.aload(session);
         }

         converted[iop] = loadAndConvertParameter(builder, mv, localVariableAllocator, parameters[iop], parameterTypes[iop]);
         Class javaParameterType = parameterTypes[iop].effectiveJavaType();
         ToNativeOp op = ToNativeOp.get(parameterTypes[iop]);
         if (op != null && op.isPrimitive()) {
            emitPrimitiveOp(mv, parameterTypes[iop], op);
         } else {
            if (!AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
               throw new IllegalArgumentException("unsupported parameter type " + parameterTypes[iop]);
            }

            AbstractFastNumericMethodGenerator.emitParameterStrategyLookup(mv, javaParameterType);
            mv.astore(strategies[iop] = localVariableAllocator.allocate(PointerParameterStrategy.class));
            mv.aload(converted[iop]);
            mv.aload(strategies[iop]);
            mv.pushInt(AsmUtil.getNativeArrayFlags(parameterTypes[iop].annotations()));
            mv.invokevirtual(HeapInvocationBuffer.class, "putObject", void.class, Object.class, ObjectParameterStrategy.class, int.class);
         }
      }

      BufferMethodGenerator.InvokeOp var15 = invokeOps.get(resultType.getNativeType());
      if (var15 == null) {
         throw new IllegalArgumentException("unsupported return type " + resultType.getDeclaredType());
      }

      mv.invokevirtual(Invoker.class, var15.methodName, var15.primitiveClass, CallContext.class, long.class, HeapInvocationBuffer.class);
      NumberUtil.convertPrimitive(mv, var15.primitiveClass, AsmUtil.unboxedReturnType(resultType.effectiveJavaType()), resultType.getNativeType());
      emitEpilogue(
         builder, mv, resultType, parameterTypes, parameters, converted, sessionRequired ? new Runnable()      // $VF: Compiled from BufferMethodGenerator.java
    {
            @Override
            public void run() {
               mv.aload(session);
               mv.invokevirtual(CodegenUtils.p(InvocationSession.class), "finish", "()V");
            }
         } : null
      );
   }

   @Override
   void generate(
      AsmBuilder builder,
      SkinnyMethodAdapter localVariableAllocator,
      LocalVariableAllocator resultType,
      CallContext parameterTypes,
      ResultType ignoreError,
      ParameterType[] mv,
      boolean callContext
   ) {
      this.generateBufferInvocation(builder, mv, localVariableAllocator, callContext, resultType, parameterTypes);
   }

   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] parameterTypes, CallingConvention resultType) {
      return true;
   }

   static boolean isSessionRequired(ParameterType parameterType) {
      return false;
   }

   // $VF: Compiled from BufferMethodGenerator.java
   private static final class InvokeOp extends BufferMethodGenerator.Operation {
      private InvokeOp(String methodName, Class primitiveClass) {
         super("invoke" + methodName, primitiveClass);
      }
   }

   // $VF: Compiled from BufferMethodGenerator.java
   private static final class MarshalOp extends BufferMethodGenerator.Operation {
      private MarshalOp(String methodName, Class primitiveClass) {
         super("put" + methodName, primitiveClass);
      }
   }

   // $VF: Compiled from BufferMethodGenerator.java
   private abstract static class Operation {
      final String methodName;
      final Class primitiveClass;

      private Operation(String primitiveClass, Class methodName) {
         this.methodName = methodName;
         this.primitiveClass = primitiveClass;
      }
   }
}
