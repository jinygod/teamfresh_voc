package com.oracle.TeamFresh.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oracle.TeamFresh.model.CompensationDto;
import com.oracle.TeamFresh.model.PenaltyDto;
import com.oracle.TeamFresh.model.VocDto;
import com.oracle.TeamFresh.model.GetCmpsListVo;
import com.oracle.TeamFresh.model.GetCmpstnListDto;
import com.oracle.TeamFresh.model.GetVocListDto;
import com.oracle.TeamFresh.model.GetVocListVo;
import com.oracle.TeamFresh.service.TeamFreshService;

@RestController
@RequestMapping(value = "teamfresh")
public class TeamFreshController {

	private static final Logger logger = LoggerFactory.getLogger(TeamFreshController.class);

	@Autowired
	private TeamFreshService teamFreshService;

	// VOC 목록
	@RequestMapping(value = "voc", method = RequestMethod.GET)
	public List<GetVocListDto> getVocList(GetVocListVo vocListVo) {
		logger.info("TeamFreshController의 getVocList(vocListVo) 시작...");
		List<GetVocListDto> getVocList = teamFreshService.getVocList(vocListVo);
		return getVocList;
	}

	// VOC 등록
	@RequestMapping(value = "voc", method = RequestMethod.POST)
	public String insertVoc(VocDto vocDto) {
		logger.info("TeamFreshController의 insertVoc() 시작...");
		String resultMessage = teamFreshService.insertVoc(vocDto);
		return resultMessage;
	}

	// 배상 목록
	@RequestMapping(value = "compensation", method = RequestMethod.GET)
	public List<GetCmpstnListDto> getCompensationList(GetCmpsListVo compensationListVo) {
		logger.info("TeamFreshController의 getCompensationList() 시작...");
		List<GetCmpstnListDto> getCmpstnList = teamFreshService.getCompensationList(compensationListVo);
		return getCmpstnList;
	}

	// 배상 등록
	@RequestMapping(value = "compensation", method = RequestMethod.POST)
	public String insertCompensation(CompensationDto compensationDto) {
		logger.info("TeamFreshController의 insertCompensation() 시작...");
		String resultMessage = teamFreshService.insertCompensation(compensationDto);
		return resultMessage;
	}

	// 페널티 등록
	@RequestMapping(value = "penalty", method = RequestMethod.POST)
	public String insertPenalty(PenaltyDto penaltyDto) {
		logger.info("TeamFreshController의 insertPenalty() 시작...");
		String resultMessage = teamFreshService.insertPenalty(penaltyDto);
		return resultMessage;
	}

	// 페널티 업데이트
	@RequestMapping(value = "penalty", method = RequestMethod.PUT)
	public String updatePenaltyFlag(PenaltyDto penaltyDto) {
		logger.info("TeamFreshController의 updatePenaltyFlag() 시작...");
		String resultMessage = teamFreshService.updatePenaltyFlag(penaltyDto);
		return resultMessage;
	}

}
