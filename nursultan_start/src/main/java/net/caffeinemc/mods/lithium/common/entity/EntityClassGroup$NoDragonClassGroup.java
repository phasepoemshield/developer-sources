/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00690
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class07144
 */
package net.caffeinemc.mods.lithium.common.entity;

import java.util.function.BiPredicate;
import java.util.function.Supplier;
import minecraft.class00690;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class07144;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;

public class EntityClassGroup$NoDragonClassGroup
extends EntityClassGroup {
    public static final EntityClassGroup$NoDragonClassGroup BOAT_SHULKER_LIKE_COLLISION;

    public EntityClassGroup$NoDragonClassGroup(BiPredicate<Class<?>, Supplier<class07078<?>>> biPredicate) {
        super(biPredicate);
        if (biPredicate.test(class00690.class, () -> {
            throw new IllegalArgumentException("EntityClassGroup.NoDragonClassGroup cannot be initialized: Must exclude EnderDragonEntity without checking entity type!");
        })) {
            throw new IllegalArgumentException("EntityClassGroup.NoDragonClassGroup cannot be initialized: Must exclude EnderDragonEntity!");
        }
    }

    static {
        String string = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1297", "method_30948", "(Lnet/minecraft/class_1297;)Z", "canBeCollidedWith");
        BOAT_SHULKER_LIKE_COLLISION = new EntityClassGroup$NoDragonClassGroup((clazz, supplier) -> ReflectionUtil.hasMethodOverride(clazz, class07049.class, true, string, class07049.class));
        if (!BOAT_SHULKER_LIKE_COLLISION.contains(class07144.class, class07078.yU)) {
            throw new AssertionError();
        }
        BOAT_SHULKER_LIKE_COLLISION.clear();
    }
}

