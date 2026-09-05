/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03298
 *  minecraft.class03860
 *  minecraft.class04878
 *  minecraft.class04890
 *  minecraft.class05163
 *  minecraft.class06069
 *  minecraft.class07001
 *  minecraft.class07211
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import minecraft.class03298;
import minecraft.class03860;
import minecraft.class04878;
import minecraft.class04890;
import minecraft.class05163;
import minecraft.class06069;
import minecraft.class06454;
import minecraft.class06461;
import minecraft.class06462;
import minecraft.class06471;
import minecraft.class07001;
import minecraft.class07211;
import org.jspecify.annotations.Nullable;

abstract class class06456
extends class04890 {
    protected @Nullable class04890 L(class06461 class064612, class03860 class038602, class06069 class060692, int n, int n2, boolean bl) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return this.N(class064612, class038602, class060692, this.k.U() + 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11034, this.u(), bl);
                }
                case field_11035: {
                    return this.N(class064612, class038602, class060692, this.k.U() + 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11034, this.u(), bl);
                }
                case field_11039: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.W() + 1, class07211.field_11035, this.u(), bl);
                }
                case field_11034: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.W() + 1, class07211.field_11035, this.u(), bl);
                }
            }
        }
        return null;
    }

    protected class06456(class04878 class048782, int n, class05163 class051632) {
        super(class048782, n, class051632);
    }

    public class06456(class04878 class048782, class07001 class070012) {
        super(class048782, class070012);
    }

    protected @Nullable class04890 y(class06461 class064612, class03860 class038602, class06069 class060692, int n, int n2, boolean bl) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return this.N(class064612, class038602, class060692, this.k.B() - 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11039, this.u(), bl);
                }
                case field_11035: {
                    return this.N(class064612, class038602, class060692, this.k.B() - 1, this.k.Z() + n, this.k.z() + n2, class07211.field_11039, this.u(), bl);
                }
                case field_11039: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.z() - 1, class07211.field_11043, this.u(), bl);
                }
                case field_11034: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n2, this.k.Z() + n, this.k.z() - 1, class07211.field_11043, this.u(), bl);
                }
            }
        }
        return null;
    }

    protected @Nullable class04890 N(class06461 class064612, class03860 class038602, class06069 class060692, int n, int n2, boolean bl) {
        class07211 class072112 = this.i();
        if (class072112 != null) {
            switch (class072112) {
                case field_11043: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n, this.k.Z() + n2, this.k.z() - 1, class072112, this.u(), bl);
                }
                case field_11035: {
                    return this.N(class064612, class038602, class060692, this.k.B() + n, this.k.Z() + n2, this.k.W() + 1, class072112, this.u(), bl);
                }
                case field_11039: {
                    return this.N(class064612, class038602, class060692, this.k.B() - 1, this.k.Z() + n2, this.k.z() + n, class072112, this.u(), bl);
                }
                case field_11034: {
                    return this.N(class064612, class038602, class060692, this.k.U() + 1, this.k.Z() + n2, this.k.z() + n, class072112, this.u(), bl);
                }
            }
        }
        return null;
    }

    protected static boolean N(class05163 class051632) {
        return class051632.Z() > 10;
    }

    protected void N(class03298 class032982, class07001 class070012) {
    }

    private int N(List<class06471> list) {
        boolean bl = false;
        int n = 0;
        for (class06471 class064712 : list) {
            if (class064712.u > 0 && class064712.L < class064712.u) {
                bl = true;
            }
            n += class064712.y;
        }
        return bl ? n : -1;
    }

    private @Nullable class06456 N(class06461 class064612, List<class06471> list, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4) {
        int n5 = this.N(list);
        boolean bl = n5 > 0 && n4 <= 30;
        int n6 = 0;
        block0: while (n6 < 5 && bl) {
            ++n6;
            int n7 = class060692.y(n5);
            for (class06471 class064712 : list) {
                if ((n7 -= class064712.y) >= 0) continue;
                if (!class064712.N(n4) || class064712 == class064612.N && !class064712.i) continue block0;
                class06456 class064562 = class06454.N(class064712, class038602, class060692, n, n2, n3, class072112, n4);
                if (class064562 == null) continue;
                ++class064712.L;
                class064612.N = class064712;
                if (!class064712.N()) {
                    list.remove(class064712);
                }
                return class064562;
            }
        }
        return class06462.N(class038602, class060692, n, n2, n3, class072112, n4);
    }

    private @Nullable class04890 N(class06461 class064612, class03860 class038602, class06069 class060692, int n, int n2, int n3, class07211 class072112, int n4, boolean bl) {
        class06456 class064562;
        if (Math.abs(n - class064612.L().B()) > 112 || Math.abs(n3 - class064612.L().z()) > 112) {
            return class06462.N(class038602, class060692, n, n2, n3, class072112, n4);
        }
        List<class06471> var10 = class064612.y;
        if (bl) {
            var10 = class064612.L;
        }
        if ((class064562 = this.N(class064612, var10, class038602, class060692, n, n2, n3, class072112, n4 + 1)) != null) {
            class038602.N((class04890)class064562);
            class064612.u.add(class064562);
        }
        return class064562;
    }
}

