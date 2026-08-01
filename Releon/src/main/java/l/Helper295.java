package l;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class Helper295 {
   public Helper295() {
   }

   public static List<Helper465> method2886() {
      ArrayList var0 = new ArrayList();
      List var1 = List.of(Text.literal("Испей сок Флеша,"), Text.literal("дабы получить его"), Text.literal("силу и скорость"));
      var0.add(
         new Helper294(
            "[★] Моча Флеша",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Моча Флеша"),
            new PotionContentsComponent(Optional.empty(), Optional.of(6092799), List.of(), Optional.empty()),
            var1
         )
      );
      List var2 = List.of(Text.literal("Эликсир от Медика"), Text.literal("помогает выстоять"), Text.literal("даже в смертельном бою"));
      var0.add(
         new Helper294(
            "[★] Зелье Медика",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Зелье Медика"),
            new PotionContentsComponent(Optional.empty(), Optional.of(16711902), List.of(), Optional.empty()),
            var2
         )
      );
      List var3 = List.of(Text.literal("Ловкость и скрытость"), Text.literal("тайных Агентов"), Text.literal("таятся в этом напитке"));
      var0.add(
         new Helper294(
            "[★] Зелье Агента",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Зелье Агента"),
            new PotionContentsComponent(Optional.empty(), Optional.of(16775936), List.of(), Optional.empty()),
            var3
         )
      );
      List var4 = List.of(Text.literal("Храбрая душа Победителя"), Text.literal("и немного магии"), Text.literal("образовали это зелье"));
      var0.add(
         new Helper294(
            "[★] Зелье Победителя",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Зелье Победителя"),
            new PotionContentsComponent(Optional.empty(), Optional.of(65280), List.of(), Optional.empty()),
            var4
         )
      );
      List var5 = List.of(Text.literal("Осторожно! Зелье Киллера"), Text.literal("вызывает кровожадность"), Text.literal("и повышает выносливость!"));
      var0.add(
         new Helper294(
            "[★] Зелье Киллера",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Зелье Киллера"),
            new PotionContentsComponent(Optional.empty(), Optional.of(16711680), List.of(), Optional.empty()),
            var5
         )
      );
      List var6 = List.of(Text.literal("Опасная жидкость в сосуде"), Text.literal("содержит Отрыжку василиска"), Text.literal("и других мерзких тварей"));
      var0.add(
         new Helper294(
            "[★] Зелье Отрыжки",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Зелье Отрыжки"),
            new PotionContentsComponent(Optional.empty(), Optional.of(16735488), List.of(), Optional.empty()),
            var6
         )
      );
      List var7 = List.of(Text.literal("Куча авантюристов положили"), Text.literal("свои жизни в попытках"), Text.literal("собрать эту Кислоту"));
      var0.add(
         new Helper294(
            "[★] Серная кислота",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Серная кислота"),
            new PotionContentsComponent(Optional.empty(), Optional.of(49664), List.of(), Optional.empty()),
            var7
         )
      );
      List var8 = List.of(Text.literal("Всего одна бутылочка"), Text.literal("Вспышки способна ослепить"), Text.literal("целую орду врагов!"));
      var0.add(
         new Helper294(
            "[★] Вспышка",
            null,
            Items.SPLASH_POTION,
            Helper452.method4834("Вспышка"),
            new PotionContentsComponent(Optional.empty(), Optional.of(16777215), List.of(), Optional.empty()),
            var8
         )
      );
      return var0;
   }
}
