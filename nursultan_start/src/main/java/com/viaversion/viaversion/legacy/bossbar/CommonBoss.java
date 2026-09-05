/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.google.common.collect.MapMaker
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.legacy.bossbar.BossBar
 *  com.viaversion.viaversion.api.legacy.bossbar.BossColor
 *  com.viaversion.viaversion.api.legacy.bossbar.BossFlag
 *  com.viaversion.viaversion.api.legacy.bossbar.BossStyle
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.legacy.bossbar.CommonBoss$1
 *  com.viaversion.viaversion.legacy.bossbar.CommonBoss$UpdateAction
 *  com.viaversion.viaversion.libs.gson.JsonParser
 *  com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.legacy.bossbar;

import com.google.common.base.Preconditions;
import com.google.common.collect.MapMaker;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.legacy.bossbar.BossBar;
import com.viaversion.viaversion.api.legacy.bossbar.BossColor;
import com.viaversion.viaversion.api.legacy.bossbar.BossFlag;
import com.viaversion.viaversion.api.legacy.bossbar.BossStyle;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.legacy.bossbar.CommonBoss;
import com.viaversion.viaversion.libs.gson.JsonParser;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;

public class CommonBoss
implements BossBar {
    private final UUID uuid;
    private final Map<UUID, UserConnection> connections;
    private final Set<BossFlag> flags;
    private String title;
    private float health;
    private BossColor color;
    private BossStyle style;
    private boolean visible;

    public BossBar addFlag(BossFlag bossFlag) {
        Preconditions.checkNotNull((Object)bossFlag);
        if (!this.hasFlag(bossFlag)) {
            this.flags.add(bossFlag);
        }
        this.sendPacket(UpdateAction.UPDATE_FLAGS);
        return this;
    }

    public Set<BossFlag> getFlags() {
        return this.flags;
    }

    public CommonBoss(String string, float f, BossColor bossColor, BossStyle bossStyle) {
        Preconditions.checkNotNull((Object)string, (Object)"Title cannot be null");
        String string2 = "Health must be between 0 and 1. Input: " + f;
        boolean bl = f >= 0.0f && f <= 1.0f;
        this.redirect$dhe000$viafabricplus$ignoreHealthCheck(bl, string2);
        this.uuid = UUID.randomUUID();
        this.title = string;
        this.health = f;
        this.color = bossColor == null ? BossColor.PURPLE : bossColor;
        this.style = bossStyle == null ? BossStyle.SOLID : bossStyle;
        this.connections = new MapMaker().weakValues().makeMap();
        this.flags = EnumSet.noneOf(BossFlag.class);
        this.visible = true;
    }

    public UUID getId() {
        return this.uuid;
    }

    public BossBar setColor(BossColor bossColor) {
        Preconditions.checkNotNull((Object)bossColor);
        this.color = bossColor;
        this.sendPacket(UpdateAction.UPDATE_STYLE);
        return this;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public Set<UUID> getPlayers() {
        return Collections.unmodifiableSet(this.connections.keySet());
    }

    public BossBar removeFlag(BossFlag bossFlag) {
        Preconditions.checkNotNull((Object)bossFlag);
        if (this.hasFlag(bossFlag)) {
            this.flags.remove(bossFlag);
        }
        this.sendPacket(UpdateAction.UPDATE_FLAGS);
        return this;
    }

    public BossBar show() {
        this.setVisible(true);
        return this;
    }

    public Set<UserConnection> getConnections() {
        return Collections.unmodifiableSet(new HashSet<UserConnection>(this.connections.values()));
    }

    public BossBar setTitle(String string) {
        Preconditions.checkNotNull((Object)string);
        this.title = string;
        this.sendPacket(UpdateAction.UPDATE_TITLE);
        return this;
    }

    private void redirect$dhe000$viafabricplus$ignoreHealthCheck(boolean bl, Object object) {
    }

    public String getTitle() {
        return this.title;
    }

    public BossColor getColor() {
        return this.color;
    }

    private void setVisible(boolean bl) {
        if (this.visible != bl) {
            this.visible = bl;
            this.sendPacket(bl ? UpdateAction.ADD : UpdateAction.REMOVE);
        }
    }

    public BossBar hide() {
        this.setVisible(false);
        return this;
    }

    public BossBar removeConnection(UserConnection userConnection) {
        this.removePlayer(userConnection.getProtocolInfo().getUuid());
        return this;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public BossStyle getStyle() {
        return this.style;
    }

    public float getHealth() {
        return this.health;
    }

    public BossBar setHealth(float f) {
        String string = "Health must be between 0 and 1. Input: " + f;
        boolean bl = f >= 0.0f && f <= 1.0f;
        this.redirect$dhe000$viafabricplus$ignoreHealthCheck(bl, string);
        this.health = f;
        this.sendPacket(UpdateAction.UPDATE_HEALTH);
        return this;
    }

    public BossBar addConnection(UserConnection userConnection) {
        if (this.connections.put(userConnection.getProtocolInfo().getUuid(), userConnection) == null && this.visible) {
            this.sendPacketConnection(userConnection, this.getPacket(UpdateAction.ADD, userConnection));
        }
        return this;
    }

    public BossBar addPlayer(UUID uUID) {
        UserConnection userConnection = Via.getManager().getConnectionManager().getServerConnection(uUID);
        if (userConnection != null) {
            this.addConnection(userConnection);
        }
        return this;
    }

    public BossBar setStyle(BossStyle bossStyle) {
        Preconditions.checkNotNull((Object)bossStyle);
        this.style = bossStyle;
        this.sendPacket(UpdateAction.UPDATE_STYLE);
        return this;
    }

    public boolean hasFlag(BossFlag bossFlag) {
        Preconditions.checkNotNull((Object)bossFlag);
        return this.flags.contains(bossFlag);
    }

    private PacketWrapper getPacket(UpdateAction updateAction, UserConnection userConnection) {
        try {
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets1_9.BOSS_EVENT, null, (UserConnection)userConnection);
            packetWrapper.write(Types.UUID, (Object)this.uuid);
            packetWrapper.write((Type)Types.VAR_INT, (Object)updateAction.getId());
            switch (1.$SwitchMap$com$viaversion$viaversion$legacy$bossbar$CommonBoss$UpdateAction[updateAction.ordinal()]) {
                case 1: {
                    try {
                        packetWrapper.write(Types.COMPONENT, (Object)JsonParser.parseString((String)this.title));
                    }
                    catch (Exception exception) {
                        packetWrapper.write(Types.COMPONENT, (Object)ComponentUtil.plainToJson((String)this.title));
                    }
                    packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(this.health));
                    packetWrapper.write((Type)Types.VAR_INT, (Object)this.color.getId());
                    packetWrapper.write((Type)Types.VAR_INT, (Object)this.style.getId());
                    packetWrapper.write((Type)Types.BYTE, (Object)((byte)this.flagToBytes()));
                    break;
                }
                case 2: {
                    break;
                }
                case 3: {
                    packetWrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(this.health));
                    break;
                }
                case 4: {
                    try {
                        packetWrapper.write(Types.COMPONENT, (Object)JsonParser.parseString((String)this.title));
                    }
                    catch (Exception exception) {
                        packetWrapper.write(Types.COMPONENT, (Object)ComponentUtil.plainToJson((String)this.title));
                    }
                    break;
                }
                case 5: {
                    packetWrapper.write((Type)Types.VAR_INT, (Object)this.color.getId());
                    packetWrapper.write((Type)Types.VAR_INT, (Object)this.style.getId());
                    break;
                }
                case 6: {
                    packetWrapper.write((Type)Types.BYTE, (Object)((byte)this.flagToBytes()));
                }
            }
            return packetWrapper;
        }
        catch (Exception exception) {
            Via.getPlatform().getLogger().log(Level.WARNING, "Failed to create bossbar packet", exception);
            return null;
        }
    }

    private int flagToBytes() {
        int n = 0;
        for (BossFlag bossFlag : this.flags) {
            n |= bossFlag.getId();
        }
        return n;
    }

    private void sendPacketConnection(UserConnection userConnection, PacketWrapper packetWrapper) {
        if (userConnection.getProtocolInfo() == null || !userConnection.getProtocolInfo().getPipeline().contains(Protocol1_8To1_9.class)) {
            this.connections.remove(userConnection.getProtocolInfo().getUuid());
            return;
        }
        try {
            packetWrapper.scheduleSend(Protocol1_8To1_9.class);
        }
        catch (Exception exception) {
            Via.getPlatform().getLogger().log(Level.WARNING, "Failed to send bossbar packet", exception);
        }
    }

    private void sendPacket(UpdateAction updateAction) {
        for (UserConnection userConnection : new ArrayList<UserConnection>(this.connections.values())) {
            PacketWrapper packetWrapper = this.getPacket(updateAction, userConnection);
            this.sendPacketConnection(userConnection, packetWrapper);
        }
    }

    public BossBar removePlayer(UUID uUID) {
        UserConnection userConnection = this.connections.remove(uUID);
        if (userConnection != null) {
            this.sendPacketConnection(userConnection, this.getPacket(UpdateAction.REMOVE, userConnection));
        }
        return this;
    }
}

