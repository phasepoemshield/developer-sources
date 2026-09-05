/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03434
 *  minecraft.class04654
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06478
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08844;

public class BooleanListEntry
extends TooltipListEntry<Boolean> {
    private final AtomicBoolean bool;
    private final boolean original;
    private final class05362 buttonWidget;
    private final class05362 resetButton;
    private final Supplier<Boolean> defaultValue;
    private final List<class06478> widgets;

    @Deprecated
    public BooleanListEntry(class00392 class003922, boolean bl, class00392 class003923, Supplier<Boolean> supplier, Consumer<Boolean> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl2) {
        super(class003922, supplier2, bl2);
        this.defaultValue = supplier;
        this.original = bl;
        this.bool = new AtomicBoolean(bl);
        this.buttonWidget = class05362.method_46430((class00392)class00392.i(), class053622 -> this.bool.set(!this.bool.get())).N(0, 0, 150, 20).N();
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> this.bool.set((Boolean)supplier.get())).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.saveCallback = consumer;
        this.widgets = Lists.newArrayList((Object[])new class06478[]{this.buttonWidget, this.resetButton});
    }

    @Deprecated
    public BooleanListEntry(class00392 class003922, boolean bl, class00392 class003923, Supplier<Boolean> supplier, Consumer<Boolean> consumer, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, bl, class003923, supplier, consumer, supplier2, false);
    }

    @Deprecated
    public BooleanListEntry(class00392 class003922, boolean bl, class00392 class003923, Supplier<Boolean> supplier, Consumer<Boolean> consumer) {
        this(class003922, bl, class003923, supplier, consumer, null);
    }

    public Boolean getValue() {
        return this.bool.get();
    }

    public Optional<Boolean> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue.get());
    }

    public List<? extends class04654> method_25396() {
        return this.widgets;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && this.defaultValue.get().booleanValue() != this.bool.get();
        this.resetButton.method_46419(n2);
        this.buttonWidget.field_22763 = this.isEditable();
        this.buttonWidget.method_46419(n2);
        this.buttonWidget.method_25355(this.getYesNoText(this.bool.get()));
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922, class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, -1);
            this.resetButton.method_46421(n3);
            this.buttonWidget.method_46421(n3 + this.resetButton.method_25368() + 2);
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922, n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.buttonWidget.method_46421(n3 + n4 - 150);
        }
        this.buttonWidget.method_25358(150 - this.resetButton.method_25368() - 2);
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.buttonWidget.method_25394(class010542, n6, n7, f);
    }

    public boolean isEdited() {
        return super.isEdited() || this.original != this.bool.get();
    }

    public List<? extends class03434> narratables() {
        return this.widgets;
    }

    public class00392 getYesNoText(boolean bl) {
        return class00392.L((String)("text.cloth-config.boolean.value." + bl));
    }
}

