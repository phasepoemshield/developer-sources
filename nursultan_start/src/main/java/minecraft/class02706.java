/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.google.common.collect.Lists
 *  com.google.gson.JsonElement
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00390
 *  minecraft.class00392
 *  minecraft.class01929
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class02484
 *  minecraft.class02499
 *  minecraft.class02826
 *  minecraft.class03748
 *  minecraft.class04247
 *  minecraft.class05001
 *  minecraft.class05018
 *  minecraft.class05216
 *  minecraft.class06338
 *  minecraft.class06497
 *  minecraft.class06541
 *  minecraft.class06584
 *  minecraft.class06591
 *  minecraft.class07049
 *  minecraft.class07701
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00390;
import minecraft.class00392;
import minecraft.class01929;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class02484;
import minecraft.class02499;
import minecraft.class02666;
import minecraft.class02694;
import minecraft.class02826;
import minecraft.class03748;
import minecraft.class04247;
import minecraft.class05001;
import minecraft.class05018;
import minecraft.class05216;
import minecraft.class06338;
import minecraft.class06497;
import minecraft.class06541;
import minecraft.class06584;
import minecraft.class06591;
import minecraft.class07049;
import minecraft.class07701;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public final class class02706
extends Record
implements class02499<class00392, class02706>,
class02694 {
    private final class02826<String> title;
    private final String author;
    private final int generation;
    private final List<class02826<class00392>> pages;
    private final boolean resolved;
    public static final class02706 N = new class02706((class02826<String>)class02826.N((Object)""), "", 0, List.of(), true);
    public static final int y = Short.MAX_VALUE;
    public static final int L = 16;
    public static final int u = 32;
    public static final int i = 3;
    public static final int R = 2;
    public static final Codec<class00392> M = class03748.N((int)Short.MAX_VALUE);
    public static final Codec<List<class02826<class00392>>> B = class02706.N(M);
    public static final Codec<class02706> Z = RecordCodecBuilder.create(instance -> instance.group((App)class02826.N((Codec)Codec.string((int)0, (int)32)).fieldOf("title").forGetter(class02706::u), (App)Codec.STRING.fieldOf("author").forGetter(class02706::i), (App)class06338.N((int)0, (int)3).optionalFieldOf("generation", (Object)0).forGetter(class02706::R), (App)B.optionalFieldOf("pages", List.of()).forGetter(class02706::N), (App)Codec.BOOL.optionalFieldOf("resolved", (Object)false).forGetter(class02706::M)).apply(instance, class02706::new));
    public static final class02362<class04247, class02706> z = class02362.N((class02362)class02826.N((class02362)class02389.y((int)32)), class02706::u, (class02362)class02389.s, class02706::i, (class02362)class02389.B, class02706::R, (class02362)class02826.N((class02362)class03748.y).N_33(class02389.N()), class02706::N, (class02362)class02389.y, class02706::M, class02706::new);

    public class02706 L() {
        return new class02706(this.title, this.author, this.generation, this.pages, true);
    }

    public boolean M() {
        return this.resolved;
    }

    public class02706(class02826<String> class028262, String string, int n, List<class02826<class00392>> list, boolean bl) {
        if (n < 0 || n > 3) {
            throw new IllegalArgumentException("Generation was " + n + ", but must be between 0 and 3");
        }
        this.title = class028262;
        this.author = string;
        this.generation = n;
        this.pages = list;
        this.resolved = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02706.class, "title;author;generation;pages;resolved", "title", "author", "generation", "pages", "resolved"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02706.class, "title;author;generation;pages;resolved", "title", "author", "generation", "pages", "resolved"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02706.class, "title;author;generation;pages;resolved", "title", "author", "generation", "pages", "resolved"}, this);
    }

    public String i() {
        return this.author;
    }

    public class02826<String> u() {
        return this.title;
    }

    private static Codec<class02826<class00392>> y(Codec<class00392> codec) {
        return class02826.N(codec);
    }

    public @Nullable class02706 y() {
        if (this.generation >= 2) {
            return null;
        }
        return new class02706(this.title, this.author, this.generation + 1, this.pages, this.resolved);
    }

    private static Optional<class02826<class00392>> N(class07701 class077012, @Nullable class08036 class080362, class02826<class00392> class028262) {
        return class028262.y((T class003922) -> {
            try {
                class05216 class052162 = class00390.N((class07701)class077012, (class00392)class003922, (class07049)class080362, (int)0);
                if (class02706.N((class00392)class052162, (class01929)class077012.t())) {
                    return Optional.empty();
                }
                return Optional.of(class052162);
            }
            catch (Exception exception) {
                return Optional.of(class003922);
            }
        });
    }

    private static boolean N(class00392 class003922, class01929 class019292) {
        DataResult dataResult = class03748.N.encodeStart((DynamicOps)class019292.N((DynamicOps)JsonOps.INSTANCE), (Object)class003922);
        return dataResult.isSuccess() && class05001.N((JsonElement)((JsonElement)dataResult.getOrThrow()), (int)Short.MAX_VALUE);
    }

    public List<class02826<class00392>> N() {
        return this.pages;
    }

    public static boolean N(class06584 class065842, class07701 class077012, @Nullable class08036 class080362) {
        class02706 class027062 = (class02706)class065842.method_58694(class02484.NL);
        if (class027062 != null && !class027062.M()) {
            class02706 class027063 = class027062.N(class077012, class080362);
            if (class027063 != null) {
                class065842.N(class02484.NL, (Object)class027063);
                return true;
            }
            class065842.N(class02484.NL, (Object)class027062.L());
        }
        return false;
    }

    @Override
    public void N(class06591 class065912, Consumer<class00392> consumer, class06497 class064972, class02666 class026662) {
        if (!class05018.B((String)this.author)) {
            consumer.accept((class00392)class00392.N((String)"book.byAuthor", (Object[])new Object[]{this.author}).N(class06541.field_1080));
        }
        consumer.accept((class00392)class00392.L((String)("book.generation." + this.generation)).N(class06541.field_1080));
    }

    public static Codec<List<class02826<class00392>>> N(Codec<class00392> codec) {
        return class02706.y(codec).listOf();
    }

    public class02706 y(List<class02826<class00392>> list) {
        return new class02706(this.title, this.author, this.generation, list, false);
    }

    public List<class00392> N(boolean bl) {
        return Lists.transform(this.pages, class028262 -> (class00392)class028262.N(bl));
    }

    public @Nullable class02706 N(class07701 class077012, @Nullable class08036 class080362) {
        if (this.resolved) {
            return null;
        }
        ImmutableList.Builder builder = ImmutableList.builderWithExpectedSize((int)this.pages.size());
        for (class02826<class00392> class028262 : this.pages) {
            Optional<class02826<class00392>> optional = class02706.N(class077012, class080362, class028262);
            if (optional.isEmpty()) {
                return null;
            }
            builder.add(optional.get());
        }
        return new class02706(this.title, this.author, this.generation, (List<class02826<class00392>>)builder.build(), true);
    }

    public int R() {
        return this.generation;
    }
}

