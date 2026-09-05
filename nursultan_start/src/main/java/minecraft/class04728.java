/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04736;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

class class04728
extends class05362 {
    private static final class01894 y = class01894.y((String)"widget/slot_frame");
    private static final int L = 60;
    private static final int u = 2;
    private static final int i = 56;
    private final class01894 R;
    final /* synthetic */ class04736 N;

    class04728(class04736 class047362, class01590 class015902, class00392 class003922, class01894 class018942, class05361 class053612) {
        this.N = class047362;
        Objects.requireNonNull(class015902);
        super(0, 0, 60, 60 + 9, class003922, class053612, field_40754);
        this.R = class018942;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        boolean bl = this.method_25367();
        int n3 = -1;
        if (bl) {
            n3 = class02566.N((float)1.0f, (float)0.56f, (float)0.56f, (float)0.56f);
        }
        int n4 = this.method_46426();
        int n5 = this.method_46427();
        class010542.N(class08394.Na, this.R, n4 + 2, n5 + 2, 0.0f, 0.0f, 56, 56, 56, 56, 56, 56, n3);
        class010542.N(class08394.Na, y, n4, n5, 60, 60, n3);
        int n6 = bl ? -6250336 : -1;
        class010542.N(class04736.y(this.N), this.method_25369(), n4 + 28, n5 - 14, n6);
    }
}

