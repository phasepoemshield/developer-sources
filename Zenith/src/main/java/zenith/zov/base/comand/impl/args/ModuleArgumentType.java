package zenith.zov.base.comand.impl.args;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import zenith.ZenithClient;
import zenith.Module;

public class ModuleArgumentType implements ArgumentType<Module> {
   private static final Collection<String> EXAMPLES = ZenithClient.getInstance()
      .getModuleManager()
      .getModules()
      .stream()
      .map(Module::getName)
      .limit(5L)
      .toList();

   public static ModuleArgumentType create() {
      return new ModuleArgumentType();
   }

   public Module parse(StringReader stringreader) throws CommandSyntaxException {
      Module ll111il1lliill11 = ZenithClient.getInstance()
         .getModuleManager()
         .GetSlotIdHandler_2(stringreader.readString());
      if (ll111il1lliill11 == null) {
         throw new DynamicCommandExceptionType(object -> Text.literal(object.toString() + " не существует.")).create(stringreader.readString());
      } else {
         return ll111il1lliill11;
      }
   }

   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> commandcontext, SuggestionsBuilder suggestionsbuilder) {
      return CommandSource.suggestMatching(
         ZenithClient.getInstance().getModuleManager().getModules().stream().map(Module::getName),
         suggestionsbuilder
      );
   }

   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
