/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.expression.Expression
 *  kroppeb.stareval.expression.VariableExpression
 *  kroppeb.stareval.function.FunctionContext
 *  kroppeb.stareval.function.FunctionReturn
 *  kroppeb.stareval.function.Type
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.parsing.VectorType
 *  org.joml.Vector2f
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.uniforms.custom.cached;

import kroppeb.stareval.expression.Expression;
import kroppeb.stareval.expression.VariableExpression;
import kroppeb.stareval.function.FunctionContext;
import kroppeb.stareval.function.FunctionReturn;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.parsing.VectorType;
import net.irisshaders.iris.uniforms.custom.cached.BooleanCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float2VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float3VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float4VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.FloatCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.IntCachedUniform;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public abstract class CachedUniform
implements VariableExpression {
    private final String name;
    private final UniformUpdateFrequency updateFrequency;
    private boolean changed = true;

    public CachedUniform(String string, UniformUpdateFrequency uniformUpdateFrequency) {
        this.name = string;
        this.updateFrequency = uniformUpdateFrequency;
    }

    public void update() {
        this.doUpdate();
        this.changed = true;
    }

    public String getName() {
        return this.name;
    }

    public abstract Type getType();

    public abstract void push(int var1);

    public abstract void writeTo(FunctionReturn var1);

    protected abstract boolean doUpdate();

    public void pushIfChanged(int n) {
        if (this.changed) {
            this.push(n);
        }
    }

    public static CachedUniform forExpression(String string, Type type, Expression expression, FunctionContext functionContext) {
        FunctionReturn functionReturn = new FunctionReturn();
        UniformUpdateFrequency uniformUpdateFrequency = UniformUpdateFrequency.CUSTOM;
        if (type.equals(Type.Boolean)) {
            return new BooleanCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return functionReturn.booleanReturn;
            });
        }
        if (type.equals(Type.Int)) {
            return new IntCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return functionReturn.intReturn;
            });
        }
        if (type.equals(Type.Float)) {
            return new FloatCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return functionReturn.floatReturn;
            });
        }
        if (type.equals(VectorType.VEC2)) {
            return new Float2VectorCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return (Vector2f)functionReturn.objectReturn;
            });
        }
        if (type.equals(VectorType.VEC3)) {
            return new Float3VectorCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return (Vector3f)functionReturn.objectReturn;
            });
        }
        if (type.equals(VectorType.VEC4)) {
            return new Float4VectorCachedUniform(string, uniformUpdateFrequency, () -> {
                expression.evaluateTo(functionContext, functionReturn);
                return (Vector4f)functionReturn.objectReturn;
            });
        }
        throw new IllegalArgumentException("Custom uniforms of type: " + String.valueOf(type) + " are currently not supported");
    }

    public void markUnchanged() {
        this.changed = false;
    }

    public UniformUpdateFrequency getUpdateFrequency() {
        return this.updateFrequency;
    }

    public void evaluateTo(FunctionContext functionContext, FunctionReturn functionReturn) {
        this.writeTo(functionReturn);
    }
}

