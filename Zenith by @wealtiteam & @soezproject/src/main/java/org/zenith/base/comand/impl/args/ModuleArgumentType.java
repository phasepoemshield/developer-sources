package org.zenith.base.comand.impl.args;

import org.zenith.core.ColorAnimator;
import org.zenith.core.PacketDispatcher;
import org.zenith.event.Event18Ext2;

import org.zenith.module.Module;
import org.zenith.ZenithClient;
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
import java.util.Collection;
import java.util.concurrent.CompletableFuture;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;

public class ModuleArgumentType implements ArgumentType<Module> {
   public static final Collection<String> EXAMPLES = ZenithClient.on23()
      .ColorAnimator()
      .PacketDispatcher()
      .stream()
      .map(Module::getName)
      .limit(5L)
      .toList();

   public ModuleArgumentType() {
   }

   public static ModuleArgumentType create() {
      return new ModuleArgumentType();
   }

   public Module parse(StringReader var1) throws CommandSyntaxException {
      Module lii1lll1l1li1ii1iiillii = ZenithClient.on23().ColorAnimator().Event18Ext2(var1.readString());
      if (lii1lll1l1li1ii1iiillii == null) {
         throw new DynamicCommandExceptionType(
               var0 -> Text.literal(var0.toString() + " \u043d\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442.")
            )
            .create(var1.readString());
      } else {
         return lii1lll1l1li1ii1iiillii;
      }
   }

   @Override
   public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> var1, SuggestionsBuilder var2) {
      return CommandSource.suggestMatching(
         ZenithClient.on23().ColorAnimator().PacketDispatcher().stream().map(Module::getName), var2
      );
   }

   @Override
   public Collection<String> getExamples() {
      return EXAMPLES;
   }
}
