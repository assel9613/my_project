package com.company.my_project.entity;

import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.InstanceName;
import io.jmix.core.metamodel.annotation.JmixEntity;
import io.jmix.data.DbView;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@DbView
@JmixEntity
@Table(name = "PRODUCTS", indexes = {
        @Index(name = "IDX_PRODUCTS_ORDERS_ID", columnList = "ORDERS_ID")
})
@Entity
public class Products {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @InstanceName
    @Column(name = "NAME", nullable = false)
    @NotNull
    private String name;

    @Column(name = "ARTICLE_NUMBER", nullable = false)
    @NotNull
    private String article_number;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SIZES")
    private String sizes;



    public String getSizes() {
        return sizes;
    }

    public void setSizes(String sizes) {
        this.sizes = sizes;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getArticle_number() {
        return article_number;
    }

    public void setArticle_number(String article_number) {
        this.article_number = article_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}