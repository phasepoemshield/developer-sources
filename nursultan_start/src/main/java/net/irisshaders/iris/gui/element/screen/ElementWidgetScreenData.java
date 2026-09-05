/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package net.irisshaders.iris.gui.element.screen;

import minecraft.class00392;

public record ElementWidgetScreenData(class00392 heading, boolean backButton) {
    public static final ElementWidgetScreenData EMPTY = new ElementWidgetScreenData((class00392)class00392.i(), true);
}

