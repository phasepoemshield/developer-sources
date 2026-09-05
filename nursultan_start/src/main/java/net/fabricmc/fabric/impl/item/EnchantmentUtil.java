/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01079
 *  minecraft.class01283
 *  minecraft.class05946
 *  minecraft.class07286
 *  minecraft.class07301
 *  minecraft.class07304
 *  net.fabricmc.fabric.api.item.v1.EnchantmentEvents
 *  net.fabricmc.fabric.api.item.v1.EnchantmentEvents$Modify
 *  net.fabricmc.fabric.api.item.v1.EnchantmentSource
 *  net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource
 *  net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator
 *  net.fabricmc.fabric.mixin.item.EnchantmentBuilderAccessor
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.item;

import java.util.List;
import minecraft.class01079;
import minecraft.class01283;
import minecraft.class05946;
import minecraft.class07286;
import minecraft.class07301;
import minecraft.class07304;
import net.fabricmc.fabric.api.item.v1.EnchantmentEvents;
import net.fabricmc.fabric.api.item.v1.EnchantmentSource;
import net.fabricmc.fabric.impl.item.EnchantmentUtil$BuilderExtensions;
import net.fabricmc.fabric.impl.resource.pack.BuiltinModResourcePackSource;
import net.fabricmc.fabric.impl.resource.pack.ModResourcePackCreator;
import net.fabricmc.fabric.mixin.item.EnchantmentBuilderAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnchantmentUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(EnchantmentUtil.class);

    private EnchantmentUtil() {
    }

    public static @Nullable class07304 modify(class05946<class07304> class059462, class07304 class073042, EnchantmentSource enchantmentSource) {
        class07301 class073012 = class07304.N((class07286)class073042.M());
        EnchantmentBuilderAccessor enchantmentBuilderAccessor = (EnchantmentBuilderAccessor)class073012;
        EnchantmentUtil$BuilderExtensions enchantmentUtil$BuilderExtensions = (EnchantmentUtil$BuilderExtensions)class073012;
        class073012.N(class073042.B());
        enchantmentBuilderAccessor.getEffectMap().N(class073042.Z());
        class073042.Z().L().forEach(class024802 -> {
            Object object = class024802.y();
            if (object instanceof List) {
                List list = (List)object;
                enchantmentBuilderAccessor.invokeGetEffectsList(class024802.N()).addAll(list);
            }
        });
        enchantmentUtil$BuilderExtensions.fabric$resetModified();
        ((EnchantmentEvents.Modify)EnchantmentEvents.MODIFY.invoker()).modify(class059462, class073012, enchantmentSource);
        if (enchantmentUtil$BuilderExtensions.fabric$didModify()) {
            LOGGER.debug("Enchantment {} was modified", (Object)class059462.N());
            return new class07304(class073042.R(), enchantmentBuilderAccessor.getDefinition(), enchantmentBuilderAccessor.getExclusiveSet(), enchantmentBuilderAccessor.getEffectMap().N());
        }
        return null;
    }

    public static EnchantmentSource determineSource(class01079 class010792) {
        if (class010792 != null) {
            class01283 class012832 = class010792.getFabricPackSource();
            if (class012832 == class01283.L) {
                return EnchantmentSource.VANILLA;
            }
            if (class012832 == ModResourcePackCreator.RESOURCE_PACK_SOURCE || class012832 instanceof BuiltinModResourcePackSource) {
                return EnchantmentSource.MOD;
            }
        }
        return EnchantmentSource.DATA_PACK;
    }
}

