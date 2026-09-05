/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.FieldAccess;
import dev.isxander.yacl3.config.v2.api.ReadOnlyFieldAccess;
import dev.isxander.yacl3.config.v2.api.SerialField;
import dev.isxander.yacl3.config.v2.api.autogen.AutoGenField;
import java.util.Optional;

public interface ConfigField<T> {
    public ReadOnlyFieldAccess<T> defaultAccess();

    public ConfigClassHandler<?> parent();

    public FieldAccess<T> access();

    public Optional<AutoGenField> autoGen();

    public Optional<SerialField> serial();
}

