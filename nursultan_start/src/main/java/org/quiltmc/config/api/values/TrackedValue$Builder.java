/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.values;

import java.util.function.Consumer;
import org.quiltmc.config.api.Constraint;
import org.quiltmc.config.api.metadata.MetadataContainerBuilder;
import org.quiltmc.config.api.metadata.MetadataType;
import org.quiltmc.config.api.values.TrackedValue$UpdateCallback;

public interface TrackedValue$Builder
extends MetadataContainerBuilder {
    public TrackedValue$Builder constraint(Constraint var1);

    @Override
    public TrackedValue$Builder metadata(MetadataType var1, Consumer var2);

    public TrackedValue$Builder callback(TrackedValue.UpdateCallback var1);

    public TrackedValue$Builder key(String var1);

    public Object getDefaultValue();
}

