/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.state.ValueUpdateNotifier
 *  org.joml.Matrix3fc
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 *  org.joml.Vector3f
 *  org.joml.Vector4f
 *  org.joml.Vector4i
 */
package net.irisshaders.iris.gl.uniform;

import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.state.ValueUpdateNotifier;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.FloatUniform;
import net.irisshaders.iris.gl.uniform.IntUniform;
import net.irisshaders.iris.gl.uniform.LocationalUniformHolder;
import net.irisshaders.iris.gl.uniform.Matrix3Uniform;
import net.irisshaders.iris.gl.uniform.MatrixUniform;
import net.irisshaders.iris.gl.uniform.Uniform;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.gl.uniform.Vector2IntegerJomlUniform;
import net.irisshaders.iris.gl.uniform.Vector2Uniform;
import net.irisshaders.iris.gl.uniform.Vector3Uniform;
import net.irisshaders.iris.gl.uniform.Vector4ArrayUniform;
import net.irisshaders.iris.gl.uniform.Vector4IntegerJomlUniform;
import net.irisshaders.iris.gl.uniform.Vector4Uniform;
import org.joml.Matrix3fc;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4i;

public interface DynamicLocationalUniformHolder
extends DynamicUniformHolder,
LocationalUniformHolder {
    public DynamicLocationalUniformHolder addDynamicUniform(Uniform var1, ValueUpdateNotifier var2);

    @Override
    default public DynamicUniformHolder uniformMatrix(String string, Supplier<Matrix4fc> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.MAT4).ifPresent(n -> this.addDynamicUniform(new MatrixUniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicUniformHolder uniform4fArray(String string, Supplier<float[]> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC4).ifPresent(n -> this.addDynamicUniform(new Vector4ArrayUniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicUniformHolder uniformMatrix3(String string, Supplier<Matrix3fc> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.MAT3).ifPresent(n -> this.addDynamicUniform(new Matrix3Uniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform1i(String string, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.INT).ifPresent(n -> this.addDynamicUniform(new IntUniform(n, intSupplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform1f(String string, DoubleSupplier doubleSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addDynamicUniform(new FloatUniform(n, () -> (float)doubleSupplier.getAsDouble(), valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform1f(String string, IntSupplier intSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addDynamicUniform(new FloatUniform(n, () -> intSupplier.getAsInt(), valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform1f(String string, FloatSupplier floatSupplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addDynamicUniform(new FloatUniform(n, floatSupplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicUniformHolder uniform4f(String string, Supplier<Vector4f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC4).ifPresent(n -> this.addDynamicUniform(new Vector4Uniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicUniformHolder uniform3f(String string, Supplier<Vector3f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC3).ifPresent(n -> this.addDynamicUniform(new Vector3Uniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform2f(String string, Supplier<Vector2f> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC2).ifPresent(n -> this.addDynamicUniform(new Vector2Uniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicUniformHolder uniform4i(String string, Supplier<Vector4i> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC4I).ifPresent(n -> this.addDynamicUniform(new Vector4IntegerJomlUniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }

    @Override
    default public DynamicLocationalUniformHolder uniform2i(String string, Supplier<Vector2i> supplier, ValueUpdateNotifier valueUpdateNotifier) {
        this.location(string, UniformType.VEC2I).ifPresent(n -> this.addDynamicUniform(new Vector2IntegerJomlUniform(n, supplier, valueUpdateNotifier), valueUpdateNotifier));
        return this;
    }
}

