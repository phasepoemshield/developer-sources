/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.CommentsImpl
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Optional;
import org.quiltmc.config.api.annotations.Comment$Builder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.CommentsImpl;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface Comment {
    public static final MetadataType TYPE = MetadataType.create(() -> Optional.of(new CommentsImpl(Collections.emptyList())), Comment$Builder::new);

    public String[] value();
}

