/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Config$Gui$Background {
    public static final String TRANSPARENT = "cloth-config2:transparent";

    public String value();
}

