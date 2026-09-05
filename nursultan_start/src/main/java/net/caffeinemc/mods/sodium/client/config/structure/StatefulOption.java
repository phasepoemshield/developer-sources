/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectOpenHashSet
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.api.config.ConfigState
 *  net.caffeinemc.mods.sodium.api.config.StorageEventHandler
 *  net.caffeinemc.mods.sodium.api.config.option.OptionBinding
 *  net.caffeinemc.mods.sodium.api.config.option.OptionImpact
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
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
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.value.DependentValue;
import net.caffeinemc.mods.sodium.client.config.value.DynamicValue;

public abstract class StatefulOption<V>
extends Option {
    final StorageEventHandler storage;
    final Function<V, class00392> tooltipProvider;
    final OptionImpact impact;
    final Set<class01894> flags;
    final DependentValue<V> defaultValue;
    final Boolean controlHiddenWhenDisabled;
    final OptionBinding<V> binding;
    final Consumer<ConfigState> applyHook;
    final class01894 applyHookId;
    private final Collection<DynamicValue<?>> dependents = new ObjectOpenHashSet(0);
    private final Collection<DynamicValue<?>> applyDependents = new ObjectOpenHashSet(0);
    private V value;
    private V modifiedValue;

    @Override
    public Set<class01894> getFlags() {
        return this.flags;
    }

    StatefulOption(class01894 class018942, Collection<class01894> collection, class00392 class003922, DependentValue<Boolean> dependentValue, StorageEventHandler storageEventHandler, Function<V, class00392> function, OptionImpact optionImpact, Set<class01894> set, DependentValue<V> dependentValue2, Boolean bl, OptionBinding<V> optionBinding, Consumer<ConfigState> consumer) {
        super(class018942, collection, class003922, dependentValue);
        this.storage = storageEventHandler;
        this.tooltipProvider = function;
        this.impact = optionImpact;
        this.flags = set;
        this.defaultValue = dependentValue2;
        this.controlHiddenWhenDisabled = bl;
        this.binding = optionBinding;
        this.applyHook = consumer;
        this.applyHookId = consumer != null ? class01894.N((String)"__meta__", (String)("apply_hook_" + class018942.y() + "_" + class018942.N())) : null;
    }

    public DependentValue<V> getDefaultValue() {
        return this.defaultValue;
    }

    abstract V validateValue(V var1);

    public OptionBinding<V> getBinding() {
        return this.binding;
    }

    public Consumer<ConfigState> getApplyHook() {
        return this.applyHook;
    }

    public Function<V, class00392> getTooltipProvider() {
        return this.tooltipProvider;
    }

    @Override
    public OptionImpact getImpact() {
        return this.impact;
    }

    @Override
    public class00392 getTooltip() {
        return this.tooltipProvider.apply(this.getValidatedValue());
    }

    public StorageEventHandler getStorage() {
        return this.storage;
    }

    void registerApplyDependent(DynamicValue<?> dynamicValue) {
        this.applyDependents.add(dynamicValue);
    }

    @Override
    void visitDependentValues(Consumer<DependentValue<?>> consumer) {
        super.visitDependentValues(consumer);
        consumer.accept(this.defaultValue);
    }

    @Override
    public boolean hasChanged() {
        return this.modifiedValue != this.value;
    }

    public Boolean getControlHiddenWhenDisabled() {
        return this.controlHiddenWhenDisabled;
    }

    @Override
    boolean applyChanges() {
        if (this.hasChanged()) {
            this.value = this.modifiedValue;
            this.binding.save(this.value);
            this.state.notifyStorageWrite(this.storage);
            this.state.invalidateDependents(this.applyDependents);
            return true;
        }
        return false;
    }

    public boolean showControl() {
        if (this.isEnabled()) {
            return true;
        }
        if (this.controlHiddenWhenDisabled == null) {
            return false;
        }
        return this.controlHiddenWhenDisabled == false;
    }

    @Override
    void resetFromBinding() {
        V v = this.modifiedValue;
        this.value = this.binding.load();
        V v2 = this.validateValue(this.value);
        if (v2 != this.value) {
            this.value = v2;
            this.binding.save(this.value);
            this.state.notifyStorageWrite(this.storage);
        }
        this.modifiedValue = this.value;
        if (this.value != v) {
            this.state.invalidateDependents(this.dependents);
            this.state.invalidateDependents(this.applyDependents);
        }
    }

    public class01894 getApplyHookId() {
        return this.applyHookId;
    }

    public V getValidatedValue() {
        V v = this.validateValue(this.modifiedValue);
        if (v != this.modifiedValue) {
            this.modifiedValue = v;
            this.state.invalidateDependents(this.dependents);
        }
        return this.modifiedValue;
    }

    @Override
    void loadValueInitial() {
        this.value = this.binding.load();
        this.modifiedValue = this.value;
    }

    public V getAppliedValue() {
        return this.value;
    }

    void registerDependent(DynamicValue<?> dynamicValue) {
        this.dependents.add(dynamicValue);
    }

    public void modifyValue(V v) {
        if (this.modifiedValue != v) {
            this.modifiedValue = v;
            this.state.invalidateDependents(this.dependents);
        }
    }

    @Override
    public void resetToDefault() {
        this.modifyValue(this.defaultValue.get(this.state));
    }
}

