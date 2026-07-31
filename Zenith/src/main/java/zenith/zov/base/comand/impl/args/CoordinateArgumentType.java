package zenith.zov.base.comand.impl.args;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;

public class CoordinateArgumentType implements ArgumentType<Double> {
   private static final Collection<String> EXAMPLES = List.of("-1", "10.5", "-5.2", "100");

   public static CoordinateArgumentType create() {
      return new CoordinateArgumentType();
   }

   public Double parse(StringReader stringreader) throws CommandSyntaxException {
      try {
         return Double.parseDouble(stringreader.readString());
      } catch (NumberFormatException numberformatexception) {
         throw new CommandSyntaxException(null, () -> "Не те циферки пишешь родной");
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(EXAMPLES, suggestionsbuilder);
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
