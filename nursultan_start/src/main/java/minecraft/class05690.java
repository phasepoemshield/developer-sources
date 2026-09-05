/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04086
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06613
 *  minecraft.class07310
 *  minecraft.class08394
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04086;
import minecraft.class05699;
import minecraft.class05720;
import minecraft.class05722;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06613;
import minecraft.class07310;
import minecraft.class08394;

public class class05690
extends class05699<class05690> {
    private static final class01894 y = class01894.y((String)"textures/gui/container/stats_icons.png");
    private final class04086 L;
    private final class00392 u;
    final /* synthetic */ class05722 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class05690(class05722 class057222, class03556 class035562) {
        this.N = class057222;
        this.L = (class04086)class035562.N();
        this.u = class035562.i().map(class059462 -> class00392.L((String)class059462.N().B("flat_world_preset"))).orElse(class05720.L);
    }

    private void N(class01054 class010542, int n, int n2, class06581 class065812) {
        this.N(class010542, n + 1, n2 + 1);
        class010542.y(new class06584((class07310)class065812), n + 2, n2 + 2);
    }

    void N() {
        this.N.method_25313(this);
        this.N.N.i = this.L.y();
        this.N.N.u.method_1852(class05720.N(this.N.N.i));
        this.N.N.u.method_1870(false);
    }

    private void N(class01054 class010542, int n, int n2) {
        class010542.N(class08394.Na, class05720.N, n, n2, 18, 18);
    }

    @Override
    public boolean method_25402(class06613 class066132, boolean bl) {
        this.N();
        return super.method_25402(class066132, bl);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.N(class010542, this.method_73380(), this.method_73382(), (class06581)this.L.N().N());
        class010542.y(this.N.N.field_22793, this.u, this.method_73380() + 18 + 5, this.method_73382() + 6, -1);
    }

    @Override
    public class00392 method_37006() {
        return class00392.N((String)"narrator.select", (Object[])new Object[]{this.u});
    }
}

