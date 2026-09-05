/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.impl.client.screen.ScreenExtensions
 */
package net.fabricmc.fabric.api.client.screen.v1;

import java.util.Objects;
import minecraft.class05096;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterBackground;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterRender;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterTick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeInit;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeRender;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeTick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$Remove;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;

@Environment(value=EnvType.CLIENT)
public final class ScreenEvents {
    public static final Event<ScreenEvents$BeforeInit> BEFORE_INIT = EventFactory.createArrayBacked(ScreenEvents$BeforeInit.class, screenEvents$BeforeInitArray -> (class062022, class050962, n, n2) -> {
        for (ScreenEvents$BeforeInit screenEvents$BeforeInit : screenEvents$BeforeInitArray) {
            screenEvents$BeforeInit.beforeInit(class062022, class050962, n, n2);
        }
    });
    public static final Event<ScreenEvents$AfterInit> AFTER_INIT = EventFactory.createArrayBacked(ScreenEvents$AfterInit.class, screenEvents$AfterInitArray -> (class062022, class050962, n, n2) -> {
        for (ScreenEvents$AfterInit screenEvents$AfterInit : screenEvents$AfterInitArray) {
            screenEvents$AfterInit.afterInit(class062022, class050962, n, n2);
        }
    });

    private ScreenEvents() {
    }

    public static Event<ScreenEvents$Remove> remove(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getRemoveEvent();
    }

    public static Event<ScreenEvents$AfterBackground> afterBackground(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterBackgroundEvent();
    }

    public static Event<ScreenEvents$AfterTick> afterTick(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterTickEvent();
    }

    public static Event<ScreenEvents$BeforeTick> beforeTick(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeTickEvent();
    }

    public static Event<ScreenEvents$BeforeRender> beforeRender(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeRenderEvent();
    }

    public static Event<ScreenEvents$AfterRender> afterRender(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterRenderEvent();
    }
}

