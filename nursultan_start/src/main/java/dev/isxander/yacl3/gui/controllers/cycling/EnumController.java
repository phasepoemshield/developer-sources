/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.NameableEnum
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.controller.ValueFormatter
 *  minecraft.class00392
 */
package dev.isxander.yacl3.gui.controllers.cycling;

import dev.isxander.yacl3.api.NameableEnum;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.controller.ValueFormatter;
import dev.isxander.yacl3.gui.controllers.cycling.CyclingListController;
import java.util.Arrays;
import java.util.function.Function;
import minecraft.class00392;

public class EnumController<T extends Enum<T>>
extends CyclingListController<T> {
    public EnumController(Option<T> option, Function<T, class00392> function, T[] TArray) {
        super(option, Arrays.asList(TArray), function);
    }

    public EnumController(Option<T> option, Class<T> clazz) {
        this(option, EnumController.getDefaultFormatter(), (Enum[])clazz.getEnumConstants());
    }

    public static <T extends Enum<T>> Function<T, class00392> getDefaultFormatter() {
        return enum_ -> {
            if (enum_ instanceof NameableEnum) {
                NameableEnum nameableEnum = (NameableEnum)enum_;
                return nameableEnum.getDisplayName();
            }
            return class00392.y((String)enum_.toString());
        };
    }

    public static <T extends Enum<T>> EnumController<T> createInternal(Option<T> option, ValueFormatter<T> valueFormatter, T[] TArray) {
        return new EnumController(option, arg_0 -> valueFormatter.format(arg_0), TArray);
    }
}

