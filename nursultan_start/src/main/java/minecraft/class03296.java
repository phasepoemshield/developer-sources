/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class00753
 *  minecraft.class02796
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class05220
 *  minecraft.class05946
 *  minecraft.class06889
 *  minecraft.class06984
 *  minecraft.class07049
 *  minecraft.class07109
 *  minecraft.class07299
 *  minecraft.class07701
 *  minecraft.class08152
 *  org.apache.commons.io.IOUtils
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Scanner;
import minecraft.class00753;
import minecraft.class02796;
import minecraft.class03304;
import minecraft.class03305;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class05220;
import minecraft.class05946;
import minecraft.class06889;
import minecraft.class06984;
import minecraft.class07049;
import minecraft.class07109;
import minecraft.class07299;
import minecraft.class07701;
import minecraft.class08152;
import org.apache.commons.io.IOUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class03296 {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 5;
    private final String L;
    private final int u;
    private final class02796 i;
    private volatile boolean R;
    private @Nullable Socket M;
    private @Nullable Thread B;

    public void L() {
        String string = this.L + ":" + this.u;
        while (this.R) {
            try {
                N.info("Connecting to remote control server {}", (Object)string);
                this.M = new Socket(this.L, this.u);
                N.info("Connected to remote control server! Will continuously execute the command broadcasted by that server.");
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(this.M.getInputStream(), StandardCharsets.US_ASCII));){
                    while (this.R) {
                        String string2 = bufferedReader.readLine();
                        if (string2 == null) {
                            N.warn("Lost connection to remote control server {}. Will retry in {}s.", (Object)string, (Object)5);
                            break;
                        }
                        this.N(string2);
                    }
                }
                catch (IOException iOException) {
                    N.warn("Lost connection to remote control server {}. Will retry in {}s.", (Object)string, (Object)5);
                }
            }
            catch (IOException iOException) {
                N.warn("Failed to connect to remote control server {}. Will retry in {}s.", (Object)string, (Object)5);
            }
            if (!this.R) continue;
            try {
                Thread.sleep(5000L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }

    public class03296(String string, int n, class02796 class027962) {
        this.L = string;
        this.u = n;
        this.i = class027962;
    }

    private Optional<class03304> y(Scanner scanner) {
        class05946 var2 = (class05946)class03305.N.get((Object)scanner.next());
        if (var2 == null) {
            return Optional.empty();
        }
        float f = scanner.nextFloat();
        float f2 = scanner.nextFloat();
        float f3 = scanner.nextFloat();
        float f4 = scanner.nextFloat();
        float f5 = scanner.nextFloat();
        return Optional.of(new class03304((class05946<class07299>)var2, new class06889((double)f, (double)f2, (double)f3), new class07109(f5, f4)));
    }

    public void y() {
        this.R = false;
        IOUtils.closeQuietly((Socket)this.M);
        this.M = null;
        this.B = null;
    }

    private void y(String string) {
        this.i.execute(() -> {
            List var2 = this.i.Nm().v();
            if (var2.isEmpty()) {
                return;
            }
            class04770 class047702 = (class04770)var2.get(0);
            class04782 class047822 = this.i.NY();
            class07701 class077012 = new class07701(class047702.method_64401(), class06889.N((class00753)class047822.method_74854().y()), class07109.N, class047822, (class08152)class06984.i, "", class05220.N, this.i, (class07049)class047702);
            this.i.yL().N(class077012, string);
        });
    }

    private void N(Scanner scanner) {
        this.y(scanner).ifPresent(class033042 -> this.y(String.format(Locale.ROOT, "execute in %s run tp @s %.3f %.3f %.3f %.3f %.3f", class033042.N().N(), class033042.y().M, class033042.y().B, class033042.y().Z, Float.valueOf(class033042.L().U), Float.valueOf(class033042.L().z))));
    }

    public void N() {
        if (this.B != null && this.B.isAlive()) {
            N.warn("Remote control client was asked to start, but it is already running. Will ignore.");
        }
        this.R = true;
        this.B = new Thread(this::L, "chase-client");
        this.B.setDaemon(true);
        this.B.start();
    }

    private void N(String string) {
        try (Scanner scanner = new Scanner(new StringReader(string));){
            scanner.useLocale(Locale.ROOT);
            String string2 = scanner.next();
            if ("t".equals(string2)) {
                this.N(scanner);
            } else {
                N.warn("Unknown message type '{}'", (Object)string2);
            }
        }
        catch (NoSuchElementException noSuchElementException) {
            N.warn("Could not parse message '{}', ignoring", (Object)string);
        }
    }
}

