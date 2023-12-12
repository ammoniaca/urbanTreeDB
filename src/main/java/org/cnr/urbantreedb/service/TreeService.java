package org.cnr.urbantreedb.service;

import org.cnr.urbantreedb.dto.TreeRequestDTO;
import org.cnr.urbantreedb.dto.TreeResponseDTO;
import org.cnr.urbantreedb.entity.TreeEntity;
import org.cnr.urbantreedb.repository.TreeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

@Service
public class TreeService {

    private TreeRepository treeRepository;

    private ModelMapper modelMapper;

    @Autowired
    public TreeService(
            TreeRepository treeRepository,
            ModelMapper modelMapper
    ) {
        this.treeRepository = treeRepository;
        this.modelMapper = modelMapper;
    }

    public TreeResponseDTO createTree(TreeRequestDTO treeRequestDTO) {
        TreeEntity treeEntity = modelMapper
                .map(treeRequestDTO, TreeEntity.class);

        // set datetime in UTC
        OffsetDateTime odt = OffsetDateTime.now(ZoneOffset.UTC);
        treeEntity.setRegistrationDatetimeUTC(odt);
        treeEntity.setUpdateDatetimeUTC(odt);

        // set scientific name
        StringBuilder binomialName = new StringBuilder();
        binomialName
                .append(treeEntity.getGenus())
                .append(" ")
                .append(treeEntity.getSpecies())
                .append(treeRequestDTO.getInfraname() != null ? " ": "")
                .append(treeRequestDTO.getInfraname() != null ? treeRequestDTO.getInfraname(): "");
        treeEntity.setBinomialName(binomialName.toString());

        // Save new tree to DB
        TreeEntity treeCreatedEntity = treeRepository.save(treeEntity);
        // get response
        TreeResponseDTO treeResponseDTO = modelMapper.map(treeCreatedEntity, TreeResponseDTO.class);
        return treeResponseDTO;
    }

}
