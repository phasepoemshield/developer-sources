/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import org.jspecify.annotations.Nullable;

public final class class04712
extends Record {
    private final int statusCode;
    private final @Nullable String errorMessage;

    public @Nullable String L() {
        return this.errorMessage;
    }

    public class04712(int n, @Nullable String string) {
        this.statusCode = n;
        this.errorMessage = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04712.class, "statusCode;errorMessage", "statusCode", "errorMessage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04712.class, "statusCode;errorMessage", "statusCode", "errorMessage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04712.class, "statusCode;errorMessage", "statusCode", "errorMessage"}, this);
    }

    public int y() {
        return this.statusCode;
    }

    public @Nullable String N() {
        if (this.statusCode < 200 || this.statusCode >= 300) {
            if (this.statusCode == 400 && this.errorMessage != null) {
                return this.errorMessage;
            }
            return String.valueOf(this.statusCode);
        }
        return null;
    }
}

