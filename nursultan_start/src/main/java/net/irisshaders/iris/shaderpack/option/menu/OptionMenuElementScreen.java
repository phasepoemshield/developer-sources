/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 */
package net.irisshaders.iris.shaderpack.option.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.option.ShaderPackOptions;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuContainer;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuOptionElement;
import net.irisshaders.iris.shaderpack.properties.ShaderProperties;

public class OptionMenuElementScreen {
    public final List<OptionMenuElement> elements = new ArrayList<OptionMenuElement>();
    private final Optional<Integer> columnCount;

    public OptionMenuElementScreen(OptionMenuContainer optionMenuContainer, ShaderProperties shaderProperties, ShaderPackOptions shaderPackOptions, List<String> list, Optional<Integer> optional) {
        this.columnCount = optional;
        for (String string : list) {
            if ("*".equals(string)) {
                optionMenuContainer.queueForUnusedOptionDump(this.elements.size(), this.elements);
                continue;
            }
            try {
                OptionMenuElement optionMenuElement = OptionMenuElement.create(string, optionMenuContainer, shaderProperties, shaderPackOptions);
                if (optionMenuElement == null) continue;
                this.elements.add(optionMenuElement);
                if (!(optionMenuElement instanceof OptionMenuOptionElement)) continue;
                optionMenuContainer.notifyOptionAdded(string, (OptionMenuOptionElement)optionMenuElement);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                Iris.logger.warn(illegalArgumentException.getMessage());
                this.elements.add(OptionMenuElement.EMPTY);
            }
        }
    }

    public int getColumnCount() {
        return this.columnCount.orElse(this.elements.size() > 18 ? 3 : 2);
    }
}

