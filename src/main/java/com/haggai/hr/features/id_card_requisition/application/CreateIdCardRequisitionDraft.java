package com.haggai.hr.features.id_card_requisition.application;

import com.haggai.hr.features.id_card_requisition.application.repository.IdCardRequisitionRepository;
import com.haggai.hr.features.id_card_requisition.domain.IdCardRequisition;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class CreateIdCardRequisitionDraft {
    private final IdCardRequisitionRepository idCardRequisitionRepository;

    public IdCardRequisition execute(String creatorId){
        IdCardRequisition requisition = new IdCardRequisition(
                UUID.randomUUID().toString(),
                creatorId
        );

        idCardRequisitionRepository.save(requisition);

        return requisition;
    }
}
