/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.StringUtil
 */
package com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.StringUtil;
import java.util.logging.Level;

public final class BlockPacketRewriter1_20_3
extends BlockRewriter<ClientboundPacket1_20_3> {
    public BlockPacketRewriter1_20_3(Protocol1_20_3To1_20_2 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.COMPOUND_TAG, ChunkType1_20_2::new, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        block4: {
            CompoundTag tag = blockEntity.tag();
            if (tag == null) {
                return;
            }
            StringTag customName = tag.getStringTag("CustomName");
            if (customName == null) {
                return;
            }
            try {
                JsonElement updatedComponent = ComponentUtil.convertJson((String)customName.getValue(), (SerializerVersion)SerializerVersion.V1_20_3, (SerializerVersion)SerializerVersion.V1_19_4);
                customName.setValue(updatedComponent.toString());
            }
            catch (Exception e) {
                if (!Via.getConfig().logTextComponentConversionErrors()) break block4;
                this.protocol.getLogger().log(Level.SEVERE, "Error during custom name conversion: " + StringUtil.forLogging((String)customName.getValue()), (Throwable)e);
            }
        }
    }
}

