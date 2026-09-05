/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
 *  minecraft.class00392
 *  minecraft.class01885
 *  minecraft.class02071
 *  minecraft.class02102
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05361
 *  minecraft.class05362
 *  minecraft.class05733
 *  minecraft.class06197
 *  minecraft.class06202
 *  minecraft.class07536
 */
package minecraft;

import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import minecraft.class00392;
import minecraft.class01885;
import minecraft.class02071;
import minecraft.class02102;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05361;
import minecraft.class05362;
import minecraft.class05733;
import minecraft.class06197;
import minecraft.class06202;
import minecraft.class07536;

public class class01321
extends class05733 {
    private static final class00392 N = class00392.L((String)"chat.link.warning").y(-13108);
    private static final int y = 100;
    private final String L;
    private final boolean u;

    public class01321(BooleanConsumer booleanConsumer, class00392 class003922, class00392 class003923, String string, class00392 class003924, boolean bl) {
        super(booleanConsumer, class003922, class003923);
        this.field_2402 = bl ? class05220.m : class05220.R;
        this.field_2399 = class003924;
        this.u = !bl;
        this.L = string;
    }

    public class01321(BooleanConsumer booleanConsumer, class00392 class003922, class00392 class003923, URI uRI, class00392 class003924, boolean bl) {
        this(booleanConsumer, class003922, class003923, uRI.toString(), class003924, true);
    }

    public class01321(BooleanConsumer booleanConsumer, String string, boolean bl) {
        this(booleanConsumer, (class00392)class01321.N(bl), (class00392)class00392.y((String)string), string, bl ? class05220.i : class05220.M, bl);
    }

    public class01321(BooleanConsumer booleanConsumer, class00392 class003922, String string, boolean bl) {
        this(booleanConsumer, class003922, (class00392)class01321.N(bl, string), string, bl ? class05220.i : class05220.M, bl);
    }

    public class01321(BooleanConsumer booleanConsumer, class00392 class003922, URI uRI, boolean bl) {
        this(booleanConsumer, class003922, uRI.toString(), bl);
    }

    public static class05361 y(class05096 class050962, URI uRI, boolean bl) {
        return class053622 -> class01321.N(class050962, uRI, bl);
    }

    public static class05361 y(class05096 class050962, String string, boolean bl) {
        return class053622 -> class01321.N(class050962, string, bl);
    }

    public static class05361 y(class05096 class050962, URI uRI) {
        return class01321.y(class050962, uRI, true);
    }

    public static class05361 y(class05096 class050962, String string) {
        return class01321.y(class050962, string, true);
    }

    protected static class05216 N(boolean bl, String string) {
        return class01321.N(bl).y(class05220.l).y((class00392)class00392.y((String)string));
    }

    public void N() {
        ((class06197)this.field_22787.L_3).N(this.L);
    }

    public static void N(class05096 class050962, String string, boolean bl2) {
        class06202 class062022 = class06202.Nq();
        class062022.N((class05096)new class01321(bl -> {
            if (bl) {
                class07536.m().N(string);
            }
            class062022.N(class050962);
        }, string, bl2));
    }

    public static void N(class05096 class050962, URI uRI, boolean bl2) {
        class06202 class062022 = class06202.Nq();
        class062022.N((class05096)new class01321(bl -> {
            if (bl) {
                class07536.m().N(uRI);
            }
            class062022.N(class050962);
        }, uRI.toString(), bl2));
    }

    public static void N(class05096 class050962, String string) {
        class01321.N(class050962, string, true);
    }

    protected static class05216 N(boolean bl) {
        return class00392.L((String)(bl ? "chat.link.confirmTrusted" : "chat.link.confirm"));
    }

    public static void N(class05096 class050962, URI uRI) {
        class01321.N(class050962, uRI, true);
    }

    protected void method_37051(class01885 class018852) {
        this.field_61002 = (class05362)class018852.N((class02102)class05362.method_46430((class00392)this.field_2402, class053622 -> this.field_2403.accept(true)).N(100).N());
        class018852.N((class02102)class05362.method_46430((class00392)class05220.P, class053622 -> {
            this.N();
            this.field_2403.accept(false);
        }).N(100).N());
        this.field_61003 = (class05362)class018852.N((class02102)class05362.method_46430((class00392)this.field_2399, class053622 -> this.field_2403.accept(false)).N(100).N());
    }

    protected void method_72128() {
        if (this.u) {
            this.field_61001.N((class02102)new class02071(N, this.field_22793));
        }
    }
}

