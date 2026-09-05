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

@Name(value="minecraft.ChunkRegionWrite")
@Label(value="Region File Write")
public class class02785
extends class02282 {
    public static final String E = "minecraft.ChunkRegionWrite";
    public static final EventType W = EventType.getEventType(class02785.class);

    public class02785(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
        super(class022772, class073212, class055302, n);
    }
}

