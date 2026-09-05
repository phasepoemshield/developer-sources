/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2BooleanMap$Entry
 *  org.apache.logging.log4j.Logger
 */
package net.caffeinemc.mods.lithium.common.config;

import it.unimi.dsi.fastutil.objects.Object2BooleanLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import net.caffeinemc.mods.lithium.common.config.LithiumConfig;
import org.apache.logging.log4j.Logger;

public class Option {
    private final String name;
    private Object2BooleanLinkedOpenHashMap<Option> dependencies;
    private Set<String> modDefined = null;
    private boolean enabled;
    private boolean userDefined;

    public Option(String string, boolean bl, boolean bl2) {
        this.name = string;
        this.enabled = bl;
        this.userDefined = bl2;
    }

    public String getName() {
        return this.name;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public void setEnabled(boolean bl, boolean bl2) {
        this.enabled = bl;
        this.userDefined = bl2;
    }

    public void addDependency(Option option, boolean bl) {
        if (this.dependencies == null) {
            this.dependencies = new Object2BooleanLinkedOpenHashMap(1);
        }
        this.dependencies.put((Object)option, bl);
    }

    public boolean disableIfDependenciesNotMet(Logger logger, LithiumConfig lithiumConfig) {
        if (this.dependencies != null && this.isEnabled()) {
            for (Object2BooleanMap.Entry entry : this.dependencies.object2BooleanEntrySet()) {
                Option option = (Option)entry.getKey();
                boolean bl = entry.getBooleanValue();
                boolean bl2 = option.isEnabledRecursive(lithiumConfig);
                if (bl2 == bl) continue;
                this.enabled = false;
                logger.info("Option '{}' requires '{}={}' but found '{}'. Setting '{}={}'.", (Object)this.name, (Object)option.name, (Object)bl, (Object)bl2, (Object)this.name, (Object)this.enabled);
                return true;
            }
        }
        return false;
    }

    public void clearModsDefiningValue() {
        this.modDefined = null;
    }

    public boolean isEnabledRecursive(LithiumConfig lithiumConfig) {
        return this.enabled && (lithiumConfig.getParent(this) == null || lithiumConfig.getParent(this).isEnabledRecursive(lithiumConfig));
    }

    public Collection<String> getDefiningMods() {
        return this.modDefined != null ? Collections.unmodifiableCollection(this.modDefined) : Collections.emptyList();
    }

    public void addModOverride(boolean bl, String string) {
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

