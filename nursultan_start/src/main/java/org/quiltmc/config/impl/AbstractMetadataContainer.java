/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.MetadataContainer
 *  org.quiltmc.config.api.metadata.MetadataType
 */
package org.quiltmc.config.impl;

import java.util.Map;
import java.util.Optional;
import org.quiltmc.config.api.metadata.MetadataContainer;
import org.quiltmc.config.api.metadata.MetadataType;

public abstract class AbstractMetadataContainer
implements MetadataContainer {
    public Map metadata;

    public Map metadata() {
        return this.metadata;
    }

    public Object metadata(MetadataType metadataType) {
        if (this.metadata.containsKey(metadataType)) {
            return this.metadata.get(metadataType);
        }
        Optional optional = metadataType.getDefaultValue((MetadataContainer)this);
        if (optional.isPresent()) {
            AbstractMetadataContainer abstractMetadataContainer = this;
            abstractMetadataContainer.metadata.put(metadataType, optional.get());
            return abstractMetadataContainer.metadata.get(metadataType);
        }
        return null;
    }

    public AbstractMetadataContainer(Map map) {
        this.metadata = map;
    }

    public boolean hasMetadata(MetadataType metadataType) {
        return this.metadata.containsKey(metadataType) || metadataType.getDefaultValue((MetadataContainer)this).isPresent();
    }
}

