/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01202
 *  minecraft.class01590
 *  minecraft.class05699
 *  minecraft.class06601
 *  minecraft.class06613
 *  minecraft.class08430
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01202;
import minecraft.class01590;
import minecraft.class05699;
import minecraft.class06279;
import minecraft.class06324;
import minecraft.class06601;
import minecraft.class06613;
import minecraft.class08430;

public class class06280
extends class05699<class06280> {
    final String N;
    private final class00392 L;
    final /* synthetic */ class06324 y;

    public class06280(class06324 class063242, String string, class08430 class084302) {
        this.y = class063242;
        this.N = string;
        this.L = class084302.N();
    }

    private void N() {
        this.y.method_25313((class01202)this);
    }

    public boolean method_25404(class06601 class066012) {
        if (class066012.L()) {
            this.N();
            this.y.N.N();
            return true;
        }
        return super.method_25404(class066012);
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.N();
        if (bl) {
            this.y.N.N();
        }
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class01590 class015902 = class06279.N(this.y.N);
        int n3 = class06324.N(this.y) / 2;
        int n4 = this.method_73385();
        Objects.requireNonNull(class06279.y(this.y.N));
        class010542.N(class015902, this.L, n3, n4 - 4, -1);
    }

    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.L});
    }
}

