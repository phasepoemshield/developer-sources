/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api.metadata;

import java.lang.reflect.Type;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import org.quiltmc.config.api.metadata.MetadataContainer;
import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.api.values.ConfigSerializableObject;
import org.quiltmc.config.api.values.TrackedValue;

public final class MetadataType {
    private final Supplier defaultValueSupplier;
    private final Function trackedValueDefaultValueSupplier;
    private final Supplier builderSupplier;
    private final boolean inherited;

    public static MetadataType create(Supplier supplier, boolean bl) {
        return MetadataType.create(Optional::empty, supplier, bl);
    }

    public static MetadataType create(Supplier supplier, Function function, Supplier supplier2, boolean bl) {
        return new MetadataType(supplier, function, supplier2, bl);
    }

    public static MetadataType create(Supplier supplier) {
        return MetadataType.create(supplier, false);
    }

    public static MetadataType create(Supplier supplier, Supplier supplier2, boolean bl) {
        return new MetadataType(supplier, arg_0 -> MetadataType.lambda$create$0((Supplier)supplier, arg_0), supplier2, bl);
    }

    public static MetadataType create(Supplier supplier, Function function, Supplier supplier2) {
        return new MetadataType(supplier, function, supplier2, false);
    }

    public static MetadataType create(Supplier supplier, Supplier supplier2) {
        return MetadataType.create(supplier, supplier2, false);
    }

    public MetadataType$Builder newBuilder() {
        return (MetadataType$Builder)this.builderSupplier.get();
    }

    private MetadataType(Supplier supplier, Function function, Supplier supplier2, boolean bl) {
        this.defaultValueSupplier = supplier;
        this.trackedValueDefaultValueSupplier = function;
        this.builderSupplier = supplier2;
        this.inherited = bl;
    }

    public boolean isInherited() {
        return this.inherited;
    }

    public Optional getDefaultValue(MetadataContainer object) {
        if (object instanceof TrackedValue) {
            if ((object = ((TrackedValue)object).getDefaultValue()) instanceof ConfigSerializableObject) {
                object = ((ConfigSerializableObject)object).getRepresentation();
            }
            return (Optional)this.trackedValueDefaultValueSupplier.apply(object.getClass());
        }
        return (Optional)this.defaultValueSupplier.get();
    }

    private static /* synthetic */ Optional lambda$create$0(Supplier supplier, Type type) {
        return (Optional)supplier.get();
    }
}

