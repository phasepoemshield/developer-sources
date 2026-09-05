/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  minecraft.class07533
 *  minecraft.class07536
 */
package Nursultan;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import minecraft.class06202;
import minecraft.class07533;
import minecraft.class07536;

public class class11518 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11518() {
    }

    static {
        class11518.L();
        N_0 = class11518.y();
    }

    private static Path y() {
        if (class07536.m() == class07533.field_1137) {
            return ((File)class06202.Nq().l_1).toPath().resolve("Nursultan");
        }
        return Paths.get(System.getProperty("user.home"), "AppData", "Roaming", "Nursultan");
    }
}

