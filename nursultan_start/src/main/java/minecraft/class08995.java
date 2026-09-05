/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02233
 *  minecraft.class03448
 *  minecraft.class03970
 *  minecraft.class04798
 *  minecraft.class05363
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02233;
import minecraft.class03448;
import minecraft.class03970;
import minecraft.class04798;
import minecraft.class05363;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class09005;
import org.jspecify.annotations.Nullable;

public class class08995
extends class09005 {
    private static final int N = -6743808;

    @Override
    public boolean N(@Nullable class04798 class047982, class07049 class070492) {
        return class047982 == class04798.field_27885;
    }

    @Override
    public void N(class03970 class039702, class05363 class053632, class03448 class034482, float f, class02233 class022332) {
        if (class053632.B().method_7325()) {
            class039702.N = -8.0f;
            class039702.L = f * 0.5f;
        } else {
            class07049 class070492 = class053632.B();
            if (class070492 instanceof class07438 && ((class07438)class070492).method_6059(class07047.E)) {
                class039702.N = 0.0f;
                class039702.L = 5.0f;
            } else {
                class039702.N = 0.25f;
                class039702.L = 1.0f;
            }
        }
        class039702.i = class039702.L;
        class039702.R = class039702.L;
    }

    @Override
    public int N(class03448 class034482, class05363 class053632, int n, float f) {
        return -6743808;
    }
}

