/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.serializer;

import java.lang.annotation.Annotation;
import me.shedaniel.autoconfig.annotation.Config;

class PartitioningSerializer$1
implements Config {
    final /* synthetic */ String val$name;

    PartitioningSerializer$1(String string) {
        this.val$name = string;
    }

    @Override
    public String name() {
        return this.val$name;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof Config && ((Config)object).name().equals(this.name());
    }

    @Override
    public int hashCode() {
        return "name".hashCode() * 127 ^ this.name().hashCode();
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return Config.class;
    }
}

