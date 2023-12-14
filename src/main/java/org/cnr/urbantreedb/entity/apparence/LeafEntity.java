package org.cnr.urbantreedb.entity.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.cnr.urbantreedb.entity.TreeEntity;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.leaf.*;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "leaves")
public class LeafEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "leaf_id", updatable = false, nullable = false)
    private Long leafId;

    @Column(name = "deciduous")
    private Boolean isDeciduous;

    @Column(name = "ornamental")
    private Boolean isLeafOrnamental;

    @Column(name = "foliage_ornamental")
    private Boolean isFoliageOrnamental;

    @Column(name = "size")
    private Double singleLeafSize;

    @Column(name = "shape")
    private Set<LeafShapeEnum> leafShape;

    @Column(name = "arrangement")
    private Set<LeafArrangementEnum> leafArrangement;

    @Column(name = "margin")
    private Set<LeafMarginEnum> leafMargin;

    @Column(name = "venation")
    private Set<LeafVenationEnum> leafVenation;

    @Column(name = "color")
    private Set<LeafColoringEnum> leafColor;

    @Column(name = "foliage")
    private Set<FoliageColoringEnum> foliageColor;

    @Column(name = "foliage_period")
    private Set<MonthEnum> foliagePeriod;

    @OneToOne(mappedBy = "leaf")
    private TreeEntity treeEntity;

}
