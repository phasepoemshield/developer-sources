/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import org.quiltmc.config.api.metadata.NamingSchemes;

final class NamingSchemes$8
extends NamingSchemes {
    @Override
    public String coerce(String string) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2 = stringBuilder;
        stringBuilder = new StringBuilder();
        boolean bl = true;
        for (String string2 : NamingSchemes.access$100(string)) {
            if (string2.isEmpty()) continue;
            if (bl) {
                bl = false;
            } else {
                stringBuilder2.append(" ");
            }
            stringBuilder2.appendCodePoint(Character.toUpperCase(string2.codePointAt(0)));
            stringBuilder2.append(string2.substring(1));
        }
        return stringBuilder2.toString();
    }
}

