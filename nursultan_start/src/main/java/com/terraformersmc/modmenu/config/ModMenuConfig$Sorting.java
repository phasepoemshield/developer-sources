/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.config;

import com.terraformersmc.modmenu.util.mod.Mod;
import java.util.Comparator;
import java.util.Locale;

public enum ModMenuConfig$Sorting {
    ASCENDING(Comparator.comparing(mod -> mod.getTranslatedName().toLowerCase(Locale.ROOT))),
    DESCENDING(ASCENDING.getComparator().reversed()),
    HAS_UPDATE(Comparator.comparing(Mod::hasUpdate).reversed());

    private final Comparator<Mod> comparator;

    public Comparator<Mod> getComparator() {
        return this.comparator;
    }

    private static /* synthetic */ Boolean lambda$static$1(Mod mod) {
        return mod.hasUpdate() || mod.getChildHasUpdate();
    }

    private ModMenuConfig$Sorting(Comparator<Mod> comparator) {
        this.comparator = comparator;
    }
}

