package zenith.zov.base.comand.impl.args;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import zenith.StringHolder_3;

public class MacroArgumentType implements ArgumentType<String> {
   private static final Collection<String> EXAMPLES = List.of("b");

   public static MacroArgumentType create() {
      return new MacroArgumentType();
   }

   public String parse(StringReader stringreader) throws CommandSyntaxException {
      String s = stringreader.readString();
      if (StringHolder_3.ZenithInternal115(s) == -1) {
         throw new DynamicCommandExceptionType(object -> Text.literal("Нет такой клавиши " + s)).create(s);
      } else {
         return s;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(
         Arrays.stream(StringHolder_3.values()).map(i11liiii1i11l11l11il -> i11liiii1i11l11l11il.lI1lIll1ll111lI), suggestionsbuilder
      );
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
