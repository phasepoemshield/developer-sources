package org.zenith.base.comand.impl.args;

import org.zenith.core.ServerTheme;

import org.zenith.util.ScoreboardUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;













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

public class MacroArgumentType implements ArgumentType<String> {
   public static final Collection<String> EXAMPLES = List.of("b");

   public MacroArgumentType() {
   }

   public static MacroArgumentType create() {
      return new MacroArgumentType();
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      if (ScoreboardUtils.ServerTheme(s) == -1) {
         throw new DynamicCommandExceptionType(
               var1x -> Text.literal("\u041d\u0435\u0442 \u0442\u0430\u043a\u043e\u0439 \u043a\u043b\u0430\u0432\u0438\u0448\u0438 " + s)
            )
            .create(s);
      } else {
         return s;
      }
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return CommandSource.suggestMatching(Arrays.stream(ScoreboardUtils.values()).map(var0 -> var0.string113), var2);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
