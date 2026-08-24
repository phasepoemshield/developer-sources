package org.zenith.base.comand.impl.args;

import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;













import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;

public class CoordinateArgumentType implements ArgumentType<Double> {
   public static final Collection<String> EXAMPLES = java.util.List.of();

   public CoordinateArgumentType() {
   }

   public static CoordinateArgumentType create() {
      return new CoordinateArgumentType();
   }

   public Double parse(StringReader var1) throws CommandSyntaxException {
      try {
         return Double.parseDouble(var1.readString());
      } catch (NumberFormatException numberformatexception) {
         throw new CommandSyntaxException(
            null,
            () -> "\u041d\u0435 \u0442\u0435 \u0446\u0438\u0444\u0435\u0440\u043a\u0438 \u043f\u0438\u0448\u0435\u0448\u044c \u0440\u043e\u0434\u043d\u043e\u0439"
         );
      }
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return CommandSource.suggestMatching(EXAMPLES, var2);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
