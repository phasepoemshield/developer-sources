/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntList
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import com.viaversion.viaversion.api.data.FullMappingsBase;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;

public class ParticleMappings
extends FullMappingsBase {
    private final IntList itemParticleIds = new IntArrayList(4);
    private final IntList blockParticleIds = new IntArrayList(4);

    public ParticleMappings(MappingDataLoader.IdentifiersPair identifiersPair, Mappings mappings) {
        super(identifiersPair, mappings);
        this.addBlockParticle("block");
        this.addBlockParticle("falling_dust");
        this.addBlockParticle("block_marker");
        this.addBlockParticle("dust_pillar");
        this.addBlockParticle("block_crumble");
        this.addItemParticle("item");
    }

    @Override
    public String mappedIdentifier(int n) {
        if (n == FootStepParticle1_12_2.RAW_ID) {
            return "";
        }
        return super.mappedIdentifier(n);
    }

    public boolean isBlockParticle(int n) {
        return this.blockParticleIds.contains(n);
    }

    public boolean isItemParticle(int n) {
        return this.itemParticleIds.contains(n);
    }

    @Override
    public int getNewId(int n) {
        if (n == FootStepParticle1_12_2.RAW_ID) {
            return n;
        }
        return super.getNewId(n);
    }

    public boolean addBlockParticle(String string) {
        int n = this.id(string);
        return n != -1 && this.blockParticleIds.add(n);
    }

    public boolean addItemParticle(String string) {
        int n = this.id(string);
        return n != -1 && this.itemParticleIds.add(n);
    }
}

