/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  com.google.common.base.Ticker
 *  com.mojang.logging.LogUtils
 *  minecraft.class02097
 *  minecraft.class02117
 *  minecraft.class02129
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Stopwatch;
import com.google.common.base.Ticker;
import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalLong;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import minecraft.class02097;
import minecraft.class02117;
import minecraft.class02129;
import minecraft.class03497;
import org.slf4j.Logger;

public class class03467 {
    public static final class03467 N = new class03467(Ticker.systemTicker());
    private static final Logger y = LogUtils.getLogger();
    private final Ticker L;
    private final Map<class02117<class03497>, Stopwatch> u = new HashMap<class02117<class03497>, Stopwatch>();
    private OptionalLong i = OptionalLong.empty();

    protected class03467(Ticker ticker) {
        this.L = ticker;
    }

    public synchronized void y(class02117<class03497> class021172) {
        Stopwatch stopwatch = this.u.get(class021172);
        if (stopwatch == null) {
            y.warn("Attempted to end step for {} before starting it", (Object)class021172.y());
            return;
        }
        if (stopwatch.isRunning()) {
            stopwatch.stop();
        }
    }

    public synchronized void N(class02117<class03497> class021173) {
        this.N(class021173, (class02117<class03497> class021172) -> Stopwatch.createStarted((Ticker)this.L));
    }

    public synchronized void N(long l) {
        this.i = OptionalLong.of(l);
    }

    private synchronized void N(class02117<class03497> class021172, Function<class02117<class03497>, Stopwatch> function) {
        this.u.computeIfAbsent(class021172, function);
    }

    public void N(class02097 class020972) {
        class020972.send(class02129.B, class021042 -> {
            class03467 class034672 = this;
            synchronized (class034672) {
                this.u.forEach((class021172, stopwatch) -> {
                    if (!stopwatch.isRunning()) {
                        long l = stopwatch.elapsed(TimeUnit.MILLISECONDS);
                        class021042.N(class021172, (Object)new class03497((int)l));
                    } else {
                        y.warn("Measurement {} was discarded since it was still ongoing when the event {} was sent.", (Object)class021172.y(), (Object)class02129.B.N());
                    }
                });
                this.i.ifPresent(l -> class021042.N(class02117.Y, (Object)new class03497((int)l)));
                this.u.clear();
            }
        });
    }

    public synchronized void N(class02117<class03497> class021173, Stopwatch stopwatch) {
        this.N(class021173, (class02117<class03497> class021172) -> stopwatch);
    }
}

