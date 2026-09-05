/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  minecraft.class04568
 *  minecraft.class06202
 *  minecraft.class07282
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02087;
import minecraft.class02096;
import minecraft.class02097;
import minecraft.class02104;
import minecraft.class02117;
import minecraft.class02129;
import minecraft.class04568;
import minecraft.class06202;
import minecraft.class07282;
import org.jspecify.annotations.Nullable;

public class class02099 {
    private boolean N;
    private @Nullable class02096 y;
    private @Nullable String L;
    private final @Nullable String u;

    public class02099(@Nullable String string) {
        this.u = string;
    }

    public boolean N(class02097 class020972) {
        if (this.N || this.y == null || this.L == null) {
            return false;
        }
        this.N = true;
        class020972.send(class02129.L, class021042 -> {
            class021042.N(class02117.m, this.y);
            if (this.u != null) {
                class021042.N(class02117.P, this.u);
            }
        });
        return true;
    }

    public void N(String string) {
        this.L = string;
    }

    public void N(class07282 class072822, boolean bl) {
        this.y = switch (class072822) {
            default -> throw new MatchException(null, null);
            case class07282.field_9215 -> {
                if (bl) {
                    yield class02096.field_41485;
                }
                yield class02096.field_41481;
            }
            case class07282.field_9220 -> class02096.field_41482;
            case class07282.field_9216 -> class02096.field_41483;
            case class07282.field_9219 -> class02096.field_41484;
        };
    }

    public void N(class02104 class021042) {
        if (this.L != null) {
            class021042.N(class02117.z, !this.L.equals("vanilla"));
        }
        class021042.N(class02117.U, this.N());
    }

    private class02087 N() {
        class04568 class045682 = class06202.Nq().yN();
        if (class045682 != null && class045682.i()) {
            return class02087.field_41490;
        }
        if (class06202.Nq().v()) {
            return class02087.field_41491;
        }
        return class02087.field_41492;
    }
}

