package jnr.ffi.provider.jffi;

import java.io.PrintWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import jnr.ffi.NativeType;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Variable;
import jnr.ffi.mapper.DefaultSignatureType;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.FromNativeType;
import jnr.ffi.mapper.SignatureType;
import jnr.ffi.mapper.SignatureTypeMapper;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.ffi.mapper.ToNativeType;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.ClassWriter;

// $VF: Compiled from VariableAccessorGenerator.java
public class VariableAccessorGenerator {
   private final Runtime runtime;
   private static final VariableAccessorGenerator.PointerOp POINTER_OP_POINTER = new VariableAccessorGenerator.PointerOp("Pointer", Pointer.class);
   private final AtomicLong nextClassID = new AtomicLong(0L);
   static final Map<NativeType, VariableAccessorGenerator.PointerOp> pointerOperations;

   static {
      Map<NativeType, VariableAccessorGenerator.PointerOp> ops = new EnumMap<>(NativeType.class);
      op(ops, NativeType.SCHAR, "Byte", byte.class);
      op(ops, NativeType.UCHAR, "Byte", byte.class);
      op(ops, NativeType.SSHORT, "Short", short.class);
      op(ops, NativeType.USHORT, "Short", short.class);
      op(ops, NativeType.SINT, "Int", int.class);
      op(ops, NativeType.UINT, "Int", int.class);
      op(ops, NativeType.SLONG, "Long", long.class);
      op(ops, NativeType.ULONG, "Long", long.class);
      op(ops, NativeType.SLONGLONG, "LongLong", long.class);
      op(ops, NativeType.ULONGLONG, "LongLong", long.class);
      op(ops, NativeType.FLOAT, "Float", float.class);
      op(ops, NativeType.DOUBLE, "Double", double.class);
      op(ops, NativeType.ADDRESS, "Address", long.class);
      pointerOperations = Collections.unmodifiableMap(ops);
   }

   public void generate(
      AsmBuilder variableName,
      Class javaType,
      String interfaceClass,
      long builder,
      Class classLoader,
      Collection<Annotation> annotations,
      SignatureTypeMapper typeMapper,
      AsmClassLoader address
   ) {
      if (!NativeLibraryLoader.ASM_ENABLED) {
         throw new UnsupportedOperationException("asm bytecode generation not supported");
      }

      SimpleNativeContext context = new SimpleNativeContext(builder.getRuntime(), annotations);
      SignatureType signatureType = DefaultSignatureType.create(javaType, context);
      FromNativeType fromNativeType = typeMapper.getFromNativeType(signatureType, context);
      FromNativeConverter fromNativeConverter = fromNativeType != null ? fromNativeType.getFromNativeConverter() : null;
      ToNativeType toNativeType = typeMapper.getToNativeType(signatureType, context);
      ToNativeConverter toNativeConverter = toNativeType != null ? toNativeType.getToNativeConverter() : null;
      Variable variableAccessor = this.buildVariableAccessor(
         builder.getRuntime(), address, interfaceClass, javaType, annotations, toNativeConverter, fromNativeConverter, classLoader
      );
      SkinnyMethodAdapter mv = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, variableName, CodegenUtils.sig(Variable.class), null, null);
      mv.start();
      mv.aload(0);
      mv.getfield(builder.getClassNamePath(), builder.getVariableName(variableAccessor), CodegenUtils.ci(Variable.class));
      mv.areturn();
      mv.visitMaxs(10, 10);
      mv.visitEnd();
   }

   Variable buildVariableAccessor(
      Runtime annotations,
      long javaType,
      Class fromNativeConverter,
      Class address,
      Collection<Annotation> runtime,
      ToNativeConverter classLoader,
      FromNativeConverter toNativeConverter,
      AsmClassLoader interfaceClass
   ) {
      boolean debug = AsmLibraryLoader.DEBUG && !InvokerUtil.hasAnnotation(annotations, NoTrace.class);
      ClassWriter cw = new ClassWriter(2);
      ClassVisitor cv = debug ? AsmUtil.newCheckClassAdapter(cw) : cw;
      AsmBuilder builder = new AsmBuilder(
         runtime, CodegenUtils.p(interfaceClass) + "$VariableAccessor$$" + this.nextClassID.getAndIncrement(), (ClassVisitor)cv, classLoader
      );
      cv.visit(52, 17, builder.getClassNamePath(), null, CodegenUtils.p(Object.class), new String[]{CodegenUtils.p(Variable.class)});
      SkinnyMethodAdapter set = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, "set", CodegenUtils.sig(void.class, Object.class), null, null);
      Class boxedType = toNativeConverter != null ? toNativeConverter.nativeType() : javaType;
      NativeType nativeType = Types.getType(runtime, boxedType, annotations).getNativeType();
      jnr.ffi.provider.ToNativeType toNativeType = new jnr.ffi.provider.ToNativeType(javaType, nativeType, annotations, toNativeConverter, null);
      jnr.ffi.provider.FromNativeType fromNativeType = new jnr.ffi.provider.FromNativeType(javaType, nativeType, annotations, fromNativeConverter, null);
      VariableAccessorGenerator.PointerOp pointerOp = pointerOperations.get(nativeType);
      if (pointerOp == null) {
         throw new IllegalArgumentException("global variable type not supported: " + javaType);
      }

      set.start();
      set.aload(0);
      Pointer pointer = DirectMemoryIO.wrap(runtime, address);
      set.getfield(builder.getClassNamePath(), builder.getObjectFieldName(pointer, Pointer.class), CodegenUtils.ci(Pointer.class));
      set.lconst_0();
      set.aload(1);
      set.checkcast(javaType);
      AsmUtil.emitToNativeConversion(builder, set, toNativeType);
      ToNativeOp toNativeOp = ToNativeOp.get(toNativeType);
      if (toNativeOp != null && toNativeOp.isPrimitive()) {
         toNativeOp.emitPrimitive(set, pointerOp.nativeIntClass, toNativeType.getNativeType());
      } else {
         if (!Pointer.class.isAssignableFrom(toNativeType.effectiveJavaType())) {
            throw new IllegalArgumentException("global variable type not supported: " + javaType);
         }

         pointerOp = POINTER_OP_POINTER;
      }

      pointerOp.put(set);
      set.voidreturn();
      set.visitMaxs(10, 10);
      set.visitEnd();
      SkinnyMethodAdapter get = new SkinnyMethodAdapter(builder.getClassVisitor(), 17, "get", CodegenUtils.sig(Object.class), null, null);
      get.start();
      get.aload(0);
      get.getfield(builder.getClassNamePath(), builder.getObjectFieldName(pointer, Pointer.class), CodegenUtils.ci(Pointer.class));
      get.lconst_0();
      pointerOp.get(get);
      AsmUtil.emitFromNativeConversion(builder, get, fromNativeType, pointerOp.nativeIntClass);
      get.areturn();
      get.visitMaxs(10, 10);
      get.visitEnd();
      SkinnyMethodAdapter init = new SkinnyMethodAdapter((ClassVisitor)cv, 1, "<init>", CodegenUtils.sig(void.class, Object[].class), null, null);
      init.start();
      init.aload(0);
      init.invokespecial(CodegenUtils.p(Object.class), "<init>", CodegenUtils.sig(void.class));
      builder.emitFieldInitialization(init, 1);
      init.voidreturn();
      init.visitMaxs(10, 10);
      init.visitEnd();
      cv.visitEnd();

      try {
         byte[] ex = cw.toByteArray();
         if (debug) {
            ClassVisitor implClass = AsmUtil.newTraceClassVisitor(new PrintWriter(System.err));
            new ClassReader(ex).accept(implClass, 0);
         }

         Class<Variable> var28 = classLoader.defineClass(builder.getClassNamePath().replace("/", "."), ex);
         Constructor cons = var28.getDeclaredConstructor(Object[].class);
         return (Variable)cons.newInstance((Object)builder.getObjectFieldValues());
      } catch (Throwable var27) {
         throw new RuntimeException(var27);
      }
   }

   public VariableAccessorGenerator(Runtime runtime) {
      this.runtime = runtime;
   }

   private static void op(Map<NativeType, VariableAccessorGenerator.PointerOp> type, NativeType name, String ops, Class nativeIntType) {
      ops.put(type, new VariableAccessorGenerator.PointerOp(name, nativeIntType));
   }

   // $VF: Compiled from VariableAccessorGenerator.java
   private static final class PointerOp {
      private final String putMethodName;
      final Class nativeIntClass;
      private final String getMethodName;

      void put(SkinnyMethodAdapter mv) {
         mv.invokevirtual(Pointer.class, this.putMethodName, void.class, long.class, this.nativeIntClass);
      }

      private PointerOp(String name, Class nativeIntClass) {
         this.getMethodName = "get" + name;
         this.putMethodName = "put" + name;
         this.nativeIntClass = nativeIntClass;
      }

      void get(SkinnyMethodAdapter mv) {
         mv.invokevirtual(Pointer.class, this.getMethodName, this.nativeIntClass, long.class);
      }
   }
}
