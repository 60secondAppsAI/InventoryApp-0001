package com.InventoryApp.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.InventoryApp.domain.Portfolio;
import com.InventoryApp.dto.PortfolioDTO;
import com.InventoryApp.dto.PortfolioSearchDTO;
import com.InventoryApp.dto.PortfolioPageDTO;
import com.InventoryApp.dto.PortfolioConvertCriteriaDTO;
import com.InventoryApp.service.GenericService;
import com.InventoryApp.dto.common.RequestDTO;
import com.InventoryApp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface PortfolioService extends GenericService<Portfolio, Integer> {

	List<Portfolio> findAll();

	ResultDTO addPortfolio(PortfolioDTO portfolioDTO, RequestDTO requestDTO);

	ResultDTO updatePortfolio(PortfolioDTO portfolioDTO, RequestDTO requestDTO);

    Page<Portfolio> getAllPortfolios(Pageable pageable);

    Page<Portfolio> getAllPortfolios(Specification<Portfolio> spec, Pageable pageable);

	ResponseEntity<PortfolioPageDTO> getPortfolios(PortfolioSearchDTO portfolioSearchDTO);
	
	List<PortfolioDTO> convertPortfoliosToPortfolioDTOs(List<Portfolio> portfolios, PortfolioConvertCriteriaDTO convertCriteria);

	PortfolioDTO getPortfolioDTOById(Integer portfolioId);



	
}
