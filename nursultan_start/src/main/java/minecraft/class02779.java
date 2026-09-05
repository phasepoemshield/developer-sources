/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;

@Name(value="minecraft.NetworkSummary")
@Label(value="Network Summary")
@Category(value={"Minecraft", "Network"})
@StackTrace(value=false)
@Period(value="10 s")
public class class02779
extends Event {
    public static final String N = "minecraft.NetworkSummary";
    public static final EventType y = EventType.getEventType(class02779.class);
    @Name(value="remoteAddress")
    @Label(value="Remote Address")
    public final String L;
    @Name(value="sentBytes")
    @Label(value="Sent Bytes")
    @DataAmount
    public long u;
    @Name(value="sentPackets")
    @Label(value="Sent Packets")
    public int i;
    @Name(value="receivedBytes")
    @Label(value="Received Bytes")
    @DataAmount
    public long R;
    @Name(value="receivedPackets")
    @Label(value="Received Packets")
    public int M;

    public class02779(String string) {
        this.L = string;
    }
}

