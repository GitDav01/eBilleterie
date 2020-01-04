package com.projetEbilleterie.ebilleterie.exposition.relative;

import com.projetEbilleterie.ebilleterie.domain.relative.Relative;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public final class RelativeAdapter {

    public static RelativeDTO adaptToRelativeDTO(Relative relative) {
        return new RelativeDTO(
             //   relative.getId(),
                relative.getLastname(),
                relative.getFirstname(),
                relative.getEmail(),
                relative.getPhoneNumber()
         );
    }

    public static List<Relative> transformToRelativeList(List<RelativeDTO> relativeDTO) {
        if(relativeDTO == null) {return new ArrayList<>();}
        return relativeDTO.stream().map(RelativeAdapter::transformToRelative).collect(Collectors.toList());
    }

    public static List<RelativeDTO> adaptToRelativeDTOList(List<Relative> relatives) {
        return relatives.stream().map(RelativeAdapter::adaptToRelativeDTO).collect(Collectors.toList());
    }

    static Relative transformToRelative(RelativeDTO relativeDTO) {
        return new Relative(null,relativeDTO.lastname,relativeDTO.firstname,relativeDTO.email,relativeDTO.phoneNumber);
    }
}
