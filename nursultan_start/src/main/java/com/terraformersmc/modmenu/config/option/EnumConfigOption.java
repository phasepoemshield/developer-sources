/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class04344
 *  minecraft.class04370
 *  minecraft.class04380
 *  minecraft.class05220
 */
package com.terraformersmc.modmenu.config.option;

import com.mojang.serialization.Codec;
import com.terraformersmc.modmenu.config.option.ConfigOptionStorage;
import com.terraformersmc.modmenu.config.option.OptionConvertible;
import com.terraformersmc.modmenu.util.TranslationUtil;
import java.util.Arrays;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class04344;
import minecraft.class04370;
import minecraft.class04380;
import minecraft.class05220;

public class EnumConfigOption<E extends Enum<E>>
implements OptionConvertible {
    private final String key;
    private final String translationKey;
    private final Class<E> enumClass;
    private final E defaultValue;

    public EnumConfigOption(String string, E e) {
        ConfigOptionStorage.setEnum(string, e);
        this.key = string;
        this.translationKey = TranslationUtil.translationKeyOf("option", string);
        this.enumClass = ((Enum)e).getDeclaringClass();
        this.defaultValue = e;
    }

    public E getValue() {
        return ConfigOptionStorage.getEnum(this.key, this.enumClass);
    }

    public String getKey() {
        return this.key;
    }

    public void setValue(E e) {
        ConfigOptionStorage.setEnum(this.key, e);
    }

    public E getDefaultValue() {
        return this.defaultValue;
    }

    public class00392 getButtonText() {
        return class05220.N((class00392)class00392.L((String)this.translationKey), (class00392)EnumConfigOption.getValueText(this, this.getValue()));
    }

    private static <E extends Enum<E>> class00392 getValueText(EnumConfigOption<E> enumConfigOption, E e) {
        return class00392.L((String)(enumConfigOption.translationKey + "." + e.name().toLowerCase(Locale.ROOT)));
    }

    public void cycleValue() {
        ConfigOptionStorage.cycleEnum(this.key, this.enumClass);
    }

    public void cycleValue(int n) {
        ConfigOptionStorage.cycleEnum(this.key, this.enumClass, n);
    }

    public class04370<E> asOption() {
        return new class04370(this.translationKey, class04370.method_42399(), (class003922, enum_) -> EnumConfigOption.getValueText(this, enum_), (class04344)new class04380(Arrays.asList((Enum[])this.enumClass.getEnumConstants()), Codec.STRING.xmap(string -> Arrays.stream((Enum[])this.enumClass.getEnumConstants()).filter(enum_ -> enum_.name().toLowerCase().equals(string)).findAny().orElse(null), enum_ -> enum_.name().toLowerCase())), this.getValue(), enum_ -> ConfigOptionStorage.setEnum(this.key, enum_));
    }
}

