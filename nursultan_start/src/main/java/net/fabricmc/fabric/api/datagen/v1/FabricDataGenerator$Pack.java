/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01996
 *  minecraft.class07094
 *  minecraft.class07125
 *  minecraft.class07135
 */
package net.fabricmc.fabric.api.datagen.v1;

import minecraft.class01996;
import minecraft.class07094;
import minecraft.class07125;
import minecraft.class07135;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator$Pack$Factory;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator$Pack$RegistryDependentFactory;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

public final class FabricDataGenerator$Pack
extends class07125 {
    final /* synthetic */ FabricDataGenerator this$0;

    FabricDataGenerator$Pack(FabricDataGenerator fabricDataGenerator, boolean bl, String string, FabricDataOutput fabricDataOutput) {
        this.this$0 = fabricDataGenerator;
        super((class07094)fabricDataGenerator, bl, string, (class01996)fabricDataOutput);
    }

    public <T extends class07135> T addProvider(FabricDataGenerator$Pack$RegistryDependentFactory<T> fabricDataGenerator$Pack$RegistryDependentFactory) {
        return (T)super.method_46566(class019962 -> fabricDataGenerator$Pack$RegistryDependentFactory.create((FabricDataOutput)class019962, this.this$0.registriesFuture));
    }

    public <T extends class07135> T addProvider(FabricDataGenerator$Pack$Factory<T> fabricDataGenerator$Pack$Factory) {
        return (T)super.method_46566(class019962 -> fabricDataGenerator$Pack$Factory.create((FabricDataOutput)class019962));
    }
}

