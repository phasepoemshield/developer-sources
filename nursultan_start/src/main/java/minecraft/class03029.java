/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00500
 *  minecraft.class03003
 *  minecraft.class04018
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00500;
import minecraft.class03003;
import minecraft.class04018;
import org.jspecify.annotations.Nullable;

final class class03029
extends Record
implements class03003 {
    private final class04018 condition;
    private final class03003 followup;

    class03029(class04018 class040182, class03003 class030032) {
        this.condition = class040182;
        this.followup = class030032;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03029.class, "condition;followup", "condition", "followup"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03029.class, "condition;followup", "condition", "followup"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03029.class, "condition;followup", "condition", "followup"}, this);
    }

    public class03003 y() {
        return this.followup;
    }

    public class04018 N() {
        return this.condition;
    }

    public @Nullable class00500 tryApply(int n, int n2, int n3) {
        if (!this.condition.y()) {
            return null;
        }
        return this.followup.tryApply(n, n2, n3);
    }
}

