/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

public interface SortItemsProvider {
    public int[] getCachedSortItems();

    public void setCachedSortItems(int[] var1);

    default public int[] ensureSortItemsOfLength(int n) {
        int[] nArray = this.getCachedSortItems();
        if (nArray == null || nArray.length < n) {
            nArray = new int[n];
            this.setCachedSortItems(nArray);
        }
        return nArray;
    }
}

