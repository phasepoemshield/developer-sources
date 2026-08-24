package org.zenith.base.comand.impl;

import org.zenith.core.CloudUserProfile;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.PlayerArgumentType;
import org.zenith.base.comand.impl.args.StaffArgumentType;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;

public class StaffCommand extends CommandAbstract {
   public StaffCommand() {
      super("staff");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("add")
            .then(
               arg("player", PlayerArgumentType.create())
                  .executes(
                     var0 -> {
                        String s = var0.getArgument("player", String.class);
                        if (ZenithClient.on23().CloudUserProfile().getItems().contains(s)) {
                           StyledTextBuilder.on23(
                              TextAccent.call013, "\u0423\u0436\u0435 \u0434\u043e\u0431\u0430\u0432\u043b\u0435\u043d " + s
                           );
                           return 1;
                        } else {
                           ZenithClient.on23().CloudUserProfile().add(s);
                           StyledTextBuilder.on23(
                              TextAccent.call002, "\u0414\u043e\u0431\u0430\u0432\u0438\u043b\u0438 " + s
                           );
                           return 1;
                        }
                     }
                  )
            )
      );
      var1.then(
         literal("remove")
            .then(
               arg("player", StaffArgumentType.create())
                  .executes(
                     var0 -> {
                        String s = var0.getArgument("player", String.class);
                        ZenithClient.on23().CloudUserProfile().remove(s);
                        StyledTextBuilder.on23(
                           TextAccent.call002,
                           s + " \u0443\u0434\u0430\u043b\u0435\u043d \u0438\u0437 \u0441\u0442\u0430\u0444\u0444\u0430"
                        );
                        return 1;
                     }
                  )
            )
      );
      var1.then(
         literal("list")
            .executes(
               var0 -> {
                  StyledTextBuilder.on23(
                     TextAccent.call002,
                     ZenithClient.on23().CloudUserProfile().getItems().toString()
                  );
                  return 1;
               }
            )
      );
   }
}
