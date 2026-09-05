/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03439
 *  minecraft.class03457
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class07018
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03439;
import minecraft.class03457;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class07018;
import org.jspecify.annotations.Nullable;

public class class04141
implements class03439 {
    private static final int N = 170;
    private final class00392 y;
    private @Nullable List<class01028> L;
    private @Nullable class07018 u;
    private final @Nullable class00392 i;

    public class04141(class00392 class003922, @Nullable class00392 class003923) {
        this.y = class003922;
        this.i = class003923;
    }

    public List<class01028> N(class06202 class062022) {
        class07018 class070182 = class07018.y();
        if (this.L == null || class070182 != this.u) {
            this.L = class04141.N(class062022, this.y);
            this.u = class070182;
        }
        return this.L;
    }

    public static List<class01028> N(class06202 class062022, class00392 class003922) {
        return ((class01590)class062022.i_3).L((class05936)class003922, 170);
    }

    public static class04141 N(class00392 class003922) {
        return new class04141(class003922, class003922);
    }

    public static class04141 N(class00392 class003922, @Nullable class00392 class003923) {
        return new class04141(class003922, class003923);
    }

    public void method_37020(class03428 class034282) {
        if (this.i != null) {
            class034282.N(class03457.field_33790, this.i);
        }
    }
}

