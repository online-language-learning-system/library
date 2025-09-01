package com.hub.common_library.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.ZonedDateTime;

@Getter
@Setter
public class AbstractAuditEntity {

    @CreatedBy
    private String createdBy;

    @CreatedDate
    private ZonedDateTime createdOn;

    @LastModifiedBy
    private String lastModifiedBy;

    @LastModifiedDate
    private ZonedDateTime lastModifiedOn;

}
