/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.impl.client.screen.ScreenExtensions
 */
package net.fabricmc.fabric.api.client.screen.v1;

import java.util.Objects;
import minecraft.class05096;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseScroll;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseClick;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseDrag;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseScroll;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;

@Environment(value=EnvType.CLIENT)
public final class ScreenMouseEvents {
    private ScreenMouseEvents() {
    }

    public static Event<ScreenMouseEvents$BeforeMouseClick> beforeMouseClick(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeMouseClickEvent();
    }

    public static Event<ScreenMouseEvents$AfterMouseClick> afterMouseClick(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterMouseClickEvent();
    }

    public static Event<ScreenMouseEvents$BeforeMouseRelease> beforeMouseRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeMouseReleaseEvent();
    }

    public static Event<ScreenMouseEvents$AfterMouseRelease> afterMouseRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterMouseReleaseEvent();
    }

    public static Event<ScreenMouseEvents$AllowMouseScroll> allowMouseScroll(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowMouseScrollEvent();
    }

    public static Event<ScreenMouseEvents$AfterMouseDrag> afterMouseDrag(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterMouseDragEvent();
    }

    public static Event<ScreenMouseEvents$AllowMouseDrag> allowMouseDrag(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowMouseDragEvent();
    }

    public static Event<ScreenMouseEvents$BeforeMouseDrag> beforeMouseDrag(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeMouseDragEvent();
    }

    public static Event<ScreenMouseEvents$BeforeMouseScroll> beforeMouseScroll(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeMouseScrollEvent();
    }

    public static Event<ScreenMouseEvents$AllowMouseClick> allowMouseClick(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowMouseClickEvent();
    }

    public static Event<ScreenMouseEvents$AllowMouseRelease> allowMouseRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowMouseReleaseEvent();
    }

    public static Event<ScreenMouseEvents$AfterMouseScroll> afterMouseScroll(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterMouseScrollEvent();
    }
}

