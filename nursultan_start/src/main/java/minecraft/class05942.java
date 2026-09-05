/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04452
 *  minecraft.class05096
 *  minecraft.class06202
 *  minecraft.class07536
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04452;
import minecraft.class05096;
import minecraft.class05936;
import minecraft.class05978;
import minecraft.class06202;
import minecraft.class07536;

public class class05942
extends class05978 {
    private static final class00392 N = class00392.L((String)"selectWorld.loading_list");
    private final class06202 y;

    public class05942(class06202 class062022) {
        this.y = class062022;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        int n3 = (((class05096)this.y.v_3).field_22789 - ((class01590)this.y.i_3).N((class05936)N)) / 2;
        int n4 = this.method_73382();
        int n5 = this.method_73384();
        Objects.requireNonNull((class01590)this.y.i_3);
        int n6 = n4 + (n5 - 9) / 2;
        class010542.y((class01590)this.y.i_3, N, n3, n6, -1);
        String string = class04452.N((long)class07536.L());
        int n7 = (((class05096)this.y.v_3).field_22789 - ((class01590)this.y.i_3).y(string)) / 2;
        Objects.requireNonNull((class01590)this.y.i_3);
        int n8 = n6 + 9;
        class010542.y((class01590)this.y.i_3, string, n7, n8, -8355712);
    }

    public class00392 method_37006() {
        return N;
    }
}

