/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00965
 *  minecraft.class03448
 *  minecraft.class05363
 *  minecraft.class06143
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package minecraft;

import minecraft.class00965;
import minecraft.class01162;
import minecraft.class01167;
import minecraft.class03448;
import minecraft.class05363;
import minecraft.class06143;
import org.joml.Vector3f;
import org.joml.Vector3fc;

public class class01151
extends class01167<class01162> {
    private final Vector3f N;
    private final Vector3f y;

    public class01151(class03448 class034482, double d, double d2, double d3, double d4, double d5, double d6, class01162 class011622, class06143 class061432) {
        super(class034482, d, d2, d3, d4, d5, d6, class011622, class061432);
        float f = this.field_3840.z() * 0.4f + 0.6f;
        this.N = this.N(class011622.N(), f);
        this.y = this.N(class011622.y(), f);
    }

    private void N(float f) {
        float f2 = ((float)this.field_3866 + f) / ((float)this.field_3847 + 1.0f);
        Vector3f vector3f = new Vector3f((Vector3fc)this.N).lerp((Vector3fc)this.y, f2);
        this.field_62633 = vector3f.x();
        this.field_62634 = vector3f.y();
        this.field_62635 = vector3f.z();
    }

    private Vector3f N(Vector3f vector3f, float f) {
        return new Vector3f(this.N(vector3f.x(), f), this.N(vector3f.y(), f), this.N(vector3f.z(), f));
    }

    public void method_3074(class00965 class009652, class05363 class053632, float f) {
        this.N(f);
        super.method_3074(class009652, class053632, f);
    }
}

