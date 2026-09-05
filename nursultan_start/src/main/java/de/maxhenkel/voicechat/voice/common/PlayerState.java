/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import java.util.UUID;
import javax.annotation.Nullable;
import minecraft.class00667;

public class PlayerState {
    private UUID uuid;
    private String name;
    private boolean disabled;
    private boolean disconnected;
    @Nullable
    private UUID group;

    public PlayerState(UUID uUID, String string, boolean bl, boolean bl2) {
        this.uuid = uUID;
        this.name = string;
        this.disabled = bl;
        this.disconnected = bl2;
    }

    public String toString() {
        return "{disabled=" + this.disabled + ", disconnected=" + this.disconnected + ", uuid=" + String.valueOf(this.uuid) + ", name=" + this.name + ", group=" + String.valueOf(this.group) + "}";
    }

    public void toBytes(class00667 class006672) {
        class006672.writeBoolean(this.disabled);
        class006672.writeBoolean(this.disconnected);
        class006672.N(this.uuid);
        class006672.N(this.name);
        class006672.writeBoolean(this.hasGroup());
        if (this.hasGroup()) {
            class006672.N(this.group);
        }
    }

    public String getName() {
        return this.name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    @Nullable
    public UUID getGroup() {
        return this.group;
    }

    public void setGroup(@Nullable UUID uUID) {
        this.group = uUID;
    }

    public void setUuid(UUID uUID) {
        this.uuid = uUID;
    }

    public static PlayerState fromBytes(class00667 class006672) {
        boolean bl = class006672.readBoolean();
        boolean bl2 = class006672.readBoolean();
        UUID uUID = class006672.m();
        String string = class006672.u(Short.MAX_VALUE);
        PlayerState playerState = new PlayerState(uUID, string, bl, bl2);
        if (class006672.readBoolean()) {
            playerState.setGroup(class006672.m());
        }
        return playerState;
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public void setDisabled(boolean bl) {
        this.disabled = bl;
    }

    public void setDisconnected(boolean bl) {
        this.disconnected = bl;
    }

    public boolean isDisconnected() {
        return this.disconnected;
    }

    public boolean hasGroup() {
        return this.group != null;
    }
}

