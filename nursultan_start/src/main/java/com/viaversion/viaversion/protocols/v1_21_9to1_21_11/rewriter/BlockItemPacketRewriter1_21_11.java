/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.AttackRange
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_9to1_21_11.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.AttackRange;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.Protocol1_21_9To1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.storage.GameTimeStorage;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;

public final class BlockItemPacketRewriter1_21_11
extends StructuredItemRewriter<ClientboundPacket1_21_9, ServerboundPacket1_21_9, Protocol1_21_9To1_21_11> {
    public BlockItemPacketRewriter1_21_11(Protocol1_21_9To1_21_11 protocol) {
        super((Protocol)protocol);
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter1_21_11.downgradeData(item, container);
        super.handleItemDataComponentsToServer(connection, item, container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter1_21_11.upgradeData(item, container);
        this.appendItemDataFixComponents(connection, item);
        super.handleItemDataComponentsToClient(connection, item, container);
    }

    public void registerPackets() {
        ((Protocol1_21_9To1_21_11)this.protocol).registerClientbound(ClientboundPackets1_21_9.SET_BORDER_LERP_SIZE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.VAR_LONG, (Object)((Long)wrapper.read((Type)Types.VAR_LONG) / 50L));
        });
        ((Protocol1_21_9To1_21_11)this.protocol).registerClientbound(ClientboundPackets1_21_9.INITIALIZE_BORDER, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.write((Type)Types.VAR_LONG, (Object)((Long)wrapper.read((Type)Types.VAR_LONG) / 50L));
        });
        ((Protocol1_21_9To1_21_11)this.protocol).registerClientbound(ClientboundPackets1_21_9.SET_TIME, wrapper -> {
            long gameTime = (Long)wrapper.passthrough((Type)Types.LONG);
            ((GameTimeStorage)wrapper.user().get(GameTimeStorage.class)).setGameTime(gameTime);
        });
        ((Protocol1_21_9To1_21_11)this.protocol).registerServerbound(ServerboundPackets1_21_6.CLIENT_TICK_END, wrapper -> ((GameTimeStorage)wrapper.user().get(GameTimeStorage.class)).incrementGameTime());
    }

    public static void upgradeData(Item item, StructuredDataContainer container) {
    }

    public static void downgradeData(Item item, StructuredDataContainer container) {
        container.remove(StructuredDataKey.SWING_ANIMATION);
        container.remove(StructuredDataKey.KINETIC_WEAPON);
        container.remove(StructuredDataKey.PIERCING_WEAPON);
        container.remove(StructuredDataKey.DAMAGE_TYPE1_21_11);
        container.remove(StructuredDataKey.MINIMUM_ATTACK_CHARGE);
        container.remove(StructuredDataKey.USE_EFFECTS);
        container.remove(StructuredDataKey.ZOMBIE_NAUTILUS_VARIANT1_21_11);
        container.remove(StructuredDataKey.ATTACK_RANGE);
    }

    private void appendItemDataFixComponents(UserConnection connection, Item item) {
        ProtocolVersion serverVersion = connection.getProtocolInfo().serverProtocolVersion();
        if (Via.getConfig().use1_8HitboxMargin() && serverVersion.olderThanOrEqualTo(ProtocolVersion.v1_8)) {
            item.dataContainer().set(StructuredDataKey.ATTACK_RANGE, (Object)new AttackRange(0.0f, 3.0f, 0.0f, 4.0f, 0.1f, 1.0f));
        }
    }
}

