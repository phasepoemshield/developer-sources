/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package net.irisshaders.iris.shaderpack.option.menu;

import com.google.common.collect.ImmutableMap;
import net.irisshaders.iris.shaderpack.option.MergedBooleanOption;
import net.irisshaders.iris.shaderpack.option.MergedStringOption;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuBooleanOptionElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement$1;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuLinkElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuProfileElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuStringOptionElement;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public abstract class OptionMenuElement {
    public static final OptionMenuElement EMPTY = new OptionMenuElement$1();
    private static final String ELEMENT_EMPTY = "<empty>";
    private static final String ELEMENT_PROFILE = "<profile>";

    public static OptionMenuElement create(String string, OptionMenuContainer optionMenuContainer, ShaderProperties shaderProperties, ShaderPackOptions shaderPackOptions) throws IllegalArgumentException {
        if (ELEMENT_EMPTY.equals(string)) {
            return EMPTY;
        }
        if (ELEMENT_PROFILE.equals(string)) {
            return optionMenuContainer.getProfiles().size() > 0 ? new OptionMenuProfileElement(optionMenuContainer.getProfiles(), shaderPackOptions.getOptionSet(), shaderPackOptions.getOptionValues()) : null;
        }
        if (string.startsWith("[") && string.endsWith("]")) {
            return new OptionMenuLinkElement(string.substring(1, string.length() - 1));
        }
        ImmutableMap<String, MergedBooleanOption> immutableMap = shaderPackOptions.getOptionSet().getBooleanOptions();
        ImmutableMap<String, MergedStringOption> immutableMap2 = shaderPackOptions.getOptionSet().getStringOptions();
        if (immutableMap.containsKey(string)) {
            return new OptionMenuBooleanOptionElement(string, optionMenuContainer, shaderProperties, shaderPackOptions.getOptionValues(), ((MergedBooleanOption)immutableMap.get(string)).getOption());
        }
        if (immutableMap2.containsKey(string)) {
            return new OptionMenuStringOptionElement(string, optionMenuContainer, shaderProperties, shaderPackOptions.getOptionValues(), ((MergedStringOption)immutableMap2.get(string)).getOption());
        }
        throw new IllegalArgumentException("Unable to resolve shader pack option menu element \"" + string + "\" defined in shaders.properties");
    }
}

