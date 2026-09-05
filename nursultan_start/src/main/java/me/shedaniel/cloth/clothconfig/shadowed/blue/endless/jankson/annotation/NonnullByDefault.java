/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.meta.TypeQualifierDefault
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.annotation.Nonnull;
import javax.annotation.meta.TypeQualifierDefault;

@Nonnull
@TypeQualifierDefault(value={ElementType.METHOD, ElementType.PARAMETER})
@Retention(value=RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE, ElementType.PACKAGE})
public @interface NonnullByDefault {
}

