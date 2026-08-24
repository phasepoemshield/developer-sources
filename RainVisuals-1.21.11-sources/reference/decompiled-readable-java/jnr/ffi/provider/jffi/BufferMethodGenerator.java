/*
 * Decompiled with CFR 0.152.
 */
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
import jnr.ffi.provider.jffi.AbstractFastNumericMethodGenerator;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BaseMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.LocalVariable;
import jnr.ffi.provider.jffi.LocalVariableAllocator;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.PointerParameterStrategy;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import jnr.ffi.provider.jffi.ToNativeOp;

final class BufferMethodGenerator
extends BaseMethodGenerator {
    static final Map<NativeType, InvokeOp> invokeOps;
    static final Map<NativeType, MarshalOp> marshalOps;

    private static void emitPrimitiveOp(SkinnyMethodAdapter mv, ParameterType parameterType, ToNativeOp op) {
        MarshalOp marshalOp = marshalOps.get((Object)parameterType.getNativeType());
        if (marshalOp == null) {
            throw new IllegalArgumentException("unsupported parameter type " + parameterType);
        }
        op.emitPrimitive(mv, marshalOp.primitiveClass, parameterType.getNativeType());
        Class[] classArray = new Class[1];
        classArray[0] = marshalOp.primitiveClass;
        mv.invokevirtual(HeapInvocationBuffer.class, marshalOp.methodName, Void.TYPE, classArray);
    }

    BufferMethodGenerator() {
    }

    static boolean isSessionRequired(ParameterType[] parameterTypes) {
        ParameterType[] parameterTypeArray = parameterTypes;
        int n = parameterTypeArray.length;
        for (int i = 0; i < n; ++i) {
            ParameterType parameterType = parameterTypeArray[i];
            if (!BufferMethodGenerator.isSessionRequired(parameterType)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var1_1;
        void var0;
        EnumMap<NativeType, MarshalOp> mops = new EnumMap<NativeType, MarshalOp>(NativeType.class);
        EnumMap<NativeType, InvokeOp> iops = new EnumMap<NativeType, InvokeOp>(NativeType.class);
        mops.put(NativeType.SCHAR, new MarshalOp("Byte", Integer.TYPE));
        mops.put(NativeType.UCHAR, new MarshalOp("Byte", Integer.TYPE));
        mops.put(NativeType.SSHORT, new MarshalOp("Short", Integer.TYPE));
        mops.put(NativeType.USHORT, new MarshalOp("Short", Integer.TYPE));
        mops.put(NativeType.SINT, new MarshalOp("Int", Integer.TYPE));
        mops.put(NativeType.UINT, new MarshalOp("Int", Integer.TYPE));
        mops.put(NativeType.SLONGLONG, new MarshalOp("Long", Long.TYPE));
        mops.put(NativeType.ULONGLONG, new MarshalOp("Long", Long.TYPE));
        mops.put(NativeType.FLOAT, new MarshalOp("Float", Float.TYPE));
        mops.put(NativeType.DOUBLE, new MarshalOp("Double", Double.TYPE));
        mops.put(NativeType.ADDRESS, new MarshalOp("Address", Long.TYPE));
        if (NumberUtil.sizeof(NativeType.SLONG) == 4) {
            mops.put(NativeType.SLONG, new MarshalOp("Int", Integer.TYPE));
            mops.put(NativeType.ULONG, new MarshalOp("Int", Integer.TYPE));
        } else {
            mops.put(NativeType.SLONG, new MarshalOp("Long", Long.TYPE));
            mops.put(NativeType.ULONG, new MarshalOp("Long", Long.TYPE));
        }
        iops.put(NativeType.SCHAR, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.UCHAR, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.SSHORT, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.USHORT, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.SINT, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.UINT, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.VOID, new InvokeOp("Int", Integer.TYPE));
        iops.put(NativeType.SLONGLONG, new InvokeOp("Long", Long.TYPE));
        iops.put(NativeType.ULONGLONG, new InvokeOp("Long", Long.TYPE));
        iops.put(NativeType.FLOAT, new InvokeOp("Float", Float.TYPE));
        iops.put(NativeType.DOUBLE, new InvokeOp("Double", Double.TYPE));
        iops.put(NativeType.ADDRESS, new InvokeOp("Address", Long.TYPE));
        if (NumberUtil.sizeof(NativeType.SLONG) == 4) {
            iops.put(NativeType.SLONG, new InvokeOp("Int", Integer.TYPE));
            iops.put(NativeType.ULONG, new InvokeOp("Int", Integer.TYPE));
        } else {
            iops.put(NativeType.SLONG, new InvokeOp("Long", Long.TYPE));
            iops.put(NativeType.ULONG, new InvokeOp("Long", Long.TYPE));
        }
        marshalOps = Collections.unmodifiableMap(var0);
        invokeOps = Collections.unmodifiableMap(var1_1);
    }

    /*
     * WARNING - void declaration
     */
    void generateBufferInvocation(AsmBuilder builder, SkinnyMethodAdapter mv, LocalVariableAllocator localVariableAllocator, CallContext callContext, ResultType resultType, ParameterType[] parameterTypes) {
        void var8_8;
        void var7_7;
        void var10_10;
        void var9_9;
        void var6_6;
        void var5_5;
        void var2_2;
        void var1_1;
        boolean sessionRequired = BufferMethodGenerator.isSessionRequired(parameterTypes);
        LocalVariable session = localVariableAllocator.allocate(InvocationSession.class);
        if (sessionRequired) {
            mv.newobj(CodegenUtils.p(InvocationSession.class));
            mv.dup();
            mv.invokespecial(InvocationSession.class, "<init>", Void.TYPE, new Class[0]);
            mv.astore(session);
        }
        mv.aload(0);
        mv.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(callContext), CodegenUtils.ci(CallContext.class));
        Class[] classArray = new Class[1];
        classArray[0] = CallContext.class;
        mv.invokestatic(AsmRuntime.class, "newHeapInvocationBuffer", HeapInvocationBuffer.class, classArray);
        LocalVariable[] parameters = AsmUtil.getParameterVariables(parameterTypes);
        LocalVariable[] converted = new LocalVariable[parameterTypes.length];
        LocalVariable[] strategies = new LocalVariable[parameterTypes.length];
        int i = 0;
        while (i < parameterTypes.length) {
            void iop;
            mv.dup();
            if (BufferMethodGenerator.isSessionRequired(parameterTypes[i])) {
                mv.aload(session);
            }
            converted[i] = BufferMethodGenerator.loadAndConvertParameter(builder, mv, localVariableAllocator, parameters[i], parameterTypes[i]);
            Class javaParameterType = parameterTypes[i].effectiveJavaType();
            ToNativeOp op = ToNativeOp.get(parameterTypes[i]);
            if (op != null && op.isPrimitive()) {
                BufferMethodGenerator.emitPrimitiveOp(mv, parameterTypes[i], op);
            } else if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
                AbstractFastNumericMethodGenerator.emitParameterStrategyLookup(mv, javaParameterType);
                strategies[i] = localVariableAllocator.allocate(PointerParameterStrategy.class);
                mv.astore(strategies[i]);
                mv.aload(converted[i]);
                mv.aload(strategies[i]);
                mv.pushInt(AsmUtil.getNativeArrayFlags(parameterTypes[i].annotations()));
                Class[] classArray2 = new Class[3];
                classArray2[0] = Object.class;
                classArray2[1] = ObjectParameterStrategy.class;
                classArray2[2] = Integer.TYPE;
                mv.invokevirtual(HeapInvocationBuffer.class, "putObject", Void.TYPE, classArray2);
            } else {
                throw new IllegalArgumentException("unsupported parameter type " + parameterTypes[i]);
            }
            ++iop;
        }
        InvokeOp iop = invokeOps.get((Object)resultType.getNativeType());
        if (iop == null) {
            throw new IllegalArgumentException("unsupported return type " + resultType.getDeclaredType());
        }
        Class[] classArray3 = new Class[3];
        classArray3[0] = CallContext.class;
        classArray3[1] = Long.TYPE;
        classArray3[2] = HeapInvocationBuffer.class;
        mv.invokevirtual(Invoker.class, iop.methodName, iop.primitiveClass, classArray3);
        NumberUtil.convertPrimitive(mv, iop.primitiveClass, AsmUtil.unboxedReturnType(resultType.effectiveJavaType()), resultType.getNativeType());
        BufferMethodGenerator.emitEpilogue((AsmBuilder)var1_1, (SkinnyMethodAdapter)var2_2, (ResultType)var5_5, (ParameterType[])var6_6, (LocalVariable[])var9_9, (LocalVariable[])var10_10, var7_7 != false ? new Runnable(){
            final /* synthetic */ LocalVariable val$session;
            final /* synthetic */ SkinnyMethodAdapter val$mv;
            {
                this.val$mv = skinnyMethodAdapter;
                this.val$session = localVariable;
            }

            @Override
            public void run() {
                this.val$mv.aload(this.val$session);
                this.val$mv.invokevirtual(CodegenUtils.p(InvocationSession.class), "finish", "()V");
            }
        } : null);
    }

    @Override
    void generate(AsmBuilder builder, SkinnyMethodAdapter mv, LocalVariableAllocator localVariableAllocator, CallContext callContext, ResultType resultType, ParameterType[] parameterTypes, boolean ignoreError) {
        this.generateBufferInvocation(builder, mv, localVariableAllocator, callContext, resultType, parameterTypes);
    }

    @Override
    public boolean isSupported(ResultType resultType, ParameterType[] parameterTypes, CallingConvention callingConvention) {
        return true;
    }

    static boolean isSessionRequired(ParameterType parameterType) {
        return false;
    }

    private static final class MarshalOp
    extends Operation {
        private MarshalOp(String methodName, Class primitiveClass) {
            super("put" + methodName, primitiveClass);
        }
    }

    private static abstract class Operation {
        final String methodName;
        final Class primitiveClass;

        private Operation(String methodName, Class primitiveClass) {
            this.methodName = methodName;
            this.primitiveClass = primitiveClass;
        }
    }

    private static final class InvokeOp
    extends Operation {
        private InvokeOp(String methodName, Class primitiveClass) {
            super("invoke" + methodName, primitiveClass);
        }
    }
}

