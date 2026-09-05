/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kroppeb.stareval.function.Type
 *  kroppeb.stareval.function.Type$ObjectType
 *  kroppeb.stareval.function.Type$Primitive
 *  org.joml.Vector2f
 *  org.joml.Vector2i
 *  org.joml.Vector3f
 *  org.joml.Vector3i
 *  org.joml.Vector4f
 *  org.joml.Vector4i
 */
package net.irisshaders.iris.parsing;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import kroppeb.stareval.function.Type;
import net.irisshaders.iris.parsing.VectorType$ArrayVector;
import net.irisshaders.iris.parsing.VectorType$JOMLVector;
import org.joml.Vector2f;
import org.joml.Vector2i;
import org.joml.Vector3f;
import org.joml.Vector3i;
import org.joml.Vector4f;
import org.joml.Vector4i;

public abstract class VectorType
extends Type.ObjectType {
    public static final VectorType$JOMLVector<Vector2f> VEC2 = new VectorType$JOMLVector<Vector2f>("vec2", Vector2f::new);
    public static final VectorType$JOMLVector<Vector3f> VEC3 = new VectorType$JOMLVector<Vector3f>("vec3", Vector3f::new);
    public static final VectorType$JOMLVector<Vector4f> VEC4 = new VectorType$JOMLVector<Vector4f>("vec4", Vector4f::new);
    public static final VectorType$JOMLVector<Vector2i> I_VEC2 = new VectorType$JOMLVector<Vector2i>("ivec2", Vector2i::new);
    public static final VectorType$JOMLVector<Vector3i> I_VEC3 = new VectorType$JOMLVector<Vector3i>("ivec3", Vector3i::new);
    public static final VectorType$JOMLVector<Vector4i> I_VEC4 = new VectorType$JOMLVector<Vector4i>("ivec4", Vector4i::new);
    public static final VectorType B_VEC2 = new VectorType$ArrayVector((Type)Type.Boolean, 2);
    public static final VectorType B_VEC3 = new VectorType$ArrayVector((Type)Type.Boolean, 3);
    public static final VectorType B_VEC4 = new VectorType$ArrayVector((Type)Type.Boolean, 4);
    public static final VectorType$ArrayVector[] AllArrayVectorTypes = (VectorType$ArrayVector[])Stream.of(Type.Int, Type.Boolean).flatMap(primitive -> IntStream.rangeClosed(2, 4).mapToObj(n -> new VectorType$ArrayVector((Type)primitive, n))).toArray(VectorType$ArrayVector[]::new);
    public static final VectorType[] AllVectorTypes = (VectorType[])Arrays.stream(Type.AllPrimitives).flatMap(primitive -> IntStream.rangeClosed(2, 4).mapToObj(n -> VectorType.of(primitive, n))).toArray(VectorType[]::new);

    public static VectorType of(Type.Primitive primitive, int n) {
        if (primitive.equals(Type.Float)) {
            return switch (n) {
                case 2 -> VEC2;
                case 3 -> VEC3;
                case 4 -> VEC4;
                default -> throw new IllegalArgumentException("not a valid vector");
            };
        }
        return new VectorType$ArrayVector((Type)primitive, n);
    }
}

