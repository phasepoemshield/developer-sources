package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.FastestEvent;
import fun.nexisdlc.client.utils.client.IMinecraft;

import java.util.ConcurrentModificationException;
import java.util.concurrent.locks.LockSupport;

public final class FastestUpdate implements IMinecraft {

    static final long INTERVAL_NS = 5000L;

    private static final FastestEvent EVENT_INSTANCE = new FastestEvent();

    private static volatile boolean running = false;
    private static Thread thread;

    private FastestUpdate() {
    }

    public static void init() {
        if (running) return;
        running = true;

        thread = new Thread(() -> {
            long nextTick = System.nanoTime();

            while (running) {
                try {
                    var client = mc;
                    if (client == null || client.world == null || client.player == null) {
                        LockSupport.parkNanos(1_000_000L);
                        nextTick = System.nanoTime() + INTERVAL_NS;
                        continue;
                    }

                    long now = System.nanoTime();

                    long waitNs = nextTick - now;
                    if (waitNs > 0L) {
                        if (waitNs > 200_000L) {
                            LockSupport.parkNanos(waitNs - 100_000L);
                        } else {
                            Thread.onSpinWait();
                        }
                        continue;
                    }

                    if (now - nextTick > 1_000_000L) {
                        nextTick = now;
                    }

                    try {
                        NexisClient.getEventBus().post(EVENT_INSTANCE);
                    } catch (ConcurrentModificationException ignored) {
                    }

                    nextTick += INTERVAL_NS;

                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }, "fastest-update-aura");

        thread.setDaemon(true);
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
    }

    public static void shutdown() {
        running = false;
        if (thread != null) {
            thread.interrupt();
        }
    }
}