/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05530
 *  minecraft.class07321
 */
package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;
import minecraft.class02277;
import minecraft.class05530;
import minecraft.class07321;

@Category(value={"Minecraft", "Storage"})
@StackTrace(value=false)
@Enabled(value=false)
public abstract class class02282
extends Event {
    @Name(value="regionPosX")
    @Label(value="Region X Position")
    public final int N;
    @Name(value="regionPosZ")
    @Label(value="Region Z Position")
    public final int y;
    @Name(value="localPosX")
    @Label(value="Local X Position")
    public final int L;
    @Name(value="localPosZ")
    @Label(value="Local Z Position")
    public final int u;
    @Name(value="chunkPosX")
    @Label(value="Chunk X Position")
    public final int i;
    @Name(value="chunkPosZ")
    @Label(value="Chunk Z Position")
    public final int R;
    @Name(value="level")
    @Label(value="Level Id")
    public final String M;
    @Name(value="dimension")
    @Label(value="Dimension")
    public final String B;
    @Name(value="type")
    @Label(value="Type")
    public final String Z;
    @Name(value="compression")
    @Label(value="Compression")
    public final String z;
    @Name(value="bytes")
    @Label(value="Bytes")
    public final int U;

    public class02282(class02277 class022772, class07321 class073212, class05530 class055302, int n) {
        this.N = class073212.Z();
        this.y = class073212.z();
        this.L = class073212.U();
        this.u = class073212.E();
        this.i = class073212.B;
        this.R = class073212.Z;
        this.M = class022772.N();
        this.B = class022772.y().N().toString();
        this.Z = class022772.L();
        this.z = "standard:" + class055302.y();
        this.U = n;
    }
}

