/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.example;

import java.util.Arrays;
import java.util.List;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$CollapsibleObject;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$EnumHandler;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$EnumHandler$EnumDisplayOption;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$PrefixText;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Tooltip;
import me.shedaniel.autoconfig.example.ExampleConfig$ExampleEnum;
import me.shedaniel.autoconfig.example.ExampleConfig$PairOfIntPairs;
import me.shedaniel.autoconfig.example.ExampleConfig$PairOfInts;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name="module_a")
public class ExampleConfig$ModuleA
implements ConfigData {
    @ConfigEntry$Gui$PrefixText
    public boolean aBoolean = true;
    @ConfigEntry$Gui$Tooltip(count=2)
    public ExampleConfig$ExampleEnum anEnum = ExampleConfig$ExampleEnum.FOO;
    @ConfigEntry$Gui$Tooltip(count=2)
    @ConfigEntry$Gui$EnumHandler(option=ConfigEntry$Gui$EnumHandler$EnumDisplayOption.BUTTON)
    public ExampleConfig$ExampleEnum anEnumWithButton = ExampleConfig$ExampleEnum.FOO;
    @Comment(value="This tooltip was automatically applied from a Jankson @Comment")
    public String aString = "hello";
    @ConfigEntry$Gui$CollapsibleObject(startExpanded=true)
    public ExampleConfig$PairOfIntPairs anObject = new ExampleConfig$PairOfIntPairs(new ExampleConfig$PairOfInts(), new ExampleConfig$PairOfInts(3, 4));
    public List<Integer> list = Arrays.asList(1, 2, 3);
    public int[] array = new int[]{1, 2, 3};
    public List<ExampleConfig$PairOfInts> complexList = Arrays.asList(new ExampleConfig$PairOfInts(0, 1), new ExampleConfig$PairOfInts(3, 7));
    public ExampleConfig$PairOfInts[] complexArray = new ExampleConfig$PairOfInts[]{new ExampleConfig$PairOfInts(0, 1), new ExampleConfig$PairOfInts(3, 7)};
}

