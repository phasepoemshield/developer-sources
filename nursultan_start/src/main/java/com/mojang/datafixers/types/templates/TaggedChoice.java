/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.FamilyOptic
 *  com.mojang.datafixers.RewriteResult
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.Type$FieldNotFoundException
 *  com.mojang.datafixers.types.families.TypeFamily
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Either
 *  com.mojang.datafixers.util.Pair
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  javax.annotation.Nullable
 *  net.fabricmc.fabric.impl.dimension.TaggedChoiceExtension
 *  net.fabricmc.fabric.impl.dimension.TaggedChoiceTypeExtension
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package com.mojang.datafixers.types.templates;

import com.google.common.base.Joiner;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.FamilyOptic;
import com.mojang.datafixers.RewriteResult;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.families.TypeFamily;
import com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Either;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import net.fabricmc.fabric.impl.dimension.TaggedChoiceExtension;
import net.fabricmc.fabric.impl.dimension.TaggedChoiceTypeExtension;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public final class TaggedChoice<K>
implements TypeTemplate,
TaggedChoiceExtension {
    private final String name;
    private final Type<K> keyType;
    private final Object2ObjectMap<K, TypeTemplate> templates;
    private final Map<Pair<TypeFamily, Integer>, Type<?>> types = Maps.newConcurrentMap();
    private final int size;
    boolean failSoft = false;

    private void handler$zea000$fabric-dimensions-v1$onApply(Pair pair, CallbackInfoReturnable callbackInfoReturnable) {
        Type type;
        if (this.failSoft && (type = (Type)callbackInfoReturnable.getReturnValue()) instanceof TaggedChoice$TaggedChoiceType) {
            TaggedChoice$TaggedChoiceType taggedChoice$TaggedChoiceType = (TaggedChoice$TaggedChoiceType)type;
            ((TaggedChoiceTypeExtension)taggedChoice$TaggedChoiceType).fabric$setFailSoft(true);
        }
    }

    public TaggedChoice(String string, Type<K> type, Object2ObjectMap<K, TypeTemplate> object2ObjectMap) {
        this.name = string;
        this.keyType = type;
        this.templates = object2ObjectMap;
        this.size = object2ObjectMap.values().stream().mapToInt(TypeTemplate::size).max().orElse(0);
    }

    public int size() {
        return this.size;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof TaggedChoice)) {
            return false;
        }
        TaggedChoice taggedChoice = (TaggedChoice)object;
        return Objects.equals(this.name, taggedChoice.name) && Objects.equals(this.keyType, taggedChoice.keyType) && Objects.equals(this.templates, taggedChoice.templates);
    }

    public String toString() {
        return "TaggedChoice[" + this.name + ", " + Joiner.on((String)", ").withKeyValueSeparator(" -> ").join(this.templates) + "]";
    }

    public int hashCode() {
        int n = this.name.hashCode();
        n = 31 * n + this.keyType.hashCode();
        n = 31 * n + this.templates.hashCode();
        return n;
    }

    public TypeFamily apply(TypeFamily typeFamily) {
        return n -> (Type)this.types.computeIfAbsent((Pair<TypeFamily, Integer>)Pair.of((Object)typeFamily, (Object)n), pair -> {
            Object2ObjectOpenHashMap object2ObjectOpenHashMap = new Object2ObjectOpenHashMap(this.templates.size());
            for (Map.Entry entry : Object2ObjectMaps.fastIterable(this.templates)) {
                object2ObjectOpenHashMap.put(entry.getKey(), (Object)((TypeTemplate)entry.getValue()).apply((TypeFamily)pair.getFirst()).apply(((Integer)pair.getSecond()).intValue()));
            }
            Type type = DSL.taggedChoiceType((String)this.name, this.keyType, (Map)object2ObjectOpenHashMap);
            this.handler$zea000$fabric-dimensions-v1$onApply((Pair)pair, new CallbackInfoReturnable("", false, (Object)type));
            return type;
        });
    }

    public <A, B> Either<TypeTemplate, Type.FieldNotFoundException> findFieldOrType(int n, @Nullable String string, Type<A> type, Type<B> type2) {
        return Either.right((Object)new Type.FieldNotFoundException("Not implemented"));
    }

    public void fabric$setFailSoft(boolean bl) {
        this.failSoft = bl;
    }

    public <A, B> FamilyOptic<A, B> applyO(FamilyOptic<A, B> familyOptic, Type<A> type, Type<B> type2) {
        throw new UnsupportedOperationException();
    }

    public IntFunction<RewriteResult<?, ?>> hmap(TypeFamily typeFamily, IntFunction<RewriteResult<?, ?>> intFunction) {
        return n -> {
            RewriteResult rewriteResult = RewriteResult.nop((Type)((TaggedChoice$TaggedChoiceType)this.apply(typeFamily).apply(n)));
            for (Map.Entry entry : this.templates.entrySet()) {
                RewriteResult rewriteResult2 = (RewriteResult)((TypeTemplate)entry.getValue()).hmap(typeFamily, intFunction).apply(n);
                rewriteResult = TaggedChoice$TaggedChoiceType.elementResult(entry.getKey(), (TaggedChoice$TaggedChoiceType)rewriteResult.view().newType(), rewriteResult2).compose(rewriteResult);
            }
            return rewriteResult;
        };
    }
}

