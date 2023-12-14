package org.cnr.urbantreedb.entity.apparence;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;
import org.cnr.urbantreedb.entity.TreeEntity;
import org.cnr.urbantreedb.enums.MonthEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.FruitColorEnum;
import org.cnr.urbantreedb.enums.apparence.fruit.InfructescenceEnum;

import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "fruits")
public class FruitEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "fruit_id", updatable = false, nullable = false)
    private Long fruitId;

    @Column(name ="ornamental")
    private Boolean isFruitOrnamental;

    @Column(name ="color")
    private Set<FruitColorEnum> fruitColor;

    @Column(name ="infructescence")
    private Set<InfructescenceEnum> infructescence;

    @Column(name ="period")
    private Set<MonthEnum> period;

    @OneToOne(mappedBy = "fruit")
    private TreeEntity treeEntity;

}
