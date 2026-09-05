/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.message.v1;

import minecraft.class00392;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientReceiveMessageEvents$AllowGame {
    public boolean allowReceiveGameMessage(class00392 var1, boolean var2);
}

