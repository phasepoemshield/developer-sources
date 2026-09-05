/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.movement.constants.LithiumWorkaround
 *  net.fabricmc.loader.api.FabricLoader
 *  org.objectweb.asm.tree.ClassNode
 *  org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin
 *  org.spongepowered.asm.mixin.extensibility.IMixinInfo
 */
package com.viaversion.viafabricplus.injection;

import com.viaversion.viafabricplus.features.movement.constants.LithiumWorkaround;
import com.viaversion.viafabricplus.features.movement.elytra.FabricAPIWorkaround;
import java.util.List;
import java.util.Set;
import net.fabricmc.loader.api.FabricLoader;
import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

public final class ViaFabricPlusMixinPlugin
implements IMixinConfigPlugin {
    private static final String MIXINS_PACKAGE = "com.viaversion.viafabricplus.injection.mixin.";
    public static boolean IPNEXT_PRESENT;
    public static boolean MORE_CULLING_PRESENT;
    public static boolean LITHIUM_PRESENT;
    public static boolean MOONRISE_PRESENT;
    public static boolean LEGENDARYTOOLTIPS_PRESENT;
    public static boolean LEGACY_PRESENT;

    public void onLoad(String mixinPackage) {
        FabricLoader loader = FabricLoader.getInstance();
        IPNEXT_PRESENT = loader.isModLoaded("inventoryprofilesnext");
        MORE_CULLING_PRESENT = loader.isModLoaded("moreculling");
        LITHIUM_PRESENT = loader.isModLoaded("lithium");
        MOONRISE_PRESENT = loader.isModLoaded("moonrise");
        LEGENDARYTOOLTIPS_PRESENT = loader.isModLoaded("legendarytooltips");
        LEGACY_PRESENT = loader.isModLoaded("legacy");
        FabricAPIWorkaround.init();
        LithiumWorkaround.init();
    }

    public String getRefMapperConfig() {
        return null;
    }

    public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
        return switch (mixinClassName) {
            case "com.viaversion.viafabricplus.injection.mixin.compat.ipnext.MixinAutoRefillHandler_ItemSlotMonitor" -> IPNEXT_PRESENT;
            case "com.viaversion.viafabricplus.injection.mixin.compat.lithium.MixinEntity" -> {
                if (LITHIUM_PRESENT && !MOONRISE_PRESENT) {
                    yield true;
                }
                yield false;
            }
            case "com.viaversion.viafabricplus.injection.mixin.features.item.attack_damage.MixinItemStack" -> {
                if (!LEGENDARYTOOLTIPS_PRESENT) {
                    yield true;
                }
                yield false;
            }
            case "com.viaversion.viafabricplus.injection.mixin.features.item.negative_item_count.MixinGuiGraphics" -> {
                if (!LEGACY_PRESENT) {
                    yield true;
                }
                yield false;
            }
            default -> true;
        };
    }

    public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
    }

    public List<String> getMixins() {
        return null;
    }

    public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }

    public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
    }
}

