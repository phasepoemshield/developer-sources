/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00780
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class05699
 *  minecraft.class06613
 *  minecraft.class07018
 */
package minecraft;

import minecraft.class00392;
import minecraft.class00780;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class05371;
import minecraft.class05699;
import minecraft.class06613;
import minecraft.class07018;

class class05350
extends class05699<class05350> {
    final class03529<class00780> N;
    final class00392 y;
    final /* synthetic */ class05371 L;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05350(class05371 class053712, class03529 class035292) {
        this.L = class053712;
        this.N = class035292;
        class01894 class018942 = class035292.B().N();
        String string = class018942.B("biome");
        this.y = class07018.y().N(string) ? class00392.L((String)string) : class00392.y((String)class018942.toString());
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.L.method_25313(this);
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class010542.y(this.L.N.field_22793, this.y, this.method_73380() + 5, this.method_73382() + 2, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.y});
    }
}

