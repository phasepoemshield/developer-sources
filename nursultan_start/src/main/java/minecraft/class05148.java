/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
 *  minecraft.class07321
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

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
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class05148
extends class05154 {
    public class05148(int n, class05163 class051632, class07211 class072112, class06187 class061872) {
        super(class04878.u, n, class061872, class051632);
        this.N(class072112);
    }

    public class05148(class07001 class070012) {
        super(class04878.u, class070012);
    }

    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        int n = this.u();
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                default: {
                    class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)this.k.Z(), (int)(this.k.z() - 1), (class07211)class07211.field_11043, (int)n);
                    break;
                }
                case field_11035: {
                    class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)this.k.B(), (int)this.k.Z(), (int)(this.k.W() + 1), (class07211)class07211.field_11035, (int)n);
                    break;
                }
                case field_11039: {
                    class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.B() - 1), (int)this.k.Z(), (int)this.k.z(), (class07211)class07211.field_11039, (int)n);
                    break;
                }
                case field_11034: {
                    class05184.N((class04890)class048902, (class03860)class038602, (class06069)class060692, (int)(this.k.U() + 1), (int)this.k.Z(), (int)this.k.z(), (class07211)class07211.field_11034, (int)n);
                }
            }
        }
    }

    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        if (this.N((class07284)class059742, class051632)) {
            return;
        }
        this.N(class059742, class051632, 0, 5, 0, 2, 7, 1, w, w, false);
        this.N(class059742, class051632, 0, 0, 7, 2, 2, 8, w, w, false);
        for (int i = 0; i < 5; ++i) {
            this.N(class059742, class051632, 0, 5 - i - (i < 4 ? 1 : 0), 2 + i, 2, 7 - i, 2 + i, w, w, false);
        }
    }

    public static @Nullable class05163 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112) {
        class05163 class051632 = switch (class072112) {
            default -> new class05163(0, -5, -8, 2, 2, 0);
            case class07211.field_11035 -> new class05163(0, -5, 0, 2, 2, 8);
            case class07211.field_11039 -> new class05163(-8, -5, 0, 0, 2, 2);
            case class07211.field_11034 -> new class05163(0, -5, 0, 8, 2, 2);
        };
        class051632.N(n, n2, n3);
        if (class038602.N(class051632) != null) {
            return null;
        }
        return class051632;
    }
}

