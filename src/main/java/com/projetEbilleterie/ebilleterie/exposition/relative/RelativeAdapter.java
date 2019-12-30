package com.projetEbilleterie.ebilleterie.exposition.relative;

import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class RelativeAdapter {

    static RelativeDTO adaptToRelativeDTO(Relative relative) {
        return new RelativeDTO(
                relative.getId(),
                relative.getLastname(),
                relative.getFirstname(),
                relative.getEmail(),
                relative.getPhoneNumber()
         );
    }

    static List<RelativeDTO> adaptToRelativeDTOList(List<Relative> relatives) {
        return relatives.stream().map(RelativeAdapter::adaptToRelativeDTO).collect(Collectors.toList());
    }

    static Relative transformToRelative(RelativeDTO relativeDTO) {
        String id = (relativeDTO.id == null || relativeDTO.id.trim().equals(""))? UUID.randomUUID().toString() : relativeDTO.id;
        return new Relative(id,relativeDTO.lastname,relativeDTO.firstname,relativeDTO.email,relativeDTO.phoneNumber);
    }
}
