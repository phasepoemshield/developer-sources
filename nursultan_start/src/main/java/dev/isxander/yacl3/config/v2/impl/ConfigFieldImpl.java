/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.SerialEntry;
import dev.isxander.yacl3.config.v2.api.SerialField;
import dev.isxander.yacl3.config.v2.api.autogen.AutoGen;
import dev.isxander.yacl3.config.v2.api.autogen.AutoGenField;
import dev.isxander.yacl3.config.v2.impl.ConfigFieldImpl$AutoGenFieldImpl;
import dev.isxander.yacl3.config.v2.impl.ConfigFieldImpl$SerialFieldImpl;
import dev.isxander.yacl3.config.v2.impl.ReflectionFieldAccess;
import java.util.Optional;

public class ConfigFieldImpl<T>
implements ConfigField<T> {
    private ReflectionFieldAccess<T> field;
    private final ReflectionFieldAccess<T> defaultField;
    private final ConfigClassHandler<?> parent;
    private final Optional<SerialField> serial;
    private final Optional<AutoGenField> autoGen;

    @Override
    public ReflectionFieldAccess<T> defaultAccess() {
        return this.defaultField;
    }

    public ConfigFieldImpl(ReflectionFieldAccess<T> reflectionFieldAccess, ReflectionFieldAccess<T> reflectionFieldAccess2, ConfigClassHandler<?> configClassHandler, SerialEntry serialEntry, SerialEntry serialEntry2, AutoGen autoGen) {
        this.field = reflectionFieldAccess;
        this.defaultField = reflectionFieldAccess2;
        this.parent = configClassHandler;
        this.serial = serialEntry != null ? Optional.of(new ConfigFieldImpl$SerialFieldImpl("".equals(serialEntry.value()) ? reflectionFieldAccess.name() : serialEntry.value(), "".equals(serialEntry.comment()) ? Optional.empty() : Optional.of(serialEntry.comment()), serialEntry.required(), serialEntry.nullable())) : (serialEntry2 != null ? Optional.of(new ConfigFieldImpl$SerialFieldImpl(reflectionFieldAccess.name(), Optional.empty(), serialEntry2.required(), serialEntry2.nullable())) : Optional.empty());
        this.autoGen = autoGen != null ? Optional.of(new ConfigFieldImpl$AutoGenFieldImpl(autoGen.category(), "".equals(autoGen.group()) ? Optional.empty() : Optional.of(autoGen.group()))) : Optional.empty();
    }

    @Override
    public ConfigClassHandler<?> parent() {
        return this.parent;
    }

    @Override
    public ReflectionFieldAccess<T> access() {
        return this.field;
    }

    public void setFieldAccess(ReflectionFieldAccess<T> reflectionFieldAccess) {
        this.field = reflectionFieldAccess;
    }

    @Override
    public Optional<AutoGenField> autoGen() {
        return this.autoGen;
    }

    @Override
    public Optional<SerialField> serial() {
        return this.serial;
    }
}

