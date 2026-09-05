/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09469
 *  com.google.common.collect.ImmutableList
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class05096
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06366
 *  minecraft.class06601
 *  minecraft.class06993
 *  minecraft.class07111
 *  minecraft.class07209
 *  minecraft.class07253
 *  minecraft.class07271
 *  minecraft.class07819
 *  minecraft.class08070
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class09469;
import com.google.common.collect.ImmutableList;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05096;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06366;
import minecraft.class06601;
import minecraft.class06993;
import minecraft.class07111;
import minecraft.class07209;
import minecraft.class07253;
import minecraft.class07271;
import minecraft.class07819;
import minecraft.class08070;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01359
extends class05096 {
    private static final class00392 N = class00392.L((String)"structure_block.structure_name");
    private static final class00392 y = class00392.L((String)"structure_block.position");
    private static final class00392 L = class00392.L((String)"structure_block.size");
    private static final class00392 u = class00392.L((String)"structure_block.integrity");
    private static final class00392 i = class00392.L((String)"structure_block.custom_data");
    private static final class00392 R = class00392.L((String)"structure_block.include_entities");
    private static final class00392 M = class00392.L((String)"structure_block.strict");
    private static final class00392 B = class00392.L((String)"structure_block.detect_size");
    private static final class00392 Z = class00392.L((String)"structure_block.show_air");
    private static final class00392 z = class00392.L((String)"structure_block.show_boundingbox");
    private static final ImmutableList<class08070> U = ImmutableList.copyOf((Object[])class08070.values());
    private static final ImmutableList<class08070> E = (ImmutableList)U.stream().filter(class080702 -> class080702 != class08070.field_12696).collect(ImmutableList.toImmutableList());
    private final class07253 W;
    private class07111 m = class07111.field_11302;
    private class06993 P = class06993.field_11467;
    private class08070 s = class08070.field_12696;
    private boolean T;
    private boolean b;
    private boolean j;
    private boolean v;
    private class04927 n;
    private class04927 t;
    private class04927 G;
    private class04927 l;
    private class04927 d;
    private class04927 w;
    private class04927 k;
    private class04927 Y;
    private class04927 Q;
    private class04927 O;
    private class05362 g;
    private class05362 I;
    private class05362 J;
    private class05362 o;
    private class05362 q;
    private class05362 K;
    private class05362 V;
    private class06366<Boolean> e;
    private class06366<Boolean> H;
    private class06366<class07111> c;
    private class06366<Boolean> X;
    private class06366<Boolean> a;
    private final DecimalFormat p = new DecimalFormat("0.0###", DecimalFormatSymbols.getInstance(Locale.ROOT));

    private void L() {
        this.J.field_22763 = true;
        this.o.field_22763 = true;
        this.q.field_22763 = true;
        this.K.field_22763 = true;
        switch (this.W.z()) {
            case field_11467: {
                this.J.field_22763 = false;
                break;
            }
            case field_11464: {
                this.q.field_22763 = false;
                break;
            }
            case field_11465: {
                this.K.field_22763 = false;
                break;
            }
            case field_11463: {
                this.o.field_22763 = false;
            }
        }
    }

    private int L(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0;
        }
    }

    public class01359(class07253 class072532) {
        super((class00392)class00392.L((String)class00869.sh.w()));
        this.W = class072532;
    }

    private void y() {
        this.W.N(this.m);
        this.W.N(this.P);
        this.W.N(this.s);
        this.W.N(this.T);
        this.W.y(this.b);
        this.W.i(this.j);
        this.W.R(this.v);
        this.field_22787.N(null);
    }

    private float y(String string) {
        try {
            return Float.valueOf(string).floatValue();
        }
        catch (NumberFormatException numberFormatException) {
            return 1.0f;
        }
    }

    private void N(class08070 class080702, CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            this.H.field_22764 = false;
        }
    }

    private boolean N(class01054 class010542, class01590 class015902, class00392 class003922, int n, int n2, int n3) {
        if (class003922 == M) {
            return ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_21_4);
        }
        return true;
    }

    private void N(CallbackInfo callbackInfo) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_18_2)) {
            this.n.method_1880(64);
        }
    }

    private void N() {
        if (this.N(class07271.field_12108)) {
            this.field_22787.N(null);
        }
    }

    public static /* synthetic */ boolean N(class01359 class013592, String string, int n, int n2) {
        return class013592.method_25414(string, n, n2);
    }

    private long N(String string) {
        try {
            return Long.valueOf(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    private boolean N(class07271 class072712) {
        class07209 class072092 = new class07209(this.L(this.t.method_1882()), this.L(this.G.method_1882()), this.L(this.l.method_1882()));
        class00753 class007532 = new class00753(this.L(this.d.method_1882()), this.L(this.w.method_1882()), this.L(this.k.method_1882()));
        float f = this.y(this.Y.method_1882());
        long l = this.N(this.Q.method_1882());
        this.field_22787.NE().N((class00381)new class07819(this.W.d(), class072712, this.W.E(), this.n.method_1882(), class072092, class007532, this.W.Z(), this.W.z(), this.O.method_1882(), this.W.W(), this.W.m(), this.W.t(), this.W.o(), f, l));
        return true;
    }

    private void N(class08070 class080702) {
        this.n.method_1862(false);
        this.t.method_1862(false);
        this.G.method_1862(false);
        this.l.method_1862(false);
        this.d.method_1862(false);
        this.w.method_1862(false);
        this.k.method_1862(false);
        this.Y.method_1862(false);
        this.Q.method_1862(false);
        this.O.method_1862(false);
        this.g.field_22764 = false;
        this.I.field_22764 = false;
        this.V.field_22764 = false;
        this.e.field_22764 = false;
        this.H.field_22764 = false;
        this.c.field_22764 = false;
        this.J.field_22764 = false;
        this.o.field_22764 = false;
        this.q.field_22764 = false;
        this.K.field_22764 = false;
        this.X.field_22764 = false;
        this.a.field_22764 = false;
        switch (class080702) {
            case field_12695: {
                this.n.method_1862(true);
                this.t.method_1862(true);
                this.G.method_1862(true);
                this.l.method_1862(true);
                this.d.method_1862(true);
                this.w.method_1862(true);
                this.k.method_1862(true);
                this.g.field_22764 = true;
                this.V.field_22764 = true;
                this.e.field_22764 = true;
                this.H.field_22764 = false;
                this.X.field_22764 = true;
                break;
            }
            case field_12697: {
                this.n.method_1862(true);
                this.t.method_1862(true);
                this.G.method_1862(true);
                this.l.method_1862(true);
                this.Y.method_1862(true);
                this.Q.method_1862(true);
                this.I.field_22764 = true;
                this.e.field_22764 = true;
                this.H.field_22764 = true;
                this.c.field_22764 = true;
                this.J.field_22764 = true;
                this.o.field_22764 = true;
                this.q.field_22764 = true;
                this.K.field_22764 = true;
                this.a.field_22764 = true;
                this.L();
                break;
            }
            case field_12699: {
                this.n.method_1862(true);
                break;
            }
            case field_12696: {
                this.O.method_1862(true);
            }
        }
        this.N(class080702, null);
    }

    public void method_25426() {
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.u, class053622 -> this.N()).N(this.field_22789 / 2 - 4 - 150, 210, 150, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class05220.i, class053622 -> this.y()).N(this.field_22789 / 2 + 4, 210, 150, 20).N());
        this.m = this.W.Z();
        this.P = this.W.z();
        this.s = this.W.E();
        this.T = this.W.W();
        this.b = this.W.m();
        this.j = this.W.t();
        this.v = this.W.o();
        this.g = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"structure_block.button.save"), class053622 -> {
            if (this.W.E() == class08070.field_12695) {
                this.N(class07271.field_12110);
                this.field_22787.N(null);
            }
        }).N(this.field_22789 / 2 + 4 + 100, 185, 50, 20).N());
        this.I = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"structure_block.button.load"), class053622 -> {
            if (this.W.E() == class08070.field_12697) {
                this.N(class07271.field_12109);
                this.field_22787.N(null);
            }
        }).N(this.field_22789 / 2 + 4 + 100, 185, 50, 20).N());
        this.method_37063((class04654)class06366.N(class080702 -> class00392.L((String)("structure_block.mode." + class080702.method_15434())), (Object)this.s).N(E, U).N().N(this.field_22789 / 2 - 4 - 150, 185, 50, 20, (class00392)class00392.y((String)"MODE"), (class063662, class080702) -> {
            this.W.N(class080702);
            this.N((class08070)class080702);
        }));
        this.V = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"structure_block.button.detect_size"), class053622 -> {
            if (this.W.E() == class08070.field_12695) {
                this.N(class07271.field_12106);
                this.field_22787.N(null);
            }
        }).N(this.field_22789 / 2 + 4 + 100, 120, 50, 20).N());
        this.e = (class06366)this.method_37063((class04654)class06366.N((!this.W.W() ? 1 : 0) != 0).N().N(this.field_22789 / 2 + 4 + 100, 160, 50, 20, R, (class063662, bl) -> this.W.N(bl == false)));
        this.H = (class06366)this.method_37063((class04654)class06366.N((boolean)this.W.m()).N().N(this.field_22789 / 2 + 4 + 100, 120, 50, 20, M, (class063662, bl) -> this.W.y(bl.booleanValue())));
        this.c = (class06366)this.method_37063((class04654)class06366.N(class07111::y, (Object)this.m).N((Object[])class07111.values()).N().N(this.field_22789 / 2 - 20, 185, 40, 20, (class00392)class00392.y((String)"MIRROR"), (class063662, class071112) -> this.W.N(class071112)));
        this.X = (class06366)this.method_37063((class04654)class06366.N((boolean)this.W.t()).N().N(this.field_22789 / 2 + 4 + 100, 80, 50, 20, Z, (class063662, bl) -> this.W.i(bl.booleanValue())));
        this.a = (class06366)this.method_37063((class04654)class06366.N((boolean)this.W.o()).N().N(this.field_22789 / 2 + 4 + 100, 80, 50, 20, z, (class063662, bl) -> this.W.R(bl.booleanValue())));
        this.J = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"0"), class053622 -> {
            this.W.N(class06993.field_11467);
            this.L();
        }).N(this.field_22789 / 2 - 1 - 40 - 1 - 40 - 20, 185, 40, 20).N());
        this.o = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"90"), class053622 -> {
            this.W.N(class06993.field_11463);
            this.L();
        }).N(this.field_22789 / 2 - 1 - 40 - 20, 185, 40, 20).N());
        this.q = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"180"), class053622 -> {
            this.W.N(class06993.field_11464);
            this.L();
        }).N(this.field_22789 / 2 + 1 + 20, 185, 40, 20).N());
        this.K = (class05362)this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"270"), class053622 -> {
            this.W.N(class06993.field_11465);
            this.L();
        }).N(this.field_22789 / 2 + 1 + 40 + 1 + 20, 185, 40, 20).N());
        this.n = new class09469(this, this.field_22793, this.field_22789 / 2 - 152, 40, 300, 20, (class00392)class00392.L((String)"structure_block.structure_name"));
        this.n.method_1880(128);
        this.n.method_1852(this.W.u());
        this.method_25429((class04654)this.n);
        class07209 class072092 = this.W.M();
        this.t = new class04927(this.field_22793, this.field_22789 / 2 - 152, 80, 80, 20, (class00392)class00392.L((String)"structure_block.position.x"));
        this.t.method_1880(15);
        this.t.method_1852(Integer.toString(class072092.method_10263()));
        this.method_25429((class04654)this.t);
        this.G = new class04927(this.field_22793, this.field_22789 / 2 - 72, 80, 80, 20, (class00392)class00392.L((String)"structure_block.position.y"));
        this.G.method_1880(15);
        this.G.method_1852(Integer.toString(class072092.method_10264()));
        this.method_25429((class04654)this.G);
        this.l = new class04927(this.field_22793, this.field_22789 / 2 + 8, 80, 80, 20, (class00392)class00392.L((String)"structure_block.position.z"));
        this.l.method_1880(15);
        this.l.method_1852(Integer.toString(class072092.method_10260()));
        this.method_25429((class04654)this.l);
        class00753 class007532 = this.W.B();
        this.d = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 80, 20, (class00392)class00392.L((String)"structure_block.size.x"));
        this.d.method_1880(15);
        this.d.method_1852(Integer.toString(class007532.method_10263()));
        this.method_25429((class04654)this.d);
        this.w = new class04927(this.field_22793, this.field_22789 / 2 - 72, 120, 80, 20, (class00392)class00392.L((String)"structure_block.size.y"));
        this.w.method_1880(15);
        this.w.method_1852(Integer.toString(class007532.method_10264()));
        this.method_25429((class04654)this.w);
        this.k = new class04927(this.field_22793, this.field_22789 / 2 + 8, 120, 80, 20, (class00392)class00392.L((String)"structure_block.size.z"));
        this.k.method_1880(15);
        this.k.method_1852(Integer.toString(class007532.method_10260()));
        this.method_25429((class04654)this.k);
        this.Y = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 80, 20, (class00392)class00392.L((String)"structure_block.integrity.integrity"));
        this.Y.method_1880(15);
        this.Y.method_1852(this.p.format(this.W.P()));
        this.method_25429((class04654)this.Y);
        this.Q = new class04927(this.field_22793, this.field_22789 / 2 - 72, 120, 80, 20, (class00392)class00392.L((String)"structure_block.integrity.seed"));
        this.Q.method_1880(31);
        this.Q.method_1852(Long.toString(this.W.s()));
        this.method_25429((class04654)this.Q);
        this.O = new class04927(this.field_22793, this.field_22789 / 2 - 152, 120, 240, 20, (class00392)class00392.L((String)"structure_block.custom_data"));
        this.O.method_1880(128);
        this.O.method_1852(this.W.U());
        this.method_25429((class04654)this.O);
        this.L();
        this.N(this.s);
        this.N((CallbackInfo)null);
    }

    protected void method_56131() {
        this.method_48265((class04654)this.n);
    }

    public boolean method_25404(class06601 class066012) {
        if (super.method_25404(class066012)) {
            return true;
        }
        if (class066012.u()) {
            this.N();
            return true;
        }
        return false;
    }

    public boolean method_73150() {
        return true;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        block15: {
            int n3;
            int n4;
            int n5;
            class00392 class003922;
            class01590 class015902;
            class01054 class010543;
            super.method_25394(class010542, n, n2, f);
            class08070 class080702 = this.W.E();
            class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 10, -1);
            if (class080702 != class08070.field_12696) {
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = N;
                n5 = this.field_22789 / 2 - 153;
                n4 = 30;
                n3 = -6250336;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                this.n.method_25394(class010542, n, n2, f);
            }
            if (class080702 == class08070.field_12697 || class080702 == class08070.field_12695) {
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = y;
                n5 = this.field_22789 / 2 - 153;
                n4 = 70;
                n3 = -6250336;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                this.t.method_25394(class010542, n, n2, f);
                this.G.method_25394(class010542, n, n2, f);
                this.l.method_25394(class010542, n, n2, f);
                n3 = -6250336;
                n4 = 150;
                n5 = this.field_22789 / 2 + 154 - this.field_22793.N((class05936)R);
                class003922 = R;
                class015902 = this.field_22793;
                class010543 = class010542;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
            }
            if (class080702 == class08070.field_12695) {
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = L;
                n5 = this.field_22789 / 2 - 153;
                n4 = 110;
                n3 = -6250336;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                this.d.method_25394(class010542, n, n2, f);
                this.w.method_25394(class010542, n, n2, f);
                this.k.method_25394(class010542, n, n2, f);
                n3 = -6250336;
                n4 = 110;
                n5 = this.field_22789 / 2 + 154 - this.field_22793.N((class05936)B);
                class003922 = B;
                class015902 = this.field_22793;
                class010543 = class010542;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                n3 = -6250336;
                n4 = 70;
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = Z;
                n5 = this.field_22789 / 2 + 154 - this.field_22793.N((class05936)Z);
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
            }
            if (class080702 == class08070.field_12697) {
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = u;
                n5 = this.field_22789 / 2 - 153;
                n4 = 110;
                n3 = -6250336;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                this.Y.method_25394(class010542, n, n2, f);
                this.Q.method_25394(class010542, n, n2, f);
                n3 = -6250336;
                n4 = 110;
                n5 = this.field_22789 / 2 + 154 - this.field_22793.N((class05936)M);
                class003922 = M;
                class015902 = this.field_22793;
                class010543 = class010542;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                n3 = -6250336;
                n4 = 70;
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = z;
                n5 = this.field_22789 / 2 + 154 - this.field_22793.N((class05936)z);
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
            }
            if (class080702 == class08070.field_12696) {
                class010543 = class010542;
                class015902 = this.field_22793;
                class003922 = i;
                n5 = this.field_22789 / 2 - 153;
                n4 = 110;
                n3 = -6250336;
                if (this.N(class010543, class015902, class003922, n5, n4, n3)) {
                    class010543.y(class015902, class003922, n5, n4, n3);
                }
                this.O.method_25394(class010542, n, n2, f);
            }
            n3 = -6250336;
            n4 = 174;
            n5 = this.field_22789 / 2 - 153;
            class010543 = class010542;
            class015902 = this.field_22793;
            class003922 = class080702.N();
            if (!this.N(class010543, class015902, class003922, n5, n4, n3)) break block15;
            class010543.y(class015902, class003922, n5, n4, n3);
        }
    }

    public void method_25419() {
        this.y();
    }

    public boolean method_25421() {
        return false;
    }

    public void method_25410(int n, int n2) {
        String string = this.n.method_1882();
        String string2 = this.t.method_1882();
        String string3 = this.G.method_1882();
        String string4 = this.l.method_1882();
        String string5 = this.d.method_1882();
        String string6 = this.w.method_1882();
        String string7 = this.k.method_1882();
        String string8 = this.Y.method_1882();
        String string9 = this.Q.method_1882();
        String string10 = this.O.method_1882();
        this.method_25423(n, n2);
        this.n.method_1852(string);
        this.t.method_1852(string2);
        this.G.method_1852(string3);
        this.l.method_1852(string4);
        this.d.method_1852(string5);
        this.w.method_1852(string6);
        this.k.method_1852(string7);
        this.Y.method_1852(string8);
        this.Q.method_1852(string9);
        this.O.method_1852(string10);
    }
}

