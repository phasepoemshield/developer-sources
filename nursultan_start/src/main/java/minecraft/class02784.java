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

@Name(value="minecraft.ClientFps")
@Label(value="Client fps")
@Category(value={"Minecraft", "Ticking"})
@StackTrace(value=false)
@Period(value="1 s")
public class class02784
extends Event {
    public static final String N = "minecraft.ClientFps";
    public static final EventType y = EventType.getEventType(class02784.class);
    @Name(value="fps")
    @Label(value="Client fps")
    public final int L;

    public class02784(int n) {
        this.L = n;
    }
}

