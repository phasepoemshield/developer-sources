/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.example;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.Config$Gui$Background;
import me.shedaniel.autoconfig.annotation.Config$Gui$CategoryBackground;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Category;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$TransitiveObject;
import me.shedaniel.autoconfig.example.ExampleConfig$Empty;
import me.shedaniel.autoconfig.example.ExampleConfig$ModuleA;
import me.shedaniel.autoconfig.example.ExampleConfig$ModuleB;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer$GlobalData;

@Config(name="autoconfig1u_example")
@Config$Gui$Background(value="cloth-config2:transparent")
@Config$Gui$CategoryBackground(category="b", background="minecraft:textures/block/stone.png")
public class ExampleConfig
extends PartitioningSerializer$GlobalData {
    @ConfigEntry$Category(value="a")
    @ConfigEntry$Gui$TransitiveObject
    public ExampleConfig$ModuleA moduleA = new ExampleConfig$ModuleA();
    @ConfigEntry$Category(value="a")
    @ConfigEntry$Gui$TransitiveObject
    public ExampleConfig$Empty empty = new ExampleConfig$Empty();
    @ConfigEntry$Category(value="b")
    @ConfigEntry$Gui$TransitiveObject
    public ExampleConfig$ModuleB moduleB = new ExampleConfig$ModuleB();
}

