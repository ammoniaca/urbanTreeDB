package org.cnr.urbantreedb.model;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.leaf.LeafAutumnColoringEnum;
import org.cnr.urbantreedb.enums.leaf.FoliageEnum;
import org.cnr.urbantreedb.enums.leaf.LeafShapeEnum;

@Entity
@Table(name = "leaf")
public class TreeLeafEntity {

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
