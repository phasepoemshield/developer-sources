/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11472
 *  Nursultan.class11498
 *  Nursultan.class11518
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessagePack
 *  org.msgpack.core.MessageUnpacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class11290;
import Nursultan.class11296;
import Nursultan.class11472;
import Nursultan.class11498;
import Nursultan.class11518;
import Nursultan.class11938;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;

public class class11325 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;
    public static Object y_3;
    public static Object y_4;

    private static byte[] L(UUID uUID) {
        byte[] byArray = new byte[16];
        long l = uUID.getMostSignificantBits();
        long l2 = uUID.getLeastSignificantBits();
        for (int i = 0; i < 8; ++i) {
            byArray[i] = (byte)(l >>> 8 * (7 - i));
            byArray[8 + i] = (byte)(l2 >>> 8 * (7 - i));
        }
        return byArray;
    }

    public Collection<class11290> L() {
        return List.copyOf(((Map)this.N_1).values());
    }

    public class11325() {
        this.U();
        this.N_0 = ((Path)y_4).resolve(String.valueOf(((class11472)class11938.L_2).M()));
        this.N_1 = new LinkedHashMap();
        this.N_2 = new AtomicLong();
    }

    static {
        class11325.z();
        y_0 = LogManager.getLogger(String.class);
        y_4 = ((Path)class11518.N_0).resolve("presets");
    }

    private void U() {
    }

    private static void z() {
        y_0 = null;
        y_1 = 50;
        y_2 = 1;
        y_3 = ".preset";
        y_4 = null;
    }

    public void u() {
        if (!Files.isDirectory((Path)this.N_0, new LinkOption[0])) {
            return;
        }
        try (DirectoryStream<Path> var1 = Files.newDirectoryStream((Path)this.N_0, "*.preset");){
            for (Path path : var1) {
                class11290 class112902 = this.N(path);
                if (class112902 == null) continue;
                ((Map)this.N_1).put(class112902.u(), class112902);
            }
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to enumerate preset directory", (Throwable)iOException);
        }
    }

    public int y() {
        return ((Map)this.N_1).size();
    }

    public void y(UUID uUID) {
        if (((Map)this.N_1).remove(uUID) != null) {
            ((AtomicLong)this.N_2).incrementAndGet();
        }
        Path path = ((Path)this.N_0).resolve(String.valueOf(uUID) + ".preset");
        try {
            Files.deleteIfExists(path);
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to delete preset file {}", (Object)uUID, (Object)iOException);
        }
    }

    private static UUID N(byte[] byArray) {
        long l = 0L;
        long l2 = 0L;
        for (int i = 0; i < 8; ++i) {
            l = l << 8 | (long)byArray[i] & 0xFFL;
            l2 = l2 << 8 | (long)byArray[8 + i] & 0xFFL;
        }
        return new UUID(l, l2);
    }

    public Optional<class11290> N(long l) {
        if (l <= 0L) {
            return Optional.empty();
        }
        return ((Map)this.N_1).values().stream().filter(class112902 -> class112902.Z() == l).findFirst();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void N(class11290 class112902) {
        Path path = ((Path)this.N_0).resolve(String.valueOf(class112902.u()) + ".preset");
        Path path2 = ((Path)this.N_0).resolve(String.valueOf(class112902.u()) + ".preset." + String.valueOf(UUID.randomUUID()) + ".tmp");
        try {
            byte[] byArray;
            Files.createDirectories((Path)this.N_0, new FileAttribute[0]);
            class11290 class112903 = this.N(class112902, path);
            try (MessageBufferPacker messageBufferPacker = MessagePack.newDefaultBufferPacker();){
                this.N(messageBufferPacker, class112903);
                byArray = messageBufferPacker.toByteArray();
            }
            Files.write(path2, class11498.N((byte[])byArray), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
            Files.move(path2, path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            ((Map)this.N_1).put(class112903.u(), class112903);
            ((AtomicLong)this.N_2).incrementAndGet();
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to save preset {}", (Object)class112902.u(), (Object)iOException);
        }
        finally {
            try {
                Files.deleteIfExists(path2);
            }
            catch (IOException iOException) {}
        }
    }

    private class11290 N(Path path) {
        class11290 class112902;
        block8: {
            byte[] byArray = Files.readAllBytes(path);
            MessageUnpacker messageUnpacker = MessagePack.newDefaultUnpacker((byte[])class11498.N((byte[])byArray));
            try {
                class112902 = this.N(messageUnpacker);
                if (messageUnpacker == null) break block8;
            }
            catch (Throwable throwable) {
                try {
                    if (messageUnpacker != null) {
                        try {
                            messageUnpacker.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    ((Logger)y_0).warn("Skipped unreadable preset file {}: {}", (Object)path.getFileName(), (Object)exception.getMessage());
                    return null;
                }
            }
            messageUnpacker.close();
        }
        return class112902;
    }

    private void N(MessageBufferPacker messageBufferPacker, class11290 class112902) throws IOException {
        messageBufferPacker.packArrayHeader(3);
        messageBufferPacker.packInt(1);
        messageBufferPacker.packArrayHeader(10);
        messageBufferPacker.packBinaryHeader(16);
        messageBufferPacker.writePayload(class11325.L(class112902.u()));
        messageBufferPacker.packLong(class112902.Z());
        messageBufferPacker.packString(class112902.i());
        messageBufferPacker.packString(class112902.z());
        messageBufferPacker.packLong(class112902.B());
        messageBufferPacker.packLong(class112902.y());
        messageBufferPacker.packLong(class112902.R());
        messageBufferPacker.packString(class112902.M().N());
        messageBufferPacker.packInt(class112902.L());
        messageBufferPacker.packBoolean(class112902.N());
        if (class112902.N() && class112902.U() != null) {
            messageBufferPacker.packBinaryHeader(class112902.U().length);
            messageBufferPacker.writePayload(class112902.U());
        } else {
            messageBufferPacker.packBinaryHeader(0);
        }
    }

    public long N() {
        return ((AtomicLong)this.N_2).get();
    }

    private class11290 N(class11290 class112902, Path path) {
        if (class112902.N() || class112902.U() != null || !Files.exists(path, new LinkOption[0])) {
            return class112902;
        }
        class11290 class112903 = this.N(path);
        if (class112903 == null || !class112903.N() || class112903.U() == null) {
            return class112902;
        }
        if (!class112903.u().equals(class112902.u())) {
            return class112902;
        }
        if (class112903.R() != class112902.R() && !class112903.E()) {
            return class112902;
        }
        class112902.N(class112903.L());
        class112902.N(class112903.U());
        class112902.N(true);
        return class112902;
    }

    public Optional<class11290> N(UUID uUID) {
        return Optional.ofNullable((class11290)((Map)this.N_1).get(uUID));
    }

    private class11290 N(MessageUnpacker messageUnpacker) throws IOException {
        messageUnpacker.unpackArrayHeader();
        int n = messageUnpacker.unpackInt();
        if (n != 1) {
            ((Logger)y_0).warn("Unknown preset file schema version {}", (Object)n);
            return null;
        }
        ArrayValue arrayValue = messageUnpacker.unpackValue().asArrayValue();
        UUID uUID = class11325.N(arrayValue.get(0).asBinaryValue().asByteArray());
        long l = arrayValue.get(1).asIntegerValue().asLong();
        String string = arrayValue.get(2).asStringValue().asString();
        String string2 = arrayValue.get(3).asStringValue().asString();
        long l2 = arrayValue.get(4).asIntegerValue().asLong();
        long l3 = arrayValue.get(5).asIntegerValue().asLong();
        long l4 = arrayValue.get(6).asIntegerValue().asLong();
        class11296 class112962 = class11296.N(arrayValue.get(7).asStringValue().asString());
        if (class112962 == null) {
            return null;
        }
        int n2 = arrayValue.get(8).asIntegerValue().asInt();
        boolean bl = arrayValue.get(9).asBooleanValue().getBoolean();
        byte[] byArray = messageUnpacker.unpackValue().asBinaryValue().asByteArray();
        if (!bl || byArray.length == 0) {
            byArray = null;
            bl = false;
        }
        return new class11290(uUID, l, string, string2, l2, l3, l4, class112962, n2, bl, byArray);
    }
}

