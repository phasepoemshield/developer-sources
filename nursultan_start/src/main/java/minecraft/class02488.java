/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntLists
 *  minecraft.class05033
 *  minecraft.class07085
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntLists;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class02466;
import minecraft.class05033;
import minecraft.class07085;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class02488 {
    private static final List<class02466> y = (List)class07536.N(new ArrayList(), (T arrayList) -> {
        class02488.N((List<class02466>)arrayList, "contents", 0);
        class02488.N((List<class02466>)arrayList, "container.", 0, 54);
        class02488.N((List<class02466>)arrayList, "hotbar.", 0, 9);
        class02488.N((List<class02466>)arrayList, "inventory.", 9, 27);
        class02488.N((List<class02466>)arrayList, "enderchest.", 200, 27);
        class02488.N((List<class02466>)arrayList, "villager.", 300, 8);
        class02488.N((List<class02466>)arrayList, "horse.", 500, 15);
        int n = class07085.field_6173.N(98);
        int n2 = class07085.field_6171.N(98);
        class02488.N((List<class02466>)arrayList, "weapon", n);
        class02488.N((List<class02466>)arrayList, "weapon.mainhand", n);
        class02488.N((List<class02466>)arrayList, "weapon.offhand", n2);
        class02488.N((List<class02466>)arrayList, "weapon.*", new int[]{n, n2});
        n = class07085.field_6169.N(100);
        n2 = class07085.field_6174.N(100);
        int n3 = class07085.field_6172.N(100);
        int n4 = class07085.field_6166.N(100);
        int n5 = class07085.field_48824.N(105);
        class02488.N((List<class02466>)arrayList, "armor.head", n);
        class02488.N((List<class02466>)arrayList, "armor.chest", n2);
        class02488.N((List<class02466>)arrayList, "armor.legs", n3);
        class02488.N((List<class02466>)arrayList, "armor.feet", n4);
        class02488.N((List<class02466>)arrayList, "armor.body", n5);
        class02488.N((List<class02466>)arrayList, "armor.*", n, n2, n3, n4, n5);
        class02488.N((List<class02466>)arrayList, "saddle", class07085.field_55946.N(106));
        class02488.N((List<class02466>)arrayList, "horse.chest", 499);
        class02488.N((List<class02466>)arrayList, "player.cursor", 499);
        class02488.N((List<class02466>)arrayList, "player.crafting.", 500, 4);
    });
    public static final Codec<class02466> N = class05033.y(() -> (class02466[])y.toArray(class02466[]::new));
    private static final Function<String, @Nullable class02466> L = class05033.N((class05033[])((class02466[])y.toArray(class02466[]::new)));

    public static Stream<String> y() {
        return y.stream().filter(class024662 -> class024662.y() == 1).map(class05033::method_15434);
    }

    private static class02466 N(String string, int n) {
        return class02466.N(string, IntLists.singleton((int)n));
    }

    private static /* synthetic */ class02466[] N(int n) {
        return new class02466[n];
    }

    public static Stream<String> N() {
        return y.stream().map(class05033::method_15434);
    }

    private static void N(List<class02466> list, String string, int n) {
        list.add(class02488.N(string, n));
    }

    private static void N(List<class02466> list, String string, int n, int n2) {
        IntArrayList intArrayList = new IntArrayList(n2);
        for (int i = 0; i < n2; ++i) {
            int n3 = n + i;
            list.add(class02488.N(string + i, n3));
            intArrayList.add(n3);
        }
        list.add(class02488.N(string + "*", (IntList)intArrayList));
    }

    private static void N(List<class02466> list, String string, int ... nArray) {
        list.add(class02488.N(string, nArray));
    }

    public static @Nullable class02466 N(String string) {
        return L.apply(string);
    }

    private static class02466 N(String string, IntList intList) {
        return class02466.N(string, IntLists.unmodifiable((IntList)intList));
    }

    private static class02466 N(String string, int ... nArray) {
        return class02466.N(string, IntList.of((int[])nArray));
    }
}

