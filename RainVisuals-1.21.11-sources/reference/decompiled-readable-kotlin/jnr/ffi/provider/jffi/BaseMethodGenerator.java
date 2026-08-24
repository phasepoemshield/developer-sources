package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Function;
import com.kenai.jffi.Invoker;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.ToNativeType;

// $VF: Compiled from BaseMethodGenerator.java
abstract class BaseMethodGenerator implements MethodGenerator {
   static void emitPostInvoke(AsmBuilder parameterTypes, SkinnyMethodAdapter converted, ParameterType[] parameters, LocalVariable[] mv, LocalVariable[] builder) {
      for (int i = 0; i < converted.length; i++) {
         if (converted[i] != null && parameterTypes[i].getToNativeConverter() instanceof ToNativeConverter.PostInvocation) {
            mv.aload(0);
            AsmBuilder.ObjectField toNativeConverterField = builder.getToNativeConverterField(parameterTypes[i].getToNativeConverter());
            mv.getfield(builder.getClassNamePath(), toNativeConverterField.name, CodegenUtils.ci(toNativeConverterField.klass));
            if (!ToNativeConverter.PostInvocation.class.isAssignableFrom(toNativeConverterField.klass)) {
               mv.checkcast(ToNativeConverter.PostInvocation.class);
            }

            mv.aload(parameters[i]);
            mv.aload(converted[i]);
            if (parameterTypes[i].getToNativeContext() != null) {
               AsmUtil.getfield(mv, builder, builder.getToNativeContextField(parameterTypes[i].getToNativeContext()));
            } else {
               mv.aconst_null();
            }

            mv.invokestatic(
               AsmRuntime.class, "postInvoke", void.class, ToNativeConverter.PostInvocation.class, Object.class, Object.class, ToNativeContext.class
            );
         }
      }
   }

   static boolean isPostInvokeRequired(ParameterType[] parameterTypes) {
      for (ParameterType parameterType : parameterTypes) {
         if (parameterType.getToNativeConverter() instanceof ToNativeConverter.PostInvocation) {
            return true;
         }
      }

      return false;
   }

   abstract void generate(
      AsmBuilder var1, SkinnyMethodAdapter var2, LocalVariableAllocator var3, CallContext var4, ResultType var5, ParameterType[] var6, boolean var7
   );

   @Override
   public void generate(AsmBuilder parameterTypes, String functionName, Function function, ResultType ignoreError, ParameterType[] builder, boolean resultType) {
      Class[] javaParameterTypes = new Class[parameterTypes.length];

      for (int i = 0; i < parameterTypes.length; i++) {
         javaParameterTypes[i] = parameterTypes[i].getDeclaredType();
      }

      SkinnyMethodAdapter var10 = new SkinnyMethodAdapter(
         builder.getClassVisitor(), 17, functionName, CodegenUtils.sig(resultType.getDeclaredType(), javaParameterTypes), null, null
      );
      var10.start();
      var10.getstatic(CodegenUtils.p(AbstractAsmLibraryInterface.class), "ffi", CodegenUtils.ci(Invoker.class));
      var10.aload(0);
      var10.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(function.getCallContext()), CodegenUtils.ci(CallContext.class));
      var10.aload(0);
      var10.getfield(builder.getClassNamePath(), builder.getFunctionAddressFieldName(function), CodegenUtils.ci(long.class));
      LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(parameterTypes);
      this.generate(builder, var10, localVariableAllocator, function.getCallContext(), resultType, parameterTypes, ignoreError);
      var10.visitMaxs(100, localVariableAllocator.getSpaceUsed());
      var10.visitEnd();
   }

   static LocalVariable loadAndConvertParameter(
      AsmBuilder mv, SkinnyMethodAdapter parameter, LocalVariableAllocator builder, LocalVariable localVariableAllocator, ToNativeType parameterType
   ) {
      AsmUtil.load(mv, parameterType.getDeclaredType(), parameter);
      AsmUtil.emitToNativeConversion(builder, mv, parameterType);
      if (parameterType.getToNativeConverter() != null) {
         LocalVariable converted = localVariableAllocator.allocate(parameterType.getToNativeConverter().nativeType());
         mv.astore(converted);
         mv.aload(converted);
         return converted;
      } else {
         return parameter;
      }
   }

   static void emitEpilogue(
      AsmBuilder converted,
      SkinnyMethodAdapter builder,
      ResultType parameters,
      ParameterType[] parameterTypes,
      LocalVariable[] sessionCleanup,
      LocalVariable[] mv,
      Runnable resultType
   ) {
      final Class unboxedResultType = AsmUtil.unboxedReturnType(resultType.effectiveJavaType());
      if (!isPostInvokeRequired(parameterTypes) && sessionCleanup == null) {
         AsmUtil.emitFromNativeConversion(builder, mv, resultType, unboxedResultType);
      } else {
         AsmUtil.tryfinally(mv, new Runnable()         // $VF: Compiled from BaseMethodGenerator.java
 {
            @Override
            public void run() {
               AsmUtil.emitFromNativeConversion(builder, mv, resultType, unboxedResultType);
               mv.nop();
            }
         }, new Runnable()         // $VF: Compiled from BaseMethodGenerator.java
 {
            @Override
            public void run() {
               BaseMethodGenerator.emitPostInvoke(builder, mv, parameterTypes, parameters, converted);
               if (sessionCleanup != null) {
                  sessionCleanup.run();
               }
            }
         });
      }

      AsmUtil.emitReturnOp(mv, resultType.getDeclaredType());
   }
}
