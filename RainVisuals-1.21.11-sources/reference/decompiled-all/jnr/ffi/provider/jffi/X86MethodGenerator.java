package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Function;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.ObjectParameterInfo;
import com.kenai.jffi.Platform;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;
import org.objectweb.asm.Label;

// $VF: Compiled from X86MethodGenerator.java
class X86MethodGenerator implements MethodGenerator {
   private static final boolean ENABLED = Util.getBooleanProperty("jnr.ffi.x86asm.enabled", true);
   private final AtomicLong nextMethodID = new AtomicLong(0L);
   private final StubCompiler compiler;

   X86MethodGenerator(StubCompiler compiler) {
      this.compiler = compiler;
   }

   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] parameterTypes, CallingConvention resultType) {
      if (!ENABLED) {
         return false;
      }

      Platform platform = Platform.getPlatform();
      if (platform.getOS().equals(Platform.OS.WINDOWS)) {
         return false;
      }

      if (!platform.getCPU().equals(Platform.CPU.I386) && !platform.getCPU().equals(Platform.CPU.X86_64) && !platform.getCPU().equals(Platform.CPU.AARCH64)) {
         return false;
      }

      if (!callingConvention.equals(CallingConvention.DEFAULT)) {
         return false;
      }

      int objectCount = 0;

      for (int i = 0; i < parameterTypes.length; i++) {
         if (!isSupportedParameter(parameterTypes[i])) {
            return false;
         }

         if (isSupportedObjectParameterType(parameterTypes[i])) {
            objectCount++;
         }
      }

      return objectCount <= 0 || parameterTypes.length <= 4 && objectCount <= 3
         ? isSupportedResult(resultType) && this.compiler.canCompile(resultType, parameterTypes, callingConvention)
         : false;
   }

   private static void generateWrapper(
      AsmBuilder resultType,
      String functionName,
      Function builder,
      ResultType function,
      ParameterType[] nativeParameterTypes,
      String nativeMethodName,
      Class parameterTypes,
      Class[] nativeReturnType
   ) {
      Class[] javaParameterTypes = new Class[parameterTypes.length];

      for (int i = 0; i < parameterTypes.length; i++) {
         javaParameterTypes[i] = parameterTypes[i].getDeclaredType();
      }

      SkinnyMethodAdapter var23 = new SkinnyMethodAdapter(
         builder.getClassVisitor(), 17, functionName, CodegenUtils.sig(resultType.getDeclaredType(), javaParameterTypes), null, null
      );
      var23.setMethodVisitor(AsmUtil.newTraceMethodVisitor(var23.getMethodVisitor()));
      var23.start();
      LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(parameterTypes);
      LocalVariable objCount = localVariableAllocator.allocate(int.class);
      LocalVariable[] parameters = AsmUtil.getParameterVariables(parameterTypes);
      LocalVariable[] converted = new LocalVariable[parameterTypes.length];
      int pointerCount = 0;

      for (int hasObjects = 0; hasObjects < parameterTypes.length; hasObjects++) {
         Class convertResult = parameterTypes[hasObjects].effectiveJavaType();
         Class unboxedResultType = nativeParameterTypes[hasObjects];
         converted[hasObjects] = BaseMethodGenerator.loadAndConvertParameter(
            builder, var23, localVariableAllocator, parameters[hasObjects], parameterTypes[hasObjects]
         );
         ToNativeOp tmp = ToNativeOp.get(parameterTypes[hasObjects]);
         if (tmp != null && tmp.isPrimitive()) {
            tmp.emitPrimitive(var23, unboxedResultType, parameterTypes[hasObjects].getNativeType());
         } else if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(convertResult)) {
            pointerCount = AbstractFastNumericMethodGenerator.emitDirectCheck(
               var23, convertResult, unboxedResultType, converted[hasObjects], objCount, pointerCount
            );
         } else if (!convertResult.isPrimitive()) {
            throw new IllegalArgumentException("unsupported type " + convertResult);
         }
      }

      Label var24 = new Label();
      Label var25 = new Label();
      if (pointerCount > 0) {
         var23.iload(objCount);
         var23.ifne(var24);
      }

      var23.invokestatic(builder.getClassNamePath(), nativeMethodName, CodegenUtils.sig(nativeReturnType, nativeParameterTypes));
      Class var26 = AsmUtil.unboxedReturnType(resultType.effectiveJavaType());
      NumberUtil.convertPrimitive(var23, nativeReturnType, var26);
      if (pointerCount > 0) {
         var23.label(var25);
      }

      BaseMethodGenerator.emitEpilogue(builder, var23, resultType, parameterTypes, parameters, converted, null);
      if (pointerCount > 0) {
         var23.label(var24);
         LocalVariable[] var27 = new LocalVariable[parameterTypes.length];

         for (int i = parameterTypes.length - 1; i >= 0; i--) {
            var27[i] = localVariableAllocator.allocate(long.class);
            if (float.class == nativeParameterTypes[i]) {
               var23.invokestatic(Float.class, "floatToRawIntBits", int.class, float.class);
               var23.i2l();
            } else if (double.class == nativeParameterTypes[i]) {
               var23.invokestatic(Double.class, "doubleToRawLongBits", long.class, double.class);
            } else {
               NumberUtil.convertPrimitive(var23, nativeParameterTypes[i], long.class, parameterTypes[i].getNativeType());
            }

            var23.lstore(var27[i]);
         }

         var23.getstatic(CodegenUtils.p(AbstractAsmLibraryInterface.class), "ffi", CodegenUtils.ci(Invoker.class));
         var23.aload(0);
         var23.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(function), CodegenUtils.ci(CallContext.class));
         var23.aload(0);
         var23.getfield(builder.getClassNamePath(), builder.getFunctionAddressFieldName(function), CodegenUtils.ci(long.class));
         var23.lload(var27);
         var23.iload(objCount);

         for (int var28 = 0; var28 < parameterTypes.length; var28++) {
            LocalVariable[] strategies = new LocalVariable[parameterTypes.length];
            Class javaParameterType = parameterTypes[var28].effectiveJavaType();
            if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
               var23.aload(converted[var28]);
               AbstractFastNumericMethodGenerator.emitParameterStrategyLookup(var23, javaParameterType);
               var23.astore(strategies[var28] = localVariableAllocator.allocate(ParameterStrategy.class));
               var23.aload(converted[var28]);
               var23.aload(strategies[var28]);
               ObjectParameterInfo info = ObjectParameterInfo.create(var28, AsmUtil.getNativeArrayFlags(parameterTypes[var28].annotations()));
               var23.aload(0);
               var23.getfield(builder.getClassNamePath(), builder.getObjectParameterInfoName(info), CodegenUtils.ci(ObjectParameterInfo.class));
            }
         }

         var23.invokevirtual(
            CodegenUtils.p(Invoker.class),
            AbstractFastNumericMethodGenerator.getObjectParameterMethodName(parameterTypes.length),
            AbstractFastNumericMethodGenerator.getObjectParameterMethodSignature(parameterTypes.length, pointerCount)
         );
         if (float.class == nativeReturnType) {
            NumberUtil.narrow(var23, long.class, int.class);
            var23.invokestatic(Float.class, "intBitsToFloat", float.class, int.class);
         } else if (double.class == nativeReturnType) {
            var23.invokestatic(Double.class, "longBitsToDouble", double.class, long.class);
         } else if (void.class == nativeReturnType) {
            var23.pop2();
         }

         NumberUtil.convertPrimitive(var23, long.class, var26, resultType.getNativeType());
         var23.go_to(var25);
      }

      var23.visitMaxs(100, localVariableAllocator.getSpaceUsed());
      var23.visitEnd();
   }

   void attach(Class clazz) {
      this.compiler.attach(clazz);
   }

   static Class getNativeClass(NativeType nativeType) {
      switch (nativeType) {
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case SLONGLONG:
         case ULONGLONG:
         case ADDRESS:
            return NumberUtil.sizeof(nativeType) <= 4 ? int.class : long.class;
         case FLOAT:
            return float.class;
         case DOUBLE:
            return double.class;
         case VOID:
            return void.class;
         default:
            throw new IllegalArgumentException("unsupported native type: " + nativeType);
      }
   }

   static boolean isSupportedParameter(ParameterType parameterType) {
      return isSupportedType(parameterType) || isSupportedObjectParameterType(parameterType);
   }

   private static boolean isSupportedObjectParameterType(ParameterType type) {
      return Pointer.class.isAssignableFrom(type.effectiveJavaType());
   }

   private static boolean isSupportedType(SigType type) {
      switch (type.getNativeType()) {
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
         case SLONGLONG:
         case ULONGLONG:
         case FLOAT:
         case DOUBLE:
            return true;
         default:
            return false;
      }
   }

   static boolean isSupportedResult(ResultType resultType) {
      return isSupportedType(resultType) || void.class == resultType.effectiveJavaType() || resultType.getNativeType() == NativeType.ADDRESS;
   }

   @Override
   public void generate(AsmBuilder builder, String ignoreError, Function functionName, ResultType parameterTypes, ParameterType[] resultType, boolean function) {
      Class[] nativeParameterTypes = new Class[parameterTypes.length];
      boolean wrapperNeeded = false;

      for (int nativeReturnType = 0; nativeReturnType < parameterTypes.length; nativeReturnType++) {
         wrapperNeeded |= parameterTypes[nativeReturnType].getToNativeConverter() != null
            || !parameterTypes[nativeReturnType].effectiveJavaType().isPrimitive();
         if (!parameterTypes[nativeReturnType].effectiveJavaType().isPrimitive()) {
            nativeParameterTypes[nativeReturnType] = getNativeClass(parameterTypes[nativeReturnType].getNativeType());
         } else {
            nativeParameterTypes[nativeReturnType] = parameterTypes[nativeReturnType].effectiveJavaType();
         }
      }

      wrapperNeeded |= resultType.getFromNativeConverter() != null
         || !resultType.effectiveJavaType().isPrimitive()
         || boolean.class.equals(resultType.effectiveJavaType());
      Class var12;
      if (resultType.effectiveJavaType().isPrimitive() && !boolean.class.equals(resultType.effectiveJavaType())) {
         var12 = resultType.effectiveJavaType();
      } else {
         var12 = getNativeClass(resultType.getNativeType());
      }

      String stubName = functionName + (wrapperNeeded ? "$jni$" + this.nextMethodID.incrementAndGet() : "");
      builder.getClassVisitor().visitMethod(273 | (wrapperNeeded ? 8 : 0), stubName, CodegenUtils.sig(var12, nativeParameterTypes), null, null);
      this.compiler.compile(function, stubName, resultType, parameterTypes, var12, nativeParameterTypes, CallingConvention.DEFAULT, !ignoreError);
      if (wrapperNeeded) {
         generateWrapper(builder, functionName, function, resultType, parameterTypes, stubName, var12, nativeParameterTypes);
      }
   }
}
