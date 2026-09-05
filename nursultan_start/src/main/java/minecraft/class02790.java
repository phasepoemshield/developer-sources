/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import jdk.jfr.Category;
import jdk.jfr.Event;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Name(value="minecraft.LoadWorld")
@Label(value="Create/Load World")
@Category(value={"Minecraft", "World Generation"})
@StackTrace(value=false)
public class class02790
extends Event {
    public static final String N = "minecraft.LoadWorld";
    public static final EventType y = EventType.getEventType(class02790.class);
}

