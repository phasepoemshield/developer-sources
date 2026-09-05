/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.minecraft.chunks;

import java.util.function.IntUnaryOperator;

public interface DataPalette {
    default public void setIdAt(int sectionX, int sectionY, int sectionZ, int id) {
        this.setIdAt(this.index(sectionX, sectionY, sectionZ), id);
    }

    public void setIdAt(int var1, int var2);

    public int idByIndex(int var1);

    public int idAt(int var1);

    default public int idAt(int sectionX, int sectionY, int sectionZ) {
        return this.idAt(this.index(sectionX, sectionY, sectionZ));
    }

    default public void replaceId(int oldId, int newId) {
        for (int i = 0; i < this.size(); ++i) {
            if (this.idByIndex(i) != oldId) continue;
            this.setIdByIndex(i, newId);
        }
    }

    public int index(int var1, int var2, int var3);

    public int size();

    public void clear();

    public void addId(int var1);

    default public void replaceIds(IntUnaryOperator mapper) {
        for (int i = 0; i < this.size(); ++i) {
            int id = this.idByIndex(i);
            int newId = mapper.applyAsInt(id);
            if (newId == id) continue;
            this.setIdByIndex(i, newId);
        }
    }

    public int paletteIndexAt(int var1);

    public void setPaletteIndexAt(int var1, int var2);

    public void setIdByIndex(int var1, int var2);
}

