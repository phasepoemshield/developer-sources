package org.zenith.base.comand.impl;

import org.zenith.core.ColorAnimator;
import org.zenith.core.Easing;
import org.zenith.core.ServiceException;

import org.zenith.base.comand.api.CommandAbstract;
import org.zenith.base.comand.impl.args.NeuroArgumentType;
import org.zenith.ZenithClient;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.StyledTextBuilder;
import org.zenith.core.TextAccent;














import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandSource;

public class NeuroCommand extends CommandAbstract {
   public static final File neuroDirectory = new File(ZenithClient.ColorAnimator, "neuro");

   public NeuroCommand() {
      super("neuro");
      ensureNeuroDirectory();
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> var1) {
      var1.then(
         literal("load")
            .then(
               arg("name", NeuroArgumentType.create())
                  .executes(
                     var0 -> {
                        String s = var0.getArgument("name", String.class);
                        File file1 = findNeuroFile(s);
                        if (file1 == null) {
                           StyledTextBuilder.on23(
                              TextAccent.call013,
                              "\u0424\u0430\u0439\u043b \u043d\u0435\u0439\u0440\u043e\u043c\u043e\u0434\u0435\u043b\u0438 \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d"
                           );
                           return 1;
                        } else {
                           try {
                              ZenithClient.on23().ServiceException().Easing(file1);
                              StyledTextBuilder.on23(
                                 TextAccent.call002,
                                 "\u041d\u0435\u0439\u0440\u043e\u043c\u043e\u0434\u0435\u043b\u044c \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u0430: "
                                    + file1.getName()
                              );
                           } catch (IOException ioexception) {
                              StyledTextBuilder.on23(
                                 TextAccent.call013,
                                 "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0437\u0430\u0433\u0440\u0443\u0437\u043a\u0435 \u043d\u0435\u0439\u0440\u043e\u043c\u043e\u0434\u0435\u043b\u0438"
                              );
                           }

                           return 1;
                        }
                     }
                  )
            )
      );
      var1.then(
         literal("dir")
            .executes(
               var0 -> {
                  if (!ensureNeuroDirectory()) {
                     StyledTextBuilder.on23(
                        TextAccent.call013,
                        "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u0441\u043e\u0437\u0434\u0430\u043d\u0438\u0438 \u043f\u0430\u043f\u043a\u0438 \u043d\u0435\u0439\u0440\u043e\u043c\u043e\u0434\u0435\u043b\u0435\u0439"
                     );
                     return 1;
                  } else {
                     try {
                        Runtime.getRuntime().exec(new String[]{"explorer", neuroDirectory.getAbsolutePath()});
                     } catch (IOException ioexception) {
                        StyledTextBuilder.on23(
                           TextAccent.call013,
                           "\u041e\u0448\u0438\u0431\u043a\u0430 \u043f\u0440\u0438 \u043e\u0442\u043a\u0440\u044b\u0442\u0438\u0438 \u043f\u0430\u043f\u043a\u0438 \u043d\u0435\u0439\u0440\u043e\u043c\u043e\u0434\u0435\u043b\u0435\u0439"
                        );
                     }

                     return 1;
                  }
               }
            )
      );
   }

   public static List<String> neuroNames() {
      if (!ensureNeuroDirectory()) {
         return new ArrayList<>();
      } else {
         File[] afile = neuroDirectory.listFiles();
         List<String> arraylist = new ArrayList<>();
         if (afile != null) {
            for (File file1 : afile) {
               if (file1.isFile()) {
                  arraylist.add(file1.getName());
               }
            }
         }

         arraylist.sort(String.CASE_INSENSITIVE_ORDER);
         return arraylist;
      }
   }

   public static boolean ensureNeuroDirectory() {
      return neuroDirectory.isDirectory() || !neuroDirectory.exists() && neuroDirectory.mkdirs();
   }

   public static File findNeuroFile(String var0) {
      if (var0 != null && !var0.isBlank()) {
         try {
            File file1 = neuroDirectory.getCanonicalFile();
            File file2 = new File(file1, var0).getCanonicalFile();
            return file2.toPath().startsWith(file1.toPath()) && file2.isFile() ? file2 : null;
         } catch (IOException ioexception) {
            return null;
         }
      } else {
         return null;
      }
   }
}
