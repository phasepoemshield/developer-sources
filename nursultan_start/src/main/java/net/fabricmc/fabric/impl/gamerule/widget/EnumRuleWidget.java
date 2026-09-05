/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class05191
 *  minecraft.class05222
 *  minecraft.class05362
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06839
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor
 */
package net.fabricmc.fabric.impl.gamerule.widget;

import java.util.List;
import java.util.Locale;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class05191;
import minecraft.class05222;
import minecraft.class05362;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06839;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.gamerule.RuleTypeExtensions;
import net.fabricmc.fabric.mixin.gamerule.client.EditGameRulesScreenAccessor;

@Environment(value=EnvType.CLIENT)
public final class EnumRuleWidget<E extends Enum<E>>
extends class05222 {
    private final class05362 buttonWidget;
    private final String rootTranslationKey;

    public EnumRuleWidget(class05191 class051912, class00392 class003922, List<class01028> list, String string, class06839<E> class068392, String string2) {
        class05191 class051913 = class051912;
        Objects.requireNonNull(class051913);
        super(class051913, list, class003922);
        EditGameRulesScreenAccessor editGameRulesScreenAccessor = (EditGameRulesScreenAccessor)class051912;
        this.field_25629 = ((class01590)class06202.Nq().i_3).L((class05936)class003922, 131);
        this.rootTranslationKey = string2;
        this.buttonWidget = class05362.method_46430((class00392)this.getValueText((Enum)editGameRulesScreenAccessor.getGameRules().N(class068392)), class053622 -> {
            editGameRulesScreenAccessor.getGameRules().N(class068392, (Object)((RuleTypeExtensions)class068392).fabric_enumCycle((Enum)editGameRulesScreenAccessor.getGameRules().N(class068392)), null);
            class053622.method_25355(this.getValueText((Enum)editGameRulesScreenAccessor.getGameRules().N(class068392)));
        }).N(10, 5, 42, 20).N();
        this.field_25630.add(this.buttonWidget);
    }

    public class00392 getValueText(E e) {
        String string = this.rootTranslationKey + "." + ((Enum)e).name().toLowerCase(Locale.ROOT);
        return class00392.N((String)string, (String)((Enum)e).toString());
    }

    public void method_25343(class01054 class010542, int n, int n2, boolean bl, float f) {
        this.method_29989(class010542, this.method_73382(), this.method_73380());
        this.buttonWidget.method_46421(this.method_73389() - 44);
        this.buttonWidget.method_46419(this.method_73382());
        this.buttonWidget.method_25394(class010542, n, n2, f);
    }
}

