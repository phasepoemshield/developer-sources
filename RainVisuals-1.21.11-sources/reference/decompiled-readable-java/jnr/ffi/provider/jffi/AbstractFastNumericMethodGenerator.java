/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Label
 */
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
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import jnr.ffi.Pointer;
import jnr.ffi.provider.ParameterType;
import jnr.ffi.provider.ResultType;
import jnr.ffi.provider.jffi.AsmBuilder;
import jnr.ffi.provider.jffi.AsmRuntime;
import jnr.ffi.provider.jffi.AsmUtil;
import jnr.ffi.provider.jffi.BaseMethodGenerator;
import jnr.ffi.provider.jffi.BufferParameterStrategy;
import jnr.ffi.provider.jffi.CodegenUtils;
import jnr.ffi.provider.jffi.LocalVariable;
import jnr.ffi.provider.jffi.LocalVariableAllocator;
import jnr.ffi.provider.jffi.NumberUtil;
import jnr.ffi.provider.jffi.ParameterStrategy;
import jnr.ffi.provider.jffi.PointerParameterStrategy;
import jnr.ffi.provider.jffi.SkinnyMethodAdapter;
import jnr.ffi.provider.jffi.ToNativeOp;
import org.objectweb.asm.Label;

abstract class AbstractFastNumericMethodGenerator
extends BaseMethodGenerator {
    static final Map<Class, Class<? extends ObjectParameterStrategy>> STRATEGY_PARAMETER_TYPES;
    static final Map<Class<? extends ObjectParameterStrategy>, Method> STRATEGY_ADDRESS_METHODS;

    /*
     * WARNING - void declaration
     */
    static {
        void var1_1;
        int n;
        HashMap<Class<? extends ObjectParameterStrategy>, Method> strategies = new HashMap<Class<? extends ObjectParameterStrategy>, Method>();
        AbstractFastNumericMethodGenerator.addStrategyParameterType(strategies, BufferParameterStrategy.class, Buffer.class);
        AbstractFastNumericMethodGenerator.addStrategyParameterType(strategies, PointerParameterStrategy.class, Pointer.class);
        STRATEGY_ADDRESS_METHODS = Collections.unmodifiableMap(strategies);
        LinkedHashMap<Class, Class<ParameterStrategy>> types = new LinkedHashMap<Class, Class<ParameterStrategy>>();
        types.put(Pointer.class, PointerParameterStrategy.class);
        Class[] classArray = new Class[8];
        classArray[0] = ByteBuffer.class;
        classArray[1] = CharBuffer.class;
        classArray[2] = ShortBuffer.class;
        classArray[3] = IntBuffer.class;
        classArray[4] = LongBuffer.class;
        classArray[5] = FloatBuffer.class;
        classArray[6] = DoubleBuffer.class;
        classArray[7] = Buffer.class;
        Class[] classArray2 = classArray;
        int n2 = classArray2.length;
        for (n = 0; n < n2; ++n) {
            Class c = classArray2[n];
            types.put(c, BufferParameterStrategy.class);
        }
        Class[] classArray3 = new Class[8];
        classArray3[0] = byte[].class;
        classArray3[1] = short[].class;
        classArray3[2] = char[].class;
        classArray3[3] = int[].class;
        classArray3[4] = long[].class;
        classArray3[5] = float[].class;
        classArray3[6] = double[].class;
        classArray3[7] = boolean[].class;
        classArray2 = classArray3;
        n2 = classArray2.length;
        for (n = 0; n < n2; ++n) {
            Class clazz = classArray2[n];
            types.put(clazz, ParameterStrategy.class);
        }
        STRATEGY_PARAMETER_TYPES = Collections.unmodifiableMap(var1_1);
    }

    /*
     * WARNING - void declaration
     */
    static void emitParameterStrategyAddress(SkinnyMethodAdapter mv, Class nativeIntType, Class<? extends ObjectParameterStrategy> strategyClass, LocalVariable strategy, LocalVariable parameter) {
        void var1_1;
        mv.aload(strategy);
        mv.aload(parameter);
        Method addressMethod = STRATEGY_ADDRESS_METHODS.get(strategyClass);
        if (addressMethod != null) {
            mv.invokevirtual(strategyClass, addressMethod.getName(), addressMethod.getReturnType(), addressMethod.getParameterTypes());
        } else {
            Class[] classArray = new Class[1];
            classArray[0] = Object.class;
            mv.invokevirtual(PointerParameterStrategy.class, "address", Long.TYPE, classArray);
        }
        NumberUtil.narrow(mv, Long.TYPE, (Class)var1_1);
    }

    static String getObjectParameterMethodName(int parameterCount) {
        return "invokeN" + parameterCount;
    }

    abstract String getInvokerMethodName(ResultType var1, ParameterType[] var2, boolean var3);

    abstract Class getInvokerType();

    abstract String getInvokerSignature(int var1, Class var2);

    static boolean hasPointerParameterStrategy(Class javaType) {
        for (Class c : STRATEGY_PARAMETER_TYPES.keySet()) {
            if (!c.isAssignableFrom(javaType)) continue;
            return true;
        }
        return false;
    }

    private static void addStrategyParameterType(Map<Class<? extends ObjectParameterStrategy>, Method> map, Class<? extends ObjectParameterStrategy> strategyClass, Class parameterType) {
        try {
            Class[] classArray = new Class[1];
            classArray[0] = parameterType;
            Method addressMethod = strategyClass.getDeclaredMethod("address", classArray);
            if (Modifier.isPublic(addressMethod.getModifiers())) {
                if (Modifier.isPublic(addressMethod.getDeclaringClass().getModifiers())) {
                    map.put(strategyClass, addressMethod);
                }
            }
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void generate(AsmBuilder builder, SkinnyMethodAdapter mv, LocalVariableAllocator localVariableAllocator, CallContext callContext, ResultType resultType, ParameterType[] parameterTypes, boolean ignoreError) {
        Class<Number> nativeReturnType;
        Class javaReturnType;
        Label hasObjects;
        int pointerCount;
        LocalVariable[] converted;
        LocalVariable[] parameters;
        LocalVariable objCount;
        Class<Float> nativeIntType;
        block17: {
            block18: {
                block16: {
                    block15: {
                        nativeIntType = this.getInvokerType();
                        objCount = localVariableAllocator.allocate(Integer.TYPE);
                        parameters = AsmUtil.getParameterVariables(parameterTypes);
                        converted = new LocalVariable[parameterTypes.length];
                        pointerCount = 0;
                        for (int i = 0; i < parameterTypes.length; ++i) {
                            converted[i] = AbstractFastNumericMethodGenerator.loadAndConvertParameter(builder, mv, localVariableAllocator, parameters[i], parameterTypes[i]);
                            Class javaParameterType = parameterTypes[i].effectiveJavaType();
                            ToNativeOp op = ToNativeOp.get(parameterTypes[i]);
                            if (op != null && op.isPrimitive()) {
                                op.emitPrimitive(mv, this.getInvokerType(), parameterTypes[i].getNativeType());
                                continue;
                            }
                            if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
                                pointerCount = AbstractFastNumericMethodGenerator.emitDirectCheck(mv, javaParameterType, nativeIntType, converted[i], objCount, pointerCount);
                                continue;
                            }
                            throw new IllegalArgumentException("unsupported parameter type " + parameterTypes[i].getDeclaredType());
                        }
                        hasObjects = new Label();
                        Label convertResult = new Label();
                        if (pointerCount > 0) {
                            mv.iload(objCount);
                            mv.ifne(hasObjects);
                        }
                        mv.invokevirtual(CodegenUtils.p(Invoker.class), this.getInvokerMethodName(resultType, parameterTypes, ignoreError), this.getInvokerSignature(parameterTypes.length, nativeIntType));
                        if (pointerCount > 0) {
                            mv.label(convertResult);
                        }
                        javaReturnType = resultType.effectiveJavaType();
                        nativeReturnType = nativeIntType;
                        if (Float.class == javaReturnType) break block15;
                        if (Float.TYPE != javaReturnType) break block16;
                    }
                    NumberUtil.narrow(mv, nativeIntType, Integer.TYPE);
                    Class[] classArray = new Class[1];
                    classArray[0] = Integer.TYPE;
                    mv.invokestatic(Float.class, "intBitsToFloat", Float.TYPE, classArray);
                    nativeReturnType = Float.TYPE;
                    break block17;
                }
                if (Double.class == javaReturnType) break block18;
                if (Double.TYPE != javaReturnType) break block17;
            }
            NumberUtil.widen(mv, nativeIntType, Long.TYPE);
            Class[] classArray = new Class[1];
            classArray[0] = Long.TYPE;
            mv.invokestatic(Double.class, "longBitsToDouble", Double.TYPE, classArray);
            nativeReturnType = Double.TYPE;
        }
        Class unboxedResultType = AsmUtil.unboxedReturnType(javaReturnType);
        NumberUtil.convertPrimitive(mv, nativeReturnType, unboxedResultType, resultType.getNativeType());
        AbstractFastNumericMethodGenerator.emitEpilogue(builder, mv, resultType, parameterTypes, parameters, converted, null);
        if (pointerCount > 0) {
            void var14_15;
            void var8_8;
            void var12_12;
            void var6_6;
            void var2_2;
            int i;
            mv.label(hasObjects);
            if (Integer.TYPE == nativeIntType) {
                LocalVariable[] tmp = new LocalVariable[parameterTypes.length];
                for (i = parameterTypes.length - 1; i > 0; --i) {
                    tmp[i] = localVariableAllocator.allocate(Integer.TYPE);
                    mv.istore(tmp[i]);
                }
                if (parameterTypes.length > 0) {
                    mv.i2l();
                }
                for (i = 1; i < parameterTypes.length; ++i) {
                    mv.iload(tmp[i]);
                    mv.i2l();
                }
            }
            mv.iload(objCount);
            LocalVariable[] strategies = new LocalVariable[parameterTypes.length];
            i = 0;
            while (i < parameterTypes.length) {
                void var19_20;
                Class javaParameterType = parameterTypes[i].effectiveJavaType();
                if (AbstractFastNumericMethodGenerator.hasPointerParameterStrategy(javaParameterType)) {
                    mv.aload(converted[i]);
                    AbstractFastNumericMethodGenerator.emitParameterStrategyLookup(mv, javaParameterType);
                    strategies[i] = localVariableAllocator.allocate(ParameterStrategy.class);
                    mv.astore(strategies[i]);
                    mv.aload(converted[i]);
                    mv.aload(strategies[i]);
                    mv.aload(0);
                    ObjectParameterInfo objectParameterInfo = ObjectParameterInfo.create(i, AsmUtil.getNativeArrayFlags(parameterTypes[var19_20].annotations()));
                    mv.getfield(builder.getClassNamePath(), builder.getObjectParameterInfoName(objectParameterInfo), CodegenUtils.ci(ObjectParameterInfo.class));
                }
                ++var19_20;
            }
            var2_2.invokevirtual(CodegenUtils.p(Invoker.class), AbstractFastNumericMethodGenerator.getObjectParameterMethodName(((void)var6_6).length), AbstractFastNumericMethodGenerator.getObjectParameterMethodSignature(((void)var6_6).length, (int)var12_12));
            NumberUtil.narrow((SkinnyMethodAdapter)var2_2, Long.TYPE, (Class)var8_8);
            var2_2.go_to((Label)var14_15);
        }
    }

    static Class<? extends ObjectParameterStrategy> emitParameterStrategyLookup(SkinnyMethodAdapter mv, Class javaParameterType) {
        Iterator<Map.Entry<Class, Class<? extends ObjectParameterStrategy>>> iterator2 = STRATEGY_PARAMETER_TYPES.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry<Class, Class<? extends ObjectParameterStrategy>> e = iterator2.next();
            if (!e.getKey().isAssignableFrom(javaParameterType)) continue;
            Class[] classArray = new Class[1];
            classArray[0] = e.getKey();
            mv.invokestatic(AsmRuntime.class, "pointerParameterStrategy", e.getValue(), classArray);
            return e.getValue();
        }
        throw new RuntimeException("no conversion strategy for: " + javaParameterType);
    }

    /*
     * WARNING - void declaration
     */
    static String getObjectParameterMethodSignature(int parameterCount, int pointerCount) {
        void var2_2;
        StringBuilder sb = new StringBuilder();
        sb.append('(').append(CodegenUtils.ci(CallContext.class)).append(CodegenUtils.ci(Long.TYPE));
        for (int i = 0; i < parameterCount; ++i) {
            sb.append('J');
        }
        sb.append('I');
        int n = 0;
        while (n < pointerCount) {
            void var3_3;
            sb.append(CodegenUtils.ci(Object.class));
            sb.append(CodegenUtils.ci(ObjectParameterStrategy.class));
            sb.append(CodegenUtils.ci(ObjectParameterInfo.class));
            ++var3_3;
        }
        sb.append(")J");
        return var2_2.toString();
    }

    /*
     * WARNING - void declaration
     */
    static int emitDirectCheck(SkinnyMethodAdapter mv, Class javaParameterClass, Class nativeIntType, LocalVariable parameter, LocalVariable objCount, int pointerCount) {
        void var5_5;
        void var6_6;
        SkinnyMethodAdapter skinnyMethodAdapter;
        if (pointerCount < 1) {
            mv.iconst_0();
            mv.istore(objCount);
        }
        Label next = new Label();
        Label nullPointer = new Label();
        mv.ifnull(nullPointer);
        if (Pointer.class.isAssignableFrom(javaParameterClass)) {
            mv.aload(parameter);
            mv.invokevirtual(Pointer.class, "address", Long.TYPE, new Class[0]);
            NumberUtil.narrow(mv, Long.TYPE, nativeIntType);
            mv.aload(parameter);
            mv.invokevirtual(Pointer.class, "isDirect", Boolean.TYPE, new Class[0]);
            mv.iftrue(next);
        } else if (Buffer.class.isAssignableFrom(javaParameterClass)) {
            mv.aload(parameter);
            Class[] classArray = new Class[1];
            classArray[0] = Buffer.class;
            mv.invokestatic(BufferParameterStrategy.class, "address", Long.TYPE, classArray);
            NumberUtil.narrow(mv, Long.TYPE, nativeIntType);
            mv.aload(parameter);
            mv.invokevirtual(Buffer.class, "isDirect", Boolean.TYPE, new Class[0]);
            mv.iftrue(next);
        } else if (javaParameterClass.isArray() && javaParameterClass.getComponentType().isPrimitive()) {
            if (Long.TYPE == nativeIntType) {
                mv.lconst_0();
            } else {
                mv.iconst_0();
            }
        } else {
            throw new UnsupportedOperationException("unsupported parameter type: " + javaParameterClass);
        }
        mv.iinc(objCount, 1);
        mv.go_to(next);
        mv.label(nullPointer);
        if (Long.TYPE == nativeIntType) {
            mv.lconst_0();
        } else {
            skinnyMethodAdapter.iconst_0();
        }
        skinnyMethodAdapter.label((Label)var6_6);
        return (int)(++var5_5);
    }

    AbstractFastNumericMethodGenerator() {
    }
}

