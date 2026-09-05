/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.message.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientSendMessageEvents$Command {
    public void onSendCommandMessage(String var1);
}

