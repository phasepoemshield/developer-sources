/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03199
 */
package minecraft;

import java.net.SocketAddress;
import jdk.jfr.EventType;
import jdk.jfr.Label;
import jdk.jfr.Name;
import minecraft.class03199;

@Name(value="minecraft.PacketSent")
@Label(value="Network Packet Sent")
public class class02780
extends class03199 {
    public static final String R = "minecraft.PacketSent";
    public static final EventType M = EventType.getEventType(class02780.class);

    public class02780(String string, String string2, String string3, SocketAddress socketAddress, int n) {
        super(string, string2, string3, socketAddress, n);
    }
}

