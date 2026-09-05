/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import minecraft.class00667;

public interface Packet<T extends Packet> {
    public void toBytes(class00667 var1);

    public T fromBytes(class00667 var1);

    default public long getTTL() {
        return 10000L;
    }
}

