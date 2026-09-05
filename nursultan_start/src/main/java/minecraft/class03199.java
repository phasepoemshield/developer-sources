/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.net.SocketAddress;
import jdk.jfr.Category;
import jdk.jfr.DataAmount;
import jdk.jfr.Enabled;
import jdk.jfr.Event;
import jdk.jfr.Label;
import jdk.jfr.Name;
import jdk.jfr.StackTrace;

@Category(value={"Minecraft", "Network"})
@StackTrace(value=false)
@Enabled(value=false)
public abstract class class03199
extends Event {
    @Name(value="protocolId")
    @Label(value="Protocol Id")
    public final String N;
    @Name(value="packetDirection")
    @Label(value="Packet Direction")
    public final String y;
    @Name(value="packetId")
    @Label(value="Packet Id")
    public final String L;
    @Name(value="remoteAddress")
    @Label(value="Remote Address")
    public final String u;
    @Name(value="bytes")
    @Label(value="Bytes")
    @DataAmount
    public final int i;

    public class03199(String string, String string2, String string3, SocketAddress socketAddress, int n) {
        this.N = string;
        this.y = string2;
        this.L = string3;
        this.u = socketAddress.toString();
        this.i = n;
    }
}

