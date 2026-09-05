/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00667
 *  minecraft.class03397
 *  minecraft.class04469
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00667;
import minecraft.class03397;
import minecraft.class04469;
import org.jspecify.annotations.Nullable;

public class class03928
extends Record {
    public int id;
    public @Nullable class04469 fullSignature;
    public static Object N_0;

    private static void L() {
    }

    public class03928(class04469 class044692) {
        this(-1, class044692);
    }

    public class03928(int n, @Nullable class04469 class044692) {
        this.id = n;
        this.fullSignature = class044692;
    }

    public class03928(int n) {
        this(n, null);
    }

    static {
        class03928.L();
        class03928.i();
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03928.class, "id;fullSignature", "id", "fullSignature"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03928.class, "id;fullSignature", "id", "fullSignature"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03928.class, "id;fullSignature", "id", "fullSignature"}, this);
    }

    private static void i() {
        N_0 = -1;
    }

    public @Nullable class04469 y() {
        return this.fullSignature;
    }

    public static class03928 N(class00667 class006672) {
        int n = class006672.E() - 1;
        if (n == -1) {
            return new class03928(class04469.N((class00667)class006672));
        }
        return new class03928(n);
    }

    public int N() {
        return this.id;
    }

    public Optional<class04469> N(class03397 class033972) {
        if (this.fullSignature != null) {
            return Optional.of(this.fullSignature);
        }
        return Optional.ofNullable(class033972.N(this.id));
    }

    public static void N(class00667 class006672, class03928 class039282) {
        class006672.L(class039282.N() + 1);
        if (class039282.y() != null) {
            class04469.N((class00667)class006672, (class04469)class039282.y());
        }
    }
}

