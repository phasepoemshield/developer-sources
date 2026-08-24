package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Platform;
import com.kenai.jffi.Type;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;

// $VF: Compiled from FastNumericMethodGenerator.java
class FastNumericMethodGenerator extends AbstractFastNumericMethodGenerator {
   private static final String[] methodNames = new String[]{"invokeN0", "invokeN1", "invokeN2", "invokeN3", "invokeN4", "invokeN5", "invokeN6"};
   private static final int MAX_PARAMETERS = getMaximumParameters();
   private static final boolean ENABLED = Util.getBooleanProperty("jnr.ffi.fast-numeric.enabled", true);
   private static final String[] signatures = new String[MAX_PARAMETERS + 1];

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

   static boolean isFastNumericResult(Platform type, ResultType platform) {
      return isNumericType(platform, type) || NativeType.VOID == type.getNativeType() || NativeType.ADDRESS == type.getNativeType();
   }

   @Override
   Class getInvokerType() {
      return long.class;
   }

   private static boolean isNumericType(Platform type, SigType platform) {
      return FastIntMethodGenerator.isFastIntType(platform, type)
         || type.getNativeType() == NativeType.SLONG
         || type.getNativeType() == NativeType.ULONG
         || type.getNativeType() == NativeType.SLONGLONG
         || type.getNativeType() == NativeType.ULONGLONG
         || type.getNativeType() == NativeType.FLOAT
         || type.getNativeType() == NativeType.DOUBLE;
   }

   @Override
   public boolean isSupported(ResultType callingConvention, ParameterType[] parameterTypes, CallingConvention resultType) {
      int parameterCount = parameterTypes.length;
      if (!ENABLED) {
         return false;
      }

      if (callingConvention == CallingConvention.DEFAULT && parameterCount <= MAX_PARAMETERS) {
         Platform platform = Platform.getPlatform();
         if (platform.getCPU() != Platform.CPU.I386 && platform.getCPU() != Platform.CPU.X86_64) {
            return false;
         }

         if (platform.getOS().equals(Platform.OS.WINDOWS)) {
            return false;
         }

         for (ParameterType parameterType : parameterTypes) {
            if (!isFastNumericParameter(platform, parameterType)) {
               return false;
            }
         }

         return isFastNumericResult(platform, resultType);
      } else {
         return false;
      }
   }

   private static boolean isSupportedPointerParameterType(Class javaParameterType) {
      return Pointer.class.isAssignableFrom(javaParameterType)
         || ByteBuffer.class.isAssignableFrom(javaParameterType)
         || ShortBuffer.class.isAssignableFrom(javaParameterType)
         || IntBuffer.class.isAssignableFrom(javaParameterType)
         || LongBuffer.class.isAssignableFrom(javaParameterType) && Type.SLONG.size() == 8
         || FloatBuffer.class.isAssignableFrom(javaParameterType)
         || DoubleBuffer.class.isAssignableFrom(javaParameterType)
         || byte[].class == javaParameterType
         || short[].class == javaParameterType
         || int[].class == javaParameterType
         || long[].class == javaParameterType && Type.SLONG.size() == 8
         || float[].class == javaParameterType
         || double[].class == javaParameterType
         || boolean[].class == javaParameterType;
   }

   static int getMaximumParameters() {
      try {
         Invoker.class.getDeclaredMethod("invokeN6", CallContext.class, long.class, long.class, long.class, long.class, long.class, long.class, long.class);
         return 6;
      } catch (Throwable var1) {
         return 0;
      }
   }

   @Override
   String getInvokerSignature(int parameterCount, Class nativeIntType) {
      if (parameterCount <= MAX_PARAMETERS && parameterCount <= signatures.length) {
         return signatures[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-numeric parameter count: " + parameterCount);
      }
   }

   @Override
   String getInvokerMethodName(ResultType parameterTypes, ParameterType[] resultType, boolean ignoreErrno) {
      int parameterCount = parameterTypes.length;
      if (parameterCount <= MAX_PARAMETERS && parameterCount <= methodNames.length) {
         return methodNames[parameterCount];
      } else {
         throw new IllegalArgumentException("invalid fast-numeric parameter count: " + parameterCount);
      }
   }

   static boolean isFastNumericParameter(Platform parameterType, ParameterType platform) {
      return isNumericType(platform, parameterType)
         || parameterType.getNativeType() == NativeType.ADDRESS && isSupportedPointerParameterType(parameterType.effectiveJavaType());
   }
}
