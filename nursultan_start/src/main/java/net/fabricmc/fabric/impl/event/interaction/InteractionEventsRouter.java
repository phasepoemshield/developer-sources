/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00500
 *  minecraft.class04770
 *  minecraft.class07082
 *  minecraft.class07209
 *  minecraft.class07259
 *  minecraft.class07290
 *  net.fabricmc.api.ModInitializer
 *  net.fabricmc.fabric.api.block.BlockAttackInteractionAware
 *  net.fabricmc.fabric.api.event.player.AttackBlockCallback
 *  net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents
 */
package net.fabricmc.fabric.impl.event.interaction;

import minecraft.class00381;
import minecraft.class00500;
import minecraft.class04770;
import minecraft.class07082;
import minecraft.class07209;
import minecraft.class07259;
import minecraft.class07290;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.block.BlockAttackInteractionAware;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;

public class InteractionEventsRouter
implements ModInitializer {
    public void onInitialize() {
        AttackBlockCallback.EVENT.register((class080362, class072992, class070502, class072092, class072112) -> {
            class00500 class005002 = class072992.method_8320(class072092);
            if (class005002 instanceof BlockAttackInteractionAware ? ((BlockAttackInteractionAware)class005002).onAttackInteraction(class005002, class072992, class072092, class080362, class070502, class072112) : class005002.i() instanceof BlockAttackInteractionAware && ((BlockAttackInteractionAware)class005002.i()).onAttackInteraction(class005002, class072992, class072092, class080362, class070502, class072112)) {
                return class07082.u;
            }
            return class07082.i;
        });
        PlayerBlockBreakEvents.CANCELED.register((class072992, class080362, class072092, class005002, class003942) -> {
            class07209 class072093 = class072092.method_10069(-1, -1, -1);
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    for (int k = 0; k < 3; ++k) {
                        ((class04770)class080362).field_13987.method_14364((class00381)new class07259((class07290)class072992, class072093.method_10069(i, j, k)));
                    }
                }
            }
        });
    }
}

