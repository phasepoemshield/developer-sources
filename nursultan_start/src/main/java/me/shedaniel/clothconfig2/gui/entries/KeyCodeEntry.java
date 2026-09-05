/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.ModifierKeyCode
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
 *  minecraft.class06541
 *  minecraft.class08844
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
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
import minecraft.class06541;
import minecraft.class08844;

public class KeyCodeEntry
extends TooltipListEntry<ModifierKeyCode> {
    private ModifierKeyCode value;
    private final ModifierKeyCode original;
    private final class05362 buttonWidget;
    private final class05362 resetButton;
    private final Supplier<ModifierKeyCode> defaultValue;
    private final List<class06478> widgets;
    private boolean allowMouse = true;
    private boolean allowKey = true;
    private boolean allowModifiers = true;

    @Deprecated
    public KeyCodeEntry(class00392 class003922, ModifierKeyCode modifierKeyCode, class00392 class003923, Supplier<ModifierKeyCode> supplier, Consumer<ModifierKeyCode> consumer, Supplier<Optional<class00392[]>> supplier2, boolean bl) {
        super(class003922, supplier2, bl);
        this.defaultValue = supplier;
        this.value = modifierKeyCode.copy();
        this.original = modifierKeyCode.copy();
        this.buttonWidget = class05362.method_46430((class00392)class00392.i(), class053622 -> this.getConfigScreen().setFocusedBinding(this)).N(0, 0, 150, 20).N();
        this.resetButton = class05362.method_46430((class00392)class003923, class053622 -> {
            this.value = ((ModifierKeyCode)this.getDefaultValue().orElse(null)).copy();
            this.getConfigScreen().setFocusedBinding(null);
        }).N(0, 0, ((class01590)class06202.Nq().i_3).N((class05936)class003923) + 6, 20).N();
        this.saveCallback = consumer;
        this.widgets = Lists.newArrayList((Object[])new class06478[]{this.buttonWidget, this.resetButton});
    }

    public ModifierKeyCode getValue() {
        return this.value;
    }

    public void setValue(ModifierKeyCode modifierKeyCode) {
        this.value = modifierKeyCode;
    }

    public Optional<ModifierKeyCode> getDefaultValue() {
        return Optional.ofNullable(this.defaultValue).map(Supplier::get).map(ModifierKeyCode::copy);
    }

    public List<? extends class04654> method_25396() {
        return this.widgets;
    }

    private class00392 getLocalizedName() {
        return this.value.getLocalizedName();
    }

    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        super.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
        class08844 class088442 = class06202.Nq().Nt();
        this.resetButton.field_22763 = this.isEditable() && this.getDefaultValue().isPresent() && !this.getDefaultValue().get().equals((Object)this.getValue());
        this.resetButton.method_46419(n2);
        this.buttonWidget.field_22763 = this.isEditable();
        this.buttonWidget.method_46419(n2);
        this.buttonWidget.method_25355(this.getLocalizedName());
        if (this.getConfigScreen().getFocusedBinding() == this) {
            this.buttonWidget.method_25355((class00392)class00392.y((String)"> ").N(class06541.field_1068).y((class00392)this.buttonWidget.method_25369().y().N(class06541.field_1054)).y((class00392)class00392.y((String)" <").N(class06541.field_1068)));
        }
        class00392 class003922 = this.getDisplayedFieldName();
        if (((class01590)class06202.Nq().i_3).N()) {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), class088442.P() - n3 - ((class01590)class06202.Nq().i_3).N((class05936)class003922), n2 + 6, -1);
            this.resetButton.method_46421(n3);
            this.buttonWidget.method_46421(n3 + this.resetButton.method_25368() + 2);
        } else {
            class010542.y((class01590)class06202.Nq().i_3, class003922.method_30937(), n3, n2 + 6, this.getPreferredTextColor());
            this.resetButton.method_46421(n3 + n4 - this.resetButton.method_25368());
            this.buttonWidget.method_46421(n3 + n4 - 150);
        }
        this.buttonWidget.method_25358(150 - this.resetButton.method_25368() - 2);
        this.resetButton.method_25394(class010542, n6, n7, f);
        this.buttonWidget.method_25394(class010542, n6, n7, f);
    }

    public boolean isAllowKey() {
        return this.allowKey;
    }

    public boolean isEdited() {
        return super.isEdited() || !this.original.equals((Object)this.getValue());
    }

    public void setAllowModifiers(boolean bl) {
        this.allowModifiers = bl;
    }

    public List<? extends class03434> narratables() {
        return this.widgets;
    }

    public boolean isAllowMouse() {
        return this.allowMouse;
    }

    public boolean isAllowModifiers() {
        return this.allowModifiers;
    }

    public void setAllowKey(boolean bl) {
        this.allowKey = bl;
    }

    public void setAllowMouse(boolean bl) {
        this.allowMouse = bl;
    }
}

