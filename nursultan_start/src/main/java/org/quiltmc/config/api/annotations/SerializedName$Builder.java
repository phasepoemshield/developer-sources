/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.api.metadata.SerialName;

public final class SerializedName$Builder
implements MetadataType$Builder {
    private String name;

    public void withName(String string) {
        this.name = string;
    }

    SerializedName$Builder() {
    }

    @Override
    public SerialName build() {
        return new SerialName(this.name);
    }
}

