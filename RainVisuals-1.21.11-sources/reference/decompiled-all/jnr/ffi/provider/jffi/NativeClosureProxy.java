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
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

// $VF: Compiled from NativeClosureProxy.java
public abstract class NativeClosureProxy {
   private static final AtomicLong nextClassID = new AtomicLong(0L);
   volatile Reference<?> closureReference;
   protected final Runtime runtime;
   public static final boolean DEBUG = Boolean.getBoolean("jnr.ffi.compile.dump");

   static Class getNativeClass(NativeType nativeType) {
      switch (nativeType) {
         case SCHAR:
         case UCHAR:
            return byte.class;
         case SSHORT:
         case USHORT:
            return short.class;
         case SINT:
         case UINT:
            return int.class;
         case SLONG:
         case ULONG:
         case ADDRESS:
            return NumberUtil.sizeof(nativeType) <= 4 ? int.class : long.class;
         case SLONGLONG:
         case ULONGLONG:
            return long.class;
         case FLOAT:
            return float.class;
         case DOUBLE:
            return double.class;
         case VOID:
            return void.class;
         default:
            throw new IllegalArgumentException("unsupported native type: " + nativeType);
      }
   }

   private static boolean isParameterTypeSupported(Class type) {
      return type.isPrimitive()
         || boolean.class == type
         || Boolean.class == type
         || Byte.class == type
         || Short.class == type
         || Integer.class == type
         || Long.class == type
         || Float.class == type
         || Double.class == type
         || Pointer.class == type;
   }

   protected Object getCallable() {
      Object callable = this.closureReference != null ? this.closureReference.get() : null;
      if (callable != null) {
         return callable;
      } else {
         throw new NullPointerException("callable is null");
      }
   }

   static NativeClosureProxy.Factory newProxyFactory(
      Runtime parameterTypes, Method resultType, ToNativeType callMethod, FromNativeType[] classLoader, AsmClassLoader runtime
   ) {
      String closureProxyClassName = CodegenUtils.p(NativeClosureProxy.class) + "$$impl$$" + nextClassID.getAndIncrement();
      ClassWriter closureClassWriter = new ClassWriter(2);
      ClassVisitor closureClassVisitor = (ClassVisitor)(DEBUG ? AsmUtil.newCheckClassAdapter(closureClassWriter) : closureClassWriter);
      AsmBuilder builder = new AsmBuilder(runtime, closureProxyClassName, closureClassVisitor, classLoader);
      closureClassVisitor.visit(52, 17, closureProxyClassName, null, CodegenUtils.p(NativeClosureProxy.class), new String[0]);
      Class[] nativeParameterClasses = new Class[parameterTypes.length];

      for (int nativeResultClass = 0; nativeResultClass < parameterTypes.length; nativeResultClass++) {
         nativeParameterClasses[nativeResultClass] = getNativeClass(parameterTypes[nativeResultClass].getNativeType());
      }

      Class var24 = getNativeClass(resultType.getNativeType());
      SkinnyMethodAdapter mv = new SkinnyMethodAdapter(closureClassVisitor, 17, "invoke", CodegenUtils.sig(var24, nativeParameterClasses), null, null);
      mv.start();
      mv.aload(0);
      mv.invokevirtual(NativeClosureProxy.class, "getCallable", Object.class);
      mv.checkcast(CodegenUtils.p(callMethod.getDeclaringClass()));
      LocalVariable[] parameterVariables = AsmUtil.getParameterVariables(nativeParameterClasses);
      LocalVariableAllocator localVariableAllocator = new LocalVariableAllocator(nativeParameterClasses);

      for (int closureInit = 0; closureInit < parameterTypes.length; closureInit++) {
         FromNativeType fields = parameterTypes[closureInit];
         Class fieldObjects = fields.effectiveJavaType();
         if (!isParameterTypeSupported(fieldObjects)) {
            throw new IllegalArgumentException("unsupported closure parameter type " + parameterTypes[closureInit].getDeclaredType());
         }

         AsmUtil.load(mv, nativeParameterClasses[closureInit], parameterVariables[closureInit]);
         if (!fieldObjects.isPrimitive()) {
            AsmUtil.emitFromNativeConversion(builder, mv, parameterTypes[closureInit], nativeParameterClasses[closureInit]);
         } else {
            NumberUtil.convertPrimitive(mv, nativeParameterClasses[closureInit], fieldObjects, fields.getNativeType());
         }
      }

      if (callMethod.getDeclaringClass().isInterface()) {
         mv.invokeinterface(
            CodegenUtils.p(callMethod.getDeclaringClass()), callMethod.getName(), CodegenUtils.sig(callMethod.getReturnType(), callMethod.getParameterTypes())
         );
      } else {
         mv.invokevirtual(
            CodegenUtils.p(callMethod.getDeclaringClass()), callMethod.getName(), CodegenUtils.sig(callMethod.getReturnType(), callMethod.getParameterTypes())
         );
      }

      if (!isReturnTypeSupported(resultType.effectiveJavaType())) {
         throw new IllegalArgumentException("unsupported closure return type " + resultType.getDeclaredType());
      }

      AsmUtil.emitToNativeConversion(builder, mv, resultType);
      if (!resultType.effectiveJavaType().isPrimitive()) {
         if (Number.class.isAssignableFrom(resultType.effectiveJavaType())) {
            AsmUtil.unboxNumber(mv, resultType.effectiveJavaType(), var24, resultType.getNativeType());
         } else if (Boolean.class.isAssignableFrom(resultType.effectiveJavaType())) {
            AsmUtil.unboxBoolean(mv, var24);
         } else if (Pointer.class.isAssignableFrom(resultType.effectiveJavaType())) {
            AsmUtil.unboxPointer(mv, var24);
         }
      }

      AsmUtil.emitReturnOp(mv, var24);
      mv.visitMaxs(10, 10 + localVariableAllocator.getSpaceUsed());
      mv.visitEnd();
      SkinnyMethodAdapter var25 = new SkinnyMethodAdapter(
         closureClassVisitor, 1, "<init>", CodegenUtils.sig(void.class, NativeRuntime.class, Object[].class), null, null
      );
      var25.start();
      var25.aload(0);
      var25.aload(1);
      var25.invokespecial(CodegenUtils.p(NativeClosureProxy.class), "<init>", CodegenUtils.sig(void.class, NativeRuntime.class));
      AsmBuilder.ObjectField[] var26 = builder.getObjectFieldArray();
      Object[] var27 = new Object[var26.length];

      for (int ex = 0; ex < var27.length; ex++) {
         var27[ex] = var26[ex].value;
         String cl = var26[ex].name;
         builder.getClassVisitor().visitField(18, cl, CodegenUtils.ci(var26[ex].klass), null, null);
         var25.aload(0);
         var25.aload(2);
         var25.pushInt(ex);
         var25.aaload();
         if (var26[ex].klass.isPrimitive()) {
            Class klass = AsmUtil.unboxedType(var26[ex].klass);
            var25.checkcast(klass);
            AsmUtil.unboxNumber(var25, klass, var26[ex].klass);
         } else {
            var25.checkcast(var26[ex].klass);
         }

         var25.putfield(builder.getClassNamePath(), cl, CodegenUtils.ci(var26[ex].klass));
      }

      var25.voidreturn();
      var25.visitMaxs(10, 10);
      var25.visitEnd();
      closureClassVisitor.visitEnd();

      try {
         byte[] var28 = closureClassWriter.toByteArray();
         if (DEBUG) {
            ClassLoader var29 = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
            new ClassReader(var28).accept(var29, 0);
         }

         ClassLoader var30 = NativeClosureFactory.class.getClassLoader();
         if (var30 == null) {
            var30 = Thread.currentThread().getContextClassLoader();
         }

         if (var30 == null) {
            var30 = ClassLoader.getSystemClassLoader();
         }

         Class<? extends NativeClosureProxy> var32 = builder.getClassLoader().defineClass(CodegenUtils.c(closureProxyClassName), var28);
         Constructor<? extends NativeClosureProxy> constructor = null;

         try {
            constructor = var32.getConstructor(NativeRuntime.class, Object[].class);
         } catch (NoSuchMethodException var22) {
            constructor = var32.getConstructors()[0];
         }

         return new NativeClosureProxy.Factory(runtime, constructor, var32.getMethod("invoke", nativeParameterClasses), var27);
      } catch (Throwable var23) {
         throw new RuntimeException(var23);
      }
   }

   private static boolean isReturnTypeSupported(Class type) {
      return type.isPrimitive()
         || boolean.class == type
         || Boolean.class == type
         || Byte.class == type
         || Short.class == type
         || Integer.class == type
         || Long.class == type
         || Float.class == type
         || Double.class == type
         || Pointer.class == type;
   }

   protected NativeClosureProxy(NativeRuntime runtime) {
      this.runtime = runtime;
   }

   // $VF: Compiled from NativeClosureProxy.java
   static class Factory {
      private final Object[] objectFields;
      private final Runtime runtime;
      private final Constructor<? extends NativeClosureProxy> constructor;
      private final Method invokeMethod;

      NativeClosureProxy newClosureProxy() {
         try {
            return this.constructor.newInstance(this.runtime, this.objectFields);
         } catch (Throwable var2) {
            throw new RuntimeException(var2);
         }
      }

      Method getInvokeMethod() {
         return this.invokeMethod;
      }

      Factory(Runtime objectFields, Constructor<? extends NativeClosureProxy> invokeMethod, Method runtime, Object[] constructor) {
         this.runtime = runtime;
         this.constructor = constructor;
         this.invokeMethod = invokeMethod;
         this.objectFields = objectFields;
      }
   }
}
