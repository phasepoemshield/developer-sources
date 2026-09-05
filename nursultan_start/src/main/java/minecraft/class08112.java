/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01421
 *  minecraft.class01590
 *  minecraft.class03042
 *  minecraft.class05630
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class06959
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 *  org.joml.Quaternionfc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00392;
import minecraft.class01421;
import minecraft.class01590;
import minecraft.class03042;
import minecraft.class05630;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class06959;
import minecraft.class08142;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Quaternionfc;
import org.jspecify.annotations.Nullable;

public class class08112 {
    final List<class08142> N = new ArrayList<class08142>();
    final List<class08142> y = new ArrayList<class08142>();

    public void N(class01421 class014212, @Nullable class06889 class068892, int n, class00392 class003922, boolean bl, int n2, double d, class06959 class069592) {
        if (class068892 == null) {
            return;
        }
        class06202 class062022 = class06202.Nq();
        class014212.N();
        class014212.N(class068892.M, class068892.B + 0.5, class068892.Z);
        class014212.N((Quaternionfc)class069592.i);
        class014212.y(0.025f, -0.025f, 0.025f);
        Matrix4f matrix4f = new Matrix4f((Matrix4fc)class014212.L().N());
        float f = (float)(-((class01590)class062022.i_3).N((class05936)class003922)) / 2.0f;
        int n3 = (int)(((class05630)class062022.i_7).N(0.25f) * 255.0f) << 24;
        if (bl) {
            this.y.add(new class08142(matrix4f, f, n, class003922, class03042.y((int)n2, (int)2), -1, 0, d));
            this.N.add(new class08142(matrix4f, f, n, class003922, n2, -2130706433, n3, d));
        } else {
            this.y.add(new class08142(matrix4f, f, n, class003922, n2, -2130706433, n3, d));
        }
        class014212.y();
    }

    public void N() {
        this.y.clear();
        this.N.clear();
    }
}

