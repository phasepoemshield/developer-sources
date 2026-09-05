/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionEventListener$Event;

@FunctionalInterface
public interface OptionEventListener<T> {
    public void onEvent(Option<T> var1, OptionEventListener$Event var2);
}

