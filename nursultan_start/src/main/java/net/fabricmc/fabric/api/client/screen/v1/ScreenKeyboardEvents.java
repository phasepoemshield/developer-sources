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
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AfterKeyRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$AllowKeyRelease;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyPress;
import net.fabricmc.fabric.api.client.screen.v1.ScreenKeyboardEvents$BeforeKeyRelease;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.impl.client.screen.ScreenExtensions;

@Environment(value=EnvType.CLIENT)
public final class ScreenKeyboardEvents {
    private ScreenKeyboardEvents() {
    }

    public static Event<ScreenKeyboardEvents$AfterKeyRelease> afterKeyRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterKeyReleaseEvent();
    }

    public static Event<ScreenKeyboardEvents$BeforeKeyRelease> beforeKeyRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeKeyReleaseEvent();
    }

    public static Event<ScreenKeyboardEvents$AfterKeyPress> afterKeyPress(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAfterKeyPressEvent();
    }

    public static Event<ScreenKeyboardEvents$AllowKeyRelease> allowKeyRelease(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowKeyReleaseEvent();
    }

    public static Event<ScreenKeyboardEvents$BeforeKeyPress> beforeKeyPress(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getBeforeKeyPressEvent();
    }

    public static Event<ScreenKeyboardEvents$AllowKeyPress> allowKeyPress(class05096 class050962) {
        Objects.requireNonNull(class050962, "Screen cannot be null");
        return ScreenExtensions.getExtensions((class05096)class050962).fabric_getAllowKeyPressEvent();
    }
}

