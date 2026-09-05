/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00263
 *  minecraft.class00272
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01929
 *  minecraft.class02934
 *  minecraft.class02950
 *  minecraft.class03275
 *  minecraft.class03278
 *  minecraft.class03729
 *  minecraft.class04782
 *  minecraft.class05838
 *  minecraft.class05851
 *  minecraft.class05865
 *  minecraft.class05880
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06937
 *  minecraft.class07299
 *  minecraft.class08036
 *  minecraft.class08044
 */
package minecraft;

import java.util.List;
import java.util.Optional;
import minecraft.class00263;
import minecraft.class00272;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01929;
import minecraft.class02934;
import minecraft.class02950;
import minecraft.class03275;
import minecraft.class03278;
import minecraft.class03729;
import minecraft.class04782;
import minecraft.class04977;
import minecraft.class05838;
import minecraft.class05851;
import minecraft.class05865;
import minecraft.class05880;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06937;
import minecraft.class07299;
import minecraft.class08036;
import minecraft.class08044;

public class class04974
extends class04977 {
    public static final int N = 0;
    public static final int y = 1;
    public static final int L = 2;
    public static final int u = 3;
    public static final int n = 8;
    public static final int t = 26;
    public static final int G = 44;
    private static final int d = 98;
    public static final int l = 48;
    private final class07299 w;
    private final class00263 k;
    private final class00263 Y;
    private final class00263 Q;
    private final class05865 O = class05865.N();

    private List<class06584> P() {
        return List.of(this.j.method_5438(0), this.j.method_5438(1), this.j.method_5438(2));
    }

    public class04974(int n, class08044 class080442) {
        this(n, class080442, class05880.N);
    }

    public class04974(int n, class08044 class080442, class05880 class058802) {
        this(n, class080442, class058802, class080442.z.method_73183());
    }

    private class04974(int n, class08044 class080442, class05880 class058802, class07299 class072992) {
        super(class05851.field_22484, n, class080442, class058802, class04974.N(class072992.method_8433()));
        this.w = class072992;
        this.k = class072992.method_8433().N(class00263.y);
        this.Y = class072992.method_8433().N(class00263.L);
        this.Q = class072992.method_8433().N(class00263.u);
        this.N(this.O).N(0);
    }

    private class02934 s() {
        return new class02934(this.j.method_5438(0), this.j.method_5438(1), this.j.method_5438(2));
    }

    @Override
    public void y(class06695 class066952) {
        super.y(class066952);
        if (this.w instanceof class04782) {
            boolean bl = this.L(0).R() && this.L(1).R() && this.L(2).R() && !this.L(this.m()).R();
            this.O.N(bl ? 1 : 0);
        }
    }

    @Override
    public boolean y(class06584 class065842) {
        if (this.Y.N(class065842) && !this.L(0).R()) {
            return true;
        }
        if (this.k.N(class065842) && !this.L(1).R()) {
            return true;
        }
        return this.Q.N(class065842) && !this.L(2).R();
    }

    @Override
    public void E() {
        Optional<class03729> optional;
        class02934 class029342 = this.s();
        class07299 class072992 = this.w;
        if (class072992 instanceof class04782) {
            class04782 class047822 = (class04782)class072992;
            Optional var2 = class047822.method_64577().N(class05838.M, (class02950)class029342, (class07299)class047822);
        } else {
            optional = Optional.empty();
        }
        optional.ifPresentOrElse(class037292 -> {
            class06584 class065842 = ((class03278)class037292.y()).method_8116((class02950)class029342, (class01929)this.w.method_30349());
            this.v.N(class037292);
            this.v.method_5447(0, class065842);
        }, () -> {
            this.v.N(null);
            this.v.method_5447(0, class06584.E);
        });
    }

    public boolean N(class06584 class065842, class06937 class069372) {
        return class069372.L != this.v && super.N(class065842, class069372);
    }

    private static class03275 N(class00272 class002722) {
        class00263 class002632 = class002722.N(class00263.y);
        class00263 class002633 = class002722.N(class00263.L);
        class00263 class002634 = class002722.N(class00263.u);
        return class03275.N().N(0, 8, 48, arg_0 -> ((class00263)class002633).N(arg_0)).N(1, 26, 48, arg_0 -> ((class00263)class002632).N(arg_0)).N(2, 44, 48, arg_0 -> ((class00263)class002634).N(arg_0)).N(3, 98, 48).N();
    }

    @Override
    protected boolean N(class00500 class005002) {
        return class005002.N(class00869.Ph);
    }

    @Override
    protected void N(class08036 class080362, class06584 class065842) {
        class065842.N(class080362, class065842.c());
        this.v.N(class080362, this.P());
        this.N(0);
        this.N(1);
        this.N(2);
        this.i.N_53((class072992, class072092) -> class072992.N(1044, class072092, 0));
    }

    private void N(int n) {
        class06584 class065842 = this.j.method_5438(n);
        if (!class065842.R()) {
            class065842.B(1);
            this.j.method_5447(n, class065842);
        }
    }

    public boolean W() {
        return this.O.y() > 0;
    }
}

