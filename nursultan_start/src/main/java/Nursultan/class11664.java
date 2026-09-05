/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11165
 *  Nursultan.class11894
 *  minecraft.class06202
 *  minecraft.class06581
 *  minecraft.class06584
 */
package Nursultan;

import Nursultan.class11165;
import Nursultan.class11894;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;

public class class11664 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    public class11165 L() {
        return (class11165)this.N_3;
    }

    private void M() {
    }

    public class11664(class06581 class065812) {
        this.M();
        this.N_0 = class065812;
    }

    public class06581 i() {
        return (class06581)this.N_0;
    }

    public String u() {
        return (String)this.N_1;
    }

    public class11664 y(String string) {
        this.N_1 = string;
        return this;
    }

    public String y() {
        return (String)this.N_2;
    }

    public class06584 N() {
        if ((String)this.N_1 == null) {
            throw new IllegalStateException("Item id not set");
        }
        Path path = ((File)class06202.Nq().l_1).toPath().resolve("public-resources");
        if (!Files.exists(path, new LinkOption[0])) {
            throw new IllegalStateException("Resources directory not found");
        }
        Path path2 = path.resolve("ab-items");
        if (!Files.exists(path2, new LinkOption[0])) {
            throw new IllegalStateException("ab-items directory not found");
        }
        Path path3 = path2.resolve((String)this.N_1 + ".nbt");
        if (!Files.exists(path3, new LinkOption[0])) {
            throw new IllegalStateException("Item NBT file not found: " + String.valueOf(path3));
        }
        return class11894.N((Path)path3);
    }

    public class11664 N(class11165 class111652) {
        this.N_3 = class111652;
        return this;
    }

    public class11664 N(String string) {
        this.N_2 = string;
        return this;
    }
}

