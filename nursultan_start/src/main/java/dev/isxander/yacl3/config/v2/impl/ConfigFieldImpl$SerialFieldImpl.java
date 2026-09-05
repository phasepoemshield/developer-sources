/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.config.v2.api.SerialField;
import java.util.Optional;

record ConfigFieldImpl$SerialFieldImpl(String serialName, Optional<String> comment, boolean required, boolean nullable) implements SerialField
{
}

