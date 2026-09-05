/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class06541
 *  net.caffeinemc.mods.sodium.client.config.structure.ExternalButtonOption
 *  net.caffeinemc.mods.sodium.client.config.structure.Option
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package net.caffeinemc.mods.sodium.client.gui.options.control;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class06541;
import net.caffeinemc.mods.sodium.client.config.structure.ExternalButtonOption;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.gui.ColorTheme;
import net.caffeinemc.mods.sodium.client.gui.options.control.AbstractOptionList;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.ControlElement;
import net.caffeinemc.mods.sodium.client.gui.options.control.ExternalButtonControl$ExternalButtonControlElement;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class ExternalButtonControl
implements Control {
    public static final class00392 BASE_BUTTON_TEXT = class00392.L((String)"sodium.options.open_external_page_button");
    public static final String EXTERNAL_PAGE_PREFIX = "\u25b6 ";
    private final ExternalButtonOption option;
    private final Consumer<class05096> currentScreenConsumer;

    public ExternalButtonControl(ExternalButtonOption externalButtonOption, Consumer<class05096> consumer) {
        this.option = externalButtonOption;
        this.currentScreenConsumer = consumer;
    }

    @Override
    public Option getOption() {
        return this.option;
    }

    @Override
    public ControlElement createElement(class05096 class050962, AbstractOptionList abstractOptionList, Dim2i dim2i, ColorTheme colorTheme) {
        return new ExternalButtonControl$ExternalButtonControlElement(class050962, abstractOptionList, dim2i, this.option, this.currentScreenConsumer, colorTheme);
    }

    @Override
    public int getMaxWidth() {
        return 65;
    }

    public static class00392 formatExternalButtonText(boolean bl, ColorTheme colorTheme) {
        if (bl) {
            class05216 class052162 = class00392.i();
            class052162.y((class00392)BASE_BUTTON_TEXT.L().N(class06541.field_1073));
            class052162.y((class00392)class00392.y((String)" >").L().L(class00405.N.N(colorTheme.theme)));
            return class052162;
        }
        return BASE_BUTTON_TEXT.L().N(new class06541[]{class06541.field_1055, class06541.field_1080});
    }
}

