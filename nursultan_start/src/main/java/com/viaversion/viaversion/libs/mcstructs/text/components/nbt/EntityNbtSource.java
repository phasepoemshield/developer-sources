/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.core.utils.ToString
 */
package com.viaversion.viaversion.libs.mcstructs.text.components.nbt;

import com.viaversion.viaversion.libs.mcstructs.core.utils.ToString;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;

public class EntityNbtSource
implements NbtDataSource {
    private String selector;

    public String getSelector() {
        return this.selector;
    }

    public EntityNbtSource(String selector) {
        this.selector = selector;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof EntityNbtSource)) {
            return false;
        }
        EntityNbtSource other = (EntityNbtSource)o;
        if (!other.canEqual(this)) {
            return false;
        }
        String this$selector = this.getSelector();
        String other$selector = other.getSelector();
        return !(this$selector == null ? other$selector != null : !this$selector.equals(other$selector));
    }

    public String toString() {
        return ToString.of((Object)this).add("selector", (Object)this.selector).toString();
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        String $selector = this.getSelector();
        result = result * 59 + ($selector == null ? 43 : $selector.hashCode());
        return result;
    }

    @Override
    public EntityNbtSource copy() {
        return new EntityNbtSource(this.selector);
    }

    public EntityNbtSource setSelector(String selector) {
        this.selector = selector;
        return this;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EntityNbtSource;
    }
}

