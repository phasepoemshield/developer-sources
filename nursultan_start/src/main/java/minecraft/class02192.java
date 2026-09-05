/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09647
 *  Nursultan.class09653
 *  Nursultan.class09654
 *  Nursultan.class09656
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.brigadier.ImmutableStringReader
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02168
 *  minecraft.class02169
 *  minecraft.class02179
 *  minecraft.class02315
 *  minecraft.class02324
 *  minecraft.class02332
 *  minecraft.class02344
 *  minecraft.class02353
 *  minecraft.class06244
 *  minecraft.class07536
 *  minecraft.class07713
 *  minecraft.class08501
 */
package minecraft;

import Nursultan.class09647;
import Nursultan.class09653;
import Nursultan.class09654;
import Nursultan.class09656;
import com.google.common.collect.ImmutableList;
import com.mojang.brigadier.ImmutableStringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.Optional;
import minecraft.class02168;
import minecraft.class02169;
import minecraft.class02179;
import minecraft.class02190;
import minecraft.class02196;
import minecraft.class02315;
import minecraft.class02324;
import minecraft.class02332;
import minecraft.class02344;
import minecraft.class02353;
import minecraft.class06244;
import minecraft.class07536;
import minecraft.class07713;
import minecraft.class08501;

public class class02192 {
    public static <T, C, P> class02169<List<T>> N(class02168<T, C, P> class021682) {
        class02353 class023532 = class02353.N((String)"top");
        class02353 class023533 = class02353.N((String)"type");
        class02353 class023534 = class02353.N((String)"any_type");
        class02353 class023535 = class02353.N((String)"element_type");
        class02353 class023536 = class02353.N((String)"tag_type");
        class02353 class023537 = class02353.N((String)"conditions");
        class02353 class023538 = class02353.N((String)"alternatives");
        class02353 class023539 = class02353.N((String)"term");
        class02353 class0235310 = class02353.N((String)"negation");
        class02353 class0235311 = class02353.N((String)"test");
        class02353 class0235312 = class02353.N((String)"component_type");
        class02353 class0235313 = class02353.N((String)"predicate_type");
        class02353 class0235314 = class02353.N((String)"id");
        class02353 class0235315 = class02353.N((String)"tag");
        class02344 class023442 = new class02344();
        class08501 class085012 = class023442.N(class0235314, class02196.N);
        class08501 class085013 = class023442.N(class023532, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class023442.L(class023533), class02179.N((char)'['), class02315.L(), class02315.N((class02315)class023442.L(class023537)), class02179.N((char)']')}), class023442.L(class023533)}), class023322 -> {
            ImmutableList.Builder builder = ImmutableList.builder();
            ((Optional)class023322.y(class023533)).ifPresent(arg_0 -> ((ImmutableList.Builder)builder).add(arg_0));
            List list = (List)class023322.N(class023537);
            if (list != null) {
                builder.addAll((Iterable)list);
            }
            return builder.build();
        });
        class023442.N(class023533, class02315.y((class02315[])new class02315[]{class023442.L(class023535), class02315.N((class02315[])new class02315[]{class02179.N((char)'#'), class02315.L(), class023442.L(class023536)}), class023442.L(class023534)}), class023322 -> Optional.ofNullable(class023322.y(new class02353[]{class023535, class023536})));
        class023442.N(class023534, class02179.N((char)'*'), class023322 -> class06244.field_17274);
        class023442.N(class023535, (class02324)new class09653(class085012, class021682));
        class023442.N(class023536, (class02324)new class09647(class085012, class021682));
        class023442.N(class023537, class02315.N((class02315[])new class02315[]{class023442.L(class023538), class02315.N((class02315)class02315.N((class02315[])new class02315[]{class02179.N((char)','), class023442.L(class023537)}))}), class023322 -> {
            Object object = class021682.y((List)class023322.y(class023538));
            return Optional.ofNullable((List)class023322.N(class023537)).map(list -> class07536.N((Object)object, (List)list)).orElse(List.of(object));
        });
        class023442.N(class023538, class02315.N((class02315[])new class02315[]{class023442.L(class023539), class02315.N((class02315)class02315.N((class02315[])new class02315[]{class02179.N((char)'|'), class023442.L(class023538)}))}), class023322 -> {
            Object object = class023322.y(class023539);
            return Optional.ofNullable((List)class023322.N(class023538)).map(list -> class07536.N((Object)object, (List)list)).orElse(List.of(object));
        });
        class023442.N(class023539, class02315.y((class02315[])new class02315[]{class023442.L(class0235311), class02315.N((class02315[])new class02315[]{class02179.N((char)'!'), class023442.L(class0235310)})}), class023322 -> class023322.L(new class02353[]{class0235311, class0235310}));
        class023442.N(class0235310, class023442.L(class0235311), class023322 -> class021682.N(class023322.y(class0235311)));
        class023442.N(class0235311, class02315.y((class02315[])new class02315[]{class02315.N((class02315[])new class02315[]{class023442.L(class0235312), class02179.N((char)'='), class02315.L(), class023442.L(class0235315)}), class02315.N((class02315[])new class02315[]{class023442.L(class0235313), class02179.N((char)'~'), class02315.L(), class023442.L(class0235315)}), class023442.L(class0235312)}), class023252 -> {
            class02332 class023322 = class023252.N();
            Object object = class023322.N(class0235313);
            try {
                if (object != null) {
                    Dynamic dynamic = (Dynamic)class023322.y(class0235315);
                    return class021682.N((ImmutableStringReader)class023252.R(), object, dynamic);
                }
                Object object2 = class023322.y(class0235312);
                Dynamic dynamic = (Dynamic)class023322.N(class0235315);
                return dynamic != null ? class021682.y((ImmutableStringReader)class023252.R(), object2, dynamic) : class021682.N((ImmutableStringReader)class023252.R(), object2);
            }
            catch (CommandSyntaxException commandSyntaxException) {
                class023252.y().N(class023252.M(), (Object)commandSyntaxException);
                return null;
            }
        });
        class023442.N(class0235312, (class02324)new class09656(class085012, class021682));
        class023442.N(class0235313, (class02324)new class09654(class085012, class021682));
        class023442.N(class0235315, new class02190(class07713.N));
        return new class02169(class023442, class085013);
    }
}

