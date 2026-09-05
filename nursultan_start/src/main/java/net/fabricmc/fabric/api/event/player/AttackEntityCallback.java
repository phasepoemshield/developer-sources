/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06145
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07082
 *  minecraft.class07299
 *  minecraft.class08036
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.event.player;

import minecraft.class06145;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07082;
import minecraft.class07299;
import minecraft.class08036;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import org.jspecify.annotations.Nullable;

public interface AttackEntityCallback {
    public static final Event<AttackEntityCallback> EVENT = EventFactory.createArrayBacked(AttackEntityCallback.class, attackEntityCallbackArray -> (class080362, class072992, class070502, class070492, class061452) -> {
        for (AttackEntityCallback attackEntityCallback : attackEntityCallbackArray) {
            class07082 class070822 = attackEntityCallback.interact(class080362, class072992, class070502, class070492, class061452);
            if (class070822 == class07082.i) continue;
            return class070822;
        }
        return class07082.i;
    });

    public class07082 interact(class08036 var1, class07299 var2, class07050 var3, class07049 var4, @Nullable class06145 var5);
}

