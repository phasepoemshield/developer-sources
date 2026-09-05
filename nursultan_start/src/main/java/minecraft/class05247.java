/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public interface class05247 {
    default public float y() {
        return 1.0f;
    }

    public static class05247 N(float f) {
        return () -> f;
    }

    default public float N(boolean bl) {
        return this.getAdvance() + (bl ? this.N() : 0.0f);
    }

    default public float N() {
        return 1.0f;
    }

    public float getAdvance();
}

