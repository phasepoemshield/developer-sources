/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00667
 *  minecraft.class01289
 *  minecraft.class01445
 *  minecraft.class01491
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02895
 *  minecraft.class04003
 *  minecraft.class04142
 *  minecraft.class04206
 *  minecraft.class04391
 *  minecraft.class04782
 *  minecraft.class05018
 *  minecraft.class05352
 *  minecraft.class05359
 *  minecraft.class05378
 *  minecraft.class05744
 *  minecraft.class05751
 *  minecraft.class06289
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07075
 *  minecraft.class07209
 *  minecraft.class07438
 *  minecraft.class08041
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.lang.runtime.SwitchBootstraps;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00667;
import minecraft.class01289;
import minecraft.class01445;
import minecraft.class01491;
import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;
import minecraft.class04003;
import minecraft.class04142;
import minecraft.class04206;
import minecraft.class04391;
import minecraft.class04782;
import minecraft.class05018;
import minecraft.class05352;
import minecraft.class05359;
import minecraft.class05378;
import minecraft.class05744;
import minecraft.class05751;
import minecraft.class06289;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07075;
import minecraft.class07209;
import minecraft.class07438;
import minecraft.class08041;
import org.jspecify.annotations.Nullable;

public final class class00434
extends Record {
    private final String name;
    private final String profession;
    private final int xp;
    private final float health;
    private final float maxHealth;
    private final String inventory;
    private final boolean wantsGolem;
    private final int angerLevel;
    private final List<String> activities;
    private final List<String> behaviors;
    private final List<String> memories;
    private final List<String> gossips;
    private final Set<class07209> pois;
    private final Set<class07209> potentialPois;
    public static final class02362<class00667, class00434> N = class02362.N((class006672, class004342) -> class004342.N((class00667)class006672), class00434::new);

    public int L() {
        return this.xp;
    }

    public boolean M() {
        return this.wantsGolem;
    }

    public class00434(String string, String string2, int n, float f, float f2, String string3, boolean bl, int n2, List<String> list, List<String> list2, List<String> list3, List<String> list4, Set<class07209> set, Set<class07209> set2) {
        this.name = string;
        this.profession = string2;
        this.xp = n;
        this.health = f;
        this.maxHealth = f2;
        this.inventory = string3;
        this.wantsGolem = bl;
        this.angerLevel = n2;
        this.activities = list;
        this.behaviors = list2;
        this.memories = list3;
        this.gossips = list4;
        this.pois = set;
        this.potentialPois = set2;
    }

    public class00434(class00667 class006672) {
        this(class006672.s(), class006672.s(), class006672.readInt(), class006672.readFloat(), class006672.readFloat(), class006672.s(), class006672.readBoolean(), class006672.readInt(), class006672.N_16(class00667::s), class006672.N_16(class00667::s), class006672.N_16(class00667::s), class006672.N_16(class00667::s), (Set)class006672.N_15(HashSet::new, (class02895)class07209.field_48404), (Set)class006672.N_15(HashSet::new, (class02895)class07209.field_48404));
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00434.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "name", "profession", "xp", "health", "maxHealth", "inventory", "wantsGolem", "angerLevel", "activities", "behaviors", "memories", "gossips", "pois", "potentialPois"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00434.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "name", "profession", "xp", "health", "maxHealth", "inventory", "wantsGolem", "angerLevel", "activities", "behaviors", "memories", "gossips", "pois", "potentialPois"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00434.class, "name;profession;xp;health;maxHealth;inventory;wantsGolem;angerLevel;activities;behaviors;memories;gossips;pois;potentialPois", "name", "profession", "xp", "health", "maxHealth", "inventory", "wantsGolem", "angerLevel", "activities", "behaviors", "memories", "gossips", "pois", "potentialPois"}, this);
    }

    public int B() {
        return this.angerLevel;
    }

    public List<String> Z() {
        return this.activities;
    }

    public float i() {
        return this.maxHealth;
    }

    public Set<class07209> m() {
        return this.potentialPois;
    }

    public List<String> U() {
        return this.memories;
    }

    public List<String> z() {
        return this.behaviors;
    }

    public float u() {
        return this.health;
    }

    public boolean y(class07209 class072092) {
        return this.potentialPois.contains(class072092);
    }

    public String y() {
        return this.profession;
    }

    public List<String> E() {
        return this.gossips;
    }

    private static List<String> N(class08041 class080412) {
        ArrayList<String> arrayList = new ArrayList<String>();
        class080412.O().N().forEach((uUID, object2IntMap) -> {
            String string = class01445.N((UUID)uUID);
            object2IntMap.forEach((class053462, n) -> arrayList.add(string + ": " + String.valueOf(class053462) + ": " + n));
        });
        return arrayList;
    }

    public String N() {
        return this.name;
    }

    public boolean N(class07209 class072092) {
        return this.pois.contains(class072092);
    }

    private static String N(class04782 class047822, @Nullable Object object2) {
        Object object3 = object2;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{UUID.class, class07049.class, class05352.class, class05751.class, class06289.class, class05744.class, class07072.class, Collection.class}, (Object)object3, (int)n)) {
            case -1 -> "-";
            case 0 -> {
                UUID var4_4 = (UUID)object3;
                yield class00434.N(class047822, class047822.method_66347(var4_4));
            }
            case 1 -> class01445.N((class07049)((class07049)object3));
            case 2 -> {
                class05352 var6_5 = (class05352)object3;
                yield class00434.N(class047822, var6_5.N());
            }
            case 3 -> {
                class05751 var7_6 = (class05751)object3;
                yield class00434.N(class047822, var7_6.L());
            }
            case 4 -> {
                class06289 var8_7 = (class06289)object3;
                yield class00434.N(class047822, var8_7.y());
            }
            case 5 -> {
                class05744 var9_8 = (class05744)object3;
                yield class00434.N(class047822, var9_8.y());
            }
            case 6 -> {
                class07049 var11_9 = ((class07072)object3).u();
                if (var11_9 == null) {
                    yield object2.toString();
                }
                yield class00434.N(class047822, var11_9);
            }
            case 7 -> {
                Collection var11_10 = (Collection)object3;
                yield "[" + var11_10.stream().map(object -> class00434.N(class047822, object)).collect(Collectors.joining(", ")) + "]";
            }
            default -> object2.toString();
        };
    }

    private static String N(class04782 class047822, long l, class05378<?> class053782, Optional<? extends class01491<?>> optional) {
        Object object;
        if (optional.isPresent()) {
            class01491<?> class014912 = optional.get();
            Object object2 = class014912.L();
            object = class053782 == class05378.g ? l - (Long)object2 + " ticks ago" : (class014912.i() ? class00434.N(class047822, object2) + " (ttl: " + class014912.y() + ")" : class00434.N(class047822, object2));
        } else {
            object = "-";
        }
        return class04206.k.y(class053782).N() + ": " + (String)object;
    }

    private static Stream<String> N(class04782 class047822, class07438 class074382, long l) {
        return class074382.method_18868().L().entrySet().stream().map(entry -> {
            class05378 class053782 = (class05378)entry.getKey();
            Optional optional = (Optional)entry.getValue();
            return class00434.N(class047822, l, class053782, optional);
        }).sorted();
    }

    public void N(class00667 class006672) {
        class006672.N(this.name);
        class006672.N(this.profession);
        class006672.writeInt(this.xp);
        class006672.writeFloat(this.health);
        class006672.writeFloat(this.maxHealth);
        class006672.N(this.inventory);
        class006672.writeBoolean(this.wantsGolem);
        class006672.writeInt(this.angerLevel);
        class006672.N_12(this.activities, class00667::N);
        class006672.N_12(this.behaviors, class00667::N);
        class006672.N_12(this.memories, class00667::N);
        class006672.N_12(this.gossips, class00667::N);
        class006672.N_12(this.pois, (class02874)class07209.field_48404);
        class006672.N_12(this.potentialPois, (class02874)class07209.field_48404);
    }

    public static class00434 N(class04782 class047822, class07438 class074382) {
        int n;
        Object object;
        boolean bl;
        class04391 class043912;
        class07075 class070752;
        int n2;
        String string2;
        String string3 = class01445.N((class07049)class074382);
        if (class074382 instanceof class08041) {
            class08041 class080412 = (class08041)class074382;
            string2 = class080412.t().y().M();
            n2 = class080412.u();
        } else {
            string2 = "";
            n2 = 0;
        }
        float f = class074382.method_6032();
        float f2 = class074382.method_6063();
        class01289 var7 = class074382.method_18868();
        long l = class074382.method_73183().N();
        String string4 = class074382 instanceof class04391 ? ((class070752 = (class043912 = (class04391)class074382).n()).method_5442() ? "" : class070752.toString()) : "";
        boolean bl2 = bl = class074382 instanceof class08041 && (class070752 = (class08041)class074382).N(l);
        if (class074382 instanceof class04003) {
            object = (class04003)class074382;
            n = object.E();
        } else {
            n = -1;
        }
        int n3 = n;
        object = var7.u().stream().map(class05359::N).toList();
        List list = var7.z().stream().map(class04142::method_46910).toList();
        List list2 = class00434.N(class047822, class074382, l).map(string -> class05018.N((String)string, (int)255, (boolean)true)).toList();
        Set<class07209> var16 = class00434.N(var7, class05378.L, class05378.y, class05378.i);
        Set<class07209> var17 = class00434.N(var7, class05378.u);
        List<String> list3 = class074382 instanceof class08041 ? class00434.N((class08041)class074382) : List.of();
        return new class00434(string3, string2, n2, f, f2, string4, bl, n3, (List<String>)object, list, list2, list3, var16, var17);
    }

    @SafeVarargs
    private static Set<class07209> N(class01289<?> class012892, class05378<class06289> ... class05378Array) {
        return Stream.of(class05378Array).filter(arg_0 -> class012892.N(arg_0)).map(arg_0 -> class012892.L(arg_0)).flatMap(Optional::stream).map(class06289::y).collect(Collectors.toSet());
    }

    public Set<class07209> W() {
        return this.pois;
    }

    public String R() {
        return this.inventory;
    }
}

