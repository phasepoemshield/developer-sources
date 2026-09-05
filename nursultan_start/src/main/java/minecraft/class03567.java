/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00580
 *  minecraft.class01054
 *  minecraft.class01065
 *  minecraft.class01590
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class03241
 *  minecraft.class03271
 *  minecraft.class03428
 *  minecraft.class03457
 *  minecraft.class05096
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06466
 *  minecraft.class06478
 *  minecraft.class08394
 *  minecraft.class09033
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00580;
import minecraft.class01054;
import minecraft.class01065;
import minecraft.class01590;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class03241;
import minecraft.class03271;
import minecraft.class03428;
import minecraft.class03457;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06466;
import minecraft.class06478;
import minecraft.class08394;
import minecraft.class09033;

public class class03567
extends class06466 {
    private static final class01883 N = new class01883(class01894.y((String)"widget/tab_selected"), class01894.y((String)"widget/tab"), class01894.y((String)"widget/tab_selected_highlighted"), class01894.y((String)"widget/tab_highlighted"));
    private static final int y = 3;
    private static final int L = 1;
    private static final int u = 1;
    private static final int i = 4;
    private static final int R = 2;
    private final class03271 M;
    private final class03241 B;

    public boolean L() {
        return this.M.N() == this.B;
    }

    public class03567(class03271 class032712, class03241 class032412, int n, int n2) {
        super(0, 0, n, n2, class032412.method_48610());
        this.M = class032712;
        this.B = class032412;
    }

    public class03241 y() {
        return this.B;
    }

    private void N(class00580 class005802) {
        int n = this.method_46426() + 1;
        int n2 = this.method_46427() + (this.L() ? 0 : 3);
        int n3 = this.method_46426() + this.method_25368() - 1;
        int n4 = this.method_46427() + this.method_25364();
        class005802.N(this.method_25369(), n, n3, n2, n4);
    }

    protected void N(class01054 class010542, int n, int n2, int n3, int n4) {
        class05096.method_57737((class01054)class010542, (class01894)class05096.field_49511, (int)n, (int)n2, (float)0.0f, (float)0.0f, (int)(n3 - n), (int)(n4 - n2));
    }

    private void N(class01054 class010542, class01590 class015902, int n) {
        int n2 = Math.min(class015902.N((class05936)this.method_25369()), this.method_25368() - 4);
        int n3 = this.method_46426() + (this.method_25368() - n2) / 2;
        int n4 = this.method_46427() + this.method_25364() - 2;
        class010542.N(n3, n4, n3 + n2, n4 + 1, n);
    }

    protected void method_47399(class03428 class034282) {
        class034282.N(class03457.field_33788, (class00392)class00392.N((String)"gui.narrate.tab", (Object[])new Object[]{this.B.method_48610()}));
        class034282.N(class03457.field_33790, this.B.method_71245());
    }

    public void method_25354(class09033 class090332) {
    }

    public void method_48579(class01054 class010542, int n, int n2, float f) {
        int n3;
        class010542.N(class08394.Na, N.N(this.L(), this.method_25367()), this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
        class01590 class015902 = (class01590)class06202.Nq().i_3;
        int n4 = n3 = this.field_22763 ? -1 : -6250336;
        if (this.L()) {
            this.N(class010542, this.method_46426() + 2, this.method_46427() + 2, this.method_55442() - 2, this.method_55443());
            this.N(class010542, class015902, n3);
        }
        this.N(class010542.N((class06478)this, class01065.field_63850));
        this.method_76256(class010542);
    }
}

