/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01056
 *  minecraft.class04141
 *  minecraft.class04927
 *  minecraft.class05021
 *  minecraft.class05216
 *  minecraft.class05220
 *  minecraft.class05362
 *  minecraft.class06223
 *  minecraft.class06366
 *  minecraft.class07282
 *  minecraft.class08337
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01056;
import minecraft.class04141;
import minecraft.class04927;
import minecraft.class05021;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05220;
import minecraft.class05362;
import minecraft.class06223;
import minecraft.class06366;
import minecraft.class07282;
import minecraft.class08337;
import org.jspecify.annotations.Nullable;

public class class05131
extends class05096 {
    private static final int N = 1024;
    private static final int y = 65535;
    private static final class00392 L = class00392.L((String)"selectWorld.allowCommands");
    private static final class00392 u = class00392.L((String)"selectWorld.gameMode");
    private static final class00392 i = class00392.L((String)"lanServer.otherPlayers");
    private static final class00392 R = class00392.L((String)"lanServer.port");
    private static final class00392 M = class00392.N((String)"lanServer.port.unavailable", (Object[])new Object[]{1024, 65535});
    private static final class00392 B = class00392.N((String)"lanServer.port.invalid", (Object[])new Object[]{1024, 65535});
    private final class05096 Z;
    private class07282 z = class07282.field_9215;
    private boolean U;
    private int E = class05021.N();
    private @Nullable class04927 W;

    public class05131(class05096 class050962) {
        super((class00392)class00392.L((String)"lanServer.title"));
        this.Z = class050962;
    }

    private @Nullable class00392 N(String string) {
        if (string.isBlank()) {
            this.E = class05021.N();
            return null;
        }
        try {
            this.E = Integer.parseInt(string);
            if (this.E < 1024 || this.E > 65535) {
                return B;
            }
            if (!class05021.N((int)this.E)) {
                return M;
            }
            return null;
        }
        catch (NumberFormatException numberFormatException) {
            this.E = class05021.N();
            return B;
        }
    }

    @Override
    public void method_25426() {
        class08337 class083372 = this.field_22787.Na();
        this.z = class083372.NT();
        this.U = class083372.yn().E();
        this.method_37063(class06366.N(class07282::u, (Object)this.z).N((Object[])new class07282[]{class07282.field_9215, class07282.field_9219, class07282.field_9220, class07282.field_9216}).N(this.field_22789 / 2 - 155, 100, 150, 20, u, (class063662, class072822) -> {
            this.z = class072822;
        }));
        this.method_37063(class06366.N((boolean)this.U).N(this.field_22789 / 2 + 5, 100, 150, 20, L, (class063662, bl) -> {
            this.U = bl;
        }));
        class05362 class053623 = class05362.method_46430((class00392)class00392.L((String)"lanServer.start"), class053622 -> {
            this.field_22787.N(null);
            class05216 class052162 = class083372.N(this.z, this.U, this.E) ? class06223.y((int)this.E) : class00392.L((String)"commands.publish.failed");
            ((class01056)this.field_22787.i_6).i().N((class00392)class052162);
            this.field_22787.NT().L((class00392)class052162);
            this.field_22787.yZ();
        }).N(this.field_22789 / 2 - 155, this.field_22790 - 28, 150, 20).N();
        this.W = new class04927(this.field_22793, this.field_22789 / 2 - 75, 160, 150, 20, (class00392)class00392.L((String)"lanServer.port"));
        this.W.method_1863(string -> {
            class00392 class003922 = this.N((String)string);
            this.W.method_47404((class00392)class00392.y((String)("" + this.E)));
            if (class003922 == null) {
                this.W.method_1868(-2039584);
                this.W.method_47400(null);
                class053622.field_22763 = true;
            } else {
                this.W.method_1868(-2142128);
                this.W.method_47400(class04141.N((class00392)class003922));
                class053622.field_22763 = false;
            }
        });
        this.W.method_47404((class00392)class00392.y((String)("" + this.E)));
        this.method_37063(this.W);
        this.method_37063(class053623);
        this.method_37063(class05362.method_46430((class00392)class05220.i, class053622 -> this.method_25419()).N(this.field_22789 / 2 + 5, this.field_22790 - 28, 150, 20).N());
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.N(this.field_22793, this.field_22785, this.field_22789 / 2, 50, -1);
        class010542.N(this.field_22793, i, this.field_22789 / 2, 82, -1);
        class010542.N(this.field_22793, R, this.field_22789 / 2, 142, -1);
    }

    @Override
    public void method_25419() {
        this.field_22787.N(this.Z);
    }
}

