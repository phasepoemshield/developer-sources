/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option.menu;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.OptionSet;
import net.irisshaders.iris.shaderpack.option.ProfileSet;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;
import net.irisshaders.iris.shaderpack.option.values.MutableOptionValues;
import net.irisshaders.iris.shaderpack.option.values.OptionValues;

public class OptionMenuProfileElement
extends OptionMenuElement {
    public final ProfileSet profiles;
    public final OptionSet options;
    private final OptionValues packAppliedValues;

    public OptionMenuProfileElement(ProfileSet profileSet, OptionSet optionSet, OptionValues optionValues) {
        this.profiles = profileSet;
        this.options = optionSet;
        this.packAppliedValues = optionValues;
    }

    public OptionValues getPendingOptionValues() {
        MutableOptionValues mutableOptionValues = this.packAppliedValues.mutableCopy();
        mutableOptionValues.addAll(Iris.getShaderPackOptionQueue());
        return mutableOptionValues;
    }
}

