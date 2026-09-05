/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.utils.Dimension
 *  minecraft.class02112
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class06478
 *  org.joml.Vector2i
 *  org.joml.Vector2ic
 */
package dev.isxander.yacl3.gui;

import dev.isxander.yacl3.api.utils.Dimension;
import dev.isxander.yacl3.gui.AbstractWidget;
import java.util.function.Supplier;
import minecraft.class02112;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class06478;
import org.joml.Vector2i;
import org.joml.Vector2ic;

public class YACLTooltipPositioner
implements class02112 {
    private final Supplier<class03255> buttonDimensions;

    public YACLTooltipPositioner(Supplier<class03255> supplier) {
        this.buttonDimensions = supplier;
    }

    public YACLTooltipPositioner(AbstractWidget abstractWidget) {
        this.buttonDimensions = () -> {
            Dimension<Integer> dimension = abstractWidget.getDimension();
            return new class03255(((Integer)dimension.x()).intValue(), ((Integer)dimension.y()).intValue(), ((Integer)dimension.width()).intValue(), ((Integer)dimension.height()).intValue());
        };
    }

    public YACLTooltipPositioner(class06478 class064782) {
        this.buttonDimensions = () -> ((class06478)class064782).method_48202();
    }

    public Vector2ic method_47944(int n, int n2, int n3, int n4, int n5, int n6) {
        class03255 class032552 = this.buttonDimensions.get();
        int n7 = class032552.u() + class032552.M() / 2;
        int n8 = class032552.y() - n6 - 4;
        int n9 = class032552.y() + class032552.B() + 4;
        int n10 = n2 - (n9 + n6);
        int n11 = n8 - n6;
        int n12 = n8;
        if (n11 < 8) {
            n12 = n10 > n11 ? n9 : n8;
        }
        int n13 = class04995.N((int)(n7 - n5 / 2), (int)-4, (int)(n - n5 - 4));
        return new Vector2i(n13, n12);
    }
}

