/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended
 *  minecraft.class01054
 *  minecraft.class05096
 *  net.caffeinemc.mods.sodium.client.config.structure.ModOptions
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame;

import java.util.List;
import java.util.function.Function;
import me.flashyreese.mods.reeses_sodium_options.client.gui.AbstractWidgetExtended;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.AbstractFrame;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.BasicFrame$Builder;
import minecraft.class01054;
import minecraft.class05096;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class BasicFrame
extends AbstractFrame {
    protected List<Function<Dim2i, AbstractWidget>> functions;

    public BasicFrame(Dim2i dim2i, class05096 class050962, boolean bl, List<Function<Dim2i, AbstractWidget>> list, ModOptions modOptions) {
        super(dim2i, class050962, bl, modOptions);
        this.functions = list;
        this.buildFrame();
    }

    public static BasicFrame$Builder builder() {
        return new BasicFrame$Builder();
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
    }

    @Override
    public void buildFrame() {
        this.children.clear();
        this.controlElements.clear();
        this.functions.forEach(function -> this.children.add((AbstractWidget)function.apply(((AbstractWidgetExtended)this).getDim())));
        super.buildFrame();
    }
}

