/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.config.structure.Page
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.apache.commons.lang3.Validate
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.PageFrame;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Page;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.apache.commons.lang3.Validate;

public class PageFrame$Builder {
    private Dim2i dim;
    private boolean renderOutline;
    private Page page;
    private class05096 screen;
    private ModOptions modOptions;

    public PageFrame build() {
        Validate.notNull((Object)this.dim, (String)"Dimension must be specified", (Object[])new Object[0]);
        Validate.notNull((Object)this.page, (String)"Option Page must be specified", (Object[])new Object[0]);
        Validate.notNull((Object)this.screen, (String)"Screen must be specified", (Object[])new Object[0]);
        Validate.notNull((Object)this.modOptions, (String)"Mod Options must be specified", (Object[])new Object[0]);
        return new PageFrame(this.screen, this.dim, this.renderOutline, this.page, this.modOptions);
    }

    public PageFrame$Builder withDimension(Dim2i dim2i) {
        this.dim = dim2i;
        return this;
    }

    public PageFrame$Builder withScreen(class05096 class050962) {
        this.screen = class050962;
        return this;
    }

    public PageFrame$Builder withPage(Page page) {
        this.page = page;
        return this;
    }

    public PageFrame$Builder withRenderOutline(boolean bl) {
        this.renderOutline = bl;
        return this;
    }

    public PageFrame$Builder withModOptions(ModOptions modOptions) {
        this.modOptions = modOptions;
        return this;
    }
}

