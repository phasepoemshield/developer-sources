/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 */
package com.viaversion.viaversion.api.debug;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import java.util.logging.Level;

public interface DebugHandler {
    public boolean shouldLog(PacketWrapper var1, Direction var2);

    public boolean enabled();

    default public void error(String error, Throwable t) {
        if (Via.getConfig().logOtherConversionWarnings() || this.enabled()) {
            Via.getPlatform().getLogger().log(Level.SEVERE, error, t);
        }
    }

    public void setEnabled(boolean var1);

    default public void setLogPacketTransform(boolean logPacketTransform) {
        this.setLogPrePacketTransform(logPacketTransform);
        this.setLogPostPacketTransform(logPacketTransform);
    }

    public boolean removePacketTypeToLog(PacketType var1);

    public void addPacketTypeToLog(PacketType var1);

    default public void enableAndLogTypes(PacketType ... packetTypes) {
        this.setEnabled(true);
        for (PacketType packetType : packetTypes) {
            this.addPacketTypeToLog(packetType);
        }
    }

    public boolean logPostPacketTransform();

    public boolean logPrePacketTransform();

    public void setLogPostPacketTransform(boolean var1);

    public void clearPacketTypesToLog();

    public void setLogPrePacketTransform(boolean var1);

    public void addPacketTypeNameToLog(String var1);

    public boolean removePacketTypeNameToLog(String var1);
}

