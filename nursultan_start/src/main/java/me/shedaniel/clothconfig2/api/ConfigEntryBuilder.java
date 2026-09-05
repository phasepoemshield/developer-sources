/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement
 *  me.shedaniel.clothconfig2.impl.ConfigEntryBuilderImpl
 *  me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder
 *  me.shedaniel.clothconfig2.impl.builders.ColorFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DoubleFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DoubleListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder
 *  me.shedaniel.clothconfig2.impl.builders.EnumSelectorBuilder
 *  me.shedaniel.clothconfig2.impl.builders.FloatFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.FloatListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.IntFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.IntListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.IntSliderBuilder
 *  me.shedaniel.clothconfig2.impl.builders.KeyCodeBuilder
 *  me.shedaniel.clothconfig2.impl.builders.LongFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.LongListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.LongSliderBuilder
 *  me.shedaniel.clothconfig2.impl.builders.SelectorBuilder
 *  me.shedaniel.clothconfig2.impl.builders.StringFieldBuilder
 *  me.shedaniel.clothconfig2.impl.builders.StringListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder
 *  me.shedaniel.clothconfig2.impl.builders.TextDescriptionBuilder
 *  me.shedaniel.clothconfig2.impl.builders.TextFieldBuilder
 *  me.shedaniel.math.Color
 *  minecraft.class00392
 *  minecraft.class04671
 *  minecraft.class05194
 *  minecraft.class05630
 *  minecraft.class06202
 *  minecraft.class06428
 */
package me.shedaniel.clothconfig2.api;

import java.util.List;
import java.util.function.Function;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.ConfigEntryBuilderImpl;
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
import me.shedaniel.math.Color;
import minecraft.class00392;
import minecraft.class04671;
import minecraft.class05194;
import minecraft.class05630;
import minecraft.class06202;
import minecraft.class06428;

public interface ConfigEntryBuilder {
    public static ConfigEntryBuilder create() {
        return ConfigEntryBuilderImpl.create();
    }

    public <T extends Enum<?>> EnumSelectorBuilder<T> startEnumSelector(class00392 var1, Class<T> var2, T var3);

    public DoubleFieldBuilder startDoubleField(class00392 var1, double var2);

    public StringFieldBuilder startStrField(class00392 var1, String var2);

    public IntFieldBuilder startIntField(class00392 var1, int var2);

    public BooleanToggleBuilder startBooleanToggle(class00392 var1, boolean var2);

    public FloatListBuilder startFloatList(class00392 var1, List<Float> var2);

    public FloatFieldBuilder startFloatField(class00392 var1, float var2);

    public LongListBuilder startLongList(class00392 var1, List<Long> var2);

    public StringListBuilder startStrList(class00392 var1, List<String> var2);

    public LongFieldBuilder startLongField(class00392 var1, long var2);

    public class00392 getResetButtonKey();

    public DoubleListBuilder startDoubleList(class00392 var1, List<Double> var2);

    public IntSliderBuilder startIntSlider(class00392 var1, int var2, int var3, int var4);

    public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 var1, DropdownBoxEntry.SelectionTopCellElement<T> var2, DropdownBoxEntry.SelectionCellCreator<T> var3);

    default public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, T t, Function<String, T> function) {
        return this.startDropdownMenu(class003922, (DropdownBoxEntry.SelectionTopCellElement<T>)DropdownMenuBuilder.TopCellElementBuilder.of(t, function), (DropdownBoxEntry.SelectionCellCreator<T>)new DropdownBoxEntry.DefaultSelectionCellCreator());
    }

    default public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, T t, Function<String, T> function, Function<T, class00392> function2, DropdownBoxEntry.SelectionCellCreator<T> selectionCellCreator) {
        return this.startDropdownMenu(class003922, DropdownMenuBuilder.TopCellElementBuilder.of(t, function, function2), selectionCellCreator);
    }

    default public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, DropdownBoxEntry.SelectionTopCellElement<T> selectionTopCellElement) {
        return this.startDropdownMenu(class003922, selectionTopCellElement, (DropdownBoxEntry.SelectionCellCreator<T>)new DropdownBoxEntry.DefaultSelectionCellCreator());
    }

    default public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, T t, Function<String, T> function, Function<T, class00392> function2) {
        return this.startDropdownMenu(class003922, (DropdownBoxEntry.SelectionTopCellElement<T>)DropdownMenuBuilder.TopCellElementBuilder.of(t, function, function2), (DropdownBoxEntry.SelectionCellCreator<T>)new DropdownBoxEntry.DefaultSelectionCellCreator());
    }

    default public <T> DropdownMenuBuilder<T> startDropdownMenu(class00392 class003922, T t, Function<String, T> function, DropdownBoxEntry.SelectionCellCreator<T> selectionCellCreator) {
        return this.startDropdownMenu(class003922, DropdownMenuBuilder.TopCellElementBuilder.of(t, function), selectionCellCreator);
    }

    default public ColorFieldBuilder startColorField(class00392 class003922, class05194 class051942) {
        return this.startColorField(class003922, class051942.N());
    }

    default public ColorFieldBuilder startColorField(class00392 class003922, Color color) {
        return this.startColorField(class003922, color.getColor() & 0xFFFFFF);
    }

    public ColorFieldBuilder startColorField(class00392 var1, int var2);

    public <T> SelectorBuilder<T> startSelector(class00392 var1, T[] var2, T var3);

    public IntListBuilder startIntList(class00392 var1, List<Integer> var2);

    public LongSliderBuilder startLongSlider(class00392 var1, long var2, long var4, long var6);

    public SubCategoryBuilder startSubCategory(class00392 var1, List<AbstractConfigListEntry> var2);

    public SubCategoryBuilder startSubCategory(class00392 var1);

    public ConfigEntryBuilder setResetButtonKey(class00392 var1);

    public TextFieldBuilder startTextField(class00392 var1, String var2);

    default public KeyCodeBuilder startKeyCodeField(class00392 class003922, class04671 class046712) {
        return this.startModifierKeyCodeField(class003922, ModifierKeyCode.of(class046712, Modifier.none())).setAllowModifiers(false);
    }

    public TextDescriptionBuilder startTextDescription(class00392 var1);

    public KeyCodeBuilder startModifierKeyCodeField(class00392 var1, ModifierKeyCode var2);

    default public KeyCodeBuilder fillKeybindingField(class00392 class003922, class06428 class064282) {
        return this.startKeyCodeField(class003922, class064282.N).setDefaultValue(class064282.E()).setKeySaveConsumer(class046712 -> {
            class064282.y(class046712);
            class06428.i();
            ((class05630)class06202.Nq().i_7).Np();
        });
    }

    default public ColorFieldBuilder startAlphaColorField(class00392 class003922, int n) {
        return this.startColorField(class003922, n).setAlphaMode(true);
    }

    default public ColorFieldBuilder startAlphaColorField(class00392 class003922, Color color) {
        return this.startColorField(class003922, color.getColor());
    }

    default public DropdownMenuBuilder<String> startStringDropdownMenu(class00392 class003922, String string2, DropdownBoxEntry.SelectionCellCreator<String> selectionCellCreator) {
        return this.startDropdownMenu(class003922, DropdownMenuBuilder.TopCellElementBuilder.of((Object)string2, string -> string, class00392::y), selectionCellCreator);
    }

    default public DropdownMenuBuilder<String> startStringDropdownMenu(class00392 class003922, String string2) {
        return this.startDropdownMenu(class003922, (DropdownBoxEntry.SelectionTopCellElement)DropdownMenuBuilder.TopCellElementBuilder.of((Object)string2, string -> string, class00392::y), (DropdownBoxEntry.SelectionCellCreator)new DropdownBoxEntry.DefaultSelectionCellCreator());
    }

    default public DropdownMenuBuilder<String> startStringDropdownMenu(class00392 class003922, String string2, Function<String, class00392> function, DropdownBoxEntry.SelectionCellCreator<String> selectionCellCreator) {
        return this.startDropdownMenu(class003922, DropdownMenuBuilder.TopCellElementBuilder.of((Object)string2, string -> string, function), selectionCellCreator);
    }

    default public DropdownMenuBuilder<String> startStringDropdownMenu(class00392 class003922, String string2, Function<String, class00392> function) {
        return this.startDropdownMenu(class003922, (DropdownBoxEntry.SelectionTopCellElement)DropdownMenuBuilder.TopCellElementBuilder.of((Object)string2, string -> string, function), (DropdownBoxEntry.SelectionCellCreator)new DropdownBoxEntry.DefaultSelectionCellCreator());
    }
}

