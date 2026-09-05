/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.security.InvalidParameterException;
import java.util.Objects;

public class SerialName {
    private final String name;

    public SerialName(String string) {
        if (string != null && !string.isEmpty()) {
            if (!string.contains(" ")) {
                this.name = string;
                return;
            }
            throw new InvalidParameterException("Cannot set serialized name to a value with spaces!");
        }
        throw new InvalidParameterException("Cannot set serialized name to an empty value!");
    }

    public boolean equals(Object object) {
        if (serialName2 == object) {
            return true;
        }
        if (object != null && serialName2.getClass() == object.getClass()) {
            SerialName serialName = serialName2;
            SerialName serialName2 = (SerialName)object;
            return Objects.equals(serialName.name, serialName2.name);
        }
        return false;
    }

    public int hashCode() {
        String string = ((SerialName)((Object)string)).name;
        return Objects.hash(string);
    }

    public String getName() {
        return this.name;
    }
}

