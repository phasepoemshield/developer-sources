/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.tree.ClassNode
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package net.caffeinemc.caffeineconfig;

import java.util.List;
import java.util.Set;
import net.caffeinemc.caffeineconfig.CaffeineConfig;
import net.caffeinemc.caffeineconfig.Option;
import org.objectweb.asm.tree.ClassNode;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public abstract class AbstractCaffeineConfigMixinPlugin
implements IMixinConfigPlugin {
    private CaffeineConfig config;

    private Logger logger() {
        return this.config.getLogger();
    }

    public String getRefMapperConfig() {
        return null;
    }

    public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    public boolean shouldApplyMixin(String string, String string2) {
        if (!string2.startsWith(this.mixinPackageRoot())) {
            throw new IllegalStateException(String.format("Expected mixin '%s' to start with package root '%s'!", string2, this.mixinPackageRoot()));
        }
        String string3 = string2.substring(this.mixinPackageRoot().length());
        Option option = this.config.getEffectiveOptionForMixin(string3);
        if (option == null) {
            throw new IllegalStateException(String.format("No options matched mixin '%s'! Mixins in this config must be under a registered option name", string3));
        }
        if (option.isOverridden()) {
            Object object = "[unknown]";
            if (option.isUserDefined()) {
                object = "user configuration";
            } else if (option.isModDefined()) {
                object = "mods [" + String.join((CharSequence)", ", option.getDefiningMods()) + "]";
            }
            if (option.isEnabled()) {
                this.logger().warn("Force-enabling mixin '{}' as option '{}' (added by {}) enables it", new Object[]{string3, option.getName(), object});
            } else {
                this.logger().warn("Force-disabling mixin '{}' as option '{}' (added by {}) disables it and children", new Object[]{string3, option.getName(), object});
            }
        }
        return option.isEnabled();
    }

    protected abstract CaffeineConfig createConfig();

    public void onLoad(String string) {
        this.config = this.createConfig();
        this.logger().info("Loaded configuration file for {}: {} options available, {} override(s) found", new Object[]{this.config.getModName(), this.config.getOptionCount(), this.config.getOptionOverrideCount()});
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    protected abstract String mixinPackageRoot();
}

