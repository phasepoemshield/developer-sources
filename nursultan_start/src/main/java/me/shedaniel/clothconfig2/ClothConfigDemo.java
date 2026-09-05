/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.autoconfig.util.Utils
 *  me.shedaniel.clothconfig2.gui.entries.BooleanListEntry
 *  me.shedaniel.clothconfig2.gui.entries.EnumListEntry
 *  me.shedaniel.clothconfig2.gui.entries.IntegerSliderEntry
 *  me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry
 *  me.shedaniel.clothconfig2.gui.entries.NestedListListEntry
 *  me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder
 *  me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$TopCellElementBuilder
 *  me.shedaniel.clothconfig2.impl.builders.LongListBuilder
 *  me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder
 *  minecraft.class00380
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00623
 *  minecraft.class00647
 *  minecraft.class00652
 *  minecraft.class02484
 *  minecraft.class03556
 *  minecraft.class04105
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04648
 *  minecraft.class04655
 *  minecraft.class06541
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 *  minecraft.class07314
 *  minecraft.class07536
 */
package me.shedaniel.clothconfig2;

import com.google.common.collect.Lists;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import me.shedaniel.autoconfig.util.Utils;
import me.shedaniel.clothconfig2.ClothConfigDemo$1DependencyDemoEnum;
import me.shedaniel.clothconfig2.ClothConfigDemo$1Pair;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.api.Modifier;
import me.shedaniel.clothconfig2.api.ModifierKeyCode;
import me.shedaniel.clothconfig2.api.Requirement;
import me.shedaniel.clothconfig2.api.ValueHolder;
import me.shedaniel.clothconfig2.gui.entries.BooleanListEntry;
import me.shedaniel.clothconfig2.gui.entries.EnumListEntry;
import me.shedaniel.clothconfig2.gui.entries.IntegerSliderEntry;
import me.shedaniel.clothconfig2.gui.entries.MultiElementListEntry;
import me.shedaniel.clothconfig2.gui.entries.NestedListListEntry;
import me.shedaniel.clothconfig2.impl.builders.BooleanToggleBuilder;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder;
import me.shedaniel.clothconfig2.impl.builders.LongListBuilder;
import me.shedaniel.clothconfig2.impl.builders.SubCategoryBuilder;
import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00623;
import minecraft.class00647;
import minecraft.class00652;
import minecraft.class02484;
import minecraft.class03556;
import minecraft.class04105;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04648;
import minecraft.class04655;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;
import minecraft.class07314;
import minecraft.class07536;

public class ClothConfigDemo {
    public static ConfigBuilder getConfigBuilderWithDemo() {
        ConfigBuilder configBuilder = ConfigBuilder.create().setTitle((class00392)class00392.L((String)"title.cloth-config.config"));
        configBuilder.setGlobalized(true);
        configBuilder.setGlobalizedExpanded(false);
        ConfigEntryBuilder configEntryBuilder = configBuilder.entryBuilder();
        ConfigCategory configCategory = configBuilder.getOrCreateCategory((class00392)class00392.L((String)"category.cloth-config.testing"));
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startKeyCodeField((class00392)class00392.y((String)"Cool Key"), class04655.yI).setDefaultValue(class04655.yI).build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startModifierKeyCodeField((class00392)class00392.y((String)"Cool Modifier Key"), ModifierKeyCode.of(class04648.field_1668.N(79), Modifier.of(false, true, false))).setDefaultValue(ModifierKeyCode.of(class04648.field_1668.N(79), Modifier.of(false, true, false))).build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startDoubleList((class00392)class00392.y((String)"A list of Doubles"), Arrays.asList(1.0, 2.0, 3.0)).setDefaultValue(Arrays.asList(1.0, 2.0, 3.0)).build());
        configCategory.addEntry((AbstractConfigListEntry)((LongListBuilder)configEntryBuilder.startLongList((class00392)class00392.y((String)"A list of Longs"), Arrays.asList(1L, 2L, 3L)).setDefaultValue(Arrays.asList(1L, 2L, 3L)).setInsertButtonEnabled(false)).build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startStrList((class00392)class00392.y((String)"A list of Strings"), Arrays.asList("abc", "xyz")).setTooltip(new class00392[]{class00392.y((String)"Yes this is some beautiful tooltip\nOh and this is the second line!")}).setDefaultValue(Arrays.asList("abc", "xyz")).build());
        SubCategoryBuilder subCategoryBuilder = configEntryBuilder.startSubCategory((class00392)class00392.y((String)"Colors")).setExpanded(true);
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startColorField((class00392)class00392.y((String)"A color field"), 65535).setDefaultValue(65535).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startColorField((class00392)class00392.y((String)"An alpha color field"), -16711681).setDefaultValue(-16711681).setAlphaMode(true).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startColorField((class00392)class00392.y((String)"An alpha color field"), -1).setDefaultValue(-65536).setAlphaMode(true).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        SubCategoryBuilder subCategoryBuilder2 = configEntryBuilder.startSubCategory((class00392)class00392.y((String)"Inner Colors")).setExpanded(true);
        subCategoryBuilder2.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder2.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder2.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        SubCategoryBuilder subCategoryBuilder3 = configEntryBuilder.startSubCategory((class00392)class00392.y((String)"Inner Inner Colors")).setExpanded(true);
        subCategoryBuilder3.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder3.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder3.add((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"lol apple"), DropdownMenuBuilder.TopCellElementBuilder.ofItemObject((class06581)class06570.sS), DropdownMenuBuilder.CellCreatorBuilder.ofItemObject()).setDefaultValue((Object)class06570.sS).setSelections((Iterable)class04206.B.j().sorted(Comparator.comparing(class06581::toString)).collect(Collectors.toCollection(LinkedHashSet::new))).setSaveConsumer(class065812 -> System.out.println("save this " + String.valueOf(class065812))).build());
        subCategoryBuilder2.add((AbstractConfigListEntry)subCategoryBuilder3.build());
        subCategoryBuilder.add((AbstractConfigListEntry)subCategoryBuilder2.build());
        configCategory.addEntry((AbstractConfigListEntry)subCategoryBuilder.build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"Suggestion Random Int"), DropdownMenuBuilder.TopCellElementBuilder.of((Object)10, string -> {
            try {
                return Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        })).setDefaultValue((Object)10).setSelections((Iterable)Lists.newArrayList((Object[])new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startDropdownMenu((class00392)class00392.y((String)"Selection Random Int"), DropdownMenuBuilder.TopCellElementBuilder.of((Object)10, string -> {
            try {
                return Integer.parseInt(string);
            }
            catch (NumberFormatException numberFormatException) {
                return null;
            }
        })).setDefaultValue((Object)5).setSuggestionMode(false).setSelections((Iterable)Lists.newArrayList((Object[])new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})).build());
        configCategory.addEntry((AbstractConfigListEntry)new NestedListListEntry((class00392)class00392.y((String)"Nice"), (List)Lists.newArrayList((Object[])new ClothConfigDemo$1Pair[]{new ClothConfigDemo$1Pair<Integer, Integer>(10, 10), new ClothConfigDemo$1Pair<Integer, Integer>(20, 40)}), false, Optional::empty, list -> {}, () -> Lists.newArrayList((Object[])new ClothConfigDemo$1Pair[]{new ClothConfigDemo$1Pair<Integer, Integer>(10, 10), new ClothConfigDemo$1Pair<Integer, Integer>(20, 40)}), configEntryBuilder.getResetButtonKey(), true, true, (clothConfigDemo$1Pair, nestedListListEntry) -> {
            if (clothConfigDemo$1Pair == null) {
                ClothConfigDemo$1Pair<Integer, Integer> clothConfigDemo$1Pair2 = new ClothConfigDemo$1Pair<Integer, Integer>(10, 10);
                return new MultiElementListEntry((class00392)class00392.y((String)"Pair"), clothConfigDemo$1Pair2, (List)Lists.newArrayList((Object[])new AbstractConfigListEntry[]{configEntryBuilder.startIntField((class00392)class00392.y((String)"Left"), clothConfigDemo$1Pair2.getLeft()).setDefaultValue(10).build(), configEntryBuilder.startIntField((class00392)class00392.y((String)"Right"), clothConfigDemo$1Pair2.getRight()).setDefaultValue(10).build()}), true);
            }
            return new MultiElementListEntry((class00392)class00392.y((String)"Pair"), clothConfigDemo$1Pair, (List)Lists.newArrayList((Object[])new AbstractConfigListEntry[]{configEntryBuilder.startIntField((class00392)class00392.y((String)"Left"), (Integer)clothConfigDemo$1Pair.getLeft()).setDefaultValue(10).build(), configEntryBuilder.startIntField((class00392)class00392.y((String)"Right"), (Integer)clothConfigDemo$1Pair.getRight()).setDefaultValue(10).build()}), true);
        }));
        SubCategoryBuilder subCategoryBuilder4 = configEntryBuilder.startSubCategory((class00392)class00392.y((String)"Dependencies")).setExpanded(true);
        BooleanListEntry booleanListEntry = configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"A cool toggle"), false).setTooltip(new class00392[]{class00392.y((String)"Toggle me...")}).build();
        subCategoryBuilder4.add((AbstractConfigListEntry)booleanListEntry);
        LinkedList<BooleanListEntry> linkedList = new LinkedList<BooleanListEntry>();
        linkedList.add(((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I only work when cool is toggled..."), true).setRequirement(Requirement.isTrue((ValueHolder<Boolean>)booleanListEntry))).build());
        linkedList.add(((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I only appear when cool is toggled..."), true).setDisplayRequirement(Requirement.isTrue((ValueHolder<Boolean>)booleanListEntry))).build());
        subCategoryBuilder4.addAll(linkedList);
        subCategoryBuilder4.add((AbstractConfigListEntry)((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I only work when cool matches both of these toggles ^^"), true).setRequirement(Requirement.all((Requirement[])linkedList.stream().map(booleanListEntry2 -> Requirement.matches(booleanListEntry, booleanListEntry2)).toArray(Requirement[]::new)))).build());
        SubCategoryBuilder subCategoryBuilder5 = (SubCategoryBuilder)configEntryBuilder.startSubCategory((class00392)class00392.y((String)"Sub-categories can have requirements too...")).setRequirement(Requirement.isTrue((ValueHolder<Boolean>)booleanListEntry));
        subCategoryBuilder5.add((AbstractConfigListEntry)configEntryBuilder.startTextDescription((class00392)class00392.y((String)"This sub category depends on Cool being toggled")).build());
        subCategoryBuilder5.add((AbstractConfigListEntry)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"Example entry"), true).build());
        subCategoryBuilder5.add((AbstractConfigListEntry)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"Another example..."), true).build());
        subCategoryBuilder4.add((AbstractConfigListEntry)subCategoryBuilder5.build());
        subCategoryBuilder4.add((AbstractConfigListEntry)((LongListBuilder)configEntryBuilder.startLongList((class00392)class00392.y((String)"Even lists!"), Arrays.asList(1L, 2L, 3L)).setDefaultValue(Arrays.asList(1L, 2L, 3L)).setRequirement(Requirement.isTrue((ValueHolder<Boolean>)booleanListEntry))).build());
        EnumListEntry enumListEntry = configEntryBuilder.startEnumSelector((class00392)class00392.y((String)"Select a good or bad option"), ClothConfigDemo$1DependencyDemoEnum.class, ClothConfigDemo$1DependencyDemoEnum.OKAY).build();
        subCategoryBuilder4.add((AbstractConfigListEntry)enumListEntry);
        IntegerSliderEntry integerSliderEntry = configEntryBuilder.startIntSlider((class00392)class00392.y((String)"Select something big or small"), 50, -100, 100).build();
        subCategoryBuilder4.add((AbstractConfigListEntry)integerSliderEntry);
        subCategoryBuilder4.add((AbstractConfigListEntry)((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I only work when a good option is chosen..."), true).setTooltip(new class00392[]{class00392.y((String)"Select good or better above")}).setRequirement(Requirement.isValue(enumListEntry, ClothConfigDemo$1DependencyDemoEnum.EXCELLENT, new ClothConfigDemo$1DependencyDemoEnum[]{ClothConfigDemo$1DependencyDemoEnum.GOOD}))).build());
        subCategoryBuilder4.add((AbstractConfigListEntry)((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I need a good option AND a cool toggle!"), true).setTooltip(new class00392[]{class00392.y((String)"Select good or better and also toggle cool")}).setRequirement(Requirement.all(Requirement.isTrue((ValueHolder<Boolean>)booleanListEntry), Requirement.isValue(enumListEntry, ClothConfigDemo$1DependencyDemoEnum.EXCELLENT, new ClothConfigDemo$1DependencyDemoEnum[]{ClothConfigDemo$1DependencyDemoEnum.GOOD})))).build());
        subCategoryBuilder4.add((AbstractConfigListEntry)((BooleanToggleBuilder)configEntryBuilder.startBooleanToggle((class00392)class00392.y((String)"I only work when numbers are extreme!"), true).setTooltip(new class00392[]{class00392.y((String)"Move the slider...")}).setRequirement(Requirement.any(() -> integerSliderEntry.getValue() < -70, () -> integerSliderEntry.getValue() > 70))).build());
        configCategory.addEntry((AbstractConfigListEntry)subCategoryBuilder4.build());
        configCategory.addEntry((AbstractConfigListEntry)configEntryBuilder.startTextDescription((class00392)class00392.N((String)"text.cloth-config.testing.1", (Object[])new Object[]{class00392.y((String)"ClothConfig").N(class004052 -> class004052.N(Boolean.valueOf(true)).N((class00395)new class00380((class06584)class07536.N((Object)new class06584((class07310)class06570.uE), class065842 -> {
            class065842.N(class02484.B, (Object)class00392.y((String)"(\u30fb\u2200\u30fb)"));
            class065842.N((class03556)class04105.N().y(class04227.yR).y(class07314.n), 10);
        })))), class00392.L((String)"text.cloth-config.testing.2").N(class004052 -> {
            try {
                return class004052.N(class06541.field_1078).N((class00395)new class00401((class00392)class00392.y((String)"https://shedaniel.gitbook.io/cloth-config/"))).N((class00647)new class00652(new URI("https://shedaniel.gitbook.io/cloth-config/")));
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new RuntimeException(uRISyntaxException);
            }
        }), class00392.L((String)"text.cloth-config.testing.3").N(class004052 -> class004052.N(class06541.field_1060).N((class00647)new class00623(Utils.getConfigFolder().getParent().resolve("options.txt").toString())))})).build());
        configBuilder.transparentBackground();
        return configBuilder;
    }
}

