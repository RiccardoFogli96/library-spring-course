package com.library.course.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
