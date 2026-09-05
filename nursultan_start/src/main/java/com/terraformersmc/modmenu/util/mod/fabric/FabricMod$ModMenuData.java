/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import com.terraformersmc.modmenu.util.mod.fabric.FabricMod$ModMenuData$DummyParentData;
import java.util.Optional;
import java.util.Set;

class FabricMod$ModMenuData {
    final Set<Mod$Badge> badges;
    Optional<String> parent;
    private final FabricMod$ModMenuData$DummyParentData dummyParentData;

    public FabricMod$ModMenuData(Set<String> set, Optional<String> optional, FabricMod$ModMenuData$DummyParentData fabricMod$ModMenuData$DummyParentData, String string) {
        this.badges = Mod$Badge.convert(set, string);
        this.parent = optional;
        this.dummyParentData = fabricMod$ModMenuData$DummyParentData;
    }

    public Optional<String> getParent() {
        return this.parent;
    }

    public Set<Mod$Badge> getBadges() {
        return this.badges;
    }

    public void addClientBadge(boolean bl) {
        if (bl) {
            this.badges.add(Mod$Badge.CLIENT);
        }
    }

    public void addLibraryBadge(boolean bl) {
        if (bl) {
            this.badges.add(Mod$Badge.LIBRARY);
        }
    }

    public void fillParentIfEmpty(String string) {
        if (!this.parent.isPresent()) {
            this.parent = Optional.of(string);
        }
    }

    public FabricMod$ModMenuData$DummyParentData getDummyParentData() {
        return this.dummyParentData;
    }
}

