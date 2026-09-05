/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class08394
 */
package Nursultan;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class08394;

public class class11320
extends class05362 {
    private static String[] y;
    public Object N_0;

    public class11320(int n, int n2, int n3, int n4, class01894 class018942, class05361 class053612) {
        super(n, n2, n3, n4, (class00392)class00392.y((String)y[0]), class053612, field_40754);
        this.y();
        this.N_0 = class018942;
    }

    static {
        class11320.R();
    }

    private void y() {
    }

    private static void R() {
        y = new String[1];
        class11320.y[0] = "";
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.y();
        class010542.N(class08394.Na, (class01894)this.N_0, this.method_46426(), this.method_46427(), 0.0f, 0.0f, this.field_22758, this.field_22759, 16, 16, -1);
    }
}

