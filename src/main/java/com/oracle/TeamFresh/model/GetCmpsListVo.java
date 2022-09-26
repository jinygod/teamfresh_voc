package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class GetCmpsListVo {

	// URL getCompensationList의 parameter용 VO
	private String startDt; // 조회기간 시작일자
	private String endDt; // 조회기간 종료일자
	private String lgsName; // 운송사 명
	private String dlvName; // 배송기사 명
	private String startMoney; // 조회구간 최소금액
	private String endMoney; // 조회구간 최대금액
}
