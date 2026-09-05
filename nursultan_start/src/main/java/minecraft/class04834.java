/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public class class04834 {
    public static final class04834 N = new class04834(0.0f);
    final float y;
    final float L;
    final float u;

    public class04834(float f, float f2, float f3) {
        this.y = f;
        this.L = f2;
        this.u = f3;
    }

    public class04834(float f) {
        this(f, f, f);
    }

    public class04834 N(float f, float f2, float f3) {
        return new class04834(this.y + f, this.L + f2, this.u + f3);
    }

    public class04834 N(float f) {
        return new class04834(this.y + f, this.L + f, this.u + f);
    }
}

