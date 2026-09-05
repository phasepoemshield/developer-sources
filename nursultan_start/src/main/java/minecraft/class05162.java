/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00651
 *  minecraft.class00730
 *  minecraft.class00753
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05184
 *  minecraft.class05324
 *  minecraft.class05487
 *  minecraft.class05946
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06187
 *  minecraft.class06273
 *  minecraft.class06892
 *  minecraft.class07001
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07185
 *  minecraft.class07204
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 *  minecraft.class07235
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07498
 *  minecraft.class08080
 *  minecraft.class08088
 *  minecraft.class08092
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00651;
import minecraft.class00730;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05074;
import minecraft.class05154;
import minecraft.class05163;
import minecraft.class05184;
import minecraft.class05324;
import minecraft.class05487;
import minecraft.class05946;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06187;
import minecraft.class06273;
import minecraft.class06892;
import minecraft.class07001;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07185;
import minecraft.class07204;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;
import minecraft.class07235;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07498;
import minecraft.class08080;
import minecraft.class08088;
import minecraft.class08092;
import org.jspecify.annotations.Nullable;

public class class05162
extends class05154 {
    private final boolean y;
    private final boolean L;
    private boolean u;
    private final int i;

    public class05162(int n, class06069 class060692, class05163 class051632, class07211 class072112, class06187 class061872) {
        super(class04878.N, n, class061872, class051632);
        this.N(class072112);
        this.y = class060692.y(3) == 0;
        this.L = !this.y && class060692.y(23) == 0;
        this.i = this.i().z() == class07185.field_11051 ? class051632.R() / 5 : class051632.u() / 5;
    }

    public class05162(class07001 class070012) {
        super(class04878.N, class070012);
        this.y = class070012.y("hr", false);
        this.L = class070012.y("sc", false);
        this.u = class070012.y("hps", false);
        this.i = class070012.y("Num", 0);
    }

    private boolean y(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class00891.N_6((class05487)class054872, (class07209)class072092, (class07211)class07211.field_11033) && !(class005002.i() instanceof class07204);
    }

    protected void y(class05974 class059742, class00500 class005002, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2, n3);
        if (!class051632.y((class00753)class072182)) {
            return;
        }
        int n4 = class072182.method_10264();
        int n5 = 1;
        boolean bl = true;
        boolean bl2 = true;
        while (bl || bl2) {
            boolean bl3;
            class00500 class005003;
            if (bl) {
                class072182.method_10099(n4 - n5);
                class005003 = class059742.method_8320((class07209)class072182);
                boolean bl4 = bl3 = this.N(class005003) && !class005003.N(class00869.V);
                if (!bl3 && this.N((class05487)class059742, (class07209)class072182, class005003)) {
                    class05162.N(class059742, class005002, class072182, n4 - n5 + 1, n4);
                    return;
                }
                boolean bl5 = bl = n5 <= 20 && bl3 && class072182.method_10264() > class059742.method_31607() + 1;
            }
            if (bl2) {
                class072182.method_10099(n4 + n5);
                class005003 = class059742.method_8320((class07209)class072182);
                bl3 = this.N(class005003);
                if (!bl3 && this.y((class05487)class059742, (class07209)class072182, class005003)) {
                    class059742.method_8652((class07209)class072182.method_10099(n4 + 1), this.N.u(), 2);
                    class05162.N(class059742, class00869.Rg.W(), class072182, n4 + 2, n4 + n5);
                    return;
                }
                bl2 = n5 <= 50 && bl3 && class072182.method_10264() < class059742.method_31600();
            }
            ++n5;
        }
    }

    private void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4, int n5, class06069 class060692) {
        if (!this.N((class07290)class059742, class051632, n, n5, n4, n3)) {
            return;
        }
        class00500 class005002 = this.N.L();
        class00500 class005003 = this.N.u();
        this.N(class059742, class051632, n, n2, n3, n, n4 - 1, n3, (class00500)class005003.y((class08092)class00730.i, (Comparable)Boolean.valueOf(true)), w, false);
        this.N(class059742, class051632, n5, n2, n3, n5, n4 - 1, n3, (class00500)class005003.y((class08092)class00730.L, (Comparable)Boolean.valueOf(true)), w, false);
        if (class060692.y(4) == 0) {
            this.N(class059742, class051632, n, n4, n3, n, n4, n3, class005002, w, false);
            this.N(class059742, class051632, n5, n4, n3, n5, n4, n3, class005002, w, false);
        } else {
            this.N(class059742, class051632, n, n4, n3, n5, n4, n3, class005002, w, false);
            this.N(class059742, class051632, class060692, 0.05f, n + 1, n4, n3 - 1, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11035));
            this.N(class059742, class051632, class060692, 0.05f, n + 1, n4, n3 + 1, (class00500)class00869.LH.W().y((class08092)class00651.i, (Comparable)class07211.field_11043));
        }
    }

    private static void N(class05974 class059742, class00500 class005002, class07218 class072182, int n, int n2) {
        for (int i = n; i < n2; ++i) {
            class059742.method_8652((class07209)class072182.method_10099(i), class005002, 2);
        }
    }

    private boolean N(class05487 class054872, class07209 class072092, class00500 class005002) {
        return class005002.L((class07290)class054872, class072092, class07211.field_11036);
    }

    private boolean N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4) {
        class07218 class072182 = this.L(n, n2, n3);
        int n5 = 0;
        for (class07211 class072112 : class07211.values()) {
            class072182.N(class072112);
            if (class051632.y((class00753)class072182) && class059742.method_8320((class07209)class072182).L((class07290)class059742, (class07209)class072182, class072112.b()) && ++n5 >= n4) {
                return true;
            }
            class072182.N(class072112.b());
        }
        return false;
    }

    private void N(class05974 class059742, class05163 class051632, class06069 class060692, float f, int n, int n2, int n3) {
        if (this.y((class05487)class059742, n, n2, n3, class051632) && class060692.z() < f && this.N(class059742, class051632, n, n2, n3, 2)) {
            this.L(class059742, class00869.yw.W(), n, n2, n3, class051632);
        }
    }

    protected boolean N(class05974 class059742, class05163 class051632, class06069 class060692, int n, int n2, int n3, class05946<class05074> class059462) {
        class07218 class072182 = this.L(n, n2, n3);
        if (class051632.y((class00753)class072182) && class059742.method_8320((class07209)class072182).P() && !class059742.method_8320(class072182.method_10074()).P()) {
            class00500 class005002 = (class00500)class00869.um.W().y((class08092)class06892.L, (Comparable)(class060692.Z() ? class08080.field_12665 : class08080.field_12674));
            this.L(class059742, class005002, n, n2, n3, class051632);
            class07498 class074982 = (class07498)class07078.Y.N((class07299)class059742.method_8410(), class06113.field_16472);
            if (class074982 != null) {
                class074982.N((double)class072182.method_10263() + 0.5, (double)class072182.method_10264() + 0.5, (double)class072182.method_10260() + 0.5);
                class074982.N(class059462, class060692.B());
                class059742.method_8649((class07049)class074982);
            }
            return true;
        }
        return false;
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        block24: {
            int n = this.u();
            int n2 = class060692.y(4);
            class07211 class072112 = this.i();
            if (class072112 != null) {
                switch (class072112) {
                    default: {
                        if (n2 <= 1) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.z() - 1), (class07211)class072112, (int)n);
                            break;
                        }
                        if (n2 == 2) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)this.k.z(), (class07211)class07211.field_11039, (int)n);
                            break;
                        }
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)this.k.z(), (class07211)class07211.field_11034, (int)n);
                        break;
                    }
                    case field_11035: {
                        if (n2 <= 1) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.W() + 1), (class07211)class072112, (int)n);
                            break;
                        }
                        if (n2 == 2) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.W() - 3), (class07211)class07211.field_11039, (int)n);
                            break;
                        }
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.W() - 3), (class07211)class07211.field_11034, (int)n);
                        break;
                    }
                    case field_11039: {
                        if (n2 <= 1) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)this.k.z(), (class07211)class072112, (int)n);
                            break;
                        }
                        if (n2 == 2) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                            break;
                        }
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                        break;
                    }
                    case field_11034: {
                        if (n2 <= 1) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)(this.k.Z() - 1 + class060692.y(3)), (int)this.k.z(), (class07211)class072112, (int)n);
                            break;
                        }
                        if (n2 == 2) {
                            class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() - 3), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                            break;
                        }
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() - 3), (int)(this.k.Z() - 1 + class060692.y(3)), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                    }
                }
            }
            if (n >= 8) break block24;
            if (class072112 == class07211.field_11043 || class072112 == class07211.field_11035) {
                int n3 = this.k.z() + 3;
                while (n3 + 3 <= this.k.W()) {
                    int n4 = class060692.y(5);
                    if (n4 == 0) {
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)this.k.Z(), (int)n3, (class07211)class07211.field_11039, (int)(n + 1));
                    } else if (n4 == 1) {
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)this.k.Z(), (int)n3, (class07211)class07211.field_11034, (int)(n + 1));
                    }
                    n3 += 5;
                }
            } else {
                int n5 = this.k.B() + 3;
                while (n5 + 3 <= this.k.U()) {
                    int n6 = class060692.y(5);
                    if (n6 == 0) {
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)n5, (int)this.k.Z(), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)(n + 1));
                    } else if (n6 == 1) {
                        class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)n5, (int)this.k.Z(), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)(n + 1));
                    }
                    n5 += 5;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static @Nullable class05163 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112) {
        int n4 = class060692.y(3) + 2;
        while (n4 > 0) {
            int n5 = n4 * 5;
            class05163 class051632 = switch (class072112) {
                default -> new class05163(0, 0, -(n5 - 1), 2, 2, 0);
                case class07211.field_11035 -> new class05163(0, 0, 0, 2, 2, n5 - 1);
                case class07211.field_11039 -> new class05163(-(n5 - 1), 0, 0, 0, 2, 2);
                case class07211.field_11034 -> new class05163(0, 0, 0, n5 - 1, 2, 2);
            };
            class051632.N(n, n2, n3);
            if (class038602.N(class051632) == null) {
                return class051632;
            }
            --n4;
        }
        return null;
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("hr", this.y);
        class070012.N("sc", this.L);
        class070012.N("hps", this.u);
        class070012.N("Num", this.i);
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        int n;
        int n2;
        int n3;
        if (this.N((class07284)class059742, class051632)) {
            return;
        }
        boolean bl = false;
        int n4 = 2;
        boolean bl2 = false;
        int n5 = 2;
        int n6 = this.i * 5 - 1;
        class00500 class005002 = this.N.L();
        this.N(class059742, class051632, 0, 0, 0, 2, 1, n6, w, w, false);
        this.N(class059742, class051632, class060692, 0.8f, 0, 2, 0, 2, 2, n6, w, w, false, false);
        if (this.L) {
            this.N(class059742, class051632, class060692, 0.6f, 0, 0, 0, 2, 1, n6, class00869.yw.W(), w, false, true);
        }
        for (n3 = 0; n3 < this.i; ++n3) {
            n2 = 2 + n3 * 5;
            this.N(class059742, class051632, 0, 0, n2, 2, 2, class060692);
            this.N(class059742, class051632, class060692, 0.1f, 0, 2, n2 - 1);
            this.N(class059742, class051632, class060692, 0.1f, 2, 2, n2 - 1);
            this.N(class059742, class051632, class060692, 0.1f, 0, 2, n2 + 1);
            this.N(class059742, class051632, class060692, 0.1f, 2, 2, n2 + 1);
            this.N(class059742, class051632, class060692, 0.05f, 0, 2, n2 - 2);
            this.N(class059742, class051632, class060692, 0.05f, 2, 2, n2 - 2);
            this.N(class059742, class051632, class060692, 0.05f, 0, 2, n2 + 2);
            this.N(class059742, class051632, class060692, 0.05f, 2, 2, n2 + 2);
            if (class060692.y(100) == 0) {
                this.N(class059742, class051632, class060692, 2, 0, n2 - 1, (class05946<class05074>)class06273.v);
            }
            if (class060692.y(100) == 0) {
                this.N(class059742, class051632, class060692, 0, 0, n2 + 1, (class05946<class05074>)class06273.v);
            }
            if (!this.L || this.u) continue;
            n = 1;
            int n7 = n2 - 1 + class060692.y(3);
            class07218 class072182 = this.L(1, 0, n7);
            if (!class051632.y((class00753)class072182) || !this.y((class05487)class059742, 1, 0, n7, class051632)) continue;
            this.u = true;
            class059742.method_8652((class07209)class072182, class00869.La.W(), 2);
            class00394 class003942 = class059742.method_8321((class07209)class072182);
            if (!(class003942 instanceof class07235)) continue;
            ((class07235)class003942).N(class07078.d, class060692);
        }
        for (n3 = 0; n3 <= 2; ++n3) {
            for (n2 = 0; n2 <= n6; ++n2) {
                this.N(class059742, class051632, class005002, n3, -1, n2);
            }
        }
        n3 = 2;
        this.N(class059742, class051632, 0, -1, 2);
        if (this.i > 1) {
            n2 = n6 - 2;
            this.N(class059742, class051632, 0, -1, n2);
        }
        if (this.y) {
            class00500 class005003 = (class00500)class00869.um.W().y((class08092)class06892.L, (Comparable)class08080.field_12665);
            for (n = 0; n <= n6; ++n) {
                class00500 class005004 = this.N((class07290)class059742, 1, -1, n, class051632);
                if (class005004.P() || !class005004.t()) continue;
                float f = this.y((class05487)class059742, 1, 0, n, class051632) ? 0.7f : 0.9f;
                this.N(class059742, class051632, class060692, f, 1, 0, n, class005003);
            }
        }
    }

    private void N(class05974 class059742, class05163 class051632, int n, int n2, int n3) {
        class00500 class005002 = this.N.y();
        class00500 class005003 = this.N.L();
        if (this.N((class07290)class059742, n, n2, n3, class051632).N(class005003.i())) {
            this.y(class059742, class005002, n, n2, n3, class051632);
        }
        if (this.N((class07290)class059742, n + 2, n2, n3, class051632).N(class005003.i())) {
            this.y(class059742, class005002, n + 2, n2, n3, class051632);
        }
    }

    protected void N(class05974 class059742, class00500 class005002, int n, int n2, int n3, class05163 class051632) {
        class07218 class072182 = this.L(n, n2, n3);
        if (!class051632.y((class00753)class072182)) {
            return;
        }
        int n4 = class072182.method_10264();
        while (this.N(class059742.method_8320((class07209)class072182)) && class072182.method_10264() > class059742.method_31607() + 1) {
            class072182.N(class07211.field_11033);
        }
        if (!this.N((class05487)class059742, (class07209)class072182, class059742.method_8320((class07209)class072182))) {
            return;
        }
        while (class072182.method_10264() < n4) {
            class072182.N(class07211.field_11036);
            class059742.method_8652((class07209)class072182, class005002, 2);
        }
    }
}

