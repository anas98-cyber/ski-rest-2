package net.ent.etrs.ski.model.facades.api.dtos.converters;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import net.ent.etrs.ski.exceptions.BusinessException;
import net.ent.etrs.ski.model.entities.Forfait;
import net.ent.etrs.ski.model.entities.Piste;
import net.ent.etrs.ski.model.entities.Remontee;
import net.ent.etrs.ski.model.facades.FacadePiste;
import net.ent.etrs.ski.model.facades.FacadeRemontee;
import net.ent.etrs.ski.model.facades.api.dtos.ForfaitDto;
import net.ent.etrs.ski.model.facades.api.dtos.PisteDto;
import net.ent.etrs.ski.model.facades.api.dtos.RemonteeDTO;
import net.ent.etrs.ski.utils.CDIUtils;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RemonteeDtoConverter {

    private static FacadeRemontee facadeRemontee;

    static {
        RemonteeDtoConverter.facadeRemontee = CDIUtils.getBean(FacadeRemontee.class);
    }

    public static RemonteeDTO toDto(Remontee remontee) {
        return RemonteeDTO.builder()
                .id(remontee.getId())
                .nom(remontee.getNom())
                .nbPlaceUnite(remontee.getNbPlaceUnite())
                .build();
    }

    public static Remontee toEntity(RemonteeDTO remonteeDTO) throws BusinessException {
        Remontee remontee = new Remontee();
        remontee.setId(remonteeDTO.getId());
        remontee.setNom(remonteeDTO.getNom());
        remontee.setNbPlaceUnite(remonteeDTO.getNbPlaceUnite());
        remontee.setEtat(remonteeDTO.getEtat());




        return remontee;
    }
}
