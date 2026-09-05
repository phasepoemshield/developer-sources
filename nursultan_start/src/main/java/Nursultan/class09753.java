/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09782
 *  Nursultan.class09962
 */
package Nursultan;

import Nursultan.class09666;
import Nursultan.class09782;
import Nursultan.class09962;
import java.util.Objects;

public final class class09753 {
    private final class09782 N;
    private final Object y;

    public int L() {
        this.N(class09782.COLOR);
        return (Integer)this.y;
    }

    private class09753(class09782 class097822, Object object) {
        this.N = Objects.requireNonNull(class097822, "kind");
        this.y = Objects.requireNonNull(object, "value");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class09753)) {
            return false;
        }
        class09753 class097532 = (class09753)object;
        return this.N == class097532.N && this.y.equals(class097532.y);
    }

    public String toString() {
        return "TransitionValue[kind=" + String.valueOf(this.N) + ", value=" + String.valueOf(this.y) + "]";
    }

    public int hashCode() {
        return Objects.hash(this.N, this.y);
    }

    public class09666 i() {
        this.N(class09782.TRANSLATE_LENGTH);
        return (class09666)((Object)this.y);
    }

    public class09962 u() {
        this.N(class09782.AXIS_SIZE);
        return (class09962)this.y;
    }

    public float y() {
        this.N(class09782.FLOAT);
        return ((Float)this.y).floatValue();
    }

    public static class09753 N(class09666 class096662) {
        return new class09753(class09782.TRANSLATE_LENGTH, (Object)Objects.requireNonNull(class096662, "value"));
    }

    public static class09753 N(class09962 class099622) {
        return new class09753(class09782.AXIS_SIZE, Objects.requireNonNull(class099622, "value"));
    }

    public static class09753 N(int n) {
        return new class09753(class09782.COLOR, n);
    }

    private void N(class09782 class097822) {
        if (this.N != class097822) {
            throw new IllegalStateException("Expected " + String.valueOf(class097822) + " transition value, got " + String.valueOf(this.N));
        }
    }

    public class09782 N() {
        return this.N;
    }

    public static class09753 N(float f) {
        return new class09753(class09782.FLOAT, Float.valueOf(f));
    }
}

