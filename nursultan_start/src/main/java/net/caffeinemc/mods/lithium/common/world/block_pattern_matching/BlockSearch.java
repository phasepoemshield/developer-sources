/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01296
 *  minecraft.class02334
 *  minecraft.class05474
 *  minecraft.class05487
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord
 *  net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex
 */
package net.caffeinemc.mods.lithium.common.world.block_pattern_matching;

import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01296;
import minecraft.class02334;
import minecraft.class05474;
import minecraft.class05487;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.Pos;

public class BlockSearch {
    public static boolean hasAtLeast(class05487 class054872, class02334 class023342, class00891 class008912, int n) {
        Predicate<class00500> predicate = class005002 -> class005002.N(class008912);
        for (int i = class01296.N((int)class023342.R().method_10263()); i <= class01296.N((int)class023342.M().method_10263()); ++i) {
            for (int j = class01296.N((int)class023342.R().method_10260()); j <= class01296.N((int)class023342.M().method_10260()); ++j) {
                class08050 class080502 = class054872.method_8392(i, j);
                int n2 = Pos.SectionYIndex.fromBlockCoord((class05474)class054872, (int)class023342.R().method_10264());
                int n3 = Pos.SectionYIndex.fromBlockCoord((class05474)class054872, (int)class023342.M().method_10264());
                for (int k = n2; k <= n3; ++k) {
                    if (k >= 0 && k < class080502.method_32890()) {
                        class00554 class005542 = class080502.y(k);
                        if (!class005542.N(predicate)) continue;
                        int n4 = Pos.SectionYCoord.fromSectionIndex((class05474)class054872, (int)k);
                        if ((n -= BlockSearch.countBlocksInBoxInSection(class005542, Math.max(class023342.R().method_10263(), i << 4), Math.max(class023342.R().method_10264(), n4 << 4), Math.max(class023342.R().method_10260(), j << 4), Math.min(class023342.M().method_10263(), (i << 4) + 15), Math.min(class023342.M().method_10264(), (n4 << 4) + 15), Math.min(class023342.M().method_10260(), (j << 4) + 15), class008912, n)) > 0) continue;
                        return true;
                    }
                    if (class008912 != class00869.mh) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static int countBlocksInBoxInSection(class00554 class005542, int n, int n2, int n3, int n4, int n5, int n6, class00891 class008912, int n7) {
        int n8 = 0;
        for (int i = n2; i <= n5; ++i) {
            for (int j = n3; j <= n6; ++j) {
                for (int k = n; k <= n4; ++k) {
                    if (!class005542.N(k & 0xF, i & 0xF, j & 0xF).N(class008912) || ++n8 < n7) continue;
                    return n8;
                }
            }
        }
        return n8;
    }
}

