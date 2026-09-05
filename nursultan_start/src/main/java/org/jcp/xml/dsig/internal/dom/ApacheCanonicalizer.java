/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.c14n.Canonicalizer;
import com.sun.org.apache.xml.internal.security.c14n.InvalidCanonicalizerException;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.transforms.Transform;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Set;
import javax.xml.crypto.Data;
import javax.xml.crypto.MarshalException;
import javax.xml.crypto.NodeSetData;
import javax.xml.crypto.OctetStreamData;
import javax.xml.crypto.XMLCryptoContext;
import javax.xml.crypto.XMLStructure;
import javax.xml.crypto.dom.DOMCryptoContext;
import javax.xml.crypto.dom.DOMStructure;
import javax.xml.crypto.dsig.TransformException;
import javax.xml.crypto.dsig.TransformService;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ApacheCanonicalizer
extends TransformService {
    private static final Logger LOG;
    protected Canonicalizer canonicalizer;
    private Transform apacheTransform;
    protected String inclusiveNamespaces;
    protected C14NMethodParameterSpec params;
    protected Document ownerDoc;
    protected Element transformElem;

    @Override
    public final AlgorithmParameterSpec getParameterSpec() {
        return this.params;
    }

    @Override
    public void init(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws InvalidAlgorithmParameterException {
        if (xMLCryptoContext != null && !(xMLCryptoContext instanceof DOMCryptoContext)) {
            throw new ClassCastException("context must be of type DOMCryptoContext");
        }
        if (xMLStructure == null) {
            throw new NullPointerException();
        }
        if (!(xMLStructure instanceof DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
        this.transformElem = (Element)((DOMStructure)xMLStructure).getNode();
        this.ownerDoc = DOMUtils.getOwnerDocument(this.transformElem);
    }

    @Override
    public void marshalParams(XMLStructure xMLStructure, XMLCryptoContext xMLCryptoContext) throws MarshalException {
        if (xMLCryptoContext != null && !(xMLCryptoContext instanceof DOMCryptoContext)) {
            throw new ClassCastException("context must be of type DOMCryptoContext");
        }
        if (xMLStructure == null) {
            throw new NullPointerException();
        }
        if (!(xMLStructure instanceof DOMStructure)) {
            throw new ClassCastException("parent must be of type DOMStructure");
        }
        this.transformElem = (Element)((DOMStructure)xMLStructure).getNode();
        this.ownerDoc = DOMUtils.getOwnerDocument(this.transformElem);
    }

    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        return this.canonicalize(data, xMLCryptoContext, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Data canonicalize(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        if (this.canonicalizer == null) {
            try {
                this.canonicalizer = Canonicalizer.getInstance(this.getAlgorithm());
                LOG.debug("Created canonicalizer for algorithm: {}", this.getAlgorithm());
            }
            catch (InvalidCanonicalizerException invalidCanonicalizerException) {
                throw new TransformException("Couldn't find Canonicalizer for: " + this.getAlgorithm() + ": " + invalidCanonicalizerException.getMessage(), invalidCanonicalizerException);
            }
        }
        boolean bl = outputStream == null;
        OutputStream outputStream2 = bl ? new ByteArrayOutputStream() : outputStream;
        try {
            boolean bl2 = Utils.secureValidation(xMLCryptoContext);
            Set<Node> set = null;
            if (data instanceof ApacheData) {
                XMLSignatureInput xMLSignatureInput = ((ApacheData)data).getXMLSignatureInput();
                if (xMLSignatureInput.isElement()) {
                    if (this.inclusiveNamespaces != null) {
                        this.canonicalizer.canonicalizeSubtree(xMLSignatureInput.getSubNode(), this.inclusiveNamespaces, outputStream2);
                        return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                    }
                    this.canonicalizer.canonicalizeSubtree(xMLSignatureInput.getSubNode(), outputStream2);
                    return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                }
                if (!xMLSignatureInput.isNodeSet()) {
                    this.canonicalizer.canonicalize(Utils.readBytesFromStream(xMLSignatureInput.getOctetStream()), outputStream2, bl2);
                    return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                }
                set = xMLSignatureInput.getNodeSet();
            } else {
                if (data instanceof DOMSubTreeData) {
                    DOMSubTreeData dOMSubTreeData = (DOMSubTreeData)data;
                    if (this.inclusiveNamespaces != null) {
                        this.canonicalizer.canonicalizeSubtree(dOMSubTreeData.getRoot(), this.inclusiveNamespaces, outputStream2);
                        return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                    }
                    this.canonicalizer.canonicalizeSubtree(dOMSubTreeData.getRoot(), outputStream2);
                    return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                }
                if (!(data instanceof NodeSetData)) {
                    this.canonicalizer.canonicalize(Utils.readBytesFromStream(((OctetStreamData)data).getOctetStream()), outputStream2, bl2);
                    return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
                }
                NodeSetData nodeSetData = (NodeSetData)data;
                set = Utils.toNodeSet(nodeSetData.iterator());
                LOG.debug("Canonicalizing {} nodes", set.size());
            }
            if (this.inclusiveNamespaces != null) {
                this.canonicalizer.canonicalizeXPathNodeSet(set, this.inclusiveNamespaces, outputStream2);
                return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
            }
            this.canonicalizer.canonicalizeXPathNodeSet(set, outputStream2);
            return new OctetStreamData(new ByteArrayInputStream(this.getC14nBytes(outputStream2, bl)));
        }
        catch (Exception exception) {
            throw new TransformException(exception);
        }
    }

    private byte[] getC14nBytes(OutputStream outputStream, boolean bl) {
        if (bl) {
            return ((ByteArrayOutputStream)outputStream).toByteArray();
        }
        return null;
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        XMLSignatureInput xMLSignatureInput;
        if (data == null) {
            throw new NullPointerException("data must not be null");
        }
        if (outputStream == null) {
            throw new NullPointerException("output stream must not be null");
        }
        if (this.ownerDoc == null) {
            throw new TransformException("transform must be marshalled");
        }
        if (this.apacheTransform == null) {
            try {
                this.apacheTransform = new Transform(this.ownerDoc, this.getAlgorithm(), this.transformElem.getChildNodes());
                this.apacheTransform.setElement(this.transformElem, xMLCryptoContext.getBaseURI());
                LOG.debug("Created transform for algorithm: {}", this.getAlgorithm());
            }
            catch (Exception exception) {
                throw new TransformException("Couldn't find Transform for: " + this.getAlgorithm(), exception);
            }
        }
        if (data instanceof ApacheData) {
            LOG.debug("ApacheData = true");
            xMLSignatureInput = ((ApacheData)data).getXMLSignatureInput();
        } else if (data instanceof NodeSetData) {
            LOG.debug("isNodeSet() = true");
            if (data instanceof DOMSubTreeData) {
                var5_6 = (DOMSubTreeData)data;
                xMLSignatureInput = new XMLSignatureInput(((DOMSubTreeData)var5_6).getRoot());
                xMLSignatureInput.setExcludeComments(((DOMSubTreeData)var5_6).excludeComments());
            } else {
                var5_6 = Utils.toNodeSet(((NodeSetData)data).iterator());
                xMLSignatureInput = new XMLSignatureInput((Set<Node>)var5_6);
            }
        } else {
            LOG.debug("isNodeSet() = false");
            try {
                xMLSignatureInput = new XMLSignatureInput(((OctetStreamData)data).getOctetStream());
            }
            catch (Exception exception) {
                throw new TransformException(exception);
            }
        }
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        xMLSignatureInput.setSecureValidation(bl);
        try {
            xMLSignatureInput = this.apacheTransform.performTransform(xMLSignatureInput, outputStream, bl);
            if (xMLSignatureInput.isOctetStream()) {
                return new ApacheOctetStreamData(xMLSignatureInput);
            }
            return new ApacheNodeSetData(xMLSignatureInput);
        }
        catch (Exception exception) {
            throw new TransformException(exception);
        }
    }

    @Override
    public final boolean isFeatureSupported(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        return false;
    }

    static {
        Init.init();
        LOG = LoggerFactory.getLogger(ApacheCanonicalizer.class);
    }
}

