/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api;

import dev.isxander.yacl3.api.Option;
import java.util.Collection;
import java.util.function.Supplier;

public interface OptionAddable {
    public OptionAddable options(Collection<? extends Option<?>> var1);

    public OptionAddable option(Option<?> var1);

    default public OptionAddable option(Supplier<Option<?>> supplier) {
        return this.option(supplier.get());
    }

    default public OptionAddable optionsIf(boolean bl, Collection<? extends Option<?>> collection) {
        return bl ? this.options(collection) : this;
    }

    default public OptionAddable optionIf(boolean bl, Option<?> option) {
        return bl ? this.option(option) : this;
    }

    default public OptionAddable optionIf(boolean bl, Supplier<Option<?>> supplier) {
        return bl ? this.option(supplier) : this;
    }
}

