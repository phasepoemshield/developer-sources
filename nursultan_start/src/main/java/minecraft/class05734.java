/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05220
 *  minecraft.class05936
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05220;
import minecraft.class05732;
import minecraft.class05762;
import minecraft.class05936;

class class05734
extends class05762 {
    private final class01590 N;

    public class05734(class01590 class015902) {
        this.N = class015902;
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y(this.N, class05732.N, this.method_73380(), this.method_73382(), -1);
        class010542.y(this.N, class05732.y, this.method_73389() - this.N.N((class05936)class05732.y), this.method_73382(), -1);
    }

    @Override
    public class00392 method_37006() {
        return class05220.N((class00392[])new class00392[]{class05732.N, class05732.y});
    }
}

