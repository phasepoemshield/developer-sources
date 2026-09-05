/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  javax.annotation.Nullable
 */
package me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.impl;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.JsonElement;

public class AnnotatedElement {
    protected String comment;
    protected JsonElement elem;

    @Nonnull
    public JsonElement getElement() {
        return this.elem;
    }

    public AnnotatedElement(@Nonnull JsonElement jsonElement, @Nullable String string) {
        this.comment = string;
        this.elem = jsonElement;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }
}

