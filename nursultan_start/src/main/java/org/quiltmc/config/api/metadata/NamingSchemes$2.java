/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import org.quiltmc.config.api.metadata.NamingSchemes;

final class NamingSchemes$2
extends NamingSchemes {
    @Override
    public String coerce(String stringArray) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder = new StringBuilder();
        for (String string : NamingSchemes.access$100((String)stringArray)) {
            if (string.isEmpty()) continue;
            stringBuilder2.appendCodePoint(Character.toUpperCase(string.codePointAt(0)));
            stringBuilder2.append(string.substring(1));
        }
        return stringBuilder2.toString();
    }
}

