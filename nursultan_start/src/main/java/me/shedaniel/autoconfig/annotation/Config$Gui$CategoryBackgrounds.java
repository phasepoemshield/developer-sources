/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.shedaniel.autoconfig.annotation.Config$Gui$CategoryBackground;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
public @interface Config$Gui$CategoryBackgrounds {
    public Config$Gui$CategoryBackground[] value();
}

