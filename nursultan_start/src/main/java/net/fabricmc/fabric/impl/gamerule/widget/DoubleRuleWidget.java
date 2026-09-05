/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04927
 *  minecraft.class05191
 *  minecraft.class05211
 *  minecraft.class05220
 *  minecraft.class05222
 *  minecraft.class06202
 *  minecraft.class06839
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor
 */
package net.fabricmc.fabric.impl.gamerule.widget;

import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04927;
import minecraft.class05191;
import minecraft.class05211;
import minecraft.class05220;
import minecraft.class05222;
import minecraft.class06202;
import minecraft.class06839;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor;

@Environment(value=EnvType.CLIENT)
public final class DoubleRuleWidget
extends class05222 {
    private final class04927 textFieldWidget;

    public DoubleRuleWidget(class05191 class051912, class00392 class003922, List<class01028> list, String string2, class06839<Double> class068392) {
        class05191 class051913 = class051912;
        Objects.requireNonNull(class051913);
        super(class051913, list, class003922);
        EditGameRulesScreenAccessor editGameRulesScreenAccessor = (EditGameRulesScreenAccessor)class051912;
        this.textFieldWidget = new class04927((class01590)class06202.Nq().i_3, 10, 5, 42, 20, (class00392)class003922.L().y(class05220.n).i(string2).y(class05220.n));
        this.textFieldWidget.method_1852(editGameRulesScreenAccessor.getGameRules().y(class068392));
        this.textFieldWidget.method_1863(string -> {
            DataResult dataResult = class068392.N(string);
            if (dataResult.isSuccess()) {
                this.textFieldWidget.method_1868(-2039584);
                editGameRulesScreenAccessor.callMarkValid((class05211)this);
                editGameRulesScreenAccessor.getGameRules().N(class068392, (Object)((Double)dataResult.getOrThrow()), null);
            } else {
                this.textFieldWidget.method_1868(-65536);
                editGameRulesScreenAccessor.callMarkInvalid((class05211)this);
            }
        });
        this.field_25630.add(this.textFieldWidget);
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.method_29989(class010542, this.method_73382(), this.method_73380());
        this.textFieldWidget.method_46421(this.method_73389() - 44);
        this.textFieldWidget.method_46419(this.method_73382());
        this.textFieldWidget.method_25394(class010542, n, n2, f);
    }
}

