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
import net.minecraft.client.network.PlayerListEntry;
import zenith.ZenithInternal076;

public class PlayerArgumentType implements ArgumentType<String>, ZenithInternal076 {
   private static final Collection<String> EXAMPLES = List.of("Steve", "Alex", "developer");

   public static PlayerArgumentType create() {
      return new PlayerArgumentType();
   }

   public String parse(StringReader stringreader) throws CommandSyntaxException {
      return stringreader.readUnquotedString();
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(
         l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getPlayerList().stream().map(PlayerListEntry -> PlayerListEntry.getProfile().getName()), suggestionsbuilder
      );
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
