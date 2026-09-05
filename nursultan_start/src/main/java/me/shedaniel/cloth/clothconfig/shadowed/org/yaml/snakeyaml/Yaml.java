/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.BeanAccess
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.UnicodeReader
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Representer
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.Resolver
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.Serializer
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.LoaderOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.TypeDescription;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$2;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$3;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$EventIterable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$NodeIterable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$SilentEmitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$YamlIterable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.composer.Composer;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.BaseConstructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.constructor.Constructor;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitter;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.YAMLException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.introspector.BeanAccess;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Node;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.nodes.Tag;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.ParserImpl;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.StreamReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.reader.UnicodeReader;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer.Representer;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.resolver.Resolver;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.serializer.Serializer;

public class Yaml {
    protected final Resolver resolver;
    private String name;
    protected BaseConstructor constructor;
    protected Representer representer;
    protected DumperOptions dumperOptions;
    protected LoaderOptions loadingConfig;

    public void dump(Object object, Writer writer) {
        ArrayList<Object> arrayList = new ArrayList<Object>(1);
        arrayList.add(object);
        this.dumpAll(arrayList.iterator(), writer, null);
    }

    public String dump(Object object) {
        ArrayList<Object> arrayList = new ArrayList<Object>(1);
        arrayList.add(object);
        return this.dumpAll(arrayList.iterator());
    }

    public Yaml(BaseConstructor baseConstructor, Representer representer, DumperOptions dumperOptions) {
        this(baseConstructor, representer, dumperOptions, new LoaderOptions(), new Resolver());
    }

    public Yaml(BaseConstructor baseConstructor, Representer representer, DumperOptions dumperOptions, LoaderOptions loaderOptions) {
        this(baseConstructor, representer, dumperOptions, loaderOptions, new Resolver());
    }

    public Yaml(Representer representer, DumperOptions dumperOptions) {
        this((BaseConstructor)((Object)new Constructor()), representer, dumperOptions, new LoaderOptions(), new Resolver());
    }

    public Yaml(BaseConstructor baseConstructor, Representer representer, DumperOptions dumperOptions, Resolver resolver) {
        this(baseConstructor, representer, dumperOptions, new LoaderOptions(), resolver);
    }

    public Yaml(BaseConstructor baseConstructor, Representer representer, DumperOptions dumperOptions, LoaderOptions loaderOptions, Resolver resolver) {
        if (!baseConstructor.isExplicitPropertyUtils()) {
            baseConstructor.setPropertyUtils(representer.getPropertyUtils());
        } else if (!representer.isExplicitPropertyUtils()) {
            representer.setPropertyUtils(baseConstructor.getPropertyUtils());
        }
        this.constructor = baseConstructor;
        this.constructor.setAllowDuplicateKeys(loaderOptions.isAllowDuplicateKeys());
        this.constructor.setWrappedToRootException(loaderOptions.isWrappedToRootException());
        if (!dumperOptions.getIndentWithIndicator() && dumperOptions.getIndent() <= dumperOptions.getIndicatorIndent()) {
            throw new YAMLException("Indicator indent must be smaller then indent.");
        }
        representer.setDefaultFlowStyle(dumperOptions.getDefaultFlowStyle());
        representer.setDefaultScalarStyle(dumperOptions.getDefaultScalarStyle());
        representer.getPropertyUtils().setAllowReadOnlyProperties(dumperOptions.isAllowReadOnlyProperties());
        representer.setTimeZone(dumperOptions.getTimeZone());
        this.representer = representer;
        this.dumperOptions = dumperOptions;
        this.loadingConfig = loaderOptions;
        this.resolver = resolver;
        this.name = "Yaml:" + System.identityHashCode(this);
    }

    public Yaml() {
        this((BaseConstructor)((Object)new Constructor()), new Representer(), new DumperOptions(), new LoaderOptions(), new Resolver());
    }

    public Yaml(LoaderOptions loaderOptions) {
        this((BaseConstructor)((Object)new Constructor(loaderOptions)), new Representer(), new DumperOptions(), loaderOptions);
    }

    public Yaml(Representer representer) {
        this((BaseConstructor)((Object)new Constructor()), representer);
    }

    public Yaml(BaseConstructor baseConstructor) {
        this(baseConstructor, new Representer());
    }

    public Yaml(BaseConstructor baseConstructor, Representer representer) {
        this(baseConstructor, representer, Yaml.initDumperOptions(representer));
    }

    public Yaml(DumperOptions dumperOptions) {
        this((BaseConstructor)((Object)new Constructor()), new Representer(dumperOptions), dumperOptions);
    }

    public String toString() {
        return this.name;
    }

    public <T> T load(String string) {
        return (T)this.loadFromReader(new StreamReader(string), Object.class);
    }

    public <T> T load(InputStream inputStream) {
        return (T)this.loadFromReader(new StreamReader((Reader)new UnicodeReader(inputStream)), Object.class);
    }

    public <T> T load(Reader reader) {
        return (T)this.loadFromReader(new StreamReader(reader), Object.class);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public Iterable<Event> parse(Reader reader) {
        ParserImpl parserImpl = new ParserImpl(new StreamReader(reader));
        Yaml$3 yaml$3 = new Yaml$3(this, (Parser)parserImpl);
        return new Yaml$EventIterable(yaml$3);
    }

    public Node compose(Reader reader) {
        Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(reader)), this.resolver, this.loadingConfig);
        return composer.getSingleNode();
    }

    public void setBeanAccess(BeanAccess beanAccess) {
        this.constructor.getPropertyUtils().setBeanAccess(beanAccess);
        this.representer.getPropertyUtils().setBeanAccess(beanAccess);
    }

    public void addTypeDescription(TypeDescription typeDescription) {
        this.constructor.addTypeDescription(typeDescription);
        this.representer.addTypeDescription(typeDescription);
    }

    private Object loadFromReader(StreamReader streamReader, Class<?> clazz) {
        Composer composer = new Composer((Parser)new ParserImpl(streamReader), this.resolver, this.loadingConfig);
        this.constructor.setComposer(composer);
        return this.constructor.getSingleData(clazz);
    }

    private static DumperOptions initDumperOptions(Representer representer) {
        DumperOptions dumperOptions = new DumperOptions();
        dumperOptions.setDefaultFlowStyle(representer.getDefaultFlowStyle());
        dumperOptions.setDefaultScalarStyle(representer.getDefaultScalarStyle());
        dumperOptions.setAllowReadOnlyProperties(representer.getPropertyUtils().isAllowReadOnlyProperties());
        dumperOptions.setTimeZone(representer.getTimeZone());
        return dumperOptions;
    }

    public void serialize(Node node, Writer writer) {
        Serializer serializer = new Serializer((Emitable)new Emitter(writer, this.dumperOptions), this.resolver, this.dumperOptions, null);
        try {
            serializer.open();
            serializer.serialize(node);
            serializer.close();
        }
        catch (IOException iOException) {
            throw new YAMLException((Throwable)iOException);
        }
    }

    public List<Event> serialize(Node node) {
        Yaml$SilentEmitter yaml$SilentEmitter = new Yaml$SilentEmitter(null);
        Serializer serializer = new Serializer((Emitable)yaml$SilentEmitter, this.resolver, this.dumperOptions, null);
        try {
            serializer.open();
            serializer.serialize(node);
            serializer.close();
        }
        catch (IOException iOException) {
            throw new YAMLException((Throwable)iOException);
        }
        return yaml$SilentEmitter.getEvents();
    }

    public Iterable<Object> loadAll(String string) {
        return this.loadAll(new StringReader(string));
    }

    public Iterable<Object> loadAll(Reader reader) {
        Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(reader)), this.resolver, this.loadingConfig);
        this.constructor.setComposer(composer);
        Yaml$1 yaml$1 = new Yaml$1(this);
        return new Yaml$YamlIterable(yaml$1);
    }

    public Iterable<Object> loadAll(InputStream inputStream) {
        return this.loadAll((Reader)new UnicodeReader(inputStream));
    }

    public void dumpAll(Iterator<? extends Object> iterator, Writer writer) {
        this.dumpAll(iterator, writer, null);
    }

    private void dumpAll(Iterator<? extends Object> iterator, Writer writer, Tag tag) {
        Serializer serializer = new Serializer((Emitable)new Emitter(writer, this.dumperOptions), this.resolver, this.dumperOptions, tag);
        try {
            serializer.open();
            while (iterator.hasNext()) {
                Node node = this.representer.represent(iterator.next());
                serializer.serialize(node);
            }
            serializer.close();
        }
        catch (IOException iOException) {
            throw new YAMLException((Throwable)iOException);
        }
    }

    public String dumpAll(Iterator<? extends Object> iterator) {
        StringWriter stringWriter = new StringWriter();
        this.dumpAll(iterator, stringWriter, null);
        return stringWriter.toString();
    }

    public Node represent(Object object) {
        return this.representer.represent(object);
    }

    public String dumpAsMap(Object object) {
        return this.dumpAs(object, Tag.MAP, DumperOptions$FlowStyle.BLOCK);
    }

    public Iterable<Node> composeAll(Reader reader) {
        Composer composer = new Composer((Parser)new ParserImpl(new StreamReader(reader)), this.resolver, this.loadingConfig);
        Yaml$2 yaml$2 = new Yaml$2(this, composer);
        return new Yaml$NodeIterable(yaml$2);
    }

    public <T> T loadAs(InputStream inputStream, Class<T> clazz) {
        return (T)this.loadFromReader(new StreamReader((Reader)new UnicodeReader(inputStream)), clazz);
    }

    public <T> T loadAs(String string, Class<T> clazz) {
        return (T)this.loadFromReader(new StreamReader(string), clazz);
    }

    public <T> T loadAs(Reader reader, Class<T> clazz) {
        return (T)this.loadFromReader(new StreamReader(reader), clazz);
    }

    public String dumpAs(Object object, Tag tag, DumperOptions$FlowStyle dumperOptions$FlowStyle) {
        DumperOptions$FlowStyle dumperOptions$FlowStyle2 = this.representer.getDefaultFlowStyle();
        if (dumperOptions$FlowStyle != null) {
            this.representer.setDefaultFlowStyle(dumperOptions$FlowStyle);
        }
        ArrayList<Object> arrayList = new ArrayList<Object>(1);
        arrayList.add(object);
        StringWriter stringWriter = new StringWriter();
        this.dumpAll(arrayList.iterator(), stringWriter, tag);
        this.representer.setDefaultFlowStyle(dumperOptions$FlowStyle2);
        return stringWriter.toString();
    }

    public void addImplicitResolver(Tag tag, Pattern pattern, String string) {
        this.resolver.addImplicitResolver(tag, pattern, string);
    }
}

