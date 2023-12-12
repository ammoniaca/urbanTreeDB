package org.cnr.urbantreedb.controller;

import jakarta.validation.Valid;
import org.cnr.urbantreedb.dto.TreeRequestDTO;
import org.cnr.urbantreedb.dto.TreeResponseDTO;
import org.cnr.urbantreedb.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/tree-finder")
public class TreeController {

    private final TreeService treeService;

    @Autowired
    public TreeController(TreeService treeService) {

        this.treeService = treeService;
    }

    @PostMapping(
            value = "/create-tree",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<?> createTree(

            @RequestBody
            @Valid
            TreeRequestDTO treeDTO
            // BindingResult result
    ){
        System.out.println(treeDTO.getFamily());
        TreeResponseDTO treeResponseDTO = treeService.createTree(treeDTO);
        // Return the created resource with a 201 (created) status code
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(treeResponseDTO);
    }
}
