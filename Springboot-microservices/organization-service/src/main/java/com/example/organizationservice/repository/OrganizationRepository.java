package com.example.organizationservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.organizationservice.dto.OrganizationDto;
import com.example.organizationservice.entity.Organization;


@Repository
public interface OrganizationRepository extends JpaRepository<Organization, Long> {
	
	 Organization findByOrganizationCode(String organizationCode);

}
