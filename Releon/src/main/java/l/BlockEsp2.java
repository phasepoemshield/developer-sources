package l;

import fat.releon.Releon;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class BlockEsp2 extends Helper214 {
   public BlockEsp2() {
      super("blockesp");
   }

   @Override
   public void method262(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         this.method2950();
      } else {
         BlockEspHelper var3 = (BlockEspHelper)Releon.method71()
            .method17()
            .method2314()
            .stream()
            .filter(var0 -> var0 instanceof BlockEspHelper)
            .findFirst()
            .orElse(null);
         if (var3 == null) {
            Helper238.method2186("Модуль Block ESP не найден");
         } else {
            String var4 = var2.method1723().toLowerCase();
            switch (var4) {
               case "add":
                  if (var2.method1690()) {
                     String var10 = var2.method1723();
                     Block var11 = Registries.BLOCK.get(Identifier.tryParse(var10));
                     if (var11 != null && var11 != Blocks.AIR) {
                        String var12 = Registries.BLOCK.getId(var11).toString();
                        if (var3.getBlocksToHighlight().add(var12)) {
                           Helper238.method2186("Добавлен блок " + var12);
                        } else {
                           Helper238.method2186("Блок " + var12 + " уже есть в Block ESP");
                        }
                     } else {
                        Helper238.method2186("Блок " + var10 + " не найден");
                     }
                  } else {
                     Helper238.method2186("Укажите блок для добавления: .blockesp add <block>");
                  }
                  break;
               case "remove":
                  if (var2.method1690()) {
                     String var7 = var2.method1723();
                     Block var8 = Registries.BLOCK.get(Identifier.tryParse(var7));
                     if (var8 != null && var8 != Blocks.AIR) {
                        String var9 = Registries.BLOCK.getId(var8).toString();
                        if (var3.getBlocksToHighlight().remove(var9)) {
                           Helper238.method2186("Удалён блок " + var9 + " из Block ESP");
                        } else {
                           Helper238.method2186("Блок " + var7 + " не найден в Block ESP");
                        }
                     } else {
                        Helper238.method2186("Блок " + var7 + " не найден");
                     }
                  } else {
                     Helper238.method2186("Укажите блок для удаления: .blockesp remove <block>");
                  }
                  break;
               case "clear":
                  var3.getBlocksToHighlight().clear();
                  Helper238.method2186("Список Block ESP очищен");
                  break;
               case "list":
                  Helper238.method2186("Список всех блоков в Minecraft:");
                  Registries.BLOCK.getIds().stream().map(Identifier::toString).sorted().forEach(var0 -> Helper238.method2186("- " + var0));
                  break;
               default:
                  this.method2950();
            }
         }
      }
   }

   public void method2950() {
      Helper238.method2188("Пример использования команды .blockesp:");
      Helper238.method2186(".blockesp add <block> - Добавить блок в Block ESP (например: .blockesp add minecraft:diamond_ore)");
      Helper238.method2186(".blockesp remove <block> - Удалить блок из Block ESP (например: .blockesp remove minecraft:diamond_ore)");
      Helper238.method2186(".blockesp clear - Очистить список Block ESP");
      Helper238.method2186(".blockesp list - Показать все блоки в Minecraft");
   }

   @Override
   public Stream<String> method267(String var1, Helper219 var2) {
      if (!var2.method1690()) {
         return Stream.of("add", "remove", "clear", "list");
      } else if (var2.method1694()) {
         String var5 = var2.method1700().toLowerCase();
         return Stream.of("add", "remove", "clear", "list").filter(var1x -> var1x.startsWith(var5));
      } else {
         String var3 = var2.method1723().toLowerCase();
         if (("add".equals(var3) || "remove".equals(var3)) && var2.method1694()) {
            String var4 = var2.method1700().toLowerCase();
            return Registries.BLOCK.getIds().stream().map(Identifier::toString).filter(var1x -> var1x.toLowerCase().startsWith(var4));
         } else {
            return Stream.empty();
         }
      }
   }

   @Override
   public String method268() {
      return "Управляет функцией Block ESP.";
   }

   @Override
   public List<String> method269() {
      return Arrays.asList(
         "Управляет подсветкой блоков в модуле Block ESP.",
         "",
         "Использование:",
         ".blockesp add <block> - Добавить блок в список подсветки.",
         ".blockesp remove <block> - Удалить блок из списка подсветки.",
         ".blockesp clear - Очистить список подсвечиваемых блоков.",
         ".blockesp list - Показать все доступные блоки."
      );
   }
}
