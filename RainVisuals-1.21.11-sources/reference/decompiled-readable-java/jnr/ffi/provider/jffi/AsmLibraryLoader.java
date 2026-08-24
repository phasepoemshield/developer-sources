/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.ClassReader
 *  org.objectweb.asm.ClassVisitor
 *  org.objectweb.asm.ClassWriter
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.Synchronized;
import jnr.ffi.annotations.Variadic;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FunctionMapper;
import jnr.ffi.mapper.MethodResultContext;
import jnr.ffi.provider.IdentityFunctionMapper;
import jnr.ffi.provider.InterfaceScanner;
import jnr.ffi.provider.Invoker;
import jnr.ffi.provider.NativeVariable;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.jffi.AbstractAsmLibraryInterface;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmClassLoader;
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BufferMethodGenerator;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.DefaultInvokerFactory;
import jnr.ffi.provider.jffi.FastIntMethodGenerator;
import jnr.ffi.provider.jffi.FastLongMethodGenerator;
import jnr.ffi.provider.jffi.FastNumericMethodGenerator;
import jnr.ffi.provider.jffi.InvokerUtil;
import jnr.ffi.provider.jffi.LibraryLoader;
import jnr.ffi.provider.jffi.MethodGenerator;
import jnr.ffi.provider.jffi.NativeFunctionMapperContext;
import jnr.ffi.provider.jffi.NativeLibrary;
import jnr.ffi.provider.jffi.NativeRuntime;
import jnr.ffi.provider.jffi.NoTrace;
import jnr.ffi.provider.jffi.NoX86;
import jnr.ffi.provider.jffi.NotImplMethodGenerator;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import jnr.ffi.provider.jffi.StubCompiler;
import jnr.ffi.provider.jffi.SymbolNotFoundError;
import jnr.ffi.provider.jffi.VariableAccessorGenerator;
import jnr.ffi.provider.jffi.X86MethodGenerator;
import jnr.ffi.util.Annotations;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

public class AsmLibraryLoader
extends LibraryLoader {
    private static final AtomicLong nextClassID;
    private static final AtomicLong uniqueId;
    private final NativeRuntime runtime = NativeRuntime.getInstance();
    private static final ThreadLocal<AsmClassLoader> classLoader;
    public static final boolean DEBUG;

    /*
     * WARNING - void declaration
     */
    private void generateFunctionNotFound(ClassVisitor cv, String className, String errorFieldName, String functionName, Class returnType, Class[] parameterTypes) {
        void var7_7;
        SkinnyMethodAdapter mv = new SkinnyMethodAdapter(cv, 17, functionName, CodegenUtils.sig(returnType, parameterTypes), null, null);
        mv.start();
        mv.getstatic(className, errorFieldName, CodegenUtils.ci(String.class));
        Class[] classArray = new Class[1];
        classArray[0] = String.class;
        mv.invokestatic(AsmRuntime.class, "newUnsatisifiedLinkError", UnsatisfiedLinkError.class, classArray);
        mv.athrow();
        mv.visitMaxs(10, 10);
        var7_7.visitEnd();
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    private <T> T generateInterfaceImpl(NativeLibrary library, Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, AsmClassLoader classLoader) {
        if (!AsmLibraryLoader.DEBUG) ** GOTO lbl-1000
        if (!interfaceClass.isAnnotationPresent(NoTrace.class)) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        debug = v0;
        cw = new ClassWriter(2);
        cv = debug != false ? AsmUtil.newCheckClassAdapter((ClassVisitor)cw) : cw;
        builder = new AsmBuilder(this.runtime, CodegenUtils.p(interfaceClass) + "$jnr$ffi$" + AsmLibraryLoader.nextClassID.getAndIncrement(), (ClassVisitor)cv, classLoader);
        v1 = new String[1];
        v1[0] = CodegenUtils.p(interfaceClass);
        cv.visit(52, 17, builder.getClassNamePath(), null, CodegenUtils.p(AbstractAsmLibraryInterface.class), v1);
        functionMapper = libraryOptions.containsKey((Object)LibraryOption.FunctionMapper) ? (FunctionMapper)libraryOptions.get((Object)LibraryOption.FunctionMapper) : IdentityFunctionMapper.getInstance();
        typeMapper = AsmLibraryLoader.getSignatureTypeMapper(libraryOptions);
        closureTypeMapper = AsmLibraryLoader.newClosureTypeMapper(classLoader, typeMapper);
        typeMapper = AsmLibraryLoader.newCompositeTypeMapper(this.runtime, classLoader, typeMapper, closureTypeMapper);
        libraryCallingConvention = InvokerUtil.getCallingConvention(interfaceClass, libraryOptions);
        compiler = StubCompiler.newCompiler(this.runtime);
        v2 = new MethodGenerator[5];
        v2[0] = interfaceClass.isAnnotationPresent(NoX86.class) == false ? new X86MethodGenerator(compiler) : new NotImplMethodGenerator();
        v2[1] = new FastIntMethodGenerator();
        v2[2] = new FastLongMethodGenerator();
        v2[3] = new FastNumericMethodGenerator();
        v2[4] = new BufferMethodGenerator();
        generators = v2;
        invokerFactory = new DefaultInvokerFactory(this.runtime, library, typeMapper, functionMapper, libraryCallingConvention, libraryOptions, interfaceClass.isAnnotationPresent(Synchronized.class));
        scanner = new InterfaceScanner(interfaceClass, typeMapper, libraryCallingConvention);
        block6: for (Object function : scanner.functions()) {
            method = function.getMethod();
            if (method.isVarArgs() || method.isAnnotationPresent(Variadic.class)) {
                field = builder.getObjectField(invokerFactory.createInvoker(method), Invoker.class);
                this.generateVarargsInvocation(builder, method, field);
                continue;
            }
            functionName = functionMapper.mapFunctionName(function.name(), new NativeFunctionMapperContext(library, function.annotations()));
            try {
                functionAddress = library.findSymbolAddress(functionName);
                resultContext = new MethodResultContext(this.runtime, method);
                signatureType = DefaultSignatureType.create(method.getReturnType(), resultContext);
                resultType = InvokerUtil.getResultType((Runtime)this.runtime, method.getReturnType(), resultContext.getAnnotations(), typeMapper.getFromNativeType(signatureType, resultContext), (FromNativeContext)resultContext);
                parameterTypes = InvokerUtil.getParameterTypes(this.runtime, typeMapper, method);
                saveError = jnr.ffi.LibraryLoader.saveError(libraryOptions, function.hasSaveError(), function.hasIgnoreError());
                jffiFunction = new Function(functionAddress, InvokerUtil.getCallContext(resultType, parameterTypes, function.convention(), saveError));
                var29_34 = generators;
                var30_35 = var29_34.length;
                for (var31_36 = 0; var31_36 < var30_35; ++var31_36) {
                    g = var29_34[var31_36];
                    if (!g.isSupported(resultType, (ParameterType[])parameterTypes, function.convention())) continue;
                    g.generate(builder, method.getName(), jffiFunction, resultType, (ParameterType[])var26_31, var27_32 == false);
                    continue block6;
                }
            }
            catch (SymbolNotFoundError ex) {
                errorFieldName = "error_" + AsmLibraryLoader.uniqueId.incrementAndGet();
                cv.visitField(26, errorFieldName, CodegenUtils.ci(String.class), null, (Object)ex.getMessage());
                this.generateFunctionNotFound((ClassVisitor)cv, builder.getClassNamePath(), errorFieldName, functionName, method.getReturnType(), method.getParameterTypes());
            }
        }
        variableAccessorGenerator = new VariableAccessorGenerator(this.runtime);
        for (NativeVariable v : scanner.variables()) {
            m = v.getMethod();
            variableType = ((ParameterizedType)m.getGenericReturnType()).getActualTypeArguments()[0];
            if (!(variableType instanceof Class)) {
                throw new IllegalArgumentException("unsupported variable class: " + variableType);
            }
            functionName = functionMapper.mapFunctionName(m.getName(), null);
            try {
                variableAccessorGenerator.generate(builder, interfaceClass, m.getName(), library.findSymbolAddress(functionName), (Class)variableType, Annotations.sortedAnnotationCollection(m.getAnnotations()), typeMapper, classLoader);
            }
            catch (SymbolNotFoundError ex) {
                errorFieldName = "error_" + AsmLibraryLoader.uniqueId.incrementAndGet();
                cv.visitField(26, errorFieldName, CodegenUtils.ci(String.class), null, (Object)ex.getMessage());
                this.generateFunctionNotFound((ClassVisitor)cv, builder.getClassNamePath(), (String)var24_29, functionName, m.getReturnType(), m.getParameterTypes());
            }
        }
        v3 = new Class[3];
        v3[0] = Runtime.class;
        v3[1] = NativeLibrary.class;
        v3[2] = Object[].class;
        init = new SkinnyMethodAdapter((ClassVisitor)cv, 1, "<init>", CodegenUtils.sig(Void.TYPE, v3), null, null);
        init.start();
        init.aload(0);
        init.aload(1);
        init.aload(2);
        v4 = new Class[2];
        v4[0] = Runtime.class;
        v4[1] = NativeLibrary.class;
        init.invokespecial(CodegenUtils.p(AbstractAsmLibraryInterface.class), "<init>", CodegenUtils.sig(Void.TYPE, v4));
        builder.emitFieldInitialization(init, 3);
        init.voidreturn();
        init.visitMaxs(10, 10);
        init.visitEnd();
        cv.visitEnd();
        try {
            bytes = cw.toByteArray();
            if (debug) {
                implClass = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
                new ClassReader(bytes).accept((ClassVisitor)implClass, 0);
            }
            implClass = classLoader.defineClass(builder.getClassNamePath().replace("/", "."), bytes);
            v5 = new Class[3];
            v5[0] = Runtime.class;
            v5[1] = NativeLibrary.class;
            v5[2] = Object[].class;
            cons = implClass.getDeclaredConstructor(v5);
            v6 = new Object[3];
            v6[0] = this.runtime;
            v6[1] = var1_1;
            v6[2] = var8_8.getObjectFieldValues();
            var22_26 = var21_25.newInstance(v6);
            System.err.flush();
            System.out.flush();
            var13_13.attach((Class)var20_21);
            return var22_26;
        }
        catch (Throwable var19_20) {
            throw new RuntimeException(var19_20);
        }
    }

    static {
        DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");
        nextClassID = new AtomicLong(0L);
        uniqueId = new AtomicLong(0L);
        classLoader = new ThreadLocal();
    }

    /*
     * WARNING - void declaration
     */
    private void generateVarargsInvocation(AsmBuilder builder, Method m, AsmBuilder.ObjectField field) {
        void var4_4;
        void var5_5;
        Class[] parameterTypes = m.getParameterTypes();
        SkinnyMethodAdapter mv = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, m.getName(), CodegenUtils.sig(m.getReturnType(), parameterTypes), null, null);
        mv.start();
        mv.aload(0);
        mv.getfield(builder.getClassNamePath(), field.name, CodegenUtils.ci(Invoker.class));
        mv.aload(0);
        mv.pushInt(parameterTypes.length);
        mv.anewarray(CodegenUtils.p(Object.class));
        int slot = 1;
        for (int i = 0; i < parameterTypes.length; ++i) {
            mv.dup();
            mv.pushInt(i);
            if (parameterTypes[i].equals(Long.TYPE)) {
                mv.lload(slot);
                Class[] classArray = new Class[1];
                classArray[0] = Long.TYPE;
                mv.invokestatic(Long.class, "valueOf", Long.class, classArray);
                ++slot;
            } else if (parameterTypes[i].equals(Double.TYPE)) {
                mv.dload(slot);
                Class[] classArray = new Class[1];
                classArray[0] = Double.TYPE;
                mv.invokestatic(Double.class, "valueOf", Double.class, classArray);
                ++slot;
            } else if (parameterTypes[i].equals(Integer.TYPE)) {
                mv.iload(slot);
                Class[] classArray = new Class[1];
                classArray[0] = Integer.TYPE;
                mv.invokestatic(Integer.class, "valueOf", Integer.class, classArray);
            } else if (parameterTypes[i].equals(Float.TYPE)) {
                mv.fload(slot);
                Class[] classArray = new Class[1];
                classArray[0] = Float.TYPE;
                mv.invokestatic(Float.class, "valueOf", Float.class, classArray);
            } else if (parameterTypes[i].equals(Short.TYPE)) {
                mv.iload(slot);
                mv.i2s();
                Class[] classArray = new Class[1];
                classArray[0] = Short.TYPE;
                mv.invokestatic(Short.class, "valueOf", Short.class, classArray);
            } else if (parameterTypes[i].equals(Character.TYPE)) {
                mv.iload(slot);
                mv.i2c();
                Class[] classArray = new Class[1];
                classArray[0] = Character.TYPE;
                mv.invokestatic(Character.class, "valueOf", Character.class, classArray);
            } else if (parameterTypes[i].equals(Byte.TYPE)) {
                mv.iload(slot);
                mv.i2b();
                Class[] classArray = new Class[1];
                classArray[0] = Byte.TYPE;
                mv.invokestatic(Byte.class, "valueOf", Byte.class, classArray);
            } else if (parameterTypes[i].equals(Character.TYPE)) {
                mv.iload(slot);
                mv.i2b();
                Class[] classArray = new Class[1];
                classArray[0] = Boolean.TYPE;
                mv.invokestatic(Boolean.class, "valueOf", Boolean.class, classArray);
            } else {
                mv.aload(slot);
            }
            mv.aastore();
            ++slot;
        }
        Class[] classArray = new Class[2];
        classArray[0] = Object.class;
        classArray[1] = Object[].class;
        mv.invokeinterface(Invoker.class, "invoke", Object.class, classArray);
        Class<?> returnType = m.getReturnType();
        if (returnType.equals(Long.TYPE)) {
            mv.checkcast(Long.class);
            mv.invokevirtual(Long.class, "longValue", Long.TYPE, new Class[0]);
            mv.lreturn();
        } else if (returnType.equals(Double.TYPE)) {
            mv.checkcast(Double.class);
            mv.invokevirtual(Double.class, "doubleValue", Double.TYPE, new Class[0]);
            mv.dreturn();
        } else if (returnType.equals(Integer.TYPE)) {
            mv.checkcast(Integer.class);
            mv.invokevirtual(Integer.class, "intValue", Integer.TYPE, new Class[0]);
            mv.ireturn();
        } else if (returnType.equals(Float.TYPE)) {
            mv.checkcast(Float.class);
            mv.invokevirtual(Float.class, "floatValue", Float.TYPE, new Class[0]);
            mv.freturn();
        } else if (returnType.equals(Short.TYPE)) {
            mv.checkcast(Short.class);
            mv.invokevirtual(Short.class, "shortValue", Short.TYPE, new Class[0]);
            mv.ireturn();
        } else if (returnType.equals(Character.TYPE)) {
            mv.checkcast(Character.class);
            mv.invokevirtual(Character.class, "charValue", Character.TYPE, new Class[0]);
            mv.ireturn();
        } else if (returnType.equals(Byte.TYPE)) {
            mv.checkcast(Byte.class);
            mv.invokevirtual(Byte.class, "byteValue", Byte.TYPE, new Class[0]);
            mv.ireturn();
        } else if (returnType.equals(Boolean.TYPE)) {
            mv.checkcast(Boolean.class);
            mv.invokevirtual(Boolean.class, "booleanValue", Boolean.TYPE, new Class[0]);
            mv.ireturn();
        } else if (Void.TYPE.isAssignableFrom(m.getReturnType())) {
            mv.voidreturn();
        } else {
            void var2_2;
            var5_5.checkcast(var2_2.getReturnType());
            var5_5.areturn();
        }
        var5_5.visitMaxs(100, AsmUtil.calculateLocalVariableSpace((Class[])var4_4) + 1);
        var5_5.visitEnd();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    <T> T loadLibrary(NativeLibrary library, Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, boolean failImmediately) {
        AsmClassLoader oldClassLoader = classLoader.get();
        if (oldClassLoader == null) {
            classLoader.set(new AsmClassLoader(interfaceClass.getClassLoader()));
        }
        try {
            T t = this.generateInterfaceImpl(library, interfaceClass, libraryOptions, classLoader.get());
            return t;
        }
        finally {
            if (oldClassLoader == null) {
                classLoader.remove();
            }
        }
    }
}

