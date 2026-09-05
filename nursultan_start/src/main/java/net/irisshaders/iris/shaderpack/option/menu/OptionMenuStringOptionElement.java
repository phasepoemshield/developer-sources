/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.option.menu;

import net.irisshaders.iris.shaderpack.option.StringOption;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuOptionElement;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class OptionMenuStringOptionElement
extends OptionMenuOptionElement {
    public final StringOption option;

    public OptionMenuStringOptionElement(String string, OptionMenuContainer optionMenuContainer, ShaderProperties shaderProperties, OptionValues optionValues, StringOption stringOption) {
        super(string, optionMenuContainer, shaderProperties, optionValues);
        this.option = stringOption;
    }
}

