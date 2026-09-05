/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.apache.commons.lang3.Validate
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.BasicFrame;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.apache.commons.lang3.Validate;

public class BasicFrame$Builder {
    private final List<Function<Dim2i, AbstractWidget>> functions = new ArrayList<Function<Dim2i, AbstractWidget>>();
    private Dim2i dim;
    private boolean renderOutline;
    private class05096 screen;
    private ModOptions modOptions;

    public BasicFrame build() {
        Validate.notNull((Object)this.dim, (String)"Dimension must be specified", (Object[])new Object[0]);
        Validate.notNull((Object)this.screen, (String)"Screen must be specified", (Object[])new Object[0]);
        return new BasicFrame(this.dim, this.screen, this.renderOutline, this.functions, this.modOptions);
    }

    public BasicFrame$Builder addChild(Function<Dim2i, AbstractWidget> function) {
        this.functions.add(function);
        return this;
    }

    public BasicFrame$Builder withDimension(Dim2i dim2i) {
        this.dim = dim2i;
        return this;
    }

    public BasicFrame$Builder withScreen(class05096 class050962) {
        this.screen = class050962;
        return this;
    }

    public BasicFrame$Builder withRenderOutline(boolean bl) {
        this.renderOutline = bl;
        return this;
    }

    public BasicFrame$Builder withModOptions(ModOptions modOptions) {
        this.modOptions = modOptions;
        return this;
    }
}

