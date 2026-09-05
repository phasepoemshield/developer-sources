/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01235
 *  minecraft.class04206
 *  minecraft.class05724
 *  minecraft.class06202
 *  minecraft.class07078
 */
package minecraft;

import java.util.Objects;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01235;
import minecraft.class04206;
import minecraft.class04610;
import minecraft.class04636;
import minecraft.class05724;
import minecraft.class06202;
import minecraft.class07078;

class class04607
extends class05724<class04636> {
    final /* synthetic */ class04610 N;

    public class04607(class04610 class046102, class06202 class062022) {
        this.N = class046102;
        int n = class046102.field_22789;
        int n2 = class046102.M.u();
        Objects.requireNonNull(class04610.Z(class046102));
        super(class062022, n, n2, 33, 36);
        for (class07078 var4 : class04206.M) {
            if (class046102.B.N(class01235.M.y((Object)var4)) <= 0 && class046102.B.N(class01235.B.y((Object)var4)) <= 0) continue;
            this.method_25321((class01202)new class04636(this, var4));
        }
    }

    public int method_25322() {
        return 280;
    }

    protected void method_57715(class01054 class010542) {
    }

    protected void method_57713(class01054 class010542) {
    }
}

