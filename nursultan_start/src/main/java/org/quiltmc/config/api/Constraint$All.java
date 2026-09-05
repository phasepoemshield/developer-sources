/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.Optional;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.values.CompoundConfigValue;

public final class Constraint$All
implements Constraint {
    private final Constraint constraint;

    public Constraint$All(Constraint constraint) {
        this.constraint = constraint;
    }

    public Optional test(CompoundConfigValue object) {
        StringBuilder stringBuilder;
        CompoundConfigValue compoundConfigValue = object;
        object = stringBuilder;
        stringBuilder = new StringBuilder();
        for (Object object2 : compoundConfigValue.values()) {
            if (!((Optional)(object2 = this.constraint.test(object2))).isPresent()) continue;
            if (((StringBuilder)object).length() != 0) {
                ((StringBuilder)object).append(", ");
            }
            ((StringBuilder)object).append((String)((Optional)object2).get());
        }
        return ((StringBuilder)object).length() == 0 ? Optional.empty() : Optional.of(((StringBuilder)object).toString());
    }

    @Override
    public String getRepresentation() {
        return "all(" + this.constraint.getRepresentation() + ")";
    }
}

