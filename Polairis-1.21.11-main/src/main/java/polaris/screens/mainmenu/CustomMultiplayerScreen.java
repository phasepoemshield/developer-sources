package polaris.screens.mainmenu;

import com.mojang.blaze3d.platform.NativeImage;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.ConnectScreen;
import net.minecraft.client.gui.screens.ConfirmScreen;
import net.minecraft.client.gui.screens.DirectJoinServerScreen;
import net.minecraft.client.gui.screens.FaviconTexture;
import net.minecraft.client.gui.screens.ManageServerScreen;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.input.KeyEvent;
import net.minecraft.client.input.MouseButtonEvent;
import net.minecraft.client.multiplayer.ServerData;
import net.minecraft.client.multiplayer.ServerList;
import net.minecraft.client.multiplayer.ServerStatusPinger;
import net.minecraft.client.multiplayer.resolver.ServerAddress;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.Identifier;
import net.minecraft.server.network.EventLoopGroupHolder;
import org.lwjgl.glfw.GLFW;
import polaris.utils.render.color.ColorUtil;
import polaris.utils.render.ui.Render2D;
import polaris.utils.render.ui.font.FontType;
import polaris.utils.render.ui.gif.GifRenderer;
import polaris.utils.render.ui.gif.MainMenuGifPreloader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;


public final class CustomMultiplayerScreen extends Screen {
    private static final float ROW_H = 38f;
    private static final float ROW_CONTENT = 34f;
    private static final float ROW_WIDTH = 305f;
    private static final float MOTD_MAX_W = 271f;
    private static final int MOTD_DEFAULT = ColorUtil.rgba(128, 128, 128, 255);

    private final Screen parent;
    private final Minecraft mc = Minecraft.getInstance();

    private ServerList servers;
    private final ServerStatusPinger pinger = new ServerStatusPinger();
    
    private EventLoopGroupHolder eventLoops;
    private final Map<String, IconSlot> icons = new HashMap<>();
    private int selected = -1;
    private float scroll;
    private long lastClickMs;

    private GifRenderer backgroundGif;
    private final List<UiButton> buttons = new ArrayList<>();
    private RockstarMenuChrome.PanelGeom panel;
    private float listTop;
    private float listBottom;
    private float rowLeft;

    public CustomMultiplayerScreen(Screen parent) {
        super(Component.literal("Multiplayer"));
        this.parent = parent;
    }

    @Override
    protected void init() {
        super.init();
        backgroundGif = MainMenuGifPreloader.background();
        if (backgroundGif != null && !backgroundGif.isReady() && !backgroundGif.isFailed()) {
            backgroundGif.ensureLoaded();
        }
        servers = new ServerList(mc);
        servers.load();
        selected = servers.size() > 0 ? 0 : -1;
        rebuildLayout();
        pingAll();
    }

    @Override
    public void removed() {
        pinger.removeAll();
        eventLoops = null;
        for (IconSlot slot : icons.values()) {
            try {
                slot.icon.close();
            } catch (Throwable ignored) {
            }
        }
        icons.clear();
        super.removed();
    }

    @Override
    public void tick() {
        pinger.tick();
        super.tick();
    }

    private void rebuildLayout() {
        buttons.clear();
        float dw = Render2D.getFixedScaledWidth();
        float dh = Render2D.getFixedScaledHeight();
        panel = RockstarMenuChrome.panelMulti(dw, dh);
        listTop = panel.y() + 10f;
        listBottom = panel.y() + panel.h() - 10f;
        rowLeft = dw * 0.5f - 150f;

        float by1 = dh - 52f;
        float by2 = dh - 28f;
        buttons.add(new UiButton("join", "Войти", dw * 0.5f - 154f, by1, 100f, 20f, true));
        buttons.add(new UiButton("direct", "Прямое подключение", dw * 0.5f - 50f, by1, 100f, 20f, false));
        buttons.add(new UiButton("add", "Добавить", dw * 0.5f + 54f, by1, 100f, 20f, false));
        buttons.add(new UiButton("edit", "Изменить", dw * 0.5f - 154f, by2, 70f, 20f, false));
        buttons.add(new UiButton("delete", "Удалить", dw * 0.5f - 74f, by2, 70f, 20f, false));
        buttons.add(new UiButton("refresh", "Обновить", dw * 0.5f + 4f, by2, 70f, 20f, false));
        buttons.add(new UiButton("back", "Отмена", dw * 0.5f + 80f, by2, 75f, 20f, false));
    }

    private void pingAll() {
        if (servers == null) {
            return;
        }
        if (eventLoops == null) {
            eventLoops = EventLoopGroupHolder.remote(false);
        }
        for (int i = 0; i < servers.size(); i++) {
            ServerData data = servers.get(i);
            try {
                data.setState(ServerData.State.INITIAL);
                pinger.pingServer(data, () -> {}, () -> {}, eventLoops);
            } catch (Throwable ignored) {
            }
        }
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTick) {
        float dw = Render2D.getFixedScaledWidth();
        float dh = Render2D.getFixedScaledHeight();
        float mx = (float) Render2D.guiToFixed(mouseX);
        float my = (float) Render2D.guiToFixed(mouseY);

        if (buttons.isEmpty() || panel == null) {
            rebuildLayout();
        }

        float listH = Math.max(1f, listBottom - listTop);
        float maxScroll = Math.max(0f, servers.size() * ROW_H - listH + 4f);
        scroll = Math.max(0f, Math.min(scroll, maxScroll));

        Render2D.beginFrame(g);

        Render2D.rect(0, 0, dw, dh, 0f, ColorUtil.rgba(6, 8, 12, 255));
        if (backgroundGif != null) {
            backgroundGif.renderCover(0, 0, dw, dh, ColorUtil.rgba(255, 255, 255, 255));
        }
        
        Render2D.rect(0, 0, dw, dh, 0f, ColorUtil.rgba(0, 0, 0, 90));

        RockstarMenuChrome.drawPanel(panel, false);

        String title = "Многопользовательская игра";
        float titleSize = 10f;
        float tw = Render2D.textWidth(FontType.SEMIBOLD, title, titleSize);
        Render2D.text(FontType.SEMIBOLD, title, dw * 0.5f - tw * 0.5f, panel.y() - 18f, titleSize,
                RockstarMenuChrome.COL_TEXT);

        Render2D.pushScissor(g, panel.x() + 1f, panel.y() + 1f, panel.w() - 2f, panel.h() - 2f);
        if (servers.size() == 0) {
            String empty = "Список серверов пуст";
            float ew = Render2D.textWidth(FontType.SEMIBOLD, empty, 8.5f);
            Render2D.text(FontType.SEMIBOLD, empty, dw * 0.5f - ew * 0.5f, listTop + 24f, 8.5f,
                    RockstarMenuChrome.COL_TEXT_DIM);
        } else {
            for (int i = 0; i < servers.size(); i++) {
                float ry = listTop + 4f - scroll + i * ROW_H;
                if (ry + ROW_CONTENT < listTop || ry > listBottom) {
                    continue;
                }
                drawServerRow(i, ry, mx, my);
            }
        }
        Render2D.popScissor(g);

        for (UiButton b : buttons) {
            drawButton(b);
        }

        Render2D.flush();
    }

    private void drawServerRow(int index, float y, float mx, float my) {
        ServerData data = servers.get(index);
        boolean sel = index == selected;
        boolean hovIcon = mx >= rowLeft && mx <= rowLeft + 32f
                && my >= y && my <= y + 32f;

        if (sel) {
            Render2D.rect(rowLeft - 2f, y - 2f, ROW_WIDTH + 4f, ROW_CONTENT + 4f, 0f,
                    ColorUtil.rgba(128, 128, 128, 255));
            Render2D.rect(rowLeft - 1f, y - 1f, ROW_WIDTH + 2f, ROW_CONTENT + 2f, 0f,
                    ColorUtil.rgba(0, 0, 0, 255));
        }

        Render2D.rect(rowLeft, y, 32f, 32f, 0f, ColorUtil.rgba(40, 42, 50, 255));
        Identifier iconId = syncIcon(data);
        if (iconId != null) {
            Render2D.image(iconId.toString(), rowLeft, y, 32f, 32f, 0f,
                    ColorUtil.rgba(255, 255, 255, 255));
        }
        if (hovIcon) {
            Render2D.rect(rowLeft, y, 32f, 32f, 3f, ColorUtil.rgba(255, 255, 255, 128));
        }

        String name = data.name == null || data.name.isBlank() ? "Сервер" : data.name;
        Render2D.text(FontType.SEMIBOLD, name, rowLeft + 35f, y + 1f, 8.5f, RockstarMenuChrome.COL_TEXT);

        if (data.motd != null) {
            drawStyledMotd(data.motd, rowLeft + 35f, y + 12f, MOTD_MAX_W, 7.5f);
        }

        String online = onlineLabel(data);
        String ping = pingLabel(data);
        float right = rowLeft + 299f;
        if (!ping.isEmpty()) {
            float pingW = Render2D.textWidth(FontType.SEMIBOLD, ping, 7.5f);
            Render2D.text(FontType.SEMIBOLD, ping, right - pingW, y, 7.5f,
                    pingColor(data));
            right -= pingW + 6f;
        }
        if (!online.isEmpty()) {
            float onlineW = Render2D.textWidth(FontType.SEMIBOLD, online, 7.5f);
            Render2D.text(FontType.SEMIBOLD, online, right - onlineW, y, 7.5f,
                    ColorUtil.rgba(180, 180, 180, 240));
        }
    }

    private Identifier syncIcon(ServerData data) {
        String key = data.ip == null ? "" : data.ip;
        IconSlot slot = icons.get(key);
        if (slot == null) {
            slot = new IconSlot(FaviconTexture.forServer(mc.getTextureManager(), key));
            icons.put(key, slot);
        }
        byte[] bytes = data.getIconBytes();
        if (!Arrays.equals(bytes, slot.lastBytes)) {
            try {
                if (bytes == null) {
                    slot.icon.clear();
                } else {
                    NativeImage image = NativeImage.read(bytes);
                    slot.icon.upload(image);
                    Render2D.invalidateImageTexture(slot.icon.textureLocation());
                }
                slot.lastBytes = bytes == null ? null : Arrays.copyOf(bytes, bytes.length);
            } catch (Throwable t) {
                try {
                    slot.icon.clear();
                } catch (Throwable ignored) {
                }
                slot.lastBytes = null;
            }
        }
        return slot.icon.textureLocation();
    }

    private void drawStyledMotd(Component motd, float x, float y, float maxW, float size) {
        float lineH = size + 1.5f;
        final float[] penX = {x};
        final float[] penY = {y};
        final float[] used = {0f};
        final int[] line = {0};

        motd.visit((style, text) -> {
            if (text == null || text.isEmpty() || line[0] >= 2) {
                return Optional.empty();
            }
            int color = styleToRgba(style, MOTD_DEFAULT);
            String[] parts = text.split("\n", -1);
            for (int p = 0; p < parts.length; p++) {
                if (p > 0) {
                    line[0]++;
                    if (line[0] >= 2) {
                        return Optional.of(Boolean.TRUE);
                    }
                    penX[0] = x;
                    penY[0] = y + line[0] * lineH;
                    used[0] = 0f;
                }
                String chunk = parts[p];
                if (chunk.isEmpty()) {
                    continue;
                }
                float remaining = maxW - used[0];
                if (remaining <= 1f) {
                    continue;
                }
                String draw = chunk;
                float w = Render2D.textWidth(FontType.REGULARNEW, draw, size);
                if (w > remaining) {
                    draw = ellipsize(draw, remaining, size);
                    w = Render2D.textWidth(FontType.REGULARNEW, draw, size);
                }
                if (!draw.isEmpty()) {
                    Render2D.text(FontType.REGULARNEW, draw, penX[0], penY[0], size, color);
                    penX[0] += w;
                    used[0] += w;
                }
            }
            return Optional.empty();
        }, Style.EMPTY);
    }

    private static int styleToRgba(Style style, int fallback) {
        if (style == null) {
            return fallback;
        }
        TextColor tc = style.getColor();
        if (tc == null) {
            return fallback;
        }
        int rgb = tc.getValue() & 0xFFFFFF;
        return 0xFF000000 | rgb;
    }

    private static String onlineLabel(ServerData data) {
        ServerData.State state = data.state();
        if (state == ServerData.State.PINGING || state == ServerData.State.INITIAL) {
            return "…";
        }
        if (state == ServerData.State.UNREACHABLE) {
            return "–";
        }
        if (data.players != null) {
            return ServerStatusPinger.formatPlayerCount(data.players.online(), data.players.max()).getString();
        }
        if (data.status != null) {
            String s = data.status.getString();
            if (s != null && !s.isBlank()) {
                return s;
            }
        }
        return state == ServerData.State.SUCCESSFUL || state == ServerData.State.INCOMPATIBLE ? "?" : "…";
    }

    private static String pingLabel(ServerData data) {
        ServerData.State state = data.state();
        if (state == ServerData.State.PINGING || state == ServerData.State.INITIAL) {
            return "";
        }
        if (state == ServerData.State.UNREACHABLE) {
            return "";
        }
        if (data.ping < 0L) {
            return "";
        }
        return data.ping + "ms";
    }

    private static int pingColor(ServerData data) {
        long p = data.ping;
        if (p < 0L) {
            return ColorUtil.rgba(128, 128, 128, 230);
        }
        if (p < 80L) {
            return ColorUtil.rgba(85, 255, 85, 255);
        }
        if (p < 150L) {
            return ColorUtil.rgba(255, 255, 85, 255);
        }
        if (p < 300L) {
            return ColorUtil.rgba(255, 170, 0, 255);
        }
        return ColorUtil.rgba(255, 85, 85, 255);
    }

    private static String ellipsize(String text, float maxW, float size) {
        if (Render2D.textWidth(FontType.REGULARNEW, text, size) <= maxW) {
            return text;
        }
        String ell = "…";
        int lo = 0;
        int hi = text.length();
        while (lo < hi) {
            int mid = (lo + hi + 1) >>> 1;
            if (Render2D.textWidth(FontType.REGULARNEW, text.substring(0, mid) + ell, size) <= maxW) {
                lo = mid;
            } else {
                hi = mid - 1;
            }
        }
        return lo <= 0 ? ell : text.substring(0, lo) + ell;
    }

    private void drawButton(UiButton b) {
        if (b.primary) {
            Render2D.rect(b.x, b.y, b.w, b.h, 3f, RockstarMenuChrome.COL_ACCENT);
        } else {
            Render2D.rect(b.x, b.y, b.w, b.h, 3f, RockstarMenuChrome.COL_SECOND);
        }
        Render2D.outline(b.x, b.y, b.w, b.h, 3f, 0.8f, RockstarMenuChrome.COL_FOURS_OUTLINE);
        float size = 8.5f;
        float tw = Render2D.textWidth(FontType.SEMIBOLD, b.label, size);
        Render2D.text(FontType.SEMIBOLD, b.label, b.x + (b.w - tw) * 0.5f, b.y + 3f, size,
                RockstarMenuChrome.COL_TEXT);
    }

    @Override
    public boolean mouseClicked(MouseButtonEvent event, boolean doubled) {
        float mx = (float) Render2D.guiToFixed(event.x());
        float my = (float) Render2D.guiToFixed(event.y());

        if (event.button() == GLFW.GLFW_MOUSE_BUTTON_LEFT) {
            if (my >= listTop && my <= listBottom
                    && mx >= rowLeft && mx <= rowLeft + ROW_WIDTH) {
                int idx = (int) ((my - listTop + scroll - 4f) / ROW_H);
                if (idx >= 0 && idx < servers.size()) {
                    long now = System.currentTimeMillis();
                    float localX = mx - rowLeft;
                    float localY = my - (listTop + 4f - scroll + idx * ROW_H);
                    if (localX >= 0f && localX <= 32f && localY >= 0f && localY <= 32f) {
                        selected = idx;
                        if (localX < 16f) {
                            swapSelected(localY < 16f ? -1 : 1);
                        } else {
                            joinSelected();
                        }
                        return true;
                    }
                    if (idx == selected && now - lastClickMs < 250L) {
                        joinSelected();
                        return true;
                    }
                    selected = idx;
                    lastClickMs = now;
                    return true;
                }
            }

            for (UiButton b : buttons) {
                if (b.contains(mx, my)) {
                    onAction(b.id);
                    return true;
                }
            }
        }
        return super.mouseClicked(event, doubled);
    }

    @Override
    public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
        float mx = (float) Render2D.guiToFixed(mouseX);
        float my = (float) Render2D.guiToFixed(mouseY);
        if (my >= listTop && my <= listBottom && mx >= rowLeft - 20f && mx <= rowLeft + ROW_WIDTH + 20f) {
            scroll = Math.max(0f, scroll - (float) verticalAmount * 19f);
            return true;
        }
        return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
    }

    @Override
    public boolean keyPressed(KeyEvent event) {
        int key = event.key();
        if (key == GLFW.GLFW_KEY_ESCAPE) {
            mc.setScreen(parent);
            return true;
        }
        if (key == GLFW.GLFW_KEY_ENTER || key == GLFW.GLFW_KEY_KP_ENTER) {
            joinSelected();
            return true;
        }
        if (key == GLFW.GLFW_KEY_DELETE) {
            deleteSelected();
            return true;
        }
        if (key == GLFW.GLFW_KEY_F5) {
            refresh();
            return true;
        }
        if (key == GLFW.GLFW_KEY_UP && selected > 0) {
            selected--;
            ensureVisible();
            return true;
        }
        if (key == GLFW.GLFW_KEY_DOWN && selected < servers.size() - 1) {
            selected++;
            ensureVisible();
            return true;
        }
        return super.keyPressed(event);
    }

    private void ensureVisible() {
        float y = selected * ROW_H;
        float listH = listBottom - listTop;
        if (y < scroll) {
            scroll = y;
        } else if (y + ROW_H > scroll + listH) {
            scroll = y + ROW_H - listH;
        }
    }

    private void swapSelected(int dir) {
        if (selected < 0 || selected >= servers.size()) {
            return;
        }
        int target = selected + dir;
        if (target < 0 || target >= servers.size()) {
            return;
        }
        try {
            servers.swap(selected, target);
            servers.save();
            selected = target;
        } catch (Throwable ignored) {
        }
    }

    private void onAction(String id) {
        switch (id) {
            case "join" -> joinSelected();
            case "direct" -> openDirect();
            case "add" -> openAdd();
            case "edit" -> openEdit();
            case "delete" -> deleteSelected();
            case "refresh" -> refresh();
            case "back" -> mc.setScreen(parent);
            default -> {
            }
        }
    }

    private void joinSelected() {
        if (selected < 0 || selected >= servers.size()) {
            return;
        }
        join(servers.get(selected));
    }

    private void join(ServerData data) {
        if (data == null || data.ip == null || data.ip.isBlank()) {
            return;
        }
        ServerAddress address = ServerAddress.parseString(data.ip);
        ConnectScreen.startConnecting(this, mc, address, data, false, null);
    }

    private void openDirect() {
        ServerData data = new ServerData("Minecraft Server", "", ServerData.Type.OTHER);
        mc.setScreen(new DirectJoinServerScreen(this, accepted -> {
            if (accepted) {
                join(data);
            } else {
                mc.setScreen(this);
            }
        }, data));
    }

    private void openAdd() {
        ServerData data = new ServerData("Minecraft Server", "", ServerData.Type.OTHER);
        mc.setScreen(new ManageServerScreen(this, Component.literal("Добавить сервер"), accepted -> {
            if (accepted) {
                servers.add(data, false);
                servers.save();
                selected = servers.size() - 1;
                pingAll();
            }
            mc.setScreen(this);
        }, data));
    }

    private void openEdit() {
        if (selected < 0 || selected >= servers.size()) {
            return;
        }
        ServerData original = servers.get(selected);
        ServerData data = new ServerData(original.name, original.ip, original.type());
        data.copyFrom(original);
        final int idx = selected;
        mc.setScreen(new ManageServerScreen(this, Component.literal("Изменить сервер"), accepted -> {
            if (accepted) {
                servers.replace(idx, data);
                servers.save();
                pingAll();
            }
            mc.setScreen(this);
        }, data));
    }

    private void deleteSelected() {
        if (selected < 0 || selected >= servers.size()) {
            return;
        }
        ServerData data = servers.get(selected);
        String name = data.name == null ? data.ip : data.name;
        mc.setScreen(new ConfirmScreen(accepted -> {
            if (accepted) {
                String ip = data.ip == null ? "" : data.ip;
                IconSlot slot = icons.remove(ip);
                if (slot != null) {
                    try {
                        slot.icon.close();
                    } catch (Throwable ignored) {
                    }
                }
                servers.remove(data);
                servers.save();
                if (selected >= servers.size()) {
                    selected = servers.size() - 1;
                }
            }
            mc.setScreen(this);
        }, Component.literal("Удалить сервер?"), Component.literal("«" + name + "» будет удалён из списка.")));
    }

    private void refresh() {
        servers.load();
        if (selected >= servers.size()) {
            selected = servers.size() - 1;
        }
        pingAll();
    }

    @Override
    public void onClose() {
        mc.setScreen(parent);
    }

    @Override
    public boolean isPauseScreen() {
        return false;
    }

    private static final class IconSlot {
        final FaviconTexture icon;
        byte[] lastBytes;

        IconSlot(FaviconTexture icon) {
            this.icon = icon;
        }
    }

    private static final class UiButton {
        final String id;
        final String label;
        final float x, y, w, h;
        final boolean primary;

        UiButton(String id, String label, float x, float y, float w, float h, boolean primary) {
            this.id = id;
            this.label = label;
            this.x = x;
            this.y = y;
            this.w = w;
            this.h = h;
            this.primary = primary;
        }

        boolean contains(float mx, float my) {
            return mx >= x && mx <= x + w && my >= y && my <= y + h;
        }
    }
}
