/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.ModMetadata
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package net.fabricmc.fabric.impl.client.indigo;

import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.ModMetadata;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

@Environment(value=EnvType.CLIENT)
public class IndigoMixinConfigPlugin
implements IMixinConfigPlugin {
    private static final String JSON_KEY_DISABLE_INDIGO = "fabric-renderer-api-v1:contains_renderer";
    private static boolean needsLoad = true;
    private static boolean indigoApplicable = true;

    public String getRefMapperConfig() {
        return null;
    }

    public void acceptTargets(Set<String> set, Set<String> set2) {
    }

    public boolean shouldApplyMixin(String string, String string2) {
        return IndigoMixinConfigPlugin.shouldApplyIndigo();
    }

    public void onLoad(String string) {
    }

    public void preApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void postApply(String string, ClassNode classNode, String string2, IMixinInfo iMixinInfo) {
    }

    private static void loadIfNeeded() {
        if (needsLoad) {
            for (ModContainer modContainer : FabricLoader.getInstance().getAllMods()) {
                ModMetadata modMetadata = modContainer.getMetadata();
                if (!modMetadata.containsCustomValue(JSON_KEY_DISABLE_INDIGO)) continue;
                indigoApplicable = false;
            }
            needsLoad = false;
        }
    }

    static boolean shouldApplyIndigo() {
        IndigoMixinConfigPlugin.loadIfNeeded();
        return indigoApplicable;
    }
}

