package sky.core.util;

import it.unimi.dsi.fastutil.objects.Object2IntMap;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScoreboardObjective;
import sky.core.module.impl.misc.ScoreboardHealth;

public final class ServerUtil {
    private static final MinecraftClient CLIENT = MinecraftClient.getInstance();

    private ServerUtil() {
    }

    public static float getHealth(LivingEntity entity) {
        if (entity instanceof PlayerEntity player && CLIENT.world != null) {
            Scoreboard scoreboard = CLIENT.world.getScoreboard();
            Object2IntMap<ScoreboardObjective> objectives = scoreboard.getScoreHolderObjectives(player);
            for (Object2IntMap.Entry<ScoreboardObjective> entry : objectives.object2IntEntrySet()) {
                return entry.getIntValue();
            }
        }
        return entity.getHealth() + entity.getAbsorptionAmount();
    }

    public static float getDisplayHealth(LivingEntity entity) {
        if (ScoreboardHealth.INSTANCE.isEnabled()) {
            float scoreboardHealth = getHealth(entity);
            float normalHealth = entity.getHealth() + entity.getAbsorptionAmount();
            if (scoreboardHealth == Math.floor(normalHealth)) {
                return entity.getHealth();
            }
            return Math.max(0.0F, scoreboardHealth);
        }
        return entity.getHealth();
    }
}
