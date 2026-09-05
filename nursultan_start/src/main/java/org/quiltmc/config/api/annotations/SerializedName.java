/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Optional;
import org.quiltmc.config.api.annotations.SerializedName$Builder;
import org.quiltmc.config.api.metadata.MetadataType;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface SerializedName {
    public static final MetadataType TYPE = MetadataType.create(Optional::empty, SerializedName$Builder::new);

    public String value();
}

