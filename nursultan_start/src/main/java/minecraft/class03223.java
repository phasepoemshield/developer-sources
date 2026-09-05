/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10159
 *  com.mojang.logging.LogUtils
 *  minecraft.class00648
 *  minecraft.class01834
 *  minecraft.class02277
 *  minecraft.class02778
 *  minecraft.class02779
 *  minecraft.class02780
 *  minecraft.class02784
 *  minecraft.class02785
 *  minecraft.class02788
 *  minecraft.class02790
 *  minecraft.class02791
 *  minecraft.class02799
 *  minecraft.class02800
 *  minecraft.class02803
 *  minecraft.class02897
 *  minecraft.class03299
 *  minecraft.class03556
 *  minecraft.class04748
 *  minecraft.class05530
 *  minecraft.class05946
 *  minecraft.class06290
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10159;
import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.SocketAddress;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import jdk.jfr.Configuration;
import jdk.jfr.Event;
import jdk.jfr.FlightRecorder;
import jdk.jfr.FlightRecorderListener;
import jdk.jfr.Recording;
import minecraft.class00648;
import minecraft.class01834;
import minecraft.class02277;
import minecraft.class02778;
import minecraft.class02779;
import minecraft.class02780;
import minecraft.class02784;
import minecraft.class02785;
import minecraft.class02788;
import minecraft.class02790;
import minecraft.class02791;
import minecraft.class02799;
import minecraft.class02800;
import minecraft.class02803;
import minecraft.class02897;
import minecraft.class03207;
import minecraft.class03215;
import minecraft.class03299;
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class05530;
import minecraft.class05946;
import minecraft.class06290;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07529;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03223
implements class01834 {
    private static final Logger B = LogUtils.getLogger();
    public static final String N = "Minecraft";
    public static final String y = "World Generation";
    public static final String L = "Ticking";
    public static final String u = "Network";
    public static final String i = "Storage";
    private static final List<Class<? extends Event>> Z = List.of(class02803.class, class02791.class, class02785.class, class02800.class, class02780.class, class02779.class, class02788.class, class02784.class, class02778.class, class02790.class);
    private static final String z = "/flightrecorder-config.jfc";
    private static final DateTimeFormatter U = new DateTimeFormatterBuilder().appendPattern("yyyy-MM-dd-HHmmss").toFormatter(Locale.ROOT).withZone(ZoneId.systemDefault());
    private static final class03223 E = new class03223();
    @Nullable Recording R;
    private int W;
    private float m;
    private final Map<String, class02799> P = new ConcurrentHashMap<String, class02799>();
    private final Runnable s = () -> new class02784(this.W).commit();
    private final Runnable T = () -> new class02788(this.m).commit();
    private final Runnable b = () -> {
        Iterator<class02799> var1 = this.P.values().iterator();
        while (var1.hasNext()) {
            var1.next().N();
            var1.remove();
        }
    };

    public Path L() {
        if (this.R == null) {
            throw new IllegalStateException("Not currently profiling");
        }
        this.P.clear();
        Path path = this.R.getDestination();
        this.R.stop();
        return path;
    }

    private void M() {
        FlightRecorder.addListener(new class03207(this));
    }

    private class03223() {
        Z.forEach(FlightRecorder::register);
        this.N();
        FlightRecorder.addListener((FlightRecorderListener)new class10159(this));
    }

    public boolean i() {
        return FlightRecorder.isAvailable();
    }

    public boolean u() {
        return this.R != null;
    }

    public void y(class00648 class006482, class02897<?> class028972, SocketAddress socketAddress, int n) {
        if (class02780.M.isEnabled()) {
            new class02780(class006482.N(), class028972.N().y(), class028972.y().toString(), socketAddress, n).commit();
        }
        if (class02779.y.isEnabled()) {
            this.N(socketAddress).N(n);
        }
    }

    public void y(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
        if (class02785.W.isEnabled()) {
            new class02785(class022772, class073212, class055302, n).commit();
        }
    }

    public static class03223 y() {
        return E;
    }

    public @Nullable class03299 N(class07321 class073212, class05946<class07299> class059462, String string) {
        if (!class02803.y.isEnabled()) {
            return null;
        }
        class02803 class028032 = new class02803(class073212, class059462, string);
        class028032.begin();
        return bl -> class028032.commit();
    }

    public @Nullable class03299 N(class07321 class073212, class05946<class07299> class059462, class03556<class04748> class035562) {
        if (!class02778.y.isEnabled()) {
            return null;
        }
        class02778 class027782 = new class02778(class073212, class035562, class059462);
        class027782.begin();
        return bl -> {
            class027782.M = bl;
            class027782.commit();
        };
    }

    private class02799 N(SocketAddress socketAddress) {
        return this.P.computeIfAbsent(socketAddress.toString(), class02799::new);
    }

    private boolean N(Reader reader, class03215 class032152) {
        if (this.u()) {
            B.warn("Profiling already in progress");
            return false;
        }
        try {
            Configuration configuration = Configuration.create(reader);
            String string = U.format(Instant.now());
            this.R = (Recording)class07536.N((Object)new Recording(configuration), (T recording) -> {
                Z.forEach(recording::enable);
                recording.setDumpOnExit(true);
                recording.setToDisk(true);
                recording.setName(String.format(Locale.ROOT, "%s-%s-%s", class032152.N(), class07529.y().comp_4025(), string));
            });
            Path path = Paths.get(String.format(Locale.ROOT, "debug/%s-%s.jfr", class032152.N(), string), new String[0]);
            class06290.L((Path)path.getParent());
            this.R.setDestination(path);
            this.R.start();
            this.M();
        }
        catch (IOException | ParseException exception) {
            B.warn("Failed to start jfr profiling", (Throwable)exception);
            return false;
        }
        B.info("Started flight recorder profiling id({}):name({}) - will dump to {} on exit or stop command", new Object[]{this.R.getId(), this.R.getName(), this.R.getDestination()});
        return true;
    }

    public void N(float f) {
        if (class02788.y.isEnabled()) {
            this.m = f;
        }
    }

    public void N(int n) {
        if (class02784.y.isEnabled()) {
            this.W = n;
        }
    }

    private static void N(Class<? extends Event> clazz, Runnable runnable) {
        FlightRecorder.removePeriodicEvent(runnable);
        FlightRecorder.addPeriodicEvent(clazz, runnable);
    }

    public void N(class00648 class006482, class02897<?> class028972, SocketAddress socketAddress, int n) {
        if (class02800.M.isEnabled()) {
            new class02800(class006482.N(), class028972.N().y(), class028972.y().toString(), socketAddress, n).commit();
        }
        if (class02779.y.isEnabled()) {
            this.N(socketAddress).y(n);
        }
    }

    public boolean N(class03215 class032152) {
        boolean bl;
        URL uRL = class03223.class.getResource(z);
        if (uRL == null) {
            B.warn("Could not find default flight recorder config at {}", (Object)z);
            return false;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream(), StandardCharsets.UTF_8));
        try {
            bl = this.N(bufferedReader, class032152);
        }
        catch (Throwable throwable) {
            try {
                try {
                    bufferedReader.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                B.warn("Failed to start flight recorder using configuration at {}", (Object)uRL, (Object)iOException);
                return false;
            }
        }
        bufferedReader.close();
        return bl;
    }

    public void N(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
        if (class02791.W.isEnabled()) {
            new class02791(class022772, class073212, class055302, n).commit();
        }
    }

    public void N() {
        class03223.N(class02784.class, this.s);
        class03223.N(class02788.class, this.T);
        class03223.N(class02779.class, this.b);
    }

    public @Nullable class03299 R() {
        if (!class02790.y.isEnabled()) {
            return null;
        }
        class02790 class027902 = new class02790();
        class027902.begin();
        return bl -> class027902.commit();
    }
}

