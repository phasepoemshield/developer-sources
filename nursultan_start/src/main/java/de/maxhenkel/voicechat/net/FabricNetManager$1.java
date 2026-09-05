/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class04247
 */
package de.maxhenkel.voicechat.net;

import de.maxhenkel.voicechat.net.FabricNetManager;
import de.maxhenkel.voicechat.net.Packet;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class04247;

class FabricNetManager$1
implements class02362<class04247, T> {
    final /* synthetic */ Class val$packetType;

    FabricNetManager$1(FabricNetManager fabricNetManager, Class clazz) {
        this.val$packetType = clazz;
    }

    public T decode(class04247 class042472) {
        try {
            Packet packet = (Packet)this.val$packetType.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            packet.fromBytes((class00667)class042472);
            return packet;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public void encode(class04247 class042472, T t) {
        t.toBytes((class00667)class042472);
    }
}

