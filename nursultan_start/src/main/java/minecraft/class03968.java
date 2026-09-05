/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02233
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class03986
 *  minecraft.class04995
 *  minecraft.class05363
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class02233;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class03970;
import minecraft.class03986;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07438;

public class class03968
extends class03986 {
    public class03556<class07084> L() {
        return class07047.P;
    }

    public float N(class07438 class074382, float f, float f2) {
        class07055 class070552 = class074382.method_6112(this.L());
        if (class070552 != null) {
            f = class070552.N(19) ? Math.max((float)class070552.u() / 20.0f, f) : 1.0f;
        }
        return f;
    }

    public void N(class03970 class039702, class05363 class053632, class03448 class034482, float f, class02233 class022332) {
        class07049 class070492 = class053632.B();
        if (class070492 instanceof class07438 && (class070492 = ((class07438)class070492).method_6112(this.L())) != null) {
            float f2 = class070492.y() ? 5.0f : class04995.B((float)Math.min(1.0f, (float)class070492.u() / 20.0f), (float)f, (float)5.0f);
            class039702.N = f2 * 0.25f;
            class039702.L = f2;
            class039702.i = f2 * 0.8f;
            class039702.R = f2 * 0.8f;
        }
    }
}

