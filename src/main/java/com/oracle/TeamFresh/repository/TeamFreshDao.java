package com.oracle.TeamFresh.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oracle.TeamFresh.model.CompensationDto;
import com.oracle.TeamFresh.model.GetCmpsListVo;
import com.oracle.TeamFresh.model.PenaltyDto;
import com.oracle.TeamFresh.model.VocDto;
import com.oracle.TeamFresh.model.GetCmpstnListDto;
import com.oracle.TeamFresh.model.GetVocListDto;
import com.oracle.TeamFresh.model.GetVocListVo;

@Repository
public class TeamFreshDao {

	private static final Logger logger = LoggerFactory.getLogger(TeamFreshDao.class);

	@Autowired
	SqlSession session;

	public List<GetVocListDto> getVocList(GetVocListVo vocListVo) {
		List<GetVocListDto> getVocList = null;
		logger.info("TeamFreshDao의 getVocList(vocListVo) 시작...");
		try {
			getVocList = session.selectList("getVocList", vocListVo);
		} catch (Exception e) {
			logger.info("TeamFreshDao의 getVocList()의 SQL EXCEPTION : " + e.getMessage());
		}
		return getVocList;
	}

	public List<GetCmpstnListDto> getCompensationList(GetCmpsListVo compensationListVo) {
		List<GetCmpstnListDto> getCmpstnList = null;
		logger.info("TeamFreshDao의 getCompensationList() 시작...");
		try {
			getCmpstnList = session.selectList("getCmpstnList", compensationListVo);
		} catch (Exception e) {
			logger.info("TeamFreshDao의 getCompensationList()의 SQL EXCEPTION : " + e.getMessage());
		}
		return getCmpstnList;
	}

	public String insertVoc(VocDto vocDto) {
		logger.info("TeamFreshDao의 insertVoc() 시작...");
		String resultMessage = null;
		try {
			int insertResultNo = session.insert("insertVoc", vocDto);
			if (insertResultNo == 1) {
				resultMessage = "VOC가 정상적으로 등록 되었습니다.";
			} else {
				resultMessage = "VOC 등록 오류 발생";
			}

		} catch (Exception e) {
			logger.info("TeamFreshDao의 insertVoc()의 SQL EXCEPTION : " + e.getMessage());
		}
		return resultMessage;
	}

	public String insertPenalty(PenaltyDto penaltyDto) {
		logger.info("TeamFreshDao의 insertPenalty() 시작...");
		String resultMessage = null;
		try {
			int insertPResult = session.insert("insertPenalty", penaltyDto);
			if (insertPResult == 1) {
				resultMessage = "페널티가 정상적으로 등록 되었습니다.";
			} else {
				resultMessage = "페널티 등록 오류 발생";
			}
		} catch (Exception e) {
			logger.info("TeamFreshDao의 insertPenalty()의 SQL EXCEPTION : " + e.getMessage());
		}
		return resultMessage;
	}

	public String updatePenaltyFlag(PenaltyDto penaltyDto) {
		logger.info("TeamFreshDao의 updatePenaltyFlag() 시작...");
		String resultMessage = null;
		try {
			int updatePResult = session.update("updatePenaltyFlag", penaltyDto);
			if (updatePResult == 1) {
				resultMessage = "페널티 확인 여부 등록이 정상적으로 업데이트 되었습니다.";
			} else {
				resultMessage = "페널티 업데이트 오류 발생";
			}
		} catch (Exception e) {
			logger.info("TeamFreshDao의 updatePenaltyFlag()의 SQL EXCEPTION : " + e.getMessage());
		}
		return resultMessage;
	}

	public String insertCompensation(CompensationDto compensationDto) {
		logger.info("TeamFreshDao의 insertCompensation() 시작...");
		String resultMessage = null;
		try {
			int insertCPSResult = session.insert("insertCompensation", compensationDto);
			if (insertCPSResult == 1) {
				resultMessage = "배상정보가 정상적으로 등록 되었습니다.";
			} else {
				resultMessage = "배상정보 등록 오류 발생";
			}
		} catch (Exception e) {
			logger.info("TeamFreshDao의 insertCompensation()의 SQL EXCEPTION : " + e.getMessage());
		}
		return resultMessage;
	}
}
