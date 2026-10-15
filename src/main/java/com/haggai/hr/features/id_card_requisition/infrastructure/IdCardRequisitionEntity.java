package com.haggai.hr.features.id_card_requisition.infrastructure;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "id_card_requisitions")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class IdCardRequisitionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
