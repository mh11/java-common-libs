//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.06.14 at 12:38:27 PM CEST 
//


package org.opencb.commons.bioformats.commons.parser.uniprot.v135jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * The protein element stores all the information found in the DE line of a flatfile
 *                 entry.
 *             
 * 
 * <p>Java class for proteinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="proteinType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{http://uniprot.org/uniprot}proteinNameGroup"/>
 *         &lt;element name="domain" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://uniprot.org/uniprot}proteinNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="component" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;group ref="{http://uniprot.org/uniprot}proteinNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proteinType", propOrder = {
    "recommendedName",
    "alternativeName",
    "submittedName",
    "allergenName",
    "biotechName",
    "cdAntigenName",
    "innName",
    "domain",
    "component"
})
public class ProteinType {

    protected ProteinType.RecommendedName recommendedName;
    protected List<AlternativeName> alternativeName;
    protected List<SubmittedName> submittedName;
    protected EvidencedStringType allergenName;
    protected EvidencedStringType biotechName;
    protected List<EvidencedStringType> cdAntigenName;
    protected List<EvidencedStringType> innName;
    protected List<Domain> domain;
    protected List<Component> component;

    /**
     * Gets the value of the recommendedName property.
     *
     * @return
     *     possible object is
     *     {@link ProteinType.RecommendedName }
     *
     */
    public ProteinType.RecommendedName getRecommendedName() {
        return recommendedName;
    }

    /**
     * Sets the value of the recommendedName property.
     *
     * @param value
     *     allowed object is
     *     {@link ProteinType.RecommendedName }
     *
     */
    public void setRecommendedName(ProteinType.RecommendedName value) {
        this.recommendedName = value;
    }

    /**
     * Gets the value of the alternativeName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinType.AlternativeName }
     *
     *
     */
    public List<AlternativeName> getAlternativeName() {
        if (alternativeName == null) {
            alternativeName = new ArrayList<AlternativeName>();
        }
        return this.alternativeName;
    }

    /**
     * Gets the value of the submittedName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the submittedName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmittedName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinType.SubmittedName }
     *
     *
     */
    public List<SubmittedName> getSubmittedName() {
        if (submittedName == null) {
            submittedName = new ArrayList<SubmittedName>();
        }
        return this.submittedName;
    }

    /**
     * Gets the value of the allergenName property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getAllergenName() {
        return allergenName;
    }

    /**
     * Sets the value of the allergenName property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setAllergenName(EvidencedStringType value) {
        this.allergenName = value;
    }

    /**
     * Gets the value of the biotechName property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getBiotechName() {
        return biotechName;
    }

    /**
     * Sets the value of the biotechName property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setBiotechName(EvidencedStringType value) {
        this.biotechName = value;
    }

    /**
     * Gets the value of the cdAntigenName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cdAntigenName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCdAntigenName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidencedStringType }
     *
     *
     */
    public List<EvidencedStringType> getCdAntigenName() {
        if (cdAntigenName == null) {
            cdAntigenName = new ArrayList<EvidencedStringType>();
        }
        return this.cdAntigenName;
    }

    /**
     * Gets the value of the innName property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innName property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnName().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvidencedStringType }
     *
     *
     */
    public List<EvidencedStringType> getInnName() {
        if (innName == null) {
            innName = new ArrayList<EvidencedStringType>();
        }
        return this.innName;
    }

    /**
     * Gets the value of the domain property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the domain property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDomain().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinType.Domain }
     *
     *
     */
    public List<Domain> getDomain() {
        if (domain == null) {
            domain = new ArrayList<Domain>();
        }
        return this.domain;
    }

    /**
     * Gets the value of the component property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the component property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProteinType.Component }
     *
     *
     */
    public List<Component> getComponent() {
        if (component == null) {
            component = new ArrayList<Component>();
        }
        return this.component;
    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fullName" type="{http://uniprot.org/uniprot}evidencedStringType" minOccurs="0"/>
     *         &lt;element name="shortName" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullName",
        "shortName"
    })
    public static class AlternativeName {

        protected EvidencedStringType fullName;
        protected List<EvidencedStringType> shortName;
        @XmlAttribute
        protected String ref;

        /**
         * Gets the value of the fullName property.
         *
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *
         */
        public EvidencedStringType getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         *
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *
         */
        public void setFullName(EvidencedStringType value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the shortName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shortName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShortName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         *
         *
         */
        public List<EvidencedStringType> getShortName() {
            if (shortName == null) {
                shortName = new ArrayList<EvidencedStringType>();
            }
            return this.shortName;
        }

        /**
         * Gets the value of the ref property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://uniprot.org/uniprot}proteinNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recommendedName",
        "alternativeName",
        "submittedName",
        "allergenName",
        "biotechName",
        "cdAntigenName",
        "innName"
    })
    public static class Component {

        protected ProteinType.RecommendedName recommendedName;
        protected List<AlternativeName> alternativeName;
        protected List<SubmittedName> submittedName;
        protected EvidencedStringType allergenName;
        protected EvidencedStringType biotechName;
        protected List<EvidencedStringType> cdAntigenName;
        protected List<EvidencedStringType> innName;

        /**
         * Gets the value of the recommendedName property.
         *
         * @return
         *     possible object is
         *     {@link ProteinType.RecommendedName }
         *
         */
        public ProteinType.RecommendedName getRecommendedName() {
            return recommendedName;
        }

        /**
         * Sets the value of the recommendedName property.
         *
         * @param value
         *     allowed object is
         *     {@link ProteinType.RecommendedName }
         *
         */
        public void setRecommendedName(ProteinType.RecommendedName value) {
            this.recommendedName = value;
        }

        /**
         * Gets the value of the alternativeName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativeName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinType.AlternativeName }
         *
         *
         */
        public List<AlternativeName> getAlternativeName() {
            if (alternativeName == null) {
                alternativeName = new ArrayList<AlternativeName>();
            }
            return this.alternativeName;
        }

        /**
         * Gets the value of the submittedName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submittedName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmittedName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinType.SubmittedName }
         *
         *
         */
        public List<SubmittedName> getSubmittedName() {
            if (submittedName == null) {
                submittedName = new ArrayList<SubmittedName>();
            }
            return this.submittedName;
        }

        /**
         * Gets the value of the allergenName property.
         *
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *
         */
        public EvidencedStringType getAllergenName() {
            return allergenName;
        }

        /**
         * Sets the value of the allergenName property.
         *
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *
         */
        public void setAllergenName(EvidencedStringType value) {
            this.allergenName = value;
        }

        /**
         * Gets the value of the biotechName property.
         *
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *
         */
        public EvidencedStringType getBiotechName() {
            return biotechName;
        }

        /**
         * Sets the value of the biotechName property.
         *
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *
         */
        public void setBiotechName(EvidencedStringType value) {
            this.biotechName = value;
        }

        /**
         * Gets the value of the cdAntigenName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cdAntigenName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCdAntigenName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         *
         *
         */
        public List<EvidencedStringType> getCdAntigenName() {
            if (cdAntigenName == null) {
                cdAntigenName = new ArrayList<EvidencedStringType>();
            }
            return this.cdAntigenName;
        }

        /**
         * Gets the value of the innName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the innName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInnName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         *
         *
         */
        public List<EvidencedStringType> getInnName() {
            if (innName == null) {
                innName = new ArrayList<EvidencedStringType>();
            }
            return this.innName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     *
     * <p>The following schema fragment specifies the expected content contained within this class.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;group ref="{http://uniprot.org/uniprot}proteinNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recommendedName",
        "alternativeName",
        "submittedName",
        "allergenName",
        "biotechName",
        "cdAntigenName",
        "innName"
    })
    public static class Domain {

        protected ProteinType.RecommendedName recommendedName;
        protected List<AlternativeName> alternativeName;
        protected List<SubmittedName> submittedName;
        protected EvidencedStringType allergenName;
        protected EvidencedStringType biotechName;
        protected List<EvidencedStringType> cdAntigenName;
        protected List<EvidencedStringType> innName;

        /**
         * Gets the value of the recommendedName property.
         *
         * @return
         *     possible object is
         *     {@link ProteinType.RecommendedName }
         *
         */
        public ProteinType.RecommendedName getRecommendedName() {
            return recommendedName;
        }

        /**
         * Sets the value of the recommendedName property.
         *
         * @param value
         *     allowed object is
         *     {@link ProteinType.RecommendedName }
         *
         */
        public void setRecommendedName(ProteinType.RecommendedName value) {
            this.recommendedName = value;
        }

        /**
         * Gets the value of the alternativeName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the alternativeName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAlternativeName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinType.AlternativeName }
         *
         *
         */
        public List<AlternativeName> getAlternativeName() {
            if (alternativeName == null) {
                alternativeName = new ArrayList<AlternativeName>();
            }
            return this.alternativeName;
        }

        /**
         * Gets the value of the submittedName property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the submittedName property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSubmittedName().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ProteinType.SubmittedName }
         *
         *
         */
        public List<SubmittedName> getSubmittedName() {
            if (submittedName == null) {
                submittedName = new ArrayList<SubmittedName>();
            }
            return this.submittedName;
        }

        /**
         * Gets the value of the allergenName property.
         * 
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *     
         */
        public EvidencedStringType getAllergenName() {
            return allergenName;
        }

        /**
         * Sets the value of the allergenName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *     
         */
        public void setAllergenName(EvidencedStringType value) {
            this.allergenName = value;
        }

        /**
         * Gets the value of the biotechName property.
         * 
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *     
         */
        public EvidencedStringType getBiotechName() {
            return biotechName;
        }

        /**
         * Sets the value of the biotechName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *     
         */
        public void setBiotechName(EvidencedStringType value) {
            this.biotechName = value;
        }

        /**
         * Gets the value of the cdAntigenName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cdAntigenName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCdAntigenName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         * 
         * 
         */
        public List<EvidencedStringType> getCdAntigenName() {
            if (cdAntigenName == null) {
                cdAntigenName = new ArrayList<EvidencedStringType>();
            }
            return this.cdAntigenName;
        }

        /**
         * Gets the value of the innName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the innName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInnName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         * 
         * 
         */
        public List<EvidencedStringType> getInnName() {
            if (innName == null) {
                innName = new ArrayList<EvidencedStringType>();
            }
            return this.innName;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fullName" type="{http://uniprot.org/uniprot}evidencedStringType"/>
     *         &lt;element name="shortName" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullName",
        "shortName"
    })
    public static class RecommendedName {

        @XmlElement(required = true)
        protected EvidencedStringType fullName;
        protected List<EvidencedStringType> shortName;
        @XmlAttribute
        protected String ref;

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *     
         */
        public EvidencedStringType getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *     
         */
        public void setFullName(EvidencedStringType value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the shortName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shortName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShortName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         * 
         * 
         */
        public List<EvidencedStringType> getShortName() {
            if (shortName == null) {
                shortName = new ArrayList<EvidencedStringType>();
            }
            return this.shortName;
        }

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="fullName" type="{http://uniprot.org/uniprot}evidencedStringType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fullName"
    })
    public static class SubmittedName {

        @XmlElement(required = true)
        protected EvidencedStringType fullName;
        @XmlAttribute
        protected String ref;

        /**
         * Gets the value of the fullName property.
         * 
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *     
         */
        public EvidencedStringType getFullName() {
            return fullName;
        }

        /**
         * Sets the value of the fullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *     
         */
        public void setFullName(EvidencedStringType value) {
            this.fullName = value;
        }

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }

}
