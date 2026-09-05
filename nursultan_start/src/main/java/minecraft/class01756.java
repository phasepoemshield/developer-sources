/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashBasedTable
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  minecraft.class00242
 *  minecraft.class00295
 *  minecraft.class00296
 *  minecraft.class00305
 *  minecraft.class00329
 *  minecraft.class04919
 *  minecraft.class05287
 */
package minecraft;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.Set;
import minecraft.class00242;
import minecraft.class00295;
import minecraft.class00296;
import minecraft.class00305;
import minecraft.class00329;
import minecraft.class04919;
import minecraft.class05287;

public class class01756
extends class04919 {
    private final Map<class00329, class00295> y = new HashMap<class00329, class00295>();
    private final Set<class00329> L = new HashSet<class00329>();
    private Map<class00242, List<class05287>> u = Map.of();
    private List<class05287> i = List.of();

    public void L(class00329 class003292) {
        this.L.remove(class003292);
    }

    public List<class05287> L() {
        return this.i;
    }

    public void u(class00329 class003292) {
        this.L.add(class003292);
    }

    public void y() {
        Map<class00305, List<List<class00295>>> var1 = class01756.N(this.y.values());
        HashMap<class00296, List> hashMap = new HashMap<class00296, List>();
        ImmutableList.Builder builder = ImmutableList.builder();
        var1.forEach((class003052, list) -> hashMap.put((class00296)class003052, (List)list.stream().map(class05287::new).peek(arg_0 -> ((ImmutableList.Builder)builder).add(arg_0)).collect(ImmutableList.toImmutableList())));
        for (class00296 class002962 : class00296.values()) {
            hashMap.put(class002962, (List)class002962.N().stream().flatMap(class003052 -> hashMap.getOrDefault(class003052, List.of()).stream()).collect(ImmutableList.toImmutableList()));
        }
        this.u = Map.copyOf(hashMap);
        this.i = builder.build();
    }

    public boolean y(class00329 class003292) {
        return this.L.contains(class003292);
    }

    public void N(class00295 class002952) {
        this.y.put(class002952.N(), class002952);
    }

    public void N() {
        this.y.clear();
        this.L.clear();
    }

    private static Map<class00305, List<List<class00295>>> N(Iterable<class00295> iterable) {
        HashMap<class00305, List<List<class00295>>> hashMap = new HashMap<class00305, List<List<class00295>>>();
        HashBasedTable hashBasedTable = HashBasedTable.create();
        for (class00295 class002952 : iterable) {
            class00305 class003053 = class002952.u();
            OptionalInt optionalInt = class002952.L();
            if (optionalInt.isEmpty()) {
                hashMap.computeIfAbsent(class003053, class003052 -> new ArrayList()).add(List.of(class002952));
                continue;
            }
            ArrayList<class00295> arrayList = (ArrayList<class00295>)hashBasedTable.get((Object)class003053, (Object)optionalInt.getAsInt());
            if (arrayList == null) {
                arrayList = new ArrayList<class00295>();
                hashBasedTable.put((Object)class003053, (Object)optionalInt.getAsInt(), arrayList);
                hashMap.computeIfAbsent(class003053, class003052 -> new ArrayList()).add(arrayList);
            }
            arrayList.add(class002952);
        }
        return hashMap;
    }

    public void N(class00329 class003292) {
        this.y.remove(class003292);
        this.L.remove(class003292);
    }

    public List<class05287> N(class00242 class002422) {
        return this.u.getOrDefault(class002422, Collections.emptyList());
    }
}

