package jnr.ffi.provider.jffi;

import com.kenai.jffi.CallContext;
import com.kenai.jffi.Invoker;
import com.kenai.jffi.ObjectParameterInfo;
import com.kenai.jffi.ObjectParameterStrategy;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import org.objectweb.asm.Label;

// $VF: Compiled from AbstractFastNumericMethodGenerator.java
abstract class AbstractFastNumericMethodGenerator extends BaseMethodGenerator {
   static final Map<Class, Class<? extends ObjectParameterStrategy>> STRATEGY_PARAMETER_TYPES;
   static final Map<Class<? extends ObjectParameterStrategy>, Method> STRATEGY_ADDRESS_METHODS;

   static {
      Map<Class<? extends ObjectParameterStrategy>, Method> strategies = new HashMap<>();
      addStrategyParameterType(strategies, BufferParameterStrategy.class, Buffer.class);
      addStrategyParameterType(strategies, PointerParameterStrategy.class, Pointer.class);
      STRATEGY_ADDRESS_METHODS = Collections.unmodifiableMap(strategies);
      Map<Class, Class<? extends ObjectParameterStrategy>> types = new LinkedHashMap<>();
      types.put(Pointer.class, PointerParameterStrategy.class);

      for (Class c : new Class[]{
         ByteBuffer.class, CharBuffer.class, ShortBuffer.class, IntBuffer.class, LongBuffer.class, FloatBuffer.class, DoubleBuffer.class, Buffer.class
      }) {
         types.put(c, BufferParameterStrategy.class);
      }

      for (Class var9 : new Class[]{byte[].class, short[].class, char[].class, int[].class, long[].class, float[].class, double[].class, boolean[].class}) {
         types.put(var9, ParameterStrategy.class);
      }

      STRATEGY_PARAMETER_TYPES = Collections.unmodifiableMap(types);
   }

   static void emitParameterStrategyAddress(
      SkinnyMethodAdapter mv, Class parameter, Class<? extends ObjectParameterStrategy> strategy, LocalVariable strategyClass, LocalVariable nativeIntType
   ) {
      mv.aload(strategy);
      mv.aload(parameter);
      Method addressMethod = STRATEGY_ADDRESS_METHODS.get(strategyClass);
      if (addressMethod != null) {
         mv.invokevirtual(strategyClass, addressMethod.getName(), addressMethod.getReturnType(), addressMethod.getParameterTypes());
      } else {
         mv.invokevirtual(PointerParameterStrategy.class, "address", long.class, Object.class);
      }

      NumberUtil.narrow(mv, long.class, nativeIntType);
   }

   static String getObjectParameterMethodName(int parameterCount) {
      return "invokeN" + parameterCount;
   }

   abstract String getInvokerMethodName(ResultType var1, ParameterType[] var2, boolean var3);

   abstract Class getInvokerType();

   abstract String getInvokerSignature(int var1, Class var2);

   static boolean hasPointerParameterStrategy(Class javaType) {
      for (Class c : STRATEGY_PARAMETER_TYPES.keySet()) {
         if (c.isAssignableFrom(javaType)) {
            return true;
         }
      }

      return false;
   }

   private static void addStrategyParameterType(
      Map<Class<? extends ObjectParameterStrategy>, Method> parameterType, Class<? extends ObjectParameterStrategy> map, Class strategyClass
   ) {
      try {
         Method addressMethod = strategyClass.getDeclaredMethod("address", parameterType);
         if (Modifier.isPublic(addressMethod.getModifiers()) && Modifier.isPublic(addressMethod.getDeclaringClass().getModifiers())) {
            map.put(strategyClass, addressMethod);
         }
      } catch (NoSuchMethodException var4) {
      }
   }

   @Override
   public void generate(
      AsmBuilder resultType,
      SkinnyMethodAdapter callContext,
      LocalVariableAllocator localVariableAllocator,
      CallContext ignoreError,
      ResultType mv,
      ParameterType[] builder,
      boolean parameterTypes
   ) {
      Class nativeIntType = this.getInvokerType();
      LocalVariable objCount = localVariableAllocator.allocate(int.class);
      LocalVariable[] parameters = AsmUtil.getParameterVariables(parameterTypes);
      LocalVariable[] converted = new LocalVariable[parameterTypes.length];
      int pointerCount = 0;

      for (int hasObjects = 0; hasObjects < parameterTypes.length; hasObjects++) {
         converted[hasObjects] = loadAndConvertParameter(builder, mv, localVariableAllocator, parameters[hasObjects], parameterTypes[hasObjects]);
         Class convertResult = parameterTypes[hasObjects].effectiveJavaType();
         ToNativeOp javaReturnType = ToNativeOp.get(parameterTypes[hasObjects]);
         if (javaReturnType != null && javaReturnType.isPrimitive()) {
            javaReturnType.emitPrimitive(mv, this.getInvokerType(), parameterTypes[hasObjects].getNativeType());
         } else {
            if (!hasPointerParameterStrategy(convertResult)) {
               throw new IllegalArgumentException("unsupported parameter type " + parameterTypes[hasObjects].getDeclaredType());
            }

            pointerCount = emitDirectCheck(mv, convertResult, nativeIntType, converted[hasObjects], objCount, pointerCount);
         }
      }

      Label var22 = new Label();
      Label var23 = new Label();
      if (pointerCount > 0) {
         mv.iload(objCount);
         mv.ifne(var22);
      }

      mv.invokevirtual(
         CodegenUtils.p(Invoker.class),
         this.getInvokerMethodName(resultType, parameterTypes, ignoreError),
         this.getInvokerSignature(parameterTypes.length, nativeIntType)
      );
      if (pointerCount > 0) {
         mv.label(var23);
      }

      Class var24 = resultType.effectiveJavaType();
      Class nativeReturnType = nativeIntType;
      if (Float.class == var24 || float.class == var24) {
         NumberUtil.narrow(mv, nativeIntType, int.class);
         mv.invokestatic(Float.class, "intBitsToFloat", float.class, int.class);
         nativeReturnType = float.class;
      } else if (Double.class == var24 || double.class == var24) {
         NumberUtil.widen(mv, nativeIntType, long.class);
         mv.invokestatic(Double.class, "longBitsToDouble", double.class, long.class);
         nativeReturnType = double.class;
      }

      Class unboxedResultType = AsmUtil.unboxedReturnType(var24);
      NumberUtil.convertPrimitive(mv, nativeReturnType, unboxedResultType, resultType.getNativeType());
      emitEpilogue(builder, mv, resultType, parameterTypes, parameters, converted, null);
      if (pointerCount > 0) {
         mv.label(var22);
         if (int.class == nativeIntType) {
            LocalVariable[] strategies = new LocalVariable[parameterTypes.length];

            for (int i = parameterTypes.length - 1; i > 0; i--) {
               strategies[i] = localVariableAllocator.allocate(int.class);
               mv.istore(strategies[i]);
            }

            if (parameterTypes.length > 0) {
               mv.i2l();
            }

            for (int var26 = 1; var26 < parameterTypes.length; var26++) {
               mv.iload(strategies[var26]);
               mv.i2l();
            }
         }

         mv.iload(objCount);
         LocalVariable[] var25 = new LocalVariable[parameterTypes.length];

         for (int var27 = 0; var27 < parameterTypes.length; var27++) {
            Class javaParameterType = parameterTypes[var27].effectiveJavaType();
            if (hasPointerParameterStrategy(javaParameterType)) {
               mv.aload(converted[var27]);
               emitParameterStrategyLookup(mv, javaParameterType);
               mv.astore(var25[var27] = localVariableAllocator.allocate(ParameterStrategy.class));
               mv.aload(converted[var27]);
               mv.aload(var25[var27]);
               mv.aload(0);
               ObjectParameterInfo info = ObjectParameterInfo.create(var27, AsmUtil.getNativeArrayFlags(parameterTypes[var27].annotations()));
               mv.getfield(builder.getClassNamePath(), builder.getObjectParameterInfoName(info), CodegenUtils.ci(ObjectParameterInfo.class));
            }
         }

         mv.invokevirtual(
            CodegenUtils.p(Invoker.class),
            getObjectParameterMethodName(parameterTypes.length),
            getObjectParameterMethodSignature(parameterTypes.length, pointerCount)
         );
         NumberUtil.narrow(mv, long.class, nativeIntType);
         mv.go_to(var23);
      }
   }

   static Class<? extends ObjectParameterStrategy> emitParameterStrategyLookup(SkinnyMethodAdapter javaParameterType, Class mv) {
      for (Entry<Class, Class<? extends ObjectParameterStrategy>> e : STRATEGY_PARAMETER_TYPES.entrySet()) {
         if (((Class)e.getKey()).isAssignableFrom(javaParameterType)) {
            mv.invokestatic(AsmRuntime.class, "pointerParameterStrategy", (Class)e.getValue(), (Class)e.getKey());
            return (Class<? extends ObjectParameterStrategy>)e.getValue();
         }
      }

      throw new RuntimeException("no conversion strategy for: " + javaParameterType);
   }

   static String getObjectParameterMethodSignature(int parameterCount, int pointerCount) {
      StringBuilder sb = new StringBuilder();
      sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(long.class));

      for (int n = 0; n < parameterCount; n++) {
         sb.append('J');
      }

      sb.append('I');

      for (int var4 = 0; var4 < pointerCount; var4++) {
         sb.append(CodegenUtils.ci(Object.class));
         sb.append(CodegenUtils.ci(ObjectParameterStrategy.class));
         sb.append(CodegenUtils.ci(ObjectParameterInfo.class));
      }

      sb.append(")J");
      return sb.toString();
   }

   static int emitDirectCheck(
      SkinnyMethodAdapter pointerCount, Class parameter, Class javaParameterClass, LocalVariable objCount, LocalVariable nativeIntType, int mv
   ) {
      if (pointerCount < 1) {
         mv.iconst_0();
         mv.istore(objCount);
      }

      Label next = new Label();
      Label nullPointer = new Label();
      mv.ifnull(nullPointer);
      if (Pointer.class.isAssignableFrom(javaParameterClass)) {
         mv.aload(parameter);
         mv.invokevirtual(Pointer.class, "address", long.class);
         NumberUtil.narrow(mv, long.class, nativeIntType);
         mv.aload(parameter);
         mv.invokevirtual(Pointer.class, "isDirect", boolean.class);
         mv.iftrue(next);
      } else if (Buffer.class.isAssignableFrom(javaParameterClass)) {
         mv.aload(parameter);
         mv.invokestatic(BufferParameterStrategy.class, "address", long.class, Buffer.class);
         NumberUtil.narrow(mv, long.class, nativeIntType);
         mv.aload(parameter);
         mv.invokevirtual(Buffer.class, "isDirect", boolean.class);
         mv.iftrue(next);
      } else {
         if (!javaParameterClass.isArray() || !javaParameterClass.getComponentType().isPrimitive()) {
            throw new UnsupportedOperationException("unsupported parameter type: " + javaParameterClass);
         }

         if (long.class == nativeIntType) {
            mv.lconst_0();
         } else {
            mv.iconst_0();
         }
      }

      mv.iinc(objCount, 1);
      mv.go_to(next);
      mv.label(nullPointer);
      if (long.class == nativeIntType) {
         mv.lconst_0();
      } else {
         mv.iconst_0();
      }

      mv.label(next);
      return pointerCount + 1;
   }
}
