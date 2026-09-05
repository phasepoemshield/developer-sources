/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02102
 *  minecraft.class04430
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class06541
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02102;
import minecraft.class03695;
import minecraft.class03709;
import minecraft.class04430;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class06541;

class class03727
extends class04430 {
    private static final class00392 L = class00392.L((String)"gui.abuseReport.discard.title").N(class06541.field_1067);
    private static final class00392 u = class00392.L((String)"gui.abuseReport.discard.content");
    private static final class00392 i = class00392.L((String)"gui.abuseReport.discard.return");
    private static final class00392 R = class00392.L((String)"gui.abuseReport.discard.draft");
    private static final class00392 M = class00392.L((String)"gui.abuseReport.discard.discard");
    final /* synthetic */ class03709 y;

    protected class03727(class03709 class037092) {
        this.y = class037092;
        super(L, u, u);
    }

    protected class03695 N() {
        class01885 class018852 = class01885.u().N(8);
        class018852.L().y();
        class01885 class018853 = (class01885)class018852.N((class02102)class01885.i().N(8));
        class018853.N((class02102)class05362.method_46430((class00392)i, class053622 -> this.method_25419()).N());
        class018853.N((class02102)class05362.method_46430((class00392)R, class053622 -> {
            this.y.R();
            this.field_22787.N(this.y.Z);
        }).N());
        class018852.N((class02102)class05362.method_46430((class00392)M, class053622 -> {
            this.y.Z();
            this.field_22787.N(this.y.Z);
        }).N());
        return class018852;
    }

    public boolean method_25422() {
        return false;
    }

    public void method_25419() {
        this.field_22787.N((class05096)this.y);
    }
}

