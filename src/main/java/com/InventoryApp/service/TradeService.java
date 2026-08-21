package com.InventoryApp.service;

import java.util.List;
import java.util.Date;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.InventoryApp.domain.Trade;
import com.InventoryApp.dto.TradeDTO;
import com.InventoryApp.dto.TradeSearchDTO;
import com.InventoryApp.dto.TradePageDTO;
import com.InventoryApp.dto.TradeConvertCriteriaDTO;
import com.InventoryApp.service.GenericService;
import com.InventoryApp.dto.common.RequestDTO;
import com.InventoryApp.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface TradeService extends GenericService<Trade, Integer> {

	List<Trade> findAll();

	ResultDTO addTrade(TradeDTO tradeDTO, RequestDTO requestDTO);

	ResultDTO updateTrade(TradeDTO tradeDTO, RequestDTO requestDTO);

    Page<Trade> getAllTrades(Pageable pageable);

    Page<Trade> getAllTrades(Specification<Trade> spec, Pageable pageable);

	ResponseEntity<TradePageDTO> getTrades(TradeSearchDTO tradeSearchDTO);
	
	List<TradeDTO> convertTradesToTradeDTOs(List<Trade> trades, TradeConvertCriteriaDTO convertCriteria);

	TradeDTO getTradeDTOById(Integer tradeId);



	
}
