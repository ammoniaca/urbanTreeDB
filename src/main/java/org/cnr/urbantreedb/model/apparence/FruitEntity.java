package org.cnr.urbantreedb.model.apparence;

import jakarta.persistence.*;
import org.cnr.urbantreedb.enums.apparence.fruit.FruitColorEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.InfructescenceEnum;

@Entity
@Table(name = "fruit")
public class FruitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long fruitId;

    @Column(name = "fruit_color")
    private FruitColorEnum fruitColor;

    @Column(name = "ornamental")
    private boolean isFruitOrnamental;

    @Column(name = "infructescence")
    private InfructescenceEnum infructescence;



}
