/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.gui.options.control.CyclingControl
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import java.util.Collection;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00392;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.api.config.ConfigState;
import net.caffeinemc.mods.sodium.api.config.StorageEventHandler;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.CyclingControl;

public class EnumOption<E extends Enum<E>>
extends StatefulOption<E> {
    public final Class<E> enumClass;
    private final DependentValue<Set<E>> allowedValues;
    private final Function<E, class00392> elementNameProvider;

    public class00392 getElementName(E e) {
        return this.elementNameProvider.apply(e);
    }

    public EnumOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, StorageEventHandler storageEventHandler, Function<E, class00392> function, OptionImpact optionImpact, Set<class01894> set, DependentValue<E> dependentValue2, Boolean bl, OptionBinding<E> optionBinding, Consumer<ConfigState> consumer, Class<E> clazz, DependentValue<Set<E>> dependentValue3, Function<E, class00392> function2) {
        super(class018942, collection, class003922, dependentValue, storageEventHandler, function, optionImpact, set, dependentValue2, bl, optionBinding, consumer);
        this.enumClass = clazz;
        this.allowedValues = dependentValue3;
        this.elementNameProvider = function2;
    }

    @Override
    E validateValue(E e) {
        return (E)(this.isValueAllowed(e) ? e : (Enum)this.defaultValue.get(this.state));
    }

    @Override
    void visitDependentValues(Consumer<DependentValue<?>> consumer) {
        super.visitDependentValues(consumer);
        consumer.accept(this.allowedValues);
    }

    public Function<E, class00392> getElementNameProvider() {
        return this.elementNameProvider;
    }

    @Override
    Control createControl() {
        return new CyclingControl(this, this.enumClass);
    }

    public DependentValue<Set<E>> getAllowedValues() {
        return this.allowedValues;
    }

    public boolean isValueAllowed(E e) {
        return this.allowedValues.get(this.state).contains(e);
    }

    public Class<E> getEnumClass() {
        return this.enumClass;
    }
}

