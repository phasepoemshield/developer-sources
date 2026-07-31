package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.CoordinateArgumentType;

public class ClipCommand extends CommandAbstract {
   public ClipCommand() {
      super("clip");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         literal("vclip")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           ClientPlayerEntity.setPosition(ClientPlayerEntity.getX(), ClientPlayerEntity.getY() + d0 + 0.1, ClientPlayerEntity.getZ());
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aВертикальный вклип на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("hclip")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           double d1 = Math.toRadians((double)ClientPlayerEntity.getYaw());
                           ClientPlayerEntity.setPosition(
                              ClientPlayerEntity.getX() - Math.sin(d1) * d0, ClientPlayerEntity.getY() + 0.1, ClientPlayerEntity.getZ() + Math.cos(d1) * d0
                           );
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aГоризонтальный вклип на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("up")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           ClientPlayerEntity.setPosition(ClientPlayerEntity.getX(), ClientPlayerEntity.getY() + d0 + 0.1, ClientPlayerEntity.getZ());
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aВклип вверх на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("down")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           ClientPlayerEntity.setPosition(ClientPlayerEntity.getX(), ClientPlayerEntity.getY() - d0 + 0.1, ClientPlayerEntity.getZ());
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aВклип вниз на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("forward")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           double d1 = Math.toRadians((double)ClientPlayerEntity.getYaw());
                           ClientPlayerEntity.setPosition(
                              ClientPlayerEntity.getX() - Math.sin(d1) * d0, ClientPlayerEntity.getY() + 0.1, ClientPlayerEntity.getZ() + Math.cos(d1) * d0
                           );
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aВклип вперед на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("back")
            .then(
               arg("distance", CoordinateArgumentType.create())
                  .executes(
                     commandcontext -> {
                        double d0 = (Double)commandcontext.getArgument("distance", Double.class);
                        ClientPlayerEntity ClientPlayerEntity = MinecraftClient.getInstance().player;
                        if (ClientPlayerEntity != null) {
                           double d1 = Math.toRadians((double)ClientPlayerEntity.getYaw());
                           ClientPlayerEntity.setPosition(
                              ClientPlayerEntity.getX() + Math.sin(d1) * d0, ClientPlayerEntity.getY() + 0.1, ClientPlayerEntity.getZ() - Math.cos(d1) * d0
                           );
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.IIlIllllI1lIlll11l, "§aВклип назад на " + d0 + " блоков"
                           );
                        }

                        return 1;
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("help")
            .executes(
               commandcontext -> {
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l,
                     "§6Использование: §r.clip <vclip/hclip/up/down/forward/back/help> [расстояние]"
                  );
                  TextHolder.StringHolder_8(StringHolder$Helper_3.IIlIllllI1lIlll11l, "§6Примеры:§r");
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "§e.clip vclip 10 §7- вклип вверх на 10 блоков"
                  );
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "§e.clip hclip 5 §7- горизонтальный вклип на 5 блоков"
                  );
                  TextHolder.StringHolder_8(
                     StringHolder$Helper_3.IIlIllllI1lIlll11l, "§e.clip up 3 §7- вклип вверх на 3 блока"
                  );
                  return 1;
               }
            )
      );
   }
}
