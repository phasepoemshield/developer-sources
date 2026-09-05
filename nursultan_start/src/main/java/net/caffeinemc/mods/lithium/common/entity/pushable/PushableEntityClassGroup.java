/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00245
 *  minecraft.class00681
 *  minecraft.class00690
 *  minecraft.class04003
 *  minecraft.class07049
 *  minecraft.class07438
 *  minecraft.class07632
 *  minecraft.class08036
 */
package net.caffeinemc.mods.lithium.common.entity.pushable;

import minecraft.class00245;
import minecraft.class00681;
import minecraft.class00690;
import minecraft.class04003;
import minecraft.class07049;
import minecraft.class07438;
import minecraft.class07632;
import minecraft.class08036;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup;
import net.caffeinemc.mods.lithium.common.reflection.ReflectionUtil;
import net.caffeinemc.mods.lithium.common.services.PlatformMappingInformation;

public class PushableEntityClassGroup {
    public static final EntityClassGroup CACHABLE_UNPUSHABILITY;
    public static final EntityClassGroup MAYBE_PUSHABLE;

    static {
        String string = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1309", "method_6101", "()Z", "onClimbable");
        String string2 = PlatformMappingInformation.INSTANCE.mapMethodName("intermediary", "net.minecraft.class_1297", "method_5810", "()Z", "isPushable");
        CACHABLE_UNPUSHABILITY = new EntityClassGroup((clazz, supplier) -> {
            if (class07438.class.isAssignableFrom((Class<?>)clazz) && !class08036.class.isAssignableFrom((Class<?>)clazz) && !ReflectionUtil.hasMethodOverride(clazz, class07438.class, true, string, new Class[0])) {
                if (class00245.class.isAssignableFrom((Class<?>)clazz)) {
                    return !ReflectionUtil.hasMethodOverride(clazz, class00245.class, true, string2, new Class[0]);
                }
                if (class04003.class.isAssignableFrom((Class<?>)clazz)) {
                    return !ReflectionUtil.hasMethodOverride(clazz, class04003.class, true, string2, new Class[0]);
                }
                return !ReflectionUtil.hasMethodOverride(clazz, class07438.class, true, string2, new Class[0]);
            }
            return false;
        });
        MAYBE_PUSHABLE = new EntityClassGroup((clazz, supplier) -> {
            if (ReflectionUtil.hasMethodOverride(clazz, class07049.class, true, string2, new Class[0])) {
                if (class00690.class.isAssignableFrom((Class<?>)clazz)) {
                    return false;
                }
                if (class00681.class.isAssignableFrom((Class<?>)clazz)) {
                    return ReflectionUtil.hasMethodOverride(clazz, class00681.class, true, string2, new Class[0]);
                }
                if (class07632.class.isAssignableFrom((Class<?>)clazz)) {
                    return ReflectionUtil.hasMethodOverride(clazz, class07632.class, true, string2, new Class[0]);
                }
                return true;
            }
            return class08036.class.isAssignableFrom((Class<?>)clazz);
        });
    }
}

