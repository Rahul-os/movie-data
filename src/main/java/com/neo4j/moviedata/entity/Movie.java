package com.neo4j.moviedata.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Node
public class Movie {

    @Id
    public String ids;
    public String title;
    public String description;
    public String year;

    public String runtime;
    public String rating;
    public String votes;
    public String revenue;
    @Relationship(type = "IN" , direction = Relationship.Direction.OUTGOING)
    @JsonIgnore                                // Since we dont want genres property in the Movie node, i am ignoring the json field in the result.
    public List<Genres> genres;


}
