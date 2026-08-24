/*
 * Decompiled with CFR 0.152.
 */
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
import jnr.ffi.provider.jffi.AbstractFastNumericMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.Util;

final class FastIntMethodGenerator
extends AbstractFastNumericMethodGenerator {
    private static final String[] methodNames;
    private static final int MAX_FASTINT_PARAMETERS;
    private static final boolean ENABLED;
    private static final String[] signatures;

    static boolean isFastIntType(Platform platform, SigType type) {
        switch (type.getNativeType()) {
            case SCHAR: 
            case UCHAR: 
            case SSHORT: 
            case USHORT: 
            case SINT: 
            case UINT: 
            case SLONG: 
            case ULONG: {
                return NumberUtil.sizeof(type.getNativeType()) <= 4;
            }
        }
        return false;
    }

    @Override
    String getInvokerMethodName(ResultType resultType, ParameterType[] parameterTypes, boolean ignoreErrno) {
        int parameterCount = parameterTypes.length;
        if (parameterCount <= MAX_FASTINT_PARAMETERS && parameterCount <= methodNames.length) {
            return methodNames[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
    }

    FastIntMethodGenerator() {
    }

    @Override
    String getInvokerSignature(int parameterCount, Class nativeIntType) {
        if (parameterCount <= MAX_FASTINT_PARAMETERS && parameterCount <= signatures.length) {
            return signatures[parameterCount];
        }
        throw new IllegalArgumentException("invalid fast-int parameter count: " + parameterCount);
    }

    private static boolean isSupportedPointerParameterType(Class javaParameterType) {
        return Pointer.class.isAssignableFrom(javaParameterType);
    }

    @Override
    final Class getInvokerType() {
        return Integer.TYPE;
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
                if (!callingConvention.equals((Object)CallingConvention.DEFAULT)) break block7;
                if (parameterCount <= MAX_FASTINT_PARAMETERS) break block8;
            }
            return false;
        }
        Platform platform = Platform.getPlatform();
        if (platform.getOS().equals((Object)Platform.OS.WINDOWS)) {
            return false;
        }
        if (!platform.getCPU().equals((Object)Platform.CPU.I386) && !platform.getCPU().equals((Object)Platform.CPU.X86_64)) {
            return false;
        }
        ParameterType[] parameterTypeArray = parameterTypes;
        int n = parameterTypeArray.length;
        for (int i = 0; i < n; ++i) {
            ParameterType parameterType = parameterTypeArray[i];
            if (FastIntMethodGenerator.isFastIntParameter(platform, parameterType)) continue;
            return false;
        }
        return FastIntMethodGenerator.isFastIntResult((Platform)var5_5, (ResultType)var1_1);
    }

    static int getMaximumFastIntParameters() {
        try {
            Class[] classArray = new Class[8];
            classArray[0] = CallContext.class;
            classArray[1] = Long.TYPE;
            classArray[2] = Integer.TYPE;
            classArray[3] = Integer.TYPE;
            classArray[4] = Integer.TYPE;
            classArray[5] = Integer.TYPE;
            classArray[6] = Integer.TYPE;
            classArray[7] = Integer.TYPE;
            Invoker.class.getDeclaredMethod("invokeI6", classArray);
            return 6;
        }
        catch (Throwable throwable) {
            return 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean isFastIntParameter(Platform platform, ParameterType parameterType) {
        if (FastIntMethodGenerator.isFastIntType(platform, parameterType)) return true;
        if (parameterType.getNativeType() != NativeType.ADDRESS) return false;
        if (NumberUtil.sizeof(parameterType) != 4) return false;
        if (!FastIntMethodGenerator.isSupportedPointerParameterType(parameterType.effectiveJavaType())) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    static {
        ENABLED = Util.getBooleanProperty("jnr.ffi.fast-int.enabled", true);
        MAX_FASTINT_PARAMETERS = FastIntMethodGenerator.getMaximumFastIntParameters();
        String[] stringArray = new String[7];
        stringArray[0] = "invokeI0";
        stringArray[1] = "invokeI1";
        stringArray[2] = "invokeI2";
        stringArray[3] = "invokeI3";
        stringArray[4] = "invokeI4";
        stringArray[5] = "invokeI5";
        stringArray[6] = "invokeI6";
        methodNames = stringArray;
        signatures = new String[MAX_FASTINT_PARAMETERS + 1];
        int i = 0;
        while (i <= MAX_FASTINT_PARAMETERS) {
            void var0;
            void var1_1;
            StringBuilder sb = new StringBuilder();
            sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(Long.TYPE));
            int n = 0;
            while (n < i) {
                void var2_2;
                sb.append('I');
                ++var2_2;
            }
            FastIntMethodGenerator.signatures[i] = var1_1.append(")I").toString();
            ++var0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean isFastIntResult(Platform platform, ResultType resultType) {
        if (FastIntMethodGenerator.isFastIntType(platform, resultType)) return true;
        if (resultType.getNativeType() == NativeType.VOID) return true;
        if (resultType.getNativeType() != NativeType.ADDRESS) return false;
        if (NumberUtil.sizeof(resultType) != 4) return false;
        return true;
    }
}

