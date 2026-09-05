/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import org.jspecify.annotations.Nullable;

public class class10712 {
    private final String N;
    private final String y;

    public class10712(String string, @Nullable Object object) {
        this.N = string;
        if (object == null) {
            this.y = "~~NULL~~";
        } else if (object instanceof Throwable) {
            Throwable throwable = (Throwable)object;
            this.y = "~~ERROR~~ " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage();
        } else {
            this.y = object.toString();
        }
    }

    public String y() {
        return this.y;
    }

    public String N() {
        return this.N;
    }
}

