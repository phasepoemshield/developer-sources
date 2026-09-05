/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.registry;

public final class FlammableBlockRegistry$Entry {
    private final int burn;
    private final int spread;

    public FlammableBlockRegistry$Entry(int n, int n2) {
        this.burn = n;
        this.spread = n2;
    }

    public boolean equals(Object object) {
        if (!(object instanceof FlammableBlockRegistry$Entry)) {
            return false;
        }
        FlammableBlockRegistry$Entry flammableBlockRegistry$Entry = (FlammableBlockRegistry$Entry)object;
        return flammableBlockRegistry$Entry.burn == this.burn && flammableBlockRegistry$Entry.spread == this.spread;
    }

    public int hashCode() {
        return this.burn * 11 + this.spread;
    }

    public int getSpreadChance() {
        return this.spread;
    }

    public int getBurnChance() {
        return this.burn;
    }
}

