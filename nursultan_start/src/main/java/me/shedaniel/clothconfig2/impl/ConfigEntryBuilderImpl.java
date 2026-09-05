/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigEntryBuilder
 *  me.shedaniel.clothconfig2.api.ModifierKeyCode
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl;

import java.util.Collection;
import java.util.List;
import java.util.UUID;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.ConfigEntryBuilderImpl$1;
import me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder;
import me.shedaniel.clothconfig2.impl.builders.ColorFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.DoubleFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.DoubleListBuilder;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder;
import me.shedaniel.clothconfig2.impl.builders.EnumSelectorBuilder;
import me.shedaniel.clothconfig2.impl.builders.FloatFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.FloatListBuilder;
import me.shedaniel.clothconfig2.impl.builders.IntFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.IntListBuilder;
import me.shedaniel.clothconfig2.impl.builders.IntSliderBuilder;
import me.shedaniel.clothconfig2.impl.builders.KeyCodeBuilder;
import me.shedaniel.clothconfig2.impl.builders.LongFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.LongListBuilder;
import me.shedaniel.clothconfig2.impl.builders.LongSliderBuilder;
import me.shedaniel.clothconfig2.impl.builders.SelectorBuilder;
import me.shedaniel.clothconfig2.impl.builders.StringFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.StringListBuilder;
import me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder;
import me.shedaniel.clothconfig2.impl.builders.TextDescriptionBuilder;
import me.shedaniel.clothconfig2.impl.builders.TextFieldBuilder;
import minecraft.class00392;

public class ConfigEntryBuilderImpl
implements ConfigEntryBuilder {
    private class00392 resetButtonKey = class00392.L((String)"text.cloth-config.reset_value");

    public static ConfigEntryBuilderImpl create() {
        return new ConfigEntryBuilderImpl();
    }

    ConfigEntryBuilderImpl() {
    }

    public <T extends Enum<?>> EnumSelectorBuilder<T> startEnumSelector(class00392 class003922, Class<T> clazz, T t) {
        return new EnumSelectorBuilder<T>(this.resetButtonKey, class003922, clazz, t);
    }

    public DoubleFieldBuilder startDoubleField(class00392 class003922, double d) {
        return new DoubleFieldBuilder(this.resetButtonKey, class003922, d);
    }

    public StringFieldBuilder startStrField(class00392 class003922, String string) {
        return new StringFieldBuilder(this.resetButtonKey, class003922, string);
    }

    public IntFieldBuilder startIntField(class00392 class003922, int n) {
        return new IntFieldBuilder(this.resetButtonKey, class003922, n);
    }

    public BooleanToggleBuilder startBooleanToggle(class00392 class003922, boolean bl) {
        return new BooleanToggleBuilder(this.resetButtonKey, class003922, bl);
    }

    public FloatListBuilder startFloatList(class00392 class003922, List<Float> list) {
        return new FloatListBuilder(this.resetButtonKey, class003922, list);
    }

    public FloatFieldBuilder startFloatField(class00392 class003922, float f) {
        return new FloatFieldBuilder(this.resetButtonKey, class003922, f);
    }

    public LongListBuilder startLongList(class00392 class003922, List<Long> list) {
        return new LongListBuilder(this.resetButtonKey, class003922, list);
    }

    public StringListBuilder startStrList(class00392 class003922, List<String> list) {
        return new StringListBuilder(this.resetButtonKey, class003922, list);
    }

    public LongFieldBuilder startLongField(class00392 class003922, long l) {
        return new LongFieldBuilder(this.resetButtonKey, class003922, l);
    }

    public class00392 getResetButtonKey() {
        return this.resetButtonKey;
    }

    public DoubleListBuilder startDoubleList(class00392 class003922, List<Double> list) {
        return new DoubleListBuilder(this.resetButtonKey, class003922, list);
    }

    public IntSliderBuilder startIntSlider(class00392 class003922, int n, int n2, int n3) {
        return new IntSliderBuilder(this.resetButtonKey, class003922, n, n2, n3);
    }

    public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, DropdownBoxEntry.SelectionTopCellElement<T> selectionTopCellElement, DropdownBoxEntry.SelectionCellCreator<T> selectionCellCreator) {
        return new DropdownMenuBuilder<T>(this.resetButtonKey, class003922, selectionTopCellElement, selectionCellCreator);
    }

    public ColorFieldBuilder startColorField(class00392 class003922, int n) {
        return new ColorFieldBuilder(this.resetButtonKey, class003922, n);
    }

    public <T> SelectorBuilder<T> startSelector(class00392 class003922, T[] TArray, T t) {
        return new SelectorBuilder<T>(this.resetButtonKey, class003922, TArray, t);
    }

    public IntListBuilder startIntList(class00392 class003922, List<Integer> list) {
        return new IntListBuilder(this.resetButtonKey, class003922, list);
    }

    public LongSliderBuilder startLongSlider(class00392 class003922, long l, long l2, long l3) {
        return new LongSliderBuilder(this.resetButtonKey, class003922, l, l2, l3);
    }

    public SubCategoryBuilder startSubCategory(class00392 class003922) {
        return new SubCategoryBuilder(this.resetButtonKey, class003922);
    }

    public SubCategoryBuilder startSubCategory(class00392 class003922, List<AbstractConfigListEntry> list) {
        SubCategoryBuilder subCategoryBuilder = new SubCategoryBuilder(this.resetButtonKey, class003922);
        subCategoryBuilder.addAll((Collection<? extends AbstractConfigListEntry>)list);
        return subCategoryBuilder;
    }

    public ConfigEntryBuilder setResetButtonKey(class00392 class003922) {
        this.resetButtonKey = class003922;
        return this;
    }

    public TextFieldBuilder startTextField(class00392 class003922, String string) {
        return new TextFieldBuilder(this.resetButtonKey, class003922, string);
    }

    public static ConfigEntryBuilderImpl createImmutable() {
        return new ConfigEntryBuilderImpl$1();
    }

    public TextDescriptionBuilder startTextDescription(class00392 class003922) {
        return new TextDescriptionBuilder(this.resetButtonKey, (class00392)class00392.y((String)UUID.randomUUID().toString()), class003922);
    }

    public KeyCodeBuilder startModifierKeyCodeField(class00392 class003922, ModifierKeyCode modifierKeyCode) {
        return new KeyCodeBuilder(this.resetButtonKey, class003922, modifierKeyCode);
    }
}

