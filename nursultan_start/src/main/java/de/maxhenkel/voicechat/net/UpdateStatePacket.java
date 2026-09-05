/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01666
 *  minecraft.class01894
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.Packet;
import minecraft.class00667;
import minecraft.class01666;
import minecraft.class01894;

public class UpdateStatePacket
implements Packet<UpdateStatePacket> {
    public static final class01666<UpdateStatePacket> PLAYER_STATE = new class01666(class01894.N((String)"voicechat", (String)"update_state"));
    private boolean disabled;

    public UpdateStatePacket() {
    }

    public UpdateStatePacket(boolean bl) {
        this.disabled = bl;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.writeBoolean(this.disabled);
    }

    @Override
    public class01666<UpdateStatePacket> method_56479() {
        return PLAYER_STATE;
    }

    public boolean isDisabled() {
        return this.disabled;
    }

    @Override
    public UpdateStatePacket fromBytes(class00667 class006672) {
        this.disabled = class006672.readBoolean();
        return this;
    }
}

