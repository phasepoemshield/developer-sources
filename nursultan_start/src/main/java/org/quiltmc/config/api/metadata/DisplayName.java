/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.security.InvalidParameterException;
import java.util.Objects;

public class DisplayName {
    private final String name;
    private final boolean translatable;

    public DisplayName(String string, boolean bl) {
        if (string != null && !string.isEmpty()) {
            DisplayName displayName = this;
            displayName.translatable = bl;
            displayName.name = string;
            return;
        }
        throw new InvalidParameterException("Cannot set serialized name to an empty value!");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            object = (DisplayName)object;
            return this.translatable == ((DisplayName)object).translatable && Objects.equals(this.name, ((DisplayName)object).name);
        }
        return false;
    }

    public int hashCode() {
        DisplayName displayName = string;
        String string = displayName.name;
        Boolean bl = displayName.translatable;
        return Objects.hash(string, bl);
    }

    public String getName() {
        return this.name;
    }

    public boolean isTranslatable() {
        return this.translatable;
    }
}

