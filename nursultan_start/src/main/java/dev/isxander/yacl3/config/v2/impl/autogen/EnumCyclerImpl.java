/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.NameableEnum
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ControllerBuilder
 *  dev.isxander.yacl3.api.controller.CyclingListControllerBuilder
 *  minecraft.class00392
 */
package dev.isxander.yacl3.config.v2.impl.autogen;

import dev.isxander.yacl3.api.NameableEnum;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ControllerBuilder;
import dev.isxander.yacl3.api.controller.CyclingListControllerBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigField;
import dev.isxander.yacl3.config.v2.api.autogen.EnumCycler;
import dev.isxander.yacl3.config.v2.api.autogen.EnumCycler$CyclableEnum;
import dev.isxander.yacl3.config.v2.api.autogen.OptionAccess;
import dev.isxander.yacl3.config.v2.api.autogen.SimpleOptionFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class00392;

public class EnumCyclerImpl
extends SimpleOptionFactory<EnumCycler, Enum<?>> {
    @Override
    protected ControllerBuilder<Enum<?>> createController(EnumCycler enumCycler, ConfigField<Enum<?>> configField, OptionAccess optionAccess, Option<Enum<?>> option) {
        List list;
        EnumCycler$CyclableEnum enumCycler$CyclableEnum;
        Enum[] enumArray = option.pendingValue();
        if (enumArray instanceof EnumCycler$CyclableEnum) {
            enumCycler$CyclableEnum = (EnumCycler$CyclableEnum)enumArray;
            list = Arrays.asList(enumCycler$CyclableEnum.allowedValues());
        } else {
            enumArray = (Enum[])configField.access().typeClass().getEnumConstants();
            list = IntStream.range(0, enumArray.length).filter(n -> enumCycler.allowedOrdinals().length == 0 || Arrays.stream(enumCycler.allowedOrdinals()).noneMatch(n2 -> n2 == n)).mapToObj(n -> enumArray[n]).toList();
        }
        enumCycler$CyclableEnum = CyclingListControllerBuilder.create(option).values(list);
        if (NameableEnum.class.isAssignableFrom(configField.access().typeClass())) {
            enumCycler$CyclableEnum.formatValue(enum_ -> ((NameableEnum)enum_).getDisplayName());
        } else {
            enumCycler$CyclableEnum.formatValue(enum_ -> class00392.L((String)"yacl3.config.enum.%s.%s".formatted(new Object[]{configField.access().typeClass().getSimpleName(), enum_.name().toLowerCase()})));
        }
        return enumCycler$CyclableEnum;
    }
}

