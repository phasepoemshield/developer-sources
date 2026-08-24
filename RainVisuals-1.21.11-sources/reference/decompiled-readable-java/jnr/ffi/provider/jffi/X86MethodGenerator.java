/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Label
 */
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
import jnr.ffi.provider.jffi.AbstractAsmLibraryInterface;
import jnr.ffi.provider.jffi.AbstractFastNumericMethodGenerator;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BaseMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.LocalVariable;
import jnr.ffi.provider.jffi.LocalVariableAllocator;
import jnr.ffi.provider.jffi.MethodGenerator;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.ParameterStrategy;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import jnr.ffi.provider.jffi.StubCompiler;
import jnr.ffi.provider.jffi.ToNativeOp;
import jnr.ffi.provider.jffi.Util;
import org.objectweb.asm.Label;

class X86MethodGenerator
implements MethodGenerator {
    private static final boolean ENABLED = Util.getBooleanProperty("jnr.ffi.x86asm.enabled", true);
    private final AtomicLong nextMethodID = new AtomicLong(0L);
    private final StubCompiler compiler;

    X86MethodGenerator(StubCompiler compiler) {
        this.compiler = compiler;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean isSupported(ResultType resultType, ParameterType[] parameterTypes, CallingConvention callingConvention) {
        void var3_3;
        void var2_2;
        void var1_1;
        if (!ENABLED) {
            return false;
        }
        Platform platform = Platform.getPlatform();
        if (platform.getOS().equals((Object)Platform.OS.WINDOWS)) {
            return false;
        }
        if (!(platform.getCPU().equals((Object)Platform.CPU.I386) || platform.getCPU().equals((Object)Platform.CPU.X86_64) || platform.getCPU().equals((Object)Platform.CPU.AARCH64))) {
            return false;
        }
        if (!callingConvention.equals((Object)CallingConvention.DEFAULT)) {
            return false;
        }
        int objectCount = 0;
        int i = 0;
        while (i < parameterTypes.length) {
            void var6_6;
            if (!X86MethodGenerator.isSupportedParameter(parameterTypes[i])) {
                return false;
            }
            if (X86MethodGenerator.isSupportedObjectParameterType(parameterTypes[i])) {
                ++objectCount;
            }
            ++var6_6;
        }
        if (objectCount > 0) {
            if (parameterTypes.length > 4) return false;
            if (objectCount > 3) {
                return false;
            }
        }
        if (!X86MethodGenerator.isSupportedResult(resultType)) return false;
        if (!this.compiler.canCompile((ResultType)var1_1, (ParameterType[])var2_2, (CallingConvention)var3_3)) return false;
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private static void generateWrapper(AsmBuilder builder, String functionName, Function function, ResultType resultType, ParameterType[] parameterTypes, String nativeMethodName, Class nativeReturnType, Class[] nativeParameterTypes) {
        void var10_11;
        void var9_10;
        Class[] javaParameterTypes = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; ++i) {
            javaParameterTypes[i] = parameterTypes[i].getDeclaredType();
        }
        SkinnyMethodAdapter mv = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, functionName, CodegenUtils.sig(resultType.getDeclaredType(), javaParameterTypes), null, null);
        mv.setMethodVisitor(AsmUtil.newTraceMethodVisitor(mv.getMethodVisitor()));
        mv.start();
        LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(parameterTypes);
        LocalVariable objCount = localVariableAllocator.allocate(Integer.TYPE);
        LocalVariable[] parameters = AsmUtil.getParameterVariables(parameterTypes);
        LocalVariable[] converted = new LocalVariable[parameterTypes.length];
        int pointerCount = 0;
        for (int i = 0; i < parameterTypes.length; ++i) {
            Class javaParameterClass = parameterTypes[i].effectiveJavaType();
            Class nativeParameterClass = nativeParameterTypes[i];
            converted[i] = BaseMethodGenerator.loadAndConvertParameter(builder, mv, localVariableAllocator, parameters[i], parameterTypes[i]);
            ToNativeOp toNativeOp = ToNativeOp.get(parameterTypes[i]);
            if (toNativeOp != null && toNativeOp.isPrimitive()) {
                toNativeOp.emitPrimitive(mv, nativeParameterClass, parameterTypes[i].getNativeType());
                continue;
            }
            if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterClass)) {
                pointerCount = AbstractFastNumericMethodGenerator.emitDirectCheck(mv, javaParameterClass, nativeParameterClass, converted[i], objCount, pointerCount);
                continue;
            }
            if (javaParameterClass.isPrimitive()) continue;
            throw new IllegalArgumentException("unsupported type " + javaParameterClass);
        }
        Label hasObjects = new Label();
        Label convertResult = new Label();
        if (pointerCount > 0) {
            mv.iload(objCount);
            mv.ifne(hasObjects);
        }
        mv.invokestatic(builder.getClassNamePath(), nativeMethodName, CodegenUtils.sig(nativeReturnType, nativeParameterTypes));
        Class unboxedResultType = AsmUtil.unboxedReturnType(resultType.effectiveJavaType());
        NumberUtil.convertPrimitive(mv, nativeReturnType, unboxedResultType);
        if (pointerCount > 0) {
            mv.label(convertResult);
        }
        BaseMethodGenerator.emitEpilogue(builder, mv, resultType, parameterTypes, parameters, converted, null);
        if (pointerCount > 0) {
            void var16_18;
            int i;
            mv.label(hasObjects);
            LocalVariable[] tmp = new LocalVariable[parameterTypes.length];
            for (i = parameterTypes.length - 1; i >= 0; --i) {
                tmp[i] = localVariableAllocator.allocate(Long.TYPE);
                if (Float.TYPE == nativeParameterTypes[i]) {
                    Class[] classArray = new Class[1];
                    classArray[0] = Float.TYPE;
                    mv.invokestatic(Float.class, "floatToRawIntBits", Integer.TYPE, classArray);
                    mv.i2l();
                } else if (Double.TYPE == nativeParameterTypes[i]) {
                    Class[] classArray = new Class[1];
                    classArray[0] = Double.TYPE;
                    mv.invokestatic(Double.class, "doubleToRawLongBits", Long.TYPE, classArray);
                } else {
                    NumberUtil.convertPrimitive(mv, nativeParameterTypes[i], Long.TYPE, parameterTypes[i].getNativeType());
                }
                mv.lstore(tmp[i]);
            }
            mv.getstatic(CodegenUtils.p(AbstractAsmLibraryInterface.class), "ffi", CodegenUtils.ci(Invoker.class));
            mv.aload(0);
            mv.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(function), CodegenUtils.ci(CallContext.class));
            mv.aload(0);
            mv.getfield(builder.getClassNamePath(), builder.getFunctionAddressFieldName(function), CodegenUtils.ci(Long.TYPE));
            mv.lload(tmp);
            mv.iload(objCount);
            i = 0;
            while (i < parameterTypes.length) {
                void var19_21;
                LocalVariable[] strategies = new LocalVariable[parameterTypes.length];
                Class javaParameterType = parameterTypes[i].effectiveJavaType();
                if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
                    void var22_24;
                    mv.aload(converted[i]);
                    AbstractFastNumericMethodGenerator.emitParameterStrategyLookup(mv, javaParameterType);
                    strategies[i] = localVariableAllocator.allocate(ParameterStrategy.class);
                    mv.astore(strategies[i]);
                    mv.aload(converted[i]);
                    mv.aload(strategies[i]);
                    ObjectParameterInfo info = ObjectParameterInfo.create(i, AsmUtil.getNativeArrayFlags(parameterTypes[i].annotations()));
                    mv.aload(0);
                    mv.getfield(builder.getClassNamePath(), builder.getObjectParameterInfoName((ObjectParameterInfo)var22_24), CodegenUtils.ci(ObjectParameterInfo.class));
                }
                ++var19_21;
            }
            mv.invokevirtual(CodegenUtils.p(Invoker.class), AbstractFastNumericMethodGenerator.getObjectParameterMethodName(parameterTypes.length), AbstractFastNumericMethodGenerator.getObjectParameterMethodSignature(parameterTypes.length, pointerCount));
            if (Float.TYPE == nativeReturnType) {
                NumberUtil.narrow(mv, Long.TYPE, Integer.TYPE);
                Class[] classArray = new Class[1];
                classArray[0] = Integer.TYPE;
                mv.invokestatic(Float.class, "intBitsToFloat", Float.TYPE, classArray);
            } else if (Double.TYPE == nativeReturnType) {
                Class[] classArray = new Class[1];
                classArray[0] = Long.TYPE;
                mv.invokestatic(Double.class, "longBitsToDouble", Double.TYPE, classArray);
            } else if (Void.TYPE == nativeReturnType) {
                mv.pop2();
            }
            NumberUtil.convertPrimitive(mv, Long.TYPE, unboxedResultType, resultType.getNativeType());
            var9_10.go_to((Label)var16_18);
        }
        var9_10.visitMaxs(100, var10_11.getSpaceUsed());
        var9_10.visitEnd();
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
            case ADDRESS: {
                return NumberUtil.sizeof(nativeType) <= 4 ? Integer.TYPE : Long.TYPE;
            }
            case FLOAT: {
                return Float.TYPE;
            }
            case DOUBLE: {
                return Double.TYPE;
            }
            case VOID: {
                return Void.TYPE;
            }
        }
        throw new IllegalArgumentException("unsupported native type: " + (Object)((Object)nativeType));
    }

    static boolean isSupportedParameter(ParameterType parameterType) {
        return X86MethodGenerator.isSupportedType(parameterType) || X86MethodGenerator.isSupportedObjectParameterType(parameterType);
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
            case DOUBLE: {
                return true;
            }
        }
        return false;
    }

    static boolean isSupportedResult(ResultType resultType) {
        return X86MethodGenerator.isSupportedType(resultType) || Void.TYPE == resultType.effectiveJavaType() || resultType.getNativeType() == NativeType.ADDRESS;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void generate(AsmBuilder builder, String functionName, Function function, ResultType resultType, ParameterType[] parameterTypes, boolean ignoreError) {
        Class[] nativeParameterTypes = new Class[parameterTypes.length];
        boolean wrapperNeeded = false;
        for (int i = 0; i < parameterTypes.length; ++i) {
            wrapperNeeded |= parameterTypes[i].getToNativeConverter() != null || !parameterTypes[i].effectiveJavaType().isPrimitive();
            nativeParameterTypes[i] = !parameterTypes[i].effectiveJavaType().isPrimitive() ? X86MethodGenerator.getNativeClass(parameterTypes[i].getNativeType()) : parameterTypes[i].effectiveJavaType();
        }
        Class nativeReturnType = resultType.effectiveJavaType().isPrimitive() && !Boolean.TYPE.equals(resultType.effectiveJavaType()) ? resultType.effectiveJavaType() : X86MethodGenerator.getNativeClass(resultType.getNativeType());
        String stubName = functionName + ((wrapperNeeded |= resultType.getFromNativeConverter() != null || !resultType.effectiveJavaType().isPrimitive() || Boolean.TYPE.equals(resultType.effectiveJavaType())) ? "$jni$" + this.nextMethodID.incrementAndGet() : "");
        builder.getClassVisitor().visitMethod(0x111 | (wrapperNeeded ? 8 : 0), stubName, CodegenUtils.sig(nativeReturnType, nativeParameterTypes), null, null);
        this.compiler.compile(function, stubName, resultType, parameterTypes, nativeReturnType, nativeParameterTypes, CallingConvention.DEFAULT, !ignoreError);
        if (wrapperNeeded) {
            void var7_7;
            void var9_10;
            void var10_11;
            void var5_5;
            void var4_4;
            void var3_3;
            X86MethodGenerator.generateWrapper(builder, functionName, (Function)var3_3, (ResultType)var4_4, (ParameterType[])var5_5, (String)var10_11, (Class)var9_10, (Class[])var7_7);
        }
    }
}

