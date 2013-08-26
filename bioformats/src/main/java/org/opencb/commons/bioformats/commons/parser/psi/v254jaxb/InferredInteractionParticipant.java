//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.05.04 at 12:38:29 AM CEST 
//


package org.opencb.commons.bioformats.commons.parser.psi.v254jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Participant of the inferred interaction.
 * 
 * <p>Java class for inferredInteractionParticipant complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inferredInteractionParticipant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="participantRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="participantFeatureRef" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inferredInteractionParticipant", propOrder = {
    "participantRef",
    "participantFeatureRef"
})
public class InferredInteractionParticipant {

    protected Integer participantRef;
    protected Integer participantFeatureRef;

    /**
     * Gets the value of the participantRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantRef() {
        return participantRef;
    }

    /**
     * Sets the value of the participantRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantRef(Integer value) {
        this.participantRef = value;
    }

    /**
     * Gets the value of the participantFeatureRef property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParticipantFeatureRef() {
        return participantFeatureRef;
    }

    /**
     * Sets the value of the participantFeatureRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParticipantFeatureRef(Integer value) {
        this.participantFeatureRef = value;
    }

}
