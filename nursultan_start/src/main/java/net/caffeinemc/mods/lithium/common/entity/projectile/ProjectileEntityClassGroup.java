/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00690
 *  minecraft.class01217
 *  minecraft.class01952
 *  minecraft.class02260
 *  minecraft.class07049
 *  minecraft.class07078
 *  minecraft.class08002
 *  minecraft.class08005
 *  minecraft.class08007
 *  minecraft.class08039
 */
package net.caffeinemc.mods.lithium.common.entity.projectile;

import minecraft.class00690;
import minecraft.class01217;
import minecraft.class01952;
import minecraft.class02260;
import minecraft.class07049;
import minecraft.class07078;
import minecraft.class08002;
import minecraft.class08005;
import minecraft.class08007;
import minecraft.class08039;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;

public class ProjectileEntityClassGroup {
    public static final EntityClassGroup OPTIMIZED_PROJECTILES;
    public static final EntityClassGroup CAN_MAYBE_BE_HIT_BY_OPTIMIZED_PROJECTILE;

    static {
        String string = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1676", "method_26958", "(Lnet/minecraft/class_1297;)Z", "canHitEntity");
        OPTIMIZED_PROJECTILES = new EntityClassGroup((clazz, supplier) -> {
            Class<class08005> clazz2 = class08005.class;
            if (class08039.class.isAssignableFrom((Class<?>)clazz)) {
                clazz2 = class08039.class;
                if (class02260.class.isAssignableFrom((Class<?>)clazz)) {
                    clazz2 = class02260.class;
                }
            } else if (class08007.class.isAssignableFrom((Class<?>)clazz)) {
                clazz2 = class08007.class;
            } else if (class08002.class.isAssignableFrom((Class<?>)clazz)) {
                clazz2 = class08002.class;
            }
            return !ReflectionUtil.hasMethodOverride(clazz, clazz2, true, string, class07049.class);
        });
        String string2 = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1297", "method_49108", "()Z", "canBeHitByProjectile");
        String string3 = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1297", "method_5863", "()Z", "isPickable");
        CAN_MAYBE_BE_HIT_BY_OPTIMIZED_PROJECTILE = new EntityClassGroup((clazz, supplier) -> {
            Class<class07049> clazz2 = class07049.class;
            if (class01952.class == clazz) {
                return false;
            }
            if (ReflectionUtil.hasMethodOverride(clazz, class07049.class, true, string2, new Class[0])) {
                return true;
            }
            if (class00690.class == clazz) {
                return false;
            }
            if (class08005.class.isAssignableFrom((Class<?>)clazz)) {
                clazz2 = class08005.class;
                if (class08007.class.isAssignableFrom((Class<?>)clazz)) {
                    clazz2 = class08007.class;
                }
                if (((class07078)supplier.get()).N(class01217.q)) {
                    return true;
                }
            }
            return ReflectionUtil.hasMethodOverride(clazz, clazz2, true, string3, new Class[0]);
        });
    }
}

