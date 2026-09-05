/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.components.nbt;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;

public class BlockNbtSource
implements NbtDataSource {
    private String pos;

    public BlockNbtSource(String pos) {
        this.pos = pos;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof BlockNbtSource)) {
            return false;
        }
        BlockNbtSource other = (BlockNbtSource)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$pos = this.getPos();
        String other$pos = other.getPos();
        return !(this$pos == null ? other$pos != null : !this$pos.equals(other$pos));
    }

    public String toString() {
        return ToString.of((Object)this).add("pos", (Object)this.pos).toString();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $pos = this.getPos();
        result = result * 59 + ($pos == null ? 43 : $pos.hashCode());
        return result;
    }

    @Override
    public BlockNbtSource copy() {
        return new BlockNbtSource(this.pos);
    }

    public BlockNbtSource setPos(String pos) {
        this.pos = pos;
        return this;
    }

    public String getPos() {
        return this.pos;
    }

    protected boolean canEqual(Object other) {
        return other instanceof BlockNbtSource;
    }
}

