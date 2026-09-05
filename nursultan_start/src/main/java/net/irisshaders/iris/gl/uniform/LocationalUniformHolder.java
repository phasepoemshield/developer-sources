/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.gl.uniform;

import java.util.OptionalInt;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.gl.uniform.BooleanUniform;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.FloatUniform;
import net.irisshaders.iris.gl.uniform.IntUniform;
import net.irisshaders.iris.gl.uniform.MatrixFromFloatArrayUniform;
import net.irisshaders.iris.gl.uniform.MatrixUniform;
import net.irisshaders.iris.gl.uniform.Uniform;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.gl.uniform.Vector2IntegerJomlUniform;
import net.irisshaders.iris.gl.uniform.Vector2Uniform;
import net.irisshaders.iris.gl.uniform.Vector3IntegerUniform;
import net.irisshaders.iris.gl.uniform.Vector3Uniform;
import net.irisshaders.iris.gl.uniform.Vector4ArrayUniform;
import net.irisshaders.iris.gl.uniform.Vector4Uniform;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3i;
import org.joml.Vector4f;

public interface LocationalUniformHolder
extends UniformHolder {
    public OptionalInt location(String var1, UniformType var2);

    @Override
    default public LocationalUniformHolder uniformMatrix(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Matrix4fc> supplier) {
        this.location(string, UniformType.MAT4).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new MatrixUniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniformTruncated3f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector4f> supplier) {
        this.location(string, UniformType.VEC3).ifPresent(n -> this.addUniform(uniformUpdateFrequency, Vector3Uniform.truncated(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform4fArray(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<float[]> supplier) {
        this.location(string, UniformType.VEC4).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector4ArrayUniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform1i(UniformUpdateFrequency uniformUpdateFrequency, String string, IntSupplier intSupplier) {
        this.location(string, UniformType.INT).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new IntUniform(n, intSupplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, IntSupplier intSupplier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new FloatUniform(n, () -> intSupplier.getAsInt())));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, FloatSupplier floatSupplier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new FloatUniform(n, floatSupplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, DoubleSupplier doubleSupplier) {
        this.location(string, UniformType.FLOAT).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new FloatUniform(n, () -> (float)doubleSupplier.getAsDouble())));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniformMatrixFromArray(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<float[]> supplier) {
        this.location(string, UniformType.MAT4).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new MatrixFromFloatArrayUniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform4f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector4f> supplier) {
        this.location(string, UniformType.VEC4).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector4Uniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform3f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3f> supplier) {
        this.location(string, UniformType.VEC3).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector3Uniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform2f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector2f> supplier) {
        this.location(string, UniformType.VEC2).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector2Uniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform3i(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3i> supplier) {
        this.location(string, UniformType.VEC3I).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector3IntegerUniform(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform2i(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector2i> supplier) {
        this.location(string, UniformType.VEC2I).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new Vector2IntegerJomlUniform(n, supplier)));
        return this;
    }

    public LocationalUniformHolder addUniform(UniformUpdateFrequency var1, Uniform var2);

    @Override
    default public LocationalUniformHolder uniform3d(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3d> supplier) {
        this.location(string, UniformType.VEC3).ifPresent(n -> this.addUniform(uniformUpdateFrequency, Vector3Uniform.converted(n, supplier)));
        return this;
    }

    @Override
    default public LocationalUniformHolder uniform1b(UniformUpdateFrequency uniformUpdateFrequency, String string, BooleanSupplier booleanSupplier) {
        this.location(string, UniformType.INT).ifPresent(n -> this.addUniform(uniformUpdateFrequency, new BooleanUniform(n, booleanSupplier)));
        return this;
    }
}

