/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.AliasesImpl
 */
package org.quiltmc.config.api.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.Optional;
import org.quiltmc.config.api.annotations.Alias$Builder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.impl.AliasesImpl;

@Retention(value=RetentionPolicy.RUNTIME)
public @interface Alias {
    public static final MetadataType TYPE = MetadataType.create(() -> Optional.of(new AliasesImpl(Collections.emptyList())), Alias$Builder::new);

    public String[] value();
}

