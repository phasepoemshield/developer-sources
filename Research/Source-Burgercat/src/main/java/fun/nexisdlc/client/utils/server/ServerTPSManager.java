package fun.nexisdlc.client.utils.server;

import fun.nexisdlc.client.events.impl.client.EventPacket;
import fun.nexisdlc.client.utils.eventbus.EventHandler;
import fun.nexisdlc.client.utils.math.MathUtil;
import fun.nexisdlc.client.utils.client.IMinecraft;
import net.minecraft.network.packet.s2c.play.WorldTimeUpdateS2CPacket;
import ru.sterford.annotations.NativeCall;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayDeque;

public final class ServerTPSManager implements IMinecraft {
    private static final ServerTPSManager INSTANCE = new ServerTPSManager();

    private static final int MIN_SAMPLES = 8;
    private static final float MIN_TPS = 10.0f;
    private static final float MAX_TPS = 20.0f;

    private final ArrayDeque<Float> samples = new ArrayDeque<>(20);
    private long lastTimeMs;
    private long tickTimeMs;
    private float smoothedTickTimeMs = 50.0f;
    private float tps = 20.0f;

    private ServerTPSManager() {
    }

    public static ServerTPSManager getInstance() {
        return INSTANCE;
    }

    public float getTPS() {
        return round2(tps);
    }

    public float getTpsFactor() {
        if (samples.size() < MIN_SAMPLES) {
            return 1.0f;
        }
        float clamped = MathUtil.clamp(tps, MIN_TPS, MAX_TPS);
        return 20.0f / clamped;
    }

    public float getPreciseTpsFactor() {
        if (samples.isEmpty()) {
            return 1.0f;
        }
        float preciseTps = getPreciseTps();
        if (preciseTps >= 19.8f) {
            return 1.0f;
        }
        return 20.0f / MathUtil.clamp(preciseTps, MIN_TPS, MAX_TPS);
    }

    public float getPreciseTps() {
        if (samples.isEmpty()) {
            return 20.0f;
        }
        Float[] array = samples.toArray(new Float[0]);
        java.util.Arrays.sort(array);
        int mid = array.length / 2;
        float median = array.length % 2 == 0
                ? (array[mid - 1] + array[mid]) * 0.5f
                : array[mid];
        return MathUtil.clamp(median, MIN_TPS, MAX_TPS);
    }

    public long getTickTimeMs() {
        return tickTimeMs;
    }

    @EventHandler
    public void onPacketReceive(EventPacket event) {
        if (!event.isReceive()) return;
        if (!(event.getPacket() instanceof WorldTimeUpdateS2CPacket)) return;

        long now = System.currentTimeMillis();
        if (lastTimeMs != 0L) {
            tickTimeMs = now - lastTimeMs;
            if (tickTimeMs <= 0L) {
                lastTimeMs = now;
                return;
            }
            smoothedTickTimeMs = (float) (smoothedTickTimeMs * 0.9 + tickTimeMs * 0.1);

            if (samples.size() > 20) {
                samples.poll();
            }
            float current = 20.0f * (1000.0f / (float) tickTimeMs);
            samples.add(current);

            float average = 0.0f;
            for (Float value : samples) {
                average += MathUtil.clamp(value, MIN_TPS, MAX_TPS);
            }
            if (!samples.isEmpty()) {
                tps = average / (float) samples.size();
            }
        }

        lastTimeMs = now;
    }

    @NativeCall
    private static float round2(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.floatValue();
    }
}
