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
import dev.isxander.yacl3.gui.controllers.dropdown.EnumDropdownController;
import java.util.List;

public class EnumDropdownControllerElement<E extends Enum<E>>
extends AbstractDropdownControllerElement<E, String> {
    private final EnumDropdownController<E> controller;

    @Override
    public String getString(String string) {
        return string;
    }

    public EnumDropdownControllerElement(EnumDropdownController<E> enumDropdownController, YACLScreen yACLScreen, Dimension<Integer> dimension) {
        super(enumDropdownController, yACLScreen, dimension);
        this.controller = enumDropdownController;
    }

    @Override
    public List<String> computeMatchingValues() {
        return this.controller.getValidEnumConstants(this.inputField).toList();
    }
}

