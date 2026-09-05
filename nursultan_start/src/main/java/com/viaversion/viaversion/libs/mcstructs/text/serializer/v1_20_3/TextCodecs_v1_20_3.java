/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.Codec
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.impl.LazyInitCodec
 *  com.viaversion.viaversion.libs.mcstructs.converter.codec.map.MapCodecMerger
 *  com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.JavaConverter_v1_20_3
 *  com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.MapCodec
 *  com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.impl.FuzzyMapCodec
 *  com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.impl.StrictSelectorMapCodec
 *  com.viaversion.viaversion.libs.mcstructs.converter.model.Either
 *  com.viaversion.viaversion.libs.mcstructs.converter.model.Result
 *  com.viaversion.viaversion.libs.mcstructs.converter.types.NamedType
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.KeybindComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.NbtComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.ScoreComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.SelectorComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.components.nbt.BlockNbtSource
 *  com.viaversion.viaversion.libs.mcstructs.text.components.nbt.EntityNbtSource
 *  com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource
 *  com.viaversion.viaversion.libs.mcstructs.text.components.nbt.StorageNbtSource
 *  javax.annotation.Nullable
 *  lombok.Generated
 */
package com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3;

import com.viaversion.viaversion.libs.mcstructs.converter.codec.Codec;
import com.viaversion.viaversion.libs.mcstructs.converter.codec.impl.LazyInitCodec;
import com.viaversion.viaversion.libs.mcstructs.converter.codec.map.MapCodecMerger;
import com.viaversion.viaversion.libs.mcstructs.converter.impl.v1_20_3.JavaConverter_v1_20_3;
import com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.MapCodec;
import com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.impl.FuzzyMapCodec;
import com.viaversion.viaversion.libs.mcstructs.converter.mapcodec.impl.StrictSelectorMapCodec;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Either;
import com.viaversion.viaversion.libs.mcstructs.converter.model.Result;
import com.viaversion.viaversion.libs.mcstructs.converter.types.NamedType;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.KeybindComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.NbtComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.ScoreComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.SelectorComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.StringComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.BlockNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.EntityNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.NbtDataSource;
import com.viaversion.viaversion.libs.mcstructs.text.components.nbt.StorageNbtSource;
import com.viaversion.viaversion.libs.mcstructs.text.serializer.v1_20_3.StyleCodecs_v1_20_3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import lombok.Generated;

public class TextCodecs_v1_20_3 {
    public static final Codec<TextComponent> TEXT = new LazyInitCodec(() -> Codec.recursive(thiz -> TextCodecs_v1_20_3.createCodec((Codec)thiz, StyleCodecs_v1_20_3.MAP_CODEC, (TextComponentType[])ComponentType.values(), ComponentType::forComponent)));
    public static final MapCodec<StringComponent> STRING_COMPONENT = MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("text").required(), StringComponent::getText, StringComponent::new);
    public static final MapCodec<TranslationComponent> TRANSLATION_COMPONENT = MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("translate").required(), TranslationComponent::getKey, (MapCodec)Codec.STRING.mapCodec("fallback").optional().lenient().defaulted(null), TranslationComponent::getFallback, (MapCodec)Codec.either((Codec)JavaConverter_v1_20_3.INSTANCE.toCodec().verified(o -> {
        if (o instanceof Boolean || o instanceof Number || o instanceof String) {
            return null;
        }
        return Result.error((String)("Invalid value type: " + o.getClass().getName()));
    }), TEXT).map(o -> o instanceof TextComponent ? Either.right((Object)((TextComponent)o)) : Either.left((Object)o), either -> {
        if (either.isLeft()) {
            return either.getLeft();
        }
        String collapsed = TextCodecs_v1_20_3.tryCollapse((TextComponent)either.getRight());
        if (collapsed != null) {
            return collapsed;
        }
        return either.getRight();
    }).listOf().mapCodec("with").optional().defaulted(List::isEmpty, ArrayList::new), comp -> Arrays.asList(comp.getArgs()), (key, fallback, arguments) -> new TranslationComponent(key, arguments).setFallback(fallback));
    public static final MapCodec<KeybindComponent> KEYBIND_COMPONENT = MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("keybind").required(), KeybindComponent::getKeybind, KeybindComponent::new);
    public static final MapCodec<ScoreComponent> SCORE_COMPONENT = MapCodecMerger.codec((MapCodec)Codec.STRING.mapCodec("name").required(), ScoreComponent::getName, (MapCodec)Codec.STRING.mapCodec("objective").required(), ScoreComponent::getObjective, ScoreComponent::new).mapCodec("score").required();
    public static final MapCodec<SelectorComponent> SELECTOR_COMPONENT = MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("selector").required(), SelectorComponent::getSelector, (MapCodec)TEXT.mapCodec("separator").optional().defaulted(null), SelectorComponent::getSeparator, SelectorComponent::new);
    public static final MapCodec<NbtComponent> NBT_COMPONENT = MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("nbt").required(), NbtComponent::getComponent, (MapCodec)Codec.BOOLEAN.mapCodec("interpret").optional().lenient().defaulted((Object)false), NbtComponent::isResolve, (MapCodec)TEXT.mapCodec("separator").optional().lenient().defaulted(null), NbtComponent::getSeparator, (MapCodec)TextCodecs_v1_20_3.createLegacyComponentMatcher((NamedType[])NbtDataSourceType.values(), NbtDataSourceType::getCodec, NbtDataSourceType::forDataSource, (String)"source"), NbtComponent::getDataSource, NbtComponent::new);

    public static <T extends TextComponentType> Codec<TextComponent> createCodec(Codec<TextComponent> codec, MapCodec<Style> styleCodec, T[] componentTypes, Function<TextComponent, T> componentToType) {
        MapCodec typedComponentCodec = TextCodecs_v1_20_3.createLegacyComponentMatcher(componentTypes, TextComponentType::getCodec, componentToType, (String)"type");
        Codec styledCodec = MapCodecMerger.codec((MapCodec)typedComponentCodec, Function.identity(), (MapCodec)codec.nonEmptyList().mapCodec("extra").optional().defaulted(List::isEmpty, ArrayList::new), TextComponent::getSiblings, styleCodec, TextComponent::getStyle, (textComponent, siblings, style) -> textComponent.append((Iterable)siblings).setStyle(style));
        return Codec.either((Codec)Codec.either((Codec)Codec.STRING, (Codec)codec.nonEmptyList()), (Codec)styledCodec).map(textComponent -> {
            String collapsed = TextCodecs_v1_20_3.tryCollapse(textComponent);
            if (collapsed != null) {
                return Either.left((Object)Either.left((Object)collapsed));
            }
            return Either.right((Object)textComponent);
        }, stringListOrComponent -> (TextComponent)stringListOrComponent.xmap(stringOrList -> (TextComponent)stringOrList.xmap(StringComponent::new, TextCodecs_v1_20_3::mergeComponents), second -> second));
    }

    public static <T extends NamedType, E> MapCodec<E> createLegacyComponentMatcher(T[] types, Function<T, MapCodec<? extends E>> codecSupplier, Function<E, T> typeSupplier, String name) {
        ArrayList<MapCodec<? extends E>> typeCodecs = new ArrayList<MapCodec<? extends E>>();
        for (T type : types) {
            typeCodecs.add(codecSupplier.apply(type));
        }
        FuzzyMapCodec fuzzyCodec = new FuzzyMapCodec(typeCodecs, e -> (MapCodec)codecSupplier.apply(typeSupplier.apply(e)));
        Codec typeCodec = Codec.named(types);
        MapCodec elementCodec = typeCodec.typedMap(name, typeSupplier, codecSupplier);
        return new StrictSelectorMapCodec(name, elementCodec, (MapCodec)fuzzyCodec);
    }

    @Nullable
    public static String tryCollapse(TextComponent component) {
        if (component instanceof StringComponent && component.getSiblings().isEmpty() && component.getStyle().isEmpty()) {
            return ((StringComponent)component).getText();
        }
        return null;
    }

    private static TextComponent mergeComponents(List<TextComponent> components) {
        TextComponent component = components.get(0);
        for (int i = 1; i < components.size(); ++i) {
            component = component.append(components.get(i));
        }
        return component;
    }

    private static enum NbtDataSourceType implements NamedType
    {
        ENTITY("entity", (MapCodec<? extends NbtDataSource>)MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("entity").required(), EntityNbtSource::getSelector, EntityNbtSource::new)),
        BLOCK("block", (MapCodec<? extends NbtDataSource>)MapCodecMerger.mapCodec((MapCodec)Codec.STRING.mapCodec("block").required(), BlockNbtSource::getPos, BlockNbtSource::new)),
        STORAGE("storage", (MapCodec<? extends NbtDataSource>)MapCodecMerger.mapCodec((MapCodec)Codec.STRING_IDENTIFIER.mapCodec("storage").required(), StorageNbtSource::getId, StorageNbtSource::new));

        private final String name;
        private final MapCodec<? extends NbtDataSource> codec;

        public static NbtDataSourceType forDataSource(NbtDataSource dataSource) {
            if (dataSource instanceof EntityNbtSource) {
                return ENTITY;
            }
            if (dataSource instanceof BlockNbtSource) {
                return BLOCK;
            }
            if (dataSource instanceof StorageNbtSource) {
                return STORAGE;
            }
            throw new IllegalArgumentException("Unknown data source type: " + dataSource.getClass().getName());
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Generated
        public MapCodec<? extends NbtDataSource> getCodec() {
            return this.codec;
        }

        @Generated
        private NbtDataSourceType(String name, MapCodec<? extends NbtDataSource> codec) {
            this.name = name;
            this.codec = codec;
        }
    }

    private static enum ComponentType implements TextComponentType
    {
        STRING("text", STRING_COMPONENT),
        TRANSLATION("translatable", TRANSLATION_COMPONENT),
        KEYBIND("keybind", KEYBIND_COMPONENT),
        SCORE("score", SCORE_COMPONENT),
        SELECTOR("selector", SELECTOR_COMPONENT),
        NBT("nbt", NBT_COMPONENT);

        private final String name;
        private final MapCodec<? extends TextComponent> codec;

        public static ComponentType forComponent(TextComponent component) {
            if (component instanceof StringComponent) {
                return STRING;
            }
            if (component instanceof TranslationComponent) {
                return TRANSLATION;
            }
            if (component instanceof KeybindComponent) {
                return KEYBIND;
            }
            if (component instanceof ScoreComponent) {
                return SCORE;
            }
            if (component instanceof SelectorComponent) {
                return SELECTOR;
            }
            if (component instanceof NbtComponent) {
                return NBT;
            }
            throw new IllegalArgumentException("Unknown component type: " + component.getClass().getName());
        }

        @Generated
        public String getName() {
            return this.name;
        }

        @Override
        @Generated
        public MapCodec<? extends TextComponent> getCodec() {
            return this.codec;
        }

        @Generated
        private ComponentType(String name, MapCodec<? extends TextComponent> codec) {
            this.name = name;
            this.codec = codec;
        }
    }

    public static interface TextComponentType
    extends NamedType {
        public MapCodec<? extends TextComponent> getCodec();
    }
}

