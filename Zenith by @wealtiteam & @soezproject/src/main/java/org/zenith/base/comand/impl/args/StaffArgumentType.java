package org.zenith.base.comand.impl.args;

import org.zenith.core.CloudUserProfile;
import org.zenith.event.EventGetBasicProjectionMatrixHook2;

import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;














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

public class StaffArgumentType implements ArgumentType<String> {
   public static final List<String> EXAMPLES = java.util.List.of();

   public StaffArgumentType() {
   }

   public static StaffArgumentType create() {
      return new StaffArgumentType();
   }

   public String parse(StringReader var1) throws CommandSyntaxException {
      String s = var1.readString();
      if (!ZenithClient.on23().CloudUserProfile().EventGetBasicProjectionMatrixHook2(s)) {
         throw new DynamicCommandExceptionType(var1x -> Text.literal("\u041d\u0435\u0442\u0443 \u0432 \u0441\u0442\u0430\u0444\u0435 " + s)).create(s);
      } else {
         return s;
      }
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return CommandSource.suggestMatching(ZenithClient.on23().CloudUserProfile().getItems(), var2);
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
