/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.Period;
import jdk.jfr.StackTrace;
import jdk.jfr.Timespan;

@Name(value="minecraft.ServerTickTime")
@Label(value="Server Tick Time")
@Category(value={"Minecraft", "Ticking"})
@StackTrace(value=false)
@Period(value="1 s")
public class class02788
extends Event {
    public static final String N = "minecraft.ServerTickTime";
    public static final EventType y = EventType.getEventType(class02788.class);
    @Name(value="averageTickDuration")
    @Label(value="Average Server Tick Duration")
    @Timespan
    public final long L;

    public class02788(float f) {
        this.L = (long)(1000000.0f * f);
    }
}

