package l;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.item.Items;
import net.minecraft.text.Text;

public class Helper454 {
   public Helper454() {
   }

   public static List<Helper465> method4839() {
      ArrayList var0 = new ArrayList();
      List var1 = List.of(
         Text.literal("Каст: Световая вспышка"),
         Text.literal("Радиус: 10 блоков"),
         Text.literal("Эффекты для противников:"),
         Text.literal(" • Свечение (00:30)"),
         Text.literal(" • Слепота (00:01)"),
         Text.literal("Чем ближе цель, тем дольше длительность эффектов")
      );
      var0.add(new Helper294("[★] Явная пыль", null, Items.SUGAR, Helper452.method4834("Явная пыль"), null, var1));
      List var2 = List.of(Text.literal("Чем ближе цель, тем дольше длительность эффектов"));
      var0.add(new Helper294("[★] Дезориентация", null, Items.ENDER_EYE, Helper452.method4834("Дезориентация"), null, var2));
      List var3 = List.of(Text.literal("Каст: Нерушимая клетка"), Text.literal("Длительность: 15 секунд"), Text.literal("Используйте скины: /tskins"));
      var0.add(new Helper294("[★] Трапка", null, Items.NETHERITE_SCRAP, Helper452.method4834("Трапка"), null, var3));
      List var4 = List.of(Text.literal("Этой отмычкой можно"), Text.literal("Открыть хранилище"), Text.literal("С Сферами"));
      var0.add(new Helper294("Отмычка к Сферам", null, Items.TRIPWIRE_HOOK, Helper452.method4834("Отмычка к Сферам"), null, var4));
      List var5 = List.of(
         Text.literal("Каст: Нерушимая стена"),
         Text.literal("Длительность:"),
         Text.literal("Вертикальный: 20 секунд"),
         Text.literal("Горизонтальный: 60 секунд")
      );
      var0.add(new Helper294("[★] Пласт", null, Items.DRIED_KELP, Helper452.method4834("Пласт"), null, var5));
      List var6 = List.of(Text.literal("Содержит 15 ур опыта"));
      var0.add(new Helper294("Пузырек опыта [15 ур]", null, Items.EXPERIENCE_BOTTLE, Helper452.method4834("Пузырек опыта [15 ур]"), null, var6));
      List var7 = List.of(Text.literal("Содержит: 30 Ур. опыта"));
      var0.add(new Helper294("Пузырёк опыта [30 Ур.]", null, Items.EXPERIENCE_BOTTLE, Helper452.method4834("Пузырёк опыта [30 Ур.]"), null, var7));
      List var8 = List.of(Text.literal("Содержит 50 ур опыта"));
      var0.add(new Helper294("Пузырек опыта [50 ур]", null, Items.EXPERIENCE_BOTTLE, Helper452.method4834("Пузырек опыта [50 ур]"), null, var8));
      List var9 = List.of(Text.literal("Этот динамит взрывается"), Text.literal("в 10 раз сильнее обычного"));
      var0.add(new Helper294("[★] TNT - TIER WHITE", null, Items.TNT, Helper452.method4834("TNT - TIER WHITE"), null, var9));
      List var10 = List.of(Text.literal("Этот динамит взрывается"), Text.literal("в 10 раз сильнее обычного"), Text.literal("и способен взорвать обсидиан"));
      var0.add(new Helper294("[★] TNT - TIER BLACK", null, Items.TNT, Helper452.method4834("TNT - TIER BLACK"), null, var10));
      List var11 = List.of(Text.literal("Уровень лута: Случайный"));
      var0.add(new Helper294("Сигнальный огонь [Случайный]", null, Items.CAMPFIRE, Helper452.method4834("Сигнальный огонь [Случайный]"), null, var11));
      List var12 = List.of(Text.literal("Уровень лута: Обычный"));
      var0.add(new Helper294("Сигнальный огонь [Обычный]", null, Items.CAMPFIRE, Helper452.method4834("Сигнальный огонь [Обычный]"), null, var12));
      List var13 = List.of(Text.literal("Уровень лута: Богатый"));
      var0.add(new Helper294("Сигнальный огонь [Богатый]", null, Items.CAMPFIRE, Helper452.method4834("Сигнальный огонь [Богатый]"), null, var13));
      List var14 = List.of(Text.literal("Уровень лута: Легендарный"));
      var0.add(new Helper294("Сигнальный огонь [Легендарный]", null, Items.CAMPFIRE, Helper452.method4834("Сигнальный огонь [Легендарный]"), null, var14));
      List var15 = List.of(Text.literal("● Каст: Нанесение урона"), Text.literal("● Радиус: 1,5 блока"));
      var0.add(new Helper294("[★] Блок дамагер", null, Items.JIGSAW, Helper452.method4834("Блок дамагер"), null, var15));
      List var16 = List.of(
         Text.literal("Прогружает чанк, в котором"),
         Text.literal("находится этот прогрузчик."),
         Text.literal("Нажмите на него, чтобы на"),
         Text.literal("30 секунд увидеть границы")
      );
      var0.add(new Helper294("Прогрузчик чанков [1x1]", null, Items.STRUCTURE_BLOCK, Helper452.method4834("Прогрузчик чанков [1x1]"), null, var16));
      List var17 = List.of(
         Text.literal("Прогружает чанк, в котором"),
         Text.literal("находится этот прогрузчик."),
         Text.literal("Нажмите на него, чтобы на"),
         Text.literal("30 секунд увидеть границы")
      );
      var0.add(new Helper294("Прогрузчик чанков [3x3]", null, Items.STRUCTURE_BLOCK, Helper452.method4834("Прогрузчик чанков [3x3]"), null, var17));
      List var18 = List.of(
         Text.literal("Прогружает чанк, в котором"),
         Text.literal("находится этот прогрузчик."),
         Text.literal("Нажмите на него, чтобы на"),
         Text.literal("30 секунд увидеть границы")
      );
      var0.add(new Helper294("Прогрузчик чанков [5x5]", null, Items.STRUCTURE_BLOCK, Helper452.method4834("Прогрузчик чанков [5x5]"), null, var18));
      List var19 = List.of(Text.literal("Маяк установит временный"), Text.literal("ивент, раздающий Монеты"), Text.literal("игрокам поблизости."));
      var0.add(new Helper294("Загадочный маяк", null, Items.BEACON, Helper452.method4834("Загадочный маяк"), null, var19));
      List var20 = List.of(Text.literal("Обменяй души на ценные"), Text.literal("ресурсы у Собирателя душ"), Text.literal("/warp soulcollector"));
      var0.add(new Helper294("[★] Проклятая душа", null, Items.SOUL_LANTERN, Helper452.method4834("Проклятая душа"), null, var20));
      List var21 = List.of(
         Text.literal("Используя этот предмет"),
         Text.literal("Вы его расходуете"),
         Text.literal("и получаете Драконий скин взамен"),
         Text.literal("[ПКМ] чтобы использовать x1 скин"),
         Text.literal("[SHIFT+ПКМ] чтобы использовать все скины"),
         Text.literal("Предмет нужно держать в руке")
      );
      var0.add(new Helper294("[★] Драконий скин", null, Items.PAPER, Helper452.method4834("Драконий скин"), null, var21));
      List var22 = List.of(
         Text.literal("● Каст: Огненная волна"),
         Text.literal("● Радиус: 10 блоков"),
         Text.literal(""),
         Text.literal("● Эффекты для противников:"),
         Text.literal(" - Поджог (00:03)"),
         Text.literal(""),
         Text.literal("Чем ближе цель, тем дольше"),
         Text.literal("длительность эффектов")
      );
      var0.add(new Helper294("[★] Огненный смерч", null, Items.FIRE_CHARGE, Helper452.method4834("Огненный смерч"), null, var22));
      List var23 = List.of(
         Text.literal("● Каст: Ледяная сфера"),
         Text.literal("● Радиус: 7 блоков"),
         Text.literal(""),
         Text.literal("● Эффекты для противников:"),
         Text.literal(" - Заморозка (00:01)"),
         Text.literal(" - Слабость (03:00)")
      );
      var0.add(new Helper294("[★] Снежок заморозка", null, Items.SNOWBALL, Helper452.method4834("Снежок заморозка"), null, var23));
      List var24 = List.of(
         Text.literal("● Каст: Божественная аура"),
         Text.literal("● Радиус: 2 блока"),
         Text.literal(""),
         Text.literal("● Эффекты для союзников:"),
         Text.literal(" - Снятие всех эффектов"),
         Text.literal(" - Невидимость (04:00)"),
         Text.literal(" - Сила II (03:00)"),
         Text.literal(" - Скорость II (03:00)")
      );
      var0.add(new Helper294("[★] Божья аура", null, Items.PHANTOM_MEMBRANE, Helper452.method4834("Божья аура"), null, var24));
      List var25 = List.of(Text.literal("Это валюта для покупки"), Text.literal("отмычек к тайникам"), Text.literal("у Знахаря (/warp stash)"));
      var0.add(new Helper294("[★] Серебро", null, Items.IRON_NUGGET, Helper452.method4834("Серебро"), null, var25));
      List var26 = List.of(Text.literal("Божье касание"), Text.literal(""), Text.literal("Может добыть спавнер,"), Text.literal("но только один раз"));
      var0.add(new Helper294("[★] Божье касание", null, Items.GOLDEN_PICKAXE, Helper452.method4834("Божье касание"), null, var26));
      List var27 = List.of(Text.literal("Вскапывает территорию"), Text.literal("размером 9x9x5 блоков"));
      var0.add(new Helper294("[★] Кирка мега-бульдозер", null, Items.NETHERITE_PICKAXE, Helper452.method4834("Кирка мега-бульдозер"), null, var27));
      List var28 = List.of(
         Text.literal("Это кошмарная конфета для прохождении"),
         Text.literal("карты таинств - вводи /hellmap"),
         Text.literal(""),
         Text.literal("Кошмарность: +5")
      );
      var0.add(new Helper294("Карамельное яблоко", null, Items.APPLE, Helper452.method4834("Карамельное яблоко"), null, var28));
      return var0;
   }
}
