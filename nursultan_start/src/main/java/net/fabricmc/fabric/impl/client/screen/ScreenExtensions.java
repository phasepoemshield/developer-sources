/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class06478
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterBackground
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterRender
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$AfterTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeRender
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$BeforeTick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenEvents$Remove
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyPress
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AfterMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$AllowMouseScroll
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseClick
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseDrag
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseRelease
 *  net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents$BeforeMouseScroll
 *  net.fabricmc.fabric.api.event.Event
 */
package net.fabricmc.fabric.impl.client.screen;

import java.util.List;
import minecraft.class05096;
import minecraft.class06478;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screen.v1.ScreenEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents;
import net.fabricmc.fabric.api.client.screen.v1.ScreenMouseEvents;
import net.fabricmc.fabric.api.event.Event;

@Environment(value=EnvType.CLIENT)
public interface ScreenExtensions {
    public static ScreenExtensions getExtensions(class05096 class050962) {
        return (ScreenExtensions)class050962;
    }

    public List<class06478> fabric_getButtons();

    public Event<ScreenEvents.BeforeTick> fabric_getBeforeTickEvent();

    public Event<ScreenEvents.AfterRender> fabric_getAfterRenderEvent();

    public Event<ScreenEvents.Remove> fabric_getRemoveEvent();

    public Event<ScreenEvents.AfterTick> fabric_getAfterTickEvent();

    public Event<ScreenEvents.AfterBackground> fabric_getAfterBackgroundEvent();

    public Event<ScreenMouseEvents.BeforeMouseDrag> fabric_getBeforeMouseDragEvent();

    public Event<ScreenKeyboardEvents.AllowKeyRelease> fabric_getAllowKeyReleaseEvent();

    public Event<ScreenMouseEvents.AllowMouseRelease> fabric_getAllowMouseReleaseEvent();

    public Event<ScreenMouseEvents.AfterMouseScroll> fabric_getAfterMouseScrollEvent();

    public Event<ScreenMouseEvents.AfterMouseClick> fabric_getAfterMouseClickEvent();

    public Event<ScreenKeyboardEvents.AllowKeyPress> fabric_getAllowKeyPressEvent();

    public Event<ScreenKeyboardEvents.BeforeKeyPress> fabric_getBeforeKeyPressEvent();

    public Event<ScreenKeyboardEvents.BeforeKeyRelease> fabric_getBeforeKeyReleaseEvent();

    public Event<ScreenKeyboardEvents.AfterKeyRelease> fabric_getAfterKeyReleaseEvent();

    public Event<ScreenMouseEvents.AfterMouseRelease> fabric_getAfterMouseReleaseEvent();

    public Event<ScreenMouseEvents.AfterMouseDrag> fabric_getAfterMouseDragEvent();

    public Event<ScreenMouseEvents.AllowMouseClick> fabric_getAllowMouseClickEvent();

    public Event<ScreenKeyboardEvents.AfterKeyPress> fabric_getAfterKeyPressEvent();

    public Event<ScreenMouseEvents.BeforeMouseClick> fabric_getBeforeMouseClickEvent();

    public Event<ScreenMouseEvents.AllowMouseScroll> fabric_getAllowMouseScrollEvent();

    public Event<ScreenMouseEvents.BeforeMouseScroll> fabric_getBeforeMouseScrollEvent();

    public Event<ScreenEvents.BeforeRender> fabric_getBeforeRenderEvent();

    public Event<ScreenMouseEvents.BeforeMouseRelease> fabric_getBeforeMouseReleaseEvent();

    public Event<ScreenMouseEvents.AllowMouseDrag> fabric_getAllowMouseDragEvent();
}

