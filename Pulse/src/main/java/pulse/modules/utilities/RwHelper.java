package pulse.modules.utilities;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.network.packet.s2c.play.OpenScreenS2CPacket;
import net.minecraft.util.Formatting;
import pulse.events.ClientTickEvent;
import pulse.events.PacketEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;

@ModuleInfo(a = "RW Helper", b = "Автоматически закрывает меню сервера или фильтрует запрещенные сообщения в чате", c = ModuleCategory.UTILITIES)
public class RwHelper extends ClientModule {
    private final BooleanSetting a = new BooleanSetting("Закрывать меню", true);
    private final BooleanSetting b = new BooleanSetting("Фильтр запрещенных слов", true);
    private Set<String> e = new HashSet(Arrays.asList("акриен(а|у|ом|е|чик)?", "рич(а|у|ом|ей|е)?", "ньюкод(ом|а|у|ами|ик|е)?", "экспенсив(ом|а|у|ами|е)?", "импакт(ом|а|у|ами|ик|е)?", "экселлент(ом|а|у|ами|ик|е)?", "экселент(ом|а|у|ами|ик)?", "катлаван(ом|а|у|ами|чик)?", "катлован(ом|а|у|ами|чик)?", "целестиал(ом|а|у|ами|е)?", "целк(ой|а|у|ами|очка|е)?", "матикс(ом|а|у|ами|е)?", "инерти(я|ей|ю|ями|е)?", "эксп(а|ой|ою|у|уличка|е)?", "флюгер(ом|а|у|ами)?", "рикер(а|у|ом|очек)?", "фанпе(й|ю|я|ем|е|йчик)?", "вексайд(ом|а|у|ами|ик|е)?", "нурсултан(а|у|е|ом|чик)?", "нурик(а|у|ом|е)?", "нурлан(а|у|ом|чик|е)?", "векс(ом|у|а|ами|ик|е)?", "релейк(ом|у|а|ами|е)?", "арбуз(ом|а|у|ами|ик|е)?", "вилд(ом|у|а|ами|ик|е)?", "фантайм(е|а|у)?", "холик(е|а|у)?", "холиворлд(а|у|е)?", "рокстар(ом|а|у|ами|чик|е)?", "рогалик(а|у|ом|е)?", "тандерхак(ом|у|и|ами|а|е)?", "ликвидбаунс(а|у|ами|е)?", "expensive", "celestial", "newcode", "arbuz", "akrien", "nursultan", "relake", "wild", "wurst", "catlovan", "excellent", "rockstar", "catlavan", "impact", "matix", "inertia", "wex", "wexside", "nurik", "nurlan", "rich", "funpay", "fluger", "riker", "funtime", "holyworld", "wwe", "hvh", "rogalik", "thunderhack", "liquidbounce"));
    private final Pattern bannedPattern;

    public RwHelper() {
        StringBuilder builder = new StringBuilder("(?iu)(");
        boolean first = true;
        for (String part : this.e) {
            if (!first) {
                builder.append('|');
            }
            first = false;
            builder.append(part);
        }
        builder.append(')');
        this.bannedPattern = Pattern.compile(builder.toString());
    }

    @EventHandler
    private void a(PacketEvent packetEvent) {
        if (packetEvent.e() != PacketEvent.MessageDirection.RECEIVE) {
            return;
        }
        if (this.a.k().booleanValue() && packetEvent.d() instanceof OpenScreenS2CPacket) {
            String title = Formatting.strip(((OpenScreenS2CPacket) packetEvent.d()).getName().getString());
            if (title != null) {
                String lower = title.toLowerCase(Locale.ROOT);
                if (lower.contains("меню") || lower.contains("donate") || lower.contains("донат") || lower.contains("магазин") || lower.contains("services")) {
                    packetEvent.b();
                    if (c.player != null) {
                        c.player.closeHandledScreen();
                    }
                    return;
                }
            }
        }
        if (this.b.k().booleanValue() && packetEvent.d() instanceof GameMessageS2CPacket) {
            String msg = Formatting.strip(((GameMessageS2CPacket) packetEvent.d()).content().getString());
            if (msg != null && this.bannedPattern.matcher(msg).find()) {
                packetEvent.b();
            }
        }
    }

    @EventHandler
    private void a(ClientTickEvent clientTickEvent) {
        if (!this.a.k().booleanValue() || c.player == null) {
            return;
        }
        if (c.currentScreen instanceof GenericContainerScreen) {
            String title = c.currentScreen.getTitle().getString().toLowerCase(Locale.ROOT);
            if (title.contains("меню") || title.contains("donate") || title.contains("донат") || title.contains("магазин")) {
                c.player.closeHandledScreen();
            }
        }
    }

    public static String c(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }
}
