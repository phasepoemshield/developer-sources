/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class04770;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$AfterRespawn;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$AllowDeath;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$CopyFrom;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$Join;
import net.fabricmc.fabric.api.entity.event.v1.ServerPlayerEvents$Leave;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerPlayerEvents {
    public static final Event<ServerPlayerEvents$CopyFrom> COPY_FROM = EventFactory.createArrayBacked(ServerPlayerEvents$CopyFrom.class, serverPlayerEvents$CopyFromArray -> (class047702, class047703, bl) -> {
        for (ServerPlayerEvents$CopyFrom serverPlayerEvents$CopyFrom : serverPlayerEvents$CopyFromArray) {
            serverPlayerEvents$CopyFrom.copyFromPlayer(class047702, class047703, bl);
        }
    });
    public static final Event<ServerPlayerEvents$AfterRespawn> AFTER_RESPAWN = EventFactory.createArrayBacked(ServerPlayerEvents$AfterRespawn.class, serverPlayerEvents$AfterRespawnArray -> (class047702, class047703, bl) -> {
        for (ServerPlayerEvents$AfterRespawn serverPlayerEvents$AfterRespawn : serverPlayerEvents$AfterRespawnArray) {
            serverPlayerEvents$AfterRespawn.afterRespawn(class047702, class047703, bl);
        }
    });
    public static final Event<ServerPlayerEvents$Join> JOIN = EventFactory.createArrayBacked(ServerPlayerEvents$Join.class, serverPlayerEvents$JoinArray -> class047702 -> {
        for (ServerPlayerEvents$Join serverPlayerEvents$Join : serverPlayerEvents$JoinArray) {
            serverPlayerEvents$Join.onJoin(class047702);
        }
    });
    public static final Event<ServerPlayerEvents$Leave> LEAVE = EventFactory.createArrayBacked(ServerPlayerEvents$Leave.class, serverPlayerEvents$LeaveArray -> class047702 -> {
        for (ServerPlayerEvents$Leave serverPlayerEvents$Leave : serverPlayerEvents$LeaveArray) {
            serverPlayerEvents$Leave.onLeave(class047702);
        }
    });
    @Deprecated
    public static final Event<ServerPlayerEvents$AllowDeath> ALLOW_DEATH = EventFactory.createArrayBacked(ServerPlayerEvents$AllowDeath.class, serverPlayerEvents$AllowDeathArray -> (class047702, class070722, f) -> {
        for (ServerPlayerEvents$AllowDeath serverPlayerEvents$AllowDeath : serverPlayerEvents$AllowDeathArray) {
            if (serverPlayerEvents$AllowDeath.allowDeath(class047702, class070722, f)) continue;
            return false;
        }
        return true;
    });

    private ServerPlayerEvents() {
    }

    static {
        ServerLivingEntityEvents.ALLOW_DEATH.register((class074382, class070722, f) -> {
            if (class074382 instanceof class04770) {
                class04770 class047702 = (class04770)class074382;
                return ALLOW_DEATH.invoker().allowDeath(class047702, class070722, f);
            }
            return true;
        });
    }
}

