/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.annotations;

import org.quiltmc.config.api.metadata.ChangeWarning;
import org.quiltmc.config.api.metadata.ChangeWarning$Type;
import org.quiltmc.config.api.metadata.MetadataType$Builder;

public final class ChangeWarning$Builder
implements MetadataType$Builder {
    private String message;
    private ChangeWarning$Type type;

    public void setType(ChangeWarning$Type type) {
        this.type = type;
    }

    @Override
    public ChangeWarning build() {
        ChangeWarning$Builder changeWarning$Builder = string;
        String string = changeWarning$Builder.message;
        return new ChangeWarning(string, changeWarning$Builder.type);
    }

    public void setMessage(String string) {
        this.setType(ChangeWarning$Type.Custom);
        this.message = string;
    }

    public void setTranslatableMessage(String string) {
        this.setType(ChangeWarning$Type.CustomTranslatable);
        this.setMessage(string);
    }
}

