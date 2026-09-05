/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01234
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07299
 *  net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.EntitySectionAccessor
 */
package net.caffeinemc.mods.lithium.common.tracking.entity;

import java.util.ArrayList;
import java.util.List;
import minecraft.class00734;
import minecraft.class01234;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07299;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntitySectionAccessor;

public class SectionedItemEntityMovementTracker<S extends class07049>
extends SectionedEntityMovementTracker<class07049> {
    public SectionedItemEntityMovementTracker(WorldSectionBox worldSectionBox, Class<S> clazz) {
        super(worldSectionBox, clazz);
    }

    public static <S extends class07049> SectionedItemEntityMovementTracker<S> registerAt(class04782 class047822, class00734 class007342, Class<S> clazz) {
        WorldSectionBox worldSectionBox = WorldSectionBox.entityAccessBox((class07299)class047822, (class00734)class007342);
        SectionedItemEntityMovementTracker sectionedItemEntityMovementTracker = new SectionedItemEntityMovementTracker(worldSectionBox, clazz);
        sectionedItemEntityMovementTracker = (SectionedItemEntityMovementTracker)((LithiumData)class047822).lithium$getData().entityMovementTrackers().getCanonical(sectionedItemEntityMovementTracker);
        sectionedItemEntityMovementTracker.register(class047822);
        return sectionedItemEntityMovementTracker;
    }

    public List<S> getEntities(class00734 class007342) {
        ArrayList<class07049> arrayList = new ArrayList<class07049>();
        for (int i = 0; i < this.sortedSections.size(); ++i) {
            if (!this.sectionVisible[i]) continue;
            class01234 class012342 = ((EntitySectionAccessor)this.sortedSections.get(i)).getCollection();
            for (class07049 class070492 : class012342.N((Class)this.clazz)) {
                class00734 class007343;
                if (!class070492.method_5805() || !(class007343 = class070492.method_5829()).L(class007342)) continue;
                arrayList.add(class070492);
            }
        }
        return arrayList;
    }
}

