/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.api;

import java.util.Optional;

public interface SerialField {
    public boolean required();

    public Optional<String> comment();

    public boolean nullable();

    public String serialName();
}

