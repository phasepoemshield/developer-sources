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

public class OkZoomerFloatSlider
extends class05801 {
    private final class00392 optionText;
    private final double minValue;
    private final double maxValue;
    private final Consumer<Float> responder;
    private float internalValue;

    public OkZoomerFloatSlider(TrackedValue<Float> trackedValue, class00392 class003922, int n, int n2, int n3, int n4, float f, Consumer<Float> consumer) {
        super(n, n2, n3, n4, (class00392)class05220.N((class00392)class003922, (class00392)class00392.y((String)String.valueOf(f))), 0.0);
        this.optionText = class003922;
        this.responder = consumer;
        this.internalValue = f;
        double d = 0.0;
        double d2 = 100.0;
        if (trackedValue.hasMetadata(RangeSubset.TYPE)) {
            RangeSubset$Range rangeSubset$Range = (RangeSubset$Range)((Object)trackedValue.metadata(RangeSubset.TYPE));
            d = rangeSubset$Range.min();
            d2 = rangeSubset$Range.max();
        }
        this.minValue = d;
        this.maxValue = d2;
        this.field_22753 = (Math.clamp((double)f, (double)d, (double)d2) - d) / (d2 - d);
        this.method_25346();
    }

    public void method_25344() {
        float f = (float)((double)class04995.N((double)(class04995.u((double)class04995.N((double)this.field_22753, (double)0.0, (double)1.0), (double)this.minValue, (double)this.maxValue) * 10.0)) / 10.0);
        this.responder.accept(Float.valueOf(f));
        this.internalValue = f;
    }

    public void method_25346() {
        this.field_22754 = class05220.N((class00392)this.optionText, (class00392)class00392.y((String)String.valueOf(this.internalValue)));
    }
}

