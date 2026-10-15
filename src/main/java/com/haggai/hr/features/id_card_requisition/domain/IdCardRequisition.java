package com.haggai.hr.features.id_card_requisition.domain;

import com.haggai.hr.features.id_card_requisition.domain.enums.RequisitionStatus;
import lombok.Getter;

@Getter
public class IdCardRequisition {
    private final String uuid;
    private final String createdBy;
    private RequisitionStatus requisitionStatus;


    public IdCardRequisition(String uuid, String createdBy) {

        if (uuid == null || uuid.isBlank()) {
            throw new IllegalArgumentException(
                    "A requisition must have an identifier."
            );
        }

        if (createdBy == null || createdBy.isBlank()) {
            throw new IllegalArgumentException(
                    "A requisition must have a creator."
            );
        }

        this.uuid = uuid;
        this.createdBy = createdBy;
        this.requisitionStatus = RequisitionStatus.DRAFT;
    }
}
