/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07084
 */
package net.fabricmc.fabric.api.entity.event.v1.effect;

import minecraft.class07084;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$AfterAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$AfterRemove;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$AllowAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$AllowEarlyRemove;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$BeforeAdd;
import net.fabricmc.fabric.api.entity.event.v1.effect.ServerMobEffectEvents$BeforeRemove;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerMobEffectEvents {
    public static final Event<ServerMobEffectEvents$AllowAdd> ALLOW_ADD = EventFactory.createArrayBacked(ServerMobEffectEvents$AllowAdd.class, serverMobEffectEvents$AllowAddArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$AllowAdd serverMobEffectEvents$AllowAdd : serverMobEffectEvents$AllowAddArray) {
            if (serverMobEffectEvents$AllowAdd.allowAdd(class070552, class074382, effectEventContext)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ServerMobEffectEvents$BeforeAdd> BEFORE_ADD = EventFactory.createArrayBacked(ServerMobEffectEvents$BeforeAdd.class, serverMobEffectEvents$BeforeAddArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$BeforeAdd serverMobEffectEvents$BeforeAdd : serverMobEffectEvents$BeforeAddArray) {
            serverMobEffectEvents$BeforeAdd.beforeAdd(class070552, class074382, effectEventContext);
        }
    });
    public static final Event<ServerMobEffectEvents$AfterAdd> AFTER_ADD = EventFactory.createArrayBacked(ServerMobEffectEvents$AfterAdd.class, serverMobEffectEvents$AfterAddArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$AfterAdd serverMobEffectEvents$AfterAdd : serverMobEffectEvents$AfterAddArray) {
            serverMobEffectEvents$AfterAdd.afterAdd(class070552, class074382, effectEventContext);
        }
    });
    public static final Event<ServerMobEffectEvents$AllowEarlyRemove> ALLOW_EARLY_REMOVE = EventFactory.createArrayBacked(ServerMobEffectEvents$AllowEarlyRemove.class, serverMobEffectEvents$AllowEarlyRemoveArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$AllowEarlyRemove serverMobEffectEvents$AllowEarlyRemove : serverMobEffectEvents$AllowEarlyRemoveArray) {
            if (serverMobEffectEvents$AllowEarlyRemove.allowEarlyRemove(class070552, class074382, effectEventContext)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ServerMobEffectEvents$BeforeRemove> BEFORE_REMOVE = EventFactory.createArrayBacked(ServerMobEffectEvents$BeforeRemove.class, serverMobEffectEvents$BeforeRemoveArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$BeforeRemove serverMobEffectEvents$BeforeRemove : serverMobEffectEvents$BeforeRemoveArray) {
            serverMobEffectEvents$BeforeRemove.beforeRemove(class070552, class074382, effectEventContext);
        }
    });
    public static final Event<ServerMobEffectEvents$AfterRemove> AFTER_REMOVE = EventFactory.createArrayBacked(ServerMobEffectEvents$AfterRemove.class, serverMobEffectEvents$AfterRemoveArray -> (class070552, class074382, effectEventContext) -> {
        for (ServerMobEffectEvents$AfterRemove serverMobEffectEvents$AfterRemove : serverMobEffectEvents$AfterRemoveArray) {
            serverMobEffectEvents$AfterRemove.afterRemove(class070552, class074382, effectEventContext);
        }
    });

    private ServerMobEffectEvents() {
    }

    static {
        BEFORE_ADD.register((class070552, class074382, effectEventContext) -> ((class07084)class070552.L().N()).onEffectAdded(class070552, class074382));
        AFTER_ADD.register((class070552, class074382, effectEventContext) -> ((class07084)class070552.L().N()).onEffectStarted(class070552, class074382));
        BEFORE_REMOVE.register((class070552, class074382, effectEventContext) -> ((class07084)class070552.L().N()).onEffectRemoved(class070552, class074382));
    }
}

