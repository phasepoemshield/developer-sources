/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02774
 *  minecraft.class04909
 */
package minecraft;

import java.util.Map;
import minecraft.class01894;
import minecraft.class02774;
import minecraft.class04909;
import minecraft.class08963;

public class class08971 {
    private static final class08963 N = new class08963(class04909.MI, class04909.Ml, class04909.Md, class04909.MG, class01894.y((String)"textures/entity/copper_golem/copper_golem.png"), class01894.y((String)"textures/entity/copper_golem/copper_golem_eyes.png"));
    private static final class08963 y = new class08963(class04909.MI, class04909.Ml, class04909.Md, class04909.MG, class01894.y((String)"textures/entity/copper_golem/exposed_copper_golem.png"), class01894.y((String)"textures/entity/copper_golem/exposed_copper_golem_eyes.png"));
    private static final class08963 L = new class08963(class04909.MJ, class04909.Mk, class04909.MY, class04909.Mw, class01894.y((String)"textures/entity/copper_golem/weathered_copper_golem.png"), class01894.y((String)"textures/entity/copper_golem/weathered_copper_golem_eyes.png"));
    private static final class08963 u = new class08963(class04909.Mo, class04909.MO, class04909.Mg, class04909.MQ, class01894.y((String)"textures/entity/copper_golem/oxidized_copper_golem.png"), class01894.y((String)"textures/entity/copper_golem/oxidized_copper_golem_eyes.png"));
    private static final Map<class02774, class08963> i = Map.of(class02774.field_28704, N, class02774.field_28705, y, class02774.field_28706, L, class02774.field_28707, u);

    public static class08963 N(class02774 class027742) {
        return i.get(class027742);
    }
}

