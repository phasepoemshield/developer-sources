/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01590
 *  minecraft.class02102
 *  minecraft.class03686
 *  minecraft.class04654
 *  minecraft.class04723
 *  minecraft.class04948
 *  minecraft.class04969
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class05407
 *  minecraft.class06478
 *  minecraft.class07086
 *  minecraft.class07282
 */
package minecraft;

import java.util.Locale;
import minecraft.class00392;
import minecraft.class01590;
import minecraft.class02102;
import minecraft.class03686;
import minecraft.class04654;
import minecraft.class04723;
import minecraft.class04948;
import minecraft.class04969;
import minecraft.class05096;
import minecraft.class05115;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class05407;
import minecraft.class06478;
import minecraft.class07086;
import minecraft.class07282;

public class class05112
extends class05407 {
    private static final class00392 L = class00392.L((String)"mco.backup.info.title");
    private static final class00392 u = class00392.L((String)"mco.backup.unknown");
    private final class05096 i;
    final class04948 N;
    final class03686 y = new class03686((class05096)((Object)this));
    private class05115 R;

    private class00392 L(String string) {
        try {
            return class04969.valueOf((String)string.toUpperCase(Locale.ROOT)).N();
        }
        catch (Exception exception) {
            return class04969.field_63822.N();
        }
    }

    public class05112(class05096 class050962, class04948 class049482) {
        super(L);
        this.i = class050962;
        this.N = class049482;
    }

    private class00392 y(String string) {
        try {
            return ((class07282)class04723.y.get(Integer.parseInt(string))).u();
        }
        catch (Exception exception) {
            return u;
        }
    }

    static /* synthetic */ class01590 y(class05112 class051122) {
        return class051122.field_22793;
    }

    static /* synthetic */ class01590 N(class05112 class051122) {
        return class051122.field_22793;
    }

    private class00392 N(String string) {
        try {
            return ((class07086)class04723.N.get(Integer.parseInt(string))).y();
        }
        catch (Exception exception) {
            return u;
        }
    }

    class00392 N(String string, String string2) {
        String string3 = string.toLowerCase(Locale.ROOT);
        if (string3.contains("game") && string3.contains("mode")) {
            return this.y(string2);
        }
        if (string3.contains("game") && string3.contains("difficulty")) {
            return this.N(string2);
        }
        if (string.equals("world_type")) {
            return this.L(string2);
        }
        return class00392.y((String)string2);
    }

    public void method_25426() {
        this.y.N(L, this.field_22793);
        this.R = (class05115)this.y.L((class02102)new class05115(this, this.field_22787));
        this.y.y((class02102)class05362.method_46430((class00392)class05220.U, class053622 -> this.method_25419()).N());
        this.method_48640();
        this.y.method_48206(class046542 -> {
            class06478 cfr_ignored_0 = (class06478)this.method_37063((class04654)class046542);
        });
    }

    public void method_48640() {
        this.R.method_57712(this.field_22789, this.y);
        this.y.N();
    }

    public void method_25419() {
        this.field_22787.N(this.i);
    }
}

