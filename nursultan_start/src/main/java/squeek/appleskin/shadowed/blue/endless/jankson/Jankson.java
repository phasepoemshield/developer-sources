/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nonnull
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.ElementParserContext
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.ObjectParserContext
 *  squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext
 */
package squeek.appleskin.shadowed.blue.endless.jankson;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.function.Consumer;
import javax.annotation.Nonnull;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson$1;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson$Builder;
import squeek.appleskin.shadowed.blue.endless.jankson.Jankson$ParserFrame;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonElement;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonNull;
import squeek.appleskin.shadowed.blue.endless.jankson.JsonObject;
import squeek.appleskin.shadowed.blue.endless.jankson.api.DeserializationException;
import squeek.appleskin.shadowed.blue.endless.jankson.api.Marshaller;
import squeek.appleskin.shadowed.blue.endless.jankson.api.SyntaxError;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.AnnotatedElement;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ElementParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.MarshallerImpl;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ObjectParserContext;
import squeek.appleskin.shadowed.blue.endless.jankson.impl.ParserContext;

public class Jankson {
    private Deque<Jankson$ParserFrame<?>> contextStack = new ArrayDeque();
    private JsonObject root;
    private int line = 0;
    private int column = 0;
    private int withheldCodePoint = -1;
    private Marshaller marshaller = MarshallerImpl.getFallback();
    private boolean allowBareRootObject = false;
    private int retries = 0;
    private SyntaxError delayedError = null;
    private AnnotatedElement rootElement;

    static /* synthetic */ Marshaller access$402(Jankson jankson, Marshaller marshaller) {
        jankson.marshaller = marshaller;
        return jankson.marshaller;
    }

    /* synthetic */ Jankson(Jankson$Builder jankson$Builder, Jankson$1 jankson$1) {
        this(jankson$Builder);
    }

    private Jankson(Jankson$Builder jankson$Builder) {
    }

    @Nonnull
    public JsonObject load(String string) throws SyntaxError {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
        try {
            return this.load(byteArrayInputStream);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Nonnull
    public JsonObject load(InputStream inputStream) throws IOException, SyntaxError {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        this.withheldCodePoint = -1;
        this.root = null;
        this.push((ParserContext)new ObjectParserContext(this.allowBareRootObject), jsonObject -> {
            this.root = jsonObject;
        });
        while (this.root == null) {
            if (this.delayedError != null) {
                throw this.delayedError;
            }
            if (this.withheldCodePoint != -1) {
                ++this.retries;
                if (this.retries > 25) {
                    throw new IOException("Parser got stuck near line " + this.line + " column " + this.column);
                }
                this.processCodePoint(this.withheldCodePoint);
                continue;
            }
            int n = inputStreamReader.read();
            if (n == -1) {
                while (!this.contextStack.isEmpty()) {
                    Jankson$ParserFrame<?> jankson$ParserFrame = this.contextStack.pop();
                    try {
                        Jankson$ParserFrame.access$000(jankson$ParserFrame).eof();
                        if (!Jankson$ParserFrame.access$000(jankson$ParserFrame).isComplete()) continue;
                        jankson$ParserFrame.supply();
                    }
                    catch (SyntaxError syntaxError) {
                        syntaxError.setStartParsing(Jankson$ParserFrame.access$100(jankson$ParserFrame), Jankson$ParserFrame.access$200(jankson$ParserFrame));
                        syntaxError.setEndParsing(this.line, this.column);
                        throw syntaxError;
                    }
                }
                if (this.root == null) {
                    this.root = new JsonObject();
                    this.root.marshaller = this.marshaller;
                }
                return this.root;
            }
            this.processCodePoint(n);
        }
        return this.root;
    }

    @Nonnull
    public JsonObject load(File file) throws IOException, SyntaxError {
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            JsonObject jsonObject = this.load(fileInputStream);
            return jsonObject;
        }
    }

    public static Jankson$Builder builder() {
        return new Jankson$Builder();
    }

    public <T> void push(ParserContext<T> parserContext, Consumer<T> consumer) {
        Jankson$ParserFrame<T> jankson$ParserFrame = new Jankson$ParserFrame<T>(parserContext, consumer);
        Jankson$ParserFrame.access$102(jankson$ParserFrame, this.line);
        Jankson$ParserFrame.access$202(jankson$ParserFrame, this.column);
        this.contextStack.push(jankson$ParserFrame);
    }

    public <T> JsonElement toJson(T t, Marshaller marshaller) {
        return marshaller.serialize(t);
    }

    public <T> JsonElement toJson(T t) {
        return this.marshaller.serialize(t);
    }

    public <T> T fromJson(JsonObject jsonObject, Class<T> clazz) {
        return this.marshaller.marshall(clazz, (JsonElement)jsonObject);
    }

    public <T> T fromJson(String string, Class<T> clazz) throws SyntaxError {
        JsonObject jsonObject = this.load(string);
        return this.fromJson(jsonObject, clazz);
    }

    static /* synthetic */ boolean access$502(Jankson jankson, boolean bl) {
        jankson.allowBareRootObject = bl;
        return jankson.allowBareRootObject;
    }

    public <T> T fromJsonCarefully(JsonObject jsonObject, Class<T> clazz) throws DeserializationException {
        return this.marshaller.marshallCarefully(clazz, jsonObject);
    }

    public <T> T fromJsonCarefully(String string, Class<T> clazz) throws SyntaxError, DeserializationException {
        JsonObject jsonObject = this.load(string);
        return this.fromJsonCarefully(jsonObject, clazz);
    }

    public Marshaller getMarshaller() {
        return this.marshaller;
    }

    @Nonnull
    public JsonElement loadElement(String string) throws SyntaxError {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(string.getBytes(Charset.forName("UTF-8")));
        try {
            return this.loadElement(byteArrayInputStream);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
    }

    @Nonnull
    public JsonElement loadElement(InputStream inputStream) throws IOException, SyntaxError {
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        this.withheldCodePoint = -1;
        this.rootElement = null;
        this.push((ParserContext)new ElementParserContext(), annotatedElement -> {
            this.rootElement = annotatedElement;
        });
        while (this.rootElement == null) {
            if (this.delayedError != null) {
                throw this.delayedError;
            }
            if (this.withheldCodePoint != -1) {
                ++this.retries;
                if (this.retries > 25) {
                    throw new IOException("Parser got stuck near line " + this.line + " column " + this.column);
                }
                this.processCodePoint(this.withheldCodePoint);
                continue;
            }
            int n = inputStreamReader.read();
            if (n == -1) {
                while (!this.contextStack.isEmpty()) {
                    Jankson$ParserFrame<?> jankson$ParserFrame = this.contextStack.pop();
                    try {
                        Jankson$ParserFrame.access$000(jankson$ParserFrame).eof();
                        if (!Jankson$ParserFrame.access$000(jankson$ParserFrame).isComplete()) continue;
                        jankson$ParserFrame.supply();
                    }
                    catch (SyntaxError syntaxError) {
                        syntaxError.setStartParsing(Jankson$ParserFrame.access$100(jankson$ParserFrame), Jankson$ParserFrame.access$200(jankson$ParserFrame));
                        syntaxError.setEndParsing(this.line, this.column);
                        throw syntaxError;
                    }
                }
                if (this.rootElement == null) {
                    return JsonNull.INSTANCE;
                }
                return this.rootElement.getElement();
            }
            this.processCodePoint(n);
        }
        return this.rootElement.getElement();
    }

    @Nonnull
    public JsonElement loadElement(File file) throws IOException, SyntaxError {
        try (FileInputStream fileInputStream = new FileInputStream(file);){
            JsonElement jsonElement = this.loadElement(fileInputStream);
            return jsonElement;
        }
    }

    private void processCodePoint(int n) throws SyntaxError {
        Jankson$ParserFrame<?> jankson$ParserFrame = this.contextStack.peek();
        if (jankson$ParserFrame == null) {
            throw new IllegalStateException("Parser problem! The ParserContext stack underflowed! (line " + this.line + ", col " + this.column + ")");
        }
        try {
            if (jankson$ParserFrame.context().isComplete()) {
                this.contextStack.pop();
                jankson$ParserFrame.supply();
                jankson$ParserFrame = this.contextStack.peek();
            }
        }
        catch (SyntaxError syntaxError) {
            syntaxError.setStartParsing(Jankson$ParserFrame.access$100(jankson$ParserFrame), Jankson$ParserFrame.access$200(jankson$ParserFrame));
            syntaxError.setEndParsing(this.line, this.column);
            throw syntaxError;
        }
        try {
            if (jankson$ParserFrame == null) {
                return;
            }
            boolean bl = jankson$ParserFrame.context().consume(n, this);
            if (Jankson$ParserFrame.access$000(jankson$ParserFrame).isComplete()) {
                this.contextStack.pop();
                jankson$ParserFrame.supply();
            }
            if (bl) {
                this.withheldCodePoint = -1;
                this.retries = 0;
            } else {
                this.withheldCodePoint = n;
            }
        }
        catch (SyntaxError syntaxError) {
            syntaxError.setStartParsing(Jankson$ParserFrame.access$100(jankson$ParserFrame), Jankson$ParserFrame.access$200(jankson$ParserFrame));
            syntaxError.setEndParsing(this.line, this.column);
            throw syntaxError;
        }
        ++this.column;
        if (n == 10) {
            ++this.line;
            this.column = 0;
        }
    }

    public void throwDelayed(SyntaxError syntaxError) {
        syntaxError.setEndParsing(this.line, this.column);
        this.delayedError = syntaxError;
    }
}

