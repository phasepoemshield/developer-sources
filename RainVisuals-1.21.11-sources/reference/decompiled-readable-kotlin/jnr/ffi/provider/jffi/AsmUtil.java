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
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;

// $VF: Compiled from AsmUtil.java
final class AsmUtil {
   public static Class boxedType(Class type) {
      if (type == byte.class) {
         return Byte.class;
      } else if (type == short.class) {
         return Short.class;
      } else if (type == int.class) {
         return Integer.class;
      } else if (type == long.class) {
         return Long.class;
      } else if (type == float.class) {
         return Float.class;
      } else if (type == double.class) {
         return Double.class;
      } else {
         return type == boolean.class ? Boolean.class : type;
      }
   }

   static int calculateLocalVariableSpace(SigType type) {
      return calculateLocalVariableSpace(type.getDeclaredType());
   }

   static int getNativeArrayFlags(int flags) {
      int nflags = 0;
      nflags |= ParameterFlags.isIn(flags) ? 1 : 0;
      nflags |= ParameterFlags.isOut(flags) ? 2 : 0;
      nflags |= ParameterFlags.isPinned(flags) ? 8 : 0;
      return nflags | (!ParameterFlags.isNulTerminate(flags) && !ParameterFlags.isIn(flags) ? 0 : 4);
   }

   static void emitFromNativeConversion(AsmBuilder builder, SkinnyMethodAdapter nativeClass, FromNativeType mv, Class fromNativeType) {
      FromNativeConverter fromNativeConverter = fromNativeType.getFromNativeConverter();
      if (fromNativeConverter != null) {
         NumberUtil.convertPrimitive(mv, nativeClass, unboxedType(fromNativeConverter.nativeType()), fromNativeType.getNativeType());
         boxValue(builder, mv, fromNativeConverter.nativeType(), nativeClass);
         Method unboxedType = getFromNativeMethod(fromNativeType, builder.getClassLoader());
         getfield(mv, builder, builder.getFromNativeConverterField(fromNativeConverter));
         mv.swap();
         if (fromNativeType.getFromNativeContext() != null) {
            getfield(mv, builder, builder.getFromNativeContextField(fromNativeType.getFromNativeContext()));
         } else {
            mv.aconst_null();
         }

         if (unboxedType.getDeclaringClass().isInterface()) {
            mv.invokeinterface(unboxedType.getDeclaringClass(), unboxedType.getName(), unboxedType.getReturnType(), unboxedType.getParameterTypes());
         } else {
            mv.invokevirtual(unboxedType.getDeclaringClass(), unboxedType.getName(), unboxedType.getReturnType(), unboxedType.getParameterTypes());
         }

         if (fromNativeType.getDeclaredType().isPrimitive()) {
            Class boxedType = NumberUtil.getBoxedClass(fromNativeType.getDeclaredType());
            if (!boxedType.isAssignableFrom(unboxedType.getReturnType())) {
               mv.checkcast(CodegenUtils.p(boxedType));
            }

            unboxNumber(mv, boxedType, fromNativeType.getDeclaredType(), fromNativeType.getNativeType());
         } else if (!fromNativeType.getDeclaredType().isAssignableFrom(unboxedType.getReturnType())) {
            mv.checkcast(CodegenUtils.p(fromNativeType.getDeclaredType()));
         }
      } else if (!fromNativeType.getDeclaredType().isPrimitive()) {
         Class var7 = unboxedType(fromNativeType.getDeclaredType());
         NumberUtil.convertPrimitive(mv, nativeClass, var7, fromNativeType.getNativeType());
         boxValue(builder, mv, fromNativeType.getDeclaredType(), var7);
      }
   }

   public static MethodVisitor newTraceMethodVisitor(MethodVisitor mv) {
      try {
         Class<? extends MethodVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceMethodVisitor").asSubclass(MethodVisitor.class);
         Constructor<? extends MethodVisitor> c = tmvClass.getDeclaredConstructor(MethodVisitor.class);
         return (MethodVisitor)c.newInstance(mv);
      } catch (Throwable var3) {
         return mv;
      }
   }

   static void emitToNativeConversion(AsmBuilder builder, SkinnyMethodAdapter toNativeType, ToNativeType mv) {
      ToNativeConverter parameterConverter = toNativeType.getToNativeConverter();
      if (parameterConverter != null) {
         Method toNativeMethod = getToNativeMethod(toNativeType, builder.getClassLoader());
         if (toNativeType.getDeclaredType().isPrimitive()) {
            boxValue(builder, mv, NumberUtil.getBoxedClass(toNativeType.getDeclaredType()), toNativeType.getDeclaredType());
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
            getfield(mv, builder, builder.getToNativeContextField(toNativeType.getToNativeContext()));
         } else {
            mv.aconst_null();
         }

         if (toNativeMethod.getDeclaringClass().isInterface()) {
            mv.invokeinterface(toNativeMethod.getDeclaringClass(), toNativeMethod.getName(), toNativeMethod.getReturnType(), toNativeMethod.getParameterTypes());
         } else {
            mv.invokevirtual(toNativeMethod.getDeclaringClass(), toNativeMethod.getName(), toNativeMethod.getReturnType(), toNativeMethod.getParameterTypes());
         }

         if (!parameterConverter.nativeType().isAssignableFrom(toNativeMethod.getReturnType())) {
            mv.checkcast(CodegenUtils.p(parameterConverter.nativeType()));
         }
      }
   }

   static void unboxBoolean(SkinnyMethodAdapter mv, Class boxedType, Class nativeType) {
      mv.invokevirtual(CodegenUtils.p(boxedType), "booleanValue", "()Z");
      NumberUtil.widen(mv, boolean.class, nativeType);
   }

   static void tryfinally(SkinnyMethodAdapter finallyBlock, Runnable mv, Runnable codeBlock) {
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

      mv.label(done);
   }

   static int calculateLocalVariableSpace(Class type) {
      return long.class != type && double.class != type ? 1 : 2;
   }

   static void load(SkinnyMethodAdapter mv, Class parameter, LocalVariable parameterType) {
      if (!parameterType.isPrimitive()) {
         mv.aload(parameter);
      } else if (long.class == parameterType) {
         mv.lload(parameter);
      } else if (float.class == parameterType) {
         mv.fload(parameter);
      } else if (double.class == parameterType) {
         mv.dload(parameter);
      } else {
         mv.iload(parameter);
      }
   }

   private static boolean classIsVisible(ClassLoader classLoader, Class klass) {
      try {
         return classLoader.loadClass(klass.getName()) == klass;
      } catch (ClassNotFoundException var3) {
         return false;
      }
   }

   public static ClassVisitor newTraceClassVisitor(PrintWriter out) {
      try {
         Class<? extends ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceClassVisitor").asSubclass(ClassVisitor.class);
         Constructor<? extends ClassVisitor> c = tmvClass.getDeclaredConstructor(PrintWriter.class);
         return (ClassVisitor)c.newInstance(out);
      } catch (Throwable var3) {
         throw new RuntimeException(var3);
      }
   }

   static int calculateLocalVariableSpace(SigType... types) {
      int size = 0;

      for (SigType type : types) {
         size += calculateLocalVariableSpace(type);
      }

      return size;
   }

   public static ClassVisitor newCheckClassAdapter(ClassVisitor cv) {
      try {
         Class<? extends ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.CheckClassAdapter").asSubclass(ClassVisitor.class);
         Constructor<? extends ClassVisitor> c = tmvClass.getDeclaredConstructor(ClassVisitor.class);
         return (ClassVisitor)c.newInstance(cv);
      } catch (Throwable var3) {
         return cv;
      }
   }

   static void store(SkinnyMethodAdapter var, Class mv, LocalVariable type) {
      if (!type.isPrimitive()) {
         mv.astore(var);
      } else if (long.class == type) {
         mv.lstore(var);
      } else if (double.class == type) {
         mv.dstore(var);
      } else if (float.class == type) {
         mv.fstore(var);
      } else {
         mv.istore(var);
      }
   }

   static void boxValue(AsmBuilder builder, SkinnyMethodAdapter unboxedType, Class mv, Class boxedType) {
      if (boxedType != unboxedType && !boxedType.isPrimitive()) {
         if (Boolean.class.isAssignableFrom(boxedType)) {
            NumberUtil.narrow(mv, unboxedType, boolean.class);
            mv.invokestatic(Boolean.class, "valueOf", Boolean.class, boolean.class);
         } else if (Pointer.class.isAssignableFrom(boxedType)) {
            getfield(mv, builder, builder.getRuntimeField());
            mv.invokestatic(AsmRuntime.class, "pointerValue", Pointer.class, unboxedType, Runtime.class);
         } else if (Address.class == boxedType) {
            mv.invokestatic(boxedType, "valueOf", boxedType, unboxedType);
         } else {
            if (!Number.class.isAssignableFrom(boxedType) || boxedType(unboxedType) != boxedType) {
               throw new IllegalArgumentException("cannot box value of type " + unboxedType + " to " + boxedType);
            }

            mv.invokestatic(boxedType, "valueOf", boxedType, unboxedType);
         }
      }
   }

   static void unboxBoolean(SkinnyMethodAdapter nativeType, Class mv) {
      unboxBoolean(mv, Boolean.class, nativeType);
   }

   static int getNativeArrayFlags(Collection<Annotation> annotations) {
      return getNativeArrayFlags(ParameterFlags.parse(annotations));
   }

   private static void unboxPointerOrStruct(SkinnyMethodAdapter mv, Class type, Class nativeType) {
      mv.invokestatic(CodegenUtils.p(AsmRuntime.class), long.class == nativeType ? "longValue" : "intValue", CodegenUtils.sig(nativeType, type));
   }

   public static ClassVisitor newTraceClassVisitor(ClassVisitor cv, OutputStream out) {
      return newTraceClassVisitor(cv, new PrintWriter(out, true));
   }

   static LocalVariable[] getParameterVariables(Class[] parameterTypes) {
      LocalVariable[] lvars = new LocalVariable[parameterTypes.length];
      int idx = 1;

      for (int i = 0; i < parameterTypes.length; i++) {
         lvars[i] = new LocalVariable(parameterTypes[i], idx);
         idx += calculateLocalVariableSpace(parameterTypes[i]);
      }

      return lvars;
   }

   static Method getToNativeMethod(ToNativeType classLoader, AsmClassLoader toNativeType) {
      ToNativeConverter toNativeConverter = toNativeType.getToNativeConverter();
      if (toNativeConverter == null) {
         return null;
      }

      try {
         Class<? extends ToNativeConverter> nsme = toNativeConverter.getClass();
         if (Modifier.isPublic(nsme.getModifiers())) {
            for (Method method : nsme.getMethods()) {
               if (method.getName().equals("toNative")) {
                  Class[] methodParameterTypes = method.getParameterTypes();
                  if (toNativeConverter.nativeType().isAssignableFrom(method.getReturnType())
                     && methodParameterTypes.length == 2
                     && methodParameterTypes[0].isAssignableFrom(toNativeType.getDeclaredType())
                     && methodParameterTypes[1] == ToNativeContext.class
                     && methodIsAccessible(method)
                     && classIsVisible(classLoader, method.getDeclaringClass())) {
                     return method;
                  }
               }
            }
         }

         Method var11 = nsme.getMethod("toNative", Object.class, ToNativeContext.class);
         return methodIsAccessible(var11) && classIsVisible(classLoader, var11.getDeclaringClass())
            ? var11
            : ToNativeConverter.class.getDeclaredMethod("toNative", Object.class, ToNativeContext.class);
      } catch (NoSuchMethodException var10) {
         try {
            return ToNativeConverter.class.getDeclaredMethod("toNative", Object.class, ToNativeContext.class);
         } catch (NoSuchMethodException var9) {
            throw new RuntimeException("internal error. " + ToNativeConverter.class + " has no toNative() method");
         }
      }
   }

   private AsmUtil() {
   }

   static void emitReturnOp(SkinnyMethodAdapter mv, Class returnType) {
      if (!returnType.isPrimitive()) {
         mv.areturn();
      } else if (long.class == returnType) {
         mv.lreturn();
      } else if (float.class == returnType) {
         mv.freturn();
      } else if (double.class == returnType) {
         mv.dreturn();
      } else if (void.class == returnType) {
         mv.voidreturn();
      } else {
         mv.ireturn();
      }
   }

   static boolean methodIsAccessible(Method method) {
      return Modifier.isPublic(method.getModifiers()) && Modifier.isPublic(method.getDeclaringClass().getModifiers());
   }

   static void unboxNumber(SkinnyMethodAdapter unboxedType, Class boxedType, Class mv, NativeType nativeType) {
      if (Number.class.isAssignableFrom(boxedType)) {
         switch (nativeType) {
            case SCHAR:
            case UCHAR:
               mv.invokevirtual(CodegenUtils.p(boxedType), "byteValue", "()B");
               NumberUtil.convertPrimitive(mv, byte.class, unboxedType, nativeType);
               break;
            case SSHORT:
            case USHORT:
               mv.invokevirtual(CodegenUtils.p(boxedType), "shortValue", "()S");
               NumberUtil.convertPrimitive(mv, short.class, unboxedType, nativeType);
               break;
            case SINT:
            case UINT:
            case SLONG:
            case ULONG:
            case ADDRESS:
               if (NumberUtil.sizeof(nativeType) == 4) {
                  mv.invokevirtual(CodegenUtils.p(boxedType), "intValue", "()I");
                  NumberUtil.convertPrimitive(mv, int.class, unboxedType, nativeType);
               } else {
                  mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
                  NumberUtil.convertPrimitive(mv, long.class, unboxedType, nativeType);
               }
               break;
            case SLONGLONG:
            case ULONGLONG:
               mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
               NumberUtil.narrow(mv, long.class, unboxedType);
               break;
            case FLOAT:
               mv.invokevirtual(CodegenUtils.p(boxedType), "floatValue", "()F");
               break;
            case DOUBLE:
               mv.invokevirtual(CodegenUtils.p(boxedType), "doubleValue", "()D");
         }
      } else {
         if (!Boolean.class.isAssignableFrom(boxedType)) {
            throw new IllegalArgumentException("unsupported boxed type: " + boxedType);
         }

         unboxBoolean(mv, unboxedType);
      }
   }

   static LocalVariable[] getParameterVariables(ParameterType[] parameterTypes) {
      LocalVariable[] lvars = new LocalVariable[parameterTypes.length];
      int lvar = 1;

      for (int i = 0; i < parameterTypes.length; i++) {
         lvars[i] = new LocalVariable(parameterTypes[i].getDeclaredType(), lvar);
         lvar += calculateLocalVariableSpace(parameterTypes[i]);
      }

      return lvars;
   }

   static void getfield(SkinnyMethodAdapter mv, AsmBuilder field, AsmBuilder.ObjectField builder) {
      mv.aload(0);
      mv.getfield(builder.getClassNamePath(), field.name, CodegenUtils.ci(field.klass));
   }

   static void unboxPointer(SkinnyMethodAdapter mv, Class nativeType) {
      unboxPointerOrStruct(mv, Pointer.class, nativeType);
   }

   static Method getFromNativeMethod(FromNativeType fromNativeType, AsmClassLoader classLoader) {
      FromNativeConverter fromNativeConverter = fromNativeType.getFromNativeConverter();
      if (fromNativeConverter == null) {
         return null;
      }

      try {
         Class<? extends FromNativeConverter> nsme = fromNativeConverter.getClass();
         if (Modifier.isPublic(nsme.getModifiers())) {
            for (Method method : nsme.getMethods()) {
               if (method.getName().equals("fromNative")) {
                  Class[] methodParameterTypes = method.getParameterTypes();
                  Class javaType = fromNativeType.getDeclaredType().isPrimitive()
                     ? boxedType(fromNativeType.getDeclaredType())
                     : fromNativeType.getDeclaredType();
                  if (javaType.isAssignableFrom(method.getReturnType())
                     && methodParameterTypes.length == 2
                     && methodParameterTypes[0].isAssignableFrom(fromNativeConverter.nativeType())
                     && methodParameterTypes[1] == FromNativeContext.class
                     && methodIsAccessible(method)
                     && classIsVisible(classLoader, method.getDeclaringClass())) {
                     return method;
                  }
               }
            }
         }

         Method var12 = nsme.getMethod("fromNative", Object.class, FromNativeContext.class);
         return methodIsAccessible(var12) && classIsVisible(classLoader, var12.getDeclaringClass())
            ? var12
            : FromNativeConverter.class.getDeclaredMethod("fromNative", Object.class, FromNativeContext.class);
      } catch (NoSuchMethodException var11) {
         try {
            return FromNativeConverter.class.getDeclaredMethod("fromNative", Object.class, FromNativeContext.class);
         } catch (NoSuchMethodException var10) {
            throw new RuntimeException("internal error. " + FromNativeConverter.class + " has no fromNative() method");
         }
      }
   }

   public static Class unboxedReturnType(Class type) {
      return unboxedType(type);
   }

   static void unboxNumber(SkinnyMethodAdapter boxedType, Class mv, Class nativeType) {
      if (Number.class.isAssignableFrom(boxedType)) {
         if (byte.class == nativeType) {
            mv.invokevirtual(CodegenUtils.p(boxedType), "byteValue", "()B");
         } else if (short.class == nativeType) {
            mv.invokevirtual(CodegenUtils.p(boxedType), "shortValue", "()S");
         } else if (int.class == nativeType) {
            mv.invokevirtual(CodegenUtils.p(boxedType), "intValue", "()I");
         } else if (long.class == nativeType) {
            mv.invokevirtual(CodegenUtils.p(boxedType), "longValue", "()J");
         } else if (float.class == nativeType) {
            mv.invokevirtual(CodegenUtils.p(boxedType), "floatValue", "()F");
         } else {
            if (double.class != nativeType) {
               throw new IllegalArgumentException("unsupported Number subclass: " + boxedType);
            }

            mv.invokevirtual(CodegenUtils.p(boxedType), "doubleValue", "()D");
         }
      } else {
         if (!Boolean.class.isAssignableFrom(boxedType)) {
            throw new IllegalArgumentException("unsupported boxed type: " + boxedType);
         }

         unboxBoolean(mv, nativeType);
      }
   }

   static void emitReturn(AsmBuilder returnType, SkinnyMethodAdapter mv, Class builder, Class nativeIntType) {
      if (returnType.isPrimitive()) {
         if (long.class == returnType) {
            mv.lreturn();
         } else if (float.class == returnType) {
            mv.freturn();
         } else if (double.class == returnType) {
            mv.dreturn();
         } else if (void.class == returnType) {
            mv.voidreturn();
         } else {
            mv.ireturn();
         }
      } else {
         boxValue(builder, mv, returnType, nativeIntType);
         mv.areturn();
      }
   }

   public static ClassVisitor newTraceClassVisitor(ClassVisitor out, PrintWriter cv) {
      try {
         Class<? extends ClassVisitor> tmvClass = Class.forName("org.objectweb.asm.util.TraceClassVisitor").asSubclass(ClassVisitor.class);
         Constructor<? extends ClassVisitor> c = tmvClass.getDeclaredConstructor(ClassVisitor.class, PrintWriter.class);
         return (ClassVisitor)c.newInstance(cv, out);
      } catch (Throwable var4) {
         return cv;
      }
   }

   static int calculateLocalVariableSpace(Class... types) {
      int size = 0;

      for (int i = 0; i < types.length; i++) {
         size += calculateLocalVariableSpace(types[i]);
      }

      return size;
   }

   public static Class unboxedType(Class boxedType) {
      if (boxedType == Byte.class) {
         return byte.class;
      } else if (boxedType == Short.class) {
         return short.class;
      } else if (boxedType == Integer.class) {
         return int.class;
      } else if (boxedType == Long.class) {
         return long.class;
      } else if (boxedType == Float.class) {
         return float.class;
      } else if (boxedType == Double.class) {
         return double.class;
      } else if (boxedType == Boolean.class) {
         return boolean.class;
      } else if (Pointer.class.isAssignableFrom(boxedType)) {
         return Platform.getPlatform().addressSize() == 32 ? int.class : long.class;
      } else if (Address.class == boxedType) {
         return Platform.getPlatform().addressSize() == 32 ? int.class : long.class;
      } else {
         return boxedType;
      }
   }
}
