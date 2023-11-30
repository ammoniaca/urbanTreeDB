package org.cnr.urbantreedb.model.apparence;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.apparence.leaf.LeafAutumnColoringEnum;
import org.cnr.urbantreedb.enums.apparence.leaf.FoliageEnum;
import org.cnr.urbantreedb.enums.apparence.leaf.LeafShapeEnum;

@Entity
@Table(name = "leaf")
public class LeafEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long leafId;

    @Column(name = "foliage")
    private FoliageEnum foliage;
    @Column(name = "leaf_shape")
    private LeafShapeEnum leafShape;
    @Column(name = "single_leaf_length")
    private double singleLeafLength;
    @Column(name = "ornamental_autumn_coloring")
    private boolean ornamentalAutumnColoring;
    @Column(name = "leaf_autumn_coloring")
    private LeafAutumnColoringEnum leafAutumnColoring;


}
