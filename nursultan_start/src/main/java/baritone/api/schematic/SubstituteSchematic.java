/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class07662
 *  minecraft.class08092
 */
package baritone.api.schematic;

import baritone.api.schematic.AbstractSchematic;
import baritone.api.schematic.ISchematic;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class07662;
import minecraft.class08092;

public class SubstituteSchematic
extends AbstractSchematic {
    private final ISchematic schematic;
    private final Map<class00891, List<class00891>> substitutions;
    private final Map<class00500, Map<class00891, class00500>> blockStateCache = new HashMap<class00500, Map<class00891, class00500>>();

    public SubstituteSchematic(ISchematic iSchematic, Map<class00891, List<class00891>> map) {
        super(iSchematic.widthX(), iSchematic.heightY(), iSchematic.lengthZ());
        this.schematic = iSchematic;
        this.substitutions = map;
    }

    private class00500 withBlock(class00500 class005003, class00891 class008912) {
        if (this.blockStateCache.containsKey(class005003) && this.blockStateCache.get(class005003).containsKey(class008912)) {
            return this.blockStateCache.get(class005003).get(class008912);
        }
        Collection collection = class005003.y();
        class00500 class005004 = class008912.W();
        for (class08092 class080922 : collection) {
            try {
                class005004 = this.copySingleProp(class005003, class005004, class080922);
            }
            catch (IllegalArgumentException illegalArgumentException) {}
        }
        this.blockStateCache.computeIfAbsent(class005003, class005002 -> new HashMap()).put(class008912, class005004);
        return class005004;
    }

    private <T extends Comparable<T>> class00500 copySingleProp(class00500 class005002, class00500 class005003, class08092<T> class080922) {
        return (class00500)class005003.y(class080922, class005002.L(class080922));
    }

    @Override
    public class00500 desiredState(int n, int n2, int n3, class00500 class005002, List<class00500> list) {
        class00500 class005003 = this.schematic.desiredState(n, n2, n3, class005002, list);
        class00891 class008912 = class005003.i();
        if (!this.substitutions.containsKey(class008912)) {
            return class005003;
        }
        List<class00891> list2 = this.substitutions.get(class008912);
        if (list2.contains(class005002.i()) && !(class005002.i() instanceof class07662)) {
            return this.withBlock(class005003, class005002.i());
        }
        for (class00891 class008913 : list2) {
            if (class008913 instanceof class07662) {
                return class005002.i() instanceof class07662 ? class005002 : class00869.N.W();
            }
            for (class00500 class005004 : list) {
                if (!class008913.equals(class005004.i())) continue;
                return this.withBlock(class005003, class005004.i());
            }
        }
        return list2.get(0).W();
    }

    @Override
    public boolean inSchematic(int n, int n2, int n3, class00500 class005002) {
        return this.schematic.inSchematic(n, n2, n3, class005002);
    }
}

