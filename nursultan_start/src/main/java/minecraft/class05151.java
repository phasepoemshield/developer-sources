/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.gson.JsonObject;
import org.jspecify.annotations.Nullable;

public abstract class class05151<T> {
    private final @Nullable T N;

    boolean M() {
        return false;
    }

    public class05151(@Nullable T t) {
        this.N = t;
    }

    public @Nullable T B() {
        return this.N;
    }

    protected abstract void N(JsonObject var1);
}

