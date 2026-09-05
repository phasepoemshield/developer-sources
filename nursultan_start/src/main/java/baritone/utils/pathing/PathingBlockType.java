/*
 * Decompiled with CFR 0.152.
 */
package baritone.utils.pathing;

public enum PathingBlockType {
    AIR(0),
    WATER(1),
    AVOID(2),
    SOLID(3);

    private final boolean[] bits;

    private PathingBlockType(int n2) {
        this.bits = new boolean[]{(n2 & 2) != 0, (n2 & 1) != 0};
    }

    public static PathingBlockType fromBits(boolean bl, boolean bl2) {
        return bl ? (bl2 ? SOLID : AVOID) : (bl2 ? WATER : AIR);
    }

    public final boolean[] getBits() {
        return this.bits;
    }
}

