/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class00392
 *  minecraft.class02277
 *  minecraft.class05715
 *  minecraft.class05946
 *  minecraft.class06172
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07357
 *  minecraft.class07878
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.regex.Matcher;
import minecraft.class00392;
import minecraft.class02277;
import minecraft.class05715;
import minecraft.class05946;
import minecraft.class06172;
import minecraft.class06699;
import minecraft.class06701;
import minecraft.class06711;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07357;
import minecraft.class07878;
import org.jspecify.annotations.Nullable;

public abstract class class06691 {
    private final class00392 u;
    private final class00392 i;
    private final String R;
    private final String M;
    protected @Nullable CompletableFuture<Void> N;
    protected final class05715 y;
    public final /* synthetic */ class06711 L;

    private static List<class06699> L(class02277 class022772, Path path) {
        File[] fileArray = path.toFile().listFiles((file, string) -> string.endsWith(".mca"));
        if (fileArray == null) {
            return List.of();
        }
        ArrayList arrayList = Lists.newArrayList();
        for (File file2 : fileArray) {
            Matcher matcher = class06711.t.matcher(file2.getName());
            if (!matcher.matches()) continue;
            int n = Integer.parseInt(matcher.group(1)) << 5;
            int n2 = Integer.parseInt(matcher.group(2)) << 5;
            ArrayList arrayList2 = Lists.newArrayList();
            try (class07357 class073572 = new class07357(class022772, file2.toPath(), path, true);){
                for (int i = 0; i < 32; ++i) {
                    for (int j = 0; j < 32; ++j) {
                        class07321 class073212 = new class07321(i + n, j + n2);
                        if (!class073572.y(class073212)) continue;
                        arrayList2.add(class073212);
                    }
                }
                if (arrayList2.isEmpty()) continue;
                arrayList.add(new class06699(class073572, arrayList2));
            }
            catch (Throwable throwable) {
                class06711.N.error("Failed to read chunks from region file {}", (Object)file2.toPath(), (Object)throwable);
            }
        }
        return arrayList;
    }

    public class06691(class06711 class067112, class05715 class057152, String string, String string2, class00392 class003922, class00392 class003923) {
        this.L = class067112;
        this.y = class057152;
        this.R = string;
        this.M = string2;
        this.u = class003922;
        this.i = class003923;
    }

    private ListIterator<class06699> y(class02277 class022772, Path path) {
        List<class06699> var3 = class06691.L(class022772, path);
        this.L.T += var3.size();
        this.L.s += var3.stream().mapToInt(class066992 -> class066992.y().size()).sum();
        return var3.listIterator();
    }

    private List<class06701> y() {
        ArrayList arrayList = Lists.newArrayList();
        for (class05946<class07299> var3 : this.L.Z) {
            class02277 class022772 = new class02277(this.L.E.R(), var3, this.R);
            Path path = this.L.E.N(var3).resolve(this.M);
            class06172 class061722 = this.N(class022772, path);
            ListIterator<class06699> var7 = this.y(class022772, path);
            arrayList.add(new class06701(var3, class061722, var7));
        }
        return arrayList;
    }

    protected abstract boolean N(class06172 var1, class07321 var2, class05946<class07299> var3);

    private void N(class07357 class073572) {
        if (!this.L.U) {
            return;
        }
        if (this.N != null) {
            this.N.join();
        }
        Path path = class073572.N();
        Path path2 = class06711.N(path.getParent()).resolve(path.getFileName().toString());
        try {
            if (path2.toFile().exists()) {
                Files.delete(path);
                Files.move(path2, path, new CopyOption[0]);
            } else {
                class06711.N.error("Failed to replace an old region file. New file {} does not exist.", (Object)path2);
            }
        }
        catch (IOException iOException) {
            class06711.N.error("Failed to replace an old region file", (Throwable)iOException);
        }
    }

    private boolean N(class05946<class07299> class059462, class06172 class061722, class07321 class073212) {
        boolean bl = false;
        try {
            bl = this.N(class061722, class073212, class059462);
        }
        catch (CompletionException | class07878 throwable) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 instanceof IOException) {
                class06711.N.error("Error upgrading chunk {}", (Object)class073212, (Object)throwable2);
            }
            throw throwable;
        }
        if (bl) {
            ++this.L.b;
        } else {
            ++this.L.j;
        }
        return bl;
    }

    public void N() {
        this.L.T = 0;
        this.L.s = 0;
        this.L.b = 0;
        this.L.j = 0;
        List<class06701> var1 = this.y();
        if (this.L.s == 0) {
            return;
        }
        float f = this.L.T;
        this.L.n = this.u;
        while (this.L.m) {
            boolean bl = false;
            float f2 = 0.0f;
            for (class06701 class067012 : var1) {
                class05946<class07299> var7 = class067012.N();
                ListIterator<class06699> var8 = class067012.L();
                class06172 class061722 = class067012.y();
                if (var8.hasNext()) {
                    class06699 class066992 = var8.next();
                    boolean bl2 = true;
                    for (class07321 class073212 : class066992.y()) {
                        bl2 = bl2 && this.N(var7, class061722, class073212);
                        bl = true;
                    }
                    if (this.L.U) {
                        if (bl2) {
                            this.N(class066992.N());
                        } else {
                            class06711.N.error("Failed to convert region file {}", (Object)class066992.N().N());
                        }
                    }
                }
                float f3 = (float)var8.nextIndex() / f;
                this.L.v.put(var7, f3);
                f2 += f3;
            }
            this.L.P = f2;
            if (bl) continue;
            break;
        }
        this.L.n = this.i;
        for (class06701 class067013 : var1) {
            try {
                class067013.y().close();
            }
            catch (Exception exception) {
                class06711.N.error("Error upgrading chunk", (Throwable)exception);
            }
        }
    }

    protected abstract class06172 N(class02277 var1, Path var2);
}

