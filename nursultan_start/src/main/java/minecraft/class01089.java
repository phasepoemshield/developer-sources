/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01622
 *  minecraft.class01894
 *  minecraft.class02857
 */
package minecraft;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01079;
import minecraft.class01622;
import minecraft.class01894;
import minecraft.class02857;

public interface class01089
extends class02857 {
    public Map<class01894, List<class01079>> L(String var1, Predicate<class01894> var2);

    public Stream<class01622> y();

    public Map<class01894, class01079> y(String var1, Predicate<class01894> var2);

    public List<class01079> N(class01894 var1);

    public Set<String> N();
}

