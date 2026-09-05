/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.util.Objects;
import org.quiltmc.config.api.metadata.ChangeWarning$Type;

public class ChangeWarning {
    private final String customMessage;
    private final ChangeWarning$Type type;

    public ChangeWarning(String string, ChangeWarning$Type changeWarning$Type) {
        this.customMessage = string;
        this.type = changeWarning$Type;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (ChangeWarning)object;
            return Objects.equals(this.customMessage, ((ChangeWarning)object).customMessage) && this.type == ((ChangeWarning)object).type;
        }
        return false;
    }

    public int hashCode() {
        ChangeWarning changeWarning = string;
        String string = changeWarning.customMessage;
        ChangeWarning$Type changeWarning$Type = changeWarning.type;
        return Objects.hash(new Object[]{string, changeWarning$Type});
    }

    public ChangeWarning$Type getType() {
        return this.type;
    }

    public String getCustomMessage() {
        return this.customMessage;
    }
}

