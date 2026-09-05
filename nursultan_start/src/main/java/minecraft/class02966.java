/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03931
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class08394
 *  minecraft.class08627
 */
package minecraft;

import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03931;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class08394;
import minecraft.class08627;

public class class02966 {
    public static final class01894 N = class01894.y((String)"textures/gui/title/background/panorama_overlay.png");
    private final class06202 y;
    private final class03931 L;
    private float u;

    public class02966(class03931 class039312) {
        this.L = class039312;
        this.y = class06202.Nq();
    }

    public void N(class01054 class010542, int n, int n2, boolean bl) {
        if (bl) {
            float f = (float)((double)this.y.NK().y() * (Double)((class05630)this.y.i_7).w().method_41753());
            this.u = class02966.N(this.u + f * 0.1f, 360.0f);
        }
        this.L.N(this.y, 10.0f, -this.u);
        class010542.N(class08394.Na, N, 0, 0, 0.0f, 0.0f, n, n2, 16, 128, 16, 128);
    }

    public void N(class08627 class086272) {
        this.L.N(class086272);
    }

    private static float N(float f, float f2) {
        return f > f2 ? f - f2 : f;
    }
}

