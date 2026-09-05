/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import java.lang.reflect.Field;
import java.util.Arrays;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.ConfigData$ValidationException;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;
import me.shedaniel.autoconfig.util.Utils;

public abstract class PartitioningSerializer$GlobalData
implements ConfigData {
    public PartitioningSerializer$GlobalData() {
        Arrays.stream(this.getClass().getDeclaredFields()).filter(field -> !PartitioningSerializer.isValidModule(field)).forEach(field -> {
            throw new RuntimeException(String.format("Invalid module: %s", field));
        });
    }

    @Override
    public final void validatePostLoad() throws ConfigData$ValidationException {
        for (Field field : PartitioningSerializer.getModuleFields(this.getClass())) {
            ((ConfigData)Utils.getUnsafely(field, this)).validatePostLoad();
        }
    }
}

