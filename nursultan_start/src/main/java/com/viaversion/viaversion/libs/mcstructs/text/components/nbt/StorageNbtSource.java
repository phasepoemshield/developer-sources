/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.components.nbt;

import com.viaversion.viaversion.libs.mcstructs.core.Identifier;
import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;

public class StorageNbtSource
implements NbtDataSource {
    private Identifier id;

    public StorageNbtSource setId(Identifier id) {
        this.id = id;
        return this;
    }

    public StorageNbtSource(Identifier id) {
        this.id = id;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof StorageNbtSource)) {
            return false;
        }
        StorageNbtSource other = (StorageNbtSource)o;
        if (!other.canEqual(this)) {
            return false;
        }
        Identifier this$id = this.getId();
        Identifier other$id = other.getId();
        return !(this$id == null ? other$id != null : !((Object)this$id).equals(other$id));
    }

    public String toString() {
        return ToString.of((Object)this).add("id", (Object)this.id).toString();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Identifier $id = this.getId();
        result = result * 59 + ($id == null ? 43 : ((Object)$id).hashCode());
        return result;
    }

    public Identifier getId() {
        return this.id;
    }

    @Override
    public StorageNbtSource copy() {
        return new StorageNbtSource(this.id);
    }

    protected boolean canEqual(Object other) {
        return other instanceof StorageNbtSource;
    }
}

