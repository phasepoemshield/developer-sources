/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 *  com.viaversion.viaversion.util.Key
 *  net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator
 *  net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.modinterface.ViaBedrockUtilityInterface
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Connection_DisconnectFailReason
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketViolationSeverity
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketViolationType
 *  net.raphimc.viabedrock.protocol.storage.ChannelStorage
 *  net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage
 *  net.raphimc.viabedrock.protocol.storage.PacketSyncStorage
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import com.viaversion.viaversion.util.Key;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import net.lenni0451.mcstructs_bedrock.text.utils.BedrockTranslator;
import net.lenni0451.mcstructs_bedrock.text.utils.TranslatorOptions;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.modinterface.ViaBedrockUtilityInterface;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.DataValues;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.Connection_DisconnectFailReason;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.MinecraftPacketIds;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketViolationSeverity;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PacketViolationType;
import net.raphimc.viabedrock.protocol.storage.ChannelStorage;
import net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage;
import net.raphimc.viabedrock.protocol.storage.PacketSyncStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class MultiStatePackets {
    private static final PacketHandler DISCONNECT_HANDLER = wrapper -> {
        boolean hasMessage;
        Connection_DisconnectFailReason disconnectReason = Connection_DisconnectFailReason.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (Connection_DisconnectFailReason)Connection_DisconnectFailReason.Unknown);
        boolean bl = hasMessage = (Boolean)wrapper.read((Type)Types.BOOLEAN) == false;
        if (hasMessage) {
            Map<String, String> translations = BedrockProtocol.MAPPINGS.getBedrockResourcePacks().get((Object)DataValues.VANILLA_RESOURCE_PACK_KEY).content().getLang("texts/en_US.lang");
            Function<String, String> translator = k -> translations.getOrDefault(k, (String)k);
            String rawMessage = (String)wrapper.read(BedrockTypes.STRING);
            wrapper.read(BedrockTypes.STRING);
            String translatedMessage = BedrockTranslator.translate((String)rawMessage, translator, (Object[])new Object[0], (TranslatorOptions[])new TranslatorOptions[0]);
            PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)(translatedMessage + " \u00a7r(Reason: " + String.valueOf(disconnectReason) + ")"));
        } else {
            PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, null);
        }
    };
    private static final PacketHandler PACKET_VIOLATION_WARNING_HANDLER = wrapper -> {
        PacketViolationType type = PacketViolationType.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (PacketViolationType)PacketViolationType.Unknown);
        PacketViolationSeverity severity = PacketViolationSeverity.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)), (PacketViolationSeverity)PacketViolationSeverity.Unknown);
        int packetIdCause = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
        String context = (String)wrapper.read(BedrockTypes.STRING);
        MinecraftPacketIds packet = MinecraftPacketIds.getByValue(packetIdCause);
        String reason = "\u00a74Packet violation warning: \u00a7c" + type.name() + " (" + severity.name() + ")\nViolating Packet: " + String.valueOf(packet != null ? packet.name() : Integer.valueOf(packetIdCause)) + "\n" + (String)(context.isEmpty() ? "No context provided" : " Context: '" + context + "'") + "\n\nPlease report this issue on the ViaBedrock GitHub page!";
        PacketFactory.writeJavaDisconnect((PacketWrapper)wrapper, (String)reason);
    };
    private static final PacketHandler NETWORK_STACK_LATENCY_HANDLER = wrapper -> {
        long timestamp = (Long)wrapper.read((Type)BedrockTypes.LONG_LE);
        if (!((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
            wrapper.cancel();
            return;
        }
        int id = ((PacketSyncStorage)wrapper.user().get(PacketSyncStorage.class)).addNetworkStackLatencyResponse(timestamp);
        wrapper.write((Type)Types.INT, (Object)id);
    };
    private static final PacketHandler PONG_HANDLER = wrapper -> {
        int id;
        PacketSyncStorage packetSyncStorage = (PacketSyncStorage)wrapper.user().get(PacketSyncStorage.class);
        Long timestamp = packetSyncStorage.getNetworkStackLatencyResponse(id = ((Integer)wrapper.read((Type)Types.INT)).intValue());
        if (timestamp != null) {
            wrapper.write((Type)BedrockTypes.LONG_LE, (Object)(timestamp * 1000000L));
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        } else {
            wrapper.cancel();
            if (!packetSyncStorage.handleSyncTask(id)) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received unexpected pong with id " + id);
            }
        }
    };
    public static final PacketHandler CLIENT_SETTINGS_HANDLER = wrapper -> {
        String locale = (String)wrapper.read(Types.STRING);
        byte viewDistance = (Byte)wrapper.read((Type)Types.BYTE);
        int chatVisibility = (Integer)wrapper.read((Type)Types.VAR_INT);
        boolean chatColors = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        short skinParts = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
        int mainHand = (Integer)wrapper.read((Type)Types.VAR_INT);
        boolean textFiltering = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        boolean allowsListing = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        int particleStatus = (Integer)wrapper.read((Type)Types.VAR_INT);
        wrapper.user().put((StorableObject)new ClientSettingsStorage(locale, (int)viewDistance, chatVisibility, chatColors, skinParts, mainHand, textFiltering, allowsListing, particleStatus));
        wrapper.write((Type)BedrockTypes.VAR_INT, (Object)viewDistance);
        wrapper.write((Type)Types.BYTE, (Object)28);
    };
    public static final PacketHandler CUSTOM_PAYLOAD_HANDLER = wrapper -> {
        wrapper.cancel();
        String channel = Key.namespaced((String)((String)wrapper.read(Types.STRING)));
        if (channel.equals("minecraft:register")) {
            List<String> channels = Arrays.asList(new String((byte[])wrapper.read(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA), StandardCharsets.UTF_8).split("\u0000"));
            ((ChannelStorage)wrapper.user().get(ChannelStorage.class)).addChannels(channels);
            if (channels.contains("viabedrockutility:confirm")) {
                ViaBedrockUtilityInterface.confirmPresence((UserConnection)wrapper.user());
            }
        }
    };

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientboundTransition(ClientboundBedrockPackets.DISCONNECT, ClientboundPackets26_1.DISCONNECT, DISCONNECT_HANDLER, ClientboundLoginPackets.LOGIN_DISCONNECT, DISCONNECT_HANDLER, ClientboundConfigurationPackets1_21_9.DISCONNECT, DISCONNECT_HANDLER);
        protocol.registerClientboundTransition(ClientboundBedrockPackets.PACKET_VIOLATION_WARNING, ClientboundPackets26_1.DISCONNECT, PACKET_VIOLATION_WARNING_HANDLER, ClientboundLoginPackets.LOGIN_DISCONNECT, PACKET_VIOLATION_WARNING_HANDLER, ClientboundConfigurationPackets1_21_9.DISCONNECT, PACKET_VIOLATION_WARNING_HANDLER);
        protocol.registerClientboundTransition(ClientboundBedrockPackets.NETWORK_STACK_LATENCY, ClientboundPackets26_1.PING, NETWORK_STACK_LATENCY_HANDLER, State.LOGIN, wrapper -> {
            NETWORK_STACK_LATENCY_HANDLER.handle(wrapper);
            if (!wrapper.isCancelled()) {
                wrapper.resetReader();
                PONG_HANDLER.handle(wrapper);
                if (!wrapper.isCancelled()) {
                    wrapper.setPacketType((PacketType)ServerboundBedrockPackets.NETWORK_STACK_LATENCY);
                    wrapper.sendToServer(BedrockProtocol.class);
                    wrapper.cancel();
                }
            }
        }, ClientboundConfigurationPackets1_21_9.PING, NETWORK_STACK_LATENCY_HANDLER);
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.PONG, ServerboundBedrockPackets.NETWORK_STACK_LATENCY, PONG_HANDLER);
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.PONG, ServerboundBedrockPackets.NETWORK_STACK_LATENCY, PONG_HANDLER);
    }
}

