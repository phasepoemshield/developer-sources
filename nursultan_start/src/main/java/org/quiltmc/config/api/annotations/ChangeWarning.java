/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Optional;
import org.quiltmc.config.api.annotations.ChangeWarning$Builder;
import org.quiltmc.config.api.metadata.ChangeWarning$Type;
import org.quiltmc.config.api.metadata.MetadataType;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface ChangeWarning {
    public static final MetadataType TYPE = MetadataType.create(Optional::empty, ChangeWarning$Builder::new, true);

    public ChangeWarning$Type value();

    public String customMessage() default "";
}

