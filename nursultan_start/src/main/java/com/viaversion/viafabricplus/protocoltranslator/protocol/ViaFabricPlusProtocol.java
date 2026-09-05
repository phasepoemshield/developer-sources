/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11
 *  com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.types.Typesb1_8_0_1
 *  net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4
 *  net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package com.viaversion.viafabricplus.protocoltranslator.protocol;

import com.google.common.collect.Lists;
import com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPacket1_21_11;
import com.viaversion.viaversion.protocols.v1_21_9to1_21_11.packet.ClientboundPackets1_21_11;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.protocol.beta.b1_8_0_1tor1_0_0_1.types.Typesb1_8_0_1;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types.Types1_4_2;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public final class ViaFabricPlusProtocol
extends AbstractProtocol<ClientboundPacket1_21_11, ClientboundPacket1_21_11, ServerboundPacket1_21_9, ServerboundPacket1_21_9> {
    public static final ViaFabricPlusProtocol INSTANCE = new ViaFabricPlusProtocol();

    public ViaFabricPlusProtocol() {
        super(ClientboundPacket1_21_11.class, ClientboundPacket1_21_11.class, ServerboundPacket1_21_9.class, ServerboundPacket1_21_9.class);
    }

    public void init(UserConnection userConnection) {
        super.init(userConnection);
        if (userConnection.getProtocolInfo().serverProtocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            userConnection.put((StorableObject)new WolfHealthTracker1_14_4());
        }
    }

    protected void applySharedRegistrations() {
    }

    protected PacketTypesProvider<ClientboundPacket1_21_11, ClientboundPacket1_21_11, ServerboundPacket1_21_9, ServerboundPacket1_21_9> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_21_11.class, ClientboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_21_6.class, ServerboundConfigurationPackets1_21_9.class}));
    }

    protected void registerPackets() {
        this.registerServerbound((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.CUSTOM_PAYLOAD, packetWrapper -> {
            ArrayList arrayList;
            String string;
            ProtocolVersion protocolVersion = packetWrapper.user().getProtocolInfo().serverProtocolVersion();
            if (protocolVersion.newerThanOrEqualTo(ProtocolVersion.v1_21_5) && !protocolVersion.equals((Object)packetWrapper.user().getProtocolInfo().protocolVersion()) && ((string = Key.namespaced((String)((String)packetWrapper.passthrough(Types.STRING)))).equals("minecraft:register") || string.equals("minecraft:unregister")) && (arrayList = Lists.newArrayList((Object[])new String((byte[])packetWrapper.passthrough(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA), StandardCharsets.UTF_8).split("\u0000"))).remove("fabric:extended_block_state_particle_effect_sync")) {
                if (!arrayList.isEmpty()) {
                    packetWrapper.set(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, 0, (Object)String.join((CharSequence)"\u0000", arrayList).getBytes(StandardCharsets.UTF_8));
                } else {
                    packetWrapper.cancel();
                }
            }
        });
    }

    public ServerboundPacketType getCustomPayloadPacketType() {
        return this.packetTypesProvider.unmappedServerboundType(State.PLAY, "CUSTOM_PAYLOAD");
    }

    public Type<Item> getServerboundItemType(ProtocolVersion protocolVersion) {
        if (protocolVersion.olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            return Typesb1_8_0_1.CREATIVE_ITEM;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return this.getClientboundItemType(protocolVersion);
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
            return VersionedTypes.V1_21_5.lengthPrefixedItem;
        }
        return VersionedTypes.V1_21_6.lengthPrefixedItem;
    }

    public ServerboundPacketType getSetCreativeModeSlot() {
        return this.packetTypesProvider.unmappedServerboundType(State.PLAY, "SET_CREATIVE_MODE_SLOT");
    }

    public Type<Item> getClientboundItemType(ProtocolVersion protocolVersion) {
        if (protocolVersion.olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
            return Types1_4_2.NBTLESS_ITEM;
        }
        if (protocolVersion.olderThanOrEqualTo(LegacyProtocolVersion.r1_2_4tor1_2_5)) {
            return Types1_2_4.NBT_ITEM;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_7_6)) {
            return Types1_7_6.ITEM;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            return Types.ITEM1_8;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_13_1)) {
            return Types.ITEM1_13;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_20)) {
            return Types.ITEM1_13_2;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_20_3)) {
            return Types.ITEM1_20_2;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_20_5)) {
            return VersionedTypes.V1_20_5.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21)) {
            return VersionedTypes.V1_21.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
            return VersionedTypes.V1_21_2.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_4)) {
            return VersionedTypes.V1_21_4.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_5)) {
            return VersionedTypes.V1_21_5.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_7)) {
            return VersionedTypes.V1_21_6.item;
        }
        if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_21_9)) {
            return VersionedTypes.V1_21_9.item;
        }
        return VersionedTypes.V1_21_11.item;
    }

    public ClientboundPacketType getClientboundCustomPayloadPacketType() {
        return this.packetTypesProvider.unmappedClientboundType(State.PLAY, "CUSTOM_PAYLOAD");
    }
}

