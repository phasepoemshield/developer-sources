/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class02071
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05096
 */
package minecraft;

import java.util.List;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class02071;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04992;
import minecraft.class05096;

public class class05014
extends class04992 {
    private final class05096 N;
    private final int y;
    private final class02071 L;

    protected class05014(class05096 class050962, class00392 class003922, int n) {
        this.N = class050962;
        this.y = n;
        this.L = new class02071(class003922, class050962.method_64506());
    }

    public List<? extends class04654> method_25396() {
        return List.of(this.L);
    }

    public List<? extends class03434> method_37025() {
        return List.of(this.L);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.L.y(this.N.field_22789 / 2 - 155, this.method_73382() + this.y);
        this.L.method_25394(class010542, n, n2, f);
    }
}

