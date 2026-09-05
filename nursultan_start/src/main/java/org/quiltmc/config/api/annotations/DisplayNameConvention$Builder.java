/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.metadata.NamingSchemes;

public final class DisplayNameConvention$Builder
implements MetadataType$Builder {
    private NamingScheme scheme = NamingSchemes.PASSTHROUGH;

    public void set(NamingScheme namingScheme) {
        this.scheme = namingScheme;
    }

    @Override
    public NamingScheme build() {
        return this.scheme;
    }
}

