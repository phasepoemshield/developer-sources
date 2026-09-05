/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  net.raphimc.vialegacy.api.remapper.LegacyItemRewriter
 *  net.raphimc.vialegacy.protocol.release.r1_0_0_1tor1_1.packet.ServerboundPackets1_0_0
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4
 */
package net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import net.raphimc.vialegacy.api.remapper.LegacyItemRewriter;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.Protocolb1_8_0_1tor1_0_0_1;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.packet.ClientboundPacketsb1_8;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.types.Typesb1_8_0_1;
import net.raphimc.vialegacy.protocol.release.r1_0_0_1tor1_1.packet.ServerboundPackets1_0_0;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4;

public class ItemRewriter
extends LegacyItemRewriter<ClientboundPacketsb1_8, ServerboundPackets1_0_0, Protocolb1_8_0_1tor1_0_0_1> {
    public ItemRewriter(Protocolb1_8_0_1tor1_0_0_1 protocol) {
        super((Protocol)protocol, "b1.8.1", Typesb1_8_0_1.CREATIVE_ITEM, null, Types1_2_4.NBT_ITEM, Types1_2_4.NBT_ITEM_ARRAY);
        this.addNonExistentItemRange(110, 122);
        this.addNonExistentItemRange(369, 382);
        this.addNonExistentItems(new int[]{438});
        this.addNonExistentItemRange(2256, 2266);
    }

    protected void registerPackets() {
        this.registerCreativeInventoryAction((ServerboundPacketType)ServerboundPackets1_0_0.SET_CREATIVE_MODE_SLOT);
    }
}

