/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00040
 *  minecraft.class00044
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 *  minecraft.class09033
 */
package minecraft;

import minecraft.class00040;
import minecraft.class00044;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;
import minecraft.class09033;

public class class06005
extends class05362 {
    private static final class01894 N = class01894.y((String)"widget/page_forward_highlighted");
    private static final class01894 y = class01894.y((String)"widget/page_forward");
    private static final class01894 L = class01894.y((String)"widget/page_backward_highlighted");
    private static final class01894 u = class01894.y((String)"widget/page_backward");
    private static final class00392 i = class00392.L((String)"book.page_button.next");
    private static final class00392 R = class00392.L((String)"book.page_button.previous");
    private final boolean M;
    private final boolean B;

    public boolean M() {
        return false;
    }

    public class06005(int n, int n2, boolean bl, class05361 class053612, boolean bl2) {
        super(n, n2, 23, 13, bl ? i : R, class053612, field_40754);
        this.M = bl;
        this.B = bl2;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        class01894 class018942 = this.M ? (this.method_25367() ? N : y) : (this.method_25367() ? L : u);
        class010542.N(class08394.Na, class018942, this.method_46426(), this.method_46427(), 23, 13);
    }

    public void method_25354(class09033 class090332) {
        if (this.B) {
            class090332.N((class00044)class00040.N((class04891)class04909.LV, (float)1.0f));
        }
    }
}

