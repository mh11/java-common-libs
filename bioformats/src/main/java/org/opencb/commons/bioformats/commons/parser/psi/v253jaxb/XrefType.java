//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.03.15 at 03:58:18 PM CET 
//


package org.opencb.commons.bioformats.commons.parser.psi.v253jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Crossreference to an external database. Crossreferences to literature databases, e.g. PubMed, should not be put into this structure, but into the bibRef element where possible.
 * 
 * <p>Java class for xrefType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="xrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="primaryRef" type="{net:sf:psidev:mi}dbReferenceType"/>
 *         &lt;element name="secondaryRef" type="{net:sf:psidev:mi}dbReferenceType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "xrefType", propOrder = {
    "primaryRef",
    "secondaryRef"
})
public class XrefType {

    @XmlElement(required = true)
    protected DbReferenceType primaryRef;
    protected List<DbReferenceType> secondaryRef;

    /**
     * Gets the value of the primaryRef property.
     * 
     * @return
     *     possible object is
     *     {@link DbReferenceType }
     *     
     */
    public DbReferenceType getPrimaryRef() {
        return primaryRef;
    }

    /**
     * Sets the value of the primaryRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link DbReferenceType }
     *     
     */
    public void setPrimaryRef(DbReferenceType value) {
        this.primaryRef = value;
    }

    /**
     * Gets the value of the secondaryRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DbReferenceType }
     * 
     * 
     */
    public List<DbReferenceType> getSecondaryRef() {
        if (secondaryRef == null) {
            secondaryRef = new ArrayList<DbReferenceType>();
        }
        return this.secondaryRef;
    }

}
