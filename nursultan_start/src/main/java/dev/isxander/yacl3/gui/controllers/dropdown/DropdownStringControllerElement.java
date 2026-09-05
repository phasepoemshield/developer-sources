/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownControllerElement;
import dev.isxander.yacl3.gui.controllers.dropdown.DropdownStringController;
import java.util.List;

public class DropdownStringControllerElement
extends AbstractDropdownControllerElement<String, String> {
    private final DropdownStringController controller;

    @Override
    public String getString(String string) {
        return string;
    }

    public DropdownStringControllerElement(DropdownStringController dropdownStringController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(dropdownStringController, yACLScreen, dimension);
        this.controller = dropdownStringController;
    }

    @Override
    public List<String> computeMatchingValues() {
        return this.controller.getAllowedValues(this.inputField).stream().filter(this::matchingValue).sorted((string, string2) -> {
            if (string.startsWith(this.inputField) && !string2.startsWith(this.inputField)) {
                return -1;
            }
            if (!string.startsWith(this.inputField) && string2.startsWith(this.inputField)) {
                return 1;
            }
            return string.compareTo((String)string2);
        }).toList();
    }
}

