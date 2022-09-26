package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class GetVocListVo {
	
	//URL getVocList의 parameter용 VO
	private String startDt; //조회기간 시작일자
	private String endDt; //조회기간 종료일자
	private String clntName; //고객사 명
	private String lgsName; //운송사 명
	private String dlvName; //배송기사 명
}
