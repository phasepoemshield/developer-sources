/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00695
 *  minecraft.class00734
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.services.PlatformEntityAccess
 */
package net.caffeinemc.mods.lithium.fabric;

import java.util.ArrayList;
import java.util.function.Predicate;
import minecraft.class00695;
import minecraft.class00734;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.services.PlatformEntityAccess;

public class FabricEntityAccess
implements PlatformEntityAccess {
    public void addEnderDragonParts(class07299 class072992, class07049 class070492, class00734 class007342, Predicate<? super class07049> predicate, ArrayList<class07049> arrayList) {
        for (class00695 class006952 : class072992.method_65097()) {
            if (class006952 == class070492 || class006952.N == class070492 || !predicate.test((class07049)class006952) || !class007342.L(class006952.method_5829())) continue;
            arrayList.add((class07049)class006952);
        }
    }
}

