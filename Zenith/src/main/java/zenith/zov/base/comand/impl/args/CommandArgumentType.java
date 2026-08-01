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

public class CommandArgumentType implements ArgumentType<String> {
   private static final Collection<String> EXAMPLES = List.of("/home", "/events", "/pvp", "/call 1WantToFreak");

   public static CommandArgumentType create() {
      return new CommandArgumentType();
   }

   public String parse(StringReader stringreader) throws CommandSyntaxException {
      StringBuilder stringbuilder = new StringBuilder();

      while (stringreader.canRead()) {
         stringbuilder.append(stringreader.read());
      }

      return stringbuilder.toString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(EXAMPLES, suggestionsbuilder);
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
