/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class03420
 *  minecraft.class04193
 *  minecraft.class06541
 */
package com.viaversion.viafabricplus.protocoltranslator.util;

import com.google.gson.JsonObject;
import com.viaversion.viafabricplus.save.AbstractSave;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import minecraft.class03420;
import minecraft.class04193;
import minecraft.class06541;

public final class ProtocolVersionDetector {
    private static final int TIMEOUT = 3000;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static ProtocolVersion get(class03420 class034202, InetSocketAddress inetSocketAddress, ProtocolVersion protocolVersion) throws Exception {
        try (Socket socket = new Socket(class034202.N(), class034202.y());
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             DataOutputStream dataOutputStream2 = new DataOutputStream(byteArrayOutputStream);){
            ProtocolVersion protocolVersion2;
            socket.setTcpNoDelay(true);
            socket.setSoTimeout(3000);
            dataOutputStream2.writeByte(0);
            ProtocolVersionDetector.writeVarInt(dataOutputStream2, protocolVersion.getOriginalVersion());
            if (protocolVersion.olderThanOrEqualTo(ProtocolVersion.v1_17)) {
                ProtocolVersionDetector.writeString(dataOutputStream2, class034202.N());
                dataOutputStream2.writeShort(class034202.y());
            } else {
                ProtocolVersionDetector.writeString(dataOutputStream2, inetSocketAddress.getHostString());
                dataOutputStream2.writeShort(inetSocketAddress.getPort());
            }
            ProtocolVersionDetector.writeVarInt(dataOutputStream2, class04193.field_44974.N());
            ProtocolVersionDetector.writeVarInt(dataOutputStream, byteArrayOutputStream.size());
            dataOutputStream.write(byteArrayOutputStream.toByteArray());
            dataOutputStream.writeByte(1);
            dataOutputStream.writeByte(0);
            int n = ProtocolVersionDetector.readVarInt(dataInputStream);
            if (n <= 0) {
                throw new IllegalStateException("Invalid packet size");
            }
            int n2 = ProtocolVersionDetector.readVarInt(dataInputStream);
            if (n2 != 0) {
                throw new IllegalStateException("Invalid packet ID");
            }
            String string = ProtocolVersionDetector.readString(dataInputStream);
            JsonObject jsonObject = (JsonObject)AbstractSave.GSON.fromJson(string, JsonObject.class);
            if (!jsonObject.has("version")) {
                throw new IllegalStateException("Invalid ping response");
            }
            JsonObject jsonObject2 = jsonObject.getAsJsonObject("version");
            if (!jsonObject2.has("name")) throw new IllegalStateException("Invalid ping response");
            if (!jsonObject2.has("protocol")) {
                throw new IllegalStateException("Invalid ping response");
            }
            int n3 = jsonObject2.get("protocol").getAsInt();
            if (protocolVersion.getOriginalVersion() == n3) {
                ProtocolVersion protocolVersion3 = protocolVersion;
                return protocolVersion3;
            }
            if (ProtocolVersion.isRegistered((int)n3)) {
                ProtocolVersion protocolVersion4 = ProtocolVersion.getProtocol((int)n3);
                return protocolVersion4;
            }
            String string2 = jsonObject2.get("name").getAsString();
            Iterator iterator = ProtocolVersion.getReversedProtocols().iterator();
            block40: while (true) {
                String string3;
                if (!iterator.hasNext()) throw new RuntimeException("Unable to detect the server version\nServer sent an invalid protocol id: " + String.valueOf(class034202) + " (" + string2 + String.valueOf(class06541.field_1070) + ")");
                protocolVersion2 = (ProtocolVersion)iterator.next();
                Iterator iterator2 = protocolVersion2.getIncludedVersions().iterator();
                do {
                    if (!iterator2.hasNext()) continue block40;
                } while (!string2.contains(string3 = (String)iterator2.next()));
                break;
            }
            ProtocolVersion protocolVersion5 = protocolVersion2;
            return protocolVersion5;
        }
    }

    private static String readString(DataInputStream dataInputStream) throws IOException {
        int n = ProtocolVersionDetector.readVarInt(dataInputStream);
        if (n > 131068) {
            throw new IOException("Cannot receive string longer than Short.MAX_VALUE * 4 bytes (got " + n + " bytes)");
        }
        if (n < 0) {
            throw new IOException("Cannot receive string shorter than 0 bytes (got " + n + " bytes)");
        }
        byte[] byArray = new byte[n];
        dataInputStream.readFully(byArray);
        String string = new String(byArray, StandardCharsets.UTF_8);
        if (string.length() > Short.MAX_VALUE) {
            throw new IOException("Cannot receive string longer than Short.MAX_VALUE characters (got " + string.length() + " bytes)");
        }
        return string;
    }

    private static void writeString(DataOutputStream dataOutputStream, String string) throws IOException {
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        ProtocolVersionDetector.writeVarInt(dataOutputStream, byArray.length);
        dataOutputStream.write(byArray);
    }

    private static int readVarInt(DataInputStream dataInputStream) throws IOException {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = dataInputStream.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new IOException("Var int too big");
        } while ((by & 0x80) == 128);
        return n;
    }

    private static void writeVarInt(DataOutputStream dataOutputStream, int n) throws IOException {
        while ((n & 0xFFFFFF80) != 0) {
            dataOutputStream.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        dataOutputStream.writeByte(n);
    }
}

