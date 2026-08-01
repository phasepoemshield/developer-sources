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
import zenith.ZenithClient;

public class CfgArgumentType implements ArgumentType<String> {
   private static final Collection<String> EXAMPLES = List.of("current_config");

   public static CfgArgumentType create() {
      return new CfgArgumentType();
   }

   public String parse(StringReader stringreader) throws CommandSyntaxException {
      return stringreader.readString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(
         ZenithClient.getInstance().ZenithInternal115().StringHolder_29(), suggestionsbuilder
      );
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
