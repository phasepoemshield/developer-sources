/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.event.client.player;

import minecraft.class04453;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public interface ClientPreAttackCallback {
    public static final Event<ClientPreAttackCallback> EVENT = EventFactory.createArrayBacked(ClientPreAttackCallback.class, clientPreAttackCallbackArray -> (class062022, class044532, n) -> {
        for (ClientPreAttackCallback clientPreAttackCallback : clientPreAttackCallbackArray) {
            if (!clientPreAttackCallback.onClientPlayerPreAttack(class062022, class044532, n)) continue;
            return true;
        }
        return false;
    });

    public boolean onClientPlayerPreAttack(class06202 var1, class04453 var2, int var3);
}

