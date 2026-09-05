/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.Optional;
import java.util.regex.Pattern;
import org.quiltmc.config.api.Constraint;

class Constraint$1
implements Constraint {
    private final Pattern pattern;
    final /* synthetic */ String val$regex;

    Constraint$1(String string) {
        this.val$regex = string;
        this.pattern = Pattern.compile(string);
    }

    public Optional test(String string) {
        StringBuilder stringBuilder;
        StringBuilder stringBuilder2;
        if (((Constraint$1)((Object)string2)).pattern.matcher(string).matches()) {
            return Optional.empty();
        }
        String string2 = ((Constraint$1)((Object)string2)).val$regex;
        StringBuilder stringBuilder3 = stringBuilder2 = stringBuilder;
        stringBuilder2("Value '");
        stringBuilder3.append(string);
        stringBuilder3.append("' does not match pattern '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        return Optional.of(stringBuilder.toString());
    }

    @Override
    public String getRepresentation() {
        return "matches r'" + this.val$regex + "'";
    }
}

