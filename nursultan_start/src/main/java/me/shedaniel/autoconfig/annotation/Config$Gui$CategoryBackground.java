/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import me.shedaniel.autoconfig.annotation.Config$Gui$CategoryBackgrounds;

@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Repeatable(value=Config.Gui.CategoryBackgrounds.class)
public @interface Config$Gui$CategoryBackground {
    public String category();

    public String background();
}

