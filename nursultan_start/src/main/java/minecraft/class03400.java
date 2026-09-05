/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03375
 *  minecraft.class03377
 *  minecraft.class03379
 *  minecraft.class03382
 *  minecraft.class03576
 *  minecraft.class04714
 *  minecraft.class04966
 *  minecraft.class04967
 *  minecraft.class04979
 *  minecraft.class05111
 *  minecraft.class05685
 *  minecraft.class07536
 */
package minecraft;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import minecraft.class03375;
import minecraft.class03377;
import minecraft.class03379;
import minecraft.class03382;
import minecraft.class03398;
import minecraft.class03416;
import minecraft.class03576;
import minecraft.class04714;
import minecraft.class04966;
import minecraft.class04967;
import minecraft.class04979;
import minecraft.class05111;
import minecraft.class05685;
import minecraft.class07536;

public class class03400 {
    public final class03377 N = new class03377((Executor)class07536.Z(), TimeUnit.MILLISECONDS, (class03382)class07536.u);
    private final List<class03416<?>> Z;
    public final class03416<List<class03576>> y;
    public final class03416<class03379> L;
    public final class03416<Integer> u;
    public final class03416<Boolean> i;
    public final class03416<class04979> R;
    public final class03416<class04966> M;
    public final class03398 B = new class03398(new class04714());

    public class03400(class05111 class051112) {
        this.L = this.N.N("server list", () -> {
            class04967 class049672 = class051112.L();
            if (class05685.N()) {
                return new class03379(class049672.N(), class051112.u());
            }
            return new class03379(class049672.N(), List.of());
        }, Duration.ofSeconds(60L), class03375.N);
        this.u = this.N.N("pending invite count", () -> ((class05111)class051112).z(), Duration.ofSeconds(10L), class03375.N((int)360));
        this.i = this.N.N("trial availablity", () -> ((class05111)class051112).m(), Duration.ofSeconds(60L), class03375.N((int)60));
        this.R = this.N.N("unread news", () -> ((class05111)class051112).W(), Duration.ofMinutes(5L), class03375.N);
        this.y = this.N.N("notifications", () -> ((class05111)class051112).i(), Duration.ofMinutes(5L), class03375.N);
        this.M = this.N.N("online players", () -> ((class05111)class051112).M(), Duration.ofSeconds(10L), class03375.N);
        this.Z = List.of(this.y, this.L, this.u, this.i, this.R, this.M);
    }

    public List<class03416<?>> N() {
        return this.Z;
    }
}

