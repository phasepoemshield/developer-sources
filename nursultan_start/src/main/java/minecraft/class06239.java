/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00296
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04972
 *  minecraft.class05322
 *  minecraft.class06085
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
import minecraft.class06085;
import minecraft.class06222;
import minecraft.class06570;
import minecraft.class07476;
import minecraft.class08044;

public class class06239
extends class04972<class06085> {
    private static final class01894 N = class01894.y((String)"container/smoker/lit_progress");
    private static final class01894 y = class01894.y((String)"container/smoker/burn_progress");
    private static final class01894 L = class01894.y((String)"textures/gui/container/smoker.png");
    private static final class00392 u = class00392.L((String)"gui.recipebook.toggleRecipes.smokable");
    private static final List<class05322> n = List.of(new class05322(class00296.field_54840), new class05322(class06570.bo, class06222.z));

    public class06239(class06085 class060852, class08044 class080442, class00392 class003922) {
        super((class07476)class060852, class080442, class003922, u, L, N, y, n);
    }
}

