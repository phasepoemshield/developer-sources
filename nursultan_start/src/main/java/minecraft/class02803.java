/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07321
 */
package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;

@Name(value="minecraft.ChunkGeneration")
@Label(value="Chunk Generation")
@Category(value={"Minecraft", "World Generation"})
@StackTrace(value=false)
@Enabled(value=false)
public class class02803
extends Event {
    public static final String N = "minecraft.ChunkGeneration";
    public static final EventType y = EventType.getEventType(class02803.class);
    @Name(value="worldPosX")
    @Label(value="First Block X World Position")
    public final int L;
    @Name(value="worldPosZ")
    @Label(value="First Block Z World Position")
    public final int u;
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int i;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int R;
    @Name(value="status")
    @Label(value="Status")
    public final String M;
    @Name(value="level")
    @Label(value="Level")
    public final String B;

    public class02803(class07321 class073212, class05946<class07299> class059462, String string) {
        this.M = string;
        this.B = class059462.N().toString();
        this.i = class073212.B;
        this.R = class073212.Z;
        this.L = class073212.i();
        this.u = class073212.R();
    }
}

