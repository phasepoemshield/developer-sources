/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02277
 *  minecraft.class02282
 *  minecraft.class05530
 *  minecraft.class07321
 */
package minecraft;

import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import minecraft.class02277;
import minecraft.class02282;
import minecraft.class05530;
import minecraft.class07321;

@Name(value="minecraft.ChunkRegionRead")
@Label(value="Region File Read")
public class class02791
extends class02282 {
    public static final String E = "minecraft.ChunkRegionRead";
    public static final EventType W = EventType.getEventType(class02791.class);

    public class02791(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
        super(class022772, class073212, class055302, n);
    }
}

