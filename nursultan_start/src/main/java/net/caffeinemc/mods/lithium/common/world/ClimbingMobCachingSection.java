/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class04218
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate
 *  net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity
 */
package net.caffeinemc.mods.lithium.common.world;

import java.util.ArrayList;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class04218;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity;

public interface ClimbingMobCachingSection {
    public class04218 lithium$collectPushableEntities(class07299 var1, class07049 var2, class00734 var3, EntityPushablePredicate<? super class07049> var4, ArrayList<class07049> var5);

    public void lithium$onEntityModifiedCachedBlock(FeetBlockCachingEntity var1, class00500 var2);
}

