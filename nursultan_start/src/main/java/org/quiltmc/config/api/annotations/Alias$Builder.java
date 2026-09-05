/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.AliasesImpl
 */
package org.quiltmc.config.api.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.quiltmc.config.api.metadata.Aliases;
import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.impl.AliasesImpl;

public final class Alias$Builder
implements MetadataType$Builder {
    private final List aliases;

    Alias$Builder() {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList;
        arrayList = new ArrayList(0);
        v1.aliases = arrayList2;
    }

    public void add(String ... stringArray) {
        this.aliases.addAll(Arrays.asList(stringArray));
    }

    @Override
    public Aliases build() {
        return new AliasesImpl(this.aliases);
    }
}

