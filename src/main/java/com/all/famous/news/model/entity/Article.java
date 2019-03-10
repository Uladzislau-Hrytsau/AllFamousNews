package com.all.famous.news.model.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Entity
@Table(name = "article")
@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Article implements Serializable {

    //TODO: change length of fields using properties

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "BIGINT(10) UNSIGNED")
    @NotNull
    @PositiveOrZero
    private Long id;

    @Column(name = "title", length = 450)
    @NotNull
    @NotEmpty
    private String title;

    @Column(name = "content", length = 450)
    @NotNull
    @NotEmpty
    private String content;

    @Column(name = "encode_image", unique = true, length = 200)
    @NotNull
    @NotEmpty
    private String encodeImage;

    @Column(name = "description", length = 450)
    @NotNull
    @NotEmpty
    private String description;

    @Column(name = "category_id", unique = true, columnDefinition = "BIGINT(10) UNSIGNED")
    @NotNull
    @PositiveOrZero
    private Long categoryId;

}
