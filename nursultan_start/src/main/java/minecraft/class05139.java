/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01854
 *  minecraft.class01883
 *  minecraft.class01894
 *  minecraft.class05361
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01854;
import minecraft.class01883;
import minecraft.class01894;
import minecraft.class05361;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

class class05139
extends class01854 {
    private static final class01894[] u = new class01894[]{class01894.y((String)"notification/1"), class01894.y((String)"notification/2"), class01894.y((String)"notification/3"), class01894.y((String)"notification/4"), class01894.y((String)"notification/5"), class01894.y((String)"notification/more")};
    private static final int i = Integer.MAX_VALUE;
    private static final int R = 20;
    private static final int M = 14;
    private int B;

    public class05139(class00392 class003922, class01894 class018942, class05361 class053612, @Nullable class00392 class003923) {
        super(20, 20, class003922, 14, 14, new class01883(class018942), class053612, class003923, null);
    }

    int y() {
        return this.B;
    }

    private void N(class01054 class010542) {
        class010542.N(class08394.Na, u[Math.min(this.B, 6) - 1], this.method_46426() + this.method_25368() - 5, this.method_46427() - 3, 8, 8);
    }

    public void N(int n) {
        this.B = n;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        super.method_75752(class010542, n, n2, f);
        if (this.field_22763 && this.B != 0) {
            this.N(class010542);
        }
    }
}

