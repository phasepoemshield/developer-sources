/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion
 */
package net.raphimc.viabedrock.protocol.model;

import com.viaversion.nbt.tag.CompoundTag;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion;

public record ItemEntry(String identifier, int id, boolean componentBased, ItemVersion version, CompoundTag componentData) {
}

