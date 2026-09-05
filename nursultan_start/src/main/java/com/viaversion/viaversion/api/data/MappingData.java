/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.MappingData$1
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.viaversion.api.data.BiMappings;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.RegistryKey;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.TagData;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.util.Key;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface MappingData {
    public void load();

    public @Nullable FullMappings getFullItemMappings();

    public @Nullable Mappings getEnchantmentMappings();

    public @Nullable Mappings getBlockStateMappings();

    public @Nullable FullMappings getBlockEntityMappings();

    public @Nullable ParticleMappings getParticleMappings();

    public @Nullable FullMappings getAttributeMappings();

    public @Nullable FullMappings getArgumentTypeMappings();

    public @Nullable FullMappings getFullSoundMappings();

    public @Nullable FullMappings getEntityMappings();

    public int getNewBlockStateId(int var1);

    public int getOldItemId(int var1);

    public @Nullable BiMappings getItemMappings();

    public @Nullable Mappings getMenuMappings();

    public int getNewItemId(int var1);

    public @Nullable Mappings getBlockMappings();

    public int getNewBlockId(int var1);

    public int getNewParticleId(int var1);

    public @Nullable FullMappings getDataComponentSerializerMappings();

    public @Nullable FullMappings getRecipeSerializerMappings();

    public @Nullable Mappings getStatisticsMappings();

    public @Nullable Mappings getPaintingMappings();

    public @Nullable FullMappings getSlotDisplayMappings();

    public @Nullable FullMappings getFullBlockMappings();

    public @Nullable List<TagData> getTags(RegistryType var1);

    public int getNewSoundId(int var1);

    public @Nullable Mappings getSoundMappings();

    public int getOldSoundId(int var1);

    public @Nullable IntSet changedBlocks();

    public int getNewAttributeId(int var1);

    default public @Nullable FullMappings getFullMappings(MappingType mappingType) {
        return switch (1.$SwitchMap$com$viaversion$viaversion$api$data$MappingData$MappingType[mappingType.ordinal()]) {
            default -> throw new IncompatibleClassChangeError();
            case 1 -> this.getFullItemMappings();
            case 2 -> this.getFullBlockMappings();
            case 3 -> this.getFullSoundMappings();
            case 4 -> this.getEntityMappings();
        };
    }

    public int getOldBlockId(int var1);

    public static enum MappingType implements RegistryKey
    {
        ITEM,
        BLOCK,
        SOUND,
        ENTITY_TYPE;


        @Override
        public Key key() {
            return Key.of((String)this.name().toLowerCase(Locale.ROOT));
        }
    }
}

