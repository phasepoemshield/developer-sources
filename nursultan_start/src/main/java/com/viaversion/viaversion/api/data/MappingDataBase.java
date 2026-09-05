/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.viafabricplus.features.footstep_particle.FootStepParticle1_12_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.BiMappings;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.FullMappingsBase;
import com.viaversion.viaversion.api.data.IdentityMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.TagData;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class MappingDataBase
implements MappingData {
    protected final String unmappedVersion;
    protected final String mappedVersion;
    protected FullMappings argumentTypeMappings;
    protected FullMappings entityMappings;
    protected FullMappings recipeSerializerMappings;
    protected FullMappings itemDataSerializerMappings;
    protected FullMappings slotDisplayMappings;
    protected FullMappings attributeMappings;
    protected FullMappings blockEntityMappings;
    protected ParticleMappings particleMappings;
    protected BiMappings itemMappings;
    protected BiMappings blockMappings;
    protected Mappings blockStateMappings;
    protected Mappings soundMappings;
    protected Mappings statisticsMappings;
    protected Mappings enchantmentMappings;
    protected Mappings paintingMappings;
    protected Mappings menuMappings;
    protected Map<RegistryType, List<TagData>> tags;
    protected IntSet changedBlocks;

    private void loadTags(RegistryType registryType, CompoundTag compoundTag) {
        CompoundTag compoundTag2 = compoundTag.getCompoundTag(registryType.identifier());
        if (compoundTag2 == null) {
            return;
        }
        ArrayList<TagData> arrayList = new ArrayList<TagData>(this.tags.size());
        for (Map.Entry entry : compoundTag2.entrySet()) {
            IntArrayTag intArrayTag = (IntArrayTag)entry.getValue();
            arrayList.add(new TagData((String)entry.getKey(), intArrayTag.getValue()));
        }
        this.tags.put(registryType, arrayList);
    }

    protected void loadExtras(CompoundTag compoundTag) {
    }

    public MappingDataBase(String string, String string2) {
        this.unmappedVersion = string;
        this.mappedVersion = string2;
    }

    @Override
    public void load() {
        Object object;
        Object object2;
        if (Via.getManager().isDebug()) {
            this.getLogger().info("Loading " + this.unmappedVersion + " -> " + this.mappedVersion + " mappings...");
        }
        CompoundTag compoundTag = this.readMappingsFile("mappings-" + this.unmappedVersion + "to" + this.mappedVersion + ".nbt");
        this.blockStateMappings = this.loadMappings(compoundTag, "blockstates");
        this.statisticsMappings = this.loadMappings(compoundTag, "statistics");
        this.menuMappings = this.loadMappings(compoundTag, "menus");
        this.enchantmentMappings = this.loadMappings(compoundTag, "enchantments");
        this.paintingMappings = this.loadMappings(compoundTag, "paintings");
        CompoundTag compoundTag2 = this.readUnmappedIdentifiersFile("identifiers-" + this.unmappedVersion + ".nbt");
        CompoundTag compoundTag3 = this.readMappedIdentifiersFile("identifiers-" + this.mappedVersion + ".nbt");
        if (compoundTag2 != null && compoundTag3 != null) {
            this.itemMappings = this.loadFullOrBiMappings(compoundTag, compoundTag2, compoundTag3, "items");
            this.blockMappings = this.loadFullOrBiMappings(compoundTag, compoundTag2, compoundTag3, "blocks");
            this.soundMappings = this.loadFullOrBiMappings(compoundTag, compoundTag2, compoundTag3, "sounds");
            this.entityMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "entities");
            this.argumentTypeMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "argumenttypes");
            this.slotDisplayMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "slot_displays");
            this.recipeSerializerMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "recipe_serializers");
            this.itemDataSerializerMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "data_component_type");
            this.attributeMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "attributes");
            this.blockEntityMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, "blockentities");
            object2 = this.identifiersFromGlobalIds(compoundTag2, compoundTag3, "particles");
            if (object2 != null) {
                object = this.loadMappings(compoundTag, "particles");
                if (object == null) {
                    object = new IdentityMappings(object2.unmapped().size(), object2.mapped().size());
                }
                this.particleMappings = new ParticleMappings((MappingDataLoader.IdentifiersPair)((Object)object2), (Mappings)object);
            }
        } else {
            this.itemMappings = this.loadBiMappings(compoundTag, "items");
            this.blockMappings = this.loadBiMappings(compoundTag, "blocks");
            this.soundMappings = this.loadMappings(compoundTag, "sounds");
        }
        object2 = compoundTag.getCompoundTag("tags");
        if (object2 != null) {
            this.tags = new EnumMap<RegistryType, List<TagData>>(RegistryType.class);
            this.loadTags(RegistryType.ITEM, (CompoundTag)object2);
            this.loadTags(RegistryType.BLOCK, (CompoundTag)object2);
            this.loadTags(RegistryType.ENTITY, (CompoundTag)object2);
        }
        if ((object = compoundTag.getIntArrayTag("changed_blocks")) != null) {
            this.changedBlocks = new IntOpenHashSet(object.getValue());
        }
        this.loadExtras(compoundTag);
    }

    protected Logger getLogger() {
        return Via.getPlatform().getLogger();
    }

    @Override
    public @Nullable FullMappings getFullItemMappings() {
        BiMappings biMappings = this.itemMappings;
        if (biMappings instanceof FullMappings) {
            FullMappings fullMappings = (FullMappings)biMappings;
            return fullMappings;
        }
        return null;
    }

    @Override
    public @Nullable Mappings getEnchantmentMappings() {
        return this.enchantmentMappings;
    }

    @Override
    public @Nullable Mappings getBlockStateMappings() {
        return this.blockStateMappings;
    }

    @Override
    public @Nullable FullMappings getBlockEntityMappings() {
        return this.blockEntityMappings;
    }

    @Override
    public @Nullable ParticleMappings getParticleMappings() {
        return this.particleMappings;
    }

    @Override
    public @Nullable FullMappings getAttributeMappings() {
        return this.attributeMappings;
    }

    @Override
    public @Nullable FullMappings getArgumentTypeMappings() {
        return this.argumentTypeMappings;
    }

    @Override
    public @Nullable FullMappings getFullSoundMappings() {
        Mappings mappings = this.soundMappings;
        if (mappings instanceof FullMappings) {
            FullMappings fullMappings = (FullMappings)mappings;
            return fullMappings;
        }
        return null;
    }

    protected @Nullable Mappings loadMappings(CompoundTag compoundTag, String string) {
        return MappingDataLoader.INSTANCE.loadMappings(compoundTag, string);
    }

    @Override
    public @Nullable FullMappings getEntityMappings() {
        return this.entityMappings;
    }

    @Override
    public int getNewBlockStateId(int n) {
        return this.checkValidity(n, this.blockStateMappings.getNewId(n), "blockstate");
    }

    @Override
    public int getOldItemId(int n) {
        return this.itemMappings.inverse().getNewIdOrDefault(n, 1);
    }

    @Override
    public @Nullable BiMappings getItemMappings() {
        return this.itemMappings;
    }

    @Override
    public @Nullable Mappings getMenuMappings() {
        return this.menuMappings;
    }

    @Override
    public int getNewItemId(int n) {
        return this.checkValidity(n, this.itemMappings.getNewId(n), "item");
    }

    @Override
    public @Nullable Mappings getBlockMappings() {
        return this.blockMappings;
    }

    @Override
    public int getNewBlockId(int n) {
        return this.checkValidity(n, this.blockMappings.getNewId(n), "block");
    }

    @Override
    public int getNewParticleId(int n) {
        CallbackInfoReturnable callbackInfoReturnable = new CallbackInfoReturnable("", true);
        this.handler$dif000$viafabricplus$passthroughFootStepParticle(n, callbackInfoReturnable);
        if (callbackInfoReturnable.isCancelled()) {
            return callbackInfoReturnable.getReturnValueI();
        }
        return this.checkValidity(n, this.particleMappings.getNewId(n), "particles");
    }

    @Override
    public @Nullable FullMappings getDataComponentSerializerMappings() {
        return this.itemDataSerializerMappings;
    }

    protected @Nullable CompoundTag readUnmappedIdentifiersFile(String string) {
        return MappingDataLoader.INSTANCE.loadNBT(string, true);
    }

    @Override
    public @Nullable FullMappings getRecipeSerializerMappings() {
        return this.recipeSerializerMappings;
    }

    protected int checkValidity(int n, int n2, String string) {
        if (n2 == -1) {
            if (Via.getConfig().logOtherConversionWarnings()) {
                this.getLogger().warning(String.format("Missing %s %s for %s %s %d", this.mappedVersion, string, this.unmappedVersion, string, n));
            }
            return 0;
        }
        return n2;
    }

    @Override
    public @Nullable Mappings getStatisticsMappings() {
        return this.statisticsMappings;
    }

    @Override
    public @Nullable Mappings getPaintingMappings() {
        return this.paintingMappings;
    }

    protected @Nullable BiMappings loadFullOrBiMappings(CompoundTag compoundTag, CompoundTag compoundTag2, CompoundTag compoundTag3, String string) {
        FullMappings fullMappings = this.loadFullMappings(compoundTag, compoundTag2, compoundTag3, string);
        return fullMappings != null ? fullMappings : this.loadBiMappings(compoundTag, string);
    }

    @Override
    public @Nullable FullMappings getSlotDisplayMappings() {
        return this.slotDisplayMappings;
    }

    @Override
    public @Nullable FullMappings getFullBlockMappings() {
        BiMappings biMappings = this.blockMappings;
        if (biMappings instanceof FullMappings) {
            FullMappings fullMappings = (FullMappings)biMappings;
            return fullMappings;
        }
        return null;
    }

    protected @Nullable CompoundTag readMappedIdentifiersFile(String string) {
        return MappingDataLoader.INSTANCE.loadNBT(string, true);
    }

    private void handler$dif000$viafabricplus$passthroughFootStepParticle(int n, CallbackInfoReturnable callbackInfoReturnable) {
        if (n == FootStepParticle1_12_2.RAW_ID) {
            callbackInfoReturnable.setReturnValue((Object)n);
        }
    }

    @Override
    public @Nullable List<TagData> getTags(RegistryType registryType) {
        return this.tags != null ? this.tags.get(registryType) : null;
    }

    protected @Nullable List<String> identifiersFromGlobalIds(CompoundTag compoundTag, String string) {
        return MappingDataLoader.INSTANCE.identifiersFromGlobalIds(compoundTag, string);
    }

    protected @Nullable MappingDataLoader.IdentifiersPair identifiersFromGlobalIds(CompoundTag compoundTag, CompoundTag compoundTag2, String string) {
        return MappingDataLoader.INSTANCE.identifiersFromGlobalIds(compoundTag, compoundTag2, string);
    }

    @Override
    public int getNewSoundId(int n) {
        return this.checkValidity(n, this.soundMappings.getNewId(n), "sound");
    }

    @Override
    public @Nullable Mappings getSoundMappings() {
        return this.soundMappings;
    }

    protected @Nullable BiMappings loadBiMappings(CompoundTag compoundTag, String string) {
        Mappings mappings = this.loadMappings(compoundTag, string);
        return mappings != null ? BiMappings.of(mappings) : null;
    }

    @Override
    public int getOldSoundId(int n) {
        return this.soundMappings.inverse().getNewIdOrDefault(n, 0);
    }

    @Override
    public @Nullable IntSet changedBlocks() {
        return this.changedBlocks;
    }

    protected @Nullable CompoundTag readMappingsFile(String string) {
        return MappingDataLoader.INSTANCE.loadNBT(string);
    }

    protected @Nullable FullMappings loadFullMappings(CompoundTag compoundTag, CompoundTag compoundTag2, CompoundTag compoundTag3, String string) {
        if (!compoundTag2.contains(string) || !compoundTag3.contains(string)) {
            return null;
        }
        MappingDataLoader.IdentifiersPair identifiersPair = this.identifiersFromGlobalIds(compoundTag2, compoundTag3, string);
        Mappings mappings = this.loadBiMappings(compoundTag, string);
        if (mappings == null) {
            mappings = new IdentityMappings(identifiersPair.unmapped().size(), identifiersPair.mapped().size());
        }
        return FullMappingsBase.of(identifiersPair, mappings);
    }

    @Override
    public int getNewAttributeId(int n) {
        return this.checkValidity(n, this.attributeMappings.getNewId(n), "attributes");
    }

    @Override
    public int getOldBlockId(int n) {
        return this.blockMappings.inverse().getNewIdOrDefault(n, 1);
    }
}

