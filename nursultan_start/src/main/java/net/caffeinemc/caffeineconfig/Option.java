/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  org.slf4j.Logger
 */
package net.caffeinemc.caffeineconfig;

import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import net.caffeinemc.caffeineconfig.CaffeineConfig;
import org.slf4j.Logger;

public final class Option {
    private final String name;
    private Object2BooleanLinkedOpenHashMap<Option> dependencies;
    private Set<String> modDefined = null;
    private boolean enabled;
    private boolean userDefined;
    private boolean overrideable;

    Option(String string, boolean bl, boolean bl2, boolean bl3) {
        this.name = string;
        this.enabled = bl;
        this.userDefined = bl2;
        this.overrideable = bl3;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isOverrideable() {
        return this.overrideable;
    }

    void setEnabled(boolean bl, boolean bl2) {
        this.enabled = bl;
        this.userDefined = bl2;
    }

    void addDependency(Option option, boolean bl) {
        if (this.dependencies == null) {
            this.dependencies = new Object2BooleanLinkedOpenHashMap(1);
        }
        this.dependencies.put((Object)option, bl);
    }

    boolean disableIfDependenciesNotMet(Logger logger, CaffeineConfig caffeineConfig) {
        if (this.dependencies != null && this.isEnabled()) {
            for (Object2BooleanMap.Entry entry : this.dependencies.object2BooleanEntrySet()) {
                Option option = (Option)entry.getKey();
                boolean bl = entry.getBooleanValue();
                if (option.isEnabledRecursive(caffeineConfig) == bl) continue;
                this.enabled = false;
                logger.warn("Option '{}' requires '{}={}' but found '{}'. Setting '{}={}'.", new Object[]{this.name, option.name, bl, option.isEnabled(), this.name, this.enabled});
                return true;
            }
        }
        return false;
    }

    void clearModsDefiningValue() {
        this.modDefined = null;
    }

    void setOverrideable(boolean bl) {
        this.overrideable = bl;
    }

    public boolean isEnabledRecursive(CaffeineConfig caffeineConfig) {
        return this.enabled && (caffeineConfig.getParent(this) == null || caffeineConfig.getParent(this).isEnabledRecursive(caffeineConfig));
    }

    public Collection<String> getDefiningMods() {
        return this.modDefined != null ? Collections.unmodifiableCollection(this.modDefined) : Collections.emptyList();
    }

    void addModOverride(boolean bl, String string) {
        this.enabled = bl;
        if (this.modDefined == null) {
            this.modDefined = new LinkedHashSet<String>();
        }
        this.modDefined.add(string);
    }

    public boolean isOverridden() {
        return this.isUserDefined() || this.isModDefined();
    }

    public boolean isUserDefined() {
        return this.userDefined;
    }

    public boolean isModDefined() {
        return this.modDefined != null;
    }
}

