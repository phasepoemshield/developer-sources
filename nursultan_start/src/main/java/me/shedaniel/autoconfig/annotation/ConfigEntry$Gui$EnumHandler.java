/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$EnumHandler$EnumDisplayOption;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.FIELD})
public @interface ConfigEntry$Gui$EnumHandler {
    public ConfigEntry$Gui$EnumHandler$EnumDisplayOption option() default ConfigEntry$Gui$EnumHandler$EnumDisplayOption.DROPDOWN;
}

