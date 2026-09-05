/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.util.mod.fabric;

import com.terraformersmc.modmenu.util.mod.Mod$Badge;
import java.util.Optional;
import java.util.Set;

public class FabricMod$ModMenuData$DummyParentData {
    private final String id;
    private final Optional<String> name;
    private final Optional<String> description;
    private final Optional<String> icon;
    private final Set<Mod$Badge> badges;

    public FabricMod$ModMenuData$DummyParentData(String string, Optional<String> optional, Optional<String> optional2, Optional<String> optional3, Set<String> set) {
        this.id = string;
        this.name = optional;
        this.description = optional2;
        this.icon = optional3;
        this.badges = Mod$Badge.convert(set, string);
    }

    public Optional<String> getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public Optional<String> getDescription() {
        return this.description;
    }

    public Set<Mod$Badge> getBadges() {
        return this.badges;
    }

    public Optional<String> getIcon() {
        return this.icon;
    }
}

