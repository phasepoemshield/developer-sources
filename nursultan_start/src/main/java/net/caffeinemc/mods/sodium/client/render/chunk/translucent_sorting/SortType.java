/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting;

public enum SortType {
    EMPTY_SECTION(false, true),
    NO_TRANSLUCENT(false, true),
    NONE(false, true),
    STATIC_NORMAL_RELATIVE(false, false),
    STATIC_TOPO(true, false),
    DYNAMIC(true, false);

    public final boolean needsDirectionMixing;
    public final boolean allowSliceReordering;

    private SortType(boolean bl, boolean bl2) {
        this.needsDirectionMixing = bl;
        this.allowSliceReordering = bl2;
        if (bl && bl2) {
            throw new IllegalArgumentException("Invalid sort type");
        }
    }
}

