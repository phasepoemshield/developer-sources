/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import org.quiltmc.config.api.metadata.NamingSchemes;

final class NamingSchemes$7
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
                stringBuilder2.appendCodePoint(Character.toUpperCase(string2.codePointAt(0)));
                stringBuilder2.append(string2.substring(1));
                bl = false;
                continue;
            }
            StringBuilder stringBuilder3 = stringBuilder2;
            stringBuilder3.append(" ");
            stringBuilder3.append(string2);
        }
        return stringBuilder2.toString();
    }
}

