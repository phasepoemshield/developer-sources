/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.FloatSupplier
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformType
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 *  org.joml.Vector3d
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.uniforms.custom;

import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.FloatSupplier;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformType;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.custom.CustomUniformFixedInputUniformsHolder;
import net.irisshaders.iris.uniforms.custom.cached.BooleanCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.CachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float2VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float3VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float4MatrixCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Float4VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.FloatCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Int2VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.Int3VectorCachedUniform;
import net.irisshaders.iris.uniforms.custom.cached.IntCachedUniform;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3d;
import org.joml.Vector3f;
import org.joml.Vector3i;
import org.joml.Vector4f;

public class CustomUniformFixedInputUniformsHolder$Builder
implements UniformHolder {
    private final Map<String, CachedUniform> inputVariables = new Object2ObjectOpenHashMap();

    private CustomUniformFixedInputUniformsHolder$Builder put(String string, CachedUniform cachedUniform) {
        if (this.inputVariables.containsKey(string)) {
            Iris.logger.warn("Duplicated fixed uniform supplied as inputs to the Custom uniform holder: " + string);
            return this;
        }
        this.inputVariables.put(string, cachedUniform);
        return this;
    }

    public CustomUniformFixedInputUniformsHolder build() {
        return new CustomUniformFixedInputUniformsHolder((ImmutableMap<String, CachedUniform>)ImmutableMap.copyOf(this.inputVariables));
    }

    public UniformHolder uniformMatrix(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Matrix4fc> supplier) {
        return this.put(string, new Float4MatrixCachedUniform(string, uniformUpdateFrequency, supplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniformTruncated3f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector4f> supplier) {
        Vector3f vector3f = new Vector3f();
        return this.put(string, new Float3VectorCachedUniform(string, uniformUpdateFrequency, () -> {
            Vector4f vector4f = (Vector4f)supplier.get();
            vector3f.set(vector4f.x(), vector4f.y(), vector4f.z());
            return vector3f;
        }));
    }

    public UniformHolder uniform4fArray(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<float[]> supplier) {
        Vector4f vector4f = new Vector4f();
        return this.put(string, new Float4VectorCachedUniform(string, uniformUpdateFrequency, () -> {
            float[] fArray = (float[])supplier.get();
            vector4f.set(fArray);
            return vector4f;
        }));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform1i(UniformUpdateFrequency uniformUpdateFrequency, String string, IntSupplier intSupplier) {
        return this.put(string, new IntCachedUniform(string, uniformUpdateFrequency, intSupplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, FloatSupplier floatSupplier) {
        return this.put(string, new FloatCachedUniform(string, uniformUpdateFrequency, floatSupplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, IntSupplier intSupplier) {
        return this.put(string, new FloatCachedUniform(string, uniformUpdateFrequency, intSupplier::getAsInt));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform1f(UniformUpdateFrequency uniformUpdateFrequency, String string, DoubleSupplier doubleSupplier) {
        return this.put(string, new FloatCachedUniform(string, uniformUpdateFrequency, () -> (float)doubleSupplier.getAsDouble()));
    }

    public UniformHolder uniformMatrixFromArray(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<float[]> supplier) {
        Matrix4f matrix4f = new Matrix4f();
        return this.put(string, new Float4MatrixCachedUniform(string, uniformUpdateFrequency, () -> {
            matrix4f.set((float[])supplier.get());
            return matrix4f;
        }));
    }

    public UniformHolder externallyManagedUniform(String string, UniformType uniformType) {
        return this;
    }

    public UniformHolder uniform4f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector4f> supplier) {
        Vector4f vector4f = new Vector4f();
        return this.put(string, new Float4VectorCachedUniform(string, uniformUpdateFrequency, () -> {
            Vector4f vector4f2 = (Vector4f)supplier.get();
            vector4f.set(vector4f2.x(), vector4f2.y(), vector4f2.z(), vector4f2.w());
            return vector4f;
        }));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform3f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3f> supplier) {
        return this.put(string, new Float3VectorCachedUniform(string, uniformUpdateFrequency, supplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform2f(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector2f> supplier) {
        return this.put(string, new Float2VectorCachedUniform(string, uniformUpdateFrequency, supplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform3i(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3i> supplier) {
        return this.put(string, new Int3VectorCachedUniform(string, uniformUpdateFrequency, supplier));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform2i(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector2i> supplier) {
        return this.put(string, new Int2VectorCachedUniform(string, uniformUpdateFrequency, supplier));
    }

    public UniformHolder uniform3d(UniformUpdateFrequency uniformUpdateFrequency, String string, Supplier<Vector3d> supplier) {
        Vector3f vector3f = new Vector3f();
        return this.put(string, new Float3VectorCachedUniform(string, uniformUpdateFrequency, () -> {
            Vector3d vector3d = (Vector3d)supplier.get();
            vector3f.set(vector3d.x(), vector3d.y(), vector3d.z());
            return vector3f;
        }));
    }

    public CustomUniformFixedInputUniformsHolder$Builder uniform1b(UniformUpdateFrequency uniformUpdateFrequency, String string, BooleanSupplier booleanSupplier) {
        return this.put(string, new BooleanCachedUniform(string, uniformUpdateFrequency, booleanSupplier));
    }
}

