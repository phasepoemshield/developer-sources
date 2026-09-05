/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.api.metadata.NamingScheme;
import org.quiltmc.config.api.metadata.NamingSchemes;

public final class SerializedNameConvention$Builder
implements MetadataType$Builder {
    private NamingScheme scheme = NamingSchemes.PASSTHROUGH;

    SerializedNameConvention$Builder() {
    }

    public void set(NamingScheme namingScheme) {
        if (namingScheme != NamingSchemes.SPACE_SEPARATED_LOWER_CASE && namingScheme != NamingSchemes.SPACE_SEPARATED_LOWER_CASE_INITIAL_UPPER_CASE && namingScheme != NamingSchemes.TITLE_CASE) {
            this.scheme = namingScheme;
            return;
        }
        throw new IllegalArgumentException("Scheme with spaces unsupported for serialized names");
    }

    @Override
    public NamingScheme build() {
        return this.scheme;
    }
}

