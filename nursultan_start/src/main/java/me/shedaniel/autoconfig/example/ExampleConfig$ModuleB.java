/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.example;

import java.util.Arrays;
import java.util.List;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry$BoundedDiscrete;
import me.shedaniel.autoconfig.annotation.ConfigEntry$ColorPicker;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Excluded;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$TransitiveObject;
import me.shedaniel.autoconfig.example.ExampleConfig$PairOfIntPairs;
import me.shedaniel.autoconfig.example.ExampleConfig$PairOfInts;

@Config(name="module_b")
public class ExampleConfig$ModuleB
implements ConfigData {
    @ConfigEntry$BoundedDiscrete(min=-1000L, max=2000L)
    public int intSlider = 500;
    @ConfigEntry$BoundedDiscrete(min=-1000L, max=2000L)
    public Long longSlider = 500L;
    @ConfigEntry$Gui$TransitiveObject
    public ExampleConfig$PairOfIntPairs anObject = new ExampleConfig$PairOfIntPairs(new ExampleConfig$PairOfInts(), new ExampleConfig$PairOfInts(3, 4));
    @ConfigEntry$Gui$Excluded
    public List<ExampleConfig$PairOfInts> aList = Arrays.asList(new ExampleConfig$PairOfInts(), new ExampleConfig$PairOfInts(3, 4));
    @ConfigEntry$ColorPicker
    public int color = 0xFFFFFF;
}

