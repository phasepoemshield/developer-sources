package jnr.ffi.provider.jffi;

import com.kenai.jffi.Function;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.CallingConvention;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.annotations.Synchronized;
import jnr.ffi.annotations.Variadic;
import jnr.ffi.mapper.CompositeTypeMapper;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FunctionMapper;
import jnr.ffi.mapper.MethodResultContext;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.provider.IdentityFunctionMapper;
import jnr.ffi.provider.InterfaceScanner;
import jnr.ffi.provider.Invoker;
import jnr.ffi.provider.NativeFunction;
import jnr.ffi.provider.NativeVariable;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.util.Annotations;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

// $VF: Compiled from AsmLibraryLoader.java
public class AsmLibraryLoader extends LibraryLoader {
   private static final AtomicLong nextClassID = new AtomicLong(0L);
   private static final AtomicLong uniqueId = new AtomicLong(0L);
   private final NativeRuntime runtime = NativeRuntime.getInstance();
   private static final ThreadLocal<AsmClassLoader> classLoader = new ThreadLocal<>();
   public static final boolean DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");

   private void generateFunctionNotFound(
      ClassVisitor className, String cv, String parameterTypes, String errorFieldName, Class functionName, Class[] returnType
   ) {
      SkinnyMethodAdapter mv = new SkinnyMethodAdapter(cv, 17, functionName, CodegenUtils.sig(returnType, parameterTypes), null, null);
      mv.start();
      mv.getstatic(className, errorFieldName, CodegenUtils.ci(String.class));
      mv.invokestatic(AsmRuntime.class, "newUnsatisifiedLinkError", UnsatisfiedLinkError.class, String.class);
      mv.athrow();
      mv.visitMaxs(10, 10);
      mv.visitEnd();
   }

   private <T> T generateInterfaceImpl(NativeLibrary interfaceClass, Class<T> classLoader, Map<LibraryOption, ?> library, AsmClassLoader libraryOptions) {
      boolean debug = DEBUG && !interfaceClass.isAnnotationPresent(NoTrace.class);
      ClassWriter cw = new ClassWriter(2);
      ClassVisitor cv = debug ? AsmUtil.newCheckClassAdapter(cw) : cw;
      AsmBuilder builder = new AsmBuilder(
         this.runtime, CodegenUtils.p(interfaceClass) + "$jnr$ffi$" + nextClassID.getAndIncrement(), (ClassVisitor)cv, classLoader
      );
      cv.visit(52, 17, builder.getClassNamePath(), null, CodegenUtils.p(AbstractAsmLibraryInterface.class), new String[]{CodegenUtils.p(interfaceClass)});
      FunctionMapper functionMapper = libraryOptions.containsKey(LibraryOption.FunctionMapper)
         ? (FunctionMapper)libraryOptions.get(LibraryOption.FunctionMapper)
         : IdentityFunctionMapper.getInstance();
      SignatureTypeMapper typeMapper = getSignatureTypeMapper(libraryOptions);
      CompositeTypeMapper closureTypeMapper = newClosureTypeMapper(classLoader, typeMapper);
      typeMapper = newCompositeTypeMapper(this.runtime, classLoader, typeMapper, closureTypeMapper);
      CallingConvention libraryCallingConvention = InvokerUtil.getCallingConvention(interfaceClass, libraryOptions);
      StubCompiler compiler = StubCompiler.newCompiler(this.runtime);
      MethodGenerator[] generators = new MethodGenerator[]{
         !interfaceClass.isAnnotationPresent(NoX86.class) ? new X86MethodGenerator(compiler) : new NotImplMethodGenerator(),
         new FastIntMethodGenerator(),
         new FastLongMethodGenerator(),
         new FastNumericMethodGenerator(),
         new BufferMethodGenerator()
      };
      DefaultInvokerFactory invokerFactory = new DefaultInvokerFactory(
         this.runtime, library, typeMapper, functionMapper, libraryCallingConvention, libraryOptions, interfaceClass.isAnnotationPresent(Synchronized.class)
      );
      InterfaceScanner scanner = new InterfaceScanner(interfaceClass, typeMapper, libraryCallingConvention);

      for (NativeFunction init : scanner.functions()) {
         Method ex = init.getMethod();
         if (!ex.isVarArgs() && !ex.isAnnotationPresent(Variadic.class)) {
            String var42 = functionMapper.mapFunctionName(init.name(), new NativeFunctionMapperContext(library, init.annotations()));

            try {
               long cons = library.findSymbolAddress(var42);
               FromNativeContext exx = new MethodResultContext(this.runtime, ex);
               SignatureType errorFieldName = DefaultSignatureType.create(ex.getReturnType(), exx);
               ResultType resultType = InvokerUtil.getResultType(
                  this.runtime, ex.getReturnType(), exx.getAnnotations(), typeMapper.getFromNativeType(errorFieldName, exx), exx
               );
               ParameterType[] parameterTypes = InvokerUtil.getParameterTypes(this.runtime, typeMapper, ex);
               boolean saveError = jnr.ffi.LibraryLoader.saveError(libraryOptions, init.hasSaveError(), init.hasIgnoreError());
               Function jffiFunction = new Function(cons, InvokerUtil.getCallContext(resultType, parameterTypes, init.convention(), saveError));

               for (MethodGenerator g : generators) {
                  if (g.isSupported(resultType, parameterTypes, init.convention())) {
                     g.generate(builder, ex.getName(), jffiFunction, resultType, parameterTypes, !saveError);
                     break;
                  }
               }
            } catch (SymbolNotFoundError var35) {
               String result = "error_" + uniqueId.incrementAndGet();
               cv.visitField(26, result, CodegenUtils.ci(String.class), null, var35.getMessage());
               this.generateFunctionNotFound((ClassVisitor)cv, builder.getClassNamePath(), result, var42, ex.getReturnType(), ex.getParameterTypes());
            }
         } else {
            AsmBuilder.ObjectField implClass = builder.getObjectField(invokerFactory.createInvoker(ex), Invoker.class);
            this.generateVarargsInvocation(builder, ex, implClass);
         }
      }

      VariableAccessorGenerator var37 = new VariableAccessorGenerator(this.runtime);

      for (NativeVariable var40 : scanner.variables()) {
         Method var43 = var40.getMethod();
         Type var46 = ((ParameterizedType)var43.getGenericReturnType()).getActualTypeArguments()[0];
         if (!(var46 instanceof Class)) {
            throw new IllegalArgumentException("unsupported variable class: " + var46);
         }

         String var48 = functionMapper.mapFunctionName(var43.getName(), null);

         try {
            var37.generate(
               builder,
               interfaceClass,
               var43.getName(),
               library.findSymbolAddress(var48),
               (Class)var46,
               Annotations.sortedAnnotationCollection(var43.getAnnotations()),
               typeMapper,
               classLoader
            );
         } catch (SymbolNotFoundError var34) {
            String var50 = "error_" + uniqueId.incrementAndGet();
            cv.visitField(26, var50, CodegenUtils.ci(String.class), null, var34.getMessage());
            this.generateFunctionNotFound((ClassVisitor)cv, builder.getClassNamePath(), var50, var48, var43.getReturnType(), var43.getParameterTypes());
         }
      }

      SkinnyMethodAdapter var39 = new SkinnyMethodAdapter(
         (ClassVisitor)cv, 1, "<init>", CodegenUtils.sig(void.class, Runtime.class, NativeLibrary.class, Object[].class), null, null
      );
      var39.start();
      var39.aload(0);
      var39.aload(1);
      var39.aload(2);
      var39.invokespecial(CodegenUtils.p(AbstractAsmLibraryInterface.class), "<init>", CodegenUtils.sig(void.class, Runtime.class, NativeLibrary.class));
      builder.emitFieldInitialization(var39, 3);
      var39.voidreturn();
      var39.visitMaxs(10, 10);
      var39.visitEnd();
      cv.visitEnd();

      try {
         byte[] var41 = cw.toByteArray();
         if (debug) {
            Class<T> var44 = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
            new ClassReader(var41).accept(var44, 0);
         }

         Class<T> var45 = classLoader.defineClass(builder.getClassNamePath().replace("/", "."), var41);
         Constructor var47 = var45.getDeclaredConstructor(Runtime.class, NativeLibrary.class, Object[].class);
         Object var49 = var47.newInstance(this.runtime, library, builder.getObjectFieldValues());
         System.err.flush();
         System.out.flush();
         compiler.attach(var45);
         return (T)var49;
      } catch (Throwable var33) {
         throw new RuntimeException(var33);
      }
   }

   private void generateVarargsInvocation(AsmBuilder m, Method field, AsmBuilder.ObjectField builder) {
      Class[] parameterTypes = m.getParameterTypes();
      SkinnyMethodAdapter mv = new SkinnyMethodAdapter(
         builder.getClassVisitor(), 17, m.getName(), CodegenUtils.sig(m.getReturnType(), parameterTypes), null, null
      );
      mv.start();
      mv.aload(0);
      mv.getfield(builder.getClassNamePath(), field.name, CodegenUtils.ci(Invoker.class));
      mv.aload(0);
      mv.pushInt(parameterTypes.length);
      mv.anewarray(CodegenUtils.p(Object.class));
      int slot = 1;

      for (int returnType = 0; returnType < parameterTypes.length; returnType++) {
         mv.dup();
         mv.pushInt(returnType);
         if (parameterTypes[returnType].equals(long.class)) {
            mv.lload(slot);
            mv.invokestatic(Long.class, "valueOf", Long.class, long.class);
            slot++;
         } else if (parameterTypes[returnType].equals(double.class)) {
            mv.dload(slot);
            mv.invokestatic(Double.class, "valueOf", Double.class, double.class);
            slot++;
         } else if (parameterTypes[returnType].equals(int.class)) {
            mv.iload(slot);
            mv.invokestatic(Integer.class, "valueOf", Integer.class, int.class);
         } else if (parameterTypes[returnType].equals(float.class)) {
            mv.fload(slot);
            mv.invokestatic(Float.class, "valueOf", Float.class, float.class);
         } else if (parameterTypes[returnType].equals(short.class)) {
            mv.iload(slot);
            mv.i2s();
            mv.invokestatic(Short.class, "valueOf", Short.class, short.class);
         } else if (parameterTypes[returnType].equals(char.class)) {
            mv.iload(slot);
            mv.i2c();
            mv.invokestatic(Character.class, "valueOf", Character.class, char.class);
         } else if (parameterTypes[returnType].equals(byte.class)) {
            mv.iload(slot);
            mv.i2b();
            mv.invokestatic(Byte.class, "valueOf", Byte.class, byte.class);
         } else if (parameterTypes[returnType].equals(char.class)) {
            mv.iload(slot);
            mv.i2b();
            mv.invokestatic(Boolean.class, "valueOf", Boolean.class, boolean.class);
         } else {
            mv.aload(slot);
         }

         mv.aastore();
         slot++;
      }

      mv.invokeinterface(Invoker.class, "invoke", Object.class, Object.class, Object[].class);
      Class<?> var8 = m.getReturnType();
      if (var8.equals(long.class)) {
         mv.checkcast(Long.class);
         mv.invokevirtual(Long.class, "longValue", long.class);
         mv.lreturn();
      } else if (var8.equals(double.class)) {
         mv.checkcast(Double.class);
         mv.invokevirtual(Double.class, "doubleValue", double.class);
         mv.dreturn();
      } else if (var8.equals(int.class)) {
         mv.checkcast(Integer.class);
         mv.invokevirtual(Integer.class, "intValue", int.class);
         mv.ireturn();
      } else if (var8.equals(float.class)) {
         mv.checkcast(Float.class);
         mv.invokevirtual(Float.class, "floatValue", float.class);
         mv.freturn();
      } else if (var8.equals(short.class)) {
         mv.checkcast(Short.class);
         mv.invokevirtual(Short.class, "shortValue", short.class);
         mv.ireturn();
      } else if (var8.equals(char.class)) {
         mv.checkcast(Character.class);
         mv.invokevirtual(Character.class, "charValue", char.class);
         mv.ireturn();
      } else if (var8.equals(byte.class)) {
         mv.checkcast(Byte.class);
         mv.invokevirtual(Byte.class, "byteValue", byte.class);
         mv.ireturn();
      } else if (var8.equals(boolean.class)) {
         mv.checkcast(Boolean.class);
         mv.invokevirtual(Boolean.class, "booleanValue", boolean.class);
         mv.ireturn();
      } else if (void.class.isAssignableFrom(m.getReturnType())) {
         mv.voidreturn();
      } else {
         mv.checkcast(m.getReturnType());
         mv.areturn();
      }

      mv.visitMaxs(100, AsmUtil.calculateLocalVariableSpace(parameterTypes) + 1);
      mv.visitEnd();
   }

   @Override
   <T> T loadLibrary(NativeLibrary libraryOptions, Class<T> failImmediately, Map<LibraryOption, ?> library, boolean interfaceClass) {
      AsmClassLoader oldClassLoader = classLoader.get();
      if (oldClassLoader == null) {
         classLoader.set(new AsmClassLoader(interfaceClass.getClassLoader()));
      }

      try {
         return this.generateInterfaceImpl(library, interfaceClass, libraryOptions, classLoader.get());
      } finally {
         if (oldClassLoader == null) {
            classLoader.remove();
         }
      }
   }
}
