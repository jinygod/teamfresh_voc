package com.oracle.TeamFresh.service;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oracle.TeamFresh.model.CompensationDto;
import com.oracle.TeamFresh.model.GetCmpsListVo;
import com.oracle.TeamFresh.model.PenaltyDto;
import com.oracle.TeamFresh.model.VocDto;
import com.oracle.TeamFresh.model.GetCmpstnListDto;
import com.oracle.TeamFresh.model.GetVocListDto;
import com.oracle.TeamFresh.model.GetVocListVo;
import com.oracle.TeamFresh.repository.TeamFreshDao;

@Service
public class TeamFreshService {
	
	private static final Logger logger = LoggerFactory.getLogger(TeamFreshService.class);

	@Autowired
	private TeamFreshDao teamFreshDao;

	public List<GetVocListDto> getVocList(GetVocListVo vocListVo) {
		logger.info("TeamFreshService의 getVocList(vocListVo) 시작...");
		List<GetVocListDto> getVocList = teamFreshDao.getVocList(vocListVo);
		return getVocList;
	}

	public List<GetCmpstnListDto> getCompensationList(GetCmpsListVo compensationListVo) {
		logger.info("TeamFreshService의 getCompensationList() 시작...");
		List<GetCmpstnListDto> getCmpstnList = teamFreshDao.getCompensationList(compensationListVo);
		return getCmpstnList;
	}

	
	public String insertVoc(VocDto vocDto) {
		logger.info("TeamFreshService의 insertVoc() 시작...");
		String resultMessage = teamFreshDao.insertVoc(vocDto);
		return resultMessage;
	}

	public String insertPenalty(PenaltyDto penaltyDto) {
		logger.info("TeamFreshService의 insertPenalty() 시작...");
		String resultMessage = teamFreshDao.insertPenalty(penaltyDto);
		return resultMessage;
	}

	public String updatePenaltyFlag(PenaltyDto penaltyDto) {
		logger.info("TeamFreshService의 updatePenaltyFlag() 시작...");
		String resultMessage = teamFreshDao.updatePenaltyFlag(penaltyDto);
		return resultMessage;
	}

	public String insertCompensation(CompensationDto compensationDto) {
		logger.info("TeamFreshService의 insertCompensation() 시작...");
		String resultMessage = teamFreshDao.insertCompensation(compensationDto);
		return resultMessage;
	}
}
