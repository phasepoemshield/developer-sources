/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11922
 *  Nursultan.class11930
 *  com.google.common.collect.Lists
 *  com.mojang.logging.LogUtils
 *  minecraft.class06202
 *  minecraft.class07001
 *  minecraft.class07536
 *  minecraft.class07709
 *  minecraft.class07741
 *  minecraft.class07742
 *  minecraft.class08214
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import Nursultan.class11922;
import Nursultan.class11930;
import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import minecraft.class04568;
import minecraft.class04579;
import minecraft.class06202;
import minecraft.class07001;
import minecraft.class07536;
import minecraft.class07709;
import minecraft.class07741;
import minecraft.class07742;
import minecraft.class08214;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class04563 {
    private static final Logger N = LogUtils.getLogger();
    private static final class08214 y = new class08214((Executor)class07536.B(), "server-list-io");
    private static final int L = 16;
    private final class06202 u;
    private final List<class04568> i = Lists.newArrayList();
    private final List<class04568> R = Lists.newArrayList();

    public int L() {
        return this.i.size();
    }

    public class04563(class06202 class062022) {
        this.u = class062022;
    }

    public static void y(class04568 class045682) {
        y.N(() -> {
            class04563 class045632 = new class04563(class06202.Nq());
            class045632.N();
            if (!class04563.N(class045682, class045632.i)) {
                class04563.N(class045682, class045632.R);
            }
            class045632.y();
        });
    }

    public void y() {
        try {
            Object object;
            class07741 class077412 = new class07741();
            for (class04568 object22 : this.N(this)) {
                object = object22.N();
                object.N("hidden", false);
                class077412.add(object);
            }
            for (class04568 class045682 : this.R) {
                object = class045682.N();
                object.N("hidden", true);
                class077412.add(object);
            }
            class07001 class070012 = new class07001();
            class070012.N("servers", (class07709)class077412);
            Path path = ((File)this.u.l_1).toPath();
            object = Files.createTempFile(path, "servers", ".dat", new FileAttribute[0]);
            class07742.y((class07001)class070012, (Path)object);
            Path path2 = path.resolve("servers.dat_old");
            class07536.N((Path)path.resolve("servers.dat"), (Path)object, (Path)path2);
        }
        catch (Exception exception) {
            N.error("Couldn't save server list", (Throwable)exception);
        }
    }

    public @Nullable class04568 y(String string) {
        for (int i = 0; i < this.R.size(); ++i) {
            class04568 class045682 = this.R.get(i);
            if (!class045682.y.equals(string)) continue;
            this.R.remove(i);
            this.i.add(class045682);
            return class045682;
        }
        return null;
    }

    private void N(CallbackInfo callbackInfo) {
        ((List)class11922.N_0).forEach(class119302 -> class119302.N(class04579.field_47880));
        this.i.addAll((List)class11922.N_0);
    }

    private List N(class04563 class045632) {
        return this.i.stream().filter(class045682 -> !(class045682 instanceof class11930)).toList();
    }

    public void N(class04568 class045682) {
        if (!this.i.remove(class045682)) {
            this.R.remove(class045682);
        }
    }

    public @Nullable class04568 N(String string) {
        for (class04568 class045682 : this.i) {
            if (!class045682.y.equals(string)) continue;
            return class045682;
        }
        for (class04568 class045682 : this.R) {
            if (!class045682.y.equals(string)) continue;
            return class045682;
        }
        return null;
    }

    public class04568 N(int n) {
        return this.i.get(n);
    }

    public void N() {
        try {
            this.i.clear();
            this.N((CallbackInfo)null);
            this.R.clear();
            class07001 class070013 = class07742.N((Path)((File)this.u.l_1).toPath().resolve("servers.dat"));
            if (class070013 == null) {
                return;
            }
            class070013.s("servers").z().forEach(class070012 -> {
                class04568 class045682 = class04568.N(class070012);
                if (class070012.y("hidden", false)) {
                    this.R.add(class045682);
                } else {
                    this.i.add(class045682);
                }
            });
        }
        catch (Exception exception) {
            N.error("Couldn't load server list", (Throwable)exception);
        }
    }

    private static boolean N(class04568 class045682, List<class04568> list) {
        for (int i = 0; i < list.size(); ++i) {
            class04568 class045683 = list.get(i);
            if (!Objects.equals(class045683.N, class045682.N) || !class045683.y.equals(class045682.y)) continue;
            list.set(i, class045682);
            return true;
        }
        return false;
    }

    public void N(int n, class04568 class045682) {
        this.i.set(n, class045682);
    }

    public void N(int n, int n2) {
        class04568 class045682 = this.N(n);
        this.i.set(n, this.N(n2));
        this.i.set(n2, class045682);
        this.y();
    }

    public void N(class04568 class045682, boolean bl) {
        if (bl) {
            this.R.add(0, class045682);
            while (this.R.size() > 16) {
                this.R.remove(this.R.size() - 1);
            }
        } else {
            this.i.add(class045682);
        }
    }
}

