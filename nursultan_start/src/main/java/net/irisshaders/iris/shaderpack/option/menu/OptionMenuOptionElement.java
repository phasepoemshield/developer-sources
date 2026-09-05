/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option.menu;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public abstract class OptionMenuOptionElement
extends OptionMenuElement {
    public final boolean slider;
    public final OptionMenuContainer container;
    public final String optionId;
    private final OptionValues packAppliedValues;

    public OptionMenuOptionElement(String string, OptionMenuContainer optionMenuContainer, ShaderProperties shaderProperties, OptionValues optionValues) {
        this.slider = shaderProperties.getSliderOptions().contains(string);
        this.container = optionMenuContainer;
        this.optionId = string;
        this.packAppliedValues = optionValues;
    }

    public OptionValues getAppliedOptionValues() {
        return this.packAppliedValues;
    }

    public OptionValues getPendingOptionValues() {
        MutableOptionValues mutableOptionValues = this.getAppliedOptionValues().mutableCopy();
        mutableOptionValues.addAll(Iris.getShaderPackOptionQueue());
        return mutableOptionValues;
    }
}

