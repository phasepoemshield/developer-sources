/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class03476
 *  minecraft.class08743
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import minecraft.class00394;
import minecraft.class02578;
import minecraft.class02609;
import minecraft.class03476;
import minecraft.class08743;
import org.jspecify.annotations.Nullable;

public final class class02586 {
    public final List<class00394> N = new ArrayList<class00394>();
    public final Map<class08743, class02609> y = new EnumMap<class08743, class02609>(class08743.class);
    public class03476 L = new class03476();
    public @Nullable class02578 u;

    public void N() {
        this.y.values().forEach(class02609::close);
    }
}

