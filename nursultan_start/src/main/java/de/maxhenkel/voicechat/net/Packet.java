/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01659
 *  minecraft.class01666
 */
package de.maxhenkel.voicechat.net;

import minecraft.class00667;
import minecraft.class01659;
import minecraft.class01666;

public interface Packet<T extends Packet<T>>
extends class01659 {
    public void toBytes(class00667 var1);

    public class01666<T> method_56479();

    public T fromBytes(class00667 var1);
}

