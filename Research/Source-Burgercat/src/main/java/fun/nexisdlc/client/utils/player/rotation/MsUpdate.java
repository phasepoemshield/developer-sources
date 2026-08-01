package fun.nexisdlc.client.utils.player.rotation;

import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.events.impl.client.MsEvent;
import fun.nexisdlc.client.utils.client.IMinecraft;

import java.util.ConcurrentModificationException;
import java.util.concurrent.locks.LockSupport;

public final class MsUpdate implements IMinecraft {

    static final long DEFAULT_MS = 1L;
    private static final MsEvent EVENT_INSTANCE = new MsEvent();
    private static volatile boolean running = false;
    private static Thread thread;

    private MsUpdate() {
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
                        nextTick = System.nanoTime() + DEFAULT_MS * 1_000_000L;
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
                    if (now - nextTick > 50_000_000L) {
                        nextTick = now;
                    }

                    // сброс на дефолт перед каждым постом
                    EVENT_INSTANCE.setMs(DEFAULT_MS);
                    try {
                        NexisClient.getEventBus().post(EVENT_INSTANCE);
                    } catch (ConcurrentModificationException ignored) {
                    }

                    // хэндлер мог вызвать event.setMs(...) — берём задержку отсюда
                    long ms = EVENT_INSTANCE.getMs();
                    if (ms < 1L) ms = 1L; // защита от 0/отрицательных → busy loop
                    nextTick += ms * 1_000_000L;
                } catch (Throwable t) {
                    t.printStackTrace();
                }
            }
        }, "ms-update");
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