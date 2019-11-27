package com.w.service;

import java.util.List;

import com.w.domain.Credits;
import org.springframework.stereotype.Service;

@Service("creditsService")
public interface CreditsService {
	
	int addCredits(Credits credits);

    int deleteCredits(String creditsID);

    int updateCredits(Credits credits);

    List<Credits> findAllCredits();

    Credits findOneByID(String creditsId);

}
