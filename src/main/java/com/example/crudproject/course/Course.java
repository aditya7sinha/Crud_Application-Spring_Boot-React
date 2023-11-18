package com.example.crudproject.course;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@JsonSerialize
public class Course {
    @JsonProperty("id")
    private Long id;
    @JsonProperty("userName")
    private String username;
    @JsonProperty("description")
    private String description;

}
