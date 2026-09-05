/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00734
 *  minecraft.class04688
 *  minecraft.class06092
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07322
 *  minecraft.class08057
 */
package net.caffeinemc.mods.lithium.common.world.blockview;

import java.util.List;
import java.util.Optional;
import minecraft.class00394;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00734;
import minecraft.class04688;
import minecraft.class06092;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07322;
import minecraft.class08057;
import net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView$SingleBlockViewException;

public record SingleBlockBlockView(class00500 state, class07209 blockPos) implements class07290,
class07322
{
    public Optional<class06889> method_33594(class07049 class070492, class00494 class004942, class06889 class068892, double d, double d2, double d3) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public int method_31607() {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public boolean method_8587(class07049 class070492, class00734 class007342) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public class00500 method_8320(class07209 class072092) {
        if (class072092.equals((Object)this.blockPos())) {
            return this.state();
        }
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public List<class00494> method_20743(class07049 class070492, class00734 class007342) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public Iterable<class00494> method_20812(class07049 class070492, class00734 class007342) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public class08057 method_8621() {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public class04688 method_8316(class07209 class072092) {
        if (class072092.equals((Object)this.blockPos())) {
            return this.state().Y();
        }
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public static SingleBlockBlockView of(class00500 class005002, class07209 class072092) {
        return new SingleBlockBlockView(class005002, class072092.method_10062());
    }

    public class00394 method_8321(class07209 class072092) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public class07290 method_22338(int n, int n2) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public int method_31605() {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public boolean method_8628(class00500 class005002, class07209 class072092, class06092 class060922) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public boolean method_8606(class07049 class070492) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public Iterable<class00494> method_8600(class07049 class070492, class00734 class007342) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public boolean method_8611(class07049 class070492, class00494 class004942) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }

    public boolean method_39454(class07049 class070492, class00734 class007342) {
        throw SingleBlockBlockView$SingleBlockViewException.INSTANCE;
    }
}

