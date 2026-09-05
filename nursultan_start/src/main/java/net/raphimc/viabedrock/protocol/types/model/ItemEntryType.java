/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.Key
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion
 *  net.raphimc.viabedrock.protocol.model.ItemEntry
 */
package net.raphimc.viabedrock.protocol.types.model;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Key;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ItemVersion;
import net.raphimc.viabedrock.protocol.model.ItemEntry;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ItemEntryType
extends Type<ItemEntry> {
    public ItemEntryType() {
        super(ItemEntry.class);
    }

    public void write(ByteBuf buffer, ItemEntry value) {
        BedrockTypes.STRING.write(buffer, (Object)value.identifier());
        buffer.writeShortLE(value.id());
        buffer.writeBoolean(value.componentBased());
        BedrockTypes.VAR_INT.write(buffer, value.version().getValue());
        BedrockTypes.NETWORK_TAG.write(buffer, (Object)value.componentData());
    }

    public ItemEntry read(ByteBuf buffer) {
        String identifier = Key.namespaced((String)((String)BedrockTypes.STRING.read(buffer)));
        short id = buffer.readShortLE();
        boolean componentBased = buffer.readBoolean();
        ItemVersion version = ItemVersion.getByValue((int)BedrockTypes.VAR_INT.read(buffer), (ItemVersion)ItemVersion.None);
        CompoundTag componentData = (CompoundTag)BedrockTypes.NETWORK_TAG.read(buffer);
        return new ItemEntry(identifier, (int)id, componentBased, version, componentData);
    }
}

