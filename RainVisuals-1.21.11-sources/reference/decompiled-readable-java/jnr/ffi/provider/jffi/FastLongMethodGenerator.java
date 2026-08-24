/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.Platform;
import jnr.ffi.CallingConvention;
import jnr.ffi.NativeType;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;
import jnr.ffi.provider.jffi.AbstractFastNumericMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.FastIntMethodGenerator;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.Util;

public class FastLongMethodGenerator
extends AbstractFastNumericMethodGenerator {
    private static final int MAX_PARAMETERS;
    private static final String[] methodNames;
    private static final boolean ENABLED;
    private static final String[] signatures;

    static boolean isFastLongParameter(Platform platform, ParameterType type) {
        return FastLongMethodGenerator.isFastLongType(platform, type);
    }

    @Override
    String getInvokerSignature(int parameterCount, Class nativeIntType) {
        if (parameterCount <= MAX_PARAMETERS && parameterCount <= signatures.length) {
            return signatures[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
    }

    static int getMaximumFastLongParameters() {
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
            Invoker.class.getDeclaredMethod("invokeL6", classArray);
            return 6;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    @Override
    String getInvokerMethodName(ResultType resultType, ParameterType[] parameterTypes, boolean ignoreErrno) {
        int parameterCount = parameterTypes.length;
        if (parameterCount <= MAX_PARAMETERS && parameterCount <= methodNames.length) {
            return methodNames[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
    }

    /*
     * WARNING - void declaration
     */
    static {
        ENABLED = Util.getBooleanProperty("jnr.ffi.fast-long.enabled", true);
        MAX_PARAMETERS = FastLongMethodGenerator.getMaximumFastLongParameters();
        String[] stringArray = new String[7];
        stringArray[0] = "invokeL0";
        stringArray[1] = "invokeL1";
        stringArray[2] = "invokeL2";
        stringArray[3] = "invokeL3";
        stringArray[4] = "invokeL4";
        stringArray[5] = "invokeL5";
        stringArray[6] = "invokeL6";
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
            FastLongMethodGenerator.signatures[i] = var1_1.append(")J").toString();
            ++var0;
        }
    }

    private static boolean isFastLongType(Platform platform, SigType type) {
        return FastIntMethodGenerator.isFastIntType(platform, type) || type.getNativeType() == NativeType.ADDRESS && NumberUtil.sizeof(NativeType.ADDRESS) == 8 || type.getNativeType() == NativeType.SLONG || type.getNativeType() == NativeType.ULONG || type.getNativeType() == NativeType.SLONGLONG || type.getNativeType() == NativeType.ULONGLONG;
    }

    static boolean isFastLongResult(Platform platform, ResultType resultType) {
        return FastLongMethodGenerator.isFastLongType(platform, resultType) || resultType.getNativeType() == NativeType.VOID || resultType.getNativeType() == NativeType.ADDRESS && NumberUtil.sizeof(NativeType.ADDRESS) == 8;
    }

    @Override
    Class getInvokerType() {
        return Long.TYPE;
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
        if (platform.getCPU() != Platform.CPU.X86_64) {
            return false;
        }
        if (platform.getOS().equals((Object)Platform.OS.WINDOWS)) {
            return false;
        }
        ParameterType[] parameterTypeArray = parameterTypes;
        int n = parameterTypeArray.length;
        for (int i = 0; i < n; ++i) {
            ParameterType parameterType = parameterTypeArray[i];
            if (FastLongMethodGenerator.isFastLongParameter(platform, parameterType)) continue;
            return false;
        }
        return FastLongMethodGenerator.isFastLongResult((Platform)var5_5, (ResultType)var1_1);
    }
}

