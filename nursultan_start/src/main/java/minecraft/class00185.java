/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00002
 *  minecraft.class00018
 *  minecraft.class00044
 *  minecraft.class00137
 *  minecraft.class01894
 *  minecraft.class04891
 *  minecraft.class04911
 *  minecraft.class06069
 *  minecraft.class09033
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00002;
import minecraft.class00018;
import minecraft.class00044;
import minecraft.class00137;
import minecraft.class01894;
import minecraft.class04891;
import minecraft.class04911;
import minecraft.class06069;
import minecraft.class09033;
import org.jspecify.annotations.Nullable;

public abstract class class00185
implements class00044 {
    protected @Nullable class00002 N;
    protected final class04911 y;
    protected final class01894 L;
    protected float u = 1.0f;
    protected float i = 1.0f;
    protected double R;
    protected double M;
    protected double B;
    protected boolean Z;
    protected int z;
    protected class00018 U = class00018.field_5476;
    protected boolean E;
    protected class06069 W;

    public class01894 L() {
        return this.L;
    }

    public int M() {
        return this.z;
    }

    protected class00185(class01894 class018942, class04911 class049112, class06069 class060692) {
        this.L = class018942;
        this.y = class049112;
        this.W = class060692;
    }

    protected class00185(class04891 class048912, class04911 class049112, class06069 class060692) {
        this(class048912.N(), class049112, class060692);
    }

    public String toString() {
        return "SoundInstance[" + String.valueOf(this.L) + "]";
    }

    public float B() {
        return this.u * this.N.L().N(this.W);
    }

    public float Z() {
        return this.i * this.N.u().N(this.W);
    }

    public class04911 i() {
        return this.y;
    }

    public boolean m() {
        return this.E;
    }

    public double U() {
        return this.M;
    }

    public double z() {
        return this.R;
    }

    public @Nullable class00002 u() {
        return this.N;
    }

    public double E() {
        return this.B;
    }

    public @Nullable class00137 N(class09033 class090332) {
        if (this.L.equals((Object)class09033.L)) {
            this.N = class09033.i;
            return class09033.u;
        }
        class00137 class001372 = class090332.N(this.L);
        this.N = class001372 == null ? class09033.y : class001372.y(this.W);
        return class001372;
    }

    public class00018 W() {
        return this.U;
    }

    public boolean R() {
        return this.Z;
    }
}

