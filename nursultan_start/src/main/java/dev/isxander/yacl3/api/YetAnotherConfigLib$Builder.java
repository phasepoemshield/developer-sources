/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.gui.YACLScreen
 *  minecraft.class00392
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import dev.isxander.yacl3.gui.YACLScreen;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class00392;

public interface YetAnotherConfigLib$Builder {
    public YetAnotherConfigLib$Builder categories(Collection<? extends ConfigCategory> var1);

    default public YetAnotherConfigLib$Builder categories(Supplier<Collection<? extends ConfigCategory>> supplier) {
        return this.categories(supplier.get());
    }

    public YetAnotherConfigLib$Builder save(Runnable var1);

    public YetAnotherConfigLib build();

    default public YetAnotherConfigLib$Builder category(Supplier<ConfigCategory> supplier) {
        return this.category(supplier.get());
    }

    public YetAnotherConfigLib$Builder category(ConfigCategory var1);

    public YetAnotherConfigLib$Builder title(class00392 var1);

    public YetAnotherConfigLib$Builder screenInit(Consumer<YACLScreen> var1);

    default public YetAnotherConfigLib$Builder categoryIf(boolean bl, Supplier<ConfigCategory> supplier) {
        return bl ? this.category(supplier) : this;
    }

    default public YetAnotherConfigLib$Builder categoryIf(boolean bl, ConfigCategory configCategory) {
        return bl ? this.category(configCategory) : this;
    }

    default public YetAnotherConfigLib$Builder categoriesIf(boolean bl, Collection<? extends ConfigCategory> collection) {
        return bl ? this.categories(collection) : this;
    }

    default public YetAnotherConfigLib$Builder categoriesIf(boolean bl, Supplier<Collection<? extends ConfigCategory>> supplier) {
        return bl ? this.categories(supplier) : this;
    }
}

