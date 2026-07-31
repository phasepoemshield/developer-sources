package zenith.zov.base.comand.impl.args;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import zenith.ZenithClient;

public class FriendArgumentType implements ArgumentType<String> {
   private static final List<String> EXAMPLES = List.of();

   public static FriendArgumentType create() {
      return new FriendArgumentType();
   }

   public String parse(StringReader stringreader) throws CommandSyntaxException {
      String s = stringreader.readString();
      if (!ZenithClient.getInstance().StringHolder_26().StringHolder_15(s)) {
         throw new DynamicCommandExceptionType(object -> Text.literal("У тебя нет друга " + s)).create(s);
      } else {
         return s;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(ZenithClient.getInstance().StringHolder_26().getItems(), suggestionsbuilder);
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
