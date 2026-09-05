/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03860
 *  minecraft.class05163
 *  minecraft.class05324
 *  minecraft.class05974
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07321
 *  minecraft.class08088
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class04898;
import minecraft.class04910;
import minecraft.class04933;
import minecraft.class05163;
import minecraft.class05324;
import minecraft.class05974;
import minecraft.class06069;
import minecraft.class07001;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07321;
import minecraft.class08088;
import org.jspecify.annotations.Nullable;

public class class04896
extends class04910 {
    public class04896(int n, class06069 class060692, class05163 class051632, class07211 class072112) {
        super(class04878.G, n, class051632);
        this.N(class072112);
        this.i = this.N(class060692);
    }

    public class04896(class07001 class070012) {
        super(class04878.G, class070012);
    }

    public static @Nullable class04896 N(class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        class05163 class051632 = class05163.N((int)n, (int)n2, (int)n3, (int)-1, (int)-1, (int)0, (int)5, (int)5, (int)5, (class07211)class072112);
        if (!class04896.N(class051632) || class038602.N(class051632) != null) {
            return null;
        }
        return new class04896(n4, class060692, class051632, class072112);
    }

    @Override
    public void N(class05974 class059742, class05324 class053242, class08088 class080882, class06069 class060692, class05163 class051632, class07321 class073212, class07209 class072092) {
        this.N(class059742, class051632, 0, 0, 0, 4, 4, 4, true, class060692, class04933.L);
        this.N(class059742, class060692, class051632, this.i, 1, 1, 0);
        class07211 class072112 = this.i();
        if (class072112 == class07211.field_11043 || class072112 == class07211.field_11034) {
            this.N(class059742, class051632, 0, 1, 1, 0, 3, 3, w, w, false);
        } else {
            this.N(class059742, class051632, 4, 1, 1, 4, 3, 3, w, w, false);
        }
    }

    @Override
    public void N(class04890 class048902, class03860 class038602, class06069 class060692) {
        class07211 class072112 = this.i();
        if (class072112 == class07211.field_11043 || class072112 == class07211.field_11034) {
            this.y((class04898)class048902, class038602, class060692, 1, 1);
        } else {
            this.L((class04898)class048902, class038602, class060692, 1, 1);
        }
    }
}

