/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class01894
 *  minecraft.class02897
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.buffer.ByteBuf;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class01894;
import minecraft.class02897;

public record PassthroughPacket(ByteBuf buf) implements class00381<class00638>
{
    private static final class02897<? extends class00381<class00638>> FAKE_TYPE = new class02897(class00423.field_11941, class01894.N((String)"fabric-networking-api-v1", (String)"passthrough"));

    public void method_65081(class00638 class006382) {
        throw new UnsupportedOperationException("This is not a real packet!");
    }

    public class02897<? extends class00381<class00638>> method_65080() {
        return FAKE_TYPE;
    }
}

