/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03771
 *  minecraft.class04206
 *  minecraft.class06911
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.itemgroup;

import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03771;
import minecraft.class04206;
import minecraft.class06911;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public class FabricCreativeGuiComponents {
    static final class01894 BUTTON_TEX = class01894.N((String)"fabric", (String)"textures/gui/creative_buttons.png");
    private static final double TABS_PER_PAGE = 10.0;
    public static final Set<class06911> COMMON_GROUPS = Set.of(class03771.M, class03771.m, class03771.R, class03771.W).stream().map(arg_0 -> ((class00751)class04206.Nz).B(arg_0)).collect(Collectors.toSet());

    public static int getPageCount() {
        return (int)Math.ceil((double)((long)class03771.L().size() - COMMON_GROUPS.stream().filter(class06911::Z).count()) / 10.0);
    }
}

