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
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

// $VF: Compiled from ClosureFromNativeConverter.java
public abstract class ClosureFromNativeConverter implements FromNativeConverter<Object, Pointer> {
   private static final AtomicLong nextClassID = new AtomicLong(0L);

   private static FromNativeConverter newClosureConverter(Runtime runtime, AsmClassLoader closureClass, Class classLoader, SignatureTypeMapper typeMapper) {
      ClassWriter cw = new ClassWriter(2);
      ClassVisitor cv = (ClassVisitor)(AsmLibraryLoader.DEBUG ? AsmUtil.newCheckClassAdapter(cw) : cw);
      String className = CodegenUtils.p(closureClass) + "$jnr$fromNativeConverter$" + nextClassID.getAndIncrement();
      AsmBuilder builder = new AsmBuilder(runtime, className, cv, classLoader);
      cv.visit(52, 17, className, null, CodegenUtils.p(ClosureFromNativeConverter.AbstractClosurePointer.class), new String[]{CodegenUtils.p(closureClass)});
      cv.visitAnnotation(CodegenUtils.ci(FromNativeConverter.NoContext.class), true);
      generateInvocation(runtime, builder, closureClass, typeMapper);
      SkinnyMethodAdapter init = new SkinnyMethodAdapter(cv, 1, "<init>", CodegenUtils.sig(void.class, Runtime.class, long.class, Object[].class), null, null);
      init.start();
      init.aload(0);
      init.aload(1);
      init.lload(2);
      init.invokespecial(
         CodegenUtils.p(ClosureFromNativeConverter.AbstractClosurePointer.class), "<init>", CodegenUtils.sig(void.class, Runtime.class, long.class)
      );
      builder.emitFieldInitialization(init, 4);
      init.voidreturn();
      init.visitMaxs(10, 10);
      init.visitEnd();
      Class implClass = loadClass(classLoader, className, cw);

      try {
         return new ClosureFromNativeConverter.ProxyConverter(
            runtime, implClass.getConstructor(Runtime.class, long.class, Object[].class), builder.getObjectFieldValues()
         );
      } catch (Throwable var11) {
         throw new RuntimeException(var11);
      }
   }

   @Override
   public Class<Pointer> nativeType() {
      return Pointer.class;
   }

   public static FromNativeConverter<?, Pointer> getInstance(Runtime type, SignatureType runtime, AsmClassLoader typeMapper, SignatureTypeMapper classLoader) {
      return newClosureConverter(runtime, classLoader, type.getDeclaredType(), typeMapper);
   }

   private static Class loadClass(AsmClassLoader cw, String className, ClassWriter classLoader) {
      try {
         byte[] ex = cw.toByteArray();
         if (AsmLibraryLoader.DEBUG) {
            ClassVisitor trace = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
            new ClassReader(ex).accept(trace, 0);
         }

         return classLoader.defineClass(className.replace("/", "."), ex);
      } catch (Throwable var5) {
         throw new RuntimeException(var5);
      }
   }

   private static void generateInvocation(Runtime runtime, AsmBuilder builder, Class closureClass, SignatureTypeMapper typeMapper) {
      Method closureMethod = ClosureUtil.getDelegateMethod(closureClass);
      FromNativeContext resultContext = new MethodResultContext(runtime, closureMethod);
      SignatureType signatureType = DefaultSignatureType.create(closureMethod.getReturnType(), resultContext);
      FromNativeType fromNativeType = typeMapper.getFromNativeType(signatureType, resultContext);
      FromNativeConverter fromNativeConverter = fromNativeType != null ? fromNativeType.getFromNativeConverter() : null;
      ResultType resultType = InvokerUtil.getResultType(
         runtime, closureMethod.getReturnType(), resultContext.getAnnotations(), fromNativeConverter, resultContext
      );
      ParameterType[] parameterTypes = InvokerUtil.getParameterTypes(runtime, typeMapper, closureMethod);
      CallingConvention callingConvention = closureClass.isAnnotationPresent(StdCall.class) ? CallingConvention.STDCALL : CallingConvention.DEFAULT;
      CallContext callContext = InvokerUtil.getCallContext(resultType, parameterTypes, callingConvention, true);
      LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(parameterTypes);
      Class[] javaParameterTypes = new Class[parameterTypes.length];

      for (int mv = 0; mv < parameterTypes.length; mv++) {
         javaParameterTypes[mv] = parameterTypes[mv].getDeclaredType();
      }

      SkinnyMethodAdapter var21 = new SkinnyMethodAdapter(
         builder.getClassVisitor(), 17, closureMethod.getName(), CodegenUtils.sig(resultType.getDeclaredType(), javaParameterTypes), null, null
      );
      var21.start();
      var21.getstatic(CodegenUtils.p(ClosureFromNativeConverter.AbstractClosurePointer.class), "ffi", CodegenUtils.ci(Invoker.class));
      var21.aload(0);
      var21.getfield(builder.getClassNamePath(), builder.getCallContextFieldName(callContext), CodegenUtils.ci(CallContext.class));
      var21.aload(0);
      var21.getfield(CodegenUtils.p(ClosureFromNativeConverter.AbstractClosurePointer.class), "functionAddress", CodegenUtils.ci(long.class));
      BaseMethodGenerator[] generators = new BaseMethodGenerator[]{
         new FastIntMethodGenerator(), new FastLongMethodGenerator(), new FastNumericMethodGenerator(), new BufferMethodGenerator()
      };

      for (BaseMethodGenerator generator : generators) {
         if (generator.isSupported(resultType, parameterTypes, callingConvention)) {
            generator.generate(builder, var21, localVariableAllocator, callContext, resultType, parameterTypes, false);
         }
      }

      var21.visitMaxs(100, 10 + localVariableAllocator.getSpaceUsed());
      var21.visitEnd();
   }

   // $VF: Compiled from ClosureFromNativeConverter.java
   public abstract static class AbstractClosurePointer extends InAccessibleMemoryIO {
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

   // $VF: Compiled from ClosureFromNativeConverter.java
   public static final class ProxyConverter extends ClosureFromNativeConverter {
      private final Constructor closureConstructor;
      private final Runtime runtime;
      private final Object[] initFields;

      public Object fromNative(Pointer context, FromNativeContext nativeValue) {
         try {
            return this.closureConstructor.newInstance(this.runtime, nativeValue.address(), this.initFields);
         } catch (Throwable var4) {
            throw new RuntimeException(var4);
         }
      }

      public ProxyConverter(Runtime closureConstructor, Constructor initFields, Object[] runtime) {
         this.runtime = runtime;
         this.closureConstructor = closureConstructor;
         this.initFields = (Object[])initFields.clone();
      }
   }
}
