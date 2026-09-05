/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.CooldownsHud
 *  Nursultan.EffectsHud
 *  Nursultan.HotkeysHud
 *  Nursultan.InventoryHud
 *  Nursultan.LogoHud
 *  Nursultan.NotifyHud
 *  Nursultan.TargetInfoHud
 */
package Nursultan;

import Nursultan.CooldownsHud;
import Nursultan.EffectsHud;
import Nursultan.HotkeysHud;
import Nursultan.InventoryHud;
import Nursultan.LogoHud;
import Nursultan.NotifyHud;
import Nursultan.TargetInfoHud;
import Nursultan.class11769;
import java.util.List;

public class class11730 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public static Object N_4;
    public static Object N_5;
    public static Object N_6;
    public static Object N_7;

    private class11730() {
    }

    static {
        class11730.N();
        class11730.u();
        N_0 = new EffectsHud();
        N_1 = new HotkeysHud();
        N_2 = new InventoryHud();
        N_3 = new TargetInfoHud();
        N_4 = new LogoHud();
        N_5 = new CooldownsHud();
        N_6 = new NotifyHud();
        N_7 = List.of(N_4, N_0, N_2, N_1, N_3, N_5, N_6);
    }

    private static void u() {
        N_0 = null;
        N_1 = null;
        N_2 = null;
        N_3 = null;
        N_4 = null;
        N_5 = null;
        N_6 = null;
        N_7 = null;
    }

    private static void N() {
    }

    public static class11769 N(String string) {
        return ((List)N_7).stream().filter(class117692 -> class117692.E().equals(string)).findFirst().orElse(null);
    }
}

