/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 */
package dev.isxander.yacl3.gui.controllers.dropdown;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.gui.controllers.string.IStringController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class AbstractDropdownController<T>
implements IStringController<T> {
    protected final Option<T> option;
    private final List<String> allowedValues;
    public final boolean allowEmptyValue;
    public final boolean allowAnyValue;

    protected AbstractDropdownController(Option<T> option) {
        this(option, Collections.emptyList());
    }

    protected AbstractDropdownController(Option<T> option, List<String> list) {
        this(option, list, false, false);
    }

    protected AbstractDropdownController(Option<T> option, List<String> list, boolean bl, boolean bl2) {
        this.option = option;
        this.allowedValues = list;
        this.allowEmptyValue = bl;
        this.allowAnyValue = bl2;
    }

    public Option<T> option() {
        return this.option;
    }

    public boolean isValueValid(String string) {
        if (string.isBlank()) {
            return this.allowEmptyValue;
        }
        return this.allowAnyValue || this.getAllowedValues().contains(string);
    }

    public List<String> getAllowedValues() {
        return this.getAllowedValues("");
    }

    public List<String> getAllowedValues(String string) {
        ArrayList<String> arrayList = new ArrayList<String>(this.allowedValues);
        if (this.allowEmptyValue && !arrayList.contains("")) {
            arrayList.add("");
        }
        if (this.allowAnyValue && !string.isBlank() && !this.allowedValues.contains(string)) {
            arrayList.add(string);
        }
        String string2 = this.getString();
        if (this.allowAnyValue && !this.allowedValues.contains(string2)) {
            arrayList.add(string2);
        }
        return arrayList;
    }

    protected String getValidValue(String string) {
        return this.getValidValue(string, 0);
    }

    protected String getValidValue(String string, int n) {
        if (n == -1) {
            return this.getString();
        }
        String string4 = string.toLowerCase();
        return this.getAllowedValues(string).stream().filter(string2 -> string2.toLowerCase().contains(string4)).sorted((string2, string3) -> {
            String string4 = string2.toLowerCase();
            String string5 = string3.toLowerCase();
            if (string4.startsWith(string4) && !string5.startsWith(string4)) {
                return -1;
            }
            if (!string4.startsWith(string4) && string5.startsWith(string4)) {
                return 1;
            }
            return string2.compareTo((String)string3);
        }).skip(n).findFirst().orElseGet(this::getString);
    }
}

