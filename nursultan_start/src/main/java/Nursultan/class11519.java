/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  Nursultan.class11292
 *  Nursultan.class11329
 *  Nursultan.class11938
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessagePack
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11292;
import Nursultan.class11329;
import Nursultan.class11472;
import Nursultan.class11488;
import Nursultan.class11491;
import Nursultan.class11493;
import Nursultan.class11495;
import Nursultan.class11498;
import Nursultan.class11506;
import Nursultan.class11509;
import Nursultan.class11511;
import Nursultan.class11514;
import Nursultan.class11516;
import Nursultan.class11518;
import Nursultan.class11521;
import Nursultan.class11529;
import Nursultan.class11531;
import Nursultan.class11537;
import Nursultan.class11938;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;

public class class11519 {
    public Object N_0;
    public Object N_1;
    public static Object y_0;
    public static Object y_1;
    public static Object y_2;

    public Path L() {
        return (Path)this.N_0;
    }

    public void L(Class<? extends class11488> clazz) {
        ((List)this.N_1).stream().filter(class114882 -> class114882.getClass() == clazz).findFirst().ifPresent(this::N);
    }

    private void M() {
    }

    public class11519() {
        this.M();
        this.N_0 = ((Path)y_1).resolve(String.valueOf(((class11472)class11938.L_2).M()));
        this.N_1 = List.of(new class11493("friends.dat", 1), new class11329("waypoints.dat", 1), new class11506("macros.dat", 1), new class11537("nuker.dat", 1), new class11521("selected-preset.dat", 1), new class11495("accounts.dat", 1), new class11491("selected-account.dat", 1), new class11514("client-settings.dat", 1), new class11292("ui-layout.dat", 1), new class11516("autobuy.dat", 1), new class11511("blockesp.dat", 1));
    }

    static {
        class11519.R();
        y_0 = LogManager.getLogger(String.class);
        y_1 = ((Path)class11518.N_0).resolve("configs");
    }

    public List<class11488> i() {
        return (List)this.N_1;
    }

    public void u() {
        ((List)this.N_1).forEach(this::y);
    }

    public void y() {
        ((List)this.N_1).forEach(this::N);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void y(class11488 class114882) {
        Path path = ((Path)this.N_0).resolve(class114882.u());
        Path path2 = ((Path)this.N_0).resolve(class114882.u() + "." + String.valueOf(UUID.randomUUID()) + ".tmp");
        try {
            byte[] byArray;
            Files.createDirectories((Path)this.N_0, new FileAttribute[0]);
            try (MessageBufferPacker messageBufferPacker = MessagePack.newDefaultBufferPacker();){
                class114882.y(messageBufferPacker);
                byArray = class11509.y(messageBufferPacker.toByteArray());
            }
            Files.write(path2, class11498.N(byArray), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
            Files.move(path2, path, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException iOException) {
            ((Logger)y_0).error("Failed to save config {}", (Object)class114882.u(), (Object)iOException);
        }
        finally {
            try {
                Files.deleteIfExists(path2);
            }
            catch (IOException iOException) {}
        }
    }

    public static void y(Class<? extends class11488> clazz) {
        class11519 class115192 = class11938.M();
        ((List)class115192.N_1).stream().filter(class114882 -> class114882.getClass() == clazz).findFirst().ifPresent(class115192::y);
    }

    public <T extends class11488> T N(Class<T> clazz) {
        return (T)((class11488)((Object)((List)this.N_1).stream().filter(clazz::isInstance).map(clazz::cast).findFirst().orElseThrow(() -> new IllegalStateException("Config " + clazz.getSimpleName() + " not registered"))));
    }

    public Optional<class11531> N(class09378 class093782) {
        return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).filter(class115312 -> class115312.i() == class093782).findFirst();
    }

    public void N(class11488 class114882) {
        Path path = ((Path)this.N_0).resolve(class114882.u());
        if (!Files.exists(path, new LinkOption[0])) {
            return;
        }
        try {
            byte[] byArray = Files.readAllBytes(path);
            class11529.N(class114882, class11498.N(byArray));
        }
        catch (Exception exception) {
            ((Logger)y_0).error("Failed to load config {}", (Object)class114882.u(), (Object)exception);
        }
    }

    public List<class11531> N() {
        return ((List)this.N_1).stream().filter(class11531.class::isInstance).map(class11531.class::cast).toList();
    }

    private static void R() {
        y_0 = null;
        y_1 = null;
        y_2 = 1;
    }
}

