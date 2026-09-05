/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface Processor {
    public String value();
}

