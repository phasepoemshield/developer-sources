/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.platform.IrisPlatformHelpers
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package net.irisshaders.iris.compat.dh;

import java.util.List;
import java.util.Set;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public class DHMixinConfigPlugin
implements IMixinConfigPlugin {
    public String getRefMapperConfig() {
        return null;
    }

    public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    public boolean shouldApplyMixin(String string, String string2) {
        return IrisPlatformHelpers.getInstance().isModLoaded("distanthorizons");
    }

    public void onLoad(String string) {
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public List<String> getMixins() {
        return List.of();
    }

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }
}

