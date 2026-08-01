package zenith.zov.base.comand.impl;

import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import net.minecraft.command.CommandSource;
import net.minecraft.util.math.BlockPos;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.WayArgumentType;
import zenith.zov.base.filemanager.impl.way.PathNodeMaker1;

public class WayCommand extends CommandAbstract {
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

   public WayCommand() {
      super("way");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         literal("add")
            .then(
               arg("name", StringArgumentType.word())
                  .then(
                     arg("x", IntegerArgumentType.integer())
                        .suggests(this.SUGGEST_X)
                        .then(
                           arg("y", IntegerArgumentType.integer())
                              .suggests(this.SUGGEST_Y)
                              .then(arg("z", IntegerArgumentType.integer()).suggests(this.SUGGEST_Z).executes(commandcontext -> {
                                 String s = (String)commandcontext.getArgument("name", String.class);
                                 int i = IntegerArgumentType.getInteger(commandcontext, "x");
                                 int j = IntegerArgumentType.getInteger(commandcontext, "y");
                                 int k = IntegerArgumentType.getInteger(commandcontext, "z");
                                 this.handleAddWay(s, i, j, k);
                                 return 1;
                              }))
                        )
                  )
            )
      );
      literalargumentbuilder.then(literal("event").executes(commandcontext -> {
         ZenithClient.getInstance().ZenithInternal059().startEventCapture();
         TextHolder.EventImpl_27("Ожидание координат из следующих 2 сообщений чата");
         l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendCommand("event");
         return 1;
      }));
      literalargumentbuilder.then(literal("clear").executes(commandcontext -> {
         ZenithClient.getInstance().ZenithInternal059().clearList();
         return 1;
      }));
      literalargumentbuilder.then(literal("remove").then(arg("name", WayArgumentType.create()).executes(commandcontext -> {
         String s = (String)commandcontext.getArgument("name", String.class);
         ZenithClient.getInstance().ZenithInternal059().deleteWay(s);
         TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, s + " удален ");
         return 1;
      })));
      literalargumentbuilder.then(literal("list").executes(commandcontext -> {
         if (!ZenithClient.getInstance().ZenithInternal059().getItems().isEmpty()) {
            for (PathNodeMaker1 PathNodeMaker1 : ZenithClient.getInstance().ZenithInternal059().getItems()) {
               l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(PathNodeMaker1.toText(), false);
            }
         } else {
            TextHolder.EventImpl_27("Список пуст!");
         }

         return 1;
      }));
   }

   private void handleAddWay(String s, int i, int j, int k) {
      PathNodeMaker1 PathNodeMaker1x = ZenithClient.getInstance().ZenithInternal059().getWay(s);
      if (PathNodeMaker1x != null) {
         TextHolder.StringHolder_26("Метка с таким именем уже есть в списке!");
         TextHolder.EventImpl_27("Наведи мышку на сообщение ниже чтобы удалить ее");
         l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(PathNodeMaker1x.toText(), false);
      } else {
         String s1 = l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getServerInfo() != null
            ? l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().getServerInfo().address
            : "VANILLA";
         PathNodeMaker1 PathNodeMaker1x = new PathNodeMaker1(s, new BlockPos(i, j, k), s1);
         l11I1I1ll1Illll1I1l1111l1II.player.sendMessage(PathNodeMaker1x.toText(), false);
         ZenithClient.getInstance().ZenithInternal059().addWay(PathNodeMaker1x);
      }
   }
}
