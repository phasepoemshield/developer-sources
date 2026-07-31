package l;

import java.util.HashMap;
import java.util.Map;

public class Helper452 {
   private static final Map<String, Integer> defaultPrices = new HashMap<>();

   public Helper452() {
   }

   public static int method4834(String var0) {
      return defaultPrices.getOrDefault(var0, 5000);
   }

   static {
      defaultPrices.put("Алмаз", 1500);
      defaultPrices.put("Алмазная руда", 1000);
      defaultPrices.put("Алмазный блок", 11500);
      defaultPrices.put("Бирка", 1000);
      defaultPrices.put("Блок дамагер", 1000);
      defaultPrices.put("Блок золота", 1500);
      defaultPrices.put("Божья аура", 1000);
      defaultPrices.put("Божье касание", 1000);
      defaultPrices.put("Ботинки крушителя", 500000);
      defaultPrices.put("Булава", 100000);
      defaultPrices.put("Булава крушителя", 100000);
      defaultPrices.put("Вспышка", 10000);
      defaultPrices.put("Голова визер-скелета", 1000);
      defaultPrices.put("Голова дракона", 1000);
      defaultPrices.put("Голова зомби", 1000);
      defaultPrices.put("Голова крипера", 1000);
      defaultPrices.put("Голова пиглина", 1000);
      defaultPrices.put("Голова скелета", 1000);
      defaultPrices.put("Дезориентация", 1000);
      defaultPrices.put("Динамит", 1000);
      defaultPrices.put("Драконий скин", 1000);
      defaultPrices.put("Железный блок", 1000);
      defaultPrices.put("Железный слиток", 1000);
      defaultPrices.put("Загадочный маяк", 1000);
      defaultPrices.put("Зачарованное золотое яблоко", 60000);
      defaultPrices.put("Звезда Незера", 1000);
      defaultPrices.put("Зелье Агента", 10000);
      defaultPrices.put("Зелье Киллера", 10000);
      defaultPrices.put("Зелье Медика", 10000);
      defaultPrices.put("Зелье Отрыжки", 10000);
      defaultPrices.put("Зелье Победителя", 10000);
      defaultPrices.put("Золотое яблоко", 1000);
      defaultPrices.put("Золотой слиток", 1500);
      defaultPrices.put("Изумрудная руда", 1000);
      defaultPrices.put("Кирка крушителя", 1000000);
      defaultPrices.put("Кирка мега-бульдозер", 1000);
      defaultPrices.put("Ключ испытаний", 1000);
      defaultPrices.put("Маяк", 1500);
      defaultPrices.put("Меч крушителя", 1000000);
      defaultPrices.put("Мешок", 10000);
      defaultPrices.put("Моча Флеша", 10000);
      defaultPrices.put("Нагрудник крушителя", 500000);
      defaultPrices.put("Незеритовый блок", 50000);
      defaultPrices.put("Незеритовый слиток", 50000);
      defaultPrices.put("Незеритовое улучшение", 50000);
      defaultPrices.put("Обсидиан", 1000);
      defaultPrices.put("Огненный смерч", 20000);
      defaultPrices.put("Отмычка к Сферам", 1000);
      defaultPrices.put("Палка ифрита", 1000);
      defaultPrices.put("Пласт", 1000);
      defaultPrices.put("Поножи крушителя", 500000);
      defaultPrices.put("Порох", 1000);
      defaultPrices.put("Проклятая душа", 1000);
      defaultPrices.put("Пузырёк опыта", 1500);
      defaultPrices.put("Пузырек опыта [15 ур]", 10000);
      defaultPrices.put("Пузырек опыта [30 ур]", 10000);
      defaultPrices.put("Пузырек опыта [50 ур]", 10000);
      defaultPrices.put("Серебро", 1000);
      defaultPrices.put("Серная кислота", 10000);
      defaultPrices.put("Сигнальный огонь [Богатый]", 1000);
      defaultPrices.put("Сигнальный огонь [Легендарный]", 1000);
      defaultPrices.put("Сигнальный огонь [Обычный]", 1000);
      defaultPrices.put("Сигнальный огонь [Случайный]", 1000);
      defaultPrices.put("Снежок заморозка", 1000);
      defaultPrices.put("Сфера Хаоса", 250000);
      defaultPrices.put("Сфера Сатира", 250000);
      defaultPrices.put("Сфера Бестии", 250000);
      defaultPrices.put("Сфера Гидра", 250000);
      defaultPrices.put("Сфера Ареса", 250000);
      defaultPrices.put("Сфера Эрида", 250000);
      defaultPrices.put("Сфера Икара", 250000);
      defaultPrices.put("Сфера Титана", 250000);
      defaultPrices.put("Спавнер", 1000000);
      defaultPrices.put("Талисман Раздора", 500000);
      defaultPrices.put("Талисман Вихря", 500000);
      defaultPrices.put("Талисман Демона", 500000);
      defaultPrices.put("Талисман Мрака", 500000);
      defaultPrices.put("Талисман Тирана", 1000000);
      defaultPrices.put("Талисман Крушителя", 1000000);
      defaultPrices.put("Талисман Ярости", 500000);
      defaultPrices.put("ТNT - TIER BLACK", 1000);
      defaultPrices.put("TNT - TIER WHITE", 1000);
      defaultPrices.put("Тотем бессмертия", 100000);
      defaultPrices.put("Трапка", 1000);
      defaultPrices.put("Трезубец", 1000);
      defaultPrices.put("Трезубец крушителя", 500000);
      defaultPrices.put("Фейерверк", 5000);
      defaultPrices.put("Шалкеровый ящик", 1000);
      defaultPrices.put("Шлем крушителя", 500000);
      defaultPrices.put("Элитры", 100000);
      defaultPrices.put("Эндер жемчуг", 1000);
      defaultPrices.put("Яблоко", 1000);
      defaultPrices.put("Явная пыль", 1000);
      defaultPrices.put("Яйцо вихря", 200000);
      defaultPrices.put("Яйцо зомби-жителя", 100000);
      defaultPrices.put("Яйцо жителя", 200000);
      defaultPrices.put("Зловещий ключ испытаний", 1000);
      defaultPrices.put("Прогрузчик чанков [1x1]", 1000);
      defaultPrices.put("Прогрузчик чанков [3x3]", 1000);
      defaultPrices.put("Прогрузчик чанков [5x5]", 1000);
      defaultPrices.put("Арбалет крушителя", 500000);
      defaultPrices.put("Торт", 10000);
      defaultPrices.put("Стрела Зевса", 1790);
      defaultPrices.put("Стрела обледенения", 1790);
      defaultPrices.put("Световая стрела", 1790);
      defaultPrices.put("Мучительная стрела", 1790);
      defaultPrices.put("Стрела терапии", 1790);
      defaultPrices.put("Кровавая стрела", 1790);
      defaultPrices.put("Заряд ветра", 1790);
      defaultPrices.put("Стержень вихря", 1790);
   }
}
