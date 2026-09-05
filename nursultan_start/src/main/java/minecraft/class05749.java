/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01054
 *  minecraft.class01627
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05936
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06613
 *  minecraft.class07310
 *  minecraft.class08394
 */
package minecraft;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01054;
import minecraft.class01627;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05732;
import minecraft.class05737;
import minecraft.class05762;
import minecraft.class05936;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06613;
import minecraft.class07310;
import minecraft.class08394;

class class05749
extends class05762 {
    final class01627 N;
    private final int L;
    final /* synthetic */ class05732 y;

    public class05749(class05732 class057322, class01627 class016272, int n) {
        this.y = class057322;
        this.N = class016272;
        this.L = n;
    }

    private void N(class01054 class010542, int n, int n2, class06584 class065842) {
        this.N(class010542, n + 1, n2 + 1);
        if (!class065842.R()) {
            class010542.y(class065842, n + 2, n2 + 2);
        }
    }

    private void N(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, class05737.N, n, n2, 18, 18);
    }

    private class06584 N(class00500 class005002) {
        class06581 class065812 = class005002.i().B();
        if (class065812 == class06570.N) {
            if (class005002.N(class00869.K)) {
                class065812 = class06570.jE;
            } else if (class005002.N(class00869.V)) {
                class065812 = class06570.jW;
            }
        }
        return new class06584((class07310)class065812);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        this.y.method_25313(this);
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        class00500 class005002 = this.N.y();
        class06584 class065842 = this.N(class005002);
        this.N(class010542, this.method_73380(), this.method_73382(), class065842);
        int n3 = this.method_73385();
        Objects.requireNonNull(this.y.L.field_22793);
        int n4 = n3 - 4;
        class010542.y(this.y.L.field_22793, class065842.d(), this.method_73380() + 18 + 5, n4, -1);
        class05216 class052162 = this.L == 0 ? class00392.N((String)"createWorld.customize.flat.layer.top", (Object[])new Object[]{this.N.N()}) : (this.L == this.y.L.L.i().size() - 1 ? class00392.N((String)"createWorld.customize.flat.layer.bottom", (Object[])new Object[]{this.N.N()}) : class00392.N((String)"createWorld.customize.flat.layer", (Object[])new Object[]{this.N.N()}));
        class010542.y(this.y.L.field_22793, (class00392)class052162, this.method_73389() - this.y.L.field_22793.N((class05936)class052162), n4, -1);
    }

    @Override
    public class00392 method_37006() {
        class06584 class065842 = this.N(this.N.y());
        if (!class065842.R()) {
            return class05220.N((class00392[])new class00392[]{class00392.N((String)"narrator.select", (Object[])new Object[]{class065842.d()}), class05732.y, class00392.y((String)String.valueOf(this.N.N()))});
        }
        return class05220.N;
    }
}

