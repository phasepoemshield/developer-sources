/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 */
package com.viaversion.viaversion.protocols.v1_21_11to26_1.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;

public final class MappingData26_1
extends MappingDataBase {
    private IntSet fluidBlockStates;
    private CompoundTag catSoundVariants;
    private CompoundTag cowSoundVariants;
    private CompoundTag pigSoundVariants;
    private CompoundTag chickenSoundVariants;

    protected void loadExtras(CompoundTag data) {
        CompoundTag tag = MappingDataLoader.INSTANCE.loadNBTFromFile("sound-variant-registries-26.1.nbt");
        this.catSoundVariants = tag.getCompoundTag("cat_sound_variant");
        this.cowSoundVariants = tag.getCompoundTag("cow_sound_variant");
        this.pigSoundVariants = tag.getCompoundTag("pig_sound_variant");
        this.chickenSoundVariants = tag.getCompoundTag("chicken_sound_variant");
        this.fluidBlockStates = new IntOpenHashSet(MappingDataLoader.INSTANCE.loadNBTFromFile("fluids-26.1.nbt").getIntArrayTag("fluids").getValue());
    }

    public MappingData26_1() {
        super("1.21.11", "26.1");
    }

    public CompoundTag chickenSoundVariants() {
        return this.chickenSoundVariants;
    }

    public CompoundTag cowSoundVariants() {
        return this.cowSoundVariants;
    }

    public CompoundTag pigSoundVariants() {
        return this.pigSoundVariants;
    }

    public CompoundTag catSoundVariants() {
        return this.catSoundVariants;
    }

    public IntSet fluidBlockStates() {
        return this.fluidBlockStates;
    }
}

