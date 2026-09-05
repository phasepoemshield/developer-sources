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

public class RequestSecretPacket
implements Packet<RequestSecretPacket> {
    public static final class01666<RequestSecretPacket> REQUEST_SECRET = new class01666(class01894.N((String)"voicechat", (String)"request_secret"));
    private int compatibilityVersion;

    public RequestSecretPacket() {
    }

    public RequestSecretPacket(int n) {
        this.compatibilityVersion = n;
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.writeInt(this.compatibilityVersion);
    }

    @Override
    public class01666<RequestSecretPacket> method_56479() {
        return REQUEST_SECRET;
    }

    @Override
    public RequestSecretPacket fromBytes(class00667 class006672) {
        this.compatibilityVersion = class006672.readInt();
        return this;
    }

    public int getCompatibilityVersion() {
        return this.compatibilityVersion;
    }
}

