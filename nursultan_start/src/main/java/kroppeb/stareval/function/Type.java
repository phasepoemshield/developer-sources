/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.uniform.UniformType
 *  net.irisshaders.iris.parsing.MatrixType
 *  net.irisshaders.iris.parsing.VectorType
 */
package kroppeb.stareval.function;

import kroppeb.stareval.expression.ConstantExpression;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type$Boolean;
import kroppeb.stareval.function.Type$Float;
import kroppeb.stareval.function.Type$Int;
import kroppeb.stareval.function.Type$Primitive;
import kroppeb.stareval.function.TypedFunction$Parameter;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.parsing.MatrixType;
import net.irisshaders.iris.parsing.VectorType;

public abstract class Type {
    public static final Type$Boolean Boolean = new Type$Boolean();
    public static final Type$Int Int = new Type$Int();
    public static final Type$Float Float = new Type$Float();
    public static final TypedFunction$Parameter BooleanParameter = new TypedFunction$Parameter(Boolean);
    public static final TypedFunction$Parameter IntParameter = new TypedFunction$Parameter(Int);
    public static final TypedFunction$Parameter FloatParameter = new TypedFunction$Parameter(Float);
    public static final Type$Primitive[] AllPrimitives = new Type$Primitive[]{Boolean, Int, Float};

    public abstract String toString();

    public static UniformType convert(Type type) {
        if (type == Int || type == Boolean) {
            return UniformType.INT;
        }
        if (type == Float) {
            return UniformType.FLOAT;
        }
        if (type == VectorType.VEC2) {
            return UniformType.VEC2;
        }
        if (type == VectorType.VEC3) {
            return UniformType.VEC3;
        }
        if (type == VectorType.VEC4) {
            return UniformType.VEC4;
        }
        if (type == VectorType.I_VEC2) {
            return UniformType.VEC2I;
        }
        if (type == VectorType.I_VEC3) {
            return UniformType.VEC3I;
        }
        if (type == MatrixType.MAT4) {
            return UniformType.MAT4;
        }
        throw new IllegalArgumentException("Unsupported custom uniform type: " + String.valueOf(type));
    }

    public abstract ConstantExpression createConstant(FunctionReturn var1);

    public abstract Object createArray(int var1);

    public abstract void getValueFromArray(Object var1, int var2, FunctionReturn var3);

    public abstract void setValueFromReturn(Object var1, int var2, FunctionReturn var3);
}

