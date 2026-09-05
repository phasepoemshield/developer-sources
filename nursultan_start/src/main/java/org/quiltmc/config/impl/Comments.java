/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.annotations.Comment
 */
package org.quiltmc.config.impl;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import org.quiltmc.config.api.annotations.Comment;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface Comments {
    public Comment[] value();
}

