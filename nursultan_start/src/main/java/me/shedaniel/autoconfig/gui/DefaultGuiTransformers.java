/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ConfigEntryBuilder
 *  me.shedaniel.clothconfig2.gui.entries.TextListEntry
 *  me.shedaniel.clothconfig2.gui.entries.TooltipListEntry
 *  minecraft.class00392
 */
package me.shedaniel.autoconfig.gui;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$NoTooltip;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$PrefixText;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$RequiresRestart;
import me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Tooltip;
import me.shedaniel.autoconfig.gui.registry.GuiRegistry;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import me.shedaniel.clothconfig2.gui.entries.TextListEntry;
import me.shedaniel.clothconfig2.gui.entries.TooltipListEntry;
import minecraft.class00392;

public class DefaultGuiTransformers {
    private static final ConfigEntryBuilder ENTRY_BUILDER = ConfigEntryBuilder.create();

    private DefaultGuiTransformers() {
    }

    public static GuiRegistry apply(GuiRegistry guiRegistry) {
        guiRegistry.registerAnnotationTransformer((list, string, field, object, object2, guiRegistryAccess) -> list.stream().peek(abstractConfigListEntry -> {
            if (!(abstractConfigListEntry instanceof TextListEntry)) {
                ConfigEntry$Gui$Tooltip configEntry$Gui$Tooltip = field.getAnnotation(ConfigEntry$Gui$Tooltip.class);
                if (configEntry$Gui$Tooltip.count() == 0) {
                    DefaultGuiTransformers.tryRemoveTooltip(abstractConfigListEntry);
                } else if (configEntry$Gui$Tooltip.count() == 1) {
                    DefaultGuiTransformers.tryApplyTooltip(abstractConfigListEntry, new class00392[]{class00392.L((String)String.format("%s.%s", string, "@Tooltip"))});
                } else {
                    DefaultGuiTransformers.tryApplyTooltip(abstractConfigListEntry, (class00392[])IntStream.range(0, configEntry$Gui$Tooltip.count()).boxed().map(n -> String.format("%s.%s[%d]", string, "@Tooltip", n)).map(class00392::L).toArray(class00392[]::new));
                }
            }
        }).collect(Collectors.toList()), ConfigEntry$Gui$Tooltip.class);
        guiRegistry.registerAnnotationTransformer((list, string, field, object, object2, guiRegistryAccess) -> list.stream().peek(abstractConfigListEntry -> {
            if (!(abstractConfigListEntry instanceof TextListEntry)) {
                Comment comment = field.getAnnotation(Comment.class);
                class00392[] class00392Array = new class00392[]{class00392.y((String)comment.value())};
                DefaultGuiTransformers.tryApplyTooltip(abstractConfigListEntry, class00392Array);
            }
        }).collect(Collectors.toList()), field -> !field.isAnnotationPresent(ConfigEntry$Gui$Tooltip.class), Comment.class);
        guiRegistry.registerAnnotationTransformer((list, string, field, object, object2, guiRegistryAccess) -> list.stream().peek(abstractConfigListEntry -> {
            if (!(abstractConfigListEntry instanceof TextListEntry)) {
                DefaultGuiTransformers.tryRemoveTooltip(abstractConfigListEntry);
            }
        }).collect(Collectors.toList()), ConfigEntry$Gui$NoTooltip.class);
        guiRegistry.registerAnnotationTransformer((list, string, field, object, object2, guiRegistryAccess) -> {
            ArrayList<TextListEntry> arrayList = new ArrayList<TextListEntry>(list);
            String string2 = String.format("%s.%s", string, "@PrefixText");
            TextListEntry textListEntry = ENTRY_BUILDER.startTextDescription((class00392)class00392.L((String)string2)).build();
            String string3 = class00392.L((String)string).getString().toLowerCase(Locale.ROOT);
            if (!string3.isEmpty()) {
                textListEntry.appendSearchTags((Iterable)Lists.newArrayList((Object[])string3.split(" ")));
            }
            arrayList.add(0, textListEntry);
            return Collections.unmodifiableList(arrayList);
        }, ConfigEntry$Gui$PrefixText.class);
        guiRegistry.registerAnnotationTransformer((list, string, field, object, object2, guiRegistryAccess) -> {
            for (AbstractConfigListEntry abstractConfigListEntry : list) {
                abstractConfigListEntry.setRequiresRestart(field.getAnnotation(ConfigEntry$Gui$RequiresRestart.class).value());
            }
            return list;
        }, ConfigEntry$Gui$RequiresRestart.class);
        return guiRegistry;
    }

    private static void tryApplyTooltip(AbstractConfigListEntry abstractConfigListEntry, class00392[] class00392Array) {
        if (abstractConfigListEntry instanceof TooltipListEntry) {
            TooltipListEntry tooltipListEntry = (TooltipListEntry)abstractConfigListEntry;
            tooltipListEntry.setTooltipSupplier(() -> Optional.of(class00392Array));
        }
    }

    private static void tryRemoveTooltip(AbstractConfigListEntry abstractConfigListEntry) {
        if (abstractConfigListEntry instanceof TooltipListEntry) {
            TooltipListEntry tooltipListEntry = (TooltipListEntry)abstractConfigListEntry;
            tooltipListEntry.setTooltipSupplier(() -> Optional.empty());
        }
    }
}

