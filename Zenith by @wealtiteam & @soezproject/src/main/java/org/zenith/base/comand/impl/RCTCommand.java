package org.zenith.base.comand.impl;

import org.zenith.core.UiAnimation;
import org.zenith.core.SpinMarker;
import org.zenith.util.TextUtils;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.managers.CloudApi;
import org.zenith.ZenithClient;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.HolyWorldClient;















import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.CommandSource;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

public class RCTCommand extends CommandAbstract {
   public RCTCommand() {
      super("rct");
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.executes(
         var1x -> {
            HolyWorldClient l1llilll1iiiill11l1l11lii = this.repository();
            if (!l1llilll1iiiill11l1l11lii.isHolyWorldHere()) {
               CloudApi.TextUtils()
                  .on23(
                     "0",
                     Text.literal(
                        " \u041d\u0435 \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 \u044d\u0442\u043e\u043c "
                           + Formatting.RED
                           + "\u0441\u0435\u0440\u0432\u0435\u0440\u0435"
                     )
                  );
               return 1;
            } else if (l1llilll1iiiill11l1l11lii.SpinMarker()) {
               CloudApi.TextUtils()
                  .on23(
                     "\ufe0f0",
                     Text.literal(
                        " \u0412\u044b \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432 \u0440\u0435\u0436\u0438\u043c\u0435 "
                           + Formatting.RED
                           + "\u043f\u0432\u043f"
                     )
                  );
               return 1;
            } else {
               l1llilll1iiiill11l1l11lii.reconnect(l1llilll1iiiill11l1l11lii.currentAnarchyHere());
               return 1;
            }
         }
      );
      var1.then(
         CommandAbstract.arg("anarchy", IntegerArgumentType.integer(1, 69))
            .executes(
               var1x -> {
                  HolyWorldClient l1llilll1iiiill11l1l11lii = this.repository();
                  if (!l1llilll1iiiill11l1l11lii.isHolyWorldHere()) {
                     CloudApi.TextUtils()
                        .on23(
                           "0",
                           Text.literal(
                              " \u041d\u0435 \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 \u044d\u0442\u043e\u043c "
                                 + Formatting.RED
                                 + "\u0441\u0435\u0440\u0432\u0435\u0440\u0435"
                           )
                        );
                     return 1;
                  } else if (l1llilll1iiiill11l1l11lii.SpinMarker()) {
                     CloudApi.TextUtils()
                        .on23(
                           "0",
                           Text.literal(
                              " \u0412\u044b \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0435\u0441\u044c \u0432 \u0440\u0435\u0436\u0438\u043c\u0435 "
                                 + Formatting.RED
                                 + "\u043f\u0432\u043f"
                           )
                        );
                     return 1;
                  } else {
                     int i = var1x.getArgument("anarchy", Integer.class);
                     l1llilll1iiiill11l1l11lii.reconnect(i);
                     return 1;
                  }
               }
            )
      );
   }

   public HolyWorldClient repository() {
      return ZenithClient.on23().UiAnimation();
   }
}
