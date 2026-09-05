/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02057
 *  minecraft.class02060
 *  minecraft.class02072
 *  minecraft.class02080
 *  minecraft.class02102
 *  minecraft.class04230
 *  minecraft.class05216
 */
package net.irisshaders.iris.gui.debug;

import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02057;
import minecraft.class02060;
import minecraft.class02072;
import minecraft.class02080;
import minecraft.class02102;
import minecraft.class04230;
import minecraft.class05216;
import net.irisshaders.iris.gui.debug.DebugTextWidget$Content;

class DebugTextWidget$ContentBuilder {
    private final int width;
    private final class02060 grid;
    private final class02080 helper;
    private final class02072 alignHeader;
    private final class05216 narration = class00392.i();

    public DebugTextWidget$ContentBuilder(int n) {
        this.width = n;
        this.grid = new class02060();
        this.grid.L().N();
        this.helper = this.grid.u(1);
        this.helper.N((class02102)class02057.N((int)n));
        this.alignHeader = this.helper.y().y().R(32);
    }

    public DebugTextWidget$Content build() {
        this.grid.N();
        return new DebugTextWidget$Content(this.grid, (class00392)this.narration);
    }

    public void addHeader(class01590 class015902, class00392 class003922) {
        this.helper.N((class02102)new class04230(this.width - 64, 1, class003922, class015902).N(true), this.alignHeader);
        this.narration.y(class003922).i("\n");
    }

    public void addLine(class01590 class015902, class00392 class003922, int n) {
        this.helper.N((class02102)new class04230(this.width, 1, class003922, class015902), this.helper.y().i(n));
        this.narration.y(class003922).i("\n");
    }

    public void addLine(class01590 class015902, class00392 class003922) {
        this.addLine(class015902, class003922, 0);
    }

    public void addSpacer(int n) {
        this.helper.N((class02102)class02057.y((int)n));
    }
}

