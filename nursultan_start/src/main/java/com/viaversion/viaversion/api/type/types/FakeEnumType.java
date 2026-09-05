/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  com.viaversion.viaversion.api.type.types.VarIntType
 */
package com.viaversion.viaversion.api.type.types;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.VarIntType;
import java.util.List;

public final class FakeEnumType
extends VarIntType {
    private final Entry[] entries;

    public FakeEnumType(List<String> initialNames, Entry ... remainingEntries) {
        this.entries = new Entry[initialNames.size() + remainingEntries.length];
        for (int i = 0; i < initialNames.size(); ++i) {
            this.entries[i] = Entry.of(i, initialNames.get(i));
        }
        System.arraycopy(remainingEntries, 0, this.entries, initialNames.size(), remainingEntries.length);
    }

    public FakeEnumType(Entry ... entries) {
        this.entries = entries;
    }

    public void write(Ops ops, Integer value) {
        Entry entry = null;
        for (Entry e : this.entries) {
            if (e.id != value) continue;
            entry = e;
            break;
        }
        Types.STRING.write(ops, entry != null ? entry.name : this.entries[0].name);
    }

    public Entry[] entries() {
        return this.entries;
    }

    public record Entry(int id, String name) {
        public static Entry of(int id, String name) {
            return new Entry(id, name);
        }
    }
}

