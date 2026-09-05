/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Optional;
import org.quiltmc.config.api.annotations.SerializedNameConvention$Builder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.metadata.NamingSchemes;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface SerializedNameConvention {
    public static final MetadataType TYPE = MetadataType.create(Optional::empty, SerializedNameConvention$Builder::new, true);

    public String custom() default "";

    public NamingSchemes value() default NamingSchemes.PASSTHROUGH;
}

