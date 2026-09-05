/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import minecraft.class04638;

public class class04613 {
    public final List<class04638> N;

    class04613(class04638 ... class04638Array) {
        this(Arrays.asList(class04638Array));
    }

    class04613(List<class04638> list) {
        this.N = list;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class04613 class046132 = (class04613)object;
        return Objects.equals(this.N, class046132.N);
    }

    public String toString() {
        return "Line{segments=" + String.valueOf(this.N) + "}";
    }

    public int hashCode() {
        return Objects.hash(this.N);
    }
}

