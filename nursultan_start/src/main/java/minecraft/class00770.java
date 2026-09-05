/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class01009
 *  minecraft.class03556
 *  minecraft.class03927
 *  minecraft.class04782
 *  minecraft.class04995
 *  minecraft.class05368
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class05487
 *  minecraft.class06665
 *  minecraft.class07136
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07212
 *  minecraft.class07218
 *  minecraft.class07830
 *  minecraft.class08057
 *  minecraft.class08092
 *  net.caffeinemc.mods.lithium.common.util.POIRegistryEntries
 *  net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class00869;
import minecraft.class01009;
import minecraft.class03556;
import minecraft.class03927;
import minecraft.class04782;
import minecraft.class04995;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class05487;
import minecraft.class06665;
import minecraft.class07136;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07212;
import minecraft.class07218;
import minecraft.class07830;
import minecraft.class08057;
import minecraft.class08092;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestStorageExtended;

public class class00770 {
    public static final int N = 3;
    private static final int y = 16;
    private static final int L = 128;
    private static final int u = 5;
    private static final int i = 4;
    private static final int R = 3;
    private static final int M = -1;
    private static final int B = 4;
    private static final int Z = -1;
    private static final int z = 3;
    private static final int U = -1;
    private static final int E = 2;
    private static final int W = -1;
    private final class04782 m;

    public class00770(class04782 class047822) {
        this.m = class047822;
    }

    private /* synthetic */ boolean N(class07209 class072092) {
        return this.m.method_8320(class072092).y((class08092)class06665.K);
    }

    private static /* synthetic */ boolean N(class03556 class035562) {
        return class035562.N(class03927.b);
    }

    public Optional N(class07209 class072092, boolean bl, class08057 class080572) {
        int n = bl ? 16 : 128;
        class05368 class053682 = this.m.method_19494();
        class053682.N((class05487)this.m, class072092, n);
        return ((PointOfInterestStorageExtended)class053682).lithium$findNearestForPortalLogic(class072092, n, POIRegistryEntries.NETHER_PORTAL_ENTRY, class05372.field_18489, class053772 -> this.m.method_8320(class053772.M()).y((class08092)class06665.K), class080572).map(class05377::M);
    }

    public Optional<class01009> N(class07209 class072092, class07185 class071852) {
        int n;
        int n2;
        int n3;
        class07211 class072112 = class07211.N((class07212)class07212.field_11056, (class07185)class071852);
        double d = -1.0;
        class07209 class072093 = null;
        double d2 = -1.0;
        class07209 class072094 = null;
        class08057 class080572 = this.m.method_8621();
        int n4 = Math.min(this.m.method_31600(), this.m.method_31607() + this.m.method_32819() - 1);
        boolean bl = true;
        class07218 class072182 = class072092.method_25503();
        for (class07218 class072183 : class07209.method_30512((class07209)class072092, (int)16, (class07211)class07211.field_11034, (class07211)class07211.field_11035)) {
            int n5 = Math.min(n4, this.m.method_8624(class07830.field_13197, class072183.method_10263(), class072183.method_10260()));
            if (!class080572.N((class07209)class072183) || !class080572.N((class07209)class072183.N(class072112, 1))) continue;
            class072183.N(class072112.b(), 1);
            for (n3 = n5; n3 >= this.m.method_31607(); --n3) {
                class072183.method_10099(n3);
                if (!this.N(class072183)) continue;
                n2 = n3;
                while (n3 > this.m.method_31607() && this.N(class072183.N(class07211.field_11033))) {
                    --n3;
                }
                if (n3 + 4 > n4 || (n = n2 - n3) > 0 && n < 3) continue;
                class072183.method_10099(n3);
                if (!this.N((class07209)class072183, class072182, class072112, 0)) continue;
                double d3 = class072092.method_10262((class00753)class072183);
                if (this.N((class07209)class072183, class072182, class072112, -1) && this.N((class07209)class072183, class072182, class072112, 1) && (d == -1.0 || d > d3)) {
                    d = d3;
                    class072093 = class072183.method_10062();
                }
                if (d != -1.0 || d2 != -1.0 && !(d2 > d3)) continue;
                d2 = d3;
                class072094 = class072183.method_10062();
            }
        }
        if (d == -1.0 && d2 != -1.0) {
            class072093 = class072094;
            d = d2;
        }
        if (d == -1.0) {
            int n6 = n4 - 9;
            int n7 = Math.max(this.m.method_31607() - -1, 70);
            if (n6 < n7) {
                return Optional.empty();
            }
            class072093 = new class07209(class072092.method_10263() - class072112.P() * 1, class04995.N((int)class072092.method_10264(), (int)n7, (int)n6), class072092.method_10260() - class072112.T() * 1).method_10062();
            class072093 = class080572.y(class072093);
            class07211 class072113 = class072112.R();
            for (n3 = -1; n3 < 2; ++n3) {
                for (n2 = 0; n2 < 2; ++n2) {
                    for (n = -1; n < 3; ++n) {
                        class00500 class005002 = n < 0 ? class00869.LV.W() : class00869.N.W();
                        class072182.N((class00753)class072093, n2 * class072112.P() + n3 * class072113.P(), n, n2 * class072112.T() + n3 * class072113.T());
                        this.m.method_8501((class07209)class072182, class005002);
                    }
                }
            }
        }
        for (int i = -1; i < 3; ++i) {
            for (int j = -1; j < 4; ++j) {
                if (i != -1 && i != 2 && j != -1 && j != 3) continue;
                class072182.N(class072093, i * class072112.P(), j, i * class072112.T());
                this.m.method_8652((class07209)class072182, class00869.LV.W(), 3);
            }
        }
        class00500 class005003 = (class00500)class00869.iq.W().y((class08092)class07136.y, (Comparable)class071852);
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < 3; ++j) {
                class072182.N(class072093, i * class072112.P(), j, i * class072112.T());
                this.m.method_8652((class07209)class072182, class005003, 18);
            }
        }
        return Optional.of(new class01009(class072093.method_10062(), 2, 3));
    }

    private boolean N(class07218 class072182) {
        class00500 class005002 = this.m.method_8320((class07209)class072182);
        return class005002.d() && class005002.Y().W();
    }

    private boolean N(class07209 class072092, class07218 class072182, class07211 class072112, int n) {
        class07211 class072113 = class072112.R();
        for (int i = -1; i < 3; ++i) {
            for (int j = -1; j < 4; ++j) {
                class072182.N((class00753)class072092, class072112.P() * i + class072113.P() * n, j, class072112.T() * i + class072113.T() * n);
                if (j < 0 && !this.m.method_8320((class07209)class072182).B()) {
                    return false;
                }
                if (j < 0 || this.N(class072182)) continue;
                return false;
            }
        }
        return true;
    }

    private static /* synthetic */ double N(class07209 class072092, class07209 class072093) {
        return class072093.method_10262((class00753)class072092);
    }
}

