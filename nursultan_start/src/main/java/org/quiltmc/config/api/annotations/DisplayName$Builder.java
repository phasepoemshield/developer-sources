/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import org.quiltmc.config.api.metadata.DisplayName;
import org.quiltmc.config.api.metadata.MetadataType$Builder;

public final class DisplayName$Builder
implements MetadataType$Builder {
    private String name;
    private boolean translatable;

    public void setName(String string) {
        this.name = string;
    }

    @Override
    public DisplayName build() {
        DisplayName$Builder displayName$Builder = string;
        String string = displayName$Builder.name;
        return new DisplayName(string, displayName$Builder.translatable);
    }

    public void setTranslatable(boolean bl) {
        this.translatable = bl;
    }
}

