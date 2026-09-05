/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.entity.event.v1;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$AfterDamage;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$AfterDeath;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$AllowDamage;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$AllowDeath;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents$MobConversion;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerLivingEntityEvents {
    public static final Event<ServerLivingEntityEvents$AllowDamage> ALLOW_DAMAGE = EventFactory.createArrayBacked(ServerLivingEntityEvents$AllowDamage.class, serverLivingEntityEvents$AllowDamageArray -> (class074382, class070722, f) -> {
        for (ServerLivingEntityEvents$AllowDamage serverLivingEntityEvents$AllowDamage : serverLivingEntityEvents$AllowDamageArray) {
            if (serverLivingEntityEvents$AllowDamage.allowDamage(class074382, class070722, f)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ServerLivingEntityEvents$AfterDamage> AFTER_DAMAGE = EventFactory.createArrayBacked(ServerLivingEntityEvents$AfterDamage.class, serverLivingEntityEvents$AfterDamageArray -> (class074382, class070722, f, f2, bl) -> {
        for (ServerLivingEntityEvents$AfterDamage serverLivingEntityEvents$AfterDamage : serverLivingEntityEvents$AfterDamageArray) {
            serverLivingEntityEvents$AfterDamage.afterDamage(class074382, class070722, f, f2, bl);
        }
    });
    public static final Event<ServerLivingEntityEvents$AllowDeath> ALLOW_DEATH = EventFactory.createArrayBacked(ServerLivingEntityEvents$AllowDeath.class, serverLivingEntityEvents$AllowDeathArray -> (class074382, class070722, f) -> {
        for (ServerLivingEntityEvents$AllowDeath serverLivingEntityEvents$AllowDeath : serverLivingEntityEvents$AllowDeathArray) {
            if (serverLivingEntityEvents$AllowDeath.allowDeath(class074382, class070722, f)) continue;
            return false;
        }
        return true;
    });
    public static final Event<ServerLivingEntityEvents$AfterDeath> AFTER_DEATH = EventFactory.createArrayBacked(ServerLivingEntityEvents$AfterDeath.class, serverLivingEntityEvents$AfterDeathArray -> (class074382, class070722) -> {
        for (ServerLivingEntityEvents$AfterDeath serverLivingEntityEvents$AfterDeath : serverLivingEntityEvents$AfterDeathArray) {
            serverLivingEntityEvents$AfterDeath.afterDeath(class074382, class070722);
        }
    });
    public static final Event<ServerLivingEntityEvents$MobConversion> MOB_CONVERSION = EventFactory.createArrayBacked(ServerLivingEntityEvents$MobConversion.class, serverLivingEntityEvents$MobConversionArray -> (class070792, class070793, class082342) -> {
        for (ServerLivingEntityEvents$MobConversion serverLivingEntityEvents$MobConversion : serverLivingEntityEvents$MobConversionArray) {
            serverLivingEntityEvents$MobConversion.onConversion(class070792, class070793, class082342);
        }
    });

    private ServerLivingEntityEvents() {
    }
}

