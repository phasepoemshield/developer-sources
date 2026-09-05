/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.function.Consumer;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;

public interface Config$SectionBuilder
extends MetadataContainerBuilder {
    @Override
    public Config$SectionBuilder metadata(MetadataType var1, Consumer var2);

    public Config$SectionBuilder field(TrackedValue var1);

    public Config$SectionBuilder section(String var1, Consumer var2);
}

