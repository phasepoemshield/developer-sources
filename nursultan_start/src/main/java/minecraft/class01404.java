/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02054
 *  minecraft.class06338
 *  minecraft.class07536
 *  org.apache.commons.lang3.tuple.Triple
 *  org.joml.Matrix3f
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionf
 *  org.joml.Quaternionfc
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import minecraft.class02054;
import minecraft.class06338;
import minecraft.class07536;
import org.apache.commons.lang3.tuple.Triple;
import org.joml.Matrix3f;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionf;
import org.joml.Quaternionfc;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public final class class01404 {
    private final Matrix4fc L;
    public static final Codec<class01404> N = RecordCodecBuilder.create(instance -> instance.group((App)class06338.i.fieldOf("translation").forGetter(class014042 -> class014042.i), (App)class06338.z.fieldOf("left_rotation").forGetter(class014042 -> class014042.R), (App)class06338.i.fieldOf("scale").forGetter(class014042 -> class014042.M), (App)class06338.z.fieldOf("right_rotation").forGetter(class014042 -> class014042.B)).apply(instance, class01404::new));
    public static final Codec<class01404> y = Codec.withAlternative(N, (Codec)class06338.U.xmap(class01404::new, class01404::L));
    private boolean u;
    private @Nullable Vector3fc i;
    private @Nullable Quaternionfc R;
    private @Nullable Vector3fc M;
    private @Nullable Quaternionfc B;
    private static final class01404 Z = (class01404)class07536.N(() -> {
        class01404 class014042 = new class01404((Matrix4fc)new Matrix4f());
        class014042.i = new Vector3f();
        class014042.R = new Quaternionf();
        class014042.M = new Vector3f(1.0f, 1.0f, 1.0f);
        class014042.B = new Quaternionf();
        class014042.u = true;
        return class014042;
    });

    public Matrix4fc L() {
        return this.L;
    }

    public Vector3fc M() {
        this.Z();
        return this.M;
    }

    public class01404(@Nullable Matrix4fc matrix4fc) {
        this.L = matrix4fc == null ? new Matrix4f() : matrix4fc;
    }

    public class01404(@Nullable Vector3fc vector3fc, @Nullable Quaternionfc quaternionfc, @Nullable Vector3fc vector3fc2, @Nullable Quaternionfc quaternionfc2) {
        this.L = class01404.N(vector3fc, quaternionfc, vector3fc2, quaternionfc2);
        this.i = vector3fc != null ? vector3fc : new Vector3f();
        this.R = quaternionfc != null ? quaternionfc : new Quaternionf();
        this.M = vector3fc2 != null ? vector3fc2 : new Vector3f(1.0f, 1.0f, 1.0f);
        this.B = quaternionfc2 != null ? quaternionfc2 : new Quaternionf();
        this.u = true;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class01404 class014042 = (class01404)object;
        return Objects.equals(this.L, class014042.L);
    }

    public int hashCode() {
        return Objects.hash(this.L);
    }

    public Quaternionfc B() {
        this.Z();
        return this.B;
    }

    private void Z() {
        if (!this.u) {
            float f = 1.0f / this.L.m33();
            Triple var2 = class02054.N((Matrix3f)new Matrix3f(this.L).scale(f));
            this.i = this.L.getTranslation(new Vector3f()).mul(f);
            this.R = new Quaternionf((Quaternionfc)var2.getLeft());
            this.M = new Vector3f((Vector3fc)var2.getMiddle());
            this.B = new Quaternionf((Quaternionfc)var2.getRight());
            this.u = true;
        }
    }

    public Vector3fc i() {
        this.Z();
        return this.i;
    }

    public Matrix4f u() {
        return new Matrix4f(this.L);
    }

    public @Nullable class01404 y() {
        if (this == Z) {
            return this;
        }
        Matrix4f matrix4f = this.u().invertAffine();
        if (matrix4f.isFinite()) {
            return new class01404((Matrix4fc)matrix4f);
        }
        return null;
    }

    public class01404 N(class01404 class014042) {
        Matrix4f matrix4f = this.u();
        matrix4f.mul(class014042.L());
        return new class01404((Matrix4fc)matrix4f);
    }

    public static class01404 N() {
        return Z;
    }

    private static Matrix4f N(@Nullable Vector3fc vector3fc, @Nullable Quaternionfc quaternionfc, @Nullable Vector3fc vector3fc2, @Nullable Quaternionfc quaternionfc2) {
        Matrix4f matrix4f = new Matrix4f();
        if (vector3fc != null) {
            matrix4f.translation(vector3fc);
        }
        if (quaternionfc != null) {
            matrix4f.rotate(quaternionfc);
        }
        if (vector3fc2 != null) {
            matrix4f.scale(vector3fc2);
        }
        if (quaternionfc2 != null) {
            matrix4f.rotate(quaternionfc2);
        }
        return matrix4f;
    }

    public class01404 N(class01404 class014042, float f) {
        return new class01404((Vector3fc)this.i().lerp(class014042.i(), f, new Vector3f()), (Quaternionfc)this.R().slerp(class014042.R(), f, new Quaternionf()), (Vector3fc)this.M().lerp(class014042.M(), f, new Vector3f()), (Quaternionfc)this.B().slerp(class014042.B(), f, new Quaternionf()));
    }

    public Quaternionfc R() {
        this.Z();
        return this.R;
    }
}

