/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.api.data;

import com.viaversion.viaversion.api.data.Mappings;

public record IdentityMappings(int size, int mappedSize) implements Mappings
{
    @Override
    public boolean isIdentity() {
        return true;
    }

    @Override
    public Mappings inverse() {
        return new IdentityMappings(this.mappedSize, this.size);
    }

    @Override
    public void setNewId(int id, int mappedId) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getNewId(int id) {
        return id >= 0 && id < this.size ? id : -1;
    }
}

