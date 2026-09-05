/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.player;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$After;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$Before;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents$Canceled;

public final class PlayerBlockBreakEvents {
    public static final Event<PlayerBlockBreakEvents$Before> BEFORE = EventFactory.createArrayBacked(PlayerBlockBreakEvents$Before.class, playerBlockBreakEvents$BeforeArray -> (class072992, class080362, class072092, class005002, class003942) -> {
        for (PlayerBlockBreakEvents$Before playerBlockBreakEvents$Before : playerBlockBreakEvents$BeforeArray) {
            boolean bl = playerBlockBreakEvents$Before.beforeBlockBreak(class072992, class080362, class072092, class005002, class003942);
            if (bl) continue;
            return false;
        }
        return true;
    });
    public static final Event<PlayerBlockBreakEvents$After> AFTER = EventFactory.createArrayBacked(PlayerBlockBreakEvents$After.class, playerBlockBreakEvents$AfterArray -> (class072992, class080362, class072092, class005002, class003942) -> {
        for (PlayerBlockBreakEvents$After playerBlockBreakEvents$After : playerBlockBreakEvents$AfterArray) {
            playerBlockBreakEvents$After.afterBlockBreak(class072992, class080362, class072092, class005002, class003942);
        }
    });
    public static final Event<PlayerBlockBreakEvents$Canceled> CANCELED = EventFactory.createArrayBacked(PlayerBlockBreakEvents$Canceled.class, playerBlockBreakEvents$CanceledArray -> (class072992, class080362, class072092, class005002, class003942) -> {
        for (PlayerBlockBreakEvents$Canceled playerBlockBreakEvents$Canceled : playerBlockBreakEvents$CanceledArray) {
            playerBlockBreakEvents$Canceled.onBlockBreakCanceled(class072992, class080362, class072092, class005002, class003942);
        }
    });

    private PlayerBlockBreakEvents() {
    }
}

