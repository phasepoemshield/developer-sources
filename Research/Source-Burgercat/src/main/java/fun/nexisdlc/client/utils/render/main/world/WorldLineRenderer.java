package fun.nexisdlc.client.utils.render.main.world;

import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

/**
 * Рисует НАСТОЯЩИЕ линии в мире как тонкие quad-ленты, развёрнутые биллбордом к камере.
 *
 * <p>Зачем: GL-line слои ({@link WorldRenderLayers#LINES(double)} и др.) в этом движке не задают
 * line-width шейдеру линий -> толщина 0 -> линии не видны. Quad-путь ширину шейдера не использует
 * и рендерится надёжно.</p>
 *
 * <p>Эмиттер привязывать к quad-слою ({@code POSITION_COLOR}), например
 * {@link WorldRenderLayers#POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH()}. Мировые координаты переводятся в camera-relative внутри.</p>
 */
public final class WorldLineRenderer {

    /**
     * Пиксель -> мировая полуширина на 1 блок дистанции (постоянная толщина на экране).
     */
    public static final double PIXEL_TO_WORLD = 0.00075;
    /**
     * Минимальная полуширина, чтобы близкие линии не исчезали.
     */
    public static final double MIN_HALF_WIDTH = 0.0025;

    private WorldLineRenderer() {
    }

    /**
     * Рёбра бокса (12 линий). worldBox — в мировых координатах.
     */
    public static void box(WorldGeometryEmitter emitter, Box worldBox, Vec3d cameraPos, int color, double px) {
        double x0 = worldBox.minX - cameraPos.x, y0 = worldBox.minY - cameraPos.y, z0 = worldBox.minZ - cameraPos.z;
        double x1 = worldBox.maxX - cameraPos.x, y1 = worldBox.maxY - cameraPos.y, z1 = worldBox.maxZ - cameraPos.z;

        // нижняя рамка
        rel(emitter, x0, y0, z0, x1, y0, z0, color, color, px);
        rel(emitter, x1, y0, z0, x1, y0, z1, color, color, px);
        rel(emitter, x1, y0, z1, x0, y0, z1, color, color, px);
        rel(emitter, x0, y0, z1, x0, y0, z0, color, color, px);

        // верхняя рамка
        rel(emitter, x0, y1, z0, x1, y1, z0, color, color, px);
        rel(emitter, x1, y1, z0, x1, y1, z1, color, color, px);
        rel(emitter, x1, y1, z1, x0, y1, z1, color, color, px);
        rel(emitter, x0, y1, z1, x0, y1, z0, color, color, px);

        // вертикальные стойки
        rel(emitter, x0, y0, z0, x0, y1, z0, color, color, px);
        rel(emitter, x1, y0, z0, x1, y1, z0, color, color, px);
        rel(emitter, x1, y0, z1, x1, y1, z1, color, color, px);
        rel(emitter, x0, y0, z1, x0, y1, z1, color, color, px);
    }

    /**
     * Одна линия между двумя мировыми точками (однотонная).
     */
    public static void line(WorldGeometryEmitter emitter, Vec3d aWorld, Vec3d bWorld, Vec3d cameraPos, int color, double px) {
        line(emitter, aWorld, bWorld, cameraPos, color, color, px);
    }

    /**
     * Линия с градиентом цвета от точки a к точке b.
     */
    public static void line(WorldGeometryEmitter emitter, Vec3d aWorld, Vec3d bWorld, Vec3d cameraPos,
                            int colorA, int colorB, double px) {
        rel(emitter,
                aWorld.x - cameraPos.x, aWorld.y - cameraPos.y, aWorld.z - cameraPos.z,
                bWorld.x - cameraPos.x, bWorld.y - cameraPos.y, bWorld.z - cameraPos.z,
                colorA, colorB, px);
    }

    /**
     * Биллборд-лента по уже camera-relative координатам (камера = начало координат).
     */
    private static void rel(WorldGeometryEmitter emitter,
                            double ax, double ay, double az,
                            double bx, double by, double bz, int colorA, int colorB, double px) {
        Vec3d a = new Vec3d(ax, ay, az);
        Vec3d b = new Vec3d(bx, by, bz);
        Vec3d diff = b.subtract(a);
        double len = diff.length();
        if (len < 1.0E-9) {
            return;
        }
        Vec3d dir = diff.multiply(1.0 / len);
        Vec3d mid = a.add(b).multiply(0.5);
        double dist = mid.length();
        Vec3d toCam = dist < 1.0E-6 ? new Vec3d(0.0, 0.0, 1.0) : mid.multiply(-1.0 / dist);

        Vec3d side = dir.crossProduct(toCam);
        double sideLen = side.length();
        if (sideLen < 1.0E-6) {
            side = dir.crossProduct(new Vec3d(0.0, 1.0, 0.0));
            sideLen = side.length();
            if (sideLen < 1.0E-6) {
                side = new Vec3d(1.0, 0.0, 0.0);
                sideLen = 1.0;
            }
        }
        double half = Math.max(px * dist * PIXEL_TO_WORLD, MIN_HALF_WIDTH);
        side = side.multiply(half / sideLen);

        Vec3d c0 = a.add(side);
        Vec3d c1 = b.add(side);
        Vec3d c2 = b.subtract(side);
        Vec3d c3 = a.subtract(side);
        // градиент: сторона a -> colorA, сторона b -> colorB
        emitter.emitQuad(c0, c1, c2, c3, colorA, colorB, colorB, colorA);
    }
}
