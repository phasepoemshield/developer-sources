package zenith.zov.base.comand.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.command.CommandSource;
import zenith.ZenithClient;
import zenith.TextHolder;
import zenith.StringHolder$Helper_3;
import zenith.zov.base.comand.api.CommandAbstract;
import zenith.zov.base.comand.impl.args.NeuroArgumentType;

public class NeuroCommand extends CommandAbstract {
   public static final File neuroDirectory = new File(ZenithClient.AhHelper, "neuro");

   public NeuroCommand() {
      super("neuro");
      ensureNeuroDirectory();
   }

   @Override
   public void execute(LiteralArgumentBuilder<CommandSource> literalargumentbuilder) {
      literalargumentbuilder.then(
         literal("load")
            .then(
               arg("name", NeuroArgumentType.create())
                  .executes(
                     commandcontext -> {
                        String s = (String)commandcontext.getArgument("name", String.class);
                        File file1 = findNeuroFile(s);
                        if (file1 == null) {
                           TextHolder.StringHolder_8(
                              StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Файл нейромодели не найден"
                           );
                           return 1;
                        } else {
                           try {
                              ZenithClient.getInstance().floatHolder_7().EventTarget(file1);
                              TextHolder.StringHolder_8(
                                 StringHolder$Helper_3.IIlIllllI1lIlll11l, "Нейромодель загружена: " + file1.getName()
                              );
                           } catch (IOException ioexception) {
                              TextHolder.StringHolder_8(
                                 StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при загрузке нейромодели"
                              );
                           }

                           return 1;
                        }
                     }
                  )
            )
      );
      literalargumentbuilder.then(
         literal("dir")
            .executes(
               commandcontext -> {
                  if (!ensureNeuroDirectory()) {
                     TextHolder.StringHolder_8(
                        StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при создании папки нейромоделей"
                     );
                     return 1;
                  } else {
                     try {
                        Runtime.getRuntime().exec(new String[]{"explorer", neuroDirectory.getAbsolutePath()});
                     } catch (IOException ioexception) {
                        TextHolder.StringHolder_8(
                           StringHolder$Helper_3.II11I1I1II1Ill1ll1l11lI1, "Ошибка при открытии папки нейромоделей"
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
         ArrayList arraylist = new ArrayList();
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

   private static boolean ensureNeuroDirectory() {
      return neuroDirectory.isDirectory() || !neuroDirectory.exists() && neuroDirectory.mkdirs();
   }

   private static File findNeuroFile(String s) {
      if (s != null && !s.isBlank()) {
         try {
            File file1 = neuroDirectory.getCanonicalFile();
            File file2 = new File(file1, s).getCanonicalFile();
            return file2.toPath().startsWith(file1.toPath()) && file2.isFile() ? file2 : null;
         } catch (IOException ioexception) {
            return null;
         }
      } else {
         return null;
      }
   }
}
