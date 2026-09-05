/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.example;

import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$CollapsibleObject;
import me.shedaniel.autoconfig.example.ExampleConfig$PairOfInts;

public class ExampleConfig$PairOfIntPairs {
    @ConfigEntry$Gui$CollapsibleObject
    public ExampleConfig$PairOfInts first;
    @ConfigEntry$Gui$CollapsibleObject
    public ExampleConfig$PairOfInts second;

    public ExampleConfig$PairOfIntPairs() {
        this(new ExampleConfig$PairOfInts(), new ExampleConfig$PairOfInts());
    }

    public ExampleConfig$PairOfIntPairs(ExampleConfig$PairOfInts exampleConfig$PairOfInts, ExampleConfig$PairOfInts exampleConfig$PairOfInts2) {
        this.first = exampleConfig$PairOfInts;
        this.second = exampleConfig$PairOfInts2;
    }
}

