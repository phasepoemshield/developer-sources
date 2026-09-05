/*
 * Decompiled with CFR 0.152.
 */
package com.terraformersmc.modmenu.config;

public enum ModMenuConfig$ModCountLocation {
    TITLE_SCREEN(true, false),
    MODS_BUTTON(false, true),
    TITLE_SCREEN_AND_MODS_BUTTON(true, true),
    NONE(false, false);

    private final boolean titleScreen;
    private final boolean modsButton;

    private ModMenuConfig$ModCountLocation(boolean bl, boolean bl2) {
        this.titleScreen = bl;
        this.modsButton = bl2;
    }

    public boolean isOnModsButton() {
        return this.modsButton;
    }

    public boolean isOnTitleScreen() {
        return this.titleScreen;
    }
}

