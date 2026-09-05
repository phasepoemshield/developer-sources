/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 */
package dev.isxander.yacl3.gui.controllers.string;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.gui.controllers.string.IStringController;

public class StringController
implements IStringController<String> {
    private final Option<String> option;

    @Override
    public String getString() {
        return (String)this.option().pendingValue();
    }

    public StringController(Option<String> option) {
        this.option = option;
    }

    public Option<String> option() {
        return this.option;
    }

    @Override
    public void setFromString(String string) {
        this.option().requestSet((Object)string);
    }
}

