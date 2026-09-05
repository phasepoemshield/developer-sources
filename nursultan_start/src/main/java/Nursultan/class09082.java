/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09734
 *  Nursultan.class09735
 *  Nursultan.class09742
 *  Nursultan.class11518
 *  Nursultan.class11925
 *  minecraft.class01079
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class09071;
import Nursultan.class09079;
import Nursultan.class09093;
import Nursultan.class09734;
import Nursultan.class09735;
import Nursultan.class09742;
import Nursultan.class11518;
import Nursultan.class11925;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import minecraft.class01079;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class09082 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public boolean y_init;

    public int L(int n) {
        class09071 class090712 = this.Z(n);
        return class090712 == null ? 0 : class090712.u();
    }

    public void L() {
        Iterator iterator = ((List)this.y_2).iterator();
        while (iterator.hasNext()) {
            ((class09071)iterator.next()).i();
        }
        ((List)this.y_2).clear();
        ((Map)this.y_1).clear();
        ((ExecutorService)this.y_3).shutdown();
    }

    private static void M() {
        N_0 = null;
        N_1 = 64.0;
        N_2 = 12.0;
        N_3 = 512;
    }

    public class09082() {
        this.i();
        this.y_0 = new HashMap();
        this.y_1 = new HashMap();
        this.y_2 = new ArrayList();
        this.y_3 = Executors.newFixedThreadPool(4);
        this.y_4 = Math.max(512, Math.min(class11925.u(), 8192));
    }

    static {
        class09082.M();
        N_0 = LogManager.getLogger(String.class);
    }

    private class09071 Z(int n) {
        if (n < 0 || n >= ((List)this.y_2).size()) {
            return null;
        }
        return (class09071)((List)this.y_2).get(n);
    }

    private void i() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_4 = 0;
        }
    }

    public int y(int n) {
        class09071 class090712 = this.Z(n);
        return class090712 == null ? 0 : class090712.M();
    }

    public void y() {
        Iterator iterator = ((List)this.y_2).iterator();
        while (iterator.hasNext()) {
            ((class09071)iterator.next()).N();
        }
    }

    public class09071 N(String string, byte[] byArray, class09079 class090792) {
        String string2 = string + "#" + class090792.name();
        class09071 class090712 = (class09071)((Map)this.y_1).get(string2);
        if (class090712 != null) {
            return class090712;
        }
        class09734 class097342 = new class09734(class09735.MTSDF, 64.0, 12.0, 512, ((Integer)this.y_4).intValue()).N((double)class090792.N());
        Path path = this.N(string, class090792);
        class09742 class097422 = this.N(byArray, class097342, path);
        class09071 class090713 = new class09071(class097422, ((List)this.y_2).size(), 12.0f, path);
        ((Map)this.y_1).put(string2, class090713);
        ((List)this.y_2).add(class090713);
        return class090713;
    }

    public class09093 N(String string) {
        return (class09093)((Map)this.y_0).get(string);
    }

    private Path N(String string, class09079 class090792) {
        try {
            Path path = ((Path)class11518.N_0).resolve("cache").resolve("font");
            Files.createDirectories(path, new FileAttribute[0]);
            return path.resolve(string + "_w" + (int)class090792.N() + ".msdf");
        }
        catch (Exception exception) {
            ((Logger)N_0).warn("Font atlas cache directory unavailable: {}", (Object)exception.toString());
            return null;
        }
    }

    public class09093 N(String string, class01079 class010792) {
        if (((Map)this.y_0).containsKey(string)) {
            throw new IllegalStateException("Font family already registered: " + string);
        }
        class09093 class090932 = new class09093(string, this, class010792);
        ((Map)this.y_0).put(string, class090932);
        return class090932;
    }

    public int N(int n) {
        class09071 class090712 = this.Z(n);
        return class090712 == null ? 0 : class090712.R();
    }

    private class09742 N(byte[] byArray, class09734 class097342, Path path) {
        if (path != null) {
            try {
                return class09742.N((byte[])byArray, (class09734)class097342, (Path)path, (Executor)((ExecutorService)this.y_3));
            }
            catch (Exception exception) {
                ((Logger)N_0).warn("Font atlas cache load failed ({}): {}", (Object)path, (Object)exception.toString());
            }
        }
        return class09742.N((byte[])byArray, (class09734)class097342, (Executor)((ExecutorService)this.y_3));
    }

    public void N() {
        this.y();
        Iterator iterator = ((Map)this.y_0).values().iterator();
        while (iterator.hasNext()) {
            ((class09093)iterator.next()).y();
        }
    }
}

