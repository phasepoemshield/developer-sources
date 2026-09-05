/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class02233
 *  minecraft.class03448
 *  minecraft.class03970
 *  minecraft.class04453
 *  minecraft.class04798
 *  minecraft.class05363
 *  minecraft.class07049
 *  minecraft.class09005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00608;
import minecraft.class02233;
import minecraft.class03448;
import minecraft.class03970;
import minecraft.class04453;
import minecraft.class04798;
import minecraft.class05363;
import minecraft.class07049;
import minecraft.class09005;
import org.jspecify.annotations.Nullable;

public class class09043
extends class09005 {
    public int N(class03448 class034482, class05363 class053632, int n, float f) {
        return (Integer)class053632.U().N(class00608.R, f);
    }

    public boolean N(@Nullable class04798 class047982, class07049 class070492) {
        return class047982 == class04798.field_27886;
    }

    public void N(class03970 class039702, class05363 class053632, class03448 class034482, float f, class02233 class022332) {
        float f2 = class022332.N(false);
        class039702.N = ((Float)class053632.U().N(class00608.M, f2)).floatValue();
        class039702.L = ((Float)class053632.U().N(class00608.B, f2)).floatValue();
        class07049 class070492 = class053632.B();
        if (class070492 instanceof class04453) {
            class04453 class044532 = (class04453)class070492;
            class039702.L *= Math.max(0.25f, class044532.j());
        }
        class039702.i = class039702.L;
        class039702.R = class039702.L;
    }
}

