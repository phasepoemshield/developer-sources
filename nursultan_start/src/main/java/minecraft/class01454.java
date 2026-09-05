/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class00419
 *  minecraft.class01054
 *  minecraft.class01480
 *  minecraft.class01894
 *  minecraft.class03556
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07084
 *  minecraft.class07310
 *  minecraft.class07501
 *  minecraft.class07508
 *  minecraft.class08044
 *  minecraft.class08394
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import minecraft.class00392;
import minecraft.class00419;
import minecraft.class01054;
import minecraft.class01433;
import minecraft.class01438;
import minecraft.class01450;
import minecraft.class01457;
import minecraft.class01462;
import minecraft.class01463;
import minecraft.class01480;
import minecraft.class01894;
import minecraft.class03556;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07084;
import minecraft.class07310;
import minecraft.class07501;
import minecraft.class07508;
import minecraft.class08044;
import minecraft.class08394;
import org.jspecify.annotations.Nullable;

public class class01454
extends class01463<class07501> {
    private static final class01894 d = class01894.y((String)"textures/gui/container/beacon.png");
    static final class01894 N = class01894.y((String)"container/beacon/button_disabled");
    static final class01894 y = class01894.y((String)"container/beacon/button_selected");
    static final class01894 L = class01894.y((String)"container/beacon/button_highlighted");
    static final class01894 u = class01894.y((String)"container/beacon/button");
    static final class01894 n = class01894.y((String)"container/beacon/confirm");
    static final class01894 t = class01894.y((String)"container/beacon/cancel");
    private static final class00392 w = class00392.L((String)"block.minecraft.beacon.primary");
    private static final class00392 k = class00392.L((String)"block.minecraft.beacon.secondary");
    private final List<class01450> Y = Lists.newArrayList();
    @Nullable class03556<class07084> G;
    @Nullable class03556<class07084> l;

    static /* synthetic */ class06202 L(class01454 class014542) {
        return class014542.field_22787;
    }

    public class01454(class07501 class075012, class08044 class080442, class00392 class003922) {
        super(class075012, class080442, class003922);
        this.B = 230;
        this.Z = 219;
        class075012.N((class07508)new class01457(this, class075012));
    }

    @Override
    protected void u(class01054 class010542, int n, int n2) {
        class010542.N(this.field_22793, w, 62, 10, -2039584);
        class010542.N(this.field_22793, k, 169, 10, -2039584);
    }

    @Override
    public void u() {
        super.u();
        this.N();
    }

    static /* synthetic */ class06202 y(class01454 class014542) {
        return class014542.field_22787;
    }

    static /* synthetic */ class06202 N(class01454 class014542) {
        return class014542.field_22787;
    }

    private <T extends class06478> void N(T t) {
        this.method_37063((class04654)t);
        this.Y.add((class01450)t);
    }

    @Override
    protected void N(class01054 class010542, float f, int n, int n2) {
        int n3 = (this.field_22789 - this.B) / 2;
        int n4 = (this.field_22790 - this.Z) / 2;
        class010542.N(class08394.Na, d, n3, n4, 0.0f, 0.0f, this.B, this.Z, 256, 256);
        class010542.N(new class06584((class07310)class06570.TE), n3 + 20, n4 + 109);
        class010542.N(new class06584((class07310)class06570.Ty), n3 + 41, n4 + 109);
        class010542.N(new class06584((class07310)class06570.TN), n3 + 41 + 22, n4 + 109);
        class010542.N(new class06584((class07310)class06570.TU), n3 + 42 + 44, n4 + 109);
        class010542.N(new class06584((class07310)class06570.TM), n3 + 42 + 66, n4 + 109);
    }

    void N() {
        int n = ((class07501)this.m).E();
        this.Y.forEach(class014502 -> class014502.N(n));
    }

    @Override
    public void method_25426() {
        class03556 class035562;
        class01462 class014622;
        int n;
        int n2;
        int n3;
        int n4;
        super.method_25426();
        this.Y.clear();
        for (n4 = 0; n4 <= 2; ++n4) {
            n3 = ((List)class00419.N.get(n4)).size();
            n2 = n3 * 22 + (n3 - 1) * 2;
            for (n = 0; n < n3; ++n) {
                class03556 var5 = (class03556)((List)class00419.N.get(n4)).get(n);
                class014622 = new class01462(this, this.T + 76 + n * 24 - n2 / 2, this.b + 22 + n4 * 25, var5, true, n4);
                class014622.field_22763 = false;
                this.N(class014622);
            }
        }
        n4 = 3;
        n3 = ((List)class00419.N.get(3)).size() + 1;
        n2 = n3 * 22 + (n3 - 1) * 2;
        for (n = 0; n < n3 - 1; ++n) {
            class035562 = (class03556)((List)class00419.N.get(3)).get(n);
            class014622 = new class01462(this, this.T + 167 + n * 24 - n2 / 2, this.b + 47, class035562, false, 3);
            class014622.field_22763 = false;
            this.N(class014622);
        }
        class03556 var4 = (class03556)((List)class00419.N.get(0)).get(0);
        class035562 = new class01480(this, this.T + 167 + (n3 - 1) * 24 - n2 / 2, this.b + 47, var4);
        class035562.field_22764 = false;
        this.N(class035562);
        this.N(new class01433(this, this.T + 164, this.b + 107));
        this.N(new class01438(this, this.T + 190, this.b + 107));
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.a_(class010542, n, n2);
    }
}

