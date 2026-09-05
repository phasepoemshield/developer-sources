/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09785
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09785;
import java.util.function.UnaryOperator;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11638
implements class09785<Vector2f> {
    public Object N_0;
    public Object N_1;

    public class11638(class09785 class097852, Vector2f vector2f) {
        this.R();
        this.N_0 = class097852;
        this.N_1 = vector2f;
    }

    public void y() {
        ((class09785)this.N_0).y();
    }

    public void N(UnaryOperator<Vector2f> unaryOperator) {
        this.N((Vector2f)unaryOperator.apply(this.L()));
    }

    public Vector2f L() {
        Vector4f vector4f = (Vector4f)((class09785)this.N_0).L();
        if (vector4f == null) {
            return null;
        }
        return ((Vector2f)this.N_1).set(vector4f.z, vector4f.w);
    }

    public void N(Vector2f vector2f) {
        Vector4f vector4f = (Vector4f)((class09785)this.N_0).L();
        if (vector4f == null) {
            vector4f = new Vector4f();
        }
        vector4f.set(vector2f.x, vector2f.y, vector2f.x, vector2f.y);
        ((class09785)this.N_0).N((Object)vector4f);
    }

    private void R() {
    }
}

