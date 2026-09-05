/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10786
 *  minecraft.class01424
 *  minecraft.class01465
 *  minecraft.class03103
 *  minecraft.class03154
 *  minecraft.class03172
 *  minecraft.class03175
 *  minecraft.class06997
 *  minecraft.class07001
 *  minecraft.class07080
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class10786;
import java.io.BufferedOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import minecraft.class01424;
import minecraft.class01465;
import minecraft.class03103;
import minecraft.class03154;
import minecraft.class03172;
import minecraft.class03175;
import minecraft.class06997;
import minecraft.class07001;
import minecraft.class07080;
import minecraft.class07707;
import minecraft.class07709;
import minecraft.class07726;
import org.jspecify.annotations.Nullable;

public class class07742 {
    private static final OpenOption[] N = new OpenOption[]{StandardOpenOption.SYNC, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING};

    public static void L(class07709 class077092, DataOutput dataOutput) throws IOException {
        class07742.y(class077092, (DataOutput)new class10786(dataOutput));
    }

    public static class07709 L(DataInput dataInput, class07726 class077262) throws IOException {
        byte by = dataInput.readByte();
        if (by == 0) {
            return class06997.y;
        }
        class07707.N(dataInput);
        return class07742.N(dataInput, class077262, by);
    }

    public static void y(class07709 class077092, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class077092.L());
        if (class077092.L() == 0) {
            return;
        }
        dataOutput.writeUTF("");
        class077092.N(dataOutput);
    }

    public static class07709 y(DataInput dataInput, class07726 class077262) throws IOException {
        byte by = dataInput.readByte();
        if (by == 0) {
            return class06997.y;
        }
        return class07742.N(dataInput, class077262, by);
    }

    public static void y(class07001 class070012, Path path) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(path, N);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
             DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);){
            class07742.N(class070012, dataOutputStream);
        }
    }

    public static void N_83(class07709 class077092, DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(class077092.L());
        if (class077092.L() == 0) {
            return;
        }
        class077092.N(dataOutput);
    }

    public static void N_81(DataInput dataInput, class03175 class031752, class07726 class077262) throws IOException {
        class01424 var3 = class01465.N((int)dataInput.readByte());
        if (var3 == class06997.N) {
            if (class031752.y(class06997.N) == class03154.field_36253) {
                class031752.N();
            }
            return;
        }
        switch (class031752.y(var3)) {
            case field_36255: {
                break;
            }
            case field_36254: {
                class07707.N(dataInput);
                var3.y(dataInput, class077262);
                break;
            }
            case field_36253: {
                class07707.N(dataInput);
                var3.N(dataInput, class031752, class077262);
            }
        }
    }

    public static /* bridge */ void N(class07001 class070012, DataOutput dataOutput) throws IOException {
        class07742.L((class07709)class070012, dataOutput);
    }

    private static class07709 N(DataInput dataInput, class07726 class077262, byte by) {
        try {
            return class01465.N((int)by).L(dataInput, class077262);
        }
        catch (IOException iOException) {
            class07080 class070802 = class07080.N((Throwable)iOException, (String)"Loading NBT data");
            class070802.N("NBT Tag").N("Tag type", (Object)by);
            throw new class03103(class070802);
        }
    }

    public static class07001 N(Path path, class07726 class077262) throws IOException {
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            class07001 class070012;
            try (class03172 class031722 = new class03172(inputStream);){
                class070012 = class07742.N_82((InputStream)class031722, class077262);
            }
            return class070012;
        }
    }

    private static DataInputStream N(InputStream inputStream) throws IOException {
        return new DataInputStream((InputStream)new class03172((InputStream)new GZIPInputStream(inputStream)));
    }

    public static class07001 N(DataInput dataInput) throws IOException {
        return class07742.N(dataInput, class07726.L());
    }

    public static void N(class07001 class070012, Path path) throws IOException {
        try (OutputStream outputStream = Files.newOutputStream(path, N);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);){
            class07742.N(class070012, bufferedOutputStream);
        }
    }

    public static void N(InputStream inputStream, class03175 class031752, class07726 class077262) throws IOException {
        try (DataInputStream dataInputStream = class07742.N(inputStream);){
            class07742.N_81(dataInputStream, class031752, class077262);
        }
    }

    public static void N(Path path, class03175 class031752, class07726 class077262) throws IOException {
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);
             class03172 class031722 = new class03172(inputStream);){
            class07742.N((InputStream)class031722, class031752, class077262);
        }
    }

    public static class07001 N_82(InputStream inputStream, class07726 class077262) throws IOException {
        try (DataInputStream dataInputStream = class07742.N(inputStream);){
            class07001 class070012 = class07742.N(dataInputStream, class077262);
            return class070012;
        }
    }

    public static class07001 N(DataInput dataInput, class07726 class077262) throws IOException {
        class07709 class077092 = class07742.L(dataInput, class077262);
        if (class077092 instanceof class07001) {
            return (class07001)class077092;
        }
        throw new IOException("Root tag must be a named compound tag");
    }

    private static DataOutputStream N(OutputStream outputStream) throws IOException {
        return new DataOutputStream(new BufferedOutputStream(new GZIPOutputStream(outputStream)));
    }

    public static @Nullable class07001 N(Path path) throws IOException {
        if (!Files.exists(path, new LinkOption[0])) {
            return null;
        }
        try (InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);){
            class07001 class070012;
            try (DataInputStream dataInputStream = new DataInputStream(inputStream);){
                class070012 = class07742.N(dataInputStream, class07726.L());
            }
            return class070012;
        }
    }

    public static void N(class07001 class070012, OutputStream outputStream) throws IOException {
        try (DataOutputStream dataOutputStream = class07742.N(outputStream);){
            class07742.N(class070012, dataOutputStream);
        }
    }
}

