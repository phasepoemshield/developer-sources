/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00277
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02411
 *  minecraft.class02763
 *  minecraft.class03283
 *  minecraft.class05306
 *  minecraft.class06923
 *  minecraft.class07485
 *  minecraft.class08044
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00277;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02411;
import minecraft.class02763;
import minecraft.class03283;
import minecraft.class05306;
import minecraft.class06923;
import minecraft.class07485;
import minecraft.class08044;
import minecraft.class08394;

public class class05984
extends class00277<class07485> {
    private static final class01894 N = class01894.y((String)"textures/gui/container/crafting_table.png");

    public class05984(class07485 class074852, class08044 class080442, class00392 class003922) {
        super((class06923)class074852, (class05306)new class02411((class02763)class074852), class080442, class003922);
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = this.T;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, N, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
    }

    protected class03283 N() {
        return new class03283(this.T + 5, this.field_22790 / 2 - 49);
    }

    public void method_25426() {
        super.method_25426();
        this.z = 29;
    }
}

