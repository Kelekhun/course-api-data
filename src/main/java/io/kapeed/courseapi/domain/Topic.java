package io.kapeed.courseapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "topic")
public class Topic {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private String id;
    private String name;
    private String description;
}
