package fun.nexisdlc.ui.hud;

import fun.nexisdlc.ClientContainer;
import fun.nexisdlc.Nexis;
import fun.nexisdlc.client.events.impl.render.EventRender;
import fun.nexisdlc.client.utils.config.GPSStorage;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.globals.GlobalsManager;
import fun.nexisdlc.client.utils.globals.GlobalsPoint;
import fun.nexisdlc.client.utils.math.ProjectionUtil;
import fun.nexisdlc.client.utils.render.main.core.Renderer2D;
import fun.nexisdlc.client.utils.render.main.text.FontRegistry;
import net.minecraft.util.math.Vec3d;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static fun.nexisdlc.client.utils.client.IMinecraft.mc;

public class GpsOverlay {

    @EventHandler
    public void onRenderHud(EventRender.Screen.UnderHud event) {
        if (mc.world == null || mc.player == null || mc.options.hudHidden) return;
        renderGPS(event.getRenderer());
    }

    private void renderGPS(Renderer2D render) {
        List<GPSStorage.GPSPoint> points = Nexis.getInstance().getGpsStorage().getPoints();
        if (ClientContainer.isHide()) return;

        List<GPSStorage.GPSPoint> sorted = new ArrayList<>(points);
        sorted.sort(Comparator.comparingDouble(point ->
                mc.player.getEntityPos().distanceTo(new Vec3d(point.getX(), point.getY(), point.getZ()))));

        int maxPoints = Math.min(sorted.size(), 10);
        final int screenW = mc.getWindow().getWidth();
        final int screenH = mc.getWindow().getHeight();

        var font = FontRegistry.SF_SEMIBOLD;
        float fontSize = 18f;
        float distanceSize = 16f;
        float paddingX = 7f;
        float paddingY = 4f;

        render.prepareBlur(8f);

        for (int i = 0; i < maxPoints; i++) {
            GPSStorage.GPSPoint point = sorted.get(i);
            double distance = mc.player.getEntityPos().distanceTo(new Vec3d(point.getX(), point.getY(), point.getZ()));

            var screenPos = ProjectionUtil.toScreen(point.getX(), point.getY() + 2.0, point.getZ());
            // Попытка исправить исчезновение метки при близком приближении к точке (Event/RTP):
            // не пропускаем марку, если она просто за пределами экрана — клипуем к краям экрана.
            if (screenPos.z < 0) continue;

            float clampedX = (float) Math.max(0, Math.min(screenW, screenPos.x));
            float clampedY = (float) Math.max(0, Math.min(screenH, screenPos.y));

            String nameText = point.getName() + " - " + Math.round(distance) + "m";

            var nameMetrics = render.measureText(font, nameText, fontSize);

            float totalWidth = nameMetrics.width;
            float bgWidth = totalWidth + paddingX * 2;
            float bgHeight = nameMetrics.height + paddingY * 0.8f;

            float nameX = -nameMetrics.width / 2f;
            float nameY = -bgHeight + paddingY + nameMetrics.height - 7;

            render.pushTranslation(clampedX, clampedY);
            //render.blur(-bgWidth / 2, -bgHeight, bgWidth, bgHeight, 0, 1f);
            render.rect(-bgWidth / 2, -bgHeight, bgWidth, bgHeight, 0, new Color(0, 0, 0, 140).getRGB());

            render.text(font, nameX, nameY, fontSize, nameText, -1);

            render.popTransform();
        }

        String localWorld = mc.world.getRegistryKey().getValue().toString();
        for (GlobalsPoint point : GlobalsManager.getInstance().getPoints()) {
            if (!point.worldKey().isBlank() && !point.worldKey().equals(localWorld)) continue;
            double distance = mc.player.getEntityPos().distanceTo(new Vec3d(point.x(), point.y(), point.z()));
            var screenPos = ProjectionUtil.toScreen(point.x(), point.y() + 2.0, point.z());
            if (screenPos.z < 0) continue;

            float clampedX = (float) Math.max(0, Math.min(screenW, screenPos.x));
            float clampedY = (float) Math.max(0, Math.min(screenH, screenPos.y));
            String title = "Globals - " + Math.round(distance) + "m";
            String author = point.username();
            var titleMetrics = render.measureText(font, title, fontSize);
            var authorMetrics = render.measureText(font, author, distanceSize);

            // Отступ между строками
            float lineSpacing = -2;

            float titleBgWidth = titleMetrics.width + paddingX * 1;
            float titleBgHeight = titleMetrics.height + paddingY * 1;
            float authorBgWidth = authorMetrics.width + paddingX * 1;
            float authorBgHeight = authorMetrics.height + paddingY * 0.5f;

            float totalHeight = titleBgHeight + authorBgHeight + lineSpacing;

            render.pushTranslation(clampedX, clampedY);

            // Фон для заголовка (вейпоинт с дистанцией)
            render.rect(-titleBgWidth / 2, -totalHeight, titleBgWidth, titleBgHeight, 0, new Color(0, 0, 0, 160).getRGB());
            render.text(font, -titleMetrics.width / 2f, -totalHeight + paddingY + titleMetrics.height - 7, fontSize, title, 0xFFFFFFFF);

            // Фон для автора
            float authorY = -totalHeight + titleBgHeight + lineSpacing;
            render.rect(-authorBgWidth / 2, authorY, authorBgWidth, authorBgHeight - 2, 0, new Color(0, 0, 0, 160).getRGB());
            render.text(font, -authorMetrics.width / 2f, authorY + paddingY + authorMetrics.height - 8, distanceSize, author, 0xFFB8C0CC);

            render.popTransform();
        }
    }
}
