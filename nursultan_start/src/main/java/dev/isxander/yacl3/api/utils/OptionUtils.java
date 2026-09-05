/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.ConfigCategory
 *  dev.isxander.yacl3.api.ListOption
 *  dev.isxander.yacl3.api.Option
 *  dev.isxander.yacl3.api.OptionGroup
 *  dev.isxander.yacl3.api.YetAnotherConfigLib
 */
package dev.isxander.yacl3.api.utils;

import dev.isxander.yacl3.api.ConfigCategory;
import dev.isxander.yacl3.api.ListOption;
import dev.isxander.yacl3.api.Option;
import dev.isxander.yacl3.api.OptionGroup;
import dev.isxander.yacl3.api.YetAnotherConfigLib;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class OptionUtils {
    public static Stream<Option<?>> getFlatOptions(YetAnotherConfigLib yetAnotherConfigLib) {
        return yetAnotherConfigLib.categories().stream().flatMap(configCategory -> configCategory.groups().stream()).flatMap(optionGroup -> {
            Stream<ListOption> stream;
            if (optionGroup instanceof ListOption) {
                ListOption listOption = (ListOption)optionGroup;
                stream = Stream.of(listOption);
            } else {
                stream = optionGroup.options().stream();
            }
            return stream;
        });
    }

    public static void forEachOptions(YetAnotherConfigLib yetAnotherConfigLib, Consumer<Option<?>> consumer) {
        OptionUtils.consumeOptions(yetAnotherConfigLib, option -> {
            consumer.accept((Option<?>)option);
            return false;
        });
    }

    public static void consumeOptions(YetAnotherConfigLib yetAnotherConfigLib, Function<Option<?>, Boolean> function) {
        for (ConfigCategory configCategory : yetAnotherConfigLib.categories()) {
            for (OptionGroup optionGroup : configCategory.groups()) {
                if (optionGroup instanceof ListOption) {
                    ListOption listOption = (ListOption)optionGroup;
                    if (!function.apply((Option<?>)listOption).booleanValue()) continue;
                    return;
                }
                for (Option option : optionGroup.options()) {
                    if (!function.apply(option).booleanValue()) continue;
                    return;
                }
            }
        }
    }
}

