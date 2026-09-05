/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.MatchException
 *  minecraft.class00667
 *  minecraft.class01015
 *  minecraft.class02362
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.UnaryOperator;
import minecraft.class00667;
import minecraft.class01015;
import minecraft.class01261;
import minecraft.class02362;

public final class class01263 {
    public static final class02362<class00667, class01263> N = class02362.N(class01261.B, class012632 -> class012632.L, class01261.B, class012632 -> class012632.u, class01261.B, class012632 -> class012632.i, class01261.B, class012632 -> class012632.R, class01263::new);
    public static final MapCodec<class01263> y = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class01261.u.forGetter(class012632 -> class012632.L), (App)class01261.i.forGetter(class012632 -> class012632.u), (App)class01261.R.forGetter(class012632 -> class012632.i), (App)class01261.M.forGetter(class012632 -> class012632.R)).apply(instance, class01263::new));
    private class01261 L;
    private class01261 u;
    private class01261 i;
    private class01261 R;

    public boolean L(class01015 class010152) {
        return this.N(class010152).y();
    }

    public class01263() {
        this(class01261.L, class01261.L, class01261.L, class01261.L);
    }

    private class01263(class01261 class012612, class01261 class012613, class01261 class012614, class01261 class012615) {
        this.L = class012612;
        this.u = class012613;
        this.i = class012614;
        this.R = class012615;
    }

    public void y(class01015 class010152, boolean bl) {
        this.N(class010152, class012612 -> class012612.y(bl));
    }

    public boolean y(class01015 class010152) {
        return this.N(class010152).N();
    }

    public class01261 N(class01015 class010152) {
        return switch (class010152) {
            default -> throw new MatchException(null, null);
            case class01015.field_25763 -> this.L;
            case class01015.field_25764 -> this.u;
            case class01015.field_25765 -> this.i;
            case class01015.field_25766 -> this.R;
        };
    }

    public void N(class01015 class010152, boolean bl) {
        this.N(class010152, class012612 -> class012612.N(bl));
    }

    public class01263 N() {
        return new class01263(this.L, this.u, this.i, this.R);
    }

    public void N(class01263 class012632) {
        this.L = class012632.L;
        this.u = class012632.u;
        this.i = class012632.i;
        this.R = class012632.R;
    }

    private void N(class01015 class010152, UnaryOperator<class01261> unaryOperator) {
        switch (class010152) {
            case field_25763: {
                this.L = (class01261)((Object)unaryOperator.apply(this.L));
                break;
            }
            case field_25764: {
                this.u = (class01261)((Object)unaryOperator.apply(this.u));
                break;
            }
            case field_25765: {
                this.i = (class01261)((Object)unaryOperator.apply(this.i));
                break;
            }
            case field_25766: {
                this.R = (class01261)((Object)unaryOperator.apply(this.R));
            }
        }
    }
}

