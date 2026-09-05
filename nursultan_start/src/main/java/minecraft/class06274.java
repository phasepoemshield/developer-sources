/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00296
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04972
 *  minecraft.class05322
 *  minecraft.class05670
 *  minecraft.class06222
 *  minecraft.class06570
 *  minecraft.class07476
 *  minecraft.class08044
 */
package minecraft;

import java.util.List;
import minecraft.class00296;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class04972;
import minecraft.class05322;
import minecraft.class05670;
import minecraft.class06222;
import minecraft.class06570;
import minecraft.class07476;
import minecraft.class08044;

public class class06274
extends class04972<class05670> {
    private static final class01894 N = class01894.y((String)"container/furnace/lit_progress");
    private static final class01894 y = class01894.y((String)"container/furnace/burn_progress");
    private static final class01894 L = class01894.y((String)"textures/gui/container/furnace.png");
    private static final class00392 u = class00392.L((String)"gui.recipebook.toggleRecipes.smeltable");
    private static final List<class05322> n = List.of(new class05322(class00296.field_54838), new class05322(class06570.bo, class06222.i), new class05322(class06570.y, class06222.R), new class05322(class06570.jW, class06570.Ty, class06222.M));

    public class06274(class05670 class056702, class08044 class080442, class00392 class003922) {
        super((class07476)class056702, class080442, class003922, u, L, N, y, n);
    }
}

