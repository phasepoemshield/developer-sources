/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02484
 *  minecraft.class02562
 *  minecraft.class02777
 *  minecraft.class03245
 *  minecraft.class03262
 *  minecraft.class03662
 *  minecraft.class04974
 *  minecraft.class04977
 *  minecraft.class05431
 *  minecraft.class05936
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07078
 *  minecraft.class07085
 *  minecraft.class07482
 *  minecraft.class08044
 *  minecraft.class08394
 *  minecraft.class08725
 *  minecraft.class08800
 *  minecraft.class08943
 *  org.joml.Quaternionf
 *  org.joml.Vector3f
 */
package minecraft;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Optional;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02484;
import minecraft.class02562;
import minecraft.class02777;
import minecraft.class03245;
import minecraft.class03262;
import minecraft.class03662;
import minecraft.class04974;
import minecraft.class04977;
import minecraft.class05431;
import minecraft.class05936;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07078;
import minecraft.class07085;
import minecraft.class07482;
import minecraft.class08044;
import minecraft.class08394;
import minecraft.class08725;
import minecraft.class08800;
import minecraft.class08943;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class class05419
extends class05431<class04974> {
    private static final class01894 N = class01894.y((String)"container/smithing/error");
    private static final class01894 y = class01894.y((String)"container/slot/smithing_template_armor_trim");
    private static final class01894 L = class01894.y((String)"container/slot/smithing_template_netherite_upgrade");
    private static final class00392 u = class00392.L((String)"container.upgrade.missing_template_tooltip");
    private static final class00392 n = class00392.L((String)"container.upgrade.error_tooltip");
    private static final List<class01894> t = List.of(y, L);
    private static final int G = 44;
    private static final int l = 15;
    private static final int d = 28;
    private static final int w = 21;
    private static final int k = 65;
    private static final int Y = 46;
    private static final int Q = 115;
    private static final int O = 210;
    private static final int g = 25;
    private static final Vector3f I = new Vector3f(0.0f, 1.0f, 0.0f);
    private static final Quaternionf J = new Quaternionf().rotationXYZ(0.43633232f, 0.0f, (float)Math.PI);
    private static final int o = 25;
    private static final int q = 121;
    private static final int K = 20;
    private static final int V = 161;
    private static final int e = 80;
    private final class03245 H = new class03245(0);
    private final class03245 c = new class03245(1);
    private final class03245 X = new class03245(2);
    private final class02777 a = new class02777();

    private boolean L() {
        return ((class04974)this.m).W();
    }

    public class05419(class04974 class049742, class08044 class080442, class00392 class003922) {
        super((class04977)class049742, class080442, class003922, class01894.y((String)"textures/gui/container/smithing.png"));
        this.z = 44;
        this.U = 15;
        this.a.U = class07078.B;
        this.a.A = false;
        this.a.F = true;
        this.a.h = 25.0f;
        this.a.x = 210.0f;
    }

    protected void i(class01054 class010542, int n, int n2) {
        if (this.L()) {
            class010542.N(class08394.Na, N, n + 65, n2 + 46, 28, 21);
        }
    }

    public void u() {
        super.u();
        Optional<class03262> var1 = this.y();
        this.H.N(t);
        this.c.N(var1.map(class03262::L).orElse(List.of()));
        this.X.N(var1.map(class03262::W).orElse(List.of()));
    }

    private Optional<class03262> y() {
        class06581 class065812;
        class06584 class065842 = ((class04974)this.m).L(0).i();
        if (!class065842.R() && (class065812 = class065842.B()) instanceof class03262) {
            return Optional.of((class03262)class065812);
        }
        return Optional.empty();
    }

    private void y(class06584 class065842) {
        this.a.NH = class06584.E;
        this.a.Ne.y();
        this.a.e = class06584.E;
        this.a.NP.y();
        this.a.H = class06584.E;
        this.a.c = class06584.E;
        this.a.X = class06584.E;
        if (!class065842.R()) {
            class08725 class087252 = (class08725)class065842.method_58694(class02484.o);
            class07085 class070852 = class087252 != null ? class087252.y() : null;
            class08943 class089432 = this.field_22787.NM();
            class07085 class070853 = class070852;
            int n = 0;
            switch (SwitchBootstraps.enumSwitch("enumSwitch", new Object[]{"HEAD", "CHEST", "LEGS", "FEET"}, (class07085)class070853, (int)n)) {
                case 0: {
                    if (class02562.N((class06584)class065842, (class07085)class07085.field_6169)) {
                        this.a.e = class065842.t();
                        break;
                    }
                    class089432.N(this.a.NP, class065842, class03662.field_4316, null, null, 0);
                    break;
                }
                case 1: {
                    this.a.H = class065842.t();
                    break;
                }
                case 2: {
                    this.a.c = class065842.t();
                    break;
                }
                case 3: {
                    this.a.X = class065842.t();
                    break;
                }
                default: {
                    this.a.NH = class065842.t();
                    class089432.N(this.a.Ne, class065842, class03662.field_4323, null, null, 0);
                }
            }
        }
    }

    public void N(class07482 class074822, int n, class06584 class065842) {
        if (n == 3) {
            this.y(class065842);
        }
    }

    protected void N() {
        this.y(((class04974)this.m).L(3).i());
    }

    protected void N(class01054 class010542, float f, int n, int n2) {
        super.N(class010542, f, n, n2);
        this.H.N(this.m, class010542, f, this.T, this.b);
        this.c.N(this.m, class010542, f, this.T, this.b);
        this.X.N(this.m, class010542, f, this.T, this.b);
        int n3 = this.T + 121;
        int n4 = this.b + 20;
        int n5 = this.T + 161;
        int n6 = this.b + 80;
        class010542.N((class08800)this.a, 25.0f, I, J, null, n3, n4, n5, n6);
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        this.R(class010542, n, n2);
    }

    private void R(class01054 class010542, int n, int n2) {
        Optional<class00392> optional = Optional.empty();
        if (this.L() && this.N(65, 46, 28, 21, n, n2)) {
            optional = Optional.of(class05419.n);
        }
        if (this.s != null) {
            class06584 class065842 = ((class04974)this.m).L(0).i();
            class06584 class065843 = this.s.i();
            if (class065842.R()) {
                if (this.s.u == 0) {
                    optional = Optional.of(u);
                }
            } else {
                class06581 class065812 = class065842.B();
                if (class065812 instanceof class03262) {
                    class03262 class032622 = (class03262)class065812;
                    if (class065843.R()) {
                        if (this.s.u == 1) {
                            optional = Optional.of(class032622.N());
                        } else if (this.s.u == 2) {
                            optional = Optional.of(class032622.y());
                        }
                    }
                }
            }
        }
        optional.ifPresent(class003922 -> class010542.y(this.field_22793, this.field_22793.L((class05936)class003922, 115), n, n2));
    }
}

