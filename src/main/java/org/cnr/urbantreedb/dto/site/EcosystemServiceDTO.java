package org.cnr.urbantreedb.dto.site;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EcosystemServiceDTO {

    @NotNull(message = "Bird feeding cannot be empty.")
    @JsonProperty("bird_feeding")
    private Boolean isBirdFeeding;

 /*   @NotNull(message = "Edibility cannot be empty.")
    @JsonProperty("edibility")
    private Boolean isEdibility;*/

    @NotNull(message = "Honey plant cannot be empty.")
    @JsonProperty("honey_plant")
    private Boolean isHoneyPlant;

    /**
     * Low VOC Emissions
     * Some species emit biogenic volatile organic compounds (VOCs), which are a precursor
     * to ozone formation. Rank the importance of selecting species that have low VOC emissions.
     */
    @Max(value = 10, message = "The VOC emission is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The VOC emission is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "The low VOC emission capacity cannot be empty.")
    @JsonProperty("low_voc_emission")
    private Integer lowVOCEmissionLevel;

    /**
     * Air Temperature Reduction
     * Trees can help reduce the urban heat island effect through evapotranspiration. Rank the importance of selecting
     * species for their potential to lower air temperatures.
     */
    @Max(value = 10, message = "The air temperature reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The air temperature reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Air temperature reduction capacity cannot be empty.")
    @JsonProperty("air_temperature_reduction")
    private Integer airTemperatureReductionLevel;

    /**
     * Streamflow Reduction
     * Trees can help slow stormwater runoff and the flow of water into streams and rivers by intercepting rainfall
     * and through evapotranspiration. Rank the importance of selecting species for their potential to reduce
     * runoff and stream flow.
     */
    @Max(value = 10, message = "The stream flow reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The stream flow reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Stream flow reduction capacity cannot be empty.")
    @JsonProperty("stream_flow_reduction")
    private Integer streamFlowReductionLevel;

    /**
     * Carbon Storage
     * Trees sequester carbon dioxide from the atmosphere and store it as woody material.
     * Rank the importance of selecting species for their potential to capture carbon dioxide.
     */
    @Max(value = 10, message = "The carbon storage capacity is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The carbon storage capacity is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Carbon storage capacity cannot be empty.")
    @JsonProperty("carbon_storage_capacity")
    private Integer carbonStorageCapacityLevel;

    /**
     * UV Radiation Reduction
     * Plant leaves absorb 90-95% of ultraviolet (UV) radiation that passes through them, which can help protect us
     * from sunburn and associated skin damage, including cancer. Rank the importance of selecting species for their
     * potential to reduce UV radiation.
     */
    @Max(value = 10, message = "The UV radiation reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The UV radiation reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "UV radiation reduction capacity cannot be empty.")
    @JsonProperty("uv_reduction")
    private Integer uvRadiationReduction;

    /**
     * Low Allergenicity
     * Different tree species produce different amounts of allergy-causing pollen. Rank the importance of selecting
     * species for their reduced potential to cause allergic reactions.
     */
    @Max(value = 10, message = "The allergenicity reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The allergenicity reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "The low Allergenicity produce capacity cannot be empty.")
    @JsonProperty("low_allergenicity_capacity")
    private Integer lowAllergenicityLevel;

    /**
     * Wind Reduction
     * Strategically planted trees can serve as wind breaks, reducing heating energy needs. Rank the importance
     * of selecting species for their ability to slow the flow of wind.
     */
    @Max(value = 10, message = "The wind reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "The wind reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Wind reduction capacity cannot be empty.")
    @JsonProperty("wind_reduction")
    private Integer windReductionLevel;

    /**
     * Building Energy Reduction
     * Trees can reduce building energy use indirectly (by reducing the overall urban heat island effect) and
     * directly (by shading buildings and serving as wind breaks). Rank the importance of selecting species for their
     * potential to reduce the heating and cooling demand of a building.
     */
    @Max(value = 10, message = "Building energy reduction is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "Building energy reduction is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Building energy reduction capacity cannot be empty.")
    @JsonProperty("building_energy_reduction")
    private Integer buildingEnergyReductionLevel;

    /**
     * Air Pollutant Removal
     * Trees remove pollutants from the air by capturing them on plant surfaces or absorbing them through
     * leaf stomata. Rank the importance of selecting species for their potential to remove air pollutants.
     */
    @Max(value = 10, message = "Air pollution removal capacity is invalid. Allowed maximum of {value}, given: ${validatedValue}.")
    @Min(value = 0, message = "Air pollution removal capacity is invalid. Allowed minimum of {value}, given: ${validatedValue}.")
    @NotNull(message = "Air pollution removal capacity cannot be empty.")
    @JsonProperty("pollution_removal")
    private Integer airPollutionRemovalCapacityLevel;

}
