package com.library.course.model;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class AuthorDTO extends CreateAuthorDTO{

    private Long id;

    public AuthorDTO(String name, String surname, String biography) {
        super(name,surname,biography);
    }
}