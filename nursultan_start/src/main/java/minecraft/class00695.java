/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01312
 *  minecraft.class01325
 *  minecraft.class01599
 *  minecraft.class04293
 *  minecraft.class04782
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07280
 *  minecraft.class08299
 *  minecraft.class08329
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00690;
import minecraft.class01312;
import minecraft.class01325;
import minecraft.class01599;
import minecraft.class04293;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07280;
import minecraft.class08299;
import minecraft.class08329;
import org.jspecify.annotations.Nullable;

public class class00695
extends class07049 {
    public final class00690 N;
    public final String y;
    private final class01325 L;

    public class01325 method_18377(class01312 class013122) {
        return this.L;
    }

    public @Nullable class06584 method_31480() {
        return this.N.method_31480();
    }

    public boolean method_31746() {
        return false;
    }

    public class00381<class07280> method_18002(class01599 class015992) {
        throw new UnsupportedOperationException();
    }

    protected void method_5693(class04293 class042932) {
    }

    public final boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (this.method_64421(class070722)) {
            return false;
        }
        return this.N.N(class047822, this, class070722, f);
    }

    protected void method_5652(class08329 class083292) {
    }

    public boolean method_5863() {
        return true;
    }

    protected void method_5749(class08299 class082992) {
    }

    public boolean method_5779(class07049 class070492) {
        return this == class070492 || this.N == class070492;
    }

    public class00695(class00690 class006902, String string, float f, float f2) {
        super(class006902.method_5864(), class006902.method_73183());
        this.L = class01325.y((float)f, (float)f2);
        this.method_18382();
        this.N = class006902;
        this.y = string;
    }
}

