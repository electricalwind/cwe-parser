
package lu.jimenez.research.cweparser.generatedObject;

/*-
 * #%L
 * CWE Parser
 * %%
 * Copyright (C) 2016 Matthieu Jimenez
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;group ref="{}Common_Attributes"/>
 *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Weakness_Abstraction" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Class"/>
 *             &lt;enumeration value="Base"/>
 *             &lt;enumeration value="Variant"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Status" use="required" type="{}Status_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "relationships",
    "relationshipNotes",
    "weaknessOrdinalities",
    "applicablePlatforms",
    "maintenanceNotes",
    "backgroundDetails",
    "otherNotes",
    "alternateTerms",
    "terminologyNotes",
    "timeOfIntroduction",
    "modesOfIntroduction",
    "enablingFactorsForExploitation",
    "likelihoodOfExploit",
    "commonConsequences",
    "detectionMethods",
    "potentialMitigations",
    "causalNature",
    "demonstrativeExamples",
    "observedExamples",
    "theoreticalNotes",
    "functionalAreas",
    "relevantProperties",
    "affectedResources",
    "researchGaps",
    "references",
    "taxonomyMappings",
    "whiteBoxDefinitions",
    "blackBoxDefinitions",
    "relatedAttackPatterns",
    "contentHistory"
})
@XmlRootElement(name = "Weakness")
public class Weakness {

    @XmlElement(name = "Description", required = true)
    protected lu.jimenez.research.cweparser.generatedObject.Category.Description description;
    @XmlElement(name = "Relationships")
    protected Relationships relationships;
    @XmlElement(name = "Relationship_Notes")
    protected RelationshipNotes relationshipNotes;
    @XmlElement(name = "Weakness_Ordinalities")
    protected lu.jimenez.research.cweparser.generatedObject.Category.WeaknessOrdinalities weaknessOrdinalities;
    @XmlElement(name = "Applicable_Platforms")
    protected lu.jimenez.research.cweparser.generatedObject.Category.ApplicablePlatforms applicablePlatforms;
    @XmlElement(name = "Maintenance_Notes")
    protected MaintenanceNotes maintenanceNotes;
    @XmlElement(name = "Background_Details")
    protected lu.jimenez.research.cweparser.generatedObject.Category.BackgroundDetails backgroundDetails;
    @XmlElement(name = "Other_Notes")
    protected OtherNotes otherNotes;
    @XmlElement(name = "Alternate_Terms")
    protected AlternateTerms alternateTerms;
    @XmlElement(name = "Terminology_Notes")
    protected lu.jimenez.research.cweparser.generatedObject.Category.TerminologyNotes terminologyNotes;
    @XmlElement(name = "Time_of_Introduction")
    protected lu.jimenez.research.cweparser.generatedObject.Category.TimeOfIntroduction timeOfIntroduction;
    @XmlElement(name = "Modes_of_Introduction")
    protected lu.jimenez.research.cweparser.generatedObject.Category.ModesOfIntroduction modesOfIntroduction;
    @XmlElement(name = "Enabling_Factors_for_Exploitation")
    protected lu.jimenez.research.cweparser.generatedObject.Category.EnablingFactorsForExploitation enablingFactorsForExploitation;
    @XmlElement(name = "Likelihood_of_Exploit")
    protected String likelihoodOfExploit;
    @XmlElement(name = "Common_Consequences")
    protected lu.jimenez.research.cweparser.generatedObject.Category.CommonConsequences commonConsequences;
    @XmlElement(name = "Detection_Methods")
    protected lu.jimenez.research.cweparser.generatedObject.Category.DetectionMethods detectionMethods;
    @XmlElement(name = "Potential_Mitigations")
    protected lu.jimenez.research.cweparser.generatedObject.Category.PotentialMitigations potentialMitigations;
    @XmlElement(name = "Causal_Nature")
    protected String causalNature;
    @XmlElement(name = "Demonstrative_Examples")
    protected lu.jimenez.research.cweparser.generatedObject.Category.DemonstrativeExamples demonstrativeExamples;
    @XmlElement(name = "Observed_Examples")
    protected lu.jimenez.research.cweparser.generatedObject.Category.ObservedExamples observedExamples;
    @XmlElement(name = "Theoretical_Notes")
    protected lu.jimenez.research.cweparser.generatedObject.Category.TheoreticalNotes theoreticalNotes;
    @XmlElement(name = "Functional_Areas")
    protected lu.jimenez.research.cweparser.generatedObject.Category.FunctionalAreas functionalAreas;
    @XmlElement(name = "Relevant_Properties")
    protected lu.jimenez.research.cweparser.generatedObject.Category.RelevantProperties relevantProperties;
    @XmlElement(name = "Affected_Resources")
    protected lu.jimenez.research.cweparser.generatedObject.Category.AffectedResources affectedResources;
    @XmlElement(name = "Research_Gaps")
    protected ResearchGaps researchGaps;
    @XmlElement(name = "References")
    protected ReferenceListType references;
    @XmlElement(name = "Taxonomy_Mappings")
    protected lu.jimenez.research.cweparser.generatedObject.Category.TaxonomyMappings taxonomyMappings;
    @XmlElement(name = "White_Box_Definitions")
    protected lu.jimenez.research.cweparser.generatedObject.Category.WhiteBoxDefinitions whiteBoxDefinitions;
    @XmlElement(name = "Black_Box_Definitions")
    protected lu.jimenez.research.cweparser.generatedObject.Category.BlackBoxDefinitions blackBoxDefinitions;
    @XmlElement(name = "Related_Attack_Patterns")
    protected lu.jimenez.research.cweparser.generatedObject.Category.RelatedAttackPatterns relatedAttackPatterns;
    @XmlElement(name = "Content_History", required = true)
    protected ContentHistory contentHistory;
    @XmlAttribute(name = "ID", required = true)
    protected BigInteger id;
    @XmlAttribute(name = "Name", required = true)
    protected String name;
    @XmlAttribute(name = "Weakness_Abstraction", required = true)
    protected String weaknessAbstraction;
    @XmlAttribute(name = "Status", required = true)
    protected StatusType status;

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.Description }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.Description getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.Description }
     *     
     */
    public void setDescription(lu.jimenez.research.cweparser.generatedObject.Category.Description value) {
        this.description = value;
    }

    /**
     * Obtient la valeur de la propriété relationships.
     * 
     * @return
     *     possible object is
     *     {@link Relationships }
     *     
     */
    public Relationships getRelationships() {
        return relationships;
    }

    /**
     * Définit la valeur de la propriété relationships.
     * 
     * @param value
     *     allowed object is
     *     {@link Relationships }
     *     
     */
    public void setRelationships(Relationships value) {
        this.relationships = value;
    }

    /**
     * Obtient la valeur de la propriété relationshipNotes.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipNotes }
     *     
     */
    public RelationshipNotes getRelationshipNotes() {
        return relationshipNotes;
    }

    /**
     * Définit la valeur de la propriété relationshipNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipNotes }
     *     
     */
    public void setRelationshipNotes(RelationshipNotes value) {
        this.relationshipNotes = value;
    }

    /**
     * Obtient la valeur de la propriété weaknessOrdinalities.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.WeaknessOrdinalities }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.WeaknessOrdinalities getWeaknessOrdinalities() {
        return weaknessOrdinalities;
    }

    /**
     * Définit la valeur de la propriété weaknessOrdinalities.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.WeaknessOrdinalities }
     *     
     */
    public void setWeaknessOrdinalities(lu.jimenez.research.cweparser.generatedObject.Category.WeaknessOrdinalities value) {
        this.weaknessOrdinalities = value;
    }

    /**
     * Obtient la valeur de la propriété applicablePlatforms.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ApplicablePlatforms }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.ApplicablePlatforms getApplicablePlatforms() {
        return applicablePlatforms;
    }

    /**
     * Définit la valeur de la propriété applicablePlatforms.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ApplicablePlatforms }
     *     
     */
    public void setApplicablePlatforms(lu.jimenez.research.cweparser.generatedObject.Category.ApplicablePlatforms value) {
        this.applicablePlatforms = value;
    }

    /**
     * Obtient la valeur de la propriété maintenanceNotes.
     * 
     * @return
     *     possible object is
     *     {@link MaintenanceNotes }
     *     
     */
    public MaintenanceNotes getMaintenanceNotes() {
        return maintenanceNotes;
    }

    /**
     * Définit la valeur de la propriété maintenanceNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link MaintenanceNotes }
     *     
     */
    public void setMaintenanceNotes(MaintenanceNotes value) {
        this.maintenanceNotes = value;
    }

    /**
     * Obtient la valeur de la propriété backgroundDetails.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.BackgroundDetails }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.BackgroundDetails getBackgroundDetails() {
        return backgroundDetails;
    }

    /**
     * Définit la valeur de la propriété backgroundDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.BackgroundDetails }
     *     
     */
    public void setBackgroundDetails(lu.jimenez.research.cweparser.generatedObject.Category.BackgroundDetails value) {
        this.backgroundDetails = value;
    }

    /**
     * Obtient la valeur de la propriété otherNotes.
     * 
     * @return
     *     possible object is
     *     {@link OtherNotes }
     *     
     */
    public OtherNotes getOtherNotes() {
        return otherNotes;
    }

    /**
     * Définit la valeur de la propriété otherNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherNotes }
     *     
     */
    public void setOtherNotes(OtherNotes value) {
        this.otherNotes = value;
    }

    /**
     * Obtient la valeur de la propriété alternateTerms.
     * 
     * @return
     *     possible object is
     *     {@link AlternateTerms }
     *     
     */
    public AlternateTerms getAlternateTerms() {
        return alternateTerms;
    }

    /**
     * Définit la valeur de la propriété alternateTerms.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternateTerms }
     *     
     */
    public void setAlternateTerms(AlternateTerms value) {
        this.alternateTerms = value;
    }

    /**
     * Obtient la valeur de la propriété terminologyNotes.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TerminologyNotes }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.TerminologyNotes getTerminologyNotes() {
        return terminologyNotes;
    }

    /**
     * Définit la valeur de la propriété terminologyNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TerminologyNotes }
     *     
     */
    public void setTerminologyNotes(lu.jimenez.research.cweparser.generatedObject.Category.TerminologyNotes value) {
        this.terminologyNotes = value;
    }

    /**
     * Obtient la valeur de la propriété timeOfIntroduction.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TimeOfIntroduction }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.TimeOfIntroduction getTimeOfIntroduction() {
        return timeOfIntroduction;
    }

    /**
     * Définit la valeur de la propriété timeOfIntroduction.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TimeOfIntroduction }
     *     
     */
    public void setTimeOfIntroduction(lu.jimenez.research.cweparser.generatedObject.Category.TimeOfIntroduction value) {
        this.timeOfIntroduction = value;
    }

    /**
     * Obtient la valeur de la propriété modesOfIntroduction.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ModesOfIntroduction }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.ModesOfIntroduction getModesOfIntroduction() {
        return modesOfIntroduction;
    }

    /**
     * Définit la valeur de la propriété modesOfIntroduction.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ModesOfIntroduction }
     *     
     */
    public void setModesOfIntroduction(lu.jimenez.research.cweparser.generatedObject.Category.ModesOfIntroduction value) {
        this.modesOfIntroduction = value;
    }

    /**
     * Obtient la valeur de la propriété enablingFactorsForExploitation.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.EnablingFactorsForExploitation }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.EnablingFactorsForExploitation getEnablingFactorsForExploitation() {
        return enablingFactorsForExploitation;
    }

    /**
     * Définit la valeur de la propriété enablingFactorsForExploitation.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.EnablingFactorsForExploitation }
     *     
     */
    public void setEnablingFactorsForExploitation(lu.jimenez.research.cweparser.generatedObject.Category.EnablingFactorsForExploitation value) {
        this.enablingFactorsForExploitation = value;
    }

    /**
     * Obtient la valeur de la propriété likelihoodOfExploit.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLikelihoodOfExploit() {
        return likelihoodOfExploit;
    }

    /**
     * Définit la valeur de la propriété likelihoodOfExploit.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLikelihoodOfExploit(String value) {
        this.likelihoodOfExploit = value;
    }

    /**
     * Obtient la valeur de la propriété commonConsequences.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.CommonConsequences }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.CommonConsequences getCommonConsequences() {
        return commonConsequences;
    }

    /**
     * Définit la valeur de la propriété commonConsequences.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.CommonConsequences }
     *     
     */
    public void setCommonConsequences(lu.jimenez.research.cweparser.generatedObject.Category.CommonConsequences value) {
        this.commonConsequences = value;
    }

    /**
     * Obtient la valeur de la propriété detectionMethods.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.DetectionMethods }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.DetectionMethods getDetectionMethods() {
        return detectionMethods;
    }

    /**
     * Définit la valeur de la propriété detectionMethods.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.DetectionMethods }
     *     
     */
    public void setDetectionMethods(lu.jimenez.research.cweparser.generatedObject.Category.DetectionMethods value) {
        this.detectionMethods = value;
    }

    /**
     * Obtient la valeur de la propriété potentialMitigations.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.PotentialMitigations }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.PotentialMitigations getPotentialMitigations() {
        return potentialMitigations;
    }

    /**
     * Définit la valeur de la propriété potentialMitigations.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.PotentialMitigations }
     *     
     */
    public void setPotentialMitigations(lu.jimenez.research.cweparser.generatedObject.Category.PotentialMitigations value) {
        this.potentialMitigations = value;
    }

    /**
     * Obtient la valeur de la propriété causalNature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCausalNature() {
        return causalNature;
    }

    /**
     * Définit la valeur de la propriété causalNature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCausalNature(String value) {
        this.causalNature = value;
    }

    /**
     * Obtient la valeur de la propriété demonstrativeExamples.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.DemonstrativeExamples }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.DemonstrativeExamples getDemonstrativeExamples() {
        return demonstrativeExamples;
    }

    /**
     * Définit la valeur de la propriété demonstrativeExamples.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.DemonstrativeExamples }
     *     
     */
    public void setDemonstrativeExamples(lu.jimenez.research.cweparser.generatedObject.Category.DemonstrativeExamples value) {
        this.demonstrativeExamples = value;
    }

    /**
     * Obtient la valeur de la propriété observedExamples.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ObservedExamples }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.ObservedExamples getObservedExamples() {
        return observedExamples;
    }

    /**
     * Définit la valeur de la propriété observedExamples.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.ObservedExamples }
     *     
     */
    public void setObservedExamples(lu.jimenez.research.cweparser.generatedObject.Category.ObservedExamples value) {
        this.observedExamples = value;
    }

    /**
     * Obtient la valeur de la propriété theoreticalNotes.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TheoreticalNotes }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.TheoreticalNotes getTheoreticalNotes() {
        return theoreticalNotes;
    }

    /**
     * Définit la valeur de la propriété theoreticalNotes.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TheoreticalNotes }
     *     
     */
    public void setTheoreticalNotes(lu.jimenez.research.cweparser.generatedObject.Category.TheoreticalNotes value) {
        this.theoreticalNotes = value;
    }

    /**
     * Obtient la valeur de la propriété functionalAreas.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.FunctionalAreas }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.FunctionalAreas getFunctionalAreas() {
        return functionalAreas;
    }

    /**
     * Définit la valeur de la propriété functionalAreas.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.FunctionalAreas }
     *     
     */
    public void setFunctionalAreas(lu.jimenez.research.cweparser.generatedObject.Category.FunctionalAreas value) {
        this.functionalAreas = value;
    }

    /**
     * Obtient la valeur de la propriété relevantProperties.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.RelevantProperties }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.RelevantProperties getRelevantProperties() {
        return relevantProperties;
    }

    /**
     * Définit la valeur de la propriété relevantProperties.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.RelevantProperties }
     *     
     */
    public void setRelevantProperties(lu.jimenez.research.cweparser.generatedObject.Category.RelevantProperties value) {
        this.relevantProperties = value;
    }

    /**
     * Obtient la valeur de la propriété affectedResources.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.AffectedResources }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.AffectedResources getAffectedResources() {
        return affectedResources;
    }

    /**
     * Définit la valeur de la propriété affectedResources.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.AffectedResources }
     *     
     */
    public void setAffectedResources(lu.jimenez.research.cweparser.generatedObject.Category.AffectedResources value) {
        this.affectedResources = value;
    }

    /**
     * Obtient la valeur de la propriété researchGaps.
     * 
     * @return
     *     possible object is
     *     {@link ResearchGaps }
     *     
     */
    public ResearchGaps getResearchGaps() {
        return researchGaps;
    }

    /**
     * Définit la valeur de la propriété researchGaps.
     * 
     * @param value
     *     allowed object is
     *     {@link ResearchGaps }
     *     
     */
    public void setResearchGaps(ResearchGaps value) {
        this.researchGaps = value;
    }

    /**
     * Obtient la valeur de la propriété references.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceListType }
     *     
     */
    public ReferenceListType getReferences() {
        return references;
    }

    /**
     * Définit la valeur de la propriété references.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceListType }
     *     
     */
    public void setReferences(ReferenceListType value) {
        this.references = value;
    }

    /**
     * Obtient la valeur de la propriété taxonomyMappings.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TaxonomyMappings }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.TaxonomyMappings getTaxonomyMappings() {
        return taxonomyMappings;
    }

    /**
     * Définit la valeur de la propriété taxonomyMappings.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.TaxonomyMappings }
     *     
     */
    public void setTaxonomyMappings(lu.jimenez.research.cweparser.generatedObject.Category.TaxonomyMappings value) {
        this.taxonomyMappings = value;
    }

    /**
     * Obtient la valeur de la propriété whiteBoxDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.WhiteBoxDefinitions }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.WhiteBoxDefinitions getWhiteBoxDefinitions() {
        return whiteBoxDefinitions;
    }

    /**
     * Définit la valeur de la propriété whiteBoxDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.WhiteBoxDefinitions }
     *     
     */
    public void setWhiteBoxDefinitions(lu.jimenez.research.cweparser.generatedObject.Category.WhiteBoxDefinitions value) {
        this.whiteBoxDefinitions = value;
    }

    /**
     * Obtient la valeur de la propriété blackBoxDefinitions.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.BlackBoxDefinitions }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.BlackBoxDefinitions getBlackBoxDefinitions() {
        return blackBoxDefinitions;
    }

    /**
     * Définit la valeur de la propriété blackBoxDefinitions.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.BlackBoxDefinitions }
     *     
     */
    public void setBlackBoxDefinitions(lu.jimenez.research.cweparser.generatedObject.Category.BlackBoxDefinitions value) {
        this.blackBoxDefinitions = value;
    }

    /**
     * Obtient la valeur de la propriété relatedAttackPatterns.
     * 
     * @return
     *     possible object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.RelatedAttackPatterns }
     *     
     */
    public lu.jimenez.research.cweparser.generatedObject.Category.RelatedAttackPatterns getRelatedAttackPatterns() {
        return relatedAttackPatterns;
    }

    /**
     * Définit la valeur de la propriété relatedAttackPatterns.
     * 
     * @param value
     *     allowed object is
     *     {@link lu.jimenez.research.cweparser.generatedObject.Category.RelatedAttackPatterns }
     *     
     */
    public void setRelatedAttackPatterns(lu.jimenez.research.cweparser.generatedObject.Category.RelatedAttackPatterns value) {
        this.relatedAttackPatterns = value;
    }

    /**
     * Obtient la valeur de la propriété contentHistory.
     * 
     * @return
     *     possible object is
     *     {@link ContentHistory }
     *     
     */
    public ContentHistory getContentHistory() {
        return contentHistory;
    }

    /**
     * Définit la valeur de la propriété contentHistory.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentHistory }
     *     
     */
    public void setContentHistory(ContentHistory value) {
        this.contentHistory = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Obtient la valeur de la propriété name.
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
     * Définit la valeur de la propriété name.
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
     * Obtient la valeur de la propriété weaknessAbstraction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeaknessAbstraction() {
        return weaknessAbstraction;
    }

    /**
     * Définit la valeur de la propriété weaknessAbstraction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeaknessAbstraction(String value) {
        this.weaknessAbstraction = value;
    }

    /**
     * Obtient la valeur de la propriété status.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Définit la valeur de la propriété status.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

}
