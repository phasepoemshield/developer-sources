/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 */
package net.caffeinemc.mods.lithium.common.tracking.entity;

import minecraft.class00734;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.entity.EntityClassGroup$NoDragonClassGroup;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox;
import net.caffeinemc.mods.lithium.common.world.LithiumData;

public class SectionedColliderEntityMovementTracker
extends SectionedEntityMovementTracker<class07049> {
    public static final boolean ENABLED = false;

    public SectionedColliderEntityMovementTracker(WorldSectionBox worldSectionBox) {
        super(worldSectionBox, EntityClassGroup$NoDragonClassGroup.BOAT_SHULKER_LIKE_COLLISION);
    }

    public static SectionedColliderEntityMovementTracker registerAt(class04782 class047822, class00734 class007342) {
        WorldSectionBox worldSectionBox = WorldSectionBox.entityAccessBox((class07299)class047822, (class00734)class007342);
        SectionedColliderEntityMovementTracker sectionedColliderEntityMovementTracker = new SectionedColliderEntityMovementTracker(worldSectionBox);
        sectionedColliderEntityMovementTracker = (SectionedColliderEntityMovementTracker)((LithiumData)class047822).lithium$getData().entityMovementTrackers().getCanonical((Object)sectionedColliderEntityMovementTracker);
        sectionedColliderEntityMovementTracker.register(class047822);
        return sectionedColliderEntityMovementTracker;
    }
}

