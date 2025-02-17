package com.urlshortener.core.domain.shortening.model;

import com.urlshortener.core.infrastucture.utils.model.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "urls")
@NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter
public class URL extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "user_id")
    private String userId;
    @Column(name = "original_url")
    private String originalUrl;
    @Column(name = "short_url_code")
    private String shortUrlCode;
}
