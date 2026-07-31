package fun.nexisdlc.modules.impl.utils;

import fun.nexisdlc.client.events.impl.client.UpdateEvent;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.mixins.accessors.BossBarHudAccessor;
import fun.nexisdlc.modules.api.Category;
import fun.nexisdlc.modules.api.Function;
import fun.nexisdlc.modules.api.FunctionAdd;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.BossBarHud;
import net.minecraft.client.gui.hud.ClientBossBar;
import net.minecraft.entity.boss.BossBar;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec3d;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

@FunctionAdd(name = "StructureInfo", alias = "Structure Info", category = Category.Utilities, description = "Информация о структурах")
public class StructureInfo extends Function {
    public final List<TrapPosition> trapPositions = new CopyOnWriteArrayList<>();
    private static final UUID TRAP_BOSSBAR_UUID = UUID.fromString("00000000-0000-0000-0000-000000000001");
    private static final UUID PLAST_BOSSBAR_UUID = UUID.fromString("00000000-0000-0000-0000-000000000002");

    public StructureInfo() {
    }

    public enum TrapType {
        TRAPKA,
        DRAGON_TRAP,
        PLAST,
        DRAGON_PLAST
    }

    public static class TrapPosition {
        public Vec3d position;
        public boolean typeDetermined;
        public TrapType type;
        public long creationTime;
        public long duration;

        public TrapPosition(Vec3d position, TrapType type, long duration) {
            this.position = position;
            this.type = type;
            this.typeDetermined = type != null;
            this.creationTime = System.currentTimeMillis();
            this.duration = duration;
        }
    }

    @EventHandler
    public void onUpdate(UpdateEvent event) {
        if (nullCheck()) {
            clearBossBars();
            return;
        }

        TrapPosition activeTrap = null;
        TrapPosition activePlast = null;

        Vec3d playerPos = mc.player.getEntityPos();
        double px = playerPos.x;
        double py = playerPos.y;
        double pz = playerPos.z;

        for (TrapPosition trap : trapPositions) {
            if (!trap.typeDetermined) continue;

            Vec3d pos = trap.position;
            double dx = Math.abs(px - pos.x);
            double dz = Math.abs(pz - pos.z);
            double dy = Math.abs(py - pos.y);

            boolean isTrap = trap.type == TrapType.TRAPKA || trap.type == TrapType.DRAGON_TRAP;
            boolean isPlast = trap.type == TrapType.PLAST || trap.type == TrapType.DRAGON_PLAST;

            if (isTrap && dx <= 1.5 && dz <= 1.5 && dy <= 3.0) {
                if (activeTrap == null || trap.position.squaredDistanceTo(playerPos) < activeTrap.position.squaredDistanceTo(playerPos)) {
                    activeTrap = trap;
                }
            }

            if (isPlast) {
                double distSq = trap.position.squaredDistanceTo(playerPos);
                if (distSq <= 9.0) {
                    if (activePlast == null || distSq < activePlast.position.squaredDistanceTo(playerPos)) {
                        activePlast = trap;
                    }
                }
            }
        }

        if (activeTrap != null) {
            long remaining = activeTrap.creationTime + activeTrap.duration - System.currentTimeMillis();
            float seconds = Math.max(0f, remaining / 1000.0f);
            float percent = Math.max(0f, Math.min(1f, remaining / (float) activeTrap.duration));

            Text name = Text.literal("Трапка ").formatted(Formatting.GREEN)
                    .append(Text.literal("• ").formatted(Formatting.DARK_GRAY))
                    .append(Text.literal("Активно ещё ").formatted(Formatting.WHITE))
                    .append(Text.literal(String.format("%.1f сек", seconds)).formatted(Formatting.GREEN));

            updateOrCreateBossBar(TRAP_BOSSBAR_UUID, name, percent, BossBar.Color.GREEN);
        } else {
            removeBossBar(TRAP_BOSSBAR_UUID);
        }

        if (activePlast != null) {
            long remaining = activePlast.creationTime + activePlast.duration - System.currentTimeMillis();
            float seconds = Math.max(0f, remaining / 1000.0f);
            float percent = Math.max(0f, Math.min(1f, remaining / (float) activePlast.duration));

            Text name = Text.literal("Пласт ").formatted(Formatting.AQUA)
                    .append(Text.literal("• ").formatted(Formatting.DARK_GRAY))
                    .append(Text.literal("Активно ещё ").formatted(Formatting.WHITE))
                    .append(Text.literal(String.format("%.1f сек", seconds)).formatted(Formatting.AQUA));

            updateOrCreateBossBar(PLAST_BOSSBAR_UUID, name, percent, BossBar.Color.BLUE);
        } else {
            removeBossBar(PLAST_BOSSBAR_UUID);
        }
    }

    @Override
    public void onDisable() {
        clearBossBars();
        super.onDisable();
    }

    private void clearBossBars() {
        removeBossBar(TRAP_BOSSBAR_UUID);
        removeBossBar(PLAST_BOSSBAR_UUID);
    }

    private void updateOrCreateBossBar(UUID uuid, Text name, float percent, BossBar.Color color) {
        BossBarHud bossBarHud = mc.inGameHud != null ? mc.inGameHud.getBossBarHud() : null;
        if (bossBarHud == null) return;

        Map<UUID, ClientBossBar> bossBars = ((BossBarHudAccessor) bossBarHud).getBossBars();
        ClientBossBar bar = bossBars.get(uuid);
        if (bar != null) {
            bar.setName(name);
            bar.setPercent(percent);
            bar.setColor(color);
        } else {
            bossBars.put(uuid, new ClientBossBar(uuid, name, percent, color, BossBar.Style.PROGRESS, false, false, false));
        }
    }

    private void removeBossBar(UUID uuid) {
        BossBarHud bossBarHud = mc.inGameHud != null ? mc.inGameHud.getBossBarHud() : null;
        if (bossBarHud == null) return;

        Map<UUID, ClientBossBar> bossBars = ((BossBarHudAccessor) bossBarHud).getBossBars();
        bossBars.remove(uuid);
    }
}
