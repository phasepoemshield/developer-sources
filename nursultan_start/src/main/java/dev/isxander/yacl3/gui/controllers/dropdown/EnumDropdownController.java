/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import dev.isxander.yacl3.gui.YACLScreen;
import dev.isxander.yacl3.gui.controllers.dropdown.AbstractDropdownController;
import dev.isxander.yacl3.gui.controllers.dropdown.EnumDropdownControllerElement;
import java.util.Arrays;
import java.util.stream.Stream;
import minecraft.class00392;

public class EnumDropdownController<E extends Enum<E>>
extends AbstractDropdownController<E> {
    protected final ValueFormatter<E> formatter;

    @Override
    public String getString() {
        return this.formatter.format((Object)((Enum)this.option().pendingValue())).getString();
    }

    public EnumDropdownController(Option<E> option, ValueFormatter<E> valueFormatter) {
        super(option, Arrays.stream((Enum[])((Enum)option.pendingValue()).getDeclaringClass().getEnumConstants()).map(arg_0 -> valueFormatter.format(arg_0)).map(class00392::getString).toList());
        this.formatter = valueFormatter;
    }

    protected Stream<String> getValidEnumConstants(String string) {
        String string4 = string.toLowerCase();
        return this.getAllowedValues().stream().filter(string2 -> string2.toLowerCase().contains(string4)).sorted((string2, string3) -> {
            String string4 = string2.toLowerCase();
            String string5 = string3.toLowerCase();
            if (string4.startsWith(string4) && !string5.startsWith(string4)) {
                return -1;
            }
            if (!string4.startsWith(string4) && string5.startsWith(string4)) {
                return 1;
            }
            return string2.compareTo((String)string3);
        });
    }

    @Override
    public AbstractWidget provideWidget(YACLScreen yACLScreen, Dimension<Integer> dimension) {
        return new EnumDropdownControllerElement(this, yACLScreen, dimension);
    }

    @Override
    public boolean isValueValid(String string) {
        string = string.toLowerCase();
        for (String string2 : this.getAllowedValues()) {
            if (!string2.equals(string)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void setFromString(String string) {
        this.option().requestSet(this.getEnumFromString(string));
    }

    @Override
    protected String getValidValue(String string, int n) {
        return this.getValidEnumConstants(string).skip(n).findFirst().orElseGet(this::getString);
    }

    private E getEnumFromString(String string) {
        string = string.toLowerCase();
        for (Enum enum_ : (Enum[])((Enum)this.option().pendingValue()).getDeclaringClass().getEnumConstants()) {
            if (!this.formatter.format((Object)enum_).getString().toLowerCase().equals(string)) continue;
            return (E)enum_;
        }
        return (E)((Enum)this.option().pendingValue());
    }
}

