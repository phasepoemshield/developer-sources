/*
 * Decompiled with CFR 0.152.
 */
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
import jnr.ffi.provider.jffi.AbstractFastNumericMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.FastIntMethodGenerator;
import jnr.ffi.provider.jffi.Util;

class FastNumericMethodGenerator
extends AbstractFastNumericMethodGenerator {
    private static final String[] methodNames;
    private static final int MAX_PARAMETERS;
    private static final boolean ENABLED;
    private static final String[] signatures;

    /*
     * WARNING - void declaration
     */
    static {
        ENABLED = Util.getBooleanProperty("jnr.ffi.fast-numeric.enabled", true);
        MAX_PARAMETERS = FastNumericMethodGenerator.getMaximumParameters();
        String[] stringArray = new String[7];
        stringArray[0] = "invokeN0";
        stringArray[1] = "invokeN1";
        stringArray[2] = "invokeN2";
        stringArray[3] = "invokeN3";
        stringArray[4] = "invokeN4";
        stringArray[5] = "invokeN5";
        stringArray[6] = "invokeN6";
        methodNames = stringArray;
        signatures = new String[MAX_PARAMETERS + 1];
        int i = 0;
        while (i <= MAX_PARAMETERS) {
            void var0;
            void var1_1;
            StringBuilder sb = new StringBuilder();
            sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(Long.TYPE));
            int n = 0;
            while (n < i) {
                void var2_2;
                sb.append('J');
                ++var2_2;
            }
            FastNumericMethodGenerator.signatures[i] = var1_1.append(")J").toString();
            ++var0;
        }
    }

    static boolean isFastNumericResult(Platform platform, ResultType type) {
        return FastNumericMethodGenerator.isNumericType(platform, type) || NativeType.VOID == type.getNativeType() || NativeType.ADDRESS == type.getNativeType();
    }

    @Override
    Class getInvokerType() {
        return Long.TYPE;
    }

    FastNumericMethodGenerator() {
    }

    private static boolean isNumericType(Platform platform, SigType type) {
        return FastIntMethodGenerator.isFastIntType(platform, type) || type.getNativeType() == NativeType.SLONG || type.getNativeType() == NativeType.ULONG || type.getNativeType() == NativeType.SLONGLONG || type.getNativeType() == NativeType.ULONGLONG || type.getNativeType() == NativeType.FLOAT || type.getNativeType() == NativeType.DOUBLE;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean isSupported(ResultType resultType, ParameterType[] parameterTypes, CallingConvention callingConvention) {
        void var1_1;
        void var5_5;
        block8: {
            block7: {
                int parameterCount = parameterTypes.length;
                if (!ENABLED) {
                    return false;
                }
                if (callingConvention != CallingConvention.DEFAULT) break block7;
                if (parameterCount <= MAX_PARAMETERS) break block8;
            }
            return false;
        }
        Platform platform = Platform.getPlatform();
        if (platform.getCPU() != Platform.CPU.I386 && platform.getCPU() != Platform.CPU.X86_64) {
            return false;
        }
        if (platform.getOS().equals((Object)Platform.OS.WINDOWS)) {
            return false;
        }
        ParameterType[] parameterTypeArray = parameterTypes;
        int n = parameterTypeArray.length;
        for (int i = 0; i < n; ++i) {
            ParameterType parameterType = parameterTypeArray[i];
            if (FastNumericMethodGenerator.isFastNumericParameter(platform, parameterType)) continue;
            return false;
        }
        return FastNumericMethodGenerator.isFastNumericResult((Platform)var5_5, (ResultType)var1_1);
    }

    private static boolean isSupportedPointerParameterType(Class javaParameterType) {
        return Pointer.class.isAssignableFrom(javaParameterType) || ByteBuffer.class.isAssignableFrom(javaParameterType) || ShortBuffer.class.isAssignableFrom(javaParameterType) || IntBuffer.class.isAssignableFrom(javaParameterType) || LongBuffer.class.isAssignableFrom(javaParameterType) && Type.SLONG.size() == 8 || FloatBuffer.class.isAssignableFrom(javaParameterType) || DoubleBuffer.class.isAssignableFrom(javaParameterType) || byte[].class == javaParameterType || short[].class == javaParameterType || int[].class == javaParameterType || long[].class == javaParameterType && Type.SLONG.size() == 8 || float[].class == javaParameterType || double[].class == javaParameterType || boolean[].class == javaParameterType;
    }

    static int getMaximumParameters() {
        try {
            Class[] classArray = new Class[8];
            classArray[0] = CallContext.class;
            classArray[1] = Long.TYPE;
            classArray[2] = Long.TYPE;
            classArray[3] = Long.TYPE;
            classArray[4] = Long.TYPE;
            classArray[5] = Long.TYPE;
            classArray[6] = Long.TYPE;
            classArray[7] = Long.TYPE;
            Invoker.class.getDeclaredMethod("invokeN6", classArray);
            return 6;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    @Override
    String getInvokerSignature(int parameterCount, Class nativeIntType) {
        if (parameterCount <= MAX_PARAMETERS && parameterCount <= signatures.length) {
            return signatures[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-numeric parameter count: " + parameterCount);
    }

    @Override
    String getInvokerMethodName(ResultType resultType, ParameterType[] parameterTypes, boolean ignoreErrno) {
        int parameterCount = parameterTypes.length;
        if (parameterCount <= MAX_PARAMETERS && parameterCount <= methodNames.length) {
            return methodNames[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-numeric parameter count: " + parameterCount);
    }

    static boolean isFastNumericParameter(Platform platform, ParameterType parameterType) {
        return FastNumericMethodGenerator.isNumericType(platform, parameterType) || parameterType.getNativeType() == NativeType.ADDRESS && FastNumericMethodGenerator.isSupportedPointerParameterType(parameterType.effectiveJavaType());
    }
}

