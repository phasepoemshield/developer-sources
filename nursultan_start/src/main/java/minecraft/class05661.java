/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00296
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class04972
 *  minecraft.class05322
 *  minecraft.class06096
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
import minecraft.class06096;
import minecraft.class06222;
import minecraft.class06570;
import minecraft.class07476;
import minecraft.class08044;

public class class05661
extends class04972<class06096> {
    private static final class01894 N = class01894.y((String)"container/blast_furnace/lit_progress");
    private static final class01894 y = class01894.y((String)"container/blast_furnace/burn_progress");
    private static final class01894 L = class01894.y((String)"textures/gui/container/blast_furnace.png");
    private static final class00392 u = class00392.L((String)"gui.recipebook.toggleRecipes.blastable");
    private static final List<class05322> n = List.of(new class05322(class00296.field_54839), new class05322(class06570.Nn, class06222.B), new class05322(class06570.Tq, class06570.bk, class06222.Z));

    public class05661(class06096 class060962, class08044 class080442, class00392 class003922) {
        super((class07476)class060962, class080442, class003922, u, L, N, y, n);
    }
}

