/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.util.Map;
import org.quiltmc.config.api.metadata.MetadataType;

public interface MetadataContainer {
    public Object metadata(MetadataType var1);

    public Map metadata();

    public boolean hasMetadata(MetadataType var1);
}

