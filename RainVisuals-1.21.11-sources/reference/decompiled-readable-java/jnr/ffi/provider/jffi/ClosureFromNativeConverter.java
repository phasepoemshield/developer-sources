/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.CallingConvention;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.StdCall;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.MethodResultContext;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.provider.InAccessibleMemoryIO;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.SigType;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmLibraryLoader;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BaseMethodGenerator;
import jnr.ffi.provider.jffi.BufferMethodGenerator;
import jnr.ffi.provider.jffi.ClosureUtil;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.FastIntMethodGenerator;
import jnr.ffi.provider.jffi.FastLongMethodGenerator;
import jnr.ffi.provider.jffi.FastNumericMethodGenerator;
import jnr.ffi.provider.jffi.InvokerUtil;
import jnr.ffi.provider.jffi.LocalVariableAllocator;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public abstract class ClosureFromNativeConverter
implements FromNativeConverter<Object, Pointer> {
    private static final AtomicLong nextClassID = new AtomicLong(0L);

    /*
     * WARNING - void declaration
     */
    private static FromNativeConverter newClosureConverter(Runtime runtime, AsmClassLoader classLoader, Class closureClass, SignatureTypeMapper typeMapper) {
        ClassWriter cw = new ClassWriter(2);
        ClassWriter cv = AsmLibraryLoader.DEBUG ? AsmUtil.newCheckClassAdapter((ClassVisitor)cw) : cw;
        String className = CodegenUtils.p(closureClass) + "$jnr$fromNativeConverter$" + nextClassID.getAndIncrement();
        AsmBuilder builder = new AsmBuilder(runtime, className, (ClassVisitor)cv, classLoader);
        String[] stringArray = new String[1];
        stringArray[0] = CodegenUtils.p(closureClass);
        cv.visit(52, 17, className, null, CodegenUtils.p(AbstractClosurePointer.class), stringArray);
        cv.visitAnnotation(CodegenUtils.ci(FromNativeConverter.NoContext.class), true);
        ClosureFromNativeConverter.generateInvocation(runtime, builder, closureClass, typeMapper);
        Class[] classArray = new Class[3];
        classArray[0] = Runtime.class;
        classArray[1] = Long.TYPE;
        classArray[2] = Object[].class;
        SkinnyMethodAdapter init = new SkinnyMethodAdapter((ClassVisitor)cv, 1, "<init>", CodegenUtils.sig(Void.TYPE, classArray), null, null);
        init.start();
        init.aload(0);
        init.aload(1);
        init.lload(2);
        Class[] classArray2 = new Class[2];
        classArray2[0] = Runtime.class;
        classArray2[1] = Long.TYPE;
        init.invokespecial(CodegenUtils.p(AbstractClosurePointer.class), "<init>", CodegenUtils.sig(Void.TYPE, classArray2));
        builder.emitFieldInitialization(init, 4);
        init.voidreturn();
        init.visitMaxs(10, 10);
        init.visitEnd();
        Class implClass = ClosureFromNativeConverter.loadClass(classLoader, className, cw);
        try {
            void var7_7;
            Class[] classArray3 = new Class[3];
            classArray3[0] = Runtime.class;
            classArray3[1] = Long.TYPE;
            classArray3[2] = Object[].class;
            return new ProxyConverter(runtime, implClass.getConstructor(classArray3), var7_7.getObjectFieldValues());
        }
        catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    @Override
    public Class<Pointer> nativeType() {
        return Pointer.class;
    }

    public static FromNativeConverter<?, Pointer> getInstance(Runtime runtime, SignatureType type, AsmClassLoader classLoader, SignatureTypeMapper typeMapper) {
        return ClosureFromNativeConverter.newClosureConverter(runtime, classLoader, type.getDeclaredType(), typeMapper);
    }

    /*
     * WARNING - void declaration
     */
    private static Class loadClass(AsmClassLoader classLoader, String className, ClassWriter cw) {
        try {
            void ex;
            byte[] bytes = cw.toByteArray();
            if (AsmLibraryLoader.DEBUG) {
                ClassVisitor trace = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
                new ClassReader(bytes).accept(trace, 0);
            }
            return classLoader.defineClass(className.replace("/", "."), (byte[])ex);
        }
        catch (Throwable ex) {
            void var3_4;
            throw new RuntimeException((Throwable)var3_4);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static void generateInvocation(Runtime runtime, AsmBuilder builder, Class closureClass, SignatureTypeMapper typeMapper) {
        void var15_16;
        void var13_13;
        BaseMethodGenerator[] generators;
        Method closureMethod = ClosureUtil.getDelegateMethod(closureClass);
        MethodResultContext resultContext = new MethodResultContext(runtime, closureMethod);
        DefaultSignatureType signatureType = DefaultSignatureType.create(closureMethod.getReturnType(), resultContext);
        FromNativeType fromNativeType = typeMapper.getFromNativeType(signatureType, resultContext);
        FromNativeConverter fromNativeConverter = fromNativeType != null ? fromNativeType.getFromNativeConverter() : null;
        ResultType resultType = InvokerUtil.getResultType(runtime, closureMethod.getReturnType(), resultContext.getAnnotations(), fromNativeConverter, (FromNativeContext)resultContext);
        SigType[] parameterTypes = InvokerUtil.getParameterTypes(runtime, typeMapper, closureMethod);
        CallingConvention callingConvention = closureClass.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : CallingConvention.DEFAULT;
        CallContext callContext = InvokerUtil.getCallContext(resultType, parameterTypes, callingConvention, true);
        LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(parameterTypes);
        Class[] javaParameterTypes = new Class[parameterTypes.length];
        for (int i = 0; i < parameterTypes.length; ++i) {
            javaParameterTypes[i] = parameterTypes[i].getDeclaredType();
        }
        SkinnyMethodAdapter mv = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, closureMethod.getName(), CodegenUtils.sig(resultType.getDeclaredType(), javaParameterTypes), null, null);
        mv.start();
        mv.getstatic(CodegenUtils.p(AbstractClosurePointer.class), "ffi", CodegenUtils.ci(Invoker.class));
        mv.aload(0);
        mv.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(callContext), CodegenUtils.ci(CallContext.class));
        mv.aload(0);
        mv.getfield(CodegenUtils.p(AbstractClosurePointer.class), "functionAddress", CodegenUtils.ci(Long.TYPE));
        BaseMethodGenerator[] baseMethodGeneratorArray = new BaseMethodGenerator[4];
        baseMethodGeneratorArray[0] = new FastIntMethodGenerator();
        baseMethodGeneratorArray[1] = new FastLongMethodGenerator();
        baseMethodGeneratorArray[2] = new FastNumericMethodGenerator();
        baseMethodGeneratorArray[3] = new BufferMethodGenerator();
        BaseMethodGenerator[] baseMethodGeneratorArray2 = generators = baseMethodGeneratorArray;
        int n = baseMethodGeneratorArray2.length;
        for (int i = 0; i < n; ++i) {
            void var20_21;
            BaseMethodGenerator generator = baseMethodGeneratorArray2[i];
            if (!generator.isSupported(resultType, (ParameterType[])parameterTypes, callingConvention)) continue;
            var20_21.generate(builder, mv, localVariableAllocator, callContext, resultType, (ParameterType[])parameterTypes, false);
        }
        mv.visitMaxs(100, 10 + var13_13.getSpaceUsed());
        var15_16.visitEnd();
    }

    public static abstract class AbstractClosurePointer
    extends InAccessibleMemoryIO {
        public static final Invoker ffi = Invoker.getInstance();
        protected final long functionAddress;

        @Override
        public final long size() {
            return 0L;
        }

        protected AbstractClosurePointer(Runtime runtime, long functionAddress) {
            super(runtime, functionAddress, true);
            this.functionAddress = functionAddress;
        }
    }

    public static final class ProxyConverter
    extends ClosureFromNativeConverter {
        private final Constructor closureConstructor;
        private final Runtime runtime;
        private final Object[] initFields;

        /*
         * WARNING - void declaration
         */
        @Override
        public Object fromNative(Pointer nativeValue, FromNativeContext context) {
            try {
                Object[] objectArray = new Object[3];
                objectArray[0] = this.runtime;
                objectArray[1] = nativeValue.address();
                objectArray[2] = this.initFields;
                return this.closureConstructor.newInstance(objectArray);
            }
            catch (Throwable t) {
                void var3_3;
                throw new RuntimeException((Throwable)var3_3);
            }
        }

        public ProxyConverter(Runtime runtime, Constructor closureConstructor, Object[] initFields) {
            this.runtime = runtime;
            this.closureConstructor = closureConstructor;
            this.initFields = (Object[])initFields.clone();
        }
    }
}

