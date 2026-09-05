/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class00937
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class03597
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05482
 *  minecraft.class05630
 *  minecraft.class06220
 *  minecraft.class07536
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00580;
import minecraft.class00937;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class03597;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class05482;
import minecraft.class05630;
import minecraft.class06220;
import minecraft.class07536;
import minecraft.class08394;

public class class05351
extends class05096 {
    private static final class01894 N = class01894.y((String)"textures/gui/demo_background.png");
    private static final int y = 256;
    private static final int L = 256;
    private static final int u = -14737633;
    private class05482 i = class05482.N;
    private class05482 R = class05482.N;

    public class05351() {
        super((class00392)class00392.L((String)"demo.help.title"));
    }

    private class00392 N(class05216 class052162) {
        return class052162.R().y(-11579569);
    }

    public void method_25426() {
        int n = -16;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"demo.help.buy"), class053622 -> {
            class053622.field_22763 = false;
            class07536.m().N(class03597.R);
        }).N(this.field_22789 / 2 - 116, this.field_22790 / 2 + 62 + -16, 114, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"demo.help.later"), class053622 -> {
            this.field_22787.N(null);
            ((class06220)this.field_22787.L_2).Z();
        }).N(this.field_22789 / 2 + 2, this.field_22790 / 2 + 62 + -16, 114, 20).N());
        class05630 class056302 = (class05630)this.field_22787.i_7;
        this.i = class05482.N((class01590)this.field_22793, (class00392[])new class00392[]{this.N(class00392.N((String)"demo.help.movementShort", (Object[])new Object[]{class056302.n.m(), class056302.t.m(), class056302.G.m(), class056302.l.m()})), this.N(class00392.L((String)"demo.help.movementMouse")), this.N(class00392.N((String)"demo.help.jump", (Object[])new Object[]{class056302.d.m()})), this.N(class00392.N((String)"demo.help.inventory", (Object[])new Object[]{class056302.Y.m()}))});
        this.R = class05482.N((class01590)this.field_22793, (class00392)class00392.L((String)"demo.help.fullWrapped").R().y(-14737633), (int)218);
    }

    public void method_25420(class01054 class010542, int n, int n2, float f) {
        super.method_25420(class010542, n, n2, f);
        int n3 = (this.field_22789 - 248) / 2;
        int n4 = (this.field_22790 - 166) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, 248, 166, 256, 256);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        int n3 = (this.field_22789 - 248) / 2 + 10;
        int n4 = (this.field_22790 - 166) / 2 + 8;
        class00580 class005802 = class010542.B();
        class010542.N(this.field_22793, this.field_22785, n3, n4, -14737633, false);
        n4 = this.i.N(class00937.field_62009, n3, n4 + 12, 12, class005802);
        Objects.requireNonNull(this.field_22793);
        this.R.N(class00937.field_62009, n3, n4 + 20, 9, class005802);
    }
}

