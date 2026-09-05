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
 *  minecraft.class04927
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
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.TextFieldListEntry$1;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03434;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06478;
import minecraft.class08844;

public abstract class TextFieldListEntry<T>
extends TooltipListEntry<T> {
    protected class04927 textFieldWidget;
    protected class05362 resetButton;
    protected Supplier<T> defaultValue;
    protected T original;
    protected List<class06478> widgets;
    boolean isSelected = false;

    @Deprecated
    protected TextFieldListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, supplier2, bl);
        this.defaultValue = supplier;
        this.original = t;
        this.textFieldWidget = new TextFieldListEntry$1(this, (class01590)class06202.Nq().i_3, 0, 0, 148, 18, (class00392)class00392.i());
        this.textFieldWidget.method_1880(999999);
        this.textFieldWidget.method_1852(String.valueOf(t));
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> this.textFieldWidget.method_1852(String.valueOf(supplier.get()))).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.widgets = Lists.newArrayList((Object[])new class06478[]{this.textFieldWidget, this.resetButton});
    }

    @Deprecated
    protected TextFieldListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier, Supplier<Optional<class00392[]>> supplier2) {
        this(class003922, t, class003923, supplier, supplier2, false);
    }

    @Deprecated
    protected TextFieldListEntry(class00392 class003922, T t, class00392 class003923, Supplier<T> supplier) {
        this(class003922, t, class003923, supplier, null);
    }

    @Deprecated
    public void setValue(String string) {
        this.textFieldWidget.method_1852(String.valueOf(string));
    }

    public Optional<T> getDefaultValue() {
        return this.defaultValue == null ? Optional.empty() : Optional.ofNullable(this.defaultValue.get());
    }

    public List<? extends class04654> method_25396() {
        return this.widgets;
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && !this.isMatchDefault(this.textFieldWidget.method_1882());
        this.resetButton.method_46419(n2);
        this.textFieldWidget.method_1888(this.isEditable());
        this.textFieldWidget.method_46419(n2 + 1);
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922, class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3);
            this.textFieldWidget.method_46421(n3 + this.resetButton.method_25368());
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922, n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.textFieldWidget.method_46421(n3 + n4 - 148);
        }
        TextFieldListEntry.setTextFieldWidth(this.textFieldWidget, 148 - this.resetButton.method_25368() - 4);
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.textFieldWidget.method_25394(class010542, n6, n7, f);
    }

    protected boolean isChanged(T t, String string) {
        return !String.valueOf(t).equals(string);
    }

    public boolean isEdited() {
        return this.isChanged(this.original, this.textFieldWidget.method_1882());
    }

    public void updateSelected(boolean bl) {
        this.isSelected = bl;
    }

    public List<? extends class03434> narratables() {
        return this.widgets;
    }

    protected static void setTextFieldWidth(class04927 class049272, int n) {
        class049272.method_25358(n);
    }

    protected boolean isMatchDefault(String string) {
        Optional<T> optional = this.getDefaultValue();
        return optional.isPresent() && string.equals(optional.get().toString());
    }

    protected String stripAddText(String string) {
        return string;
    }

    protected void textFieldPreRender(class04927 class049272) {
        class049272.method_1868(this.getConfigError().isPresent() ? -43691 : -2039584);
    }
}

