/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class06366
 *  minecraft.class06839
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class05191;
import minecraft.class05222;
import minecraft.class06366;
import minecraft.class06839;

public class class05206
extends class05222 {
    private final class06366<Boolean> y;
    final /* synthetic */ class05191 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05206(class05191 class051912, class00392 class003922, List list, String string, class06839 class068392) {
        this.N = class051912;
        super(class051912, list, class003922);
        this.y = class06366.N((boolean)((Boolean)class051912.y.N(class068392))).N().N_57(class063662 -> class063662.L().i("\n").i(string)).N(10, 5, 44, 20, class003922, (class063662, bl) -> this.N.y.N(class068392, bl, null));
        this.field_25630.add(this.y);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.method_29989(class010542, this.method_73382(), this.method_73380());
        this.y.method_46421(this.method_73389() - 45);
        this.y.method_46419(this.method_73382());
        this.y.method_25394(class010542, n, n2, f);
    }
}

