/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  net.fabricmc.fabric.api.networking.v1.PacketByteBufs
 */
package net.fabricmc.fabric.impl.networking.payload;

import minecraft.class00667;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;

public class PayloadHelper {
    public static void write(class00667 class006672, class00667 class006673) {
        class006672.writeBytes(class006673.copy());
    }

    public static class00667 read(class00667 class006672, int n) {
        PayloadHelper.assertSize(class006672, n);
        class00667 class006673 = PacketByteBufs.create();
        class006673.writeBytes(class006672.copy());
        class006672.skipBytes(class006672.readableBytes());
        return class006673;
    }

    private static void assertSize(class00667 class006672, int n) {
        int n2 = class006672.readableBytes();
        if (n2 < 0 || n2 > n) {
            throw new IllegalArgumentException("Payload may not be larger than " + n + " bytes");
        }
    }
}

