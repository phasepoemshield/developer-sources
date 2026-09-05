/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10523
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.Lists
 *  com.google.common.net.HostAndPort
 *  com.mojang.datafixers.DataFixer
 *  com.mojang.logging.LogUtils
 *  io.netty.handler.ssl.SslContext
 *  minecraft.class00429
 *  minecraft.class00439
 *  minecraft.class00448
 *  minecraft.class00456
 *  minecraft.class01042
 *  minecraft.class01067
 *  minecraft.class01517
 *  minecraft.class01623
 *  minecraft.class01675
 *  minecraft.class02003
 *  minecraft.class02222
 *  minecraft.class02243
 *  minecraft.class02292
 *  minecraft.class02303
 *  minecraft.class02593
 *  minecraft.class02794
 *  minecraft.class02796
 *  minecraft.class02869
 *  minecraft.class02969
 *  minecraft.class03463
 *  minecraft.class03531
 *  minecraft.class03656
 *  minecraft.class03930
 *  minecraft.class04243
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class04785
 *  minecraft.class04903
 *  minecraft.class04995
 *  minecraft.class05018
 *  minecraft.class05042
 *  minecraft.class05084
 *  minecraft.class05147
 *  minecraft.class05178
 *  minecraft.class05270
 *  minecraft.class05279
 *  minecraft.class05477
 *  minecraft.class06633
 *  minecraft.class06984
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07282
 *  minecraft.class07305
 *  minecraft.class07393
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07640
 *  minecraft.class07701
 *  minecraft.class07910
 *  minecraft.class07911
 *  minecraft.class07980
 *  minecraft.class08036
 *  minecraft.class08152
 *  minecraft.class08759
 *  minecraft.class08773
 *  minecraft.class08774
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10523;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.net.HostAndPort;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import io.netty.handler.ssl.SslContext;
import java.io.BufferedWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.stream.Stream;
import minecraft.class00429;
import minecraft.class00439;
import minecraft.class00448;
import minecraft.class00456;
import minecraft.class01042;
import minecraft.class01067;
import minecraft.class01517;
import minecraft.class01623;
import minecraft.class01675;
import minecraft.class02003;
import minecraft.class02222;
import minecraft.class02243;
import minecraft.class02292;
import minecraft.class02303;
import minecraft.class02593;
import minecraft.class02794;
import minecraft.class02796;
import minecraft.class02869;
import minecraft.class02969;
import minecraft.class03463;
import minecraft.class03531;
import minecraft.class03656;
import minecraft.class03930;
import minecraft.class04243;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class04785;
import minecraft.class04903;
import minecraft.class04995;
import minecraft.class05018;
import minecraft.class05042;
import minecraft.class05084;
import minecraft.class05147;
import minecraft.class05178;
import minecraft.class05270;
import minecraft.class05279;
import minecraft.class05477;
import minecraft.class05589;
import minecraft.class05607;
import minecraft.class05615;
import minecraft.class06633;
import minecraft.class06984;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07282;
import minecraft.class07305;
import minecraft.class07393;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07640;
import minecraft.class07701;
import minecraft.class07910;
import minecraft.class07911;
import minecraft.class07980;
import minecraft.class08036;
import minecraft.class08152;
import minecraft.class08759;
import minecraft.class08773;
import minecraft.class08774;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05623
extends class02796
implements class04243 {
    public static final Logger N = LogUtils.getLogger();
    private static final int W = 5000;
    private static final int m = 2;
    private final List<class03656> P = Collections.synchronizedList(Lists.newArrayList());
    private @Nullable class05178 s;
    private final class05147 T;
    private @Nullable class04903 b;
    private final class05279 j;
    private @Nullable class05589 v;
    private final @Nullable class02593 n;
    private @Nullable class02292 t;
    private boolean G;
    private final class02243 l;
    private final Map<String, String> d;
    private @Nullable class07911 w;
    private long k;

    public void L(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.W.N((class01042)this.yt(), (Object)bl));
    }

    public void L(int n) {
        this.j.N(class052702 -> (class05270)class052702.X.N((class01042)this.yt(), (Object)n));
        this.Nm().y(n);
    }

    public String L() {
        return this.Nb();
    }

    public void M(int n) {
        this.j.N(class052702 -> (class05270)class052702.NR.N((class01042)this.yt(), (Object)n));
    }

    public boolean M() {
        return this.y().F;
    }

    public void M(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.h.N((class01042)this.yt(), (Object)bl));
    }

    public boolean P() {
        return true;
    }

    public void X() {
        while (!this.P.isEmpty()) {
            class03656 class036562 = this.P.remove(0);
            this.yL().N(class036562.y, class036562.N);
        }
    }

    public void K() {
        this.N((class07086)this.y().m.get(), true);
    }

    public class06984 T() {
        return (class06984)this.y().q.get();
    }

    public class05623(Thread thread, class04785 class047852, class01623 class016232, class03531 class035312, class05279 class052792, DataFixer dataFixer, class03930 class039302) {
        super(thread, class047852, class016232, class035312, Proxy.NO_PROXY, dataFixer, class039302, (class08773)class08759.N());
        this.j = class052792;
        this.T = new class05147((class02796)this);
        this.n = class02593.N((class05270)class052792.N());
        this.l = class05623.N(class052792);
        this.d = class052792.N().z ? class05623.ye() : Map.of();
    }

    public void B(int n) {
        this.j.N(class052702 -> (class05270)class052702.r.N((class01042)this.yt(), (Object)n));
    }

    public boolean B() {
        return this.y().A;
    }

    public void B(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.E.N((class01042)this.yt(), (Object)bl));
        this.L(this.v());
    }

    public int C() {
        return (Integer)this.j.N().Ni.get();
    }

    public int D() {
        return this.y().f;
    }

    public int F() {
        return (Integer)this.y().o.get();
    }

    public int S() {
        return (Integer)this.j.N().NR.get();
    }

    public void Z(int n) {
        this.j.N(class052702 -> (class05270)class052702.Nz.N((class01042)this.yt(), (Object)n));
    }

    public void Z(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.NE.N((class01042)this.yt(), (Object)bl));
    }

    public int V() {
        return (Integer)this.j.N().c.get();
    }

    public int e() {
        return (Integer)this.j.N().X.get();
    }

    public String i() {
        return this.x();
    }

    public void i(int n) {
        this.j.N(class052702 -> (class05270)class052702.o.N((class01042)this.yt(), (Object)n));
    }

    public void i(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.B.N((class01042)this.yt(), (Object)bl));
    }

    public String x() {
        return (String)this.j.N().Z.get();
    }

    public String s() {
        return "";
    }

    public void c() {
        super.c();
        this.X();
    }

    public int h() {
        return this.y().p;
    }

    public boolean f() {
        return (Boolean)this.y().h.get();
    }

    public class01675 l() {
        return this.t;
    }

    public class08152 d() {
        return this.y().K;
    }

    public void m() {
        this.Nt().y();
        super.m();
        class07536.U();
    }

    public void p() {
        if (this.v == null) {
            this.v = class05589.N(this);
        }
    }

    public int t() {
        return (Integer)this.j.N().a.get();
    }

    public @Nullable class07282 v() {
        return this.NR() ? this.E.z() : null;
    }

    public boolean j() {
        return this.j.N().C;
    }

    public boolean q() {
        return (Boolean)this.j.N().B.get();
    }

    public int U() {
        return this.y().H;
    }

    public boolean z() {
        return true;
    }

    public void u(int n) {
        this.j.N(class052702 -> (class05270)class052702.a.N((class01042)this.yt(), (Object)n));
    }

    public void u(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.NM.N((class01042)this.yt(), (Object)bl));
    }

    public int u() {
        return this.ar_();
    }

    public boolean r() {
        class05270 class052702 = this.y();
        return class052702.NB && class052702.i && this.U.y();
    }

    public void y(class07282 class072822) {
        this.j.N(class052702 -> (class05270)class052702.P.N((class01042)this.yt(), (Object)class072822));
        this.E.N(this.NM());
        this.L(this.v());
    }

    public void y(int n) {
        this.j.N(class052702 -> (class05270)class052702.c.N((class01042)this.yt(), (Object)n));
        this.Nm().N(n);
    }

    public boolean y(boolean bl, boolean bl2, boolean bl3) {
        this.Nt().L();
        boolean bl4 = super.y(bl, bl2, bl3);
        this.Nt().u();
        return bl4;
    }

    public class05270 y() {
        return this.j.N();
    }

    public void y(String string) {
        this.j.N(class052702 -> (class05270)class052702.Z.N((class01042)this.yt(), (Object)string));
    }

    public boolean E() {
        return this.y().J;
    }

    public boolean A() {
        return (Boolean)this.y().D.get();
    }

    public boolean N() throws IOException {
        Object object;
        Object object2;
        String string;
        String string2;
        int n = this.y().v;
        if (this.y().b) {
            string2 = this.j.N().n;
            if (!class00456.N((String)string2)) {
                throw new IllegalStateException("Invalid management server secret, must be 40 alphanumeric characters");
            }
            string = this.y().j;
            object2 = HostAndPort.fromParts((String)string, (int)n);
            class00456 class004562 = new class00456(string2);
            String string3 = this.y().d;
            class00448 class004482 = new class00448(class004562, string3);
            N.info("Starting json RPC server on {}", object2);
            this.w = new class07911(object2, class004482);
            class07393 class073932 = class07393.N((class05623)this);
            class073932.B().N((class06633)new class07910(class073932, this.w));
            if (this.y().t) {
                object = this.yH();
                this.w.N(class073932, object);
            } else {
                this.w.N(class073932);
            }
        }
        string2 = new class10523(this, "Server console handler");
        ((Thread)((Object)string2)).setDaemon(true);
        ((Thread)((Object)string2)).setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07980(N));
        ((Thread)((Object)string2)).start();
        N.info("Starting minecraft server version {}", (Object)class07529.y().comp_4025());
        if (Runtime.getRuntime().maxMemory() / 1024L / 1024L < 512L) {
            N.warn("To start the server with more ram, launch it as \"java -Xmx1024M -Xms1024M -jar minecraft_server.jar\"");
        }
        N.info("Loading properties");
        string = this.j.N();
        if (this.No()) {
            this.L("127.0.0.1");
        } else {
            this.E(((class05270)string).i);
            this.W(((class05270)string).R);
            this.L(((class05270)string).M);
        }
        this.E.N((class07282)((class05270)string).P.get());
        N.info("Default game type: {}", ((class05270)string).P.get());
        object2 = null;
        if (!this.Nb().isEmpty()) {
            object2 = InetAddress.getByName(this.Nb());
        }
        if (this.ar_() < 0) {
            this.U(((class05270)string).T);
        }
        this.Nq();
        N.info("Starting Minecraft server on {}:{}", (Object)(this.Nb().isEmpty() ? "*" : this.Nb()), (Object)this.ar_());
        try {
            this.Na().N((InetAddress)object2, this.ar_());
        }
        catch (IOException iOException) {
            N.warn("**** FAILED TO BIND TO PORT!");
            N.warn("The exception was: {}", (Object)iOException.toString());
            N.warn("Perhaps a server is already running on that port?");
            return false;
        }
        if (!this.NH()) {
            N.warn("**** SERVER IS RUNNING IN OFFLINE/INSECURE MODE!");
            N.warn("The server will make no attempt to authenticate usernames. Beware.");
            N.warn("While this makes the game possible to play without internet access, it also opens up the ability for hackers to connect with any username they choose.");
            N.warn("To change this, set \"online-mode\" to \"true\" in the server.properties file.");
        }
        if (this.Ny()) {
            this.U.R().N();
        }
        if (!class01067.i((class02796)this)) {
            return false;
        }
        this.N(new class05607(this, (class02003<class02969>)this.yG(), this.Z));
        this.t = new class02292(class02869.values().length, this.yV(), class02303.field_48817);
        long l = class07536.u();
        this.U.R().N(!this.NH());
        N.info("Preparing level \"{}\"", (Object)this.W());
        this.NP();
        long l2 = class07536.u() - l;
        object = String.format(Locale.ROOT, "%.3fs", (double)l2 / 1.0E9);
        N.info("Done ({})! For help, type \"help\"", object);
        if (((class05270)string).w != null) {
            this.E.m().N(class07305.A, (Object)((class05270)string).w, (class02796)this);
        }
        if (((class05270)string).k) {
            N.info("Starting GS4 status listener");
            this.s = class05178.N((class04243)this);
        }
        if (((class05270)string).Q) {
            N.info("Starting remote control listener");
            this.b = class04903.N((class04243)this);
        }
        if (this.NL() > 0L) {
            Thread thread = new Thread(new class05615(this));
            thread.setUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)new class07640(N));
            thread.setName("Server Watchdog");
            thread.setDaemon(true);
            thread.start();
        }
        if (((class05270)string).x) {
            class05084.N((class02796)this);
            N.info("JMX monitoring enabled");
        }
        this.Nt().N();
        return true;
    }

    private static Optional<URI> N(class05270 class052702) {
        String string = class052702.U;
        if (string.isEmpty()) {
            return Optional.empty();
        }
        try {
            return Optional.of(class07536.N((String)string));
        }
        catch (Exception exception) {
            N.warn("Failed to parse bug link {}", (Object)string, (Object)exception);
            return Optional.empty();
        }
    }

    private static class02243 N(class05279 class052792) {
        return class05623.N(class052792.N()).map(uRI -> new class02243(List.of(class02222.field_51981.N(uRI)))).orElse(class02243.N);
    }

    public int N(int n) {
        return this.Ni() * n / 100;
    }

    public void N(Path path) throws IOException {
        class05270 class052702 = this.y();
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(path, new OpenOption[0]);){
            bufferedWriter.write(String.format(Locale.ROOT, "sync-chunk-writes=%s%n", class052702.C));
            bufferedWriter.write(String.format(Locale.ROOT, "gamemode=%s%n", class052702.P.get()));
            bufferedWriter.write(String.format(Locale.ROOT, "entity-broadcast-range-percentage=%d%n", class052702.r.get()));
            bufferedWriter.write(String.format(Locale.ROOT, "max-world-size=%d%n", class052702.f));
            bufferedWriter.write(String.format(Locale.ROOT, "view-distance=%d%n", class052702.c.get()));
            bufferedWriter.write(String.format(Locale.ROOT, "simulation-distance=%d%n", class052702.X.get()));
            bufferedWriter.write(String.format(Locale.ROOT, "generate-structures=%s%n", class052702.NU.u()));
            bufferedWriter.write(String.format(Locale.ROOT, "use-native=%s%n", class052702.J));
            bufferedWriter.write(String.format(Locale.ROOT, "rate-limit=%d%n", class052702.H));
        }
    }

    public class03463 N(class03463 class034632) {
        class034632.N("Is Modded", () -> this.aq_().y());
        class034632.N("Type", () -> "Dedicated Server (map_server.txt)");
        return class034632;
    }

    public void N(class07086 class070862) {
        this.j.N(class052702 -> (class05270)class052702.m.N((class01042)this.yt(), (Object)class070862));
        this.K();
    }

    public void N(String string, class07701 class077012) {
        this.P.add(new class03656(string, class077012));
    }

    public void N(BooleanSupplier booleanSupplier) {
        long l;
        super.N(booleanSupplier);
        if (this.w != null) {
            this.w.N();
        }
        long l2 = class07536.L();
        int n = this.S();
        if (n > 0 && l2 - this.k >= (l = (long)n * class01517.L)) {
            this.k = l2;
            this.Nt().R();
        }
    }

    public String N(String string) {
        this.T.L();
        this.i(() -> this.yL().N(this.T.R(), string));
        return this.T.i();
    }

    public boolean N(class08774 class087742) {
        return false;
    }

    public class05477 N(class04770 class047702) {
        if (this.n != null) {
            return this.n.N(class047702.method_7334());
        }
        return class05477.N;
    }

    public void N(class06984 class069842) {
        this.j.N(class052702 -> (class05270)class052702.q.N((class01042)this.yt(), (Object)class069842));
    }

    public boolean N(class04782 class047822, class07209 class072092, class08036 class080362) {
        int n;
        class05042 class050422 = class047822.method_74854();
        if (class047822.method_27983() != class050422.N()) {
            return false;
        }
        if (this.Nm().E().u()) {
            return false;
        }
        if (this.Nm().R(class080362.method_72498())) {
            return false;
        }
        if (this.F() <= 0) {
            return false;
        }
        class07209 class072093 = class050422.y();
        int n2 = class04995.N((int)(class072092.method_10263() - class072093.method_10263()));
        return Math.max(n2, n = class04995.N((int)(class072092.method_10260() - class072093.method_10260()))) <= this.F();
    }

    public String W() {
        return this.B.R();
    }

    public void R(int n) {
        this.j.N(class052702 -> (class05270)class052702.Ni.N((class01042)this.yt(), (Object)n));
    }

    public boolean R() {
        return this.G;
    }

    public void R(boolean bl) {
        this.j.N(class052702 -> (class05270)class052702.D.N((class01042)this.yt(), (Object)bl));
    }

    public int Ni() {
        return (Integer)this.y().r.get();
    }

    public int Nu() {
        return this.y().e;
    }

    public void H() {
        if (this.n != null) {
            this.n.close();
        }
        if (this.v != null) {
            this.v.y();
        }
        if (this.b != null) {
            this.b.y();
        }
        if (this.s != null) {
            this.s.y();
        }
        if (this.w != null) {
            try {
                this.w.N(true);
            }
            catch (InterruptedException interruptedException) {
                N.error("Interrupted while stopping the management server", (Throwable)interruptedException);
            }
        }
    }

    public boolean Nz() {
        return (Boolean)this.j.N().NE.get();
    }

    public void NZ() {
        super.NZ();
        this.G = this.yV().N(class00429.N);
    }

    public boolean NR() {
        return (Boolean)this.j.N().E.get();
    }

    public Optional<class02794> NB() {
        return this.j.N().NL;
    }

    public long NL() {
        return this.y().V;
    }

    public boolean NN() {
        return this.y().NZ;
    }

    public class07282 NM() {
        return (class07282)this.y().P.get();
    }

    public int NE() {
        return (Integer)this.j.N().Nz.get();
    }

    public class02243 NU() {
        return this.l;
    }

    public Map<String, String> NW() {
        return this.d;
    }

    protected boolean Ny() {
        int n;
        boolean bl = false;
        for (n = 0; !bl && n <= 2; ++n) {
            if (n > 0) {
                N.warn("Encountered a problem while converting the user banlist, retrying in a few seconds");
                this.yc();
            }
            bl = class01067.N((class02796)this);
        }
        boolean bl2 = false;
        for (n = 0; !bl2 && n <= 2; ++n) {
            if (n > 0) {
                N.warn("Encountered a problem while converting the ip banlist, retrying in a few seconds");
                this.yc();
            }
            bl2 = class01067.y((class02796)this);
        }
        boolean bl3 = false;
        for (n = 0; !bl3 && n <= 2; ++n) {
            if (n > 0) {
                N.warn("Encountered a problem while converting the op list, retrying in a few seconds");
                this.yc();
            }
            bl3 = class01067.L((class02796)this);
        }
        boolean bl4 = false;
        for (n = 0; !bl4 && n <= 2; ++n) {
            if (n > 0) {
                N.warn("Encountered a problem while converting the whitelist, retrying in a few seconds");
                this.yc();
            }
            bl4 = class01067.u((class02796)this);
        }
        boolean bl5 = false;
        for (n = 0; !bl5 && n <= 2; ++n) {
            if (n > 0) {
                N.warn("Encountered a problem while converting the player save files, retrying in a few seconds");
                this.yc();
            }
            bl5 = class01067.N((class05623)this);
        }
        return bl || bl2 || bl3 || bl4 || bl5;
    }

    private SslContext yH() {
        try {
            return class00439.N((String)this.y().G, (String)this.y().l);
        }
        catch (Exception exception) {
            class00439.N();
            throw new IllegalStateException("Failed to configure TLS for the server management protocol", exception);
        }
    }

    private void yc() {
        try {
            Thread.sleep(5000L);
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<String, String> ye() {
        Path path = Path.of("codeofconduct", new String[0]);
        if (!Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
            throw new IllegalArgumentException("Code of Conduct folder does not exist: " + String.valueOf(path));
        }
        try {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            try (Stream<Path> var2 = Files.list(path);){
                for (Path path2 : var2.toList()) {
                    String string = path2.getFileName().toString();
                    if (!string.endsWith(".txt")) continue;
                    String string2 = string.substring(0, string.length() - 4).toLowerCase(Locale.ROOT);
                    if (!path2.toRealPath(new LinkOption[0]).getParent().equals(path.toAbsolutePath())) {
                        throw new IllegalArgumentException("Failed to read Code of Conduct file \"" + string + "\" because it links to a file outside the allowed directory");
                    }
                    try {
                        String string3 = String.join((CharSequence)"\n", Files.readAllLines(path2, StandardCharsets.UTF_8));
                        builder.put((Object)string2, (Object)class05018.N((String)string3));
                    }
                    catch (IOException iOException) {
                        throw new IllegalArgumentException("Failed to read Code of Conduct file " + string, iOException);
                        return builder.build();
                    }
                }
            }
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException("Failed to read Code of Conduct folder", iOException);
        }
    }

    public boolean C_() {
        return (Boolean)this.j.N().W.get();
    }

    public boolean D_() {
        return (Boolean)this.j.N().NM.get();
    }
}

