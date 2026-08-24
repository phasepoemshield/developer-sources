package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Platform;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;

// $VF: Compiled from FastLongMethodGenerator.java
public class FastLongMethodGenerator extends AbstractFastNumericMethodGenerator {
   private static final int MAX_PARAMETERS = getMaximumFastLongParameters();
   private static final String[] methodNames = new String[]{"invokeL0", "invokeL1", "invokeL2", "invokeL3", "invokeL4", "invokeL5", "invokeL6"};
   private static final boolean ENABLED = Util.getBooleanProperty("jnr.ffi.fast-long.enabled", true);
   private static final String[] signatures = new String[MAX_PARAMETERS + 1];

   static boolean isFastLongParameter(Platform type, ParameterType platform) {
      return isFastLongType(platform, type);
   }

   @Override
   String getInvokerSignature(int nativeIntType, Class parameterCount) {
      if (parameterCount <= MAX_PARAMETERS && parameterCount <= signatures.length) {
         return signatures[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
      }
   }

   static int getMaximumFastLongParameters() {
      try {
         Invoker.class.getDeclaredMethod("invokeL6", CallContext.class, long.class, long.class, long.class, long.class, long.class, long.class, long.class);
         return 6;
      } catch (Throwable var1) {
         return 0;
      }
   }

   @Override
   String getInvokerMethodName(ResultType ignoreErrno, ParameterType[] resultType, boolean parameterTypes) {
      int parameterCount = parameterTypes.length;
      if (parameterCount <= MAX_PARAMETERS && parameterCount <= methodNames.length) {
         return methodNames[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
      }
   }

   static {
      for (int i = 0; i <= MAX_PARAMETERS; i++) {
         StringBuilder sb = new StringBuilder();
         sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(long.class));

         for (int n = 0; n < i; n++) {
            sb.append('J');
         }

         signatures[i] = sb.append(")J").toString();
      }
   }

   private static boolean isFastLongType(Platform type, SigType platform) {
      return FastIntMethodGenerator.isFastIntType(platform, type)
         || type.getNativeType() == NativeType.ADDRESS && NumberUtil.sizeof(NativeType.ADDRESS) == 8
         || type.getNativeType() == NativeType.SLONG
         || type.getNativeType() == NativeType.ULONG
         || type.getNativeType() == NativeType.SLONGLONG
         || type.getNativeType() == NativeType.ULONGLONG;
   }

   static boolean isFastLongResult(Platform resultType, ResultType platform) {
      return isFastLongType(platform, resultType)
         || resultType.getNativeType() == NativeType.VOID
         || resultType.getNativeType() == NativeType.ADDRESS && NumberUtil.sizeof(NativeType.ADDRESS) == 8;
   }

   @Override
   Class getInvokerType() {
      return long.class;
   }

   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] resultType, CallingConvention parameterTypes) {
      int parameterCount = parameterTypes.length;
      if (!ENABLED) {
         return false;
      }

      if (callingConvention == CallingConvention.DEFAULT && parameterCount <= MAX_PARAMETERS) {
         Platform platform = Platform.getPlatform();
         if (platform.getCPU() != Platform.CPU.X86_64) {
            return false;
         }

         if (platform.getOS().equals(Platform.OS.WINDOWS)) {
            return false;
         }

         for (ParameterType parameterType : parameterTypes) {
            if (!isFastLongParameter(platform, parameterType)) {
               return false;
            }
         }

         return isFastLongResult(platform, resultType);
      } else {
         return false;
      }
   }
}
