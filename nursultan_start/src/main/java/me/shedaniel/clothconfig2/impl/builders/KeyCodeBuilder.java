/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.Modifier
 *  me.shedaniel.clothconfig2.api.ModifierKeyCode
 *  me.shedaniel.clothconfig2.gui.entries.KeyCodeEntry
 *  minecraft.class00392
 *  minecraft.class04671
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import me.shedaniel.clothconfig2.gui.entries.KeyCodeEntry;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;
import minecraft.class04671;

public class KeyCodeBuilder
extends FieldBuilder<ModifierKeyCode, KeyCodeEntry, KeyCodeBuilder> {
    private Consumer<ModifierKeyCode> saveConsumer = null;
    private Function<ModifierKeyCode, Optional<class00392[]>> tooltipSupplier = modifierKeyCode -> Optional.empty();
    private final ModifierKeyCode value;
    private boolean allowKey = true;
    private boolean allowMouse = true;
    private boolean allowModifiers = true;

    public KeyCodeBuilder(class00392 class003922, class00392 class003923, ModifierKeyCode modifierKeyCode2) {
        super(class003922, class003923);
        this.value = ModifierKeyCode.copyOf((ModifierKeyCode)modifierKeyCode2);
    }

    @Override
    public KeyCodeEntry build() {
        KeyCodeEntry keyCodeEntry = new KeyCodeEntry(this.getFieldNameKey(), this.value, this.getResetButtonKey(), this.defaultValue, this.saveConsumer, null, this.isRequireRestart());
        keyCodeEntry.setTooltipSupplier(() -> this.tooltipSupplier.apply(keyCodeEntry.getValue()));
        if (this.errorSupplier != null) {
            keyCodeEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(keyCodeEntry.getValue()));
        }
        keyCodeEntry.setAllowKey(this.allowKey);
        keyCodeEntry.setAllowMouse(this.allowMouse);
        keyCodeEntry.setAllowModifiers(this.allowModifiers);
        return this.finishBuilding(keyCodeEntry);
    }

    public KeyCodeBuilder setDefaultValue(class04671 class046712) {
        return this.setDefaultValue(ModifierKeyCode.of((class04671)class046712, (Modifier)Modifier.none()));
    }

    public KeyCodeBuilder setDefaultValue(ModifierKeyCode modifierKeyCode) {
        this.defaultValue = () -> modifierKeyCode;
        return this;
    }

    public KeyCodeBuilder setDefaultValue(Supplier<class04671> supplier) {
        return this.setModifierDefaultValue(() -> ModifierKeyCode.of((class04671)((class04671)supplier.get()), (Modifier)Modifier.none()));
    }

    public KeyCodeBuilder setTooltip(Optional<class00392[]> optional) {
        this.tooltipSupplier = modifierKeyCode -> optional;
        return this;
    }

    public KeyCodeBuilder setTooltip(class00392 ... class00392Array) {
        this.tooltipSupplier = modifierKeyCode -> Optional.ofNullable(class00392Array);
        return this;
    }

    public KeyCodeBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = modifierKeyCode -> (Optional)supplier.get();
        return this;
    }

    public KeyCodeBuilder setKeySaveConsumer(Consumer<class04671> consumer) {
        return this.setModifierSaveConsumer(modifierKeyCode -> consumer.accept(modifierKeyCode.getKeyCode()));
    }

    public KeyCodeBuilder setErrorSupplier(Function<class04671, Optional<class00392>> function) {
        return this.setModifierErrorSupplier(modifierKeyCode -> (Optional)function.apply(modifierKeyCode.getKeyCode()));
    }

    public KeyCodeBuilder setAllowModifiers(boolean bl) {
        this.allowModifiers = bl;
        if (!bl) {
            this.value.setModifier(Modifier.none());
        }
        return this;
    }

    public KeyCodeBuilder requireRestart() {
        this.requireRestart(true);
        return this;
    }

    public KeyCodeBuilder setAllowKey(boolean bl) {
        if (!this.allowMouse && !bl) {
            throw new IllegalArgumentException();
        }
        this.allowKey = bl;
        return this;
    }

    public KeyCodeBuilder setAllowMouse(boolean bl) {
        if (!this.allowKey && !bl) {
            throw new IllegalArgumentException();
        }
        this.allowMouse = bl;
        return this;
    }

    public KeyCodeBuilder setKeyTooltipSupplier(Function<class04671, Optional<class00392[]>> function) {
        return this.setModifierTooltipSupplier(modifierKeyCode -> (Optional)function.apply(modifierKeyCode.getKeyCode()));
    }

    public KeyCodeBuilder setModifierTooltipSupplier(Function<ModifierKeyCode, Optional<class00392[]>> function) {
        this.tooltipSupplier = function;
        return this;
    }

    public KeyCodeBuilder setModifierErrorSupplier(Function<ModifierKeyCode, Optional<class00392>> function) {
        this.errorSupplier = function;
        return this;
    }

    public KeyCodeBuilder setModifierSaveConsumer(Consumer<ModifierKeyCode> consumer) {
        this.saveConsumer = consumer;
        return this;
    }

    public KeyCodeBuilder setModifierDefaultValue(Supplier<ModifierKeyCode> supplier) {
        this.defaultValue = supplier;
        return this;
    }
}

