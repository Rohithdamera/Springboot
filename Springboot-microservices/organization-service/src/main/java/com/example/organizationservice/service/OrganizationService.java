package com.example.organizationservice.service;

import org.springframework.stereotype.Service;

import com.example.organizationservice.dto.OrganizationDto;
import com.example.organizationservice.entity.Organization;


@Service
public interface OrganizationService {
	
	OrganizationDto saveOrganization(OrganizationDto organizationDto);
	
	OrganizationDto getOrganizationByCode(String organizationCode);

}
