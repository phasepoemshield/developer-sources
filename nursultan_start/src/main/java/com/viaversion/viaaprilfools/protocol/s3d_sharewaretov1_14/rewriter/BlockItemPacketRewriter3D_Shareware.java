/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 */
package com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.rewriter;

import com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.Protocol3D_SharewareTo1_14;
import com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.packet.ClientboundPackets3D_Shareware;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.rewriter.ItemRewriter;

public class BlockItemPacketRewriter3D_Shareware
extends ItemRewriter<ClientboundPackets3D_Shareware, ServerboundPackets1_14, Protocol3D_SharewareTo1_14> {
    public BlockItemPacketRewriter3D_Shareware(Protocol3D_SharewareTo1_14 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    protected void registerPackets() {
        this.registerCooldown(ClientboundPackets3D_Shareware.COOLDOWN);
        this.registerSetContent(ClientboundPackets3D_Shareware.CONTAINER_SET_CONTENT);
        this.registerSetSlot(ClientboundPackets3D_Shareware.CONTAINER_SET_SLOT);
        this.registerSetEquippedItem(ClientboundPackets3D_Shareware.SET_EQUIPPED_ITEM);
        this.registerAdvancements(ClientboundPackets3D_Shareware.UPDATE_ADVANCEMENTS);
        this.registerContainerClick((ServerboundPacketType)ServerboundPackets1_14.CONTAINER_CLICK);
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_14.SET_CREATIVE_MODE_SLOT);
        ((Protocol3D_SharewareTo1_14)this.protocol).registerClientbound(ClientboundPackets3D_Shareware.MERCHANT_OFFERS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
            for (int i = 0; i < size; ++i) {
                this.passthroughClientboundItem(wrapper);
                this.passthroughClientboundItem(wrapper);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    this.passthroughClientboundItem(wrapper);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.FLOAT);
            }
        });
    }
}

