package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import zenith.ZenithClient;
import zenith.zov.base.comand.api.CommandAbstract;

public class RegionCommand extends CommandAbstract {
   private final SuggestionProvider<CommandSource> SUGGEST_X = (commandcontext, suggestionsbuilder) -> {
      ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
      if (ClientPlayerEntity != null) {
         BlockPos BlockPos = ClientPlayerEntity.getBlockPos();
         suggestionsbuilder.suggest(BlockPos.getX());
      }

      return suggestionsbuilder.buildFuture();
   };
   private final SuggestionProvider<CommandSource> SUGGEST_Y = (commandcontext, suggestionsbuilder) -> {
      ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
      if (ClientPlayerEntity != null) {
         BlockPos BlockPos = ClientPlayerEntity.getBlockPos();
         suggestionsbuilder.suggest(BlockPos.getY());
      }

      return suggestionsbuilder.buildFuture();
   };
   private final SuggestionProvider<CommandSource> SUGGEST_Z = (commandcontext, suggestionsbuilder) -> {
      ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
      if (ClientPlayerEntity != null) {
         BlockPos BlockPos = ClientPlayerEntity.getBlockPos();
         suggestionsbuilder.suggest(BlockPos.getZ());
      }

      return suggestionsbuilder.buildFuture();
   };

   public RegionCommand() {
      super("region");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         literal("pos1")
            .then(
               arg("x", IntegerArgumentType.integer())
                  .suggests(this.SUGGEST_X)
                  .then(
                     arg("y", IntegerArgumentType.integer())
                        .suggests(this.SUGGEST_Y)
                        .then(arg("z", IntegerArgumentType.integer()).suggests(this.SUGGEST_Z).executes(commandcontext -> {
                           int i = IntegerArgumentType.getInteger(commandcontext, "x");
                           int j = IntegerArgumentType.getInteger(commandcontext, "y");
                           int k = IntegerArgumentType.getInteger(commandcontext, "z");
                           ZenithClient.getInstance().ZenithInternal138().StringHolder_8(new BlockPos(i, j, k));
                           return 1;
                        }))
                  )
            )
      );
      literalargumentbuilder.then(
         literal("pos2")
            .then(
               arg("x", IntegerArgumentType.integer())
                  .suggests(this.SUGGEST_X)
                  .then(
                     arg("y", IntegerArgumentType.integer())
                        .suggests(this.SUGGEST_Y)
                        .then(arg("z", IntegerArgumentType.integer()).suggests(this.SUGGEST_Z).executes(commandcontext -> {
                           int i = IntegerArgumentType.getInteger(commandcontext, "x");
                           int j = IntegerArgumentType.getInteger(commandcontext, "y");
                           int k = IntegerArgumentType.getInteger(commandcontext, "z");
                           ZenithClient.getInstance().ZenithInternal138().EventBus(new BlockPos(i, j, k));
                           return 1;
                        }))
                  )
            )
      );
      literalargumentbuilder.then(literal("clear").executes(commandcontext -> {
         ZenithClient.getInstance().ZenithInternal138().clear();
         return 1;
      }));
   }
}
