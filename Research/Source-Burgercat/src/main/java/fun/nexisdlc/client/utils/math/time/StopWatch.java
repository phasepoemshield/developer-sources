package fun.nexisdlc.client.utils.math.time;

import lombok.Data;
import lombok.Getter;
import net.minecraft.client.MinecraftClient;

@Data
public class StopWatch {

    @Getter
    private long lastMS = System.currentTimeMillis();
    private static final MinecraftClient mc = MinecraftClient.getInstance();

    public void reset() {
        lastMS = System.currentTimeMillis();
    }

    public boolean hasReached(long time) {
        return System.currentTimeMillis() - lastMS >= time;
    }

    public boolean hasReachedWithTPS(long time, float tps) {
        float tpsFactor = 20.0f / Math.max(tps, 1.0f);
        return System.currentTimeMillis() - lastMS >= time * tpsFactor;
    }

    public void setLastMS(long offset) {
        lastMS = System.currentTimeMillis() + offset;
    }

    public void setTime(long time) {
        lastMS = time;
    }

    public long getElapsedTime() {
        return System.currentTimeMillis() - lastMS;
    }

    public boolean isRunning() {
        return System.currentTimeMillis() - lastMS <= 0;
    }

    public boolean isReached(long time) {
        return System.currentTimeMillis() - lastMS > time;
    }

    public boolean hasTimeElapsed() {
        return lastMS < System.currentTimeMillis();
    }
}