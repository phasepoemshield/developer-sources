package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Platform;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;

// $VF: Compiled from FastIntMethodGenerator.java
final class FastIntMethodGenerator extends AbstractFastNumericMethodGenerator {
   private static final String[] methodNames = new String[]{"invokeI0", "invokeI1", "invokeI2", "invokeI3", "invokeI4", "invokeI5", "invokeI6"};
   private static final int MAX_FASTINT_PARAMETERS = getMaximumFastIntParameters();
   private static final boolean ENABLED = Util.getBooleanProperty("jnr.ffi.fast-int.enabled", true);
   private static final String[] signatures = new String[MAX_FASTINT_PARAMETERS + 1];

   static boolean isFastIntType(Platform platform, SigType type) {
      switch (type.getNativeType()) {
         case SCHAR:
         case UCHAR:
         case SSHORT:
         case USHORT:
         case SINT:
         case UINT:
         case SLONG:
         case ULONG:
            return NumberUtil.sizeof(type.getNativeType()) <= 4;
         default:
            return false;
      }
   }

   @Override
   String getInvokerMethodName(ResultType parameterTypes, ParameterType[] ignoreErrno, boolean resultType) {
      int parameterCount = parameterTypes.length;
      if (parameterCount <= MAX_FASTINT_PARAMETERS && parameterCount <= methodNames.length) {
         return methodNames[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
      }
   }

   @Override
   String getInvokerSignature(int parameterCount, Class nativeIntType) {
      if (parameterCount <= MAX_FASTINT_PARAMETERS && parameterCount <= signatures.length) {
         return signatures[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
      }
   }

   private static boolean isSupportedPointerParameterType(Class javaParameterType) {
      return Pointer.class.isAssignableFrom(javaParameterType);
   }

   @Override
   final Class getInvokerType() {
      return int.class;
   }

   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] resultType, CallingConvention parameterTypes) {
      int parameterCount = parameterTypes.length;
      if (!ENABLED) {
         return false;
      }

      if (callingConvention.equals(CallingConvention.DEFAULT) && parameterCount <= MAX_FASTINT_PARAMETERS) {
         Platform platform = Platform.getPlatform();
         if (platform.getOS().equals(Platform.OS.WINDOWS)) {
            return false;
         }

         if (!platform.getCPU().equals(Platform.CPU.I386) && !platform.getCPU().equals(Platform.CPU.X86_64)) {
            return false;
         }

         for (ParameterType parameterType : parameterTypes) {
            if (!isFastIntParameter(platform, parameterType)) {
               return false;
            }
         }

         return isFastIntResult(platform, resultType);
      } else {
         return false;
      }
   }

   static int getMaximumFastIntParameters() {
      try {
         Invoker.class.getDeclaredMethod("invokeI6", CallContext.class, long.class, int.class, int.class, int.class, int.class, int.class, int.class);
         return 6;
      } catch (Throwable var1) {
         return 0;
      }
   }

   static boolean isFastIntParameter(Platform parameterType, ParameterType platform) {
      return isFastIntType(platform, parameterType)
         || parameterType.getNativeType() == NativeType.ADDRESS
            && NumberUtil.sizeof(parameterType) == 4
            && isSupportedPointerParameterType(parameterType.effectiveJavaType());
   }

   static {
      for (int i = 0; i <= MAX_FASTINT_PARAMETERS; i++) {
         StringBuilder sb = new StringBuilder();
         sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(long.class));

         for (int n = 0; n < i; n++) {
            sb.append('I');
         }

         signatures[i] = sb.append(")I").toString();
      }
   }

   static boolean isFastIntResult(Platform resultType, ResultType platform) {
      return isFastIntType(platform, resultType)
         || resultType.getNativeType() == NativeType.VOID
         || resultType.getNativeType() == NativeType.ADDRESS && NumberUtil.sizeof(resultType) == 4;
   }
}
