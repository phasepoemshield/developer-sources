/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 *  org.objectweb.asm.Label
 */
package jnr.ffi.provider.jffi;

import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmLibraryLoader;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Label;

@FromNativeConverter.NoContext
@FromNativeConverter.Cacheable
public abstract class AsmStructByReferenceFromNativeConverter
implements FromNativeConverter<Struct, Pointer> {
    static final Map<Class<? extends Struct>, Class<? extends AsmStructByReferenceFromNativeConverter>> converterClasses = new ConcurrentHashMap<Class<? extends Struct>, Class<? extends AsmStructByReferenceFromNativeConverter>>();
    private static final AtomicLong nextClassID = new AtomicLong(0L);
    private final Runtime runtime;
    private final int flags;

    /*
     * WARNING - void declaration
     */
    static AsmStructByReferenceFromNativeConverter newStructByReferenceConverter(Runtime runtime, Class<? extends Struct> structClass, int flags, AsmClassLoader classLoader) {
        try {
            Class[] classArray = new Class[2];
            classArray[0] = Runtime.class;
            classArray[1] = Integer.TYPE;
            Object[] objectArray = new Object[2];
            objectArray[0] = runtime;
            objectArray[1] = flags;
            return AsmStructByReferenceFromNativeConverter.newStructByReferenceClass(structClass, classLoader).getConstructor(classArray).newInstance(objectArray);
        }
        catch (NoSuchMethodException nsme) {
            void iae;
            throw new RuntimeException((Throwable)iae);
        }
        catch (IllegalAccessException iae) {
            void ie;
            throw new RuntimeException((Throwable)ie);
        }
        catch (InstantiationException ie) {
            void ite;
            throw new RuntimeException((Throwable)ite);
        }
        catch (InvocationTargetException ite) {
            void var4_7;
            throw new RuntimeException((Throwable)var4_7);
        }
    }

    /*
     * WARNING - void declaration
     */
    static Class<? extends AsmStructByReferenceFromNativeConverter> newStructByReferenceClass(Class<? extends Struct> structClass, AsmClassLoader classLoader) {
        try {
            Class[] classArray = new Class[1];
            classArray[0] = Runtime.class;
            Constructor<Struct> cons = structClass.asSubclass(Struct.class).getConstructor(classArray);
            if (!Modifier.isPublic(cons.getModifiers())) {
                throw new RuntimeException(structClass.getName() + " constructor is not public");
            }
        }
        catch (NoSuchMethodException ex) {
            throw new RuntimeException("struct subclass " + structClass.getName() + " has no constructor that takes a " + Runtime.class.getName(), ex);
        }
        ClassWriter cw = new ClassWriter(2);
        ClassWriter cv = AsmLibraryLoader.DEBUG ? AsmUtil.newCheckClassAdapter((ClassVisitor)cw) : cw;
        String className = CodegenUtils.p(structClass) + "$$jnr$$StructByReferenceFromNativeConverter$$" + nextClassID.getAndIncrement();
        cv.visit(49, 17, className, null, CodegenUtils.p(AsmStructByReferenceFromNativeConverter.class), new String[0]);
        cv.visitAnnotation(CodegenUtils.ci(FromNativeConverter.NoContext.class), true);
        Class[] classArray = new Class[2];
        classArray[0] = Runtime.class;
        classArray[1] = Integer.TYPE;
        SkinnyMethodAdapter init = new SkinnyMethodAdapter((ClassVisitor)cv, 1, "<init>", CodegenUtils.sig(Void.TYPE, classArray), null, null);
        init.start();
        init.aload(0);
        init.aload(1);
        init.iload(2);
        Class[] classArray2 = new Class[2];
        classArray2[0] = Runtime.class;
        classArray2[1] = Integer.TYPE;
        init.invokespecial(CodegenUtils.p(AsmStructByReferenceFromNativeConverter.class), "<init>", CodegenUtils.sig(Void.TYPE, classArray2));
        init.voidreturn();
        init.visitMaxs(10, 10);
        init.visitEnd();
        Class[] classArray3 = new Class[2];
        classArray3[0] = Pointer.class;
        classArray3[1] = FromNativeContext.class;
        SkinnyMethodAdapter fromNative = new SkinnyMethodAdapter((ClassVisitor)cv, 17, "fromNative", CodegenUtils.sig(structClass, classArray3), null, null);
        fromNative.start();
        Label nullPointer = new Label();
        fromNative.aload(1);
        fromNative.ifnull(nullPointer);
        fromNative.newobj(CodegenUtils.p(structClass));
        fromNative.dup();
        fromNative.aload(0);
        fromNative.invokevirtual(CodegenUtils.p(AsmStructByReferenceFromNativeConverter.class), "getRuntime", CodegenUtils.sig(Runtime.class, new Class[0]));
        Class[] classArray4 = new Class[1];
        classArray4[0] = Runtime.class;
        fromNative.invokespecial(structClass, "<init>", Void.TYPE, classArray4);
        fromNative.dup();
        fromNative.aload(1);
        Class[] classArray5 = new Class[1];
        classArray5[0] = Pointer.class;
        fromNative.invokevirtual(structClass, "useMemory", Void.TYPE, classArray5);
        fromNative.areturn();
        fromNative.label(nullPointer);
        fromNative.aconst_null();
        fromNative.areturn();
        fromNative.visitAnnotation(CodegenUtils.ci(FromNativeConverter.NoContext.class), true);
        fromNative.visitMaxs(10, 10);
        fromNative.visitEnd();
        Class[] classArray6 = new Class[2];
        classArray6[0] = Object.class;
        classArray6[1] = FromNativeContext.class;
        fromNative = new SkinnyMethodAdapter((ClassVisitor)cv, 17, "fromNative", CodegenUtils.sig(Object.class, classArray6), null, null);
        fromNative.start();
        fromNative.aload(0);
        fromNative.aload(1);
        fromNative.checkcast(Pointer.class);
        fromNative.aload(2);
        Class[] classArray7 = new Class[2];
        classArray7[0] = Pointer.class;
        classArray7[1] = FromNativeContext.class;
        fromNative.invokevirtual(className, "fromNative", CodegenUtils.sig(structClass, classArray7));
        fromNative.areturn();
        fromNative.visitAnnotation(CodegenUtils.ci(FromNativeConverter.NoContext.class), true);
        fromNative.visitMaxs(10, 10);
        fromNative.visitEnd();
        cv.visitEnd();
        try {
            void var4_5;
            void var1_1;
            void var8_9;
            byte[] ex = cw.toByteArray();
            if (AsmLibraryLoader.DEBUG) {
                ClassVisitor classVisitor = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
                new ClassReader((byte[])var8_9).accept(classVisitor, 0);
            }
            return var1_1.defineClass(var4_5.replace("/", "."), (byte[])var8_9);
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    protected AsmStructByReferenceFromNativeConverter(Runtime runtime, int flags) {
        this.runtime = runtime;
        this.flags = flags;
    }

    @Override
    public final Class<Pointer> nativeType() {
        return Pointer.class;
    }

    protected final Runtime getRuntime() {
        return this.runtime;
    }
}

