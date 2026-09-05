/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public class class04638 {
    private final String N;
    private final @Nullable String y;
    private final @Nullable String L;

    public String L() {
        if (!this.y()) {
            throw new IllegalStateException("Not a link: " + String.valueOf(this));
        }
        return this.L;
    }

    private class04638(String string, @Nullable String string2, @Nullable String string3) {
        this.N = string;
        this.y = string2;
        this.L = string3;
    }

    private class04638(String string) {
        this.N = string;
        this.y = null;
        this.L = null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04638 class046382 = (class04638)object;
        return Objects.equals(this.N, class046382.N) && Objects.equals(this.y, class046382.y) && Objects.equals(this.L, class046382.L);
    }

    public String toString() {
        return "Segment{fullText='" + this.N + "', linkTitle='" + this.y + "', linkUrl='" + this.L + "'}";
    }

    public int hashCode() {
        return Objects.hash(this.N, this.y, this.L);
    }

    public boolean y() {
        return this.y != null;
    }

    public static class04638 N(String string, String string2) {
        return new class04638(null, string, string2);
    }

    protected static class04638 N(String string) {
        return new class04638(string);
    }

    public String N() {
        return this.y() ? this.y : this.N;
    }
}

