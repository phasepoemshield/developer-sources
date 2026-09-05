/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10009
 */
package Nursultan;

import Nursultan.class09973;
import Nursultan.class09975;
import Nursultan.class10009;
import java.util.Objects;

public final class class09977 {
    private final class09975 N;
    private final class09973 y;
    private final class09973 L;
    private final class10009 u;

    public static class09977 L(float f) {
        return class09977.y().i(f);
    }

    public class09977 L() {
        return this.N(class10009.N());
    }

    public class10009 M() {
        return this.u;
    }

    private class09977(class09975 class099752, class09973 class099732, class09973 class099733, class10009 class100092) {
        this.N = class099752;
        this.y = class099732;
        this.L = class099733;
        this.u = class100092;
    }

    public class09977 i(float f) {
        return this.N(class10009.N((float)f));
    }

    public class09973 i() {
        return this.y;
    }

    public static class09977 u(float f) {
        return class09977.L(f).N(class09973.CENTER).y(class09973.CENTER);
    }

    public class09975 u() {
        return this.N;
    }

    public class09977 y(class09973 class099732) {
        return new class09977(this.N, this.y, class099732, this.u);
    }

    public static class09977 y() {
        return new class09977(class09975.COLUMN, null, null, null);
    }

    public static class09977 y(float f) {
        return class09977.N(f).N(class09973.CENTER).y(class09973.CENTER);
    }

    public class09977 N(class10009 class100092) {
        return new class09977(this.N, this.y, this.L, Objects.requireNonNull(class100092, "value"));
    }

    public static class09977 N(float f) {
        return class09977.N().i(f);
    }

    public static class09977 N() {
        return new class09977(class09975.ROW, null, null, null);
    }

    public class09977 N(class09973 class099732) {
        return new class09977(this.N, class099732, this.L, this.u);
    }

    public class09973 R() {
        return this.L;
    }
}

