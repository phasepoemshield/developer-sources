/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01224
 *  minecraft.class01894
 *  minecraft.class03860
 *  minecraft.class05074
 *  minecraft.class05946
 *  minecraft.class06069
 *  minecraft.class06273
 *  minecraft.class06993
 *  minecraft.class07209
 *  minecraft.class07536
 */
package minecraft;

import java.util.Map;
import minecraft.class01224;
import minecraft.class01894;
import minecraft.class03860;
import minecraft.class04890;
import minecraft.class04940;
import minecraft.class05074;
import minecraft.class05946;
import minecraft.class06069;
import minecraft.class06273;
import minecraft.class06993;
import minecraft.class07209;
import minecraft.class07536;

public class class04914 {
    private static final int L = 32;
    static final class07209 N = new class07209(4, 0, 15);
    private static final class01894[] u = new class01894[]{class01894.y((String)"shipwreck/with_mast"), class01894.y((String)"shipwreck/sideways_full"), class01894.y((String)"shipwreck/sideways_fronthalf"), class01894.y((String)"shipwreck/sideways_backhalf"), class01894.y((String)"shipwreck/rightsideup_full"), class01894.y((String)"shipwreck/rightsideup_fronthalf"), class01894.y((String)"shipwreck/rightsideup_backhalf"), class01894.y((String)"shipwreck/with_mast_degraded"), class01894.y((String)"shipwreck/rightsideup_full_degraded"), class01894.y((String)"shipwreck/rightsideup_fronthalf_degraded"), class01894.y((String)"shipwreck/rightsideup_backhalf_degraded")};
    private static final class01894[] i = new class01894[]{class01894.y((String)"shipwreck/with_mast"), class01894.y((String)"shipwreck/upsidedown_full"), class01894.y((String)"shipwreck/upsidedown_fronthalf"), class01894.y((String)"shipwreck/upsidedown_backhalf"), class01894.y((String)"shipwreck/sideways_full"), class01894.y((String)"shipwreck/sideways_fronthalf"), class01894.y((String)"shipwreck/sideways_backhalf"), class01894.y((String)"shipwreck/rightsideup_full"), class01894.y((String)"shipwreck/rightsideup_fronthalf"), class01894.y((String)"shipwreck/rightsideup_backhalf"), class01894.y((String)"shipwreck/with_mast_degraded"), class01894.y((String)"shipwreck/upsidedown_full_degraded"), class01894.y((String)"shipwreck/upsidedown_fronthalf_degraded"), class01894.y((String)"shipwreck/upsidedown_backhalf_degraded"), class01894.y((String)"shipwreck/sideways_full_degraded"), class01894.y((String)"shipwreck/sideways_fronthalf_degraded"), class01894.y((String)"shipwreck/sideways_backhalf_degraded"), class01894.y((String)"shipwreck/rightsideup_full_degraded"), class01894.y((String)"shipwreck/rightsideup_fronthalf_degraded"), class01894.y((String)"shipwreck/rightsideup_backhalf_degraded")};
    static final Map<String, class05946<class05074>> y = Map.of("map_chest", class06273.J, "treasure_chest", class06273.q, "supply_chest", class06273.o);

    public static class04940 N(class01224 class012242, class07209 class072092, class06993 class069932, class03860 class038602, class06069 class060692, boolean bl) {
        class01894 class018942 = (class01894)class07536.N((Object[])(bl ? u : i), (class06069)class060692);
        class04940 class049402 = new class04940(class012242, class018942, class072092, class069932, bl);
        class038602.N((class04890)((Object)class049402));
        return class049402;
    }
}

