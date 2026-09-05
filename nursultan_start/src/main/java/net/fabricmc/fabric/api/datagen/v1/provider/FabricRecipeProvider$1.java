/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03711
 *  minecraft.class03719
 *  minecraft.class05946
 *  minecraft.class06521
 *  minecraft.class07165
 *  net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition
 *  net.fabricmc.fabric.impl.datagen.FabricDataGenHelper
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.datagen.v1.provider;

import minecraft.class01894;
import minecraft.class03711;
import minecraft.class03719;
import minecraft.class05946;
import minecraft.class06521;
import minecraft.class07165;
import net.fabricmc.fabric.api.resource.conditions.v1.ResourceCondition;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import org.jspecify.annotations.Nullable;

class FabricRecipeProvider$1
implements class03719 {
    final /* synthetic */ ResourceCondition[] val$conditions;
    final /* synthetic */ class03719 val$exporter;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    FabricRecipeProvider$1() {
        void var3_-1;
        void var2_-1;
        this.val$conditions = var2_-1;
        this.val$exporter = var3_-1;
    }

    public void method_62738() {
    }

    public class01894 getRecipeIdentifier(class01894 class018942) {
        return this.val$exporter.getRecipeIdentifier(class018942);
    }

    public class07165 method_53818() {
        return this.val$exporter.method_53818();
    }

    public void method_53819(class05946<class06521<?>> class059462, class06521<?> class065212, @Nullable class03711 class037112) {
        FabricDataGenHelper.addConditions(class065212, (ResourceCondition[])this.val$conditions);
        this.val$exporter.method_53819(class059462, class065212, class037112);
    }
}

