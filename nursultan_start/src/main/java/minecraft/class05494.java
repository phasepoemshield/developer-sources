/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class05505;
import minecraft.class05513;
import minecraft.class05532;

public class class05494 {
    private static final char N = ' ';
    private static final char y = '_';
    private static final char L = '+';
    private static final char u = 'x';
    private static final char i = 'X';
    private final Collection<class05513> R = Lists.newArrayList();
    private final Collection<class05532> M = Lists.newArrayList();

    public int L() {
        return (int)this.R.stream().filter(class05513::U).count();
    }

    public Collection<class05513> M() {
        return this.R.stream().filter(class05513::Z).filter(class05513::j).collect(Collectors.toList());
    }

    public class05494() {
    }

    public class05494(Collection<class05513> collection) {
        this.R.addAll(collection);
    }

    public String toString() {
        return this.z();
    }

    public int B() {
        return this.R.size();
    }

    public boolean Z() {
        return this.L() == this.B();
    }

    public boolean i() {
        return this.y() > 0;
    }

    public String z() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        this.R.forEach(class055132 -> {
            if (!class055132.z()) {
                stringBuffer.append(' ');
            } else if (class055132.B()) {
                stringBuffer.append('+');
            } else if (class055132.Z()) {
                stringBuffer.append(class055132.b() ? (char)'X' : (char)'x');
            } else {
                stringBuffer.append('_');
            }
        });
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public boolean u() {
        return this.N() > 0;
    }

    public void y(class05513 class055132) {
        this.R.remove(class055132);
    }

    public int y() {
        return (int)this.R.stream().filter(class05513::Z).filter(class05513::j).count();
    }

    public void N(class05513 class055132) {
        this.R.add(class055132);
        this.M.forEach(class055132::N);
    }

    public int N() {
        return (int)this.R.stream().filter(class05513::Z).filter(class05513::b).count();
    }

    public void N(Consumer<class05513> consumer) {
        this.N(new class05505(this, consumer));
    }

    public void N(class05532 class055322) {
        this.M.add(class055322);
        this.R.forEach(class055132 -> class055132.N(class055322));
    }

    public Collection<class05513> R() {
        return this.R.stream().filter(class05513::Z).filter(class05513::b).collect(Collectors.toList());
    }
}

