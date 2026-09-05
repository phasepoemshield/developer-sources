/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04995
 *  minecraft.class05220
 *  minecraft.class05801
 *  org.quiltmc.config.api.values.TrackedValue
 */
package page.langeweile.ok_zoomer.config.screen.components;

import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class04995;
import minecraft.class05220;
import minecraft.class05801;
import org.quiltmc.config.api.values.TrackedValue;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset;
import page.langeweile.ok_zoomer.config.metadata.RangeSubset$Range;

public class OkZoomerIntegerSlider
extends class05801 {
    private final class00392 optionText;
    private final int minValue;
    private final int maxValue;
    private final Consumer<Integer> responder;
    private int internalValue;

    public OkZoomerIntegerSlider(TrackedValue<Integer> trackedValue, class00392 class003922, int n, int n2, int n3, int n4, int n5, Consumer<Integer> consumer) {
        super(n, n2, n3, n4, (class00392)class05220.N((class00392)class003922, (class00392)class00392.y((String)String.valueOf(n5))), 0.0);
        this.optionText = class003922;
        this.responder = consumer;
        this.internalValue = n5;
        int n6 = 0;
        int n7 = 100;
        if (trackedValue.hasMetadata(RangeSubset.TYPE)) {
            RangeSubset$Range rangeSubset$Range = (RangeSubset$Range)((Object)trackedValue.metadata(RangeSubset.TYPE));
            n6 = rangeSubset$Range.min();
            n7 = rangeSubset$Range.max();
        }
        this.minValue = n6;
        this.maxValue = n7;
        this.field_22753 = (double)Math.clamp((long)n5, (int)n6, (int)n7) / (double)(n7 - n6);
        this.method_25346();
    }

    public void method_25344() {
        int n = class04995.N((double)class04995.u((double)class04995.N((double)this.field_22753, (double)0.0, (double)1.0), (double)this.minValue, (double)this.maxValue));
        this.responder.accept(n);
        this.internalValue = n;
    }

    public void method_25346() {
        this.field_22754 = class05220.N((class00392)this.optionText, (class00392)class00392.y((String)String.valueOf(this.internalValue)));
    }
}

