/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataContainer
 */
package org.quiltmc.config.api.values;

import java.util.Map;
import org.quiltmc.config.api.metadata.MetadataContainer;
import org.quiltmc.config.api.values.ValueKey;

public interface ValueTreeNode
extends MetadataContainer {
    public ValueKey key();

    public void propagateInheritedMetadata(Map var1);
}

