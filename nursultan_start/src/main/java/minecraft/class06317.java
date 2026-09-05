/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  minecraft.class00737
 *  minecraft.class03927
 *  minecraft.class04119
 *  minecraft.class04137
 *  minecraft.class05352
 *  minecraft.class05368
 *  minecraft.class05372
 *  minecraft.class05378
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07438
 *  net.caffeinemc.mods.lithium.common.util.POIRegistryEntries
 *  net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00737;
import minecraft.class03927;
import minecraft.class04119;
import minecraft.class04137;
import minecraft.class05352;
import minecraft.class05368;
import minecraft.class05372;
import minecraft.class05378;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06289;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07438;
import net.caffeinemc.mods.lithium.common.util.POIRegistryEntries;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.SinglePointOfInterestTypeFilter;

public class class06317 {
    private static Optional N(class05368 class053682, Predicate predicate, Predicate predicate2, class07209 class072092, int n, class05372 class053722) {
        return class053682.u((Predicate)new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), predicate2, class072092, n, class053722);
    }

    private static Optional N(class05368 class053682, Predicate predicate, Predicate predicate2, class05372 class053722, class07209 class072092, int n, class06069 class060692) {
        return class053682.N((Predicate)new SinglePointOfInterestTypeFilter(POIRegistryEntries.HOME_ENTRY), predicate2, class053722, class072092, n, class060692);
    }

    public static class04119<class07438> N(int n, float f, int n2) {
        return class04137.N_42(class041282 -> class041282.group((App)class041282.L(class05378.m), (App)class041282.N(class05378.y), (App)class041282.N(class05378.O), (App)class041282.N(class05378.n), (App)class041282.N(class05378.P), (App)class041282.N(class05378.j), (App)class041282.N(class05378.b)).apply((Applicative)class041282, (class041392, class041393, class041394, class041395, class041396, class041397, class041398) -> (class047822, class074382, l) -> {
            class06317.N(class047822.method_19494(), class035562 -> class035562.N(class03927.m), class072092 -> true, class074382.method_24515(), n2 + 1, class05372.field_18489).filter(class072092 -> class072092.method_19769((class00737)class074382.method_73189(), (double)n2)).or(() -> class06317.N(class047822.method_19494(), class035562 -> class035562.N(class03927.m), class072092 -> true, class05372.field_18489, class074382.method_24515(), n, class074382.method_59922())).or(() -> class041282.N(class041393).map(class06289::y)).ifPresent(class072092 -> {
                class041395.y();
                class041396.y();
                class041397.y();
                class041398.y();
                class041394.N((Object)class06289.N((class05946<class07299>)class047822.method_27983(), class072092));
                if (!class072092.method_19769((class00737)class074382.method_73189(), (double)n2)) {
                    class041392.N((Object)new class05352(class072092, f, n2));
                }
            });
            return true;
        }));
    }
}

