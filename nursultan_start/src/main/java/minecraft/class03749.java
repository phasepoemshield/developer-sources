/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02057
 *  minecraft.class02071
 *  minecraft.class02077
 *  minecraft.class02102
 *  minecraft.class03255
 *  minecraft.class03409
 *  minecraft.class03724
 *  minecraft.class03743
 *  minecraft.class03948
 *  minecraft.class04141
 *  minecraft.class04230
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05472
 *  minecraft.class06478
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02057;
import minecraft.class02071;
import minecraft.class02077;
import minecraft.class02102;
import minecraft.class03255;
import minecraft.class03409;
import minecraft.class03724;
import minecraft.class03743;
import minecraft.class03948;
import minecraft.class04141;
import minecraft.class04230;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05472;
import minecraft.class06478;

public class class03749
extends class05096 {
    private static final class00392 N = class00392.L((String)"gui.abuseReport.title");
    private static final class00392 y = class00392.L((String)"gui.abuseReport.message");
    private static final class00392 L = class00392.L((String)"gui.abuseReport.type.chat");
    private static final class00392 u = class00392.L((String)"gui.abuseReport.type.skin");
    private static final class00392 i = class00392.L((String)"gui.abuseReport.type.name");
    private static final int R = 6;
    private final class05096 M;
    private final class03409 B;
    private final class05472 Z;
    private final class01885 z = class01885.u().N(6);

    public class03749(class05096 class050962, class03409 class034092, class05472 class054722) {
        super(N);
        this.M = class050962;
        this.B = class034092;
        this.Z = class054722;
    }

    public void method_25426() {
        this.z.L().y();
        this.z.N((class02102)new class02071(this.field_22785, this.field_22793), this.z.y().i(6));
        this.z.N((class02102)new class04230(y, this.field_22793).N(true), this.z.y().i(6));
        class05362 class053623 = (class05362)this.z.N((class02102)class05362.method_46430((class00392)L, class053622 -> this.field_22787.N((class05096)new class03948(this.M, this.B, this.Z.y()))).N());
        if (!this.Z.R()) {
            class053623.field_22763 = false;
            class053623.method_47400(class04141.N((class00392)class00392.L((String)"gui.socialInteractions.tooltip.report.not_reportable")));
        } else if (!this.Z.i()) {
            class053623.field_22763 = false;
            class053623.method_47400(class04141.N((class00392)class00392.N((String)"gui.socialInteractions.tooltip.report.no_messages", (Object[])new Object[]{this.Z.N()})));
        }
        this.z.N((class02102)class05362.method_46430((class00392)u, class053622 -> this.field_22787.N((class05096)new class03724(this.M, this.B, this.Z.y(), this.Z.L()))).N());
        this.z.N((class02102)class05362.method_46430((class00392)i, class053622 -> this.field_22787.N((class05096)new class03743(this.M, this.B, this.Z.y(), this.Z.N()))).N());
        this.z.N((class02102)class02057.y((int)20));
        this.z.N((class02102)class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N());
        this.z.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
        this.method_48640();
    }

    public void method_48640() {
        this.z.N();
        class02077.N((class02102)this.z, (class03255)this.method_48202());
    }

    public void method_25419() {
        this.field_22787.N(this.M);
    }

    public class00392 method_25435() {
        return class05220.N((class00392[])new class00392[]{super.method_25435(), y});
    }
}

