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

@Name(value="minecraft.PacketReceived")
@Label(value="Network Packet Received")
public class class02800
extends class03199 {
    public static final String R = "minecraft.PacketReceived";
    public static final EventType M = EventType.getEventType(class02800.class);

    public class02800(String string, String string2, String string3, SocketAddress socketAddress, int n) {
        super(string, string2, string3, socketAddress, n);
    }
}

