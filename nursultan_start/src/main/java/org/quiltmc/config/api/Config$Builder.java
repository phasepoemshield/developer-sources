/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import java.util.function.Consumer;
import org.quiltmc.config.api.Config$SectionBuilder;
import org.quiltmc.config.api.Config$UpdateCallback;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue;

public interface Config$Builder
extends Config$SectionBuilder {
    @Override
    public Config$Builder metadata(MetadataType var1, Consumer var2);

    public Config$Builder callback(Config.UpdateCallback var1);

    public Config$Builder format(String var1);

    @Override
    public Config$Builder field(TrackedValue var1);

    @Override
    public Config$Builder section(String var1, Consumer var2);
}

