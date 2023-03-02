package net.ent.etrs.ski.model.facades.api.dtos;

import lombok.*;
import net.ent.etrs.ski.model.entities.references.ConstantesModel;
import net.ent.etrs.ski.model.entities.references.Etat;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotNull;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RemonteeDTO {

    private Long id;
    private String nom;


    private Integer nbPlaceUnite;


    private Etat etat;
}
