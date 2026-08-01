package pulse.modules.utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import meteordevelopment.orbit.EventHandler;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import pulse.events.ClientTickEvent;
import pulse.events.PacketEvent;
import pulse.events.WorldChangeEvent;
import pulse.module.ClientModule;
import pulse.module.ModuleCategory;
import pulse.module.ModuleInfo;
import pulse.settings.BooleanSetting;
import pulse.settings.ModeSetting;
import pulse.settings.TokenSetting;

@ModuleInfo(a = "Auto Duel", b = "Автоматически отправляет запросы на дуэли игрокам", c = ModuleCategory.UTILITIES)
public class AutoDuel extends ClientModule {
    private final ModeSetting a = new ModeSetting("Набор", new String[]{"Щит", "Шипы 3", "Лук", "Тотемы", "Нодебафф", "Шары", "Классик", "Читерский рай", "Незеритка"}, "Шары");
    private final BooleanSetting b = new BooleanSetting("Ставить деньги", false);
    private final TokenSetting e;
    private static final Pattern f = Pattern.compile("^\\w{3,16}$");
    private final List<String> g;
    private long h;
    private long i;
    private String j;
    private boolean k;
    private long lastPickMs;
    private long lastSetupMs;

    public AutoDuel() {
        TokenSetting tokenSetting = new TokenSetting("Сумма ставки", TokenSetting.TokenType.PRICE, "2000", "Введите сумму");
        BooleanSetting booleanSetting = this.b;
        Objects.requireNonNull(booleanSetting);
        this.e = tokenSetting.a(booleanSetting::k);
        this.g = new ArrayList();
        this.h = 0L;
        this.i = 0L;
        this.j = "";
        this.k = false;
    }

    @EventHandler
    public void a(ClientTickEvent clientTickEvent) {
        if (c.player == null || c.world == null || c.getNetworkHandler() == null || c.interactionManager == null) {
            return;
        }
        if (this.k) {
            return;
        }
        handleGui();
        long now = System.currentTimeMillis();
        if (now - this.h < 2500L) {
            return;
        }
        if (now - this.i > 20000L) {
            this.g.clear();
            this.i = now;
        }
        for (String name : n()) {
            if (this.g.contains(name) || name.equalsIgnoreCase(c.player.getName().getString())) {
                continue;
            }
            String cmd = "duel " + name;
            if (this.b.k().booleanValue() && this.e.d()) {
                cmd = cmd + " " + this.e.k().replace("$", "").replace(" ", "");
            }
            c.getNetworkHandler().sendChatCommand(cmd);
            this.g.add(name);
            this.j = name;
            this.h = now;
            break;
        }
    }

    private List<String> n() {
        if (c.getNetworkHandler() == null) {
            return Collections.emptyList();
        }
        ArrayList<String> names = new ArrayList<>();
        for (PlayerListEntry entry : c.getNetworkHandler().getPlayerList()) {
            String name = entry.getProfile().getName();
            if (f.matcher(name).matches()) {
                names.add(name);
            }
        }
        return names;
    }

    @EventHandler
    public void a(PacketEvent packetEvent) {
        if (packetEvent.e() != PacketEvent.MessageDirection.RECEIVE) {
            return;
        }
        if (!(packetEvent.d() instanceof GameMessageS2CPacket)) {
            return;
        }
        String msg = ((GameMessageS2CPacket) packetEvent.d()).content().getString().toLowerCase();
        if ((msg.contains("начало") && msg.contains("через") && msg.contains("секунд"))
                || msg.contains("поединок начался")
                || msg.contains("во время поединка")) {
            this.k = true;
            a(false);
        }
    }

    @EventHandler
    public void a(WorldChangeEvent worldChangeEvent) {
        this.g.clear();
        this.k = false;
        this.j = "";
    }

    private void handleGui() {
        if (!(c.currentScreen instanceof GenericContainerScreen) || c.interactionManager == null || c.player == null) {
            return;
        }
        GenericContainerScreen screen = (GenericContainerScreen) c.currentScreen;
        int syncId = ((GenericContainerScreenHandler) screen.getScreenHandler()).syncId;
        String title = screen.getTitle().getString();
        long now = System.currentTimeMillis();
        if (title.contains("Выбор набора") && now - this.lastPickMs >= 150L) {
            c.interactionManager.clickSlot(syncId, modeSlot(), 0, SlotActionType.QUICK_MOVE, (PlayerEntity) c.player);
            this.lastPickMs = now;
        } else if (title.contains("Настройка поединка") && now - this.lastSetupMs >= 150L) {
            c.interactionManager.clickSlot(syncId, 0, 0, SlotActionType.QUICK_MOVE, (PlayerEntity) c.player);
            this.lastSetupMs = now;
        }
    }

    private int modeSlot() {
        if (this.a.b("Щит")) return 0;
        if (this.a.b("Шипы 3")) return 1;
        if (this.a.b("Лук")) return 2;
        if (this.a.b("Тотемы")) return 3;
        if (this.a.b("Нодебафф")) return 4;
        if (this.a.b("Шары")) return 5;
        if (this.a.b("Классик")) return 6;
        if (this.a.b("Читерский рай")) return 7;
        if (this.a.b("Незеритка")) return 8;
        return 5;
    }

    @Override
    public void e() {
        super.e();
        this.g.clear();
        this.k = false;
        this.j = "";
        this.h = 0L;
        this.i = System.currentTimeMillis();
    }

    @Override
    public void f() {
        this.g.clear();
        this.k = false;
        this.j = "";
        super.f();
    }

    public static String c(String str, String str2, int i, int i2, int i3, int i4) {
        return null;
    }
}
