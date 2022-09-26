package com.oracle.TeamFresh.model;

import lombok.Data;

@Data
public class CompensationDto {

	private String voc_no; // voc코드
	private String compensation_price; // 배상금액
	private String creation_user_id; // 등록자
	private String creation_date; // 등록일시
}
