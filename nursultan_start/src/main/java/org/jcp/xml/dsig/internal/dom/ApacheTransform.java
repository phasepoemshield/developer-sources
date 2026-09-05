/*
 * Decompiled with CFR 0.152.
 */
package org.jcp.xml.dsig.internal.dom;

import com.sun.org.apache.xml.internal.security.Init;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.transforms.Transform;
import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
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
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import org.jcp.xml.dsig.internal.dom.ApacheData;
import org.jcp.xml.dsig.internal.dom.ApacheNodeSetData;
import org.jcp.xml.dsig.internal.dom.ApacheOctetStreamData;
import org.jcp.xml.dsig.internal.dom.DOMSubTreeData;
import org.jcp.xml.dsig.internal.dom.DOMUtils;
import org.jcp.xml.dsig.internal.dom.Policy;
import org.jcp.xml.dsig.internal.dom.Utils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public abstract class ApacheTransform
extends TransformService {
    private static final Logger LOG;
    private Transform transform;
    protected Document ownerDoc;
    protected Element transformElem;
    protected TransformParameterSpec params;

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

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext) throws TransformException {
        if (data == null) {
            throw new NullPointerException("data must not be null");
        }
        return this.transformIt(data, xMLCryptoContext, null);
    }

    @Override
    public Data transform(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        if (data == null) {
            throw new NullPointerException("data must not be null");
        }
        if (outputStream == null) {
            throw new NullPointerException("output stream must not be null");
        }
        return this.transformIt(data, xMLCryptoContext, outputStream);
    }

    private Data transformIt(Data data, XMLCryptoContext xMLCryptoContext, OutputStream outputStream) throws TransformException {
        Object object;
        if (this.ownerDoc == null) {
            throw new TransformException("transform must be marshalled");
        }
        if (this.transform == null) {
            try {
                this.transform = new Transform(this.ownerDoc, this.getAlgorithm(), this.transformElem.getChildNodes());
                this.transform.setElement(this.transformElem, xMLCryptoContext.getBaseURI());
                LOG.debug("Created transform for algorithm: {}", this.getAlgorithm());
            }
            catch (Exception exception) {
                throw new TransformException("Couldn't find Transform for: " + this.getAlgorithm(), exception);
            }
        }
        if (Utils.secureValidation(xMLCryptoContext) && Policy.restrictAlg((String)(object = this.getAlgorithm()))) {
            throw new TransformException("Transform " + (String)object + " is forbidden when secure validation is enabled");
        }
        if (data instanceof ApacheData) {
            LOG.debug("ApacheData = true");
            object = ((ApacheData)data).getXMLSignatureInput();
        } else if (data instanceof NodeSetData) {
            LOG.debug("isNodeSet() = true");
            if (data instanceof DOMSubTreeData) {
                LOG.debug("DOMSubTreeData = true");
                var5_6 = (DOMSubTreeData)data;
                object = new XMLSignatureInput(((DOMSubTreeData)var5_6).getRoot());
                ((XMLSignatureInput)object).setExcludeComments(((DOMSubTreeData)var5_6).excludeComments());
            } else {
                var5_6 = Utils.toNodeSet(((NodeSetData)data).iterator());
                object = new XMLSignatureInput((Set<Node>)var5_6);
            }
        } else {
            LOG.debug("isNodeSet() = false");
            try {
                object = new XMLSignatureInput(((OctetStreamData)data).getOctetStream());
            }
            catch (Exception exception) {
                throw new TransformException(exception);
            }
        }
        boolean bl = Utils.secureValidation(xMLCryptoContext);
        ((XMLSignatureInput)object).setSecureValidation(bl);
        try {
            if (outputStream != null) {
                if (!((XMLSignatureInput)(object = this.transform.performTransform((XMLSignatureInput)object, outputStream, bl))).isNodeSet() && !((XMLSignatureInput)object).isElement()) {
                    return null;
                }
            } else {
                object = this.transform.performTransform((XMLSignatureInput)object, bl);
            }
            if (((XMLSignatureInput)object).isOctetStream()) {
                return new ApacheOctetStreamData((XMLSignatureInput)object);
            }
            return new ApacheNodeSetData((XMLSignatureInput)object);
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
        LOG = LoggerFactory.getLogger(ApacheTransform.class);
    }
}

