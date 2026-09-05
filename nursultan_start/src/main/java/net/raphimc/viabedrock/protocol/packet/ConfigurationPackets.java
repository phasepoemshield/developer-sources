/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundConfigurationPackets1_21_9;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.packet.MultiStatePackets;

public class ConfigurationPackets {
    public static void register(BedrockProtocol protocol) {
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.CLIENT_INFORMATION, null, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(MultiStatePackets.CLIENT_SETTINGS_HANDLER);
                this.handler(PacketWrapper::cancel);
            }
        });
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.CUSTOM_PAYLOAD, null, MultiStatePackets.CUSTOM_PAYLOAD_HANDLER);
        protocol.registerServerboundTransition((ServerboundPacketType)ServerboundConfigurationPackets1_21_9.FINISH_CONFIGURATION, null, wrapper -> {
            wrapper.cancel();
            wrapper.user().getProtocolInfo().setClientState(State.PLAY);
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.CONFIGURATION_ACKNOWLEDGED, null, wrapper -> {
            wrapper.cancel();
            wrapper.user().getProtocolInfo().setClientState(State.CONFIGURATION);
        });
    }
}

