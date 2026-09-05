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

public class class11310
extends class05362 {
    public Object N_0;
    public Object N_1;
    public Object N_2;

    public class11310(int n, int n2, int n3, int n4, class01894 class018942, int n5, int n6, class05361 class053612) {
        super(n, n2, n3, n4, (class00392)class00392.i(), class053612, field_40754);
        this.R();
        this.N_0 = class018942;
        this.N_1 = n5;
        this.N_2 = n6;
    }

    private void R() {
        this.N_1 = 0;
        this.N_2 = 0;
    }

    public void method_75752(class01054 class010542, int n, int n2, float f) {
        this.R();
        this.method_75794(class010542);
        int n3 = (Integer)this.N_1 / 2;
        int n4 = (Integer)this.N_2 / 2;
        int n5 = this.method_46426() + (this.field_22758 - n3) / 2;
        int n6 = this.method_46427() + (this.field_22759 - n4) / 2;
        class010542.N(class08394.Na, (class01894)this.N_0, n5, n6, 0.0f, 0.0f, n3, n4, ((Integer)this.N_1).intValue(), ((Integer)this.N_2).intValue(), ((Integer)this.N_1).intValue(), ((Integer)this.N_2).intValue(), -1);
    }
}

