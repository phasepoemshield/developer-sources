/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.mapping.PacketMapping
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 */
package net.raphimc.viabedrock.experimental.util;

import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.mapping.PacketMapping;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import java.lang.reflect.Field;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;

public class ProtocolUtil {
    private static void setHandler(PacketMapping mapping, PacketHandler handler) {
        Field handlerField = null;
        for (Field field : mapping.getClass().getDeclaredFields()) {
            if (!field.getName().equals("handler")) continue;
            handlerField = field;
        }
        if (handlerField == null) {
            throw new IllegalStateException("Failed to find handler field in PacketMapping");
        }
        handlerField.setAccessible(true);
        try {
            handlerField.set(mapping, handler);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public static void appendClientbound(BedrockProtocol protocol, ClientboundBedrockPackets type, PacketHandler handler) {
        PacketMapping mapping = protocol.getClientboundMappings().mappedPacket(type.state(), type.getId());
        if (mapping != null) {
            PacketHandler oldHandler = mapping.handler();
            if (oldHandler == null) {
                mapping.appendHandler(handler);
            } else {
                ProtocolUtil.setHandler(mapping, oldHandler.then(wrapper -> {
                    wrapper.resetReader();
                    handler.handle(wrapper);
                }));
            }
        } else {
            protocol.registerClientbound(type, null, handler);
        }
    }

    public static void appendServerbound(BedrockProtocol protocol, ServerboundPackets26_1 type, PacketHandler handler) {
        PacketMapping mapping = protocol.getServerboundMappings().mappedPacket(type.state(), type.getId());
        if (mapping != null) {
            PacketHandler oldHandler = mapping.handler();
            if (oldHandler == null) {
                mapping.appendHandler(handler);
            } else {
                ProtocolUtil.setHandler(mapping, oldHandler.then(wrapper -> {
                    wrapper.resetReader();
                    handler.handle(wrapper);
                }));
            }
        } else {
            protocol.registerServerbound((ServerboundPacketType)type, null, handler);
        }
    }

    public static void prependServerbound(BedrockProtocol protocol, ServerboundPackets26_1 type, PacketHandler handler) {
        PacketMapping mapping = protocol.getServerboundMappings().mappedPacket(type.state(), type.getId());
        if (mapping != null) {
            PacketHandler oldHandler = mapping.handler();
            if (oldHandler == null) {
                mapping.appendHandler(handler);
            } else {
                ProtocolUtil.setHandler(mapping, handler.then(wrapper -> {
                    if (!wrapper.isCancelled()) {
                        wrapper.resetReader();
                        oldHandler.handle(wrapper);
                    }
                }));
            }
        } else {
            protocol.registerServerbound((ServerboundPacketType)type, null, handler);
        }
    }

    public static void prependClientbound(BedrockProtocol protocol, ClientboundBedrockPackets type, PacketHandler handler) {
        PacketMapping mapping = protocol.getClientboundMappings().mappedPacket(type.state(), type.getId());
        if (mapping != null) {
            PacketHandler oldHandler = mapping.handler();
            if (oldHandler == null) {
                mapping.appendHandler(handler);
            } else {
                ProtocolUtil.setHandler(mapping, handler.then(wrapper -> {
                    if (!wrapper.isCancelled()) {
                        wrapper.resetReader();
                        oldHandler.handle(wrapper);
                    }
                }));
            }
        } else {
            protocol.registerClientbound(type, null, handler);
        }
    }
}

