/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Option
 */
package dev.isxander.yacl3.config.v2.api.autogen;

import dev.isxander.yacl3.api.Option;
import java.util.function.Consumer;

public interface OptionAccess {
    public Option<?> getOption(String var1);

    public void scheduleOptionOperation(String var1, Consumer<Option<?>> var2);
}

