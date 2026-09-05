/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09778
 *  Nursultan.class09784
 *  Nursultan.class09798
 *  Nursultan.class09809
 *  Nursultan.class09962
 *  Nursultan.class09969
 *  Nursultan.class09991
 *  Nursultan.class11300
 *  Nursultan.class11938
 *  minecraft.class06202
 *  org.joml.Vector2f
 *  org.joml.Vector4f
 */
package Nursultan;

import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09809;
import Nursultan.class09962;
import Nursultan.class09969;
import Nursultan.class09991;
import Nursultan.class11300;
import Nursultan.class11730;
import Nursultan.class11753;
import Nursultan.class11769;
import Nursultan.class11938;
import java.util.ArrayList;
import java.util.List;
import minecraft.class06202;
import org.joml.Vector2f;
import org.joml.Vector4f;

public class class11738 {
    public Object N_0;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;
    public static Object y_5;

    private class11738() {
        this.Z();
        this.N_0 = new ArrayList();
    }

    static {
        class11738.B();
        y_0 = new class11738();
        y_3 = class11300.N((int)-1, (int)100);
        y_4 = class09991.N().N(false);
        y_5 = class09991.N().N(class09969.FLOATING).U(0.0f).E(0.0f).N(class09962.N((float)100.0f)).y(class09962.N((float)100.0f)).L(true).N(Integer.MAX_VALUE);
    }

    private static void B() {
        y_0 = null;
        y_1 = Float.valueOf(5.0f);
        y_2 = Float.valueOf(1.0f);
        y_3 = 0x64FFFFFF;
        y_4 = null;
        y_5 = null;
    }

    private void Z() {
    }

    private void y(float f, Vector2f vector2f, float f2) {
        float f3 = this.N(f, vector2f.x, f2);
        if (!Float.isNaN(f3)) {
            vector2f.x = f3;
            ((List)this.N_0).add(new Vector2f(f, -1.0f));
        }
    }

    private float N(float f, float f2, float f3) {
        if (Math.abs(f - f2) < 5.0f) {
            return f;
        }
        if (Math.abs(f - (f2 + f3)) < 5.0f) {
            return f - f3;
        }
        if (Math.abs(f - (f2 + f3 / 2.0f)) < 5.0f) {
            return f - f3 / 2.0f;
        }
        return Float.NaN;
    }

    public static class09798 N(Void void_, class09809 class098092) {
        class098092.L("hudSnapLines", ((List)((class11738)class11738.y_0).N_0)::hashCode);
        List list = (List)((class11738)class11738.y_0).N_0;
        if (list.isEmpty()) {
            return class09778.N((T class097842) -> ((class09784)class097842.N("snapGuides")).N((class09991)y_4));
        }
        float f = class11738.N(true);
        float f2 = class11738.N(false);
        return class09778.N((class09991)((class09991)y_5), (T class097843) -> {
            class097843.N("snapGuides");
            for (int i = 0; i < list.size(); ++i) {
                Vector2f vector2f = (Vector2f)list.get(i);
                float f3 = vector2f.x == -1.0f ? 1.0f : f2 + 1.0f;
                float f4 = vector2f.y == -1.0f ? 1.0f : f + 1.0f;
                class09991 class099912 = class09991.N().N(class09969.FLOATING).U(vector2f.x).E(vector2f.y).u(f4, f3).y(((Integer)y_3).intValue());
                String string = "snapLine-" + i;
                class097843.N_3(class099912, class097842 -> class097842.N(string));
            }
        });
    }

    private static float N(boolean bl) {
        class11753 class117532 = class11938.i();
        float f = class117532 != null ? class117532.u() : 1.0f;
        class06202 class062022 = class06202.Nq();
        int n = bl ? class062022.Nt().U() : class062022.Nt().E();
        return (float)Math.max(1, n) / f;
    }

    public void N(String string, Vector2f vector2f, float f, float f2, float f3, float f4, boolean bl, boolean bl2) {
        for (class11769 class117692 : (List)class11730.N_7) {
            Vector4f vector4f;
            if (class117692.E().equals(string) || (vector4f = class117692.R()) == null) continue;
            if (bl) {
                this.y(vector4f.x(), vector2f, f);
                this.y(vector4f.x() + vector4f.z(), vector2f, f);
            }
            if (!bl2) continue;
            this.N(vector4f.y(), vector2f, f2);
            this.N(vector4f.y() + vector4f.w(), vector2f, f2);
        }
        if (bl) {
            this.y(f3 / 2.0f, vector2f, f);
        }
        if (bl2) {
            this.N(f4 / 2.0f, vector2f, f2);
        }
    }

    private void N(float f, Vector2f vector2f, float f2) {
        float f3 = this.N(f, vector2f.y, f2);
        if (!Float.isNaN(f3)) {
            vector2f.y = f3;
            ((List)this.N_0).add(new Vector2f(-1.0f, f));
        }
    }

    public void N() {
        ((List)this.N_0).clear();
    }
}

