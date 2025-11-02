package com.example.packaging_jte_jar.entity;

public record Todo(
        Long id,
        String title,
        String description,
        boolean completed
) {}
