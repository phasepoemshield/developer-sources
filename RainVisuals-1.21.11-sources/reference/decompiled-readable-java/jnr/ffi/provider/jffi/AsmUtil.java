/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.Label
 *  org.objectweb.asm.MethodVisitor
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Platform;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collection;
import jnr.ffi.Address;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.provider.FromNativeType;
import jnr.ffi.provider.ParameterFlags;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.SigType;
import jnr.ffi.provider.ToNativeType;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.LocalVariable;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

final class AsmUtil {
    public static Class boxedType(Class type) {
        if (type == Byte.TYPE) {
            return Byte.class;
        }
        if (type == Short.TYPE) {
            return Short.class;
        }
        if (type == Integer.TYPE) {
            return Integer.class;
        }
        if (type == Long.TYPE) {
            return Long.class;
        }
        if (type == Float.TYPE) {
            return Float.class;
        }
        if (type == Double.TYPE) {
            return Double.class;
        }
        if (type == Boolean.TYPE) {
            return Boolean.class;
        }
        return type;
    }

    static int calculateLocalVariableSpace(SigType type) {
        return AsmUtil.calculateLocalVariableSpace(type.getDeclaredType());
    }

    static int getNativeArrayFlags(int flags) {
        int nflags = 0;
        nflags |= ParameterFlags.isIn(flags) ? 1 : 0;
        nflags |= ParameterFlags.isOut(flags) ? 2 : 0;
        int n = (nflags |= ParameterFlags.isPinned(flags) ? 8 : 0) | (ParameterFlags.isNulTerminate(flags) || ParameterFlags.isIn(flags) ? 4 : 0);
        return n;
    }

    /*
     * WARNING - void declaration
     */
    static void emitFromNativeConversion(AsmBuilder builder, SkinnyMethodAdapter mv, FromNativeType fromNativeType, Class nativeClass) {
        FromNativeConverter fromNativeConverter = fromNativeType.getFromNativeConverter();
        if (fromNativeConverter != null) {
            NumberUtil.convertPrimitive(mv, nativeClass, AsmUtil.unboxedType(fromNativeConverter.nativeType()), fromNativeType.getNativeType());
            AsmUtil.boxValue(builder, mv, fromNativeConverter.nativeType(), nativeClass);
            Method fromNativeMethod = AsmUtil.getFromNativeMethod(fromNativeType, builder.getClassLoader());
            AsmUtil.getfield(mv, builder, builder.getFromNativeConverterField(fromNativeConverter));
            mv.swap();
            if (fromNativeType.getFromNativeContext() != null) {
                AsmUtil.getfield(mv, builder, builder.getFromNativeContextField(fromNativeType.getFromNativeContext()));
            } else {
                mv.aconst_null();
            }
            if (fromNativeMethod.getDeclaringClass().isInterface()) {
                mv.invokeinterface(fromNativeMethod.getDeclaringClass(), fromNativeMethod.getName(), fromNativeMethod.getReturnType(), fromNativeMethod.getParameterTypes());
            } else {
                mv.invokevirtual(fromNativeMethod.getDeclaringClass(), fromNativeMethod.getName(), fromNativeMethod.getReturnType(), fromNativeMethod.getParameterTypes());
            }
            if (fromNativeType.getDeclaredType().isPrimitive()) {
                Class boxedType = NumberUtil.getBoxedClass(fromNativeType.getDeclaredType());
                if (!boxedType.isAssignableFrom(fromNativeMethod.getReturnType())) {
                    mv.checkcast(CodegenUtils.p(boxedType));
                }
                AsmUtil.unboxNumber(mv, boxedType, fromNativeType.getDeclaredType(), fromNativeType.getNativeType());
            } else if (!fromNativeType.getDeclaredType().isAssignableFrom(fromNativeMethod.getReturnType())) {
                mv.checkcast(CodegenUtils.p(fromNativeType.getDeclaredType()));
            }
        } else if (!fromNativeType.getDeclaredType().isPrimitive()) {
            void var5_6;
            void var2_2;
            void var1_1;
            AsmBuilder asmBuilder;
            Class unboxedType = AsmUtil.unboxedType(fromNativeType.getDeclaredType());
            NumberUtil.convertPrimitive(mv, nativeClass, unboxedType, fromNativeType.getNativeType());
            AsmUtil.boxValue(asmBuilder, (SkinnyMethodAdapter)var1_1, var2_2.getDeclaredType(), (Class)var5_6);
        }
    }

    public static MethodVisitor newTraceMethodVisitor(MethodVisitor mv) {
        try {
            Class<MethodVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceMethodVisitor").asSubclass(MethodVisitor.class);
            Class[] classArray = new Class[1];
            classArray[0] = MethodVisitor.class;
            Constructor<MethodVisitor> c = tmvClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = mv;
            return c.newInstance(objectArray);
        }
        catch (Throwable throwable) {
            MethodVisitor methodVisitor;
            return methodVisitor;
        }
    }

    /*
     * WARNING - void declaration
     */
    static void emitToNativeConversion(AsmBuilder builder, SkinnyMethodAdapter mv, ToNativeType toNativeType) {
        ToNativeConverter parameterConverter = toNativeType.getToNativeConverter();
        if (parameterConverter != null) {
            Method toNativeMethod = AsmUtil.getToNativeMethod(toNativeType, builder.getClassLoader());
            if (toNativeType.getDeclaredType().isPrimitive()) {
                AsmUtil.boxValue(builder, mv, NumberUtil.getBoxedClass(toNativeType.getDeclaredType()), toNativeType.getDeclaredType());
            }
            if (!toNativeMethod.getParameterTypes()[0].isAssignableFrom(NumberUtil.getBoxedClass(toNativeType.getDeclaredType()))) {
                mv.checkcast(toNativeMethod.getParameterTypes()[0]);
            }
            mv.aload(0);
            AsmBuilder.ObjectField toNativeConverterField = builder.getToNativeConverterField(parameterConverter);
            mv.getfield(builder.getClassNamePath(), toNativeConverterField.name, CodegenUtils.ci(toNativeConverterField.klass));
            if (!toNativeMethod.getDeclaringClass().equals(toNativeConverterField.klass)) {
                mv.checkcast(toNativeMethod.getDeclaringClass());
            }
            mv.swap();
            if (toNativeType.getToNativeContext() != null) {
                AsmUtil.getfield(mv, builder, builder.getToNativeContextField(toNativeType.getToNativeContext()));
            } else {
                mv.aconst_null();
            }
            if (toNativeMethod.getDeclaringClass().isInterface()) {
                mv.invokeinterface(toNativeMethod.getDeclaringClass(), toNativeMethod.getName(), toNativeMethod.getReturnType(), toNativeMethod.getParameterTypes());
            } else {
                mv.invokevirtual(toNativeMethod.getDeclaringClass(), toNativeMethod.getName(), toNativeMethod.getReturnType(), toNativeMethod.getParameterTypes());
            }
            if (!parameterConverter.nativeType().isAssignableFrom(toNativeMethod.getReturnType())) {
                void var3_3;
                void var1_1;
                var1_1.checkcast(CodegenUtils.p(var3_3.nativeType()));
            }
        }
    }

    static void unboxBoolean(SkinnyMethodAdapter mv, Class boxedType, Class nativeType) {
        mv.invokevirtual(CodegenUtils.p(boxedType), "booleanValue", "()Z");
        NumberUtil.widen(mv, Boolean.TYPE, nativeType);
    }

    /*
     * WARNING - void declaration
     */
    static void tryfinally(SkinnyMethodAdapter mv, Runnable codeBlock, Runnable finallyBlock) {
        void var6_6;
        SkinnyMethodAdapter skinnyMethodAdapter;
        Label before = new Label();
        Label after = new Label();
        Label ensure = new Label();
        Label done = new Label();
        mv.trycatch(before, after, ensure, null);
        mv.label(before);
        codeBlock.run();
        mv.label(after);
        if (finallyBlock != null) {
            finallyBlock.run();
        }
        mv.go_to(done);
        if (finallyBlock != null) {
            mv.label(ensure);
            finallyBlock.run();
            mv.athrow();
        }
        skinnyMethodAdapter.label((Label)var6_6);
    }

    static int calculateLocalVariableSpace(Class type) {
        return Long.TYPE == type || Double.TYPE == type ? 2 : 1;
    }

    /*
     * WARNING - void declaration
     */
    static void load(SkinnyMethodAdapter mv, Class parameterType, LocalVariable parameter) {
        if (!parameterType.isPrimitive()) {
            mv.aload(parameter);
        } else if (Long.TYPE == parameterType) {
            LocalVariable[] localVariableArray = new LocalVariable[1];
            localVariableArray[0] = parameter;
            mv.lload(localVariableArray);
        } else if (Float.TYPE == parameterType) {
            mv.fload(parameter);
        } else if (Double.TYPE == parameterType) {
            mv.dload(parameter);
        } else {
            void var2_2;
            SkinnyMethodAdapter skinnyMethodAdapter;
            skinnyMethodAdapter.iload((LocalVariable)var2_2);
        }
    }

    private static boolean classIsVisible(ClassLoader classLoader, Class klass) {
        try {
            return classLoader.loadClass(klass.getName()) == klass;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    /*
     * WARNING - void declaration
     */
    public static ClassVisitor newTraceClassVisitor(PrintWriter out) {
        try {
            Class<ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceClassVisitor").asSubclass(ClassVisitor.class);
            Class[] classArray = new Class[1];
            classArray[0] = PrintWriter.class;
            Constructor<ClassVisitor> c = tmvClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = out;
            return c.newInstance(objectArray);
        }
        catch (Throwable t) {
            void var1_2;
            throw new RuntimeException((Throwable)var1_2);
        }
    }

    /*
     * WARNING - void declaration
     */
    static int calculateLocalVariableSpace(SigType ... types) {
        void var1_1;
        int size = 0;
        SigType[] sigTypeArray = types;
        int n = sigTypeArray.length;
        for (int i = 0; i < n; ++i) {
            SigType type = sigTypeArray[i];
            size += AsmUtil.calculateLocalVariableSpace(type);
        }
        return (int)var1_1;
    }

    public static ClassVisitor newCheckClassAdapter(ClassVisitor cv) {
        try {
            Class<ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.CheckClassAdapter").asSubclass(ClassVisitor.class);
            Class[] classArray = new Class[1];
            classArray[0] = ClassVisitor.class;
            Constructor<ClassVisitor> c = tmvClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[1];
            objectArray[0] = cv;
            return c.newInstance(objectArray);
        }
        catch (Throwable throwable) {
            ClassVisitor classVisitor;
            return classVisitor;
        }
    }

    /*
     * WARNING - void declaration
     */
    static void store(SkinnyMethodAdapter mv, Class type, LocalVariable var) {
        if (!type.isPrimitive()) {
            mv.astore(var);
        } else if (Long.TYPE == type) {
            mv.lstore(var);
        } else if (Double.TYPE == type) {
            mv.dstore(var);
        } else if (Float.TYPE == type) {
            mv.fstore(var);
        } else {
            void var2_2;
            mv.istore((LocalVariable)var2_2);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void boxValue(AsmBuilder builder, SkinnyMethodAdapter mv, Class boxedType, Class unboxedType) {
        void var2_2;
        void var3_3;
        if (boxedType == unboxedType) return;
        if (boxedType.isPrimitive()) return;
        if (Boolean.class.isAssignableFrom(boxedType)) {
            NumberUtil.narrow(mv, unboxedType, Boolean.TYPE);
            Class[] classArray = new Class[1];
            classArray[0] = Boolean.TYPE;
            mv.invokestatic(Boolean.class, "valueOf", Boolean.class, classArray);
            return;
        }
        if (Pointer.class.isAssignableFrom(boxedType)) {
            AsmUtil.getfield(mv, builder, builder.getRuntimeField());
            Class[] classArray = new Class[2];
            classArray[0] = unboxedType;
            classArray[1] = Runtime.class;
            mv.invokestatic(AsmRuntime.class, "pointerValue", Pointer.class, classArray);
            return;
        }
        if (Address.class == boxedType) {
            Class[] classArray = new Class[1];
            classArray[0] = unboxedType;
            mv.invokestatic(boxedType, "valueOf", boxedType, classArray);
            return;
        }
        if (!Number.class.isAssignableFrom(boxedType)) throw new IllegalArgumentException("cannot box value of type " + var3_3 + " to " + var2_2);
        if (AsmUtil.boxedType(unboxedType) != boxedType) throw new IllegalArgumentException("cannot box value of type " + var3_3 + " to " + var2_2);
        Class[] classArray = new Class[1];
        classArray[0] = unboxedType;
        mv.invokestatic(boxedType, "valueOf", boxedType, classArray);
    }

    static void unboxBoolean(SkinnyMethodAdapter mv, Class nativeType) {
        AsmUtil.unboxBoolean(mv, Boolean.class, nativeType);
    }

    static int getNativeArrayFlags(Collection<Annotation> annotations) {
        return AsmUtil.getNativeArrayFlags(ParameterFlags.parse(annotations));
    }

    private static void unboxPointerOrStruct(SkinnyMethodAdapter mv, Class type, Class nativeType) {
        Class[] classArray = new Class[1];
        classArray[0] = type;
        mv.invokestatic(CodegenUtils.p(AsmRuntime.class), Long.TYPE == nativeType ? "longValue" : "intValue", CodegenUtils.sig(nativeType, classArray));
    }

    public static ClassVisitor newTraceClassVisitor(ClassVisitor cv, OutputStream out) {
        return AsmUtil.newTraceClassVisitor(cv, new PrintWriter(out, true));
    }

    /*
     * WARNING - void declaration
     */
    static LocalVariable[] getParameterVariables(Class[] parameterTypes) {
        void var1_1;
        LocalVariable[] lvars = new LocalVariable[parameterTypes.length];
        int idx = 1;
        int i = 0;
        while (i < parameterTypes.length) {
            void var3_3;
            lvars[i] = new LocalVariable(parameterTypes[i], idx);
            int n = idx + AsmUtil.calculateLocalVariableSpace(parameterTypes[i]);
            ++var3_3;
        }
        return var1_1;
    }

    /*
     * WARNING - void declaration
     */
    static Method getToNativeMethod(ToNativeType toNativeType, AsmClassLoader classLoader) {
        ToNativeConverter toNativeConverter = toNativeType.getToNativeConverter();
        if (toNativeConverter == null) {
            return null;
        }
        try {
            Method method;
            Class<?> toNativeConverterClass = toNativeConverter.getClass();
            if (Modifier.isPublic(toNativeConverterClass.getModifiers())) {
                Method[] methodArray = toNativeConverterClass.getMethods();
                int n = methodArray.length;
                for (int i = 0; i < n; ++i) {
                    void var7_9;
                    Method method2 = methodArray[i];
                    if (!method2.getName().equals("toNative")) continue;
                    Class<?>[] methodParameterTypes = method2.getParameterTypes();
                    if (!toNativeConverter.nativeType().isAssignableFrom(method2.getReturnType())) continue;
                    if (methodParameterTypes.length != 2) continue;
                    if (!methodParameterTypes[0].isAssignableFrom(toNativeType.getDeclaredType())) continue;
                    if (methodParameterTypes[1] != ToNativeContext.class || !AsmUtil.methodIsAccessible(method2) || !AsmUtil.classIsVisible(classLoader, method2.getDeclaringClass())) continue;
                    return var7_9;
                }
            }
            Class[] classArray = new Class[2];
            classArray[0] = Object.class;
            classArray[1] = ToNativeContext.class;
            Method method3 = toNativeConverterClass.getMethod("toNative", classArray);
            if (AsmUtil.methodIsAccessible(method3) && AsmUtil.classIsVisible(classLoader, method3.getDeclaringClass())) {
                method = method3;
            } else {
                Class[] classArray2 = new Class[2];
                classArray2[0] = Object.class;
                classArray2[1] = ToNativeContext.class;
                method = ToNativeConverter.class.getDeclaredMethod("toNative", classArray2);
            }
            return method;
        }
        catch (NoSuchMethodException nsme) {
            try {
                Class[] classArray = new Class[2];
                classArray[0] = Object.class;
                classArray[1] = ToNativeContext.class;
                return ToNativeConverter.class.getDeclaredMethod("toNative", classArray);
            }
            catch (NoSuchMethodException nsme2) {
                throw new RuntimeException("internal error. " + ToNativeConverter.class + " has no toNative() method");
            }
        }
    }

    private AsmUtil() {
    }

    static void emitReturnOp(SkinnyMethodAdapter mv, Class returnType) {
        if (!returnType.isPrimitive()) {
            mv.areturn();
        } else if (Long.TYPE == returnType) {
            mv.lreturn();
        } else if (Float.TYPE == returnType) {
            mv.freturn();
        } else if (Double.TYPE == returnType) {
            mv.dreturn();
        } else if (Void.TYPE == returnType) {
            mv.voidreturn();
        } else {
            mv.ireturn();
        }
    }

    static boolean methodIsAccessible(Method method) {
        return Modifier.isPublic(method.getModifiers()) && Modifier.isPublic(method.getDeclaringClass().getModifiers());
    }

    static void unboxNumber(SkinnyMethodAdapter mv, Class boxedType, Class unboxedType, NativeType nativeType) {
        if (Number.class.isAssignableFrom(boxedType)) {
            switch (nativeType) {
                case SCHAR: 
                case UCHAR: {
                    mv.invokevirtual(CodegenUtils.p(boxedType), "byteValue", "()B");
                    NumberUtil.convertPrimitive(mv, Byte.TYPE, unboxedType, nativeType);
                    break;
                }
                case SSHORT: 
                case USHORT: {
                    mv.invokevirtual(CodegenUtils.p(boxedType), "shortValue", "()S");
                    NumberUtil.convertPrimitive(mv, Short.TYPE, unboxedType, nativeType);
                    break;
                }
                case SINT: 
                case UINT: 
                case SLONG: 
                case ULONG: 
                case ADDRESS: {
                    if (NumberUtil.sizeof(nativeType) == 4) {
                        mv.invokevirtual(CodegenUtils.p(boxedType), "intValue", "()I");
                        NumberUtil.convertPrimitive(mv, Integer.TYPE, unboxedType, nativeType);
                        break;
                    }
                    mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
                    NumberUtil.convertPrimitive(mv, Long.TYPE, unboxedType, nativeType);
                    break;
                }
                case SLONGLONG: 
                case ULONGLONG: {
                    mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
                    NumberUtil.narrow(mv, Long.TYPE, unboxedType);
                    break;
                }
                case FLOAT: {
                    mv.invokevirtual(CodegenUtils.p(boxedType), "floatValue", "()F");
                    break;
                }
                case DOUBLE: {
                    mv.invokevirtual(CodegenUtils.p(boxedType), "doubleValue", "()D");
                }
            }
        } else if (Boolean.class.isAssignableFrom(boxedType)) {
            AsmUtil.unboxBoolean(mv, unboxedType);
        } else {
            throw new IllegalArgumentException("unsupported boxed type: " + boxedType);
        }
    }

    /*
     * WARNING - void declaration
     */
    static LocalVariable[] getParameterVariables(ParameterType[] parameterTypes) {
        void var1_1;
        LocalVariable[] lvars = new LocalVariable[parameterTypes.length];
        int lvar = 1;
        int i = 0;
        while (i < parameterTypes.length) {
            void var3_3;
            lvars[i] = new LocalVariable(parameterTypes[i].getDeclaredType(), lvar);
            int n = lvar + AsmUtil.calculateLocalVariableSpace((SigType)parameterTypes[i]);
            ++var3_3;
        }
        return var1_1;
    }

    static void getfield(SkinnyMethodAdapter mv, AsmBuilder builder, AsmBuilder.ObjectField field) {
        mv.aload(0);
        mv.getfield(builder.getClassNamePath(), field.name, CodegenUtils.ci(field.klass));
    }

    static void unboxPointer(SkinnyMethodAdapter mv, Class nativeType) {
        AsmUtil.unboxPointerOrStruct(mv, Pointer.class, nativeType);
    }

    /*
     * WARNING - void declaration
     */
    static Method getFromNativeMethod(FromNativeType fromNativeType, AsmClassLoader classLoader) {
        FromNativeConverter fromNativeConverter = fromNativeType.getFromNativeConverter();
        if (fromNativeConverter == null) {
            return null;
        }
        try {
            Method method;
            Class<?> fromNativeConverterClass = fromNativeConverter.getClass();
            if (Modifier.isPublic(fromNativeConverterClass.getModifiers())) {
                Method[] methodArray = fromNativeConverterClass.getMethods();
                int n = methodArray.length;
                for (int i = 0; i < n; ++i) {
                    void var7_9;
                    Class javaType;
                    Method method2 = methodArray[i];
                    if (!method2.getName().equals("fromNative")) continue;
                    Class<?>[] methodParameterTypes = method2.getParameterTypes();
                    Class clazz = javaType = fromNativeType.getDeclaredType().isPrimitive() ? AsmUtil.boxedType(fromNativeType.getDeclaredType()) : fromNativeType.getDeclaredType();
                    if (!javaType.isAssignableFrom(method2.getReturnType())) continue;
                    if (methodParameterTypes.length != 2) continue;
                    if (!methodParameterTypes[0].isAssignableFrom(fromNativeConverter.nativeType())) continue;
                    if (methodParameterTypes[1] != FromNativeContext.class || !AsmUtil.methodIsAccessible(method2) || !AsmUtil.classIsVisible(classLoader, method2.getDeclaringClass())) continue;
                    return var7_9;
                }
            }
            Class[] classArray = new Class[2];
            classArray[0] = Object.class;
            classArray[1] = FromNativeContext.class;
            Method method3 = fromNativeConverterClass.getMethod("fromNative", classArray);
            if (AsmUtil.methodIsAccessible(method3) && AsmUtil.classIsVisible(classLoader, method3.getDeclaringClass())) {
                method = method3;
            } else {
                Class[] classArray2 = new Class[2];
                classArray2[0] = Object.class;
                classArray2[1] = FromNativeContext.class;
                method = FromNativeConverter.class.getDeclaredMethod("fromNative", classArray2);
            }
            return method;
        }
        catch (NoSuchMethodException nsme) {
            try {
                Class[] classArray = new Class[2];
                classArray[0] = Object.class;
                classArray[1] = FromNativeContext.class;
                return FromNativeConverter.class.getDeclaredMethod("fromNative", classArray);
            }
            catch (NoSuchMethodException nsme2) {
                throw new RuntimeException("internal error. " + FromNativeConverter.class + " has no fromNative() method");
            }
        }
    }

    public static Class unboxedReturnType(Class type) {
        return AsmUtil.unboxedType(type);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void unboxNumber(SkinnyMethodAdapter mv, Class boxedType, Class nativeType) {
        if (Number.class.isAssignableFrom(boxedType)) {
            if (Byte.TYPE == nativeType) {
                mv.invokevirtual(CodegenUtils.p(boxedType), "byteValue", "()B");
                return;
            } else if (Short.TYPE == nativeType) {
                mv.invokevirtual(CodegenUtils.p(boxedType), "shortValue", "()S");
                return;
            } else if (Integer.TYPE == nativeType) {
                mv.invokevirtual(CodegenUtils.p(boxedType), "intValue", "()I");
                return;
            } else if (Long.TYPE == nativeType) {
                mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
                return;
            } else if (Float.TYPE == nativeType) {
                mv.invokevirtual(CodegenUtils.p(boxedType), "floatValue", "()F");
                return;
            } else {
                if (Double.TYPE != nativeType) throw new IllegalArgumentException("unsupported Number subclass: " + boxedType);
                mv.invokevirtual(CodegenUtils.p(boxedType), "doubleValue", "()D");
            }
            return;
        } else {
            if (!Boolean.class.isAssignableFrom(boxedType)) throw new IllegalArgumentException("unsupported boxed type: " + boxedType);
            AsmUtil.unboxBoolean(mv, nativeType);
        }
    }

    /*
     * WARNING - void declaration
     */
    static void emitReturn(AsmBuilder builder, SkinnyMethodAdapter mv, Class returnType, Class nativeIntType) {
        if (returnType.isPrimitive()) {
            if (Long.TYPE == returnType) {
                mv.lreturn();
            } else if (Float.TYPE == returnType) {
                mv.freturn();
            } else if (Double.TYPE == returnType) {
                mv.dreturn();
            } else if (Void.TYPE == returnType) {
                mv.voidreturn();
            } else {
                mv.ireturn();
            }
        } else {
            void var1_1;
            AsmUtil.boxValue(builder, mv, returnType, nativeIntType);
            var1_1.areturn();
        }
    }

    public static ClassVisitor newTraceClassVisitor(ClassVisitor cv, PrintWriter out) {
        try {
            Class<ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceClassVisitor").asSubclass(ClassVisitor.class);
            Class[] classArray = new Class[2];
            classArray[0] = ClassVisitor.class;
            classArray[1] = PrintWriter.class;
            Constructor<ClassVisitor> c = tmvClass.getDeclaredConstructor(classArray);
            Object[] objectArray = new Object[2];
            objectArray[0] = cv;
            objectArray[1] = out;
            return c.newInstance(objectArray);
        }
        catch (Throwable throwable) {
            ClassVisitor classVisitor;
            return classVisitor;
        }
    }

    /*
     * WARNING - void declaration
     */
    static int calculateLocalVariableSpace(Class ... types) {
        void var1_1;
        int size = 0;
        for (int i = 0; i < types.length; ++i) {
            size += AsmUtil.calculateLocalVariableSpace(types[i]);
        }
        return (int)var1_1;
    }

    public static Class unboxedType(Class boxedType) {
        if (boxedType == Byte.class) {
            return Byte.TYPE;
        }
        if (boxedType == Short.class) {
            return Short.TYPE;
        }
        if (boxedType == Integer.class) {
            return Integer.TYPE;
        }
        if (boxedType == Long.class) {
            return Long.TYPE;
        }
        if (boxedType == Float.class) {
            return Float.TYPE;
        }
        if (boxedType == Double.class) {
            return Double.TYPE;
        }
        if (boxedType == Boolean.class) {
            return Boolean.TYPE;
        }
        if (Pointer.class.isAssignableFrom(boxedType)) {
            return Platform.getPlatform().addressSize() == 32 ? Integer.TYPE : Long.TYPE;
        }
        if (Address.class == boxedType) {
            return Platform.getPlatform().addressSize() == 32 ? Integer.TYPE : Long.TYPE;
        }
        return boxedType;
    }
}

