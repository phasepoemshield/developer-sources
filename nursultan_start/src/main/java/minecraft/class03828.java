/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import minecraft.class03823;
import minecraft.class03835;
import minecraft.class03846;
import org.slf4j.Logger;

public class class03828 {
    private static final Logger N = LogUtils.getLogger();

    public static void N(Path path, int n) {
        try {
            List<class03823> var2 = class03828.N(path);
            int n2 = var2.size() - n;
            if (n2 <= 0) {
                return;
            }
            var2.sort(class03823.y);
            List<class03835> var4 = class03828.N(var2);
            Collections.reverse(var4);
            var4.sort(class03835.L);
            HashSet<Path> hashSet = new HashSet<Path>();
            for (int i = 0; i < n2; ++i) {
                class03835 object = var4.get(i);
                Path iOException = object.N();
                try {
                    Files.delete(iOException);
                    if (object.y() != 0) continue;
                    hashSet.add(iOException.getParent());
                    continue;
                }
                catch (IOException iOException2) {
                    N.warn("Failed to delete cache file {}", (Object)iOException, (Object)iOException2);
                }
            }
            hashSet.remove(path);
            for (Path path2 : hashSet) {
                try {
                    Files.delete(path2);
                }
                catch (DirectoryNotEmptyException directoryNotEmptyException) {
                }
                catch (IOException iOException) {
                    N.warn("Failed to delete empty(?) cache directory {}", (Object)path2, (Object)iOException);
                }
            }
        }
        catch (IOException | UncheckedIOException exception) {
            N.error("Failed to vacuum cache dir {}", (Object)path, (Object)exception);
        }
    }

    private static List<class03835> N(List<class03823> list) {
        ArrayList<class03835> arrayList = new ArrayList<class03835>();
        Object2IntOpenHashMap object2IntOpenHashMap = new Object2IntOpenHashMap();
        for (class03823 class038232 : list) {
            int n = object2IntOpenHashMap.addTo((Object)class038232.N().getParent(), 1);
            arrayList.add(new class03835(class038232.N(), n));
        }
        return arrayList;
    }

    private static List<class03823> N(Path path) throws IOException {
        try {
            ArrayList<class03823> arrayList = new ArrayList<class03823>();
            Files.walkFileTree(path, new class03846(path, arrayList));
            return arrayList;
        }
        catch (NoSuchFileException noSuchFileException) {
            return List.of();
        }
    }
}

