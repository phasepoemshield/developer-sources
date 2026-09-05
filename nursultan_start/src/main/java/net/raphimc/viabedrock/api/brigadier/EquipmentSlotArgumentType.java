/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.mojang.brigadier.LiteralMessage
 *  com.mojang.brigadier.Message
 *  com.mojang.brigadier.StringReader
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.SimpleCommandExceptionType
 *  com.mojang.brigadier.suggestion.Suggestions
 *  com.mojang.brigadier.suggestion.SuggestionsBuilder
 *  net.raphimc.viabedrock.api.brigadier.SuggestionsUtil
 */
package net.raphimc.viabedrock.api.brigadier;

import com.google.common.collect.Lists;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.Message;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.raphimc.viabedrock.api.brigadier.SuggestionsUtil;

public class EquipmentSlotArgumentType
implements ArgumentType<Object> {
    private static final List<String> SLOTS = Lists.newArrayList((Object[])new String[]{"slot.armor", "slot.armor.chest", "slot.armor.feet", "slot.armor.head", "slot.armor.legs", "slot.chest", "slot.enderchest", "slot.equippable", "slot.hotbar", "slot.inventory", "slot.saddle", "slot.weapon.mainhand", "slot.weapon.offhand"});
    private static final SimpleCommandExceptionType INVALID_EQUIPMENT_EXCEPTION = new SimpleCommandExceptionType((Message)new LiteralMessage("Invalid equipment slot"));

    public Object parse(StringReader reader) throws CommandSyntaxException {
        String slot = reader.readUnquotedString();
        if (!SLOTS.contains(slot)) {
            throw INVALID_EQUIPMENT_EXCEPTION.create();
        }
        return null;
    }

    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return SuggestionsUtil.suggestMatching(SLOTS, (SuggestionsBuilder)builder);
    }

    public static EquipmentSlotArgumentType equipmentSlot() {
        return new EquipmentSlotArgumentType();
    }
}

