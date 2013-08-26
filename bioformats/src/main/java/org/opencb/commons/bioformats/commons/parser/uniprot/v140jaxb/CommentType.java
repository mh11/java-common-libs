//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.09.14 at 07:50:17 PM CEST 
//


package org.opencb.commons.bioformats.commons.parser.uniprot.v140jaxb;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


/**
 * Describes different types of general annotations.
 *             Equivalent to the flat file CC-line.
 * 
 * <p>Java class for commentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="commentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;group ref="{http://uniprot.org/uniprot}bpcCommentGroup"/>
 *           &lt;sequence>
 *             &lt;element name="molecule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *             &lt;element name="subcellularLocation" type="{http://uniprot.org/uniprot}subcellularLocationType" maxOccurs="unbounded"/>
 *           &lt;/sequence>
 *           &lt;element name="conflict">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="sequence" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;attribute name="resource" use="required">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="EMBL-CDS"/>
 *                                   &lt;enumeration value="EMBL"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="type" use="required">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;enumeration value="frameshift"/>
 *                         &lt;enumeration value="erroneous initiation"/>
 *                         &lt;enumeration value="erroneous termination"/>
 *                         &lt;enumeration value="erroneous gene model prediction"/>
 *                         &lt;enumeration value="erroneous translation"/>
 *                         &lt;enumeration value="miscellaneous discrepancy"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                   &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;sequence>
 *             &lt;element name="link" maxOccurs="unbounded" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="event" type="{http://uniprot.org/uniprot}eventType" maxOccurs="4"/>
 *             &lt;element name="isoform" type="{http://uniprot.org/uniprot}isoformType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="interactant" type="{http://uniprot.org/uniprot}interactantType" maxOccurs="2" minOccurs="2"/>
 *             &lt;element name="organismsDiffer" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *             &lt;element name="experiments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="location" type="{http://uniprot.org/uniprot}locationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="allergen"/>
 *             &lt;enumeration value="alternative products"/>
 *             &lt;enumeration value="biotechnology"/>
 *             &lt;enumeration value="biophysicochemical properties"/>
 *             &lt;enumeration value="catalytic activity"/>
 *             &lt;enumeration value="caution"/>
 *             &lt;enumeration value="cofactor"/>
 *             &lt;enumeration value="developmental stage"/>
 *             &lt;enumeration value="disease"/>
 *             &lt;enumeration value="domain"/>
 *             &lt;enumeration value="disruption phenotype"/>
 *             &lt;enumeration value="enzyme regulation"/>
 *             &lt;enumeration value="function"/>
 *             &lt;enumeration value="induction"/>
 *             &lt;enumeration value="miscellaneous"/>
 *             &lt;enumeration value="pathway"/>
 *             &lt;enumeration value="pharmaceutical"/>
 *             &lt;enumeration value="polymorphism"/>
 *             &lt;enumeration value="PTM"/>
 *             &lt;enumeration value="RNA editing"/>
 *             &lt;enumeration value="similarity"/>
 *             &lt;enumeration value="subcellular location"/>
 *             &lt;enumeration value="sequence caution"/>
 *             &lt;enumeration value="subunit"/>
 *             &lt;enumeration value="tissue specificity"/>
 *             &lt;enumeration value="toxic dose"/>
 *             &lt;enumeration value="online information"/>
 *             &lt;enumeration value="mass spectrometry"/>
 *             &lt;enumeration value="interaction"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="locationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="mass" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="error" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="method" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="evidence" type="{http://uniprot.org/uniprot}intListType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commentType", propOrder = {
    "absorption",
    "kinetics",
    "phDependence",
    "redoxPotential",
    "temperatureDependence",
    "molecule",
    "subcellularLocation",
    "conflict",
    "link",
    "event",
    "isoform",
    "interactant",
    "organismsDiffer",
    "experiments",
    "location",
    "text"
})
public class CommentType {

    protected CommentType.Absorption absorption;
    protected CommentType.Kinetics kinetics;
    protected EvidencedStringType phDependence;
    protected EvidencedStringType redoxPotential;
    protected EvidencedStringType temperatureDependence;
    protected String molecule;
    protected List<SubcellularLocationType> subcellularLocation;
    protected CommentType.Conflict conflict;
    protected List<Link> link;
    protected List<EventType> event;
    protected List<IsoformType> isoform;
    protected List<InteractantType> interactant;
    @XmlElement(defaultValue = "false")
    protected Boolean organismsDiffer;
    protected Integer experiments;
    protected List<LocationType> location;
    protected EvidencedStringType text;
    @XmlAttribute(required = true)
    protected String type;
    @XmlAttribute
    protected String locationType;
    @XmlAttribute
    protected String name;
    @XmlAttribute
    protected Float mass;
    @XmlAttribute
    protected String error;
    @XmlAttribute
    protected String method;
    @XmlAttribute
    protected List<Integer> evidence;

    /**
     * Gets the value of the absorption property.
     *
     * @return
     *     possible object is
     *     {@link CommentType.Absorption }
     *
     */
    public CommentType.Absorption getAbsorption() {
        return absorption;
    }

    /**
     * Sets the value of the absorption property.
     *
     * @param value
     *     allowed object is
     *     {@link CommentType.Absorption }
     *
     */
    public void setAbsorption(CommentType.Absorption value) {
        this.absorption = value;
    }

    /**
     * Gets the value of the kinetics property.
     *
     * @return
     *     possible object is
     *     {@link CommentType.Kinetics }
     *
     */
    public CommentType.Kinetics getKinetics() {
        return kinetics;
    }

    /**
     * Sets the value of the kinetics property.
     *
     * @param value
     *     allowed object is
     *     {@link CommentType.Kinetics }
     *
     */
    public void setKinetics(CommentType.Kinetics value) {
        this.kinetics = value;
    }

    /**
     * Gets the value of the phDependence property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getPhDependence() {
        return phDependence;
    }

    /**
     * Sets the value of the phDependence property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setPhDependence(EvidencedStringType value) {
        this.phDependence = value;
    }

    /**
     * Gets the value of the redoxPotential property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getRedoxPotential() {
        return redoxPotential;
    }

    /**
     * Sets the value of the redoxPotential property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setRedoxPotential(EvidencedStringType value) {
        this.redoxPotential = value;
    }

    /**
     * Gets the value of the temperatureDependence property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getTemperatureDependence() {
        return temperatureDependence;
    }

    /**
     * Sets the value of the temperatureDependence property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setTemperatureDependence(EvidencedStringType value) {
        this.temperatureDependence = value;
    }

    /**
     * Gets the value of the molecule property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMolecule() {
        return molecule;
    }

    /**
     * Sets the value of the molecule property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMolecule(String value) {
        this.molecule = value;
    }

    /**
     * Gets the value of the subcellularLocation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subcellularLocation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubcellularLocation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubcellularLocationType }
     *
     *
     */
    public List<SubcellularLocationType> getSubcellularLocation() {
        if (subcellularLocation == null) {
            subcellularLocation = new ArrayList<SubcellularLocationType>();
        }
        return this.subcellularLocation;
    }

    /**
     * Gets the value of the conflict property.
     *
     * @return
     *     possible object is
     *     {@link CommentType.Conflict }
     *
     */
    public CommentType.Conflict getConflict() {
        return conflict;
    }

    /**
     * Sets the value of the conflict property.
     *
     * @param value
     *     allowed object is
     *     {@link CommentType.Conflict }
     *
     */
    public void setConflict(CommentType.Conflict value) {
        this.conflict = value;
    }

    /**
     * Gets the value of the link property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the link property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLink().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommentType.Link }
     *
     *
     */
    public List<Link> getLink() {
        if (link == null) {
            link = new ArrayList<Link>();
        }
        return this.link;
    }

    /**
     * Gets the value of the event property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventType }
     *
     *
     */
    public List<EventType> getEvent() {
        if (event == null) {
            event = new ArrayList<EventType>();
        }
        return this.event;
    }

    /**
     * Gets the value of the isoform property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the isoform property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIsoform().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IsoformType }
     *
     *
     */
    public List<IsoformType> getIsoform() {
        if (isoform == null) {
            isoform = new ArrayList<IsoformType>();
        }
        return this.isoform;
    }

    /**
     * Gets the value of the interactant property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the interactant property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInteractant().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InteractantType }
     *
     *
     */
    public List<InteractantType> getInteractant() {
        if (interactant == null) {
            interactant = new ArrayList<InteractantType>();
        }
        return this.interactant;
    }

    /**
     * Gets the value of the organismsDiffer property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isOrganismsDiffer() {
        return organismsDiffer;
    }

    /**
     * Sets the value of the organismsDiffer property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setOrganismsDiffer(Boolean value) {
        this.organismsDiffer = value;
    }

    /**
     * Gets the value of the experiments property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getExperiments() {
        return experiments;
    }

    /**
     * Sets the value of the experiments property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setExperiments(Integer value) {
        this.experiments = value;
    }

    /**
     * Gets the value of the location property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     *
     *
     */
    public List<LocationType> getLocation() {
        if (location == null) {
            location = new ArrayList<LocationType>();
        }
        return this.location;
    }

    /**
     * Gets the value of the text property.
     *
     * @return
     *     possible object is
     *     {@link EvidencedStringType }
     *
     */
    public EvidencedStringType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     *
     * @param value
     *     allowed object is
     *     {@link EvidencedStringType }
     *
     */
    public void setText(EvidencedStringType value) {
        this.text = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the locationType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * Sets the value of the locationType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLocationType(String value) {
        this.locationType = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the mass property.
     *
     * @return
     *     possible object is
     *     {@link Float }
     *
     */
    public Float getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     *
     * @param value
     *     allowed object is
     *     {@link Float }
     *
     */
    public void setMass(Float value) {
        this.mass = value;
    }

    /**
     * Gets the value of the error property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getError() {
        return error;
    }

    /**
     * Sets the value of the error property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setError(String value) {
        this.error = value;
    }

    /**
     * Gets the value of the method property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the evidence property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     *
     *
     */
    public List<Integer> getEvidence() {
        if (evidence == null) {
            evidence = new ArrayList<Integer>();
        }
        return this.evidence;
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
     *         &lt;element name="max" type="{http://uniprot.org/uniprot}evidencedStringType" minOccurs="0"/>
     *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "max",
        "text"
    })
    public static class Absorption {

        protected EvidencedStringType max;
        protected EvidencedStringType text;

        /**
         * Gets the value of the max property.
         *
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *
         */
        public EvidencedStringType getMax() {
            return max;
        }

        /**
         * Sets the value of the max property.
         *
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *
         */
        public void setMax(EvidencedStringType value) {
            this.max = value;
        }

        /**
         * Gets the value of the text property.
         *
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *
         */
        public EvidencedStringType getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         *
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *
         */
        public void setText(EvidencedStringType value) {
            this.text = value;
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
     *         &lt;element name="sequence" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="resource" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="EMBL-CDS"/>
     *                       &lt;enumeration value="EMBL"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="type" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="frameshift"/>
     *             &lt;enumeration value="erroneous initiation"/>
     *             &lt;enumeration value="erroneous termination"/>
     *             &lt;enumeration value="erroneous gene model prediction"/>
     *             &lt;enumeration value="erroneous translation"/>
     *             &lt;enumeration value="miscellaneous discrepancy"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
        "sequence"
    })
    public static class Conflict {

        protected CommentType.Conflict.Sequence sequence;
        @XmlAttribute(required = true)
        protected String type;
        @XmlAttribute
        protected String ref;

        /**
         * Gets the value of the sequence property.
         *
         * @return
         *     possible object is
         *     {@link CommentType.Conflict.Sequence }
         *
         */
        public CommentType.Conflict.Sequence getSequence() {
            return sequence;
        }

        /**
         * Sets the value of the sequence property.
         *
         * @param value
         *     allowed object is
         *     {@link CommentType.Conflict.Sequence }
         *
         */
        public void setSequence(CommentType.Conflict.Sequence value) {
            this.sequence = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="resource" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="EMBL-CDS"/>
         *             &lt;enumeration value="EMBL"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Sequence {

            @XmlAttribute(required = true)
            protected String resource;
            @XmlAttribute(required = true)
            protected String id;
            @XmlAttribute
            protected Integer version;

            /**
             * Gets the value of the resource property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getResource() {
                return resource;
            }

            /**
             * Sets the value of the resource property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setResource(String value) {
                this.resource = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the version property.
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getVersion() {
                return version;
            }

            /**
             * Sets the value of the version property.
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setVersion(Integer value) {
                this.version = value;
            }

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
     *         &lt;element name="KM" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Vmax" type="{http://uniprot.org/uniprot}evidencedStringType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="text" type="{http://uniprot.org/uniprot}evidencedStringType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "km",
        "vmax",
        "text"
    })
    public static class Kinetics {

        @XmlElement(name = "KM")
        protected List<EvidencedStringType> km;
        @XmlElement(name = "Vmax")
        protected List<EvidencedStringType> vmax;
        protected EvidencedStringType text;

        /**
         * Gets the value of the km property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the km property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKM().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         * 
         * 
         */
        public List<EvidencedStringType> getKM() {
            if (km == null) {
                km = new ArrayList<EvidencedStringType>();
            }
            return this.km;
        }

        /**
         * Gets the value of the vmax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vmax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVmax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link EvidencedStringType }
         * 
         * 
         */
        public List<EvidencedStringType> getVmax() {
            if (vmax == null) {
                vmax = new ArrayList<EvidencedStringType>();
            }
            return this.vmax;
        }

        /**
         * Gets the value of the text property.
         * 
         * @return
         *     possible object is
         *     {@link EvidencedStringType }
         *     
         */
        public EvidencedStringType getText() {
            return text;
        }

        /**
         * Sets the value of the text property.
         * 
         * @param value
         *     allowed object is
         *     {@link EvidencedStringType }
         *     
         */
        public void setText(EvidencedStringType value) {
            this.text = value;
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
     *       &lt;attribute name="uri" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Link {

        @XmlAttribute(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String uri;

        /**
         * Gets the value of the uri property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUri() {
            return uri;
        }

        /**
         * Sets the value of the uri property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUri(String value) {
            this.uri = value;
        }

    }

}
