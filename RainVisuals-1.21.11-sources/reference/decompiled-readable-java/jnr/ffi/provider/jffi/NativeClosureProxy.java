/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 */
package jnr.ffi.provider.jffi;

import java.io.PrintWriter;
import java.lang.ref.Reference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.ToNativeType;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.LocalVariable;
import jnr.ffi.provider.jffi.LocalVariableAllocator;
import jnr.ffi.provider.jffi.NativeClosureFactory;
import jnr.ffi.provider.jffi.NativeRuntime;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public abstract class NativeClosureProxy {
    private static final AtomicLong nextClassID;
    volatile Reference<?> closureReference;
    protected final Runtime runtime;
    public static final boolean DEBUG;

    static Class getNativeClass(NativeType nativeType) {
        switch (nativeType) {
            case SCHAR: 
            case UCHAR: {
                return Byte.TYPE;
            }
            case SSHORT: 
            case USHORT: {
                return Short.TYPE;
            }
            case SINT: 
            case UINT: {
                return Integer.TYPE;
            }
            case SLONG: 
            case ULONG: 
            case ADDRESS: {
                return NumberUtil.sizeof(nativeType) <= 4 ? Integer.TYPE : Long.TYPE;
            }
            case SLONGLONG: 
            case ULONGLONG: {
                return Long.TYPE;
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

    private static boolean isParameterTypeSupported(Class type) {
        return type.isPrimitive() || Boolean.TYPE == type || Boolean.class == type || Byte.class == type || Short.class == type || Integer.class == type || Long.class == type || Float.class == type || Double.class == type || Pointer.class == type;
    }

    protected Object getCallable() {
        Object callable = this.closureReference != null ? this.closureReference.get() : null;
        if (callable != null) {
            return callable;
        }
        throw new NullPointerException("callable is null");
    }

    /*
     * WARNING - void declaration
     */
    static Factory newProxyFactory(Runtime runtime, Method callMethod, ToNativeType resultType, FromNativeType[] parameterTypes, AsmClassLoader classLoader) {
        String closureProxyClassName = CodegenUtils.p(NativeClosureProxy.class) + "$$impl$$" + nextClassID.getAndIncrement();
        ClassWriter closureClassWriter = new ClassWriter(2);
        ClassWriter closureClassVisitor = DEBUG ? AsmUtil.newCheckClassAdapter((ClassVisitor)closureClassWriter) : closureClassWriter;
        AsmBuilder builder = new AsmBuilder(runtime, closureProxyClassName, (ClassVisitor)closureClassVisitor, classLoader);
        closureClassVisitor.visit(52, 17, closureProxyClassName, null, CodegenUtils.p(NativeClosureProxy.class), new String[0]);
        Class[] nativeParameterClasses = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; ++i) {
            nativeParameterClasses[i] = NativeClosureProxy.getNativeClass(parameterTypes[i].getNativeType());
        }
        Class nativeResultClass = NativeClosureProxy.getNativeClass(resultType.getNativeType());
        SkinnyMethodAdapter mv = new SkinnyMethodAdapter((ClassVisitor)closureClassVisitor, 17, "invoke", CodegenUtils.sig(nativeResultClass, nativeParameterClasses), null, null);
        mv.start();
        mv.aload(0);
        mv.invokevirtual(NativeClosureProxy.class, "getCallable", Object.class, new Class[0]);
        mv.checkcast(CodegenUtils.p(callMethod.getDeclaringClass()));
        LocalVariable[] parameterVariables = AsmUtil.getParameterVariables(nativeParameterClasses);
        LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(nativeParameterClasses);
        for (int i = 0; i < parameterTypes.length; ++i) {
            FromNativeType parameterType = parameterTypes[i];
            Class parameterClass = parameterType.effectiveJavaType();
            if (!NativeClosureProxy.isParameterTypeSupported(parameterClass)) {
                throw new IllegalArgumentException("unsupported closure parameter type " + parameterTypes[i].getDeclaredType());
            }
            AsmUtil.load(mv, nativeParameterClasses[i], parameterVariables[i]);
            if (!parameterClass.isPrimitive()) {
                AsmUtil.emitFromNativeConversion(builder, mv, parameterTypes[i], nativeParameterClasses[i]);
                continue;
            }
            NumberUtil.convertPrimitive(mv, nativeParameterClasses[i], parameterClass, parameterType.getNativeType());
        }
        if (callMethod.getDeclaringClass().isInterface()) {
            mv.invokeinterface(CodegenUtils.p(callMethod.getDeclaringClass()), callMethod.getName(), CodegenUtils.sig(callMethod.getReturnType(), callMethod.getParameterTypes()));
        } else {
            mv.invokevirtual(CodegenUtils.p(callMethod.getDeclaringClass()), callMethod.getName(), CodegenUtils.sig(callMethod.getReturnType(), callMethod.getParameterTypes()));
        }
        if (!NativeClosureProxy.isReturnTypeSupported(resultType.effectiveJavaType())) {
            throw new IllegalArgumentException("unsupported closure return type " + resultType.getDeclaredType());
        }
        AsmUtil.emitToNativeConversion(builder, mv, resultType);
        if (!resultType.effectiveJavaType().isPrimitive()) {
            if (Number.class.isAssignableFrom(resultType.effectiveJavaType())) {
                AsmUtil.unboxNumber(mv, resultType.effectiveJavaType(), nativeResultClass, resultType.getNativeType());
            } else if (Boolean.class.isAssignableFrom(resultType.effectiveJavaType())) {
                AsmUtil.unboxBoolean(mv, nativeResultClass);
            } else if (Pointer.class.isAssignableFrom(resultType.effectiveJavaType())) {
                AsmUtil.unboxPointer(mv, nativeResultClass);
            }
        }
        AsmUtil.emitReturnOp(mv, nativeResultClass);
        mv.visitMaxs(10, 10 + localVariableAllocator.getSpaceUsed());
        mv.visitEnd();
        Class[] classArray = new Class[2];
        classArray[0] = NativeRuntime.class;
        classArray[1] = Object[].class;
        SkinnyMethodAdapter closureInit = new SkinnyMethodAdapter((ClassVisitor)closureClassVisitor, 1, "<init>", CodegenUtils.sig(Void.TYPE, classArray), null, null);
        closureInit.start();
        closureInit.aload(0);
        closureInit.aload(1);
        Class[] classArray2 = new Class[1];
        classArray2[0] = NativeRuntime.class;
        closureInit.invokespecial(CodegenUtils.p(NativeClosureProxy.class), "<init>", CodegenUtils.sig(Void.TYPE, classArray2));
        AsmBuilder.ObjectField[] fields = builder.getObjectFieldArray();
        Object[] fieldObjects = new Object[fields.length];
        int i = 0;
        while (i < fieldObjects.length) {
            void closureImpBytes;
            fieldObjects[i] = fields[i].value;
            String fieldName = fields[i].name;
            builder.getClassVisitor().visitField(18, fieldName, CodegenUtils.ci(fields[i].klass), null, null);
            closureInit.aload(0);
            closureInit.aload(2);
            closureInit.pushInt(i);
            closureInit.aaload();
            if (fields[i].klass.isPrimitive()) {
                Class unboxedType = AsmUtil.unboxedType(fields[i].klass);
                closureInit.checkcast(unboxedType);
                AsmUtil.unboxNumber(closureInit, unboxedType, fields[i].klass);
            } else {
                closureInit.checkcast(fields[i].klass);
            }
            closureInit.putfield(builder.getClassNamePath(), fieldName, CodegenUtils.ci(fields[i].klass));
            ++closureImpBytes;
        }
        closureInit.voidreturn();
        closureInit.visitMaxs(10, 10);
        closureInit.visitEnd();
        closureClassVisitor.visitEnd();
        try {
            void var16_18;
            void var9_9;
            Runtime runtime2;
            void var19_23;
            Constructor<Object> constructor;
            ClassLoader cl;
            byte[] closureImpBytes = closureClassWriter.toByteArray();
            if (DEBUG) {
                cl = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
                new ClassReader(closureImpBytes).accept((ClassVisitor)cl, 0);
            }
            if ((cl = NativeClosureFactory.class.getClassLoader()) == null) {
                cl = Thread.currentThread().getContextClassLoader();
            }
            if (cl == null) {
                cl = ClassLoader.getSystemClassLoader();
            }
            Class klass = builder.getClassLoader().defineClass(CodegenUtils.c(closureProxyClassName), closureImpBytes);
            Object constructor2 = null;
            try {
                Class[] classArray3 = new Class[2];
                classArray3[0] = NativeRuntime.class;
                classArray3[1] = Object[].class;
                constructor = klass.getConstructor(classArray3);
            }
            catch (NoSuchMethodException noSuchMethodException) {
                constructor = var19_23.getConstructors()[0];
            }
            return new Factory(runtime2, constructor, var19_23.getMethod("invoke", (Class<?>)var9_9), (Object[])var16_18);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    private static boolean isReturnTypeSupported(Class type) {
        return type.isPrimitive() || Boolean.TYPE == type || Boolean.class == type || Byte.class == type || Short.class == type || Integer.class == type || Long.class == type || Float.class == type || Double.class == type || Pointer.class == type;
    }

    static {
        DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");
        nextClassID = new AtomicLong(0L);
    }

    protected NativeClosureProxy(NativeRuntime runtime) {
        this.runtime = runtime;
    }

    static class Factory {
        private final Object[] objectFields;
        private final Runtime runtime;
        private final Constructor<? extends NativeClosureProxy> constructor;
        private final Method invokeMethod;

        /*
         * WARNING - void declaration
         */
        NativeClosureProxy newClosureProxy() {
            try {
                Object[] objectArray = new Object[2];
                objectArray[0] = this.runtime;
                objectArray[1] = this.objectFields;
                return this.constructor.newInstance(objectArray);
            }
            catch (Throwable t) {
                void var1_1;
                throw new RuntimeException((Throwable)var1_1);
            }
        }

        Method getInvokeMethod() {
            return this.invokeMethod;
        }

        Factory(Runtime runtime, Constructor<? extends NativeClosureProxy> constructor, Method invokeMethod, Object[] objectFields) {
            this.runtime = runtime;
            this.constructor = constructor;
            this.invokeMethod = invokeMethod;
            this.objectFields = objectFields;
        }
    }
}

