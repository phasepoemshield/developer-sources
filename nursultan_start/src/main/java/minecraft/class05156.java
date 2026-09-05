/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05184
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class06187
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07284
 *  minecraft.class07290
 *  minecraft.class07321
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00500;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05154;
import minecraft.class05163;
import minecraft.class05184;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class06187;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07284;
import minecraft.class07290;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class05156
extends class05154 {
    private final class07211 y;
    private final boolean L;

    public class05156(int n, class05163 class051632, @Nullable class07211 class072112, class06187 class061872) {
        super(class04878.y, n, class061872, class051632);
        this.y = class072112;
        this.L = class051632.i() > 3;
    }

    public class05156(class07001 class070012) {
        super(class04878.y, class070012);
        this.L = class070012.y("tf", false);
        this.y = class070012.N_15("D", class07211.field_57038).orElse(class07211.field_11035);
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        int n = this.u();
        switch (this.y) {
            default: {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11039, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11034, (int)n);
                break;
            }
            case field_11035: {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11039, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11034, (int)n);
                break;
            }
            case field_11039: {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11039, (int)n);
                break;
            }
            case field_11034: {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)this.k.Z(), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)this.k.Z(), (int)(this.k.z() + 1), (class07211)class07211.field_11034, (int)n);
            }
        }
        if (this.L) {
            if (class060692.Z()) {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)(this.k.Z() + 3 + 1), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
            }
            if (class060692.Z()) {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)(this.k.Z() + 3 + 1), (int)(this.k.z() + 1), (class07211)class07211.field_11039, (int)n);
            }
            if (class060692.Z()) {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)(this.k.Z() + 3 + 1), (int)(this.k.z() + 1), (class07211)class07211.field_11034, (int)n);
            }
            if (class060692.Z()) {
                class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() + 1), (int)(this.k.Z() + 3 + 1), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
            }
        }
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.N((class07284)class059742, class051632)) {
            return;
        }
        class00500 class005002 = this.N.L();
        if (this.L) {
            this.N(class059742, class051632, this.k.B() + 1, this.k.Z(), this.k.z(), this.k.U() - 1, this.k.Z() + 3 - 1, this.k.W(), w, w, false);
            this.N(class059742, class051632, this.k.B(), this.k.Z(), this.k.z() + 1, this.k.U(), this.k.Z() + 3 - 1, this.k.W() - 1, w, w, false);
            this.N(class059742, class051632, this.k.B() + 1, this.k.E() - 2, this.k.z(), this.k.U() - 1, this.k.E(), this.k.W(), w, w, false);
            this.N(class059742, class051632, this.k.B(), this.k.E() - 2, this.k.z() + 1, this.k.U(), this.k.E(), this.k.W() - 1, w, w, false);
            this.N(class059742, class051632, this.k.B() + 1, this.k.Z() + 3, this.k.z() + 1, this.k.U() - 1, this.k.Z() + 3, this.k.W() - 1, w, w, false);
        } else {
            this.N(class059742, class051632, this.k.B() + 1, this.k.Z(), this.k.z(), this.k.U() - 1, this.k.E(), this.k.W(), w, w, false);
            this.N(class059742, class051632, this.k.B(), this.k.Z(), this.k.z() + 1, this.k.U(), this.k.E(), this.k.W() - 1, w, w, false);
        }
        this.N(class059742, class051632, this.k.B() + 1, this.k.Z(), this.k.z() + 1, this.k.E());
        this.N(class059742, class051632, this.k.B() + 1, this.k.Z(), this.k.W() - 1, this.k.E());
        this.N(class059742, class051632, this.k.U() - 1, this.k.Z(), this.k.z() + 1, this.k.E());
        this.N(class059742, class051632, this.k.U() - 1, this.k.Z(), this.k.W() - 1, this.k.E());
        int n = this.k.Z() - 1;
        for (int i = this.k.B(); i <= this.k.U(); ++i) {
            for (int j = this.k.z(); j <= this.k.W(); ++j) {
                this.N(class059742, class051632, class005002, i, n, j);
            }
        }
    }

    private void N(class05974 class059742, class05163 class051632, int n, int n2, int n3, int n4) {
        if (!this.N((class07290)class059742, n, n4 + 1, n3, class051632).P()) {
            this.N(class059742, class051632, n, n2, n3, n, n4, n3, this.N.L(), w, false);
        }
    }

    public static @Nullable class05163 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112) {
        int n4 = class060692.y(4) == 0 ? 6 : 2;
        class05163 class051632 = switch (class072112) {
            default -> new class05163(-1, 0, -4, 3, n4, 0);
            case class07211.field_11035 -> new class05163(-1, 0, 0, 3, n4, 4);
            case class07211.field_11039 -> new class05163(-4, 0, -1, 0, n4, 3);
            case class07211.field_11034 -> new class05163(0, 0, -1, 4, n4, 3);
        };
        class051632.N(n, n2, n3);
        if (class038602.N(class051632) != null) {
            return null;
        }
        return class051632;
    }

    @Override
    protected void N(class03298 class032982, class07001 class070012) {
        super.N(class032982, class070012);
        class070012.N("tf", this.L);
        class070012.N("D", class07211.field_57038, (Object)this.y);
    }
}

