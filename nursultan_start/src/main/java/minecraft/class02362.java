/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09698
 *  Nursultan.class09699
 *  Nursultan.class09701
 *  Nursultan.class09703
 *  Nursultan.class09704
 *  Nursultan.class09705
 *  Nursultan.class09706
 *  Nursultan.class10068
 *  Nursultan.class10069
 *  Nursultan.class10070
 *  Nursultan.class10071
 *  Nursultan.class10072
 *  Nursultan.class10073
 *  Nursultan.class10074
 *  Nursultan.class10075
 *  Nursultan.class10076
 *  Nursultan.class10078
 *  Nursultan.class10079
 *  Nursultan.class10080
 *  com.mojang.datafixers.util.Function10
 *  com.mojang.datafixers.util.Function11
 *  com.mojang.datafixers.util.Function12
 *  com.mojang.datafixers.util.Function3
 *  com.mojang.datafixers.util.Function4
 *  com.mojang.datafixers.util.Function5
 *  com.mojang.datafixers.util.Function6
 *  com.mojang.datafixers.util.Function7
 *  com.mojang.datafixers.util.Function8
 *  com.mojang.datafixers.util.Function9
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02874
 *  minecraft.class02876
 *  minecraft.class02880
 *  minecraft.class02895
 */
package minecraft;

import Nursultan.class09698;
import Nursultan.class09699;
import Nursultan.class09701;
import Nursultan.class09703;
import Nursultan.class09704;
import Nursultan.class09705;
import Nursultan.class09706;
import Nursultan.class10068;
import Nursultan.class10069;
import Nursultan.class10070;
import Nursultan.class10071;
import Nursultan.class10072;
import Nursultan.class10073;
import Nursultan.class10074;
import Nursultan.class10075;
import Nursultan.class10076;
import Nursultan.class10078;
import Nursultan.class10079;
import Nursultan.class10080;
import com.mojang.datafixers.util.Function10;
import com.mojang.datafixers.util.Function11;
import com.mojang.datafixers.util.Function12;
import com.mojang.datafixers.util.Function3;
import com.mojang.datafixers.util.Function4;
import com.mojang.datafixers.util.Function5;
import com.mojang.datafixers.util.Function6;
import com.mojang.datafixers.util.Function7;
import com.mojang.datafixers.util.Function8;
import com.mojang.datafixers.util.Function9;
import io.netty.buffer.ByteBuf;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import minecraft.class02874;
import minecraft.class02876;
import minecraft.class02880;
import minecraft.class02895;

public interface class02362<B, V>
extends class02874<B, V>,
class02895<B, V> {
    default public <O extends ByteBuf> class02362<O, V> y(Function<O, ? extends B> function) {
        return new class09705(this, function);
    }

    default public <U> class02362<B, U> y(Function<? super U, ? extends V> function, Function<? super V, ? extends class02362<? super B, ? extends U>> function2) {
        return new class10072(this, function2, function);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, class02362<? super B, T8> class023629, Function<C, T8> function8, class02362<? super B, T9> class0236210, Function<C, T9> function9, Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, C> function92) {
        return new class10080(class023622, class023623, class023624, class023625, class023626, class023627, class023628, class023629, class0236210, function92, function, function2, function3, function4, function5, function6, function7, function8, function9);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, class02362<? super B, T8> class023629, Function<C, T8> function8, Function8<T1, T2, T3, T4, T5, T6, T7, T8, C> function82) {
        return new class10075(class023622, class023623, class023624, class023625, class023626, class023627, class023628, class023629, function82, function, function2, function3, function4, function5, function6, function7, function8);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, Function7<T1, T2, T3, T4, T5, T6, T7, C> function72) {
        return new class10068(class023622, class023623, class023624, class023625, class023626, class023627, class023628, function72, function, function2, function3, function4, function5, function6, function7);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, Function6<T1, T2, T3, T4, T5, T6, C> function62) {
        return new class10071(class023622, class023623, class023624, class023625, class023626, class023627, function62, function, function2, function3, function4, function5, function6);
    }

    public static <B, C, T1, T2, T3, T4, T5> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, Function5<T1, T2, T3, T4, T5, C> function52) {
        return new class10073(class023622, class023623, class023624, class023625, class023626, function52, function, function2, function3, function4, function5);
    }

    public static <B, T> class02362<B, T> N_32(UnaryOperator<class02362<B, T>> unaryOperator) {
        return new class09701(unaryOperator);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, class02362<? super B, T8> class023629, Function<C, T8> function8, class02362<? super B, T9> class0236210, Function<C, T9> function9, class02362<? super B, T10> class0236211, Function<C, T10> function10, class02362<? super B, T11> class0236212, Function<C, T11> function11, class02362<? super B, T12> class0236213, Function<C, T12> function12, Function12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, C> function122) {
        return new class09698(class023622, class023623, class023624, class023625, class023626, class023627, class023628, class023629, class0236210, class0236211, class0236212, class0236213, function122, function, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11, function12);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, class02362<? super B, T8> class023629, Function<C, T8> function8, class02362<? super B, T9> class0236210, Function<C, T9> function9, class02362<? super B, T10> class0236211, Function<C, T10> function10, class02362<? super B, T11> class0236212, Function<C, T11> function11, Function11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, C> function112) {
        return new class10069(class023622, class023623, class023624, class023625, class023626, class023627, class023628, class023629, class0236210, class0236211, class0236212, function112, function, function2, function3, function4, function5, function6, function7, function8, function9, function10, function11);
    }

    public static <B, C, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, class02362<? super B, T5> class023626, Function<C, T5> function5, class02362<? super B, T6> class023627, Function<C, T6> function6, class02362<? super B, T7> class023628, Function<C, T7> function7, class02362<? super B, T8> class023629, Function<C, T8> function8, class02362<? super B, T9> class0236210, Function<C, T9> function9, class02362<? super B, T10> class0236211, Function<C, T10> function10, Function10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, C> function102) {
        return new class10074(class023622, class023623, class023624, class023625, class023626, class023627, class023628, class023629, class0236210, class0236211, function102, function, function2, function3, function4, function5, function6, function7, function8, function9, function10);
    }

    default public <S extends B> class02362<S, V> N() {
        return this;
    }

    default public <O> class02362<B, O> N_10(Function<? super V, ? extends O> function, Function<? super O, ? extends V> function2) {
        return new class09704(this, function, function2);
    }

    default public <O> class02362<B, O> N_33(class02876<B, V, O> class028762) {
        return class028762.apply(this);
    }

    public static <B, V> class02362<B, V> N(V v) {
        return new class09699(v);
    }

    public static <B, V> class02362<B, V> N_34(class02880<B, V> class028802, class02895<B, V> class028952) {
        return new class09706(class028952, class028802);
    }

    public static <B, V> class02362<B, V> N(class02874<B, V> class028742, class02895<B, V> class028952) {
        return new class09703(class028952, class028742);
    }

    public static <B, C, T1, T2, T3, T4> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, class02362<? super B, T4> class023625, Function<C, T4> function4, Function4<T1, T2, T3, T4, C> function42) {
        return new class10076(class023622, class023623, class023624, class023625, function42, function, function2, function3, function4);
    }

    public static <B, C, T1, T2, T3> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, class02362<? super B, T3> class023624, Function<C, T3> function3, Function3<T1, T2, T3, C> function32) {
        return new class10078(class023622, class023623, class023624, function32, function, function2, function3);
    }

    public static <B, C, T1, T2> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, class02362<? super B, T2> class023623, Function<C, T2> function2, BiFunction<T1, T2, C> biFunction) {
        return new class10070(class023622, class023623, biFunction, function, function2);
    }

    public static <B, C, T1> class02362<B, C> N(class02362<? super B, T1> class023622, Function<C, T1> function, Function<T1, C> function2) {
        return new class10079(class023622, function2, function);
    }
}

