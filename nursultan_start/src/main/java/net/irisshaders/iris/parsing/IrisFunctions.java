/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.FunctionResolver
 *  kroppeb.stareval.function.FunctionResolver$Builder
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.function.Type$Primitive
 *  kroppeb.stareval.function.TypedFunction
 *  kroppeb.stareval.function.TypedFunction$Parameter
 *  org.joml.Vector2f
 *  org.joml.Vector2fc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.joml.Vector4f
 *  org.joml.Vector4fc
 */
package net.irisshaders.iris.parsing;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import kroppeb.stareval.function.FunctionResolver;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import kroppeb.stareval.function.TypedFunction;
import net.irisshaders.iris.parsing.BooleanVectorizedFunction;
import net.irisshaders.iris.parsing.IrisFunctions$1;
import net.irisshaders.iris.parsing.IrisFunctions$10;
import net.irisshaders.iris.parsing.IrisFunctions$11;
import net.irisshaders.iris.parsing.IrisFunctions$12;
import net.irisshaders.iris.parsing.IrisFunctions$13;
import net.irisshaders.iris.parsing.IrisFunctions$14;
import net.irisshaders.iris.parsing.IrisFunctions$15;
import net.irisshaders.iris.parsing.IrisFunctions$16;
import net.irisshaders.iris.parsing.IrisFunctions$17;
import net.irisshaders.iris.parsing.IrisFunctions$18;
import net.irisshaders.iris.parsing.IrisFunctions$19;
import net.irisshaders.iris.parsing.IrisFunctions$2;
import net.irisshaders.iris.parsing.IrisFunctions$20;
import net.irisshaders.iris.parsing.IrisFunctions$21;
import net.irisshaders.iris.parsing.IrisFunctions$22;
import net.irisshaders.iris.parsing.IrisFunctions$23;
import net.irisshaders.iris.parsing.IrisFunctions$24;
import net.irisshaders.iris.parsing.IrisFunctions$25;
import net.irisshaders.iris.parsing.IrisFunctions$26;
import net.irisshaders.iris.parsing.IrisFunctions$27;
import net.irisshaders.iris.parsing.IrisFunctions$28;
import net.irisshaders.iris.parsing.IrisFunctions$29;
import net.irisshaders.iris.parsing.IrisFunctions$3;
import net.irisshaders.iris.parsing.IrisFunctions$30;
import net.irisshaders.iris.parsing.IrisFunctions$31;
import net.irisshaders.iris.parsing.IrisFunctions$32;
import net.irisshaders.iris.parsing.IrisFunctions$33;
import net.irisshaders.iris.parsing.IrisFunctions$34;
import net.irisshaders.iris.parsing.IrisFunctions$35;
import net.irisshaders.iris.parsing.IrisFunctions$36;
import net.irisshaders.iris.parsing.IrisFunctions$37;
import net.irisshaders.iris.parsing.IrisFunctions$38;
import net.irisshaders.iris.parsing.IrisFunctions$39;
import net.irisshaders.iris.parsing.IrisFunctions$4;
import net.irisshaders.iris.parsing.IrisFunctions$40;
import net.irisshaders.iris.parsing.IrisFunctions$41;
import net.irisshaders.iris.parsing.IrisFunctions$5;
import net.irisshaders.iris.parsing.IrisFunctions$6;
import net.irisshaders.iris.parsing.IrisFunctions$7;
import net.irisshaders.iris.parsing.IrisFunctions$8;
import net.irisshaders.iris.parsing.IrisFunctions$9;
import net.irisshaders.iris.parsing.IrisFunctions$ObjectObject2BooleanFunction;
import net.irisshaders.iris.parsing.IrisFunctions$QuadConsumer;
import net.irisshaders.iris.parsing.IrisFunctions$TriConsumer;
import net.irisshaders.iris.parsing.MatrixType;
import net.irisshaders.iris.parsing.VectorConstructor;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.parsing.VectorType$JOMLVector;
import net.irisshaders.iris.parsing.VectorizedFunction;
import org.joml.Vector2f;
import org.joml.Vector2fc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class IrisFunctions {
    public static final FunctionResolver functions;
    static final FunctionResolver.Builder builder;

    /*
     * WARNING - void declaration
     */
    static {
        void var0_8;
        int n4;
        Object object3;
        void var0_6;
        int n5;
        void objectArray;
        builder = new FunctionResolver.Builder();
        IrisFunctions.addVectorizable("negate", n -> -n);
        IrisFunctions.add("negate", f -> -f);
        IrisFunctions.addUnaryOpJOML("negate", VectorType.VEC2, Vector2f::negate);
        IrisFunctions.addUnaryOpJOML("negate", VectorType.VEC3, Vector3f::negate);
        IrisFunctions.addUnaryOpJOML("negate", VectorType.VEC4, Vector4f::negate);
        IrisFunctions.addVectorizable("add", Integer::sum);
        IrisFunctions.add("add", Float::sum);
        IrisFunctions.addBinaryOpJOML("add", VectorType.VEC2, Vector2f::add);
        IrisFunctions.addBinaryOpJOML("add", VectorType.VEC3, Vector3f::add);
        IrisFunctions.addBinaryOpJOML("add", VectorType.VEC4, Vector4f::add);
        IrisFunctions.addVectorizable("subtract", (n, n2) -> n - n2);
        IrisFunctions.add("subtract", (f, f2) -> f - f2);
        IrisFunctions.addBinaryOpJOML("subtract", VectorType.VEC2, Vector2f::sub);
        IrisFunctions.addBinaryOpJOML("subtract", VectorType.VEC3, Vector3f::sub);
        IrisFunctions.addBinaryOpJOML("subtract", VectorType.VEC4, Vector4f::sub);
        IrisFunctions.addVectorizable("multiply", (n, n2) -> n * n2);
        IrisFunctions.add("multiply", (f, f2) -> f * f2);
        IrisFunctions.addBinaryOpJOML("multiply", VectorType.VEC2, Vector2f::mul);
        IrisFunctions.addBinaryOpJOML("multiply", VectorType.VEC3, Vector3f::mul);
        IrisFunctions.addBinaryOpJOML("multiply", VectorType.VEC4, Vector4f::mul);
        IrisFunctions.add("divide", (f, f2) -> f / f2);
        IrisFunctions.addBinaryOpJOML("divide", VectorType.VEC2, Vector2f::div);
        IrisFunctions.addBinaryOpJOML("divide", VectorType.VEC3, Vector3f::div);
        IrisFunctions.addBinaryOpJOML("divide", VectorType.VEC4, Vector4f::div);
        IrisFunctions.addVectorizable("remainder", (n, n2) -> n % n2);
        IrisFunctions.add("remainder", (f, f2) -> f % f2);
        IrisFunctions.addBooleanVectorizable("equals", (n, n2) -> n == n2);
        IrisFunctions.add("equals", (f, f2) -> f == f2);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC2, false, Vector2f::equals);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC3, false, Vector3f::equals);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC4, false, Vector4f::equals);
        IrisFunctions.addBooleanVectorizable("notEquals", (n, n2) -> n != n2);
        IrisFunctions.add("notEquals", (f, f2) -> f != f2);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC2, true, Vector2f::equals);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC3, true, Vector3f::equals);
        IrisFunctions.addBinaryToBooleanOpJOML("equal", VectorType.VEC4, true, Vector4f::equals);
        IrisFunctions.add("lessThanOrEquals", (n, n2) -> n <= n2);
        IrisFunctions.add("lessThanOrEquals", (f, f2) -> f <= f2);
        IrisFunctions.add("moreThanOrEquals", (n, n2) -> n >= n2);
        IrisFunctions.add("moreThanOrEquals", (f, f2) -> f >= f2);
        IrisFunctions.add("lessThan", (n, n2) -> n < n2);
        IrisFunctions.add("lessThan", (f, f2) -> f < f2);
        IrisFunctions.add("moreThan", (n, n2) -> n > n2);
        IrisFunctions.add("moreThan", (f, f2) -> f > f2);
        IrisFunctions.addVectorizable("equals", (bl, bl2) -> bl == bl2);
        IrisFunctions.addVectorizable("notEquals", (bl, bl2) -> bl != bl2);
        IrisFunctions.addVectorizable("and", (bl, bl2) -> bl && bl2);
        IrisFunctions.addVectorizable("or", (bl, bl2) -> bl || bl2);
        IrisFunctions.addVectorizable("not", bl -> !bl);
        IrisFunctions.add("torad", f -> (float)Math.toRadians(f));
        IrisFunctions.add("todeg", f -> (float)Math.toDegrees(f));
        IrisFunctions.add("radians", f -> (float)Math.toRadians(f));
        IrisFunctions.add("degrees", f -> (float)Math.toDegrees(f));
        IrisFunctions.add("sin", f -> (float)Math.sin(f));
        IrisFunctions.add("cos", f -> (float)Math.cos(f));
        IrisFunctions.add("tan", f -> (float)Math.tan(f));
        IrisFunctions.add("asin", f -> (float)Math.asin(f));
        IrisFunctions.add("acos", f -> (float)Math.acos(f));
        IrisFunctions.add("atan", f -> (float)Math.atan(f));
        IrisFunctions.add("atan", (f, f2) -> (float)Math.atan2(f, f2));
        IrisFunctions.add("atan2", (f, f2) -> (float)Math.atan2(f, f2));
        IrisFunctions.add("pow", (f, f2) -> (float)Math.pow(f, f2));
        IrisFunctions.add("exp", f -> (float)Math.exp(f));
        IrisFunctions.add("log", f -> (float)Math.log(f));
        IrisFunctions.add("exp2", f -> (float)Math.pow(2.0, f));
        IrisFunctions.add("log2", f -> (float)(Math.log(f) / Math.log(2.0)));
        IrisFunctions.add("sqrt", f -> (float)Math.sqrt(f));
        IrisFunctions.add("log10", f -> (float)Math.log10(f));
        IrisFunctions.add("log", (f, f2) -> (float)(Math.log(f2) / Math.log(f)));
        IrisFunctions.add("exp10", f -> (float)Math.pow(10.0, f));
        IrisFunctions.addVectorizable("abs", Math::abs);
        IrisFunctions.add("abs", Math::abs);
        IrisFunctions.addUnaryOpJOML("abs", VectorType.VEC2, Vector2f::absolute);
        IrisFunctions.addUnaryOpJOML("abs", VectorType.VEC3, Vector3f::absolute);
        IrisFunctions.addUnaryOpJOML("abs", VectorType.VEC4, Vector4f::absolute);
        IrisFunctions.add("sign", Math::signum);
        IrisFunctions.add("signum", Math::signum);
        IrisFunctions.add("floor", f -> (float)Math.floor(f));
        IrisFunctions.add("floor", f -> (int)Math.floor(f));
        IrisFunctions.addUnaryOpJOML("floor", VectorType.VEC2, Vector2f::floor);
        IrisFunctions.addUnaryOpJOML("floor", VectorType.VEC3, Vector3f::floor);
        IrisFunctions.addUnaryOpJOML("floor", VectorType.VEC4, Vector4f::floor);
        IrisFunctions.add("ceil", f -> (float)Math.ceil(f));
        IrisFunctions.add("ceil", f -> (int)Math.ceil(f));
        IrisFunctions.addUnaryOpJOML("ceil", VectorType.VEC2, Vector2f::ceil);
        IrisFunctions.addUnaryOpJOML("ceil", VectorType.VEC3, Vector3f::ceil);
        IrisFunctions.addUnaryOpJOML("ceil", VectorType.VEC4, Vector4f::ceil);
        IrisFunctions.add("frac", f -> (float)((double)f - Math.floor(f)));
        IrisFunctions.addVectorizable("min", Math::min);
        IrisFunctions.add("min", Math::min);
        IrisFunctions.addBinaryOpJOML("min", VectorType.VEC2, Vector2f::min);
        IrisFunctions.addBinaryOpJOML("min", VectorType.VEC3, Vector3f::min);
        IrisFunctions.addBinaryOpJOML("min", VectorType.VEC4, Vector4f::min);
        IrisFunctions.addVectorizable("max", Math::max);
        IrisFunctions.add("max", Math::max);
        IrisFunctions.addBinaryOpJOML("max", VectorType.VEC2, Vector2f::max);
        IrisFunctions.addBinaryOpJOML("max", VectorType.VEC3, Vector3f::max);
        IrisFunctions.addBinaryOpJOML("max", VectorType.VEC4, Vector4f::max);
        int i = 3;
        while (objectArray <= 16) {
            Object[] i2 = new Type[objectArray];
            Arrays.fill(i2, Type.Float);
            IrisFunctions.add("min", new IrisFunctions$1((Type)Type.Float, (Type[])i2));
            i2 = new Type[objectArray];
            Arrays.fill(i2, Type.Float);
            IrisFunctions.add("max", new IrisFunctions$2((Type)Type.Float, (Type[])i2));
            i2 = new Type[objectArray];
            Arrays.fill(i2, Type.Int);
            IrisFunctions.addVectorizable("min", new IrisFunctions$3((Type)Type.Int, (Type[])i2));
            i2 = new Type[objectArray];
            Arrays.fill(i2, Type.Int);
            IrisFunctions.addVectorizable("max", new IrisFunctions$4((Type)Type.Int, (Type[])i2));
            ++objectArray;
        }
        IrisFunctions.addVectorizable("clamp", (n, n2, n3) -> Math.max(n2, Math.min(n3, n)));
        IrisFunctions.add("clamp", (f, f2, f3) -> Math.max(f2, Math.min(f3, f)));
        IrisFunctions.addTernaryOpJOML("clamp", VectorType.VEC2, (vector2f, vector2f2, vector2f3, vector2f4) -> {
            vector2f.min((Vector2fc)vector2f3, vector2f4);
            vector2f4.max((Vector2fc)vector2f2);
        });
        IrisFunctions.addTernaryOpJOML("clamp", VectorType.VEC3, (vector3f, vector3f2, vector3f3, vector3f4) -> {
            vector3f.min((Vector3fc)vector3f3, vector3f4);
            vector3f4.max((Vector3fc)vector3f2);
        });
        IrisFunctions.addTernaryOpJOML("clamp", VectorType.VEC4, (vector4f, vector4f2, vector4f3, vector4f4) -> {
            vector4f.min((Vector4fc)vector4f3, vector4f4);
            vector4f4.max((Vector4fc)vector4f2);
        });
        IrisFunctions.add("mix", (f, f2, f3) -> f + (f2 - f) * f3);
        IrisFunctions.addVectorizable("edge", (n, n2) -> n2 < n ? 0 : 1);
        IrisFunctions.add("edge", (f, f2) -> f2 < f ? 0.0f : 1.0f);
        IrisFunctions.addVectorizable("fmod", Math::floorMod);
        IrisFunctions.add("fmod", (f, f2) -> (f % f2 + f2) % f2);
        Random n52 = new Random();
        IrisFunctions.addVectorizable("randomInt", n52::nextInt);
        IrisFunctions.addVectorizable("randomInt", n52::nextInt);
        IrisFunctions.addVectorizable("randomInt", (n, n2) -> n52.nextInt(n2 - n) + n);
        IrisFunctions.add("random", n52::nextFloat);
        IrisFunctions.add("random", (f, f2) -> f + n52.nextFloat() * (f2 - f));
        for (Object object2 : Type.AllPrimitives) {
            IrisFunctions.add("if", new IrisFunctions$5((Type)object2, new Type[]{Type.Boolean, object2, object2}));
        }
        VectorType[] vectorTypeArray = VectorType.AllVectorTypes;
        int n6 = vectorTypeArray.length;
        for (n5 = 0; n5 < n6; ++n5) {
            Object object2;
            object2 = vectorTypeArray[n5];
            IrisFunctions.add("if", new IrisFunctions$6((Type)object2, new Type[]{Type.Boolean, object2, object2}));
        }
        int n7 = 2;
        while (var0_6 <= 16) {
            Type.Primitive[] primitiveArray = Type.AllPrimitives;
            n5 = primitiveArray.length;
            for (int j = 0; j < n5; ++j) {
                Type.Primitive primitive = primitiveArray[j];
                object3 = new Type[var0_6 * 2 + true];
                for (n4 = 0; n4 < var0_6 * 2; n4 += 2) {
                    object3[n4] = Type.Boolean;
                    object3[n4 + 1] = primitive;
                }
                object3[var0_6 * 2] = primitive;
                n4 = var0_6 * 2;
                IrisFunctions.add("if", new IrisFunctions$7((Type)primitive, (Type[])object3, n4));
            }
            ++var0_6;
        }
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$8((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, false)}, 0, false));
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$9((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, true), new TypedFunction.Parameter((Type)Type.Float, false)}, 1, false));
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$10((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false)}, 0, false));
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$11((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, true), new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false)}, 1, false));
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$12((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false)}, 0, false));
        builder.addDynamicFunction("smooth", (Type)Type.Float, () -> new IrisFunctions$13((Type)Type.Float, new TypedFunction.Parameter[]{new TypedFunction.Parameter((Type)Type.Float, true), new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false), new TypedFunction.Parameter((Type)Type.Float, false)}, 1, false));
        IrisFunctions.addImplicitCast((Type)Type.Int, (Type)Type.Float, functionReturn -> {
            functionReturn.floatReturn = functionReturn.intReturn;
        });
        IrisFunctions.addExplicitCast((Type)Type.Float, (Type)Type.Int, functionReturn -> {
            functionReturn.intReturn = (int)functionReturn.floatReturn;
        });
        IrisFunctions.add("between", (n, n2, n3) -> n >= n2 && n <= n3);
        IrisFunctions.add("between", (f, f2, f3) -> f >= f2 && f <= f3);
        IrisFunctions.add("equals", (f, f2, f3) -> Math.abs(f - f2) <= f3);
        int n8 = 2;
        while (var0_8 <= 32) {
            Object[] objectArray2 = new Type[var0_8];
            Arrays.fill(objectArray2, Type.Float);
            n5 = var0_8++;
            IrisFunctions.add("in", new IrisFunctions$14((Type)Type.Boolean, (Type[])objectArray2, n5));
        }
        for (Type.Primitive primitive : new Type.Primitive[]{Type.Boolean, Type.Int}) {
            for (int j = 2; j <= 4; ++j) {
                object3 = new VectorConstructor((Type)primitive, j);
                IrisFunctions.add(Character.toLowerCase(primitive.getClass().getSimpleName().charAt(0)) + "vec" + j, object3);
            }
        }
        IrisFunctions.add("vec2", new IrisFunctions$15((Type)VectorType.VEC2, new Type[]{Type.Float, Type.Float}));
        IrisFunctions.add("vec3", new IrisFunctions$16((Type)VectorType.VEC3, new Type[]{Type.Float, Type.Float, Type.Float}));
        IrisFunctions.add("vec4", new IrisFunctions$17((Type)VectorType.VEC4, new Type[]{Type.Float, Type.Float, Type.Float, Type.Float}));
        String[][] stringArrayArray = new String[][]{{"0", "r", "x", "s"}, {"1", "g", "y", "t"}, {"2", "b", "z", "p"}, {"3", "a", "w", "q"}};
        for (String string : stringArrayArray[0]) {
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$18((Type)Type.Float, new Type[]{VectorType.VEC2}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$19((Type)Type.Int, new Type[]{VectorType.I_VEC2}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$20((Type)Type.Float, new Type[]{VectorType.VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$21((Type)Type.Int, new Type[]{VectorType.I_VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$22((Type)Type.Float, new Type[]{VectorType.VEC4}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$23((Type)Type.Int, new Type[]{VectorType.I_VEC4}));
        }
        for (String string : stringArrayArray[1]) {
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$24((Type)Type.Float, new Type[]{VectorType.VEC2}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$25((Type)Type.Int, new Type[]{VectorType.I_VEC2}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$26((Type)Type.Float, new Type[]{VectorType.VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$27((Type)Type.Int, new Type[]{VectorType.I_VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$28((Type)Type.Float, new Type[]{VectorType.VEC4}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$29((Type)Type.Int, new Type[]{VectorType.I_VEC4}));
        }
        for (String string : stringArrayArray[2]) {
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$30((Type)Type.Float, new Type[]{VectorType.VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$31((Type)Type.Int, new Type[]{VectorType.I_VEC3}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$32((Type)Type.Float, new Type[]{VectorType.VEC4}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$33((Type)Type.Int, new Type[]{VectorType.I_VEC4}));
        }
        for (String string : stringArrayArray[3]) {
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$34((Type)Type.Float, new Type[]{VectorType.VEC4}));
            IrisFunctions.add("<access$" + string + ">", new IrisFunctions$35((Type)Type.Int, new Type[]{VectorType.I_VEC4}));
        }
        for (int j = 0; j < 4; ++j) {
            for (Object object3 : stringArrayArray[j]) {
                n4 = j;
                IrisFunctions.add("<access$" + (String)object3 + ">", new IrisFunctions$36((Type)VectorType.VEC4, new Type[]{MatrixType.MAT4}, n4));
            }
        }
        functions = builder.build();
    }

    public static void main(String[] stringArray) {
        functions.logAllFunctions();
    }

    static <T extends TypedFunction> void add(String string, T t) {
        builder.add(string, t);
    }

    static void addExplicitCast(Type type, Type type2, Consumer<FunctionReturn> consumer) {
        IrisFunctions.addCast("to" + type2.getClass().getSimpleName(), type, type2, consumer);
    }

    static <T extends TypedFunction> void addVectorized(String string, T t) {
        if (!(t.getReturnType() instanceof Type.Primitive)) {
            throw new IllegalArgumentException(string + " is not vectorizable");
        }
        IrisFunctions.add(string, new VectorizedFunction(t, 2));
        IrisFunctions.add(string, new VectorizedFunction(t, 3));
        IrisFunctions.add(string, new VectorizedFunction(t, 4));
    }

    static <T> void addUnaryOpJOML(String string, VectorType$JOMLVector<T> vectorType$JOMLVector, BiConsumer<T, T> biConsumer) {
        builder.add(string, (TypedFunction)new IrisFunctions$37((Type)vectorType$JOMLVector, new Type[]{vectorType$JOMLVector}, vectorType$JOMLVector, biConsumer));
    }

    static <T> void addBinaryOpJOML(String string, VectorType$JOMLVector<T> vectorType$JOMLVector, IrisFunctions$TriConsumer<T, T, T> irisFunctions$TriConsumer) {
        builder.add(string, (TypedFunction)new IrisFunctions$38((Type)vectorType$JOMLVector, new Type[]{vectorType$JOMLVector, vectorType$JOMLVector}, vectorType$JOMLVector, irisFunctions$TriConsumer));
    }

    static <T> void addTernaryOpJOML(String string, VectorType$JOMLVector<T> vectorType$JOMLVector, IrisFunctions$QuadConsumer<T, T, T, T> irisFunctions$QuadConsumer) {
        builder.add(string, (TypedFunction)new IrisFunctions$39((Type)vectorType$JOMLVector, new Type[]{vectorType$JOMLVector, vectorType$JOMLVector, vectorType$JOMLVector}, vectorType$JOMLVector, irisFunctions$QuadConsumer));
    }

    static void addImplicitCast(Type type, Type type2, Consumer<FunctionReturn> consumer) {
        IrisFunctions.addCast("<cast>", type, type2, consumer);
        IrisFunctions.addExplicitCast(type, type2, consumer);
    }

    static <T extends TypedFunction> void addVectorizable(String string, T t) {
        IrisFunctions.add(string, t);
        IrisFunctions.addVectorized(string, t);
    }

    static <T> void addBinaryToBooleanOpJOML(String string, VectorType$JOMLVector<T> vectorType$JOMLVector, boolean bl, IrisFunctions$ObjectObject2BooleanFunction<T, T> irisFunctions$ObjectObject2BooleanFunction) {
        builder.add(string, (TypedFunction)new IrisFunctions$40((Type)vectorType$JOMLVector, new Type[]{vectorType$JOMLVector, vectorType$JOMLVector}, irisFunctions$ObjectObject2BooleanFunction, bl));
    }

    static <T extends TypedFunction> void addBooleanVectorizable(String string, T t) {
        assert (t.getReturnType().equals(Type.Boolean));
        IrisFunctions.add(string, t);
        if (!(t.getReturnType() instanceof Type.Primitive)) {
            throw new IllegalArgumentException(string + " is not vectorizable");
        }
        IrisFunctions.add(string, new BooleanVectorizedFunction(t, 2));
        IrisFunctions.add(string, new BooleanVectorizedFunction(t, 3));
        IrisFunctions.add(string, new BooleanVectorizedFunction(t, 4));
    }

    static void addCast(String string, Type type, Type type2, Consumer<FunctionReturn> consumer) {
        IrisFunctions.add(string, new IrisFunctions$41(type2, type, consumer));
    }
}

