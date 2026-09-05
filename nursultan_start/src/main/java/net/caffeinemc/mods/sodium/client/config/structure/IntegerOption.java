/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 *  net.caffeinemc.mods.sodium.api.config.option.SteppedValidator
 *  net.caffeinemc.mods.sodium.client.gui.options.control.Control
 *  net.caffeinemc.mods.sodium.client.gui.options.control.SliderControl
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
import net.caffeinemc.mods.sodium.api.config.option.ControlValueFormatter;
import net.caffeinemc.mods.sodium.api.config.option.OptionBinding;
import net.caffeinemc.mods.sodium.api.config.option.OptionImpact;
import net.caffeinemc.mods.sodium.api.config.option.SteppedValidator;
import net.caffeinemc.mods.sodium.client.config.structure.StatefulOption;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.gui.options.control.Control;
import net.caffeinemc.mods.sodium.client.gui.options.control.SliderControl;

public class IntegerOption
extends StatefulOption<Integer> {
    private final DependentValue<? extends SteppedValidator> validator;
    private final ControlValueFormatter valueFormatter;

    public IntegerOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, StorageEventHandler storageEventHandler, Function<Integer, class00392> function, OptionImpact optionImpact, Set<class01894> set, DependentValue<Integer> dependentValue2, Boolean bl, OptionBinding<Integer> optionBinding, Consumer<ConfigState> consumer, DependentValue<? extends SteppedValidator> dependentValue3, ControlValueFormatter controlValueFormatter) {
        super(class018942, collection, class003922, dependentValue, storageEventHandler, function, optionImpact, set, dependentValue2, bl, optionBinding, consumer);
        this.validator = dependentValue3;
        this.valueFormatter = controlValueFormatter;
    }

    @Override
    Integer validateValue(Integer n) {
        if (this.validator != null) {
            return this.validator.get(this.state).getValidatedValue(n, () -> (Integer)this.defaultValue.get(this.state));
        }
        return n;
    }

    @Override
    void visitDependentValues(Consumer<DependentValue<?>> consumer) {
        super.visitDependentValues(consumer);
        consumer.accept(this.validator);
    }

    public DependentValue<? extends SteppedValidator> getValidatorProvider() {
        return this.validator;
    }

    public SteppedValidator getSteppedValidator() {
        return this.validator.get(this.state);
    }

    @Override
    Control createControl() {
        return new SliderControl(this);
    }

    public class00392 formatValue(int n) {
        return this.valueFormatter.format(n);
    }

    public ControlValueFormatter getValueFormatter() {
        return this.valueFormatter;
    }
}

