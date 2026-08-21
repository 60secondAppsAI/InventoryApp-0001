package com.InventoryApp.dao;

import java.util.List;
import java.util.Date;

import com.InventoryApp.dao.GenericDAO;
import com.InventoryApp.domain.Trade;




import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

public interface TradeDAO extends GenericDAO<Trade, Integer> {
  
	List<Trade> findAll();
	


}

