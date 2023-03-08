package com.schurkenhuber.travel.travelmap.model

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Column
import org.springframework.data.relational.core.mapping.Table

@Table("user_record")
data class User(
    @Id val id: Long?,
    @Column("access_token") val accessToken: String
)
