package fun.nexisdlc.client.utils.render.main.world;

import net.minecraft.util.math.Vec3d;

/**
 * Рисует окружности в мире как СПЛОШНОЕ кольцо (аннулюс) из quad-сегментов.
 *
 * <p>Соседние сегменты делят общие рёбра (внутренняя и внешняя дуги), поэтому между микро-полосками
 * нет щелей (в отличие от набора отдельных отрезков-линий). Кольцо плоское и лежит
 * в плоскости с нормалью {@code axis}.</p>
 *
 * <p>Эмиттер привязывать к quad-слою ({@code POSITION_COLOR}).</p>
 */
public final class WorldCircleRenderer {

    /**
     * Кол-во сегментов по умолчанию для гладкого кольца.
     */
    public static final int DEFAULT_SEGMENTS = 64;

    /**
     * Пиксель -> мировая полутолщина на 1 блок дистанции (постоянная толщина на экране).
     */
    private static final double PIXEL_TO_WORLD = 0.00075;
    private static final double MIN_HALF_WIDTH = 0.0025;

    private WorldCircleRenderer() {
    }

    /**
     * Горизонтальное кольцо в плоскости XZ (как круг на земле).
     */
    public static void circleHorizontal(WorldGeometryEmitter emitter, Vec3d center, double radius,
                                        Vec3d cameraPos, int color, double px) {
        circle(emitter, center, radius, new Vec3d(0.0, 1.0, 0.0), DEFAULT_SEGMENTS, cameraPos, color, px);
    }

    /**
     * Кольцо, развёрнутое лицом к камере (биллборд).
     */
    public static void circleBillboard(WorldGeometryEmitter emitter, Vec3d center, double radius,
                                       Vec3d cameraPos, int color, double px) {
        Vec3d normal = center.subtract(cameraPos);
        if (normal.lengthSquared() < 1.0E-9) {
            normal = new Vec3d(0.0, 0.0, 1.0);
        }
        circle(emitter, center, radius, normal, DEFAULT_SEGMENTS, cameraPos, color, px);
    }

    /**
     * Общий случай: кольцо в плоскости с нормалью {@code axis}.
     *
     * @param center   центр в мировых координатах
     * @param radius   радиус в блоках
     * @param axis     нормаль плоскости (не обязательно нормализована)
     * @param segments кол-во сегментов (>= 8)
     * @param px       толщина кольца в пикселях
     */
    public static void circle(WorldGeometryEmitter emitter, Vec3d center, double radius, Vec3d axis,
                              int segments, Vec3d cameraPos, int color, double px) {
        int n = Math.max(8, segments);
        if (radius <= 0.0) {
            return;
        }
        double axisLen = axis.length();
        Vec3d normal = axisLen < 1.0E-9 ? new Vec3d(0.0, 1.0, 0.0) : axis.multiply(1.0 / axisLen);

        // базис плоскости: u, v ортогональны normal
        Vec3d helper = Math.abs(normal.y) > 0.99 ? new Vec3d(1.0, 0.0, 0.0) : new Vec3d(0.0, 1.0, 0.0);
        Vec3d u = normal.crossProduct(helper);
        double uLen = u.length();
        if (uLen < 1.0E-9) {
            u = new Vec3d(1.0, 0.0, 0.0);
            uLen = 1.0;
        }
        u = u.multiply(1.0 / uLen);
        Vec3d v = normal.crossProduct(u); // уже единичный

        // толщина постоянная на экране (радиальная, внутрь плоскости)
        double dist = center.subtract(cameraPos).length();
        double half = Math.max(px * dist * PIXEL_TO_WORLD, MIN_HALF_WIDTH);
        double rOuter = radius + half;
        double rInner = Math.max(0.0, radius - half);

        Vec3d[] outer = new Vec3d[n];
        Vec3d[] inner = new Vec3d[n];
        for (int i = 0; i < n; i++) {
            double angle = (Math.PI * 2.0 * i) / n;
            double c = Math.cos(angle);
            double s = Math.sin(angle);
            Vec3d radial = u.multiply(c).add(v.multiply(s));
            outer[i] = center.add(radial.multiply(rOuter)).subtract(cameraPos);
            inner[i] = center.add(radial.multiply(rInner)).subtract(cameraPos);
        }

        // сплошное кольцо: каждый сегмент делит рёбра с соседом -> нет щелей
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            emitter.emitQuad(outer[i], outer[j], inner[j], inner[i], color);
        }
    }
}
