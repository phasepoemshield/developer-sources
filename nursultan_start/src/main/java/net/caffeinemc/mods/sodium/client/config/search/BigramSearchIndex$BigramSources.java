/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 */
package net.caffeinemc.mods.sodium.client.config.search;

import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.List;
import net.caffeinemc.mods.sodium.client.config.search.BigramSearchIndex$SourceBigramCount;

class BigramSearchIndex$BigramSources {
    public final List<BigramSearchIndex$SourceBigramCount> counts = new ObjectArrayList();
    public float prevalenceInv;

    BigramSearchIndex$BigramSources() {
    }
}

