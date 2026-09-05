/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.google.common.collect.ImmutableSet
 *  javax.annotation.Nonnull
 *  minecraft.class00500
 *  minecraft.class00522
 *  minecraft.class00891
 *  minecraft.class01093
 *  minecraft.class01611
 *  minecraft.class04160
 *  minecraft.class04162
 *  minecraft.class04782
 *  minecraft.class05074
 *  minecraft.class05927
 *  minecraft.class05946
 *  minecraft.class06551
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06925
 *  minecraft.class07310
 *  minecraft.class08092
 */
package baritone.api.utils;

import baritone.api.utils.BlockOptionalMeta$ServerLevelStub;
import baritone.api.utils.BlockUtils;
import baritone.api.utils.accessor.IItemStack;
import baritone.api.utils.accessor.ILootTable;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import javax.annotation.Nonnull;
import minecraft.class00500;
import minecraft.class00522;
import minecraft.class00891;
import minecraft.class01093;
import minecraft.class01611;
import minecraft.class04160;
import minecraft.class04162;
import minecraft.class04782;
import minecraft.class05074;
import minecraft.class05927;
import minecraft.class05946;
import minecraft.class06551;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06925;
import minecraft.class07310;
import minecraft.class08092;

public final class BlockOptionalMeta {
    private static final Pattern PATTERN = Pattern.compile("^(?<id>.+?)(?:\\[(?<properties>.+?)?\\])?$");
    private final class00891 block;
    private final String propertiesDescription;
    private final Set<class00500> blockstates;
    private final ImmutableSet<Integer> stateHashes;
    private final ImmutableSet<Integer> stackHashes;
    private static Map<class00891, List<class06581>> drops = new HashMap<class00891, List<class06581>>();
    private static Method getVanillaServerPack;

    public BlockOptionalMeta(@Nonnull class00891 class008912) {
        this.block = class008912;
        this.propertiesDescription = "{}";
        this.blockstates = BlockOptionalMeta.getStates(class008912, Collections.emptyMap());
        this.stateHashes = BlockOptionalMeta.getStateHashes(this.blockstates);
        this.stackHashes = BlockOptionalMeta.getStackHashes(this.blockstates);
    }

    public BlockOptionalMeta(@Nonnull String string) {
        Matcher matcher = PATTERN.matcher(string);
        if (!matcher.find()) {
            throw new IllegalArgumentException("invalid block selector");
        }
        this.block = BlockUtils.stringToBlockRequired(matcher.group("id"));
        String string2 = matcher.group("properties");
        Map map = string2 == null || string2.equals("") ? Collections.emptyMap() : BlockOptionalMeta.parseProperties(this.block, string2);
        this.propertiesDescription = string2 == null ? "{}" : "{" + string2.replace("=", ":") + "}";
        this.blockstates = BlockOptionalMeta.getStates(this.block, map);
        this.stateHashes = BlockOptionalMeta.getStateHashes(this.blockstates);
        this.stackHashes = BlockOptionalMeta.getStackHashes(this.blockstates);
    }

    public String toString() {
        return String.format("BlockOptionalMeta{block=%s,properties=%s}", this.block, this.propertiesDescription);
    }

    public boolean matches(@Nonnull class00500 class005002) {
        class00891 class008912 = class005002.i();
        return class008912 == this.block && this.stateHashes.contains((Object)class005002.hashCode());
    }

    public boolean matches(class06584 class065842) {
        int n = ((IItemStack)class065842).getBaritoneHash();
        return this.stackHashes.contains((Object)(n -= class065842.P()));
    }

    public boolean matches(@Nonnull class00891 class008912) {
        return class008912 == this.block;
    }

    public class00891 getBlock() {
        return this.block;
    }

    private static List<class06584> getDrops(class00891 class008912, class04160 class041602) {
        Optional optional = class008912.d();
        if (optional.isEmpty()) {
            return Collections.emptyList();
        }
        class04162 class041622 = class041602.N(class06551.Z, (Object)class008912.W()).N(class06925.j);
        BlockOptionalMeta$ServerLevelStub blockOptionalMeta$ServerLevelStub = (BlockOptionalMeta$ServerLevelStub)class041622.N();
        class05074 class050742 = blockOptionalMeta$ServerLevelStub.holder().N((class05946)optional.get());
        return ((ILootTable)class050742).invokeGetRandomItems(new class05927(class041622).N(1L).N(null));
    }

    private static Set<class00500> getStates(@Nonnull class00891 class008912, @Nonnull Map<class08092<?>, ?> map) {
        return class008912.E().N().stream().filter(class005002 -> map.entrySet().stream().allMatch(entry -> class005002.L((class08092)entry.getKey()) == entry.getValue())).collect(Collectors.toSet());
    }

    private static synchronized List<class06581> drops(class00891 class008912) {
        return drops.computeIfAbsent(class008912, class008913 -> {
            Optional optional = class008913.d();
            if (optional.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                BlockOptionalMeta$ServerLevelStub blockOptionalMeta$ServerLevelStub = BlockOptionalMeta$ServerLevelStub.fastCreate();
                class04160 class041602 = new class04160((class04782)blockOptionalMeta$ServerLevelStub).N(class06551.B, (Object)class06889.L).N(class06551.Z, (Object)class008912.W()).N(class06551.U, (Object)new class06584((class07310)class06570.Tf, 1));
                BlockOptionalMeta.getDrops(class008913, class041602).stream().map(class06584::B).forEach(arrayList::add);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return arrayList;
        });
    }

    public class00500 getAnyBlockState() {
        if (this.blockstates.size() > 0) {
            return this.blockstates.iterator().next();
        }
        return null;
    }

    public Set<Integer> stackHashes() {
        return this.stackHashes;
    }

    private static <C extends Comparable<C>, P extends class08092<C>> P castToIProperty(Object object) {
        return (P)((class08092)object);
    }

    private static ImmutableSet<Integer> getStateHashes(Set<class00500> set) {
        return ImmutableSet.copyOf((Object[])((Integer[])set.stream().map(class00522::hashCode).toArray(Integer[]::new)));
    }

    public Set<class00500> getAllBlockStates() {
        return this.blockstates;
    }

    private static ImmutableSet<Integer> getStackHashes(Set<class00500> set) {
        return ImmutableSet.copyOf((Object[])((Integer[])set.stream().flatMap(class005002 -> BlockOptionalMeta.drops(class005002.i()).stream().map(class065812 -> new class06584((class07310)class065812, 1))).map(class065842 -> ((IItemStack)class065842).getBaritoneHash()).toArray(Integer[]::new)));
    }

    private static Map<class08092<?>, ?> parseProperties(class00891 class008912, String string) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (String string2 : string.split(",")) {
            String[] stringArray = string2.split("=");
            if (stringArray.length != 2) {
                throw new IllegalArgumentException(String.format("\"%s\" is not a valid property-value pair", string2));
            }
            String string3 = stringArray[0];
            String string4 = stringArray[1];
            class08092 class080922 = class008912.E().N(string3);
            Comparable comparable = (Comparable)BlockOptionalMeta.castToIProperty(class080922).y(string4).orElseThrow(() -> new IllegalArgumentException(String.format("\"%s\" is not a valid value for %s on %s", string4, class080922, class008912)));
            builder.put((Object)class080922, (Object)comparable);
        }
        return builder.build();
    }

    private static class01611 getVanillaServerPack() {
        if (getVanillaServerPack == null) {
            getVanillaServerPack = Arrays.stream(class01093.class.getDeclaredMethods()).filter(method -> method.getReturnType() == class01611.class).findFirst().orElseThrow();
            getVanillaServerPack.setAccessible(true);
        }
        try {
            return (class01611)getVanillaServerPack.invoke(null, new Object[0]);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }
}

