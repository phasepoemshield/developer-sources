package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.client.TextFactoryEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import fun.nexisdlc.modules.api.settings.impl.BooleanSetting;
import fun.nexisdlc.modules.api.settings.impl.StringSetting;

import java.util.Map;

@FunctionAdd(name = "StreamerMode", alias = "Streamer Mode", category = Category.Utilities, description = "Скрывает некоторые данные на экране")
public class StreamerMode extends Function {
    public BooleanSetting nameProtect = new BooleanSetting("Скрывать ник", true);
    public StringSetting nameProtectName = new StringSetting("Никнейм", "Protected").setVisible(() -> nameProtect.get());
    public BooleanSetting nameProtectReplaceFriendNicknames = new BooleanSetting("Заменять никнеймы друзей", true).setVisible(() -> nameProtect.get());

    BooleanSetting serverNameReplacement = new BooleanSetting("Заменять названия серверов", true);
    StringSetting serverName = new StringSetting("Название сервера", "FunTime").setVisible(() -> serverNameReplacement.get());
    StringSetting serverReplacementName = new StringSetting("Заменяемое слово", "Nexis").setVisible(() -> serverNameReplacement.get());

    BooleanSetting antiStrike = new BooleanSetting("Анти-Страйк", false);

    private static final Map<String, String> ANTI_STRIKE_REPLACEMENTS = Map.ofEntries(
            Map.entry("Барон", "Байрон"),
            Map.entry("Страж", "Strash"),
            Map.entry("Герой", "Hero"),
            Map.entry("Аспид", "Aspid"),
            Map.entry("Глава", "Glava"),
            Map.entry("Титан", "Titan"),
            Map.entry("Принц", "Prince"),
            Map.entry("Князь", "Knyaz"),
            Map.entry("Герцог", "Gercog"),
            Map.entry("FunTime", "FonTan"),
            Map.entry("FunTime.su", "FonTan.su"),
            Map.entry("Трапка", "Трапонювка"),
            Map.entry("Пласт", "Стенка"),
            Map.entry("Хлопушка", "Конфети"),
            Map.entry("Булава Крушителя", "Булава Шпионера"),
            Map.entry("Меч Крушителя", "Меч Шпионера"),
            Map.entry("Лук Крушителя", "Лук Шпионера"),
            Map.entry("Талисман Крушителя", "Талисман Груши"),
            Map.entry("Сфера Хаоса", "Сфера Хооса"),
            Map.entry("Сфера Сатира", "Сфера Сотира"),
            Map.entry("Сфера Бестии", "Сфера Бистии"),
            Map.entry("Сфера Ареса", "Сфера Арэса"),
            Map.entry("Сфера Гидры", "Сфера Гидрыпоюза"),
            Map.entry("Сфера Икара", "Сфера Икры"),
            Map.entry("Сфера Эрида", "Сфера Еридо"),
            Map.entry("Кирка Крушителя", "Кирка Шпионера"),
            Map.entry("Меч Сатаны", "Меч Аквича"),
            Map.entry("Лук Сатаны", "Лук Аквича"),
            Map.entry("Кирка Сатаны", "Кирка Аквича"),
            Map.entry("Трезубец Крушителя", "Кирка Шпионера"),
            Map.entry("Божье касание", "Святое касание"),
            Map.entry("Мощный удар", "Сокрушитель"),
            Map.entry("Дезориентация", "Растерянность"),
            Map.entry("Явная пыль", "Подсветка"),
            Map.entry("Божья аура", "Снять дебафы"),
            Map.entry("Зелье Ассасина", "Зелье Сосны"),
            Map.entry("Зелье Палладина", "Зелье Защиты"),
            Map.entry("Снотворное", "Слабость"),
            Map.entry("Зелье Гнева", "Зелье Злости"),
            Map.entry("Святая вода", "Вода"),
            Map.entry("Зелье Радиации", "Зелье Отрыжки"),
            Map.entry("Огненный смерч", "Лавовая буря"),
            Map.entry("Шлем Крушителя", "Шлем Шпионера"),
            Map.entry("Нагрудник Крушителя", "Нагрудник Шпионера"),
            Map.entry("Ботинки Крушителя", "Ботинки Шпионера"),
            Map.entry("Поножи Крушителя", "Поножи Шпионера")
    );

    public StreamerMode() {
        addSettings(nameProtect, nameProtectName, nameProtectReplaceFriendNicknames,
                serverNameReplacement, serverName, serverReplacementName, antiStrike);
    }

    @EventHandler
    public void onTextFactory(TextFactoryEvent e) {
        if (!nameProtect.get() && !serverNameReplacement.get() && !antiStrike.get()) {
            return;
        }

        String text = e.getText();
        if (text == null || text.isEmpty()) {
            return;
        }

        if (nameProtect.get()) {
            e.replaceText(mc.getSession().getUsername(), nameProtectName.get());
        }

        if (serverNameReplacement.get()) {
            e.replaceTextContains(serverName.get(), serverReplacementName.get());
        }

        if (nameProtectReplaceFriendNicknames.get() && nameProtect.get()) {
            // optimized: replace all friend names in one pass using replaceTextContains
            for (var friend : Nexis.getInstance().getFriendStorage().getFriends()) {
                e.replaceText(friend.getName(), nameProtectName.get());
            }
        }

        if (antiStrike.get()) {
            // Optimized: iterate map once instead of calling replaceTextContains 46 times
            for (Map.Entry<String, String> entry : ANTI_STRIKE_REPLACEMENTS.entrySet()) {
                e.replaceTextContains(entry.getKey(), entry.getValue());
            }
        }
    }
}
