package com.all.famous.news.model.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import java.io.Serializable;

@Entity
@Table(name = "category")
@Slf4j
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", columnDefinition = "BIGINT(10) UNSIGNED")
    @NotNull
    @PositiveOrZero
    private Long id;

    @Column(name = "parent_id", columnDefinition = "BIGINT(10) UNSIGNED")
    @NotNull
    @PositiveOrZero
    private Long parentId;

    @Column(name = "category_name", unique = true, length = 200)
    @NotNull
    @NotEmpty
    private String categoryName;

}
