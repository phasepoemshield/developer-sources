/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class04191
 */
package net.fabricmc.fabric.impl.networking.payload;

import minecraft.class00667;
import minecraft.class04191;
import net.fabricmc.fabric.impl.networking.payload.PayloadHelper;

public record PacketByteBufLoginQueryResponse(class00667 data) implements class04191
{
    public void method_52295(class00667 class006672) {
        PayloadHelper.write(class006672, this.data());
    }
}

