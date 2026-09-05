/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.event.client.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.client.player.ClientPlayerBlockBreakEvents$After;

@Environment(value=EnvType.CLIENT)
public final class ClientPlayerBlockBreakEvents {
    public static final Event<ClientPlayerBlockBreakEvents$After> AFTER = EventFactory.createArrayBacked(ClientPlayerBlockBreakEvents$After.class, clientPlayerBlockBreakEvents$AfterArray -> (class034482, class044532, class072092, class005002) -> {
        for (ClientPlayerBlockBreakEvents$After clientPlayerBlockBreakEvents$After : clientPlayerBlockBreakEvents$AfterArray) {
            clientPlayerBlockBreakEvents$After.afterBlockBreak(class034482, class044532, class072092, class005002);
        }
    });

    private ClientPlayerBlockBreakEvents() {
    }
}

