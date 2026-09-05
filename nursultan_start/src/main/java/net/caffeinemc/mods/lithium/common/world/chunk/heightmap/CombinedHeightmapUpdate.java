/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00570
 *  minecraft.class07209
 *  minecraft.class07218
 *  minecraft.class07841
 */
package net.caffeinemc.mods.lithium.common.world.chunk.heightmap;

import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00570;
import minecraft.class07209;
import minecraft.class07218;
import minecraft.class07841;
import net.caffeinemc.mods.lithium.mixin.world.combined_heightmap_update.HeightmapAccessor;

public class CombinedHeightmapUpdate {
    public static void updateHeightmaps(class07841 class078412, class07841 class078413, class07841 class078414, class07841 class078415, class00570 class005702, int n, int n2, int n3, class00500 class005002) {
        Predicate<class00500> predicate;
        int n4 = class078412.N(n, n3);
        int n5 = class078413.N(n, n3);
        int n6 = class078414.N(n, n3);
        int n7 = class078415.N(n, n3);
        int n8 = 4;
        if (n2 + 2 <= n4) {
            class078412 = null;
            --n8;
        }
        if (n2 + 2 <= n5) {
            class078413 = null;
            --n8;
        }
        if (n2 + 2 <= n6) {
            class078414 = null;
            --n8;
        }
        if (n2 + 2 <= n7) {
            class078415 = null;
            --n8;
        }
        if (n8 == 0) {
            return;
        }
        Predicate<class00500> predicate2 = class078412 == null ? null : Objects.requireNonNull(((HeightmapAccessor)class078412).getBlockPredicate());
        Predicate<class00500> predicate3 = class078413 == null ? null : Objects.requireNonNull(((HeightmapAccessor)class078413).getBlockPredicate());
        Predicate<class00500> predicate4 = class078414 == null ? null : Objects.requireNonNull(((HeightmapAccessor)class078414).getBlockPredicate());
        Predicate<class00500> predicate5 = predicate = class078415 == null ? null : Objects.requireNonNull(((HeightmapAccessor)class078415).getBlockPredicate());
        if (class078412 != null) {
            if (predicate2.test(class005002)) {
                if (n2 >= n4) {
                    ((HeightmapAccessor)class078412).callSet(n, n3, n2 + 1);
                }
                class078412 = null;
                --n8;
            } else if (n4 != n2 + 1) {
                class078412 = null;
                --n8;
            }
        }
        if (class078413 != null) {
            if (predicate3.test(class005002)) {
                if (n2 >= n5) {
                    ((HeightmapAccessor)class078413).callSet(n, n3, n2 + 1);
                }
                class078413 = null;
                --n8;
            } else if (n5 != n2 + 1) {
                class078413 = null;
                --n8;
            }
        }
        if (class078414 != null) {
            if (predicate4.test(class005002)) {
                if (n2 >= n6) {
                    ((HeightmapAccessor)class078414).callSet(n, n3, n2 + 1);
                }
                class078414 = null;
                --n8;
            } else if (n6 != n2 + 1) {
                class078414 = null;
                --n8;
            }
        }
        if (class078415 != null) {
            if (predicate.test(class005002)) {
                if (n2 >= n7) {
                    ((HeightmapAccessor)class078415).callSet(n, n3, n2 + 1);
                }
                class078415 = null;
                --n8;
            } else if (n7 != n2 + 1) {
                class078415 = null;
                --n8;
            }
        }
        if (n8 == 0) {
            return;
        }
        class07218 class072182 = new class07218();
        int n9 = class005702.method_31607();
        for (int i = n2 - 1; i >= n9 && n8 > 0; --i) {
            class072182.N(n, i, n3);
            class00500 class005003 = class005702.method_8320((class07209)class072182);
            if (class078412 != null && predicate2.test(class005003)) {
                ((HeightmapAccessor)class078412).callSet(n, n3, i + 1);
                class078412 = null;
                --n8;
            }
            if (class078413 != null && predicate3.test(class005003)) {
                ((HeightmapAccessor)class078413).callSet(n, n3, i + 1);
                class078413 = null;
                --n8;
            }
            if (class078414 != null && predicate4.test(class005003)) {
                ((HeightmapAccessor)class078414).callSet(n, n3, i + 1);
                class078414 = null;
                --n8;
            }
            if (class078415 == null || !predicate.test(class005003)) continue;
            ((HeightmapAccessor)class078415).callSet(n, n3, i + 1);
            class078415 = null;
            --n8;
        }
        if (class078412 != null) {
            ((HeightmapAccessor)class078412).callSet(n, n3, n9);
        }
        if (class078413 != null) {
            ((HeightmapAccessor)class078413).callSet(n, n3, n9);
        }
        if (class078414 != null) {
            ((HeightmapAccessor)class078414).callSet(n, n3, n9);
        }
        if (class078415 != null) {
            ((HeightmapAccessor)class078415).callSet(n, n3, n9);
        }
    }
}

