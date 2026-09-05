/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11287
 *  Nursultan.class11288
 *  Nursultan.class11303
 *  Nursultan.class11403
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11518
 *  Nursultan.class11524
 *  Nursultan.class11532
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11886
 *  Nursultan.class11901
 *  Nursultan.class11921
 *  minecraft.class00392
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class06541
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.lwjgl.PointerBuffer
 *  org.lwjgl.system.MemoryStack
 *  org.lwjgl.system.MemoryUtil
 *  org.lwjgl.util.nfd.NFDFilterItem
 *  org.lwjgl.util.nfd.NFDFilterItem$Buffer
 *  org.lwjgl.util.nfd.NativeFileDialog
 */
package Nursultan;

import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11287;
import Nursultan.class11288;
import Nursultan.class11303;
import Nursultan.class11403;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11518;
import Nursultan.class11524;
import Nursultan.class11532;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11886;
import Nursultan.class11901;
import Nursultan.class11921;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import minecraft.class00392;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06541;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.nfd.NFDFilterItem;
import org.lwjgl.util.nfd.NativeFileDialog;

@class11080(L="ClientSounds", y=class11072.MISC, N=class11106.CLIENT)
public class ClientSounds
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public static Object u_0;

    public ClientSounds() {
        this.j();
        this.L_0 = class11524.N((class11512)this, (String)"toggle-sounds", (boolean)true);
        this.L_1 = new class11535("custom", false);
        this.L_2 = new class11535("default", true);
        this.L_3 = (class11517)class11524.N((class11512)this, (String)"sound-type", (class11535[])new class11535[]{(class11535)this.L_1, (class11535)this.L_2}).N((T class115362) -> {
            this.j();
            return (Boolean)((class11507)this.L_0).i();
        });
        this.L_4 = (class11532)class11524.N((class11512)this, (String)"select-enable-sound", () -> this.y(false)).N((T class115362) -> {
            this.j();
            return ((class11535)this.L_1).U() && (Boolean)((class11507)this.L_0).i() != false;
        });
        this.L_5 = (class11532)class11524.N((class11512)this, (String)"select-disable-sound", () -> this.y(true)).N((T class115362) -> {
            this.j();
            return ((class11535)this.L_1).U() && (Boolean)((class11507)this.L_0).i() != false;
        });
        this.L_6 = class11524.N((class11512)this, (String)"volume", (float)100.0f, (float)50.0f, (float)100.0f, (float)1.0f);
    }

    static {
        ClientSounds.s();
        u_0 = LogManager.getLogger(String.class);
    }

    private static void s() {
        u_0 = null;
    }

    public class11504 m() {
        this.j();
        return (class11504)this.L_6;
    }

    private void j() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void y(boolean bl) {
        block16: {
            try (MemoryStack memoryStack = MemoryStack.stackPush();){
                Path path = Paths.get(System.getProperty("user.home"), "Downloads");
                NFDFilterItem.Buffer buffer = NFDFilterItem.malloc((int)1, (MemoryStack)memoryStack);
                ((NFDFilterItem)buffer.get(0)).name(memoryStack.UTF8((CharSequence)"WAV files")).spec(memoryStack.UTF8((CharSequence)"wav"));
                PointerBuffer pointerBuffer = memoryStack.mallocPointer(1);
                if (1 != NativeFileDialog.NFD_OpenDialog((PointerBuffer)pointerBuffer, (NFDFilterItem.Buffer)buffer, (CharSequence)path.toAbsolutePath().toString())) break block16;
                long l = pointerBuffer.get(0);
                if (l == 0L) {
                    return;
                }
                try {
                    Path path2 = Paths.get(MemoryUtil.memUTF8((long)l), new String[0]);
                    if (!ClientSounds.N(path2)) {
                        return;
                    }
                    Path path3 = ((Path)class11518.N_0).resolve("sounds");
                    Files.createDirectories(path3, new FileAttribute[0]);
                    String string = bl ? "custom-disable-sound.wav" : "custom-enable-sound.wav";
                    Path path4 = path3.resolve(string);
                    Files.copy(path2, path4, StandardCopyOption.REPLACE_EXISTING);
                    class11886.N((Path)path4);
                }
                finally {
                    NativeFileDialog.NFD_FreePath((long)l);
                }
            }
            catch (Exception exception) {
                class11303.N((class11287)new class11288((class11067)this), (class00392)class11921.N((String)"error-please-report").N(class06541.field_1061));
                ((Logger)u_0).error((Object)exception, (Throwable)exception);
            }
        }
    }

    private static boolean N(Path path) {
        String string = path.getFileName().toString();
        int n = string.lastIndexOf(46);
        return n >= 0 && string.substring(n + 1).equalsIgnoreCase("wav");
    }

    @class11782
    public void N(class11403 class114032) {
        this.j();
        if (!((Boolean)((class11507)this.L_0).i()).booleanValue() || (class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        class11067 class110672 = class114032.N();
        if (!class110672.R().N()) {
            return;
        }
        boolean bl = class110672.U();
        if (((class11535)this.L_2).U()) {
            class11886.N((class11901)(bl ? (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[0] : (class11901)class11901.staticFields_0ec612a2dc0263a258b66e8d510834aaf[1]));
            return;
        }
        Path path = ((Path)class11518.N_0).resolve("sounds").resolve(bl ? "custom-enable-sound.wav" : "custom-disable-sound.wav");
        if (!Files.exists(path, new LinkOption[0])) {
            class11303.N((class11287)new class11288((class11067)this), (class00392)class11921.N((String)"sound-does-not-exist").N(class06541.field_1061));
            return;
        }
        class11886.y((Path)path);
    }
}

