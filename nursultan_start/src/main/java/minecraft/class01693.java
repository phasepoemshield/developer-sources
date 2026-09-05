/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Stopwatch
 *  minecraft.class05485
 *  minecraft.class05513
 */
package minecraft;

import com.google.common.base.Stopwatch;
import java.io.File;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import minecraft.class05485;
import minecraft.class05513;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class class01693
implements class05485 {
    private final Document N;
    private final Element y;
    private final Stopwatch L;
    private final File u;

    public class01693(File file) throws ParserConfigurationException {
        this.u = file;
        this.N = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
        this.y = this.N.createElement("testsuite");
        Element element = this.N.createElement("testsuite");
        element.appendChild(this.y);
        this.N.appendChild(element);
        this.y.setAttribute("timestamp", DateTimeFormatter.ISO_INSTANT.format(Instant.now()));
        this.L = Stopwatch.createStarted();
    }

    public void y(class05513 class055132) {
        String string = class055132.y().toString();
        this.N(class055132, string);
    }

    public void N(File file) throws TransformerException {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        DOMSource dOMSource = new DOMSource(this.N);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(dOMSource, streamResult);
    }

    public void N() {
        this.L.stop();
        this.y.setAttribute("time", String.valueOf((double)this.L.elapsed(TimeUnit.MILLISECONDS) / 1000.0));
        try {
            this.N(this.u);
        }
        catch (TransformerException transformerException) {
            throw new Error("Couldn't save test report", transformerException);
        }
    }

    private Element N(class05513 class055132, String string) {
        Element element = this.N.createElement("testcase");
        element.setAttribute("name", string);
        element.setAttribute("classname", class055132.v().toString());
        element.setAttribute("time", String.valueOf((double)class055132.E() / 1000.0));
        this.y.appendChild(element);
        return element;
    }

    public void N(class05513 class055132) {
        String string = class055132.y().toString();
        String string2 = class055132.m().getMessage();
        Element element = this.N.createElement(class055132.b() ? "failure" : "skipped");
        element.setAttribute("message", "(" + class055132.L().method_23854() + ") " + string2);
        this.N(class055132, string).appendChild(element);
    }
}

