/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.AsciiString
 *  minecraft.class00667
 *  minecraft.class00719
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02362
 */
package net.fabricmc.fabric.impl.networking;

import io.netty.util.AsciiString;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import minecraft.class00667;
import minecraft.class00719;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02362;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;

public record RegistrationPayload(class01666<RegistrationPayload> id, List<class01894> channels) implements class01659
{
    public static final class01666<RegistrationPayload> REGISTER = new class01666(NetworkingImpl.REGISTER_CHANNEL);
    public static final class01666<RegistrationPayload> UNREGISTER = new class01666(NetworkingImpl.UNREGISTER_CHANNEL);
    public static final class02362<class00667, RegistrationPayload> REGISTER_CODEC = RegistrationPayload.codec(REGISTER);
    public static final class02362<class00667, RegistrationPayload> UNREGISTER_CODEC = RegistrationPayload.codec(UNREGISTER);

    private RegistrationPayload(class01666<RegistrationPayload> class016662, class00667 class006672) {
        this(class016662, RegistrationPayload.read(class006672));
    }

    private void write(class00667 class006672) {
        boolean bl = true;
        for (class01894 class018942 : this.channels) {
            if (bl) {
                bl = false;
            } else {
                class006672.writeByte(0);
            }
            class006672.writeBytes(class018942.toString().getBytes(StandardCharsets.US_ASCII));
        }
    }

    private static List<class01894> read(class00667 class006672) {
        ArrayList<class01894> arrayList = new ArrayList<class01894>();
        StringBuilder stringBuilder = new StringBuilder();
        while (class006672.isReadable()) {
            byte by = class006672.readByte();
            if (by != 0) {
                stringBuilder.append(AsciiString.b2c((byte)by));
                continue;
            }
            RegistrationPayload.addId(arrayList, stringBuilder);
            stringBuilder = new StringBuilder();
        }
        RegistrationPayload.addId(arrayList, stringBuilder);
        return Collections.unmodifiableList(arrayList);
    }

    public class01666<? extends class01659> method_56479() {
        return this.id;
    }

    private static void addId(List<class01894> list, StringBuilder stringBuilder) {
        String string = stringBuilder.toString();
        try {
            list.add(class01894.N((String)string));
        }
        catch (class00719 class007192) {
            NetworkingImpl.LOGGER.warn("Received invalid channel identifier \"{}\"", (Object)string);
        }
    }

    private static class02362<class00667, RegistrationPayload> codec(class01666<RegistrationPayload> class016662) {
        return class01659.N(RegistrationPayload::write, class006672 -> new RegistrationPayload(class016662, (class00667)class006672));
    }
}

