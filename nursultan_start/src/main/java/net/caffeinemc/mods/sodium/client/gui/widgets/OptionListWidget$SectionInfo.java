/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;

final class OptionListWidget$SectionInfo
extends Record {
    private final ModOptions modOptions;
    private final Page page;
    final int startY;
    final int endY;
    final int scrollJumpTarget;

    public Page page() {
        return this.page;
    }

    OptionListWidget$SectionInfo(ModOptions modOptions, Page page, int n, int n2, int n3) {
        this.modOptions = modOptions;
        this.page = page;
        this.startY = n;
        this.endY = n2;
        this.scrollJumpTarget = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{OptionListWidget$SectionInfo.class, "modOptions;page;startY;endY;scrollJumpTarget", "modOptions", "page", "startY", "endY", "scrollJumpTarget"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{OptionListWidget$SectionInfo.class, "modOptions;page;startY;endY;scrollJumpTarget", "modOptions", "page", "startY", "endY", "scrollJumpTarget"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{OptionListWidget$SectionInfo.class, "modOptions;page;startY;endY;scrollJumpTarget", "modOptions", "page", "startY", "endY", "scrollJumpTarget"}, this);
    }

    public int scrollJumpTarget() {
        return this.scrollJumpTarget;
    }

    public ModOptions modOptions() {
        return this.modOptions;
    }

    public int endY() {
        return this.endY;
    }

    public int startY() {
        return this.startY;
    }
}

