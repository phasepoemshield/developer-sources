/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.api.loot.v3;

public enum LootTableSource {
    VANILLA(true),
    MOD(true),
    DATA_PACK(false),
    REPLACED(false);

    private final boolean builtin;

    private LootTableSource(boolean bl) {
        this.builtin = bl;
    }

    public boolean isBuiltin() {
        return this.builtin;
    }
}

