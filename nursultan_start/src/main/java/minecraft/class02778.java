/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class04748
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
import minecraft.class03556;
import minecraft.class04748;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07321;

@Name(value="minecraft.StructureGeneration")
@Label(value="Structure Generation")
@Category(value={"Minecraft", "World Generation"})
@StackTrace(value=false)
@Enabled(value=false)
public class class02778
extends Event {
    public static final String N = "minecraft.StructureGeneration";
    public static final EventType y = EventType.getEventType(class02778.class);
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int L;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int u;
    @Name(value="structure")
    @Label(value="Structure")
    public final String i;
    @Name(value="level")
    @Label(value="Level")
    public final String R;
    @Name(value="success")
    @Label(value="Success")
    public boolean M;

    public class02778(class07321 class073212, class03556<class04748> class035562, class05946<class07299> class059462) {
        this.L = class073212.B;
        this.u = class073212.Z;
        this.i = class035562.M();
        this.R = class059462.N().toString();
    }
}

