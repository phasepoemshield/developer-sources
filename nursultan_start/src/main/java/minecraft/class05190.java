/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class05944
 *  minecraft.class06202
 *  minecraft.class06434
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class05096;
import minecraft.class05217;
import minecraft.class05231;
import minecraft.class05944;
import minecraft.class06202;
import minecraft.class06434;
import org.jspecify.annotations.Nullable;

public class class05190 {
    private final class06202 N;
    private final class05096 y;
    private int L;
    private int u;
    private String i = "";
    private class05217 R = class05217.field_62201;
    private @Nullable class05231 M = null;
    private @Nullable Consumer<class06434> B = null;
    private @Nullable Consumer<class05944> Z = null;

    public class05190(class06202 class062022, class05096 class050962) {
        this.N = class062022;
        this.y = class050962;
    }

    public class05190 y(Consumer<class05944> consumer) {
        this.Z = consumer;
        return this;
    }

    public class05231 y() {
        return new class05231(this.y, this.N, this.L, this.u, this.i, this.M, this.B, this.Z, this.R);
    }

    public class05190 y(int n) {
        this.u = n;
        return this;
    }

    public class05190 N(int n) {
        this.L = n;
        return this;
    }

    public class05190 N() {
        this.R = class05217.field_62202;
        return this;
    }

    public class05190 N(@Nullable class05231 class052312) {
        this.M = class052312;
        return this;
    }

    public class05190 N(Consumer<class06434> consumer) {
        this.B = consumer;
        return this;
    }

    public class05190 N(String string) {
        this.i = string;
        return this;
    }
}

